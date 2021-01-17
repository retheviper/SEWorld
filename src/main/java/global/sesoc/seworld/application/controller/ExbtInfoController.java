package global.sesoc.seworld.application.controller;

import global.sesoc.seworld.domain.dao.ExbtInfoRepository;
import global.sesoc.seworld.domain.dto.ExbtInfo;
import global.sesoc.seworld.util.RedirectUtil;
import global.sesoc.seworld.util.XmlParser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ExbtInfoController {

    private final ExbtInfoRepository exbtInfoRepository;

    private final XmlParser xmlParser = new XmlParser();

    // 초 분 시
    @Scheduled(cron = "0 00 02 * * *")
    @RequestMapping(value = "/insertExbtInfo", method = RequestMethod.GET)
    public String insertExbtInfo() throws Exception {
        log.info("*scheduler*");
        log.info(LocalDateTime.now().toString());
        final List<ExbtInfo> exbtInfoList = xmlParser.parseExhibitionInfos();
        log.info(this.exbtInfoRepository.insertExbtInfo(exbtInfoList) + "　exhibitions inserted.");
        return RedirectUtil.redirectToHome();
    }
}
