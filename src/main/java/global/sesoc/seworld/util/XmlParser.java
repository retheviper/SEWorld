package global.sesoc.seworld.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import global.sesoc.seworld.dto.ExbtInfo;

public class XmlParser {
	private List<ExbtInfo> exbtInfoList = new ArrayList<ExbtInfo>();
	private final int TOTAL_PAGE_COUNT = 225;
	
	public List<ExbtInfo> parse() {
		for (int pageNo = 1; pageNo <= 1; pageNo++) {
			String addr = "http://www.gep.or.kr/rest/overseasExhibition?serviceKey=";
			String serviceKey = "FsLyT%2F7neLBzi2BSryIlrXTpjg68D44fUqCcl2PO%2B3R%2B8%2FCnikXdveIici4eMl7YiBOm5Is1JnEWJteh9ux0BA%3D%3D";
			String parameter = "";
			parameter = parameter + "&" + "from=20190101";
			parameter = parameter + "&" + "to=20190831";
			parameter = parameter + "&" + "numOfRows=10";
			parameter = parameter + "&" + "pageNo=" + pageNo;
			parameter = parameter + "&" + "type=xml";
			addr = addr + serviceKey + parameter;

			BufferedReader br = null;
			DocumentBuilder builder = null;
			Document doc = null;
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			
			try {
				URL url = new URL(addr);
				HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
				br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
				String result = "";
				String line;
				while ((line = br.readLine()) != null) {
					result = result + line.strip();
				}
				
				InputSource is = new InputSource(new StringReader(result));
				builder = factory.newDocumentBuilder();
				doc = builder.parse(is);
				XPathFactory xpathFactory = XPathFactory.newInstance();
				XPath xpath = xpathFactory.newXPath();
				XPathExpression expr = xpath.compile("//data/list");
				NodeList nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
				
				for (int i = 0; i < nodeList.getLength(); i++) {
					NodeList child = nodeList.item(i).getChildNodes();
					ExbtInfo exbt = new ExbtInfo(
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
					);
					exbtInfoList.add(exbt);
				} // ends for
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null) br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // ends try-catch
		}
		return exbtInfoList;
	}
}
