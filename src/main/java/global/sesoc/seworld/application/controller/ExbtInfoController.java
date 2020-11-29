package global.sesoc.seworld.application.controller;

import global.sesoc.seworld.dao.ExbtInfoRepository;
import global.sesoc.seworld.dto.ExbtInfo;
import global.sesoc.seworld.util.XmlParser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ExbtInfoController {

    private final ExbtInfoRepository exbtInfoRepository;

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("hh:mm:ss");

    // 초 분 시
    @Scheduled(cron = "0 00 02 * * *")
    @RequestMapping(value = "/insertExbtInfo", method = RequestMethod.GET)
    public String insertExbtInfo() throws Exception {
        final String date = DATE_FORMATTER.format(LocalDate.now());
        final String time = TIME_FORMATTER.format(LocalTime.now());
        log.info("*scheduler*");
        log.info(date + " " + time);
        XmlParser xmlParser = new XmlParser();
        final List<ExbtInfo> exbtInfoList = xmlParser.parse();
        log.info(this.exbtInfoRepository.insertExbtInfo(exbtInfoList) + "　exhibitions inserted.");
        return "redirect:/";
    }
}
