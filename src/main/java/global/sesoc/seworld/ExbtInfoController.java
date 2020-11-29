package global.sesoc.seworld;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.seworld.dao.ExbtInfoRepository;
import global.sesoc.seworld.dto.ExbtInfo;
import global.sesoc.seworld.util.XmlParser;

@Controller
public class ExbtInfoController {
	private static final Logger logger = LoggerFactory.getLogger(ExbtInfoController.class);

	@Autowired
	ExbtInfoRepository exbtInfoRepository;

	// 초 분 시
	@Scheduled(cron = "0 00 02 * * *")
	@RequestMapping(value = "/insertExbtInfo", method = RequestMethod.GET)
	public String insertExbtInfo() throws Exception {
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		String date = dateFormat.format(today);
		String time = timeFormat.format(today);

		logger.info("*scheduler*");
		logger.info(date + " " + time);

		XmlParser xmlParser = new XmlParser();
		List<ExbtInfo> exbtInfoList = xmlParser.parse();
		logger.info(exbtInfoRepository.insertExbtInfo(exbtInfoList) + "　exhibitions inserted.");

		today = new Date();
		date = dateFormat.format(today);
		time = timeFormat.format(today);
		logger.info(date + " " + time);
		return "redirect:/";
	}
}
