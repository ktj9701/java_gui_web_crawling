package Function;
// 웹 크롤링 구현

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import GUI.Albatext;

public class crolling {
	public static String area = "";
	public static ArrayList<String> URL = new ArrayList<String>();

	public Vector<Albatext> crolling() {
		int i = 0;
		Vector<Albatext> arr = new Vector<>();

		String url;
		int page = 1;
		Document doc = null;
		while (page != 4) { // 3페이지까지 출력
			url = "https://www.albamon.com/list/gi/mon_gi_tot_list.asp?page=" + page + "&ps=20&ob=6&lvtype=1&rArea="
					+ area + "&rWDate=1&Empmnt_Type=&ob=0";
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Elements element = doc.select("div.gListWrap");

			Iterator<Element> ie1 = element.select("td.area").iterator();// 지역
			Iterator<Element> ie2 = element.select("p.won").iterator();// 급여
			Iterator<Element> ie3 = element.select("p.cName").iterator();// 회사명
			Iterator<Element> ie4 = element.select("p.cTit").iterator();// 한마디
			Iterator<Element> ie5 = element.select("td.recently").iterator();// 올라온 시간

			Iterator<Element> ie6 = element.select("p.cName").iterator();// 회사명
			Iterator<Element> ie7 = element.select("p.cName").iterator();// 회사명
			Iterator<Element> ie8 = element.select("p.cName").iterator();// 회사명
			while (ie1.hasNext()) {
				try {
					arr.add(new Albatext(ie1.next().text().substring(3), ie2.next().text(), ie3.next().text(),
							ie4.next().text(), ie5.next().text()));
					URL.add(ie6.next().html().substring(9,
							ie7.next().html().length() - ie8.next().text().length() - 6));

				} catch (NoSuchElementException e) {
				}
			}
			page++;
		}
		return arr;
	}

	public static void explore(Object temp2) throws URISyntaxException {

		try {
			Desktop.getDesktop().browse(new URI((String) temp2));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
