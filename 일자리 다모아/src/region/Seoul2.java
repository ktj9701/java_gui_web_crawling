package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;

public class Seoul2 {
	public boolean flag;

	public void Seoul2City(ActionEvent e) {
		if (Mainpage.index == 0) {
			crolling.area = "";
			wewe.area = "";
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
			crolling.area += ",I1800030";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락1동":
			crolling.area += ",I1800010";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락2동":
			crolling.area += ",I1800020";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락본동":
			crolling.area += "I1800040";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가락본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여동":
			crolling.area += ",I1800070";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거여동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여1동":
			crolling.area += ",I1800050";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거여1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여2동":
			crolling.area += ",I1800060";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거여2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천동":
			crolling.area += "I1800100";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천1동":
			crolling.area += ",I1800080";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천2동":
			crolling.area += ",I1800090";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정동":
			crolling.area += ",I1800130";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정1동":
			crolling.area += ",I1800110";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정2동":
			crolling.area += "I1800120";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이동":
			crolling.area += ",I1800160";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이1동":
			crolling.area += ",I1800140";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방이1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이2동":
			crolling.area += ",I1800150";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방이2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼전동":
			crolling.area += "I1800170";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BB%EF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석촌동":
			crolling.area += ",I1800180";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%AE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파동":
			crolling.area += ",I1800210";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파1동":
			crolling.area += ",I1800190";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송파1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파2동":
			crolling.area += ",I1800200";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송파2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			crolling.area += ",I1800220";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			crolling.area += ",I1800230";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오륜동":
			crolling.area += ",I1800240";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			crolling.area += ",I1800380";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실동":
			crolling.area += ",I1800320";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실2동":
			crolling.area += ",I1800260";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실3동":
			crolling.area += ",I1800270";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실4동":
			crolling.area += ",I1800280";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실6동":
			crolling.area += ",I1800300";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실7동":
			crolling.area += ",I1800310";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실본동":
			crolling.area += ",I1800330";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠실본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			crolling.area += ",I1800340";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납동":
			crolling.area += ",I1800370";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍납동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납1동":
			crolling.area += ",I1800350";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍납1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납2동":
			crolling.area += ",I1800360";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍납2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",I1900070";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목1동":
			crolling.area += ",I1900010";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목2동":
			crolling.area += ",I1900020";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목3동":
			crolling.area += ",I1900030";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목4동":
			crolling.area += ",I1900040";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목5동":
			crolling.area += ",I1900050";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F15%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",I1900150";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월1동":
			crolling.area += ",I1900080";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월2동":
			crolling.area += ",I1900090";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월3동":
			crolling.area += ",I1900100";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월4동":
			crolling.area += ",I1900110";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월5동":
			crolling.area += ",I1900120";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F95%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월6동":
			crolling.area += ",I1900130";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F96%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월7동":
			crolling.area += ",I1900140";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F97%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양천구신정동":
			crolling.area += ",I1900230";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양천구신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정1동":
			crolling.area += ",I1900160";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정2동":
			crolling.area += ",I1900170";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정3동":
			crolling.area += ",I1900180";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정4동":
			crolling.area += ",I1900190";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정6동":
			crolling.area += ",I1900210";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A46%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정7동":
			crolling.area += ",I1900220";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A47%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동":
			crolling.area += ",I2000010";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동1가":
			crolling.area += ",I2000020";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동2가":
			crolling.area += ",I2000030";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동3가":
			crolling.area += ",I2000040";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동4가":
			crolling.area += ",I2000050";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동5가":
			crolling.area += ",I2000060";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동6가":
			crolling.area += ",I2000070";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("당산동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림동":
			crolling.area += ",I2000110";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림1동":
			crolling.area += ",I2000080";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림2동":
			crolling.area += ",I2000090";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림3동":
			crolling.area += "I2000100";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도림동":
			crolling.area += ",I2000140";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동":
			crolling.area += ",I2000150";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동1가":
			crolling.area += ",I2000160";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동2가":
			crolling.area += ",I2000170";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동3가":
			crolling.area += ",I2000180";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동4가":
			crolling.area += ",I2000190";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동5가":
			crolling.area += ",I2000200";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동6가":
			crolling.area += ",I2000210";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("문래동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길동":
			crolling.area += ",I2000290";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길1동":
			crolling.area += ",I2000220";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길3동":
			crolling.area += ",I2000240";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길4동":
			crolling.area += ",I2000250";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길5동":
			crolling.area += ",I2000260";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길6동":
			crolling.area += ",I2000270";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E66%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길7동":
			crolling.area += ",I2000280";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E67%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동":
			crolling.area += ",I2000300";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동1가":
			crolling.area += ",I2000310";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동2가":
			crolling.area += ",I2000320";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동3가":
			crolling.area += ",I2000330";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동4가":
			crolling.area += ",I2000340";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동5가":
			crolling.area += ",I2000350";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동6가":
			crolling.area += ",I2000360";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("양평동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양화동":
			crolling.area += ",I2000370";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여의도동":
			crolling.area += ",I2000380";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%A9%C0%C7%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여의도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동":
			crolling.area += ",I2000390";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영등포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동1가":
			crolling.area += ",I2000400";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동2가":
			crolling.area += ",I2000410";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동3가":
			crolling.area += ",I2000420";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포4가":
			crolling.area += ",I2000430";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동5가":
			crolling.area += ",I2000440";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동6가":
			crolling.area += ",I2000450";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동7가":
			crolling.area += ",I2000460";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동8가":
			crolling.area += ",I2000470";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF8%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영등포동8가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포본동":
			crolling.area += ",I2000230";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영등포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈월동":
			crolling.area += ",I2100010";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B0%A5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남영동":
			crolling.area += ",I2100020";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B3%B2%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도원동":
			crolling.area += ",I2100030";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동빙고동":
			crolling.area += ",I2100040";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동빙고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동자동":
			crolling.area += ",I2100050";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문배동":
			crolling.area += ",I2100060";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B9%AE%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동":
			crolling.area += ",I2100070";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BA%B8%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산천동":
			crolling.area += "I2100080";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BB%EA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서계동":
			crolling.area += ",I2100090";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서빙고동":
			crolling.area += ",I2100100";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서빙고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신계동":
			crolling.area += ",I2100110";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			crolling.area += ",I2100120";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문동":
			crolling.area += ",I2100130";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동1가":
			crolling.area += ",I2100140";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동2가":
			crolling.area += ",I2100150";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동3가":
			crolling.area += ",I2100160";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동4가":
			crolling.area += ",I2100170";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동5가":
			crolling.area += ",I2100180";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동6가":
			crolling.area += ",I2100190";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("용산동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로1가":
			crolling.area += ",I2100200";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로2가":
			crolling.area += ",I2100210";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로3가":
			crolling.area += ",I2100220";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로4가":
			crolling.area += ",I2100230";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원효로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌동":
			crolling.area += ",I2100260";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌1동":
			crolling.area += ",I2100240";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌2동":
			crolling.area += ",I2100250";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원동":
			crolling.area += ",I2100290";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이태원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원1동":
			crolling.area += ",I2100270";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이태원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원2동":
			crolling.area += ",I2100280";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이태원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주성동":
			crolling.area += ",I2100300";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청암동":
			crolling.area += ",I2100310";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동1가":
			crolling.area += ",I2100320";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("청파동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동2가":
			crolling.area += ",I2100330";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("청파동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동3가":
			crolling.area += ",I2100340";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("청파동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로1가":
			crolling.area += ",I2100350";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("한강로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로2가":
			crolling.area += ",I2100360";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("한강로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로3가":
			crolling.area += ",I2100370";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("한강로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한남동":
			crolling.area += ",I2100400";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("한남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효창동":
			crolling.area += ",I2100410";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%BF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후암동":
			crolling.area += ",I2100420";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%C4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("후암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			crolling.area += ",I2200030";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현1동":
			crolling.area += ",I2200010";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현2동":
			crolling.area += ",I2200020";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			crolling.area += ",I2200040";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹번동":
			crolling.area += ",I2200060";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B3%EC%B9%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("녹번동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대조동":
			crolling.area += ",I2200070";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B4%EB%C1%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대조동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광동":
			crolling.area += ",I2200110";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광1동":
			crolling.area += ",I2200080";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불광1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광2동":
			crolling.area += ",I2200090";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불광2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수색동":
			crolling.area += ",I2200120";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BC%F6%BB%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수색동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사동":
			crolling.area += ",I2200150";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사1동":
			crolling.area += ",I2200130";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사2동":
			crolling.area += ",I2200140";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역촌동":
			crolling.area += ",I2200180";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BF%AA%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암동":
			crolling.area += ",I2200230";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암1동":
			crolling.area += ",I2200190";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암2동":
			crolling.area += ",I2200200";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암3동":
			crolling.area += ",I2200210";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증산동":
			crolling.area += ",I2200240";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("증산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진관동":
			crolling.area += ",I2200250";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F8%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가회동":
			crolling.area += ",I2300010";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%A1%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가회동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "견지동":
			crolling.area += ",I2300020";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%DF%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("견지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경운동":
			crolling.area += ",I2300030";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E6%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계동":
			crolling.area += ",I2300040";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			crolling.area += ",I2300050";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관수동":
			crolling.area += ",I2300060";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관철동":
			crolling.area += ",I2300070";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C3%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관철동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관훈동":
			crolling.area += ",I2300080";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C8%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관훈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교남동":
			crolling.area += ",I2300090";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교북동":
			crolling.area += ",I2300100";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구기동":
			crolling.area += ",I2300110";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁정동":
			crolling.area += ",I2300120";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C3%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("궁정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권농동":
			crolling.area += ",I2300130";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("권농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			crolling.area += ",I2300140";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내수동":
			crolling.area += ",I2300150";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내자동":
			crolling.area += ",I2300160";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누상동":
			crolling.area += ",I2300170";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("누상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누하동":
			crolling.area += ",I2300180";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("누하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당주동":
			crolling.area += ",I2300190";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%E7%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도렴동":
			crolling.area += ",I2300200";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B5%B7%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도렴동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈의동":
			crolling.area += ",I2300210";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B7%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("돈의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동숭동":
			crolling.area += ",I2300220";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%BF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동숭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜1가":
			crolling.area += ",I2300230";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜2가":
			crolling.area += ",I2300240";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜3가":
			crolling.area += ",I2300250";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜4가":
			crolling.area += ",I2300260";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명륜4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘동":
			crolling.area += ",I2300270";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묘동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무악동":
			crolling.area += ",I2300280";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%AB%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무악동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉익동":
			crolling.area += ",I2300290";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%C0%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암동":
			crolling.area += ",I2300300";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%CE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사간동":
			crolling.area += ",I2300310";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%B0%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사간동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",I2300320";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼청동":
			crolling.area += ",I2300330";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%EF%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서린동":
			crolling.area += ",I2300340";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%AD%B8%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서린동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세종로":
			crolling.area += ",I2300350";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%BC%C1%BE%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("세종로");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소격동":
			crolling.area += ",I2300360";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%D2%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소격동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동":
			crolling.area += ",I2300370";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			crolling.area += ",I2300380";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			crolling.area += ",I2300390";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			crolling.area += ",I2300420";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인1동":
			crolling.area += ",I2300400";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인2동":
			crolling.area += ",I2300410";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신교동":
			crolling.area += ",I2300430";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문로1가":
			crolling.area += ",I2300440";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문로2가":
			crolling.area += ",I2300450";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신영동":
			crolling.area += ",I2300460";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안국동":
			crolling.area += "I2300470";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BE%C8%B1%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안국동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연건동":
			crolling.area += ",I2300480";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			crolling.area += ",I2300490";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예지동":
			crolling.area += ",I2300500";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%B9%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥인동":
			crolling.area += ",I2300510";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%C1%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡동":
			crolling.area += ",I2300520";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("와룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운니동":
			crolling.area += ",I2300530";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%EE%B4%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운니동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원남동":
			crolling.area += ",I2300540";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원서동":
			crolling.area += ",I2300550";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이화동":
			crolling.area += ",I2300560";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CC%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익선동":
			crolling.area += ",I2300570";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CD%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("익선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인사동":
			crolling.area += ",I2300580";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인의동":
			crolling.area += ",I2300590";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장사동":
			crolling.area += ",I2300600";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재동":
			crolling.area += ",I2300610";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적선동":
			crolling.area += ",I2300620";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%FB%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("적선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로1가":
			crolling.area += ",I2300630";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로2가":
			crolling.area += ",I2300640";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로3가":
			crolling.area += ",I2300650";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로4가":
			crolling.area += ",I2300660";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로5가":
			crolling.area += ",I2300670";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로6가":
			crolling.area += ",I2300680";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중학동":
			crolling.area += ",I2300690";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%DF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창성동":
			crolling.area += ",I2300700";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신동":
			crolling.area += ",I2300740";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신1동":
			crolling.area += ",I2300710";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신2동":
			crolling.area += ",I2300720";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신3동":
			crolling.area += ",I2300730";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창신3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청운동":
			crolling.area += ",I2300750";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청진동":
			crolling.area += ",I2300760";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "체부동":
			crolling.area += ",I2300770";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BC%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("체부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충신동":
			crolling.area += ",I2300780";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%E6%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통의동":
			crolling.area += ",I2300790";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통인동":
			crolling.area += ",I2300800";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔판동":
			crolling.area += ",I2300810";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%C8%C6%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔판동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",I2300820";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평창동":
			crolling.area += ",I2300830";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필운동":
			crolling.area += ",I2300840";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%CA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("필운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행촌동":
			crolling.area += ",I2300850";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%E0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "혜화동":
			crolling.area += ",I2300860";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%FD%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("혜화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍지동":
			crolling.area += ",I2300870";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍파동":
			crolling.area += ",I2300880";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화동":
			crolling.area += ",I2300890";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			crolling.area += ",I2300900";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호제동":
			crolling.area += ",I2300910";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "훈정동":
			crolling.area += ",I2300920";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%C6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("훈정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광희동1가":
			crolling.area += ",I2400010";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광희동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광희동2가":
			crolling.area += ",I2400020";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광희동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로1가":
			crolling.area += ",I2400030";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로2가":
			crolling.area += ",I2400040";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로3가":
			crolling.area += ",I2400050";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로4가":
			crolling.area += ",I2400060";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로5가":
			crolling.area += ",I2400070";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남대문로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동1가":
			crolling.area += ",I2400080";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동2가":
			crolling.area += ",I2400090";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동3가":
			crolling.area += ",I2400100";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남창동":
			crolling.area += ",I2400110";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남학동":
			crolling.area += ",I2400120";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다동":
			crolling.area += ",I2400130";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산동":
			crolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동화동":
			crolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("동화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만리동1가":
			crolling.area += ",I2400140";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("만리동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만리동2가":
			crolling.area += ",I2400150";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("만리동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동1가":
			crolling.area += ",I2400160";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동2가":
			crolling.area += ",I2400170";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("명동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무교동":
			crolling.area += ",I2400180";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무학동":
			crolling.area += ",I2400190";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵정동":
			crolling.area += ",I2400200";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산동":
			crolling.area += ",I2400210";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동1가":
			crolling.area += ",I2400220";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("봉래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동2가":
			crolling.area += ",I2400230";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("봉래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북창동":
			crolling.area += ",I2400240";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산림동":
			crolling.area += ",I2400250";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EA%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼각동":
			crolling.area += ",I2400260";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서소문동":
			crolling.area += ",I2400270";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%D2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서소문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소공동":
			crolling.area += ",I2400280";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%D2%B0%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수표동":
			crolling.area += ",I2400290";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수표동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수하동":
			crolling.area += ",I2400300";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순화동":
			crolling.area += ",I2400310";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F8%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당동":
			crolling.area += ",I2400380";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당1동":
			crolling.area += ",I2400320";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당5동":
			crolling.area += ",I2400360";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍림동":
			crolling.area += ",I2400390";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%D6%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약수동":
			crolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("약수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예관동":
			crolling.area += ",I2400400";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예장동":
			crolling.area += ",I2400410";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오장동":
			crolling.area += ",I2400420";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%C0%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로1가":
			crolling.area += ",I2400430";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로2가":
			crolling.area += ",I2400440";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로3가":
			crolling.area += ",I2400450";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로4가":
			crolling.area += ",I2400460";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로5가":
			crolling.area += ",I2400470";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로6가":
			crolling.area += ",I2400480";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로7가":
			crolling.area += ",I2400490";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("을지로7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의주로1가":
			crolling.area += ",I2400500";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("의주로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의주로2가":
			crolling.area += ",I2400510";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("의주로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동1가":
			crolling.area += ",I2400520";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동2가":
			crolling.area += ",I2400530";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입정동":
			crolling.area += ",I2400540";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%D4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("입정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장교동":
			crolling.area += ",I2400550";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장충동1가":
			crolling.area += ",I2400560";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장충동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장충동2가":
			crolling.area += ",I2400570";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장충동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동1가":
			crolling.area += "I2400580";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("저동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동2가":
			crolling.area += ",I2400590";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("저동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정동":
			crolling.area += ",I2400600";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교동":
			crolling.area += ",I2400610";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주자동":
			crolling.area += ",I2400620";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중림동":
			crolling.area += ",I2400630";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청구동":
			crolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("청구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초동":
			crolling.area += ",I2400640";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로1가":
			crolling.area += ",I2400650";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로2가":
			crolling.area += ",I2400660";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로3가":
			crolling.area += ",I2400670";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로4가":
			crolling.area += ",I2400680";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로5가":
			crolling.area += ",I2400690";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충무로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로1가":
			crolling.area += ",I2400700";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충정로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로1가":
			crolling.area += ",I2400710";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로2가":
			crolling.area += ",I2400720";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동1가":
			crolling.area += ",I2400730";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("필동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동2가":
			crolling.area += ",I2400740";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("필동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동3가":
			crolling.area += ",I2400750";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("필동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황학동":
			crolling.area += ",I2400760";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동1가":
			crolling.area += ",I2400770";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("회현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동2가":
			crolling.area += ",I2400780";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("회현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동3가":
			crolling.area += ",I2400790";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("회현동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥인동":
			crolling.area += ",I2400800";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%EF%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흥인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우동":
			crolling.area += ",I2500040";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우3동":
			crolling.area += ",I2500030";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망우3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우본동":
			crolling.area += ",I2500010";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망우본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목동":
			crolling.area += ",I2500130";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목2동":
			crolling.area += ",I2500060";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목3.8동":
			crolling.area += ",I2500070";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F13.8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목3.8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목4동":
			crolling.area += ",I2500080";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목5동":
			crolling.area += ",I2500090";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F15B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목7동":
			crolling.area += ",I2500110";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F17%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목본동":
			crolling.area += ",I2500050";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("면목본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵동":
			crolling.area += ",I2500160";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵1동":
			crolling.area += ",I2500140";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵2동":
			crolling.area += ",I2500150";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉동":
			crolling.area += ",I2500190";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉1동":
			crolling.area += ",I2500170";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉2동":
			crolling.area += ",I2500180";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내동":
			crolling.area += ",I2500220";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내1동":
			crolling.area += ",I2500200";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내2동":
			crolling.area += ",I2500210";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화동":
			crolling.area += ",I2500260";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화1동":
			crolling.area += ",I2500230";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화2동":
			crolling.area += ",I2500240";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
