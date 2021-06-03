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

public class AlbaHeavencrolling {
	public static String area = ""; // 지역 코드
	public static String gender = ""; //성별 코드
	public static String period = "";//근무 기간 코드
	public static String dutyweek = "";//근무 요일 코드
	public static String age = "";//나이 코드
	public AlbaHeavencrolling() {
		
	}
	public Vector<Albatext> crolling() {//알바천국		
		Vector<Albatext> albaheaven = new Vector<>();
		String url;
		int page = 1;
		Document doc = null;
		while (page != 4) { // 3페이지까지 출력
			url = "http://www.alba.co.kr/job/main.asp?hidSortCnt=30&page="+page+"&strAreaMulti="+area+"&hidSort=FREEORDER&gendercd="+gender
					+"&workperiodcd="+period+"&workweekcd="+dutyweek+"&agelimit="+age;
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();	
			}
			Elements element = doc.select("div.goodsList");
			Iterator<Element> ie1 = element.select("td.local").iterator();// 지역
			Iterator<Element> ie2 = element.select("span.number").iterator();// 급여
			Iterator<Element> ie3 = element.select("span.company").iterator();// 회사명
			Iterator<Element> ie4 = element.select("span.title").iterator();// 내용
			Iterator<Element> ie5 = element.select("td.regDate").iterator();// 등록일
			
			Iterator<Element> ie6 = element.select("td.title").iterator();// url 뽑기	
			
			while (ie1.hasNext()) {	
				String[] temp=ie6.next().html().split("\"");
				String temp2= "http://www.alba.co.kr/"+temp[1];
				try {
					albaheaven.add(new Albatext(ie1.next().text(), ie2.next().text()+"원", ie3.next().text(),
							ie4.next().text(), ie5.next().text(),temp2));
				} catch (NoSuchElementException e) {
				}
			}
			page++;
		}
		return albaheaven;
	}
	public static void explore(Object temp2) throws URISyntaxException {
		try {
			Desktop.getDesktop().browse(new URI((String) temp2));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}