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
	public static String area = ""; // ���� �ڵ�
	public static String gender = ""; //���� �ڵ�
	public static String period = "";//�ٹ� �Ⱓ �ڵ�
	public static String dutyweek = "";//�ٹ� ���� �ڵ�
	public static String age = "";//���� �ڵ�
	public AlbaHeavencrolling() {
		
	}
	public Vector<Albatext> crolling() {//�˹�õ��		
		Vector<Albatext> albaheaven = new Vector<>();
		String url;
		int page = 1;
		Document doc = null;
		while (page != 4) { // 3���������� ���
			url = "http://www.alba.co.kr/job/main.asp?hidSortCnt=30&page="+page+"&strAreaMulti="+area+"&hidSort=FREEORDER&gendercd="+gender
					+"&workperiodcd="+period+"&workweekcd="+dutyweek+"&agelimit="+age;
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
	public static void explore(Object temp2) throws URISyntaxException {
		try {
			Desktop.getDesktop().browse(new URI((String) temp2));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}