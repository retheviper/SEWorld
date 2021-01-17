package global.sesoc.seworld.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import global.sesoc.seworld.domain.dto.ExbtInfo;

public class XmlParser {

	private final List<ExbtInfo> exbtInfoList = new ArrayList<>();

	private static final int TOTAL_PAGE_COUNT = 225;

	private static final String ADDRESS = "http://www.gep.or.kr/rest/overseasExhibition?serviceKey=";

	private static final String SERVICE_KEY = "FsLyT%2F7neLBzi2BSryIlrXTpjg68D44fUqCcl2PO%2B3R%2B8%2FCnikXdveIici4eMl7YiBOm5Is1JnEWJteh9ux0BA%3D%3D";
	
	public List<ExbtInfo> parseExhibitionInfos() {
		for (int pageNo = 1; pageNo <= 1; pageNo++) {
			final String parameter = "&from=20190101&to=20190831&numOfRows=10&pageNo=" + pageNo +"&type=xml";

			final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(ADDRESS + SERVICE_KEY + parameter).openConnection().getInputStream(), StandardCharsets.UTF_8));) {

				String result = "";
				String line;
				while ((line = br.readLine()) != null) {
					result = result + line.strip();
				}
				
				final InputSource is = new InputSource(new StringReader(result));
				final DocumentBuilder builder = factory.newDocumentBuilder();
				final Document doc = builder.parse(is);
				final XPathFactory xpathFactory = XPathFactory.newInstance();
				final XPath xpath = xpathFactory.newXPath();
				final XPathExpression expr = xpath.compile("//data/list");
				final NodeList nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

				for (int i = 0; i < nodeList.getLength(); i++) {
					final NodeList child = nodeList.item(i).getChildNodes();
					exbtInfoList.add(new ExbtInfo(
							child.item(0).getTextContent(),
							child.item(1).getTextContent(),
							child.item(2).getTextContent(),
							child.item(3).getTextContent(),
							child.item(4).getTextContent(),
							child.item(5).getTextContent(),
							child.item(6).getTextContent(),
							child.item(7).getTextContent(),
							child.item(8).getTextContent(),
							child.item(9).getTextContent(),
							child.item(10).getTextContent(),
							child.item(11).getTextContent(),
							child.item(12).getTextContent(),
							child.item(13).getTextContent(),
							child.item(14).getTextContent(),
							child.item(15).getTextContent(),
							child.item(16).getTextContent(),
							child.item(17).getTextContent(),
							child.item(18).getTextContent(),
							child.item(19).getTextContent(),
							child.item(20).getTextContent(),
							child.item(21).getTextContent(),
							child.item(22).getTextContent(),
							child.item(23).getTextContent(),
							child.item(24).getTextContent(),
							child.item(25).getTextContent(),
							child.item(26).getTextContent(),
							child.item(27).getTextContent(),
							child.item(28).getTextContent(),
							child.item(29).getTextContent(),
							child.item(30).getTextContent(),
							child.item(31).getTextContent()
					));
				} // ends for
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return exbtInfoList;
	}
}
