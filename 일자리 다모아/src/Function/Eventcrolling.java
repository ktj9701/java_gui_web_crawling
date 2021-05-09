package Function;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Eventcrolling {
	public  Vector<Eventtext> crolling() {
		Iterator<Element> ie1 = null;
		Vector<Eventtext> alba_event = new Vector<>();
		String url;

		Document doc = null;

			url = "http://www.alba.co.kr/story/event/EventList.asp";
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Elements element = doc.select("ul.list");
			ie1 = element.select("p.title").iterator();// 제목
			Iterator<Element> ie2 = element.select("p.content").iterator();// 내용
			Iterator<Element> ie3 = element.select("dd.term").iterator();// 기간
			Iterator<Element> ie4 = element.select("dd.announce").iterator();// 당첨자발표기간
			Iterator<Element> ie5 = element.select("p.title").iterator();// url

			
			while (ie1.hasNext()) {
				String temp[] = ie5.next().html().split("\"");
					alba_event.add(new Eventtext(ie1.next().text(), ie2.next().text(), ie3.next().text(),
							ie4.next().text(),temp[1]));		
			}
		return alba_event;
	}
	public static void explore(Object temp2) throws URISyntaxException {
		try {
			Desktop.getDesktop().browse(new URI((String) temp2));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
