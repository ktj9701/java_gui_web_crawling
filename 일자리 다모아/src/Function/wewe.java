package Function;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class wewe {
	public static String area = "";

	public Vector<Albatext> crolling() {//�˹�õ��
		
		Vector<Albatext> albaheaven = new Vector<>();
		String url;
		int page = 1;

		Document doc = null;
		
		while (page != 4) { // 3���������� ���
			url = "http://www.alba.co.kr/job/main.asp?hidSortCnt=30&page=1&strAreaMulti="+area+"&hidSort=FREEORDER&";
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();	
			}
			Elements element = doc.select("div.goodsList");
			Iterator<Element> ie1 = element.select("td.local").iterator();// ����
			Iterator<Element> ie2 = element.select("span.number").iterator();// �޿�
			Iterator<Element> ie3 = element.select("span.company").iterator();// ȸ���
			Iterator<Element> ie4 = element.select("span.title").iterator();// ����
			Iterator<Element> ie5 = element.select("td.regDate").iterator();// �����
			
			Iterator<Element> ie6 = element.select("td.title").iterator();// url �̱�	
			
			while (ie1.hasNext()) {	
				String[] temp=ie6.next().html().split("\"");
				String temp2= "http://www.alba.co.kr/"+temp[1];
				try {
					albaheaven.add(new Albatext(ie1.next().text(), ie2.next().text()+"��", ie3.next().text(),
							ie4.next().text(), ie5.next().text(),temp2));
				} catch (NoSuchElementException e) {
				}
			}
			page++;
		}
		return albaheaven;
	}
}