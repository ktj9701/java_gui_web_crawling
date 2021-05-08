package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Deagu {
	public boolean flag;

	public void DeaguCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			Albamoncrolling.area = "";
		AlbaHeavencrolling.area ="";
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
		// 대구
		// 남구
		case "대명동":
			Albamoncrolling.area += ",F0100100";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명1동":
			Albamoncrolling.area += ",F0100030";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명2동":
			Albamoncrolling.area += ",F0100040";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명3동":
			Albamoncrolling.area += ",F0100050";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명4동":
			Albamoncrolling.area += ",F0100060";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명5동":
			Albamoncrolling.area += ",F0100070";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명6동":
			Albamoncrolling.area += "F0100080";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명9동":
			Albamoncrolling.area += ",F0100090";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명10동":
			Albamoncrolling.area += ",F0100010";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED10%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명10동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명11동":
			Albamoncrolling.area += ",F0100020";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명11동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉덕동":
			Albamoncrolling.area += ",F0100140";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉덕1동":
			Albamoncrolling.area += ",F0100110";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉덕2동":
			Albamoncrolling.area += ",F0100120";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉덕3동":
			Albamoncrolling.area += ",F0100130";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉덕3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이천동":
			Albamoncrolling.area += ",F0100150";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 달서구
		case "갈산동":
			Albamoncrolling.area += ",F0200010";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감삼동":
			Albamoncrolling.area += ",F0200020";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B0%A8%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곡동":
			Albamoncrolling.area += ",F0200030";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B4%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천동":
			Albamoncrolling.area += ",F0200040";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도원동":
			Albamoncrolling.area += ",F0200050";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두류동":
			Albamoncrolling.area += ",F0200090";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두류1동":
			Albamoncrolling.area += ",F0200060";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두류1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두류2동":
			Albamoncrolling.area += ",F0200070";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두류2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두류3동":
			Albamoncrolling.area += ",F0200080";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두류3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본동":
			Albamoncrolling.area += ",F0200100";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본리동":
			Albamoncrolling.area += ",F0200110";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BA%BB%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상인동":
			Albamoncrolling.area += ",F0200150";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상인1동":
			Albamoncrolling.area += ",F0200120";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상인1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상인2동":
			Albamoncrolling.area += ",F0200130";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상인2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상인3동":
			Albamoncrolling.area += ",F0200140";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상인3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성당동":
			Albamoncrolling.area += ",F0200180";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성당1동":
			Albamoncrolling.area += ",F0200160";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성당2동":
			Albamoncrolling.area += ",F0200170";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			Albamoncrolling.area += ",F0200210";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현1동":
			Albamoncrolling.area += ",F0200190";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현2동":
			Albamoncrolling.area += ",F0200200";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당동":
			Albamoncrolling.area += ",F0200220";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			Albamoncrolling.area += ",F0200250";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산1동":
			Albamoncrolling.area += ",F0200230";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산2동":
			Albamoncrolling.area += ",F0200240";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월성동":
			Albamoncrolling.area += ",F0200280";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월성1동":
			Albamoncrolling.area += ",F0200260";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월성2동":
			Albamoncrolling.area += ",F0200270";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월암동":
			Albamoncrolling.area += ",F0200290";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우러암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천동":
			Albamoncrolling.area += ",F0200300";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이곡동":
			Albamoncrolling.area += ",F0200330";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이곡1동":
			Albamoncrolling.area += ",F0200310";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이곡2동":
			Albamoncrolling.area += ",F0200320";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기동":
			Albamoncrolling.area += ",F0200340";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동":
			Albamoncrolling.area += ",F0200350";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전동":
			Albamoncrolling.area += ",F0200360";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진천동":
			Albamoncrolling.area += ",F0200370";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C1%F8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파호동":
			Albamoncrolling.area += ",F0200380";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C6%C4%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("파호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호림동":
			Albamoncrolling.area += ",F0200390";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C8%A3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호산동":
			Albamoncrolling.area += ",F0200400";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C8%A3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 달성군
		case "가창면":
			Albamoncrolling.area += ",F0300010";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B0%A1%C3%A2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가창면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구지면":
			Albamoncrolling.area += ",F0300020";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B1%B8%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논공읍":
			Albamoncrolling.area += ",F0300030";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B3%ED%B0%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("논공읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다사읍":
			Albamoncrolling.area += ",F0300040";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B4%D9%BB%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("다사읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥포면":
			Albamoncrolling.area += ",F0300050";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%BF%C1%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("옥포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유가읍":
			Albamoncrolling.area += ",F0300060";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C0%AF%B0%A1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("유가읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하빈면":
			Albamoncrolling.area += ",F0300070";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C7%CF%BA%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하빈면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현풍면":
			Albamoncrolling.area += ",F0300080";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C7%F6%C7%B3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("현풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화원읍":
			Albamoncrolling.area += ",F0300090";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C8%AD%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("화원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 동구
		case "각산동":
			Albamoncrolling.area += ",F0400010";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B0%A2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("각산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검사동":
			Albamoncrolling.area += ",F0400020";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B0%CB%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("검사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴전동":
			Albamoncrolling.area += ",F0400030";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B1%AB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금강동":
			Albamoncrolling.area += ",F0400040";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			Albamoncrolling.area += ",F0400050";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			Albamoncrolling.area += ",F0400060";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능성동":
			Albamoncrolling.area += ",F0400070";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%C9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("능성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림동":
			Albamoncrolling.area += ",F0400080";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕곡동":
			Albamoncrolling.area += ",F0400090";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도동":
			Albamoncrolling.area += "F0400100";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도학동":
			Albamoncrolling.area += ",F0400110";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%B5%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동내동":
			Albamoncrolling.area += ",F0400120";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동호동":
			Albamoncrolling.area += ",F0400130";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔산동":
			Albamoncrolling.area += ",F0400140";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%D0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매여동":
			Albamoncrolling.area += ",F0400150";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B8%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매여동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미곡동":
			Albamoncrolling.area += ",F0400160";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%CC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미대동":
			Albamoncrolling.area += ",F0400170";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%CC%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방촌동":
			Albamoncrolling.area += ",F0400180";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%E6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백안동":
			Albamoncrolling.area += ",F0400190";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%E9%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉무동":
			Albamoncrolling.area += ",F0400200";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%C0%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부동":
			Albamoncrolling.area += ",F0400210";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불로동":
			Albamoncrolling.area += ",F0400220";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%D2%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사복동":
			Albamoncrolling.area += ",F0400230";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BB%E7%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상매동":
			Albamoncrolling.area += ",F0400240";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BB%F3%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호동":
			Albamoncrolling.area += ",F0400250";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			Albamoncrolling.area += ",F0400260";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숙천동":
			Albamoncrolling.area += ",F0400270";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%F7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숙천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			Albamoncrolling.area += ",F0400280";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신무동":
			Albamoncrolling.area += ",F0400290";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신서동":
			Albamoncrolling.area += ",F0400300";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암동":
			Albamoncrolling.area += ",F0400360";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암1동":
			Albamoncrolling.area += ",F0400310";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암2동":
			Albamoncrolling.area += ",F0400320";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암3동":
			Albamoncrolling.area += ",F0400330";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암4동":
			Albamoncrolling.area += ",F0400340";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신암4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암5동":
			Albamoncrolling.area += ",F0400350";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신암5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신용동":
			Albamoncrolling.area += ",F0400370";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			Albamoncrolling.area += ",F0400410";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천1,2동":
			Albamoncrolling.area += ",F0400380";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B51.2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천1,2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천3동":
			Albamoncrolling.area += ",F0400390";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천4동":
			Albamoncrolling.area += ",F0400400";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			Albamoncrolling.area += ",F0400420";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용계동":
			Albamoncrolling.area += ",F0400430";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용수동":
			Albamoncrolling.area += ",F0400440";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율암동":
			Albamoncrolling.area += ",F0400450";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%B2%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율하동":
			Albamoncrolling.area += ",F0400460";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%B2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입석동":
			Albamoncrolling.area += ",F0400470";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%D4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("입석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중대동":
			Albamoncrolling.area += ",F0400480";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%DF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지묘동":
			Albamoncrolling.area += ",F0400490";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지묘동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지저동":
			Albamoncrolling.area += ",F0400500";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진인동":
			Albamoncrolling.area += ",F0400510";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F8%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평광동":
			Albamoncrolling.area += ",F0400520";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C6%F2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효목동":
			Albamoncrolling.area += ",F0400550";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효목1동":
			Albamoncrolling.area += ",F0400530";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효목1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효목2동":
			Albamoncrolling.area += ",F0400540";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 북구
		case "검단동":
			Albamoncrolling.area += ",F0500010";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%CB%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("검단동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고성동1가":
			Albamoncrolling.area += ",F0500020";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("고성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고성동2가":
			Albamoncrolling.area += ",F0500030";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("고성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고성동3가":
			Albamoncrolling.area += ",F0500040";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("고성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관음동":
			Albamoncrolling.area += ",F0500050";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%FC%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암동":
			Albamoncrolling.area += ",F0500060";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "국우동":
			Albamoncrolling.area += ",F0500070";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%B9%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("국우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동":
			Albamoncrolling.area += ",F0500080";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노곡동":
			Albamoncrolling.area += ",F0500090";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노원동1가":
			Albamoncrolling.area += ",F0500100";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("노원동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노원동2가":
			Albamoncrolling.area += ",F0500110";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("노원동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노원동3가":
			Albamoncrolling.area += ",F0500120";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("노원동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대현동":
			Albamoncrolling.area += ",F0500150";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대현1동":
			Albamoncrolling.area += ",F0500130";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대현2동":
			Albamoncrolling.area += ",F0500140";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			Albamoncrolling.area += ",F0500160";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동변동":
			Albamoncrolling.area += ",F0500170";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동천동":
			Albamoncrolling.area += ",F0500180";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북구동호동":
			Albamoncrolling.area += ",F0500190";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북구동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매천동":
			Albamoncrolling.area += ",F0500200";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복현동":
			Albamoncrolling.area += ",F0500230";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복현1동":
			Albamoncrolling.area += ",F0500210";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복현2동":
			Albamoncrolling.area += ",F0500220";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사수동":
			Albamoncrolling.area += ",F0500240";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%E7%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산격동":
			Albamoncrolling.area += ",F0500290";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산격동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산격1동":
			Albamoncrolling.area += ",F0500250";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산격1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산격2동":
			Albamoncrolling.area += ",F0500260";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산격2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산격3동":
			Albamoncrolling.area += ",F0500270";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산격3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산격4동":
			Albamoncrolling.area += ",F0500280";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산격4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서변동":
			Albamoncrolling.area += ",F0500300";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BC%AD%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연경동":
			Albamoncrolling.area += ",F0500310";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍내동":
			Albamoncrolling.area += ",F0500320";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("읍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조야동":
			Albamoncrolling.area += ",F0500330";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C1%B6%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠성동1가":
			Albamoncrolling.area += ",F0500340";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A5%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("칠성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠성동2가":
			Albamoncrolling.area += ",F0500350";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A5%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("칠성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "침산동":
			Albamoncrolling.area += ",F0500390";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("침산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "침산1동":
			Albamoncrolling.area += ",F0500360";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("침산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "침산2동":
			Albamoncrolling.area += ",F0500370";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("침산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "침산3동":
			Albamoncrolling.area += ",F0500380";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("침산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태전동":
			Albamoncrolling.area += ",F0500420";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태전1동":
			Albamoncrolling.area += ",F0500400";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태전2동":
			Albamoncrolling.area += ",F0500410";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달동":
			Albamoncrolling.area += ",F0500430";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C6%C8%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학정동":
			Albamoncrolling.area += ",F0500440";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C7%D0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 서구
		case "내당동":
			Albamoncrolling.area += ",F0600040";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내당1동":
			Albamoncrolling.area += ",F0600010";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내당2,3동":
			Albamoncrolling.area += ",F0600020";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E72.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내당2,3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내당4동":
			Albamoncrolling.area += ",F0600030";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산동":
			Albamoncrolling.area += ",F0600110";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산1동":
			Albamoncrolling.area += ",F0600050";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산2/3동":
			Albamoncrolling.area += ",F0600060";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA2.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산2/3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산4동":
			Albamoncrolling.area += ",F0600070";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산5동":
			Albamoncrolling.area += ",F0600080";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산6동":
			Albamoncrolling.area += ",F0600090";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산7동":
			Albamoncrolling.area += ",F0600100";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상리동":
			Albamoncrolling.area += ",F0600120";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BB%F3%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원대동1가":
			Albamoncrolling.area += ",F0600130";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원대동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원대동2가":
			Albamoncrolling.area += ",F0600140";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원대동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원대동3가":
			Albamoncrolling.area += ",F0600150";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("원대동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이현동":
			Albamoncrolling.area += ",F0600160";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C0%CC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중리동":
			Albamoncrolling.area += ",F0600170";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리동":
			Albamoncrolling.area += ",F0600240";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리1동":
			Albamoncrolling.area += ",F0600180";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리2동":
			Albamoncrolling.area += ",F0600190";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리3동":
			Albamoncrolling.area += ",F0600200";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리4동":
			Albamoncrolling.area += ",F0600210";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리5동":
			Albamoncrolling.area += ",F0600220";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리6동":
			Albamoncrolling.area += ",F0600230";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 수성구
		case "가천동":
			Albamoncrolling.area += ",F0700010";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B0%A1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고모동":
			Albamoncrolling.area += ",F0700020";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B0%ED%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노변동":
			Albamoncrolling.area += ",F0700030";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B3%EB%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			Albamoncrolling.area += ",F0700040";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두산동":
			Albamoncrolling.area += ",F0700050";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B5%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만촌동":
			Albamoncrolling.area += ",F0700090";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만촌1동":
			Albamoncrolling.area += ",F0700060";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만촌2동":
			Albamoncrolling.area += ",F0700070";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만촌3동":
			Albamoncrolling.area += ",F0700080";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만촌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매호동":
			Albamoncrolling.area += ",F0700100";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%C5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범물동":
			Albamoncrolling.area += ",F0700130";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범물동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범물1동":
			Albamoncrolling.area += ",F0700110";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범물1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범물2동":
			Albamoncrolling.area += ",F0700120";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범물2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범어동":
			Albamoncrolling.area += ",F0700180";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범어동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범어1동":
			Albamoncrolling.area += ",F0700140";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범어1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범어2동":
			Albamoncrolling.area += ",F0700150";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범어2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범어3동":
			Albamoncrolling.area += ",F0700160";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범어3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범어4동":
			Albamoncrolling.area += ",F0700170";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범어4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사월동":
			Albamoncrolling.area += ",F0700190";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%E7%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼덕동":
			Albamoncrolling.area += ",F0700200";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			Albamoncrolling.area += ",F0700210";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성동":
			Albamoncrolling.area += ",F0700220";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동1가":
			Albamoncrolling.area += ",F0700230";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("수성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동2가":
			Albamoncrolling.area += ",F0700240";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("수성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동3가":
			Albamoncrolling.area += ",F0700250";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("수성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동4가":
			Albamoncrolling.area += ",F0700260";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("수성동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시지동":
			Albamoncrolling.area += ",F0700270";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BD%C3%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신매동":
			Albamoncrolling.area += ",F0700280";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BD%C5%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연호동":
			Albamoncrolling.area += ",F0700290";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BF%AC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "욱수동":
			Albamoncrolling.area += ",F0700300";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BF%ED%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("욱수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성구이천동":
			Albamoncrolling.area += ",F0700310";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수성구이천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			Albamoncrolling.area += ",F0700320";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산동":
			Albamoncrolling.area += ",F0700350";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산1동":
			Albamoncrolling.area += ",F0700330";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산2동":
			Albamoncrolling.area += ",F0700340";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파동":
			Albamoncrolling.area += ",F0700360";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금동":
			Albamoncrolling.area += ",F0700390";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금1동":
			Albamoncrolling.area += ",F0700370";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황금1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금2동":
			Albamoncrolling.area += ",F0700380";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황금2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 중구
		case "계산동1가":
			Albamoncrolling.area += ",F0800010";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("계산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산동2가":
			Albamoncrolling.area += ",F0800020";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("계산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			Albamoncrolling.area += ",F0800030";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			Albamoncrolling.area += ",F0800040";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			Albamoncrolling.area += ",F0800090";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산1동":
			Albamoncrolling.area += ",F0800050";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산2동":
			Albamoncrolling.area += ",F0800060";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산3동":
			Albamoncrolling.area += ",F0800070";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산4동":
			Albamoncrolling.area += ",F0800080";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남성로":
			Albamoncrolling.area += ",F0800100";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BC%BA%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("남성로");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남일동":
			Albamoncrolling.area += ",F0800110";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달성동":
			Albamoncrolling.area += ",F0800120";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%DE%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("달성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대봉동":
			Albamoncrolling.area += ",F0800150";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대봉1동":
			Albamoncrolling.area += ",F0800130";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대봉2동":
			Albamoncrolling.area += ",F0800140";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대신동":
			Albamoncrolling.area += ",F0800160";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대안동":
			Albamoncrolling.area += ",F0800170";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산동":
			Albamoncrolling.area += ",F0800180";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중구도원동":
			Albamoncrolling.area += ",F0800190";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중구도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동문동":
			Albamoncrolling.area += ",F0800200";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			Albamoncrolling.area += ",F0800210";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동성로1가":
			Albamoncrolling.area += ",F0800220";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동성로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동성로2가":
			Albamoncrolling.area += ",F0800230";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동성로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동성로3가":
			Albamoncrolling.area += ",F0800240";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동성로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동인동1가":
			Albamoncrolling.area += ",F0800250";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동인동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동인동2가":
			Albamoncrolling.area += ",F0800260";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동인동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동인동3가":
			Albamoncrolling.area += ",F0800270";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동인동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동인동4가":
			Albamoncrolling.area += ",F0800280";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동인동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동일동":
			Albamoncrolling.area += ",F0800290";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			Albamoncrolling.area += ",F0800300";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			Albamoncrolling.area += ",F0800310";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북내동":
			Albamoncrolling.area += ",F0800320";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성로1가":
			Albamoncrolling.area += ",F0800330";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북성로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성로2가":
			Albamoncrolling.area += ",F0800340";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북성로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사일동":
			Albamoncrolling.area += ",F0800350";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%E7%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼덕동1가":
			Albamoncrolling.area += ",F0800360";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼덕동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼덕동2가":
			Albamoncrolling.area += ",F0800370";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼덕동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼덕동3가":
			Albamoncrolling.area += ",F0800380";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼덕동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상덕동":
			Albamoncrolling.area += ",F0800390";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%F3%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상서동":
			Albamoncrolling.area += ",F0800400";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서내동":
			Albamoncrolling.area += ",F0800410";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서문로1가":
			Albamoncrolling.area += ",F0800420";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서문로2가":
			Albamoncrolling.area += ",F0800430";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서성로1가":
			Albamoncrolling.area += ",F0800440";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서성로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서성로2가":
			Albamoncrolling.area += ",F0800450";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서성로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서야동":
			Albamoncrolling.area += ",F0800460";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동":
			Albamoncrolling.area += ",F0800470";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수창동":
			Albamoncrolling.area += ",F0800480";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시장북로":
			Albamoncrolling.area += ",F0800490";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BD%C3%C0%E5%BA%CF%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("시장북로");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완정동":
			Albamoncrolling.area += ",F0800500";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BF%CF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("완정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용덕동":
			Albamoncrolling.area += ",F0800510";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BF%EB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인교동":
			Albamoncrolling.area += ",F0800520";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장관동":
			Albamoncrolling.area += ",F0800530";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동":
			Albamoncrolling.area += ",F0800540";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로1가":
			Albamoncrolling.area += ",F0800550";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로2가":
			Albamoncrolling.area += ",F0800560";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("종로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로1가":
			Albamoncrolling.area += ",F0800570";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로2가":
			Albamoncrolling.area += ",F0800580";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로3가":
			Albamoncrolling.area += ",F0800590";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("태평로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포정동":
			Albamoncrolling.area += ",F0800600";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C6%F7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("포정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하서동":
			Albamoncrolling.area += ",F0800610";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C7%CF%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향촌동":
			Albamoncrolling.area += ",F0800620";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C7%E2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("향촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			Albamoncrolling.area += ",F0800630";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
