package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Busan {
	public boolean flag;

	public void BusanCity(ActionEvent e) {
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
		case "강동동":
			Albamoncrolling.area += ",H0100010";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B1%B8%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구랑동":
			Albamoncrolling.area += ",H0100020";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%AD%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹산동":
			Albamoncrolling.area += ",H0100030";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B3%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("녹산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "눌차동":
			Albamoncrolling.area += ",H0100040";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%AD%C2%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("눌차동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대저1동":
			Albamoncrolling.area += ",H0100050";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%EB%C0%FA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대저1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대저2동":
			Albamoncrolling.area += ",H0100060";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%EB%C0%FA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대저2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대항동":
			Albamoncrolling.area += ",H0100080";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%EB%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동":
			Albamoncrolling.area += ",H0100090";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명지동":
			Albamoncrolling.area += ",H0100100";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B8%ED%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미음동":
			Albamoncrolling.area += ",H0100110";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%CC%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범방동":
			Albamoncrolling.area += ",H0100120";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%FC%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉림동":
			Albamoncrolling.area += ",H0100130";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BA%C0%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생곡동":
			Albamoncrolling.area += ",H0100140";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BB%FD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("생곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			Albamoncrolling.area += ",H0100150";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			Albamoncrolling.area += ",H0100160";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식만동":
			Albamoncrolling.area += ",H0100170";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BD%C4%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("식만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신호동":
			Albamoncrolling.area += ",H0100180";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BD%C5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽동동":
			Albamoncrolling.area += ",H0100190";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C1%D7%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			Albamoncrolling.area += ",H0100200";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지사동":
			Albamoncrolling.area += ",H0100210";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C1%F6%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천성동":
			Albamoncrolling.area += ",H0100220";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C3%B5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			Albamoncrolling.area += ",H0100230";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구서동":
			Albamoncrolling.area += "H0200030";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%B8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구서1동":
			Albamoncrolling.area += ",H0200010";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%B8%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구서2동":
			Albamoncrolling.area += ",H0200020";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%B8%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금사동":
			Albamoncrolling.area += ",H0200040";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%DD%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성동":
			Albamoncrolling.area += ",H0200050";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%DD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			Albamoncrolling.area += ",H0200060";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노포동":
			Albamoncrolling.area += ",H0200070";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B3%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두구동":
			Albamoncrolling.area += ",H0200080";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B5%CE%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			Albamoncrolling.area += ",H0200130";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡1동":
			Albamoncrolling.area += ",H0200090";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡2동":
			Albamoncrolling.area += ",H0200100";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡3동":
			Albamoncrolling.area += ",H0200110";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡4동":
			Albamoncrolling.area += ",H0200120";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서동":
			Albamoncrolling.area += ",H0200180";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서1동":
			Albamoncrolling.area += ",H0200140";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서2동":
			Albamoncrolling.area += ",H0200150";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서3동":
			Albamoncrolling.area += ",H0200160";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서4동":
			Albamoncrolling.area += ",H0200170";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선동":
			Albamoncrolling.area += ",H0200190";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오륜동":
			Albamoncrolling.area += ",H0200200";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BF%C0%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전동":
			Albamoncrolling.area += ",H0200240";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전1동":
			Albamoncrolling.area += ",H0200210";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전2동":
			Albamoncrolling.area += ",H0200220";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전3동":
			Albamoncrolling.area += ",H0200230";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장전3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청룡동":
			Albamoncrolling.area += ",H0200250";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회동동":
			Albamoncrolling.area += ",H0200260";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C8%B8%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기장읍":
			Albamoncrolling.area += ",H0300010";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%B1%E2%C0%E5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("기장읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일광면":
			Albamoncrolling.area += ",H0300020";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C0%CF%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("일광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안읍":
			Albamoncrolling.area += ",H0300030";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C0%E5%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("장안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정관면":
			Albamoncrolling.area += ",H0300040";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C1%A4%B0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정관면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철마면":
			Albamoncrolling.area += ",H0300050";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C3%B6%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("철마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감만동":
			Albamoncrolling.area += ",H0400030";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B0%A8%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감만1동":
			Albamoncrolling.area += ",H0400010";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B0%A8%B8%B81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감만1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간만2동":
			Albamoncrolling.area += ",H0400020";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B0%A8%B8%B82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("간만2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연동":
			Albamoncrolling.area += ",H0400100";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연1동":
			Albamoncrolling.area += ",H0400040";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연2동":
			Albamoncrolling.area += ",H0400050";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연3동":
			Albamoncrolling.area += ",H0400060";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연4동":
			Albamoncrolling.area += ",H0400070";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연5동":
			Albamoncrolling.area += ",H0400080";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연6동":
			Albamoncrolling.area += ",H0400090";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대연6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현동":
			Albamoncrolling.area += ",H0400150";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현1동":
			Albamoncrolling.area += ",H0400110";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현2동":
			Albamoncrolling.area += ",H0400120";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현3동":
			Albamoncrolling.area += ",H0400130";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문현3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현4동":
			Albamoncrolling.area += ",H0400140";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문현4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담동":
			Albamoncrolling.area += ",H0400160";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호동":
			Albamoncrolling.area += ",H0400210";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호1동":
			Albamoncrolling.area += ",H0400170";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용호1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호2동":
			Albamoncrolling.area += ",H0400180";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용호2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호3동":
			Albamoncrolling.area += ",H0400190";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용호3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호4동":
			Albamoncrolling.area += ",H0400200";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A34%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용호4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암동":
			Albamoncrolling.area += ",H0400240";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EC%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암1동":
			Albamoncrolling.area += ",H0400220";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EC%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암2동":
			Albamoncrolling.area += ",H0400230";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EC%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일동":
			Albamoncrolling.area += ",H0500060";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일1동":
			Albamoncrolling.area += ",H0500010";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범일1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일2동":
			Albamoncrolling.area += ",H0500020";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범일2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일4동":
			Albamoncrolling.area += ",H0500030";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범일4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일5동":
			Albamoncrolling.area += ",H0500040";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범일5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정동":
			Albamoncrolling.area += ",H0500120";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정1동":
			Albamoncrolling.area += ",H0500070";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정2동":
			Albamoncrolling.area += ",H0500080";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정4동":
			Albamoncrolling.area += ",H0500100";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정5동":
			Albamoncrolling.area += ",H0500110";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A45%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌천동":
			Albamoncrolling.area += ",H0500150";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C1%C2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌천1동":
			Albamoncrolling.area += ",H0500130";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C1%C2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌천4동":
			Albamoncrolling.area += ",H0500140";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C1%C2%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌천4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량동":
			Albamoncrolling.area += ",H0500210";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량1동":
			Albamoncrolling.area += ",H0500160";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초량1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량2동":
			Albamoncrolling.area += ",H0500170";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초량2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량3동":
			Albamoncrolling.area += ",H0500180";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초량3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량6동":
			Albamoncrolling.area += ",H0500200";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초량6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙민동":
			Albamoncrolling.area += ",H0600010";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B3%AB%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			Albamoncrolling.area += ",H0600040";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%B7%FB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명장동":
			Albamoncrolling.area += ",H0600070";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명장1동":
			Albamoncrolling.area += ",H0600050";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명장2동":
			Albamoncrolling.area += ",H0600060";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복천동":
			Albamoncrolling.area += ",H0600080";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BA%B9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			Albamoncrolling.area += ",H0600120";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직1동":
			Albamoncrolling.area += ",H0600090";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직2동":
			Albamoncrolling.area += ",H0600100";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직3동":
			Albamoncrolling.area += ",H0600110";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수안동":
			Albamoncrolling.area += ",H0600130";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BC%F6%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안락동":
			Albamoncrolling.area += ",H0600160";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BE%C8%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안락1동":
			Albamoncrolling.area += ",H0600140";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BE%C8%B6%F41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안락1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안락2동":
			Albamoncrolling.area += ",H0600150";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BE%C8%B6%F42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안락2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천동":
			Albamoncrolling.area += ",H0600200";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천1동":
			Albamoncrolling.area += ",H0600170";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천2동":
			Albamoncrolling.area += ",H0600180";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천3동":
			Albamoncrolling.area += ",H0600190";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온천3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠산동":
			Albamoncrolling.area += ",H0600210";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%C4%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("칠산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야동":
			Albamoncrolling.area += ",H0700040";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%A1%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야1동":
			Albamoncrolling.area += ",H0700010";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%A1%BE%DF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가야1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야2동":
			Albamoncrolling.area += ",H0700020";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%A1%BE%DF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가야2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금동":
			Albamoncrolling.area += ",H0700080";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금1동":
			Albamoncrolling.area += ",H0700050";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개금1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금2동":
			Albamoncrolling.area += ",H0700060";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개금2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금3동":
			Albamoncrolling.area += ",H0700070";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개금3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감동":
			Albamoncrolling.area += ",H0700130";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감1동":
			Albamoncrolling.area += ",H0700090";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당감1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감2동":
			Albamoncrolling.area += ",H0700100";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당감2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감4동":
			Albamoncrolling.area += ",H0700120";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당감4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범전동":
			Albamoncrolling.area += ",H0700140";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천동":
			Albamoncrolling.area += ",H0700180";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천1동":
			Albamoncrolling.area += ",H0700150";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천2동":
			Albamoncrolling.area += ",H0700160";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천4동":
			Albamoncrolling.area += ",H0700170";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범천4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암동":
			Albamoncrolling.area += ",H0700210";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암1동":
			Albamoncrolling.area += ",H0700190";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암3동":
			Albamoncrolling.area += ",H0700200";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전동":
			Albamoncrolling.area += ",H0700240";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전1동":
			Albamoncrolling.area += ",H0700220";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전2동":
			Albamoncrolling.area += ",H0700230";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정동":
			Albamoncrolling.area += ",H0700270";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BE%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정1동":
			Albamoncrolling.area += ",H0700250";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BE%E7%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정2동":
			Albamoncrolling.area += ",H0700260";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BE%E7%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			Albamoncrolling.area += ",H0700280";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포동":
			Albamoncrolling.area += ",H0700320";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포1동":
			Albamoncrolling.area += ",H0700290";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포2동":
			Albamoncrolling.area += ",H0700300";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포3동":
			Albamoncrolling.area += ",H0700310";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전포3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초읍동":
			Albamoncrolling.area += ",H0700330";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C3%CA%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포동":
			Albamoncrolling.area += ",H0800040";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포1동":
			Albamoncrolling.area += ",H0800010";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포2동":
			Albamoncrolling.area += ",H0800020";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포3동":
			Albamoncrolling.area += ",H0800030";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구포3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			Albamoncrolling.area += ",H0800050";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천동":
			Albamoncrolling.area += ",H0800090";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천1동":
			Albamoncrolling.area += ",H0800060";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천2동":
			Albamoncrolling.area += "H0800070";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천3동":
			Albamoncrolling.area += ",H0800080";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕천3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕동":
			Albamoncrolling.area += ",H0800130";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕1동":
			Albamoncrolling.area += ",H0800100";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕2동":
			Albamoncrolling.area += ",H0800110";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕3동":
			Albamoncrolling.area += ",H0800120";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만덕3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명동":
			Albamoncrolling.area += ",H0800170";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명1동":
			Albamoncrolling.area += ",H0800140";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명2동":
			Albamoncrolling.area += ",H0800150";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화명2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명3동":
			Albamoncrolling.area += ",H0800160";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화명3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감전동":
			Albamoncrolling.area += ",H0900030";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B0%A8%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괘법동":
			Albamoncrolling.area += ",H0900040";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B1%A5%B9%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포동":
			Albamoncrolling.area += ",H0900070";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B4%F6%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포1동":
			Albamoncrolling.area += ",H0900050";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B4%F6%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포2동":
			Albamoncrolling.area += ",H0900060";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B4%F6%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모라동":
			Albamoncrolling.area += ",H0900110";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B8%F0%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모라1동":
			Albamoncrolling.area += ",H0900080";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B8%F0%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모라3동":
			Albamoncrolling.area += ",H0900100";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B8%F0%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모라3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼락동":
			Albamoncrolling.area += ",H0900120";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%BB%EF%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄궁동":
			Albamoncrolling.area += ",H0900130";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%BE%F6%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("엄궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례동":
			Albamoncrolling.area += ",H0900170";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례1동":
			Albamoncrolling.area += ",H0900140";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주례1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례2동":
			Albamoncrolling.area += ",H0900150";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주례2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례3동":
			Albamoncrolling.area += ",H0900160";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주례3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학장동":
			Albamoncrolling.area += ",H0900180";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C7%D0%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천동":
			Albamoncrolling.area += ",H1000030";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B0%A8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천1동":
			Albamoncrolling.area += ",H1000010";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B0%A8%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천2동":
			Albamoncrolling.area += ",H1000020";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B0%A8%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정동":
			Albamoncrolling.area += ",H1000080";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정1동":
			Albamoncrolling.area += ",H1000040";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정2동":
			Albamoncrolling.area += ",H1000050";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정3동":
			Albamoncrolling.area += ",H1000060";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정4동":
			Albamoncrolling.area += ",H1000070";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구평동":
			Albamoncrolling.area += ",H1000090";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%B8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다대동":
			Albamoncrolling.area += ",H1000120";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%D9%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다대1동":
			Albamoncrolling.area += ",H1000100";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%D9%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다대1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다대2동":
			Albamoncrolling.area += ",H1000110";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%D9%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다대2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당리동":
			Albamoncrolling.area += ",H1000130";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%E7%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			Albamoncrolling.area += ",H1000160";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평1동":
			Albamoncrolling.area += ",H1000140";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%BD%C5%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평2동":
			Albamoncrolling.area += ",H1000150";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%BD%C5%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장림동":
			Albamoncrolling.area += ",H1000190";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C0%E5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장림1동":
			Albamoncrolling.area += ",H1000170";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C0%E5%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장림2동":
			Albamoncrolling.area += ",H1000180";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C0%E5%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하단동":
			Albamoncrolling.area += ",H1000220";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C7%CF%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하단동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하단1동":
			Albamoncrolling.area += ",H1000200";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C7%CF%B4%DC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하단1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하단2동":
			Albamoncrolling.area += ",H1000210";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C7%CF%B4%DC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하단2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부민동":
			Albamoncrolling.area += ",H1100040";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B3%B2%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남부민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부민1동":
			Albamoncrolling.area += ",H1100010";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B3%B2%BA%CE%B9%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남부민1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부민2동":
			Albamoncrolling.area += ",H1100020";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B3%B2%BA%CE%B9%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남부민2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대신동1가":
			Albamoncrolling.area += ",H1100060";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%B4%EB%BD%C5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동대신동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대신동2가":
			Albamoncrolling.area += ",H1100070";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%B4%EB%BD%C5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동대신동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대신동3가":
			Albamoncrolling.area += ",H1100080";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%B4%EB%BD%C5%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동대신동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동":
			Albamoncrolling.area += ",H1100090";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동1가":
			Albamoncrolling.area += ",H1100100";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부민동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동2가":
			Albamoncrolling.area += ",H1100110";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부민동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동3가":
			Albamoncrolling.area += ",H1100120";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부민동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부용동1가":
			Albamoncrolling.area += ",H1100140";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부용동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부용동2가":
			Albamoncrolling.area += ",H1100150";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부용동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서대신동1가":
			Albamoncrolling.area += ",H1100170";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%B4%EB%BD%C5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서대신동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서대신동2가":
			Albamoncrolling.area += ",H1100180";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%B4%EB%BD%C5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서대신동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서대신동3가":
			Albamoncrolling.area += ",H1100190";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%B4%EB%BD%C5%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서대신동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아미동":
			Albamoncrolling.area += ",H1100200";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%C6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아미동1가":
			Albamoncrolling.area += ",H1100210";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%C6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아미동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아미동2가":
			Albamoncrolling.area += ",H1100220";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%C6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아미동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암남동":
			Albamoncrolling.area += ",H1100230";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%CF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초장동":
			Albamoncrolling.area += ",H1100240";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%CA%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동":
			Albamoncrolling.area += ",H1100250";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동1가":
			Albamoncrolling.area += ",H1100260";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동2가":
			Albamoncrolling.area += ",H1100270";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동3가":
			Albamoncrolling.area += ",H1100280";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동1가":
			Albamoncrolling.area += ",H1100300";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동2가":
			Albamoncrolling.area += ",H1100310";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동3가":
			Albamoncrolling.area += ",H1100320";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동4가":
			Albamoncrolling.area += ",H1100330";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토성동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동5가":
			Albamoncrolling.area += ",H1100340";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토성동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안동":
			Albamoncrolling.area += ",H1200050";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안1동":
			Albamoncrolling.area += ",H1200010";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안2동":
			Albamoncrolling.area += ",H1200020";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안3동":
			Albamoncrolling.area += ",H1200030";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안4동":
			Albamoncrolling.area += ",H1200040";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천동":
			Albamoncrolling.area += ",H1200080";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B3%B2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천1동":
			Albamoncrolling.area += ",H1200060";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B3%B2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천2동":
			Albamoncrolling.area += ",H1200070";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B3%B2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망미동":
			Albamoncrolling.area += ",H1200110";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B8%C1%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망미1동":
			Albamoncrolling.area += ",H1200090";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B8%C1%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망미2동":
			Albamoncrolling.area += ",H1200100";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B8%C1%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수영구망미2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "민락동":
			Albamoncrolling.area += ",H1200120";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B9%CE%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("민락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수영동":
			Albamoncrolling.area += ",H1200130";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%BC%F6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제동":
			Albamoncrolling.area += ",H1300050";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제1동":
			Albamoncrolling.area += ",H1300010";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거제1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제2동":
			Albamoncrolling.area += ",H1300020";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거제2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제3동":
			Albamoncrolling.area += ",H1300030";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거제3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제4동":
			Albamoncrolling.area += ",H1300040";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거제4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산동":
			Albamoncrolling.area += ",H1300150";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산1동":
			Albamoncrolling.area += ",H1300060";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산2동":
			Albamoncrolling.area += ",H1300070";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산3동":
			Albamoncrolling.area += ",H1300080";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산4동":
			Albamoncrolling.area += ",H1300090";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산5동":
			Albamoncrolling.area += ",H1300100";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산6동":
			Albamoncrolling.area += ",H1300110";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산8동":
			Albamoncrolling.area += ",H1300130";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산9동":
			Albamoncrolling.area += ",H1300140";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남항동":
			Albamoncrolling.area += ",H1400010";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남항동1가":
			Albamoncrolling.area += ",H1400020";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남항동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남향동2가":
			Albamoncrolling.area += ",H1400030";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남향동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남향동3가":
			Albamoncrolling.area += ",H1400040";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남향동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대교동1가":
			Albamoncrolling.area += ",H1400060";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%B1%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대교동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대교동2가":
			Albamoncrolling.area += ",H1400070";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%B1%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대교동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평동1가":
			Albamoncrolling.area += ",H1400090";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평동2가":
			Albamoncrolling.area += ",H1400100";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼동":
			Albamoncrolling.area += ",H1400140";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼1동":
			Albamoncrolling.area += ",H1400110";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동삼1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼2동":
			Albamoncrolling.area += ",H1400120";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동삼2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼3동":
			Albamoncrolling.area += ",H1400130";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동삼3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동1가":
			Albamoncrolling.area += ",H1400160";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동2가":
			Albamoncrolling.area += ",H1400170";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동3가":
			Albamoncrolling.area += ",H1400180";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉래동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동4가":
			Albamoncrolling.area += ",H1400190";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉래동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동5가":
			Albamoncrolling.area += ",H1400200";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A15%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉래동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신선동":
			Albamoncrolling.area += ",H1400210";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신선동1가":
			Albamoncrolling.area += ",H1400220";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신성동2가":
			Albamoncrolling.area += ",H1400230";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신선동3가":
			Albamoncrolling.area += ",H1400240";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신선동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동1가":
			Albamoncrolling.area += ",H1400260";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동2가":
			Albamoncrolling.area += ",H1400270";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영선동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동3가":
			Albamoncrolling.area += ",H1400280";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영선동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동4가":
			Albamoncrolling.area += ",H1400290";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영선동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			Albamoncrolling.area += ",H1400320";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학1동":
			Albamoncrolling.area += ",H1400300";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%C3%BB%C7%D01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청학1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학2동":
			Albamoncrolling.area += ",H1400310";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%C3%BB%C7%D02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청학2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동":
			Albamoncrolling.area += ",H1500010";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동1가":
			Albamoncrolling.area += ",H1500020";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동2가":
			Albamoncrolling.area += ",H1500030";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동3가":
			Albamoncrolling.area += ",H1500040";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광복동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동":
			Albamoncrolling.area += ",H1500050";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동1가":
			Albamoncrolling.area += ",H1500060";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동2가":
			Albamoncrolling.area += ",H1500070";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동3가":
			Albamoncrolling.area += ",H1500080";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동4가":
			Albamoncrolling.area += ",H1500090";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동5가":
			Albamoncrolling.area += ",H1500100";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동6가":
			Albamoncrolling.area += ",H1500110";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창동1가":
			Albamoncrolling.area += ",H15000130";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%A2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대창동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창동2가":
			Albamoncrolling.area += ",H1500140";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%A2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대창동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동":
			Albamoncrolling.area += ",H1500150";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동1가":
			Albamoncrolling.area += ",H1500160";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대청동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동2가":
			Albamoncrolling.area += ",H1500170";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대청동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동3가":
			Albamoncrolling.area += ",H1500180";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대청동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동4가":
			Albamoncrolling.area += ",H1500190";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대청동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동":
			Albamoncrolling.area += ",H1500200";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동1가":
			Albamoncrolling.area += ",H1500210";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동광동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동2가":
			Albamoncrolling.area += ",H1500220";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동3가":
			Albamoncrolling.area += ",H1500230";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동광동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동4가":
			Albamoncrolling.area += ",H1500240";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동광동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동5가":
			Albamoncrolling.area += ",H1500250";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동광동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동":
			Albamoncrolling.area += ",H1500260";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동1가":
			Albamoncrolling.area += ",H1500270";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보수동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동2가":
			Albamoncrolling.area += ",H1500280";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보수동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동3가":
			Albamoncrolling.area += ",H1500290";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보수동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동":
			Albamoncrolling.area += ",H1500300";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("부평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동1가":
			Albamoncrolling.area += ",H1500310";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("부평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동2가":
			Albamoncrolling.area += ",H1500320";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("부평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동3가":
			Albamoncrolling.area += ",H1500330";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("부평동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동4가":
			Albamoncrolling.area += ",H1500340";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("부평동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동1가":
			Albamoncrolling.area += ",H1500360";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신창동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동2가":
			Albamoncrolling.area += ",H1500370";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신창동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동3가":
			Albamoncrolling.area += ",H1500380";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신창동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동4가":
			Albamoncrolling.area += ",H1500390";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신창동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주동":
			Albamoncrolling.area += ",H1500420";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BF%B5%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주1동":
			Albamoncrolling.area += ",H1500400";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BF%B5%C1%D61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영주1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주2동":
			Albamoncrolling.area += ",H1500410";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BF%B5%C1%D62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영주2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",H1500430";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			Albamoncrolling.area += ",H1500440";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			Albamoncrolling.area += ",H1500450";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			Albamoncrolling.area += ",H1500460";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동4가":
			Albamoncrolling.area += ",H1500470";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동5가":
			Albamoncrolling.area += ",H1500480";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동6가":
			Albamoncrolling.area += ",H1500490";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동7가":
			Albamoncrolling.area += ",H1500500";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선동1가":
			Albamoncrolling.area += ",H1500520";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C3%A2%BC%B1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선동2가":
			Albamoncrolling.area += ",H1500530";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C3%A2%BC%B1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창선동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송동":
			Albamoncrolling.area += ",H1600040";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송1동":
			Albamoncrolling.area += ",H1600010";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반송1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송2동":
			Albamoncrolling.area += ",H1600020";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반송2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송3동":
			Albamoncrolling.area += ",H1600030";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반송3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여동":
			Albamoncrolling.area += ",H1600090";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반여동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여1동":
			Albamoncrolling.area += ",H1600050";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반여1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여2동":
			Albamoncrolling.area += ",H1600060";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반여2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여3동":
			Albamoncrolling.area += ",H1600070";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반여3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여4동":
			Albamoncrolling.area += ",H1600080";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반여4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석대동":
			Albamoncrolling.area += ",H1600100";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BC%AE%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해운대구송정동":
			Albamoncrolling.area += ",H1600110";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해운대구송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우동":
			Albamoncrolling.area += ",H1600140";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우1동":
			Albamoncrolling.area += ",H1600120";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우2동":
			Albamoncrolling.area += ",H1600130";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우3동":
			Albamoncrolling.area += ",H1600260";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재송동":
			Albamoncrolling.area += ",H1600170";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C0%E7%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재송1동":
			Albamoncrolling.area += ",H1600150";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C0%E7%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재송1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재송2동":
			Albamoncrolling.area += ",H1600160";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C0%E7%BC%DB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재송2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌동":
			Albamoncrolling.area += ",H1600220";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌1동":
			Albamoncrolling.area += ",H1600180";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌2동":
			Albamoncrolling.area += ",H1600190";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌3동":
			Albamoncrolling.area += ",H1600200";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌4동":
			Albamoncrolling.area += ",H1600210";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			Albamoncrolling.area += ",H1600250";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%DF1%B5";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중1동":
			Albamoncrolling.area += ",H1600230";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%DF1%B5";
			Mainpage.Filtering[Mainpage.index].setText("중1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중2동":
			Albamoncrolling.area += ",H1600240";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%DF2%B5";
			Mainpage.Filtering[Mainpage.index].setText("중2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
