package global.sesoc.seworld;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import global.sesoc.seworld.dao.CommentRepository;
import global.sesoc.seworld.dao.ExbtWLCCountRepository;
import global.sesoc.seworld.dao.ExhibitionRepository;
import global.sesoc.seworld.dto.Comment;
import global.sesoc.seworld.dto.Counting;
import global.sesoc.seworld.dto.ExbtWLCCount;
import global.sesoc.seworld.dto.Exhibition;
import global.sesoc.seworld.dto.TableWrapperDTO;

@Controller
public class ExhibitionController {

	/*
	 * SE World Exhibition Controller
	 * 
	 * API를 통해 수집한 전시정보를 제공하는 컨트롤러
	 * 
	 * @author youngbinkim
	 * 
	 * @version 0.1
	 */

	@Autowired
	CommentRepository commentRepository;

	@Autowired
	ExhibitionRepository exhibitionRepository;

	@Autowired
	ExbtWLCCountRepository exbtWLCCountRepository;

	// 전시회 목록 페이지로 이동
	@RequestMapping(value = "/exhibitionList", method = RequestMethod.GET)
	public String exhibitionList() {
		return "exhibition/exhibitionList";
	}

	// DataTable 데이터 전송 메소드
	@RequestMapping(value = "/exhibitionListAjax", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String exhibitionListAjax(int start, int length, @RequestParam(value = "search[value]") String searchText) {
		int totalCount = exhibitionRepository.getTotalList(searchText);
		List<Exhibition> exhibitions = exhibitionRepository.showExhibitionList(start, length, searchText);
		TableWrapperDTO wrapper = new TableWrapperDTO();
		wrapper.setAaData(exhibitions);
		wrapper.setiTotalRecords(totalCount);
		wrapper.setiTotalDisplayRecords(totalCount);
		Gson ojb = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		return ojb.toJson(wrapper);
	}

	// 상세 전시회 보기 페이지
	@RequestMapping(value = "/exhibitionDetail", method = RequestMethod.GET)
	public String exhibitionDetail(String exhibitionId, Model model) {
		Exhibition exhibition = exhibitionRepository.showExhibitionDetail(exhibitionId);
		ExbtWLCCount exbtWLCCount = exbtWLCCountRepository.viewCount(exhibitionId);
		List<Comment> commentList = commentRepository.selectAllCommentsFromExhibition(exhibitionId);
		model.addAttribute("exhibition", exhibition);
		model.addAttribute("exbtWLCCount", exbtWLCCount);
		model.addAttribute("commentList", commentList);
		return "exhibition/exhibitionDetail";
	}

	/** 지도에 전시회 몇개인지 표시하기 **/
	@RequestMapping(value = "countcountry", method = RequestMethod.POST)
	public @ResponseBody Integer countcountry(@RequestBody String openingCountry) throws Exception {
		// System.out.println(openingCountry + "오프팅컨트리");
		int result = exhibitionRepository.countCountry(openingCountry);
		// System.out.println(result + "몇개");
		return result;
	}

	/** 지도에 전체 수 표시 **/
	@RequestMapping(value = "countAllEx", method = RequestMethod.POST)
	public @ResponseBody List<Counting> countAllExhibition() throws Exception {
		List<Counting> result = exhibitionRepository.countAllExhibition();
		return result;
	}

	// 벡터 지도로 이동
	@RequestMapping(value = "/jvectorMap", method = RequestMethod.GET)
	public String vectorMap() {
		return "exhibition/jvectorMap";
	}

	@RequestMapping(value = "/bestList", method = RequestMethod.GET)
	public String bestList() {
		return "exhibition/bestExhibition";
	}
}
