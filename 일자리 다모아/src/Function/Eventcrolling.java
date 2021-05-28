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

import GUI.Loginpage;

public class Eventcrolling {
	public Vector<Eventtext> crolling() {
		Vector<Eventtext> alba_event = new Vector<>();
		String url;

		int i = 0;
		Document doc = null;

		url = "http://www.alba.co.kr/story/event/EventList.asp";

		try { // 알바천국 설문조사
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements element = doc.select("div.surveyIng");
		Iterator<Element> ie1 = element.select("p.title").iterator();// 제목
		Iterator<Element> ie2 = element.select("p.content").iterator();// 내용
		Iterator<Element> ie3 = element.select("dd.term").iterator();// 기간
		Iterator<Element> ie5 = element.select("p.title").iterator();// url

		while (ie1.hasNext()) {
			String temp[] = ie5.next().html().split("\"");
			alba_event.add(new Eventtext(ie1.next().text(), ie2.next().text(), ie3.next().text(), "설문조사", temp[1]));
		}

		try { // 알바천국 이벤트
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		element = doc.select("div.eventIng");
		ie1 = element.select("p.title").iterator();// 제목
		ie2 = element.select("p.content").iterator();// 내용
		ie3 = element.select("dd.term").iterator();// 기간
		ie5 = element.select("p.title").iterator();// url

		while (ie1.hasNext()) {
			String temp[] = ie5.next().html().split("\"");
			alba_event.add(new Eventtext(ie1.next().text(), ie2.next().text(), ie3.next().text(), "이벤트", temp[1]));
		}

		url = "http://www.albamon.com/community/Event/Event_list";
		try { // 알바몬 이벤트
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		element = doc.select("div.eventList");
		ie1 = element.select("span.txt").iterator();// 제목
		ie2 = element.select("span.txt").iterator();// 내용
		ie3 = element.select("span.date").iterator();// 기간
		ie5 = element.iterator();// url
		String temp[] = ie5.next().html().split("</li>");
		while (ie1.hasNext()) {
			String temp2[] = temp[i++].split("'");
			alba_event.add(new Eventtext(ie1.next().text(), ie2.next().text(), ie3.next().text(), "이벤트", temp2[5]));
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
