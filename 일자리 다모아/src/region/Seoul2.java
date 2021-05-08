package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Seoul2 {
	public boolean flag;

	public void Seoul2City(ActionEvent e) {
		if (Mainpage.index == 0) {
			Albamoncrolling.area = "";
			AlbaHeavencrolling.area = "";
		}
		flag = false;
		JComboBox cb = (JComboBox) e.getSource();
		for (int i = 0; i < 5; i++) {
			if (Mainpage.Filtering[i].getText().equals(cb.getSelectedItem()))
				flag = true;
		}
		if (flag == true)
			return;

		switch ((String) cb.getSelectedItem()) {
		case "가락동":
			Albamoncrolling.area += ",I1800030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락1동":
			Albamoncrolling.area += ",I1800010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락2동":
			Albamoncrolling.area += ",I1800020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락본동":
			Albamoncrolling.area += "I1800040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여동":
			Albamoncrolling.area += ",I1800070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거여동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여1동":
			Albamoncrolling.area += ",I1800050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거여1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여2동":
			Albamoncrolling.area += ",I1800060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거여2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천동":
			Albamoncrolling.area += "I1800100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천1동":
			Albamoncrolling.area += ",I1800080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천2동":
			Albamoncrolling.area += ",I1800090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정동":
			Albamoncrolling.area += ",I1800130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정1동":
			Albamoncrolling.area += ",I1800110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정2동":
			Albamoncrolling.area += "I1800120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이동":
			Albamoncrolling.area += ",I1800160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이1동":
			Albamoncrolling.area += ",I1800140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방이1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이2동":
			Albamoncrolling.area += ",I1800150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방이2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼전동":
			Albamoncrolling.area += "I1800170";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BB%EF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석촌동":
			Albamoncrolling.area += ",I1800180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%AE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파동":
			Albamoncrolling.area += ",I1800210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파1동":
			Albamoncrolling.area += ",I1800190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송파1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파2동":
			Albamoncrolling.area += ",I1800200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송파2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			Albamoncrolling.area += ",I1800220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			Albamoncrolling.area += ",I1800230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오륜동":
			Albamoncrolling.area += ",I1800240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			Albamoncrolling.area += ",I1800380";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실동":
			Albamoncrolling.area += ",I1800320";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실2동":
			Albamoncrolling.area += ",I1800260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실3동":
			Albamoncrolling.area += ",I1800270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실4동":
			Albamoncrolling.area += ",I1800280";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실6동":
			Albamoncrolling.area += ",I1800300";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실7동":
			Albamoncrolling.area += ",I1800310";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실본동":
			Albamoncrolling.area += ",I1800330";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			Albamoncrolling.area += ",I1800340";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납동":
			Albamoncrolling.area += ",I1800370";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍납동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납1동":
			Albamoncrolling.area += ",I1800350";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍납1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납2동":
			Albamoncrolling.area += ",I1800360";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍납2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			Albamoncrolling.area += ",I1900070";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목1동":
			Albamoncrolling.area += ",I1900010";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목2동":
			Albamoncrolling.area += ",I1900020";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목3동":
			Albamoncrolling.area += ",I1900030";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목4동":
			Albamoncrolling.area += ",I1900040";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목5동":
			Albamoncrolling.area += ",I1900050";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F15%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			Albamoncrolling.area += ",I1900150";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월1동":
			Albamoncrolling.area += ",I1900080";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월2동":
			Albamoncrolling.area += ",I1900090";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월3동":
			Albamoncrolling.area += ",I1900100";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월4동":
			Albamoncrolling.area += ",I1900110";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월5동":
			Albamoncrolling.area += ",I1900120";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F95%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월6동":
			Albamoncrolling.area += ",I1900130";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F96%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월7동":
			Albamoncrolling.area += ",I1900140";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F97%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양천구신정동":
			Albamoncrolling.area += ",I1900230";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양천구신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정1동":
			Albamoncrolling.area += ",I1900160";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정2동":
			Albamoncrolling.area += ",I1900170";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정3동":
			Albamoncrolling.area += ",I1900180";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정4동":
			Albamoncrolling.area += ",I1900190";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정6동":
			Albamoncrolling.area += ",I1900210";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A46%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정7동":
			Albamoncrolling.area += ",I1900220";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A47%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동":
			Albamoncrolling.area += ",I2000010";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동1가":
			Albamoncrolling.area += ",I2000020";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동2가":
			Albamoncrolling.area += ",I2000030";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동3가":
			Albamoncrolling.area += ",I2000040";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동4가":
			Albamoncrolling.area += ",I2000050";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동5가":
			Albamoncrolling.area += ",I2000060";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동6가":
			Albamoncrolling.area += ",I2000070";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림동":
			Albamoncrolling.area += ",I2000110";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림1동":
			Albamoncrolling.area += ",I2000080";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림2동":
			Albamoncrolling.area += ",I2000090";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림3동":
			Albamoncrolling.area += "I2000100";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도림동":
			Albamoncrolling.area += ",I2000140";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동":
			Albamoncrolling.area += ",I2000150";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동1가":
			Albamoncrolling.area += ",I2000160";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동2가":
			Albamoncrolling.area += ",I2000170";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동3가":
			Albamoncrolling.area += ",I2000180";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동4가":
			Albamoncrolling.area += ",I2000190";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동5가":
			Albamoncrolling.area += ",I2000200";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동6가":
			Albamoncrolling.area += ",I2000210";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길동":
			Albamoncrolling.area += ",I2000290";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길1동":
			Albamoncrolling.area += ",I2000220";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길3동":
			Albamoncrolling.area += ",I2000240";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길4동":
			Albamoncrolling.area += ",I2000250";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길5동":
			Albamoncrolling.area += ",I2000260";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길6동":
			Albamoncrolling.area += ",I2000270";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E66%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길7동":
			Albamoncrolling.area += ",I2000280";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E67%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동":
			Albamoncrolling.area += ",I2000300";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동1가":
			Albamoncrolling.area += ",I2000310";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동2가":
			Albamoncrolling.area += ",I2000320";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동3가":
			Albamoncrolling.area += ",I2000330";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동4가":
			Albamoncrolling.area += ",I2000340";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동5가":
			Albamoncrolling.area += ",I2000350";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동6가":
			Albamoncrolling.area += ",I2000360";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양화동":
			Albamoncrolling.area += ",I2000370";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여의도동":
			Albamoncrolling.area += ",I2000380";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%A9%C0%C7%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여의도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동":
			Albamoncrolling.area += ",I2000390";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영등포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동1가":
			Albamoncrolling.area += ",I2000400";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동2가":
			Albamoncrolling.area += ",I2000410";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동3가":
			Albamoncrolling.area += ",I2000420";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포4가":
			Albamoncrolling.area += ",I2000430";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동5가":
			Albamoncrolling.area += ",I2000440";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동6가":
			Albamoncrolling.area += ",I2000450";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동7가":
			Albamoncrolling.area += ",I2000460";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동8가":
			Albamoncrolling.area += ",I2000470";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF8%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동8가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포본동":
			Albamoncrolling.area += ",I2000230";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영등포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈월동":
			Albamoncrolling.area += ",I2100010";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B0%A5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남영동":
			Albamoncrolling.area += ",I2100020";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B3%B2%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도원동":
			Albamoncrolling.area += ",I2100030";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동빙고동":
			Albamoncrolling.area += ",I2100040";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동빙고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동자동":
			Albamoncrolling.area += ",I2100050";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문배동":
			Albamoncrolling.area += ",I2100060";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B9%AE%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동":
			Albamoncrolling.area += ",I2100070";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BA%B8%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산천동":
			Albamoncrolling.area += "I2100080";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BB%EA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서계동":
			Albamoncrolling.area += ",I2100090";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서빙고동":
			Albamoncrolling.area += ",I2100100";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서빙고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신계동":
			Albamoncrolling.area += ",I2100110";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			Albamoncrolling.area += ",I2100120";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문동":
			Albamoncrolling.area += ",I2100130";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동1가":
			Albamoncrolling.area += ",I2100140";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동2가":
			Albamoncrolling.area += ",I2100150";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동3가":
			Albamoncrolling.area += ",I2100160";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동4가":
			Albamoncrolling.area += ",I2100170";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동5가":
			Albamoncrolling.area += ",I2100180";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동6가":
			Albamoncrolling.area += ",I2100190";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로1가":
			Albamoncrolling.area += ",I2100200";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로2가":
			Albamoncrolling.area += ",I2100210";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로3가":
			Albamoncrolling.area += ",I2100220";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로4가":
			Albamoncrolling.area += ",I2100230";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌동":
			Albamoncrolling.area += ",I2100260";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌1동":
			Albamoncrolling.area += ",I2100240";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌2동":
			Albamoncrolling.area += ",I2100250";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원동":
			Albamoncrolling.area += ",I2100290";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이태원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원1동":
			Albamoncrolling.area += ",I2100270";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이태원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원2동":
			Albamoncrolling.area += ",I2100280";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이태원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주성동":
			Albamoncrolling.area += ",I2100300";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청암동":
			Albamoncrolling.area += ",I2100310";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동1가":
			Albamoncrolling.area += ",I2100320";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("청파동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동2가":
			Albamoncrolling.area += ",I2100330";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("청파동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동3가":
			Albamoncrolling.area += ",I2100340";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("청파동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로1가":
			Albamoncrolling.area += ",I2100350";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("한강로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로2가":
			Albamoncrolling.area += ",I2100360";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("한강로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로3가":
			Albamoncrolling.area += ",I2100370";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("한강로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한남동":
			Albamoncrolling.area += ",I2100400";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("한남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효창동":
			Albamoncrolling.area += ",I2100410";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%BF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후암동":
			Albamoncrolling.area += ",I2100420";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%C4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("후암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			Albamoncrolling.area += ",I2200030";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현1동":
			Albamoncrolling.area += ",I2200010";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현2동":
			Albamoncrolling.area += ",I2200020";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			Albamoncrolling.area += ",I2200040";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹번동":
			Albamoncrolling.area += ",I2200060";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B3%EC%B9%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("녹번동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대조동":
			Albamoncrolling.area += ",I2200070";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B4%EB%C1%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대조동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광동":
			Albamoncrolling.area += ",I2200110";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광1동":
			Albamoncrolling.area += ",I2200080";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불광1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광2동":
			Albamoncrolling.area += ",I2200090";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불광2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수색동":
			Albamoncrolling.area += ",I2200120";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BC%F6%BB%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수색동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사동":
			Albamoncrolling.area += ",I2200150";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사1동":
			Albamoncrolling.area += ",I2200130";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사2동":
			Albamoncrolling.area += ",I2200140";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역촌동":
			Albamoncrolling.area += ",I2200180";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BF%AA%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암동":
			Albamoncrolling.area += ",I2200230";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암1동":
			Albamoncrolling.area += ",I2200190";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암2동":
			Albamoncrolling.area += ",I2200200";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암3동":
			Albamoncrolling.area += ",I2200210";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증산동":
			Albamoncrolling.area += ",I2200240";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("증산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진관동":
			Albamoncrolling.area += ",I2200250";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F8%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가회동":
			Albamoncrolling.area += ",I2300010";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%A1%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가회동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "견지동":
			Albamoncrolling.area += ",I2300020";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%DF%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("견지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경운동":
			Albamoncrolling.area += ",I2300030";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E6%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계동":
			Albamoncrolling.area += ",I2300040";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			Albamoncrolling.area += ",I2300050";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관수동":
			Albamoncrolling.area += ",I2300060";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관철동":
			Albamoncrolling.area += ",I2300070";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C3%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관철동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관훈동":
			Albamoncrolling.area += ",I2300080";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C8%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관훈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교남동":
			Albamoncrolling.area += ",I2300090";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교북동":
			Albamoncrolling.area += ",I2300100";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구기동":
			Albamoncrolling.area += ",I2300110";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁정동":
			Albamoncrolling.area += ",I2300120";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C3%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("궁정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권농동":
			Albamoncrolling.area += ",I2300130";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("권농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			Albamoncrolling.area += ",I2300140";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내수동":
			Albamoncrolling.area += ",I2300150";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내자동":
			Albamoncrolling.area += ",I2300160";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누상동":
			Albamoncrolling.area += ",I2300170";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("누상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누하동":
			Albamoncrolling.area += ",I2300180";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("누하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당주동":
			Albamoncrolling.area += ",I2300190";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%E7%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도렴동":
			Albamoncrolling.area += ",I2300200";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B5%B7%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도렴동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈의동":
			Albamoncrolling.area += ",I2300210";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B7%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("돈의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동숭동":
			Albamoncrolling.area += ",I2300220";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%BF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동숭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜1가":
			Albamoncrolling.area += ",I2300230";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜2가":
			Albamoncrolling.area += ",I2300240";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜3가":
			Albamoncrolling.area += ",I2300250";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜4가":
			Albamoncrolling.area += ",I2300260";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘동":
			Albamoncrolling.area += ",I2300270";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묘동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무악동":
			Albamoncrolling.area += ",I2300280";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%AB%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무악동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉익동":
			Albamoncrolling.area += ",I2300290";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%C0%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암동":
			Albamoncrolling.area += ",I2300300";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%CE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사간동":
			Albamoncrolling.area += ",I2300310";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%B0%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사간동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			Albamoncrolling.area += ",I2300320";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼청동":
			Albamoncrolling.area += ",I2300330";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%EF%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서린동":
			Albamoncrolling.area += ",I2300340";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%AD%B8%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서린동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세종로":
			Albamoncrolling.area += ",I2300350";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%BC%C1%BE%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("세종로");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소격동":
			Albamoncrolling.area += ",I2300360";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%D2%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소격동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동":
			Albamoncrolling.area += ",I2300370";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			Albamoncrolling.area += ",I2300380";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			Albamoncrolling.area += ",I2300390";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			Albamoncrolling.area += ",I2300420";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인1동":
			Albamoncrolling.area += ",I2300400";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인2동":
			Albamoncrolling.area += ",I2300410";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신교동":
			Albamoncrolling.area += ",I2300430";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문로1가":
			Albamoncrolling.area += ",I2300440";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문로2가":
			Albamoncrolling.area += ",I2300450";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신영동":
			Albamoncrolling.area += ",I2300460";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안국동":
			Albamoncrolling.area += "I2300470";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BE%C8%B1%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안국동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연건동":
			Albamoncrolling.area += ",I2300480";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			Albamoncrolling.area += ",I2300490";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예지동":
			Albamoncrolling.area += ",I2300500";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%B9%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥인동":
			Albamoncrolling.area += ",I2300510";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%C1%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡동":
			Albamoncrolling.area += ",I2300520";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("와룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운니동":
			Albamoncrolling.area += ",I2300530";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%EE%B4%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운니동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원남동":
			Albamoncrolling.area += ",I2300540";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원서동":
			Albamoncrolling.area += ",I2300550";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이화동":
			Albamoncrolling.area += ",I2300560";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CC%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익선동":
			Albamoncrolling.area += ",I2300570";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CD%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("익선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인사동":
			Albamoncrolling.area += ",I2300580";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인의동":
			Albamoncrolling.area += ",I2300590";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장사동":
			Albamoncrolling.area += ",I2300600";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재동":
			Albamoncrolling.area += ",I2300610";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적선동":
			Albamoncrolling.area += ",I2300620";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%FB%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("적선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로1가":
			Albamoncrolling.area += ",I2300630";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로2가":
			Albamoncrolling.area += ",I2300640";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로3가":
			Albamoncrolling.area += ",I2300650";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로4가":
			Albamoncrolling.area += ",I2300660";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로5가":
			Albamoncrolling.area += ",I2300670";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로6가":
			Albamoncrolling.area += ",I2300680";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중학동":
			Albamoncrolling.area += ",I2300690";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%DF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창성동":
			Albamoncrolling.area += ",I2300700";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신동":
			Albamoncrolling.area += ",I2300740";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신1동":
			Albamoncrolling.area += ",I2300710";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신2동":
			Albamoncrolling.area += ",I2300720";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신3동":
			Albamoncrolling.area += ",I2300730";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청운동":
			Albamoncrolling.area += ",I2300750";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청진동":
			Albamoncrolling.area += ",I2300760";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "체부동":
			Albamoncrolling.area += ",I2300770";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BC%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("체부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충신동":
			Albamoncrolling.area += ",I2300780";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%E6%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통의동":
			Albamoncrolling.area += ",I2300790";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통인동":
			Albamoncrolling.area += ",I2300800";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔판동":
			Albamoncrolling.area += ",I2300810";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%C8%C6%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔판동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			Albamoncrolling.area += ",I2300820";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평창동":
			Albamoncrolling.area += ",I2300830";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필운동":
			Albamoncrolling.area += ",I2300840";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%CA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("필운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행촌동":
			Albamoncrolling.area += ",I2300850";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%E0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "혜화동":
			Albamoncrolling.area += ",I2300860";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%FD%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("혜화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍지동":
			Albamoncrolling.area += ",I2300870";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍파동":
			Albamoncrolling.area += ",I2300880";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화동":
			Albamoncrolling.area += ",I2300890";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			Albamoncrolling.area += ",I2300900";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호제동":
			Albamoncrolling.area += ",I2300910";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "훈정동":
			Albamoncrolling.area += ",I2300920";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%C6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("훈정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광희동1가":
			Albamoncrolling.area += ",I2400010";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광희동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광희동2가":
			Albamoncrolling.area += ",I2400020";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광희동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로1가":
			Albamoncrolling.area += ",I2400030";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로2가":
			Albamoncrolling.area += ",I2400040";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로3가":
			Albamoncrolling.area += ",I2400050";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로4가":
			Albamoncrolling.area += ",I2400060";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로5가":
			Albamoncrolling.area += ",I2400070";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동1가":
			Albamoncrolling.area += ",I2400080";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동2가":
			Albamoncrolling.area += ",I2400090";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동3가":
			Albamoncrolling.area += ",I2400100";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남창동":
			Albamoncrolling.area += ",I2400110";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남학동":
			Albamoncrolling.area += ",I2400120";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다동":
			Albamoncrolling.area += ",I2400130";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산동":
			Albamoncrolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동화동":
			Albamoncrolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("동화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만리동1가":
			Albamoncrolling.area += ",I2400140";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("만리동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만리동2가":
			Albamoncrolling.area += ",I2400150";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("만리동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동1가":
			Albamoncrolling.area += ",I2400160";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동2가":
			Albamoncrolling.area += ",I2400170";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무교동":
			Albamoncrolling.area += ",I2400180";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무학동":
			Albamoncrolling.area += ",I2400190";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵정동":
			Albamoncrolling.area += ",I2400200";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산동":
			Albamoncrolling.area += ",I2400210";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동1가":
			Albamoncrolling.area += ",I2400220";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("봉래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동2가":
			Albamoncrolling.area += ",I2400230";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("봉래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북창동":
			Albamoncrolling.area += ",I2400240";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산림동":
			Albamoncrolling.area += ",I2400250";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EA%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼각동":
			Albamoncrolling.area += ",I2400260";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서소문동":
			Albamoncrolling.area += ",I2400270";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%D2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서소문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소공동":
			Albamoncrolling.area += ",I2400280";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%D2%B0%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수표동":
			Albamoncrolling.area += ",I2400290";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수표동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수하동":
			Albamoncrolling.area += ",I2400300";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순화동":
			Albamoncrolling.area += ",I2400310";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F8%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당동":
			Albamoncrolling.area += ",I2400380";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당1동":
			Albamoncrolling.area += ",I2400320";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당5동":
			Albamoncrolling.area += ",I2400360";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍림동":
			Albamoncrolling.area += ",I2400390";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%D6%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약수동":
			Albamoncrolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("약수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예관동":
			Albamoncrolling.area += ",I2400400";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예장동":
			Albamoncrolling.area += ",I2400410";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오장동":
			Albamoncrolling.area += ",I2400420";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%C0%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로1가":
			Albamoncrolling.area += ",I2400430";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로2가":
			Albamoncrolling.area += ",I2400440";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로3가":
			Albamoncrolling.area += ",I2400450";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로4가":
			Albamoncrolling.area += ",I2400460";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로5가":
			Albamoncrolling.area += ",I2400470";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로6가":
			Albamoncrolling.area += ",I2400480";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로7가":
			Albamoncrolling.area += ",I2400490";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의주로1가":
			Albamoncrolling.area += ",I2400500";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("의주로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의주로2가":
			Albamoncrolling.area += ",I2400510";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("의주로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동1가":
			Albamoncrolling.area += ",I2400520";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동2가":
			Albamoncrolling.area += ",I2400530";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입정동":
			Albamoncrolling.area += ",I2400540";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%D4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("입정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장교동":
			Albamoncrolling.area += ",I2400550";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장충동1가":
			Albamoncrolling.area += ",I2400560";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장충동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장충동2가":
			Albamoncrolling.area += ",I2400570";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장충동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동1가":
			Albamoncrolling.area += "I2400580";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("저동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동2가":
			Albamoncrolling.area += ",I2400590";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("저동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정동":
			Albamoncrolling.area += ",I2400600";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교동":
			Albamoncrolling.area += ",I2400610";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주자동":
			Albamoncrolling.area += ",I2400620";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중림동":
			Albamoncrolling.area += ",I2400630";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청구동":
			Albamoncrolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("청구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초동":
			Albamoncrolling.area += ",I2400640";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로1가":
			Albamoncrolling.area += ",I2400650";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로2가":
			Albamoncrolling.area += ",I2400660";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로3가":
			Albamoncrolling.area += ",I2400670";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로4가":
			Albamoncrolling.area += ",I2400680";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로5가":
			Albamoncrolling.area += ",I2400690";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로1가":
			Albamoncrolling.area += ",I2400700";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충정로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로1가":
			Albamoncrolling.area += ",I2400710";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로2가":
			Albamoncrolling.area += ",I2400720";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동1가":
			Albamoncrolling.area += ",I2400730";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("필동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동2가":
			Albamoncrolling.area += ",I2400740";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("필동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동3가":
			Albamoncrolling.area += ",I2400750";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("필동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황학동":
			Albamoncrolling.area += ",I2400760";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동1가":
			Albamoncrolling.area += ",I2400770";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("회현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동2가":
			Albamoncrolling.area += ",I2400780";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("회현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동3가":
			Albamoncrolling.area += ",I2400790";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("회현동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥인동":
			Albamoncrolling.area += ",I2400800";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%EF%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흥인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우동":
			Albamoncrolling.area += ",I2500040";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우3동":
			Albamoncrolling.area += ",I2500030";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망우3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우본동":
			Albamoncrolling.area += ",I2500010";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망우본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목동":
			Albamoncrolling.area += ",I2500130";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목2동":
			Albamoncrolling.area += ",I2500060";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목3.8동":
			Albamoncrolling.area += ",I2500070";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F13.8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목3.8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목4동":
			Albamoncrolling.area += ",I2500080";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목5동":
			Albamoncrolling.area += ",I2500090";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F15B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목7동":
			Albamoncrolling.area += ",I2500110";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F17%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목본동":
			Albamoncrolling.area += ",I2500050";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵동":
			Albamoncrolling.area += ",I2500160";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵1동":
			Albamoncrolling.area += ",I2500140";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵2동":
			Albamoncrolling.area += ",I2500150";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉동":
			Albamoncrolling.area += ",I2500190";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉1동":
			Albamoncrolling.area += ",I2500170";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉2동":
			Albamoncrolling.area += ",I2500180";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내동":
			Albamoncrolling.area += ",I2500220";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내1동":
			Albamoncrolling.area += ",I2500200";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내2동":
			Albamoncrolling.area += ",I2500210";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화동":
			Albamoncrolling.area += ",I2500260";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화1동":
			Albamoncrolling.area += ",I2500230";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화2동":
			Albamoncrolling.area += ",I2500240";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
