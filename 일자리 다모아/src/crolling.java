
	import java.io.IOException;
	import java.util.Iterator;
	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document;
	import org.jsoup.nodes.Element;
	import org.jsoup.select.Elements;
public class crolling {
	    public crolling() {
	        String url;
	        int page=1;
	        Document doc = null;
	        while(page!=4) { //3���������� ���
	        	 url = "https://www.albamon.com/list/gi/mon_gi_tot_list.asp?page="+page+"&ps=20&ob=6&lvtype=1&rArea=,"+"G000"+"&rWDate=1&Empmnt_Type=";
	        try {
	            doc=Jsoup.connect(url).get();
	        }catch(IOException e) {
	            e.printStackTrace();
	        }
	        Elements element = doc.select("div.gListWrap");
	        
	        Iterator<Element> ie1 = element.select("td.area").iterator();//����
	        Iterator<Element> ie2 = element.select("p.won").iterator();//�޿�
	        Iterator<Element> ie3 = element.select("p.cName").iterator();//ȸ���
	        Iterator<Element> ie4 = element.select("p.cTit").iterator();//�Ѹ���
	        Iterator<Element> ie5 = element.select("td.recently").iterator();//�ö�� �ð�
	        
	        while(ie1.hasNext()) {   
	            Mainpage.array.addElement(ie1.next().text().substring(3)+"  "+ie2.next().text()+"\t"+ie3.next().text()+"\t"+ie4.next().text()+"\t"+ie5.next().text());
	        }
	        page++;
	        }
	    }
	}
