package global.sesoc.seworld.application.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import global.sesoc.seworld.dao.CommentRepository;
import global.sesoc.seworld.dao.ExbtWLCCountRepository;
import global.sesoc.seworld.dao.ExhibitionRepository;
import global.sesoc.seworld.dto.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SE World Exhibition Controller
 * <p>
 * API를 통해 수집한 전시정보를 제공하는 컨트롤러
 *
 * @author youngbinkim
 * @version 0.1
 */
@Slf4j
@Controller
@RequiredArgsConstructor
public class ExhibitionController {

    private final ObjectMapper mapper;

    private final CommentRepository commentRepository;

    private final ExhibitionRepository exhibitionRepository;

    private final ExbtWLCCountRepository exbtWLCCountRepository;

    // 전시회 목록 페이지로 이동
    @GetMapping(value = "/exhibitionList")
    public String exhibitionList() {
        return "exhibition/exhibitionList";
    }

    // DataTable 데이터 전송 메소드
    @PostMapping(value = "/exhibitionListAjax", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String exhibitionListAjax(final int start, final int length, @RequestParam(value = "search[value]") final String searchText) {
        int totalCount = exhibitionRepository.getTotalList(searchText);
        final List<Exhibition> exhibitions = exhibitionRepository.showExhibitionList(start, length, searchText);
        final TableWrapper wrapper = new TableWrapper(exhibitions, totalCount, totalCount);
        try {
            return mapper.writeValueAsString(wrapper);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    // 상세 전시회 보기 페이지
    @GetMapping(value = "/exhibitionDetail")
    public String exhibitionDetail(String exhibitionId, Model model) {
        Exhibition exhibition = exhibitionRepository.showExhibitionDetail(exhibitionId);
        ExbtWLCCount exbtWLCCount = exbtWLCCountRepository.viewCount(exhibitionId);
        List<Comment> commentList = commentRepository.selectAllCommentsFromExhibition(exhibitionId);
        model.addAttribute("exhibition", exhibition);
        model.addAttribute("exbtWLCCount", exbtWLCCount);
        model.addAttribute("commentList", commentList);
        return "exhibition/exhibitionDetail";
    }

    /**
     * 지도에 전시회 몇개인지 표시하기
     **/
    @PostMapping(value = "countcountry")
    public @ResponseBody
    Integer countcountry(@RequestBody String openingCountry) throws Exception {
        return this.exhibitionRepository.countCountry(openingCountry);
    }

    /**
     * 지도에 전체 수 표시
     **/
    @PostMapping(value = "countAllEx")
    public @ResponseBody
    List<Counting> countAllExhibition() throws Exception {
        return this.exhibitionRepository.countAllExhibition();
    }

    // 벡터 지도로 이동
    @GetMapping(value = "/jvectorMap")
    public String vectorMap() {
        return "exhibition/jvectorMap";
    }

    @GetMapping(value = "/bestList")
    public String bestList() {
        return "exhibition/bestExhibition";
    }
}
