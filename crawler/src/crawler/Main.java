package crawler;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String url = "https://www.albamon.com/list/gi/mon_gi_tot_list.asp?page=";
		Scanner scan = new Scanner(System.in);
		String pageadd = "1";
		

		while(pageadd!="end"){
			Crawler.crawling(url+pageadd);
			System.out.println("======" + pageadd + " of page=====\n");
			System.out.println("�������� �Է����ּ���(end�� ����)");
			pageadd=scan.nextLine();
			
		}
		
		System.out.println("ũ�Ѹ��� ����Ǿ����ϴ�");
	}
}

class Crawler{
	public static void crawling(String url) {
		Document doc = null;
		
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		Elements element = doc.select("div.gListWrap");
		
		Iterator<Element> nation = element.select("td.area").iterator();//����
		Iterator<Element> pay = element.select("p.won").iterator();//�޿�
		Iterator<Element> coop = element.select("p.cName").iterator();//ȸ���
		Iterator<Element> commt = element.select("p.cTit").iterator();//�Ѹ���
		Iterator<Element> ago = element.select("td.recently").iterator();//�ö�� �ð�
	
		crawlprint(nation, pay, coop, commt, ago);

	}
	
	public static void crawlprint(Iterator<Element> i1, Iterator<Element> i2, Iterator<Element> i3, Iterator<Element> i4, Iterator<Element> i5) {
		while(i1.hasNext()) {
			while(i1.hasNext()) {   
				System.out.println(i1.next().text().substring(4)+"\t\t"+i2.next().text()+"\t\t"+i3.next().text()+"\t\t"+i4.next().text()+"\t\t"+i5.next().text());            
			}
		}
	}
}