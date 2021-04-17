package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Busan {
	public boolean flag;

	public void BusanCity(ActionEvent e) {
		if (Mainpage.index == 0)
			crolling.area = "";

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
			crolling.area += ",H0100010";
			Mainpage.Filtering[Mainpage.index].setText("강동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구랑동":
			crolling.area += ",H0100020";
			Mainpage.Filtering[Mainpage.index].setText("구랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹산동":
			crolling.area += ",H0100030";
			Mainpage.Filtering[Mainpage.index].setText("녹산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "눌차동":
			crolling.area += ",H0100040";
			Mainpage.Filtering[Mainpage.index].setText("눌차동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대저1동":
			crolling.area += ",H0100050";
			Mainpage.Filtering[Mainpage.index].setText("대저1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대저2동":
			crolling.area += ",H0100060";
			Mainpage.Filtering[Mainpage.index].setText("대저2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대항동":
			crolling.area += ",H0100080";
			Mainpage.Filtering[Mainpage.index].setText("대항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동":
			crolling.area += ",H0100090";
			Mainpage.Filtering[Mainpage.index].setText("동선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명지동":
			crolling.area += ",H0100100";
			Mainpage.Filtering[Mainpage.index].setText("명지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미음동":
			crolling.area += ",H0100110";
			Mainpage.Filtering[Mainpage.index].setText("미음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범방동":
			crolling.area += ",H0100120";
			Mainpage.Filtering[Mainpage.index].setText("범방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉림동":
			crolling.area += ",H0100130";
			Mainpage.Filtering[Mainpage.index].setText("봉림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생곡동":
			crolling.area += ",H0100140";
			Mainpage.Filtering[Mainpage.index].setText("생곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			crolling.area += ",H0100150";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",H0100160";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식만동":
			crolling.area += ",H0100170";
			Mainpage.Filtering[Mainpage.index].setText("식만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신호동":
			crolling.area += ",H0100180";
			Mainpage.Filtering[Mainpage.index].setText("신호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽동동":
			crolling.area += ",H0100190";
			Mainpage.Filtering[Mainpage.index].setText("죽동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",H0100200";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지사동":
			crolling.area += ",H0100210";
			Mainpage.Filtering[Mainpage.index].setText("지사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천성동":
			crolling.area += ",H0100220";
			Mainpage.Filtering[Mainpage.index].setText("천성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			crolling.area += ",H0100230";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구서동":
			crolling.area += "H0200030";
			Mainpage.Filtering[Mainpage.index].setText("구서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구서1동":
			crolling.area += ",H0200010";
			Mainpage.Filtering[Mainpage.index].setText("구서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구서2동":
			crolling.area += ",H0200020";
			Mainpage.Filtering[Mainpage.index].setText("구서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금사동":
			crolling.area += ",H0200040";
			Mainpage.Filtering[Mainpage.index].setText("금사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성동":
			crolling.area += ",H0200050";
			Mainpage.Filtering[Mainpage.index].setText("금성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			crolling.area += ",H0200060";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노포동":
			crolling.area += ",H0200070";
			Mainpage.Filtering[Mainpage.index].setText("노포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두구동":
			crolling.area += ",H0200080";
			Mainpage.Filtering[Mainpage.index].setText("두구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",H0200130";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡1동":
			crolling.area += ",H0200090";
			Mainpage.Filtering[Mainpage.index].setText("부곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡2동":
			crolling.area += ",H0200100";
			Mainpage.Filtering[Mainpage.index].setText("부곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡3동":
			crolling.area += ",H0200110";
			Mainpage.Filtering[Mainpage.index].setText("부곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡4동":
			crolling.area += ",H0200120";
			Mainpage.Filtering[Mainpage.index].setText("부곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서동":
			crolling.area += ",H0200180";
			Mainpage.Filtering[Mainpage.index].setText("서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서1동":
			crolling.area += ",H0200140";
			Mainpage.Filtering[Mainpage.index].setText("서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서2동":
			crolling.area += ",H0200150";
			Mainpage.Filtering[Mainpage.index].setText("서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서3동":
			crolling.area += ",H0200160";
			Mainpage.Filtering[Mainpage.index].setText("서3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서4동":
			crolling.area += ",H0200170";
			Mainpage.Filtering[Mainpage.index].setText("서4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선동":
			crolling.area += ",H0200190";
			Mainpage.Filtering[Mainpage.index].setText("선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오륜동":
			crolling.area += ",H0200200";
			Mainpage.Filtering[Mainpage.index].setText("오륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전동":
			crolling.area += ",H0200240";
			Mainpage.Filtering[Mainpage.index].setText("장전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전1동":
			crolling.area += ",H0200210";
			Mainpage.Filtering[Mainpage.index].setText("장전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전2동":
			crolling.area += ",H0200220";
			Mainpage.Filtering[Mainpage.index].setText("장전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장전3동":
			crolling.area += ",H0200230";
			Mainpage.Filtering[Mainpage.index].setText("장전3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청룡동":
			crolling.area += ",H0200250";
			Mainpage.Filtering[Mainpage.index].setText("청룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회동동":
			crolling.area += ",H0200260";
			Mainpage.Filtering[Mainpage.index].setText("회동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기장읍":
			crolling.area += ",H0300010";
			Mainpage.Filtering[Mainpage.index].setText("기장읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일광면":
			crolling.area += ",H0300020";
			Mainpage.Filtering[Mainpage.index].setText("일광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안읍":
			crolling.area += ",H0300030";
			Mainpage.Filtering[Mainpage.index].setText("장안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정관면":
			crolling.area += ",H0300040";
			Mainpage.Filtering[Mainpage.index].setText("정관면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철마면":
			crolling.area += ",H0300050";
			Mainpage.Filtering[Mainpage.index].setText("철마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감만동":
			crolling.area += ",H0400030";
			Mainpage.Filtering[Mainpage.index].setText("감만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감만1동":
			crolling.area += ",H0400010";
			Mainpage.Filtering[Mainpage.index].setText("감만1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간만2동":
			crolling.area += ",H0400020";
			Mainpage.Filtering[Mainpage.index].setText("간만2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연동":
			crolling.area += ",H0400100";
			Mainpage.Filtering[Mainpage.index].setText("대연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연1동":
			crolling.area += ",H0400040";
			Mainpage.Filtering[Mainpage.index].setText("대연1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연2동":
			crolling.area += ",H0400050";
			Mainpage.Filtering[Mainpage.index].setText("대연2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연3동":
			crolling.area += ",H0400060";
			Mainpage.Filtering[Mainpage.index].setText("대연3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연4동":
			crolling.area += ",H0400070";
			Mainpage.Filtering[Mainpage.index].setText("대연4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연5동":
			crolling.area += ",H0400080";
			Mainpage.Filtering[Mainpage.index].setText("대연5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대연6동":
			crolling.area += ",H0400090";
			Mainpage.Filtering[Mainpage.index].setText("대연6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현동":
			crolling.area += ",H0400150";
			Mainpage.Filtering[Mainpage.index].setText("문현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현1동":
			crolling.area += ",H0400110";
			Mainpage.Filtering[Mainpage.index].setText("문현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현2동":
			crolling.area += ",H0400120";
			Mainpage.Filtering[Mainpage.index].setText("문현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현3동":
			crolling.area += ",H0400130";
			Mainpage.Filtering[Mainpage.index].setText("문현3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문현4동":
			crolling.area += ",H0400140";
			Mainpage.Filtering[Mainpage.index].setText("문현4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담동":
			crolling.area += ",H0400160";
			Mainpage.Filtering[Mainpage.index].setText("용담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호동":
			crolling.area += ",H0400210";
			Mainpage.Filtering[Mainpage.index].setText("용호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호1동":
			crolling.area += ",H0400170";
			Mainpage.Filtering[Mainpage.index].setText("용호1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호2동":
			crolling.area += ",H0400180";
			Mainpage.Filtering[Mainpage.index].setText("용호2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호3동":
			crolling.area += ",H0400190";
			Mainpage.Filtering[Mainpage.index].setText("용호3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호4동":
			crolling.area += ",H0400200";
			Mainpage.Filtering[Mainpage.index].setText("용호4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암동":
			crolling.area += ",H0400240";
			Mainpage.Filtering[Mainpage.index].setText("우암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암1동":
			crolling.area += ",H0400220";
			Mainpage.Filtering[Mainpage.index].setText("우암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암2동":
			crolling.area += ",H0400230";
			Mainpage.Filtering[Mainpage.index].setText("우암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일동":
			crolling.area += ",H0500060";
			Mainpage.Filtering[Mainpage.index].setText("범일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일1동":
			crolling.area += ",H0500010";
			Mainpage.Filtering[Mainpage.index].setText("범일1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일2동":
			crolling.area += ",H0500020";
			Mainpage.Filtering[Mainpage.index].setText("범일2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일4동":
			crolling.area += ",H0500030";
			Mainpage.Filtering[Mainpage.index].setText("범일4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범일5동":
			crolling.area += ",H0500040";
			Mainpage.Filtering[Mainpage.index].setText("범일5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정동":
			crolling.area += ",H0500120";
			Mainpage.Filtering[Mainpage.index].setText("수정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정1동":
			crolling.area += ",H0500070";
			Mainpage.Filtering[Mainpage.index].setText("수정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정2동":
			crolling.area += ",H0500080";
			Mainpage.Filtering[Mainpage.index].setText("수정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정4동":
			crolling.area += ",H0500100";
			Mainpage.Filtering[Mainpage.index].setText("수정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정5동":
			crolling.area += ",H0500110";
			Mainpage.Filtering[Mainpage.index].setText("수정5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌천동":
			crolling.area += ",H0500150";
			Mainpage.Filtering[Mainpage.index].setText("좌천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌천1동":
			crolling.area += ",H0500130";
			Mainpage.Filtering[Mainpage.index].setText("좌천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌천4동":
			crolling.area += ",H0500140";
			Mainpage.Filtering[Mainpage.index].setText("좌천4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량동":
			crolling.area += ",H0500210";
			Mainpage.Filtering[Mainpage.index].setText("초량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량1동":
			crolling.area += ",H0500160";
			Mainpage.Filtering[Mainpage.index].setText("초량1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량2동":
			crolling.area += ",H0500170";
			Mainpage.Filtering[Mainpage.index].setText("초량2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량3동":
			crolling.area += ",H0500180";
			Mainpage.Filtering[Mainpage.index].setText("초량3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초량6동":
			crolling.area += ",H0500200";
			Mainpage.Filtering[Mainpage.index].setText("초량6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙민동":
			crolling.area += ",H0600010";
			Mainpage.Filtering[Mainpage.index].setText("낙민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",H0600040";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명장동":
			crolling.area += ",H0600070";
			Mainpage.Filtering[Mainpage.index].setText("명장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명장1동":
			crolling.area += ",H0600050";
			Mainpage.Filtering[Mainpage.index].setText("명장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명장2동":
			crolling.area += ",H0600060";
			Mainpage.Filtering[Mainpage.index].setText("명장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복천동":
			crolling.area += ",H0600080";
			Mainpage.Filtering[Mainpage.index].setText("복천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",H0600120";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직1동":
			crolling.area += ",H0600090";
			Mainpage.Filtering[Mainpage.index].setText("사직1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직2동":
			crolling.area += ",H0600100";
			Mainpage.Filtering[Mainpage.index].setText("사직2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직3동":
			crolling.area += ",H0600110";
			Mainpage.Filtering[Mainpage.index].setText("사직3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수안동":
			crolling.area += ",H0600130";
			Mainpage.Filtering[Mainpage.index].setText("수안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안락동":
			crolling.area += ",H0600160";
			Mainpage.Filtering[Mainpage.index].setText("안락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안락1동":
			crolling.area += ",H0600140";
			Mainpage.Filtering[Mainpage.index].setText("안락1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안락2동":
			crolling.area += ",H0600150";
			Mainpage.Filtering[Mainpage.index].setText("안락2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천동":
			crolling.area += ",H0600200";
			Mainpage.Filtering[Mainpage.index].setText("온천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천1동":
			crolling.area += ",H0600170";
			Mainpage.Filtering[Mainpage.index].setText("온천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천2동":
			crolling.area += ",H0600180";
			Mainpage.Filtering[Mainpage.index].setText("온천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천3동":
			crolling.area += ",H0600190";
			Mainpage.Filtering[Mainpage.index].setText("온천3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠산동":
			crolling.area += ",H0600210";
			Mainpage.Filtering[Mainpage.index].setText("칠산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야동":
			crolling.area += ",H0700040";
			Mainpage.Filtering[Mainpage.index].setText("가야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야1동":
			crolling.area += ",H0700010";
			Mainpage.Filtering[Mainpage.index].setText("가야1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야2동":
			crolling.area += ",H0700020";
			Mainpage.Filtering[Mainpage.index].setText("가야2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금동":
			crolling.area += ",H0700080";
			Mainpage.Filtering[Mainpage.index].setText("개금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금1동":
			crolling.area += ",H0700050";
			Mainpage.Filtering[Mainpage.index].setText("개금1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금2동":
			crolling.area += ",H0700060";
			Mainpage.Filtering[Mainpage.index].setText("개금2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개금3동":
			crolling.area += ",H0700070";
			Mainpage.Filtering[Mainpage.index].setText("개금3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감동":
			crolling.area += ",H0700130";
			Mainpage.Filtering[Mainpage.index].setText("당감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감1동":
			crolling.area += ",H0700090";
			Mainpage.Filtering[Mainpage.index].setText("당감1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감2동":
			crolling.area += ",H0700100";
			Mainpage.Filtering[Mainpage.index].setText("당감2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당감4동":
			crolling.area += ",H0700120";
			Mainpage.Filtering[Mainpage.index].setText("당감4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범전동":
			crolling.area += ",H0700140";
			Mainpage.Filtering[Mainpage.index].setText("범전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천동":
			crolling.area += ",H0700180";
			Mainpage.Filtering[Mainpage.index].setText("범천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천1동":
			crolling.area += ",H0700150";
			Mainpage.Filtering[Mainpage.index].setText("범천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천2동":
			crolling.area += ",H0700160";
			Mainpage.Filtering[Mainpage.index].setText("범천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범천4동":
			crolling.area += ",H0700170";
			Mainpage.Filtering[Mainpage.index].setText("범천4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암동":
			crolling.area += ",H0700210";
			Mainpage.Filtering[Mainpage.index].setText("부암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암1동":
			crolling.area += ",H0700190";
			Mainpage.Filtering[Mainpage.index].setText("부암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암3동":
			crolling.area += ",H0700200";
			Mainpage.Filtering[Mainpage.index].setText("부암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전동":
			crolling.area += ",H0700240";
			Mainpage.Filtering[Mainpage.index].setText("부전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전1동":
			crolling.area += ",H0700220";
			Mainpage.Filtering[Mainpage.index].setText("부전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전2동":
			crolling.area += ",H0700230";
			Mainpage.Filtering[Mainpage.index].setText("부전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정동":
			crolling.area += ",H0700270";
			Mainpage.Filtering[Mainpage.index].setText("양정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정1동":
			crolling.area += ",H0700250";
			Mainpage.Filtering[Mainpage.index].setText("양정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정2동":
			crolling.area += ",H0700260";
			Mainpage.Filtering[Mainpage.index].setText("양정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			crolling.area += ",H0700280";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포동":
			crolling.area += ",H0700320";
			Mainpage.Filtering[Mainpage.index].setText("전포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포1동":
			crolling.area += ",H0700290";
			Mainpage.Filtering[Mainpage.index].setText("전포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포2동":
			crolling.area += ",H0700300";
			Mainpage.Filtering[Mainpage.index].setText("전포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전포3동":
			crolling.area += ",H0700310";
			Mainpage.Filtering[Mainpage.index].setText("전포3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초읍동":
			crolling.area += ",H0700330";
			Mainpage.Filtering[Mainpage.index].setText("초읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포동":
			crolling.area += ",H0800040";
			Mainpage.Filtering[Mainpage.index].setText("구포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포1동":
			crolling.area += ",H0800010";
			Mainpage.Filtering[Mainpage.index].setText("구포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포2동":
			crolling.area += ",H0800020";
			Mainpage.Filtering[Mainpage.index].setText("구포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포3동":
			crolling.area += ",H0800030";
			Mainpage.Filtering[Mainpage.index].setText("구포3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",H0800050";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천동":
			crolling.area += ",H0800090";
			Mainpage.Filtering[Mainpage.index].setText("덕천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천1동":
			crolling.area += ",H0800060";
			Mainpage.Filtering[Mainpage.index].setText("덕천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천2동":
			crolling.area += "H0800070";
			Mainpage.Filtering[Mainpage.index].setText("덕천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천3동":
			crolling.area += ",H0800080";
			Mainpage.Filtering[Mainpage.index].setText("덕천3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕동":
			crolling.area += ",H0800130";
			Mainpage.Filtering[Mainpage.index].setText("만덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕1동":
			crolling.area += ",H0800100";
			Mainpage.Filtering[Mainpage.index].setText("만덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕2동":
			crolling.area += ",H0800110";
			Mainpage.Filtering[Mainpage.index].setText("만덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만덕3동":
			crolling.area += ",H0800120";
			Mainpage.Filtering[Mainpage.index].setText("만덕3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명동":
			crolling.area += ",H0800170";
			Mainpage.Filtering[Mainpage.index].setText("화명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명1동":
			crolling.area += ",H0800140";
			Mainpage.Filtering[Mainpage.index].setText("화명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명2동":
			crolling.area += ",H0800150";
			Mainpage.Filtering[Mainpage.index].setText("화명2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화명3동":
			crolling.area += ",H0800160";
			Mainpage.Filtering[Mainpage.index].setText("화명3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감전동":
			crolling.area += ",H0900030";
			Mainpage.Filtering[Mainpage.index].setText("감전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괘법동":
			crolling.area += ",H0900040";
			Mainpage.Filtering[Mainpage.index].setText("감전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포동":
			crolling.area += ",H0900070";
			Mainpage.Filtering[Mainpage.index].setText("덕포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포1동":
			crolling.area += ",H0900050";
			Mainpage.Filtering[Mainpage.index].setText("덕포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포2동":
			crolling.area += ",H0900060";
			Mainpage.Filtering[Mainpage.index].setText("덕포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모라동":
			crolling.area += ",H0900110";
			Mainpage.Filtering[Mainpage.index].setText("모라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모라1동":
			crolling.area += ",H0900080";
			Mainpage.Filtering[Mainpage.index].setText("모라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모라3동":
			crolling.area += ",H0900100";
			Mainpage.Filtering[Mainpage.index].setText("모라3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼락동":
			crolling.area += ",H0900120";
			Mainpage.Filtering[Mainpage.index].setText("삼락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄궁동":
			crolling.area += ",H0900130";
			Mainpage.Filtering[Mainpage.index].setText("엄궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례동":
			crolling.area += ",H0900170";
			Mainpage.Filtering[Mainpage.index].setText("주례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례1동":
			crolling.area += ",H0900140";
			Mainpage.Filtering[Mainpage.index].setText("주례1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례2동":
			crolling.area += ",H0900150";
			Mainpage.Filtering[Mainpage.index].setText("주례2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주례3동":
			crolling.area += ",H0900160";
			Mainpage.Filtering[Mainpage.index].setText("주례3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학장동":
			crolling.area += ",H0900180";
			Mainpage.Filtering[Mainpage.index].setText("학장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천동":
			crolling.area += ",H1000030";
			Mainpage.Filtering[Mainpage.index].setText("감천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천1동":
			crolling.area += ",H1000010";
			Mainpage.Filtering[Mainpage.index].setText("감천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천2동":
			crolling.area += ",H1000020";
			Mainpage.Filtering[Mainpage.index].setText("감천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정동":
			crolling.area += ",H1000080";
			Mainpage.Filtering[Mainpage.index].setText("괴정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정1동":
			crolling.area += ",H1000040";
			Mainpage.Filtering[Mainpage.index].setText("괴정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정2동":
			crolling.area += ",H1000050";
			Mainpage.Filtering[Mainpage.index].setText("괴정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정3동":
			crolling.area += ",H1000060";
			Mainpage.Filtering[Mainpage.index].setText("괴정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정4동":
			crolling.area += ",H1000070";
			Mainpage.Filtering[Mainpage.index].setText("괴정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구평동":
			crolling.area += ",H1000090";
			Mainpage.Filtering[Mainpage.index].setText("구평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다대동":
			crolling.area += ",H1000120";
			Mainpage.Filtering[Mainpage.index].setText("다대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다대1동":
			crolling.area += ",H1000100";
			Mainpage.Filtering[Mainpage.index].setText("다대1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다대2동":
			crolling.area += ",H1000110";
			Mainpage.Filtering[Mainpage.index].setText("다대2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당리동":
			crolling.area += ",H1000130";
			Mainpage.Filtering[Mainpage.index].setText("당리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			crolling.area += ",H1000160";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평1동":
			crolling.area += ",H1000140";
			Mainpage.Filtering[Mainpage.index].setText("신평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평2동":
			crolling.area += ",H1000150";
			Mainpage.Filtering[Mainpage.index].setText("신평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장림동":
			crolling.area += ",H1000190";
			Mainpage.Filtering[Mainpage.index].setText("장림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장림1동":
			crolling.area += ",H1000170";
			Mainpage.Filtering[Mainpage.index].setText("장림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장림2동":
			crolling.area += ",H1000180";
			Mainpage.Filtering[Mainpage.index].setText("장림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하단동":
			crolling.area += ",H1000220";
			Mainpage.Filtering[Mainpage.index].setText("하단동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하단1동":
			crolling.area += ",H1000200";
			Mainpage.Filtering[Mainpage.index].setText("하단1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하단2동":
			crolling.area += ",H1000210";
			Mainpage.Filtering[Mainpage.index].setText("하단2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부민동":
			crolling.area += ",H1100040";
			Mainpage.Filtering[Mainpage.index].setText("남부민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부민1동":
			crolling.area += ",H1100010";
			Mainpage.Filtering[Mainpage.index].setText("남부민1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부민2동":
			crolling.area += ",H1100020";
			Mainpage.Filtering[Mainpage.index].setText("남부민2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대신동1가":
			crolling.area += ",H1100060";
			Mainpage.Filtering[Mainpage.index].setText("동대신동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대신동2가":
			crolling.area += ",H1100070";
			Mainpage.Filtering[Mainpage.index].setText("동대신동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대신동3가":
			crolling.area += ",H1100080";
			Mainpage.Filtering[Mainpage.index].setText("동대신동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동":
			crolling.area += ",H1100090";
			Mainpage.Filtering[Mainpage.index].setText("부민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동1가":
			crolling.area += ",H1100100";
			Mainpage.Filtering[Mainpage.index].setText("부민동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동2가":
			crolling.area += ",H1100110";
			Mainpage.Filtering[Mainpage.index].setText("부민동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부민동3가":
			crolling.area += ",H1100120";
			Mainpage.Filtering[Mainpage.index].setText("부민동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부용동1가":
			crolling.area += ",H1100140";
			Mainpage.Filtering[Mainpage.index].setText("부용동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부용동2가":
			crolling.area += ",H1100150";
			Mainpage.Filtering[Mainpage.index].setText("부용동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서대신동1가":
			crolling.area += ",H1100170";
			Mainpage.Filtering[Mainpage.index].setText("서대신동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서대신동2가":
			crolling.area += ",H1100180";
			Mainpage.Filtering[Mainpage.index].setText("서대신동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서대신동3가":
			crolling.area += ",H1100190";
			Mainpage.Filtering[Mainpage.index].setText("서대신동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아미동":
			crolling.area += ",H1100200";
			Mainpage.Filtering[Mainpage.index].setText("아미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아미동1가":
			crolling.area += ",H1100210";
			Mainpage.Filtering[Mainpage.index].setText("아미동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아미동2가":
			crolling.area += ",H1100220";
			Mainpage.Filtering[Mainpage.index].setText("아미동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암남동":
			crolling.area += ",H1100230";
			Mainpage.Filtering[Mainpage.index].setText("암남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초장동":
			crolling.area += ",H1100240";
			Mainpage.Filtering[Mainpage.index].setText("초장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동":
			crolling.area += ",H1100250";
			Mainpage.Filtering[Mainpage.index].setText("충무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충모동1가":
			crolling.area += ",H1100260";
			Mainpage.Filtering[Mainpage.index].setText("충모동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동2가":
			crolling.area += ",H1100270";
			Mainpage.Filtering[Mainpage.index].setText("충무동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동3가":
			crolling.area += ",H1100280";
			Mainpage.Filtering[Mainpage.index].setText("충무동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동1가":
			crolling.area += ",H1100300";
			Mainpage.Filtering[Mainpage.index].setText("토성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동2가":
			crolling.area += ",H1100310";
			Mainpage.Filtering[Mainpage.index].setText("토성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동3가":
			crolling.area += ",H1100320";
			Mainpage.Filtering[Mainpage.index].setText("토성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동4가":
			crolling.area += ",H1100330";
			Mainpage.Filtering[Mainpage.index].setText("토성동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성동5가":
			crolling.area += ",H1100340";
			Mainpage.Filtering[Mainpage.index].setText("토성동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안동":
			crolling.area += ",H1200050";
			Mainpage.Filtering[Mainpage.index].setText("광안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안1동":
			crolling.area += ",H1200010";
			Mainpage.Filtering[Mainpage.index].setText("광안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안2동":
			crolling.area += ",H1200020";
			Mainpage.Filtering[Mainpage.index].setText("광안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안3동":
			crolling.area += ",H1200030";
			Mainpage.Filtering[Mainpage.index].setText("광안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광안4동":
			crolling.area += ",H1200040";
			Mainpage.Filtering[Mainpage.index].setText("광안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천동":
			crolling.area += ",H1200080";
			Mainpage.Filtering[Mainpage.index].setText("남천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천1동":
			crolling.area += ",H1200060";
			Mainpage.Filtering[Mainpage.index].setText("남천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천2동":
			crolling.area += ",H1200070";
			Mainpage.Filtering[Mainpage.index].setText("남천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망미동":
			crolling.area += ",H1200110";
			Mainpage.Filtering[Mainpage.index].setText("망미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망미1동":
			crolling.area += ",H1200090";
			Mainpage.Filtering[Mainpage.index].setText("망미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망미2동":
			crolling.area += ",H1200100";
			Mainpage.Filtering[Mainpage.index].setText("수영구망미2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "민락동":
			crolling.area += ",H1200120";
			Mainpage.Filtering[Mainpage.index].setText("민락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수영동":
			crolling.area += ",H1200130";
			Mainpage.Filtering[Mainpage.index].setText("수영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제동":
			crolling.area += ",H1300050";
			Mainpage.Filtering[Mainpage.index].setText("거제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제1동":
			crolling.area += ",H1300010";
			Mainpage.Filtering[Mainpage.index].setText("거제1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제2동":
			crolling.area += ",H1300020";
			Mainpage.Filtering[Mainpage.index].setText("거제2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제3동":
			crolling.area += ",H1300030";
			Mainpage.Filtering[Mainpage.index].setText("거제3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거제4동":
			crolling.area += ",H1300040";
			Mainpage.Filtering[Mainpage.index].setText("거제4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산동":
			crolling.area += ",H1300150";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산1동":
			crolling.area += ",H1300060";
			Mainpage.Filtering[Mainpage.index].setText("연산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산2동":
			crolling.area += ",H1300070";
			Mainpage.Filtering[Mainpage.index].setText("연산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산3동":
			crolling.area += ",H1300080";
			Mainpage.Filtering[Mainpage.index].setText("연산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산4동":
			crolling.area += ",H1300090";
			Mainpage.Filtering[Mainpage.index].setText("연산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산5동":
			crolling.area += ",H1300100";
			Mainpage.Filtering[Mainpage.index].setText("연산5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산6동":
			crolling.area += ",H1300110";
			Mainpage.Filtering[Mainpage.index].setText("연산6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산8동":
			crolling.area += ",H1300130";
			Mainpage.Filtering[Mainpage.index].setText("연산8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산9동":
			crolling.area += ",H1300140";
			Mainpage.Filtering[Mainpage.index].setText("연산9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남항동":
			crolling.area += ",H1400010";
			Mainpage.Filtering[Mainpage.index].setText("남항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남항동1가":
			crolling.area += ",H1400020";
			Mainpage.Filtering[Mainpage.index].setText("남항동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남향동2가":
			crolling.area += ",H1400030";
			Mainpage.Filtering[Mainpage.index].setText("남향동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남향동3가":
			crolling.area += ",H1400040";
			Mainpage.Filtering[Mainpage.index].setText("남향동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대교동1가":
			crolling.area += ",H1400060";
			Mainpage.Filtering[Mainpage.index].setText("대교동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대교동2가":
			crolling.area += ",H1400070";
			Mainpage.Filtering[Mainpage.index].setText("대교동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평동1가":
			crolling.area += ",H1400090";
			Mainpage.Filtering[Mainpage.index].setText("대평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평동2가":
			crolling.area += ",H1400100";
			Mainpage.Filtering[Mainpage.index].setText("대평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼동":
			crolling.area += ",H1400140";
			Mainpage.Filtering[Mainpage.index].setText("동삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼1동":
			crolling.area += ",H1400110";
			Mainpage.Filtering[Mainpage.index].setText("동삼1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼2동":
			crolling.area += ",H1400120";
			Mainpage.Filtering[Mainpage.index].setText("동삼2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삼3동":
			crolling.area += ",H1400130";
			Mainpage.Filtering[Mainpage.index].setText("동삼3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동1가":
			crolling.area += ",H1400160";
			Mainpage.Filtering[Mainpage.index].setText("봉래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동2가":
			crolling.area += ",H1400170";
			Mainpage.Filtering[Mainpage.index].setText("봉래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동3가":
			crolling.area += ",H1400180";
			Mainpage.Filtering[Mainpage.index].setText("봉래동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동4가":
			crolling.area += ",H1400190";
			Mainpage.Filtering[Mainpage.index].setText("봉래동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동5가":
			crolling.area += ",H1400200";
			Mainpage.Filtering[Mainpage.index].setText("봉래동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신선동":
			crolling.area += ",H1400210";
			Mainpage.Filtering[Mainpage.index].setText("신선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신선동1가":
			crolling.area += ",H1400220";
			Mainpage.Filtering[Mainpage.index].setText("신선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신성동2가":
			crolling.area += ",H1400230";
			Mainpage.Filtering[Mainpage.index].setText("신성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신선동3가":
			crolling.area += ",H1400240";
			Mainpage.Filtering[Mainpage.index].setText("신선동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동1가":
			crolling.area += ",H1400260";
			Mainpage.Filtering[Mainpage.index].setText("영선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동2가":
			crolling.area += ",H1400270";
			Mainpage.Filtering[Mainpage.index].setText("영선동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동3가":
			crolling.area += ",H1400280";
			Mainpage.Filtering[Mainpage.index].setText("영선동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영선동4가":
			crolling.area += ",H1400290";
			Mainpage.Filtering[Mainpage.index].setText("영선동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			crolling.area += ",H1400320";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학1동":
			crolling.area += ",H1400300";
			Mainpage.Filtering[Mainpage.index].setText("청학1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학2동":
			crolling.area += ",H1400310";
			Mainpage.Filtering[Mainpage.index].setText("청학2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동":
			crolling.area += ",H1500010";
			Mainpage.Filtering[Mainpage.index].setText("광복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동1가":
			crolling.area += ",H1500020";
			Mainpage.Filtering[Mainpage.index].setText("광복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동2가":
			crolling.area += ",H1500030";
			Mainpage.Filtering[Mainpage.index].setText("광복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광복동3가":
			crolling.area += ",H1500040";
			Mainpage.Filtering[Mainpage.index].setText("광복동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동":
			crolling.area += ",H1500050";
			Mainpage.Filtering[Mainpage.index].setText("남포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동1가":
			crolling.area += ",H1500060";
			Mainpage.Filtering[Mainpage.index].setText("남포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동2가":
			crolling.area += ",H1500070";
			Mainpage.Filtering[Mainpage.index].setText("남포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동3가":
			crolling.area += ",H1500080";
			Mainpage.Filtering[Mainpage.index].setText("남포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동4가":
			crolling.area += ",H1500090";
			Mainpage.Filtering[Mainpage.index].setText("남포동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동5가":
			crolling.area += ",H1500100";
			Mainpage.Filtering[Mainpage.index].setText("남포동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동6가":
			crolling.area += ",H1500110";
			Mainpage.Filtering[Mainpage.index].setText("남포동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창동1가":
			crolling.area += ",H15000130";
			Mainpage.Filtering[Mainpage.index].setText("대창동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창동2가":
			crolling.area += ",H1500140";
			Mainpage.Filtering[Mainpage.index].setText("대창동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동":
			crolling.area += ",H1500150";
			Mainpage.Filtering[Mainpage.index].setText("대청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동1가":
			crolling.area += ",H1500160";
			Mainpage.Filtering[Mainpage.index].setText("대청동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동2가":
			crolling.area += ",H1500170";
			Mainpage.Filtering[Mainpage.index].setText("대청동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동3가":
			crolling.area += ",H1500180";
			Mainpage.Filtering[Mainpage.index].setText("대청동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동4가":
			crolling.area += ",H1500190";
			Mainpage.Filtering[Mainpage.index].setText("대청동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동":
			crolling.area += ",H1500200";
			Mainpage.Filtering[Mainpage.index].setText("동광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동1가":
			crolling.area += ",H1500210";
			Mainpage.Filtering[Mainpage.index].setText("동광동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동2가":
			crolling.area += ",H1500220";
			Mainpage.Filtering[Mainpage.index].setText("동광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동3가":
			crolling.area += ",H1500230";
			Mainpage.Filtering[Mainpage.index].setText("동광동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동4가":
			crolling.area += ",H1500240";
			Mainpage.Filtering[Mainpage.index].setText("동광동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동광동5가":
			crolling.area += ",H1500250";
			Mainpage.Filtering[Mainpage.index].setText("동광동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동":
			crolling.area += ",H1500260";
			Mainpage.Filtering[Mainpage.index].setText("보수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동1가":
			crolling.area += ",H1500270";
			Mainpage.Filtering[Mainpage.index].setText("보수동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동2가":
			crolling.area += ",H1500280";
			Mainpage.Filtering[Mainpage.index].setText("보수동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보수동3가":
			crolling.area += ",H1500290";
			Mainpage.Filtering[Mainpage.index].setText("보수동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동":
			crolling.area += ",H1500300";
			Mainpage.Filtering[Mainpage.index].setText("부평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동1가":
			crolling.area += ",H1500310";
			Mainpage.Filtering[Mainpage.index].setText("부평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동2가":
			crolling.area += ",H1500320";
			Mainpage.Filtering[Mainpage.index].setText("부평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동3가":
			crolling.area += ",H1500330";
			Mainpage.Filtering[Mainpage.index].setText("부평동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동4가":
			crolling.area += ",H1500340";
			Mainpage.Filtering[Mainpage.index].setText("부평동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동1가":
			crolling.area += ",H1500360";
			Mainpage.Filtering[Mainpage.index].setText("신창동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동2가":
			crolling.area += ",H1500370";
			Mainpage.Filtering[Mainpage.index].setText("신창동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동3가":
			crolling.area += ",H1500380";
			Mainpage.Filtering[Mainpage.index].setText("신창동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동4가":
			crolling.area += ",H1500390";
			Mainpage.Filtering[Mainpage.index].setText("신창동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주동":
			crolling.area += ",H1500420";
			Mainpage.Filtering[Mainpage.index].setText("영주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주1동":
			crolling.area += ",H1500400";
			Mainpage.Filtering[Mainpage.index].setText("영주1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주2동":
			crolling.area += ",H1500410";
			Mainpage.Filtering[Mainpage.index].setText("영주2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",H1500430";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			crolling.area += ",H1500440";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			crolling.area += ",H1500450";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			crolling.area += ",H1500460";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동4가":
			crolling.area += ",H1500470";
			Mainpage.Filtering[Mainpage.index].setText("중앙동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동5가":
			crolling.area += ",H1500480";
			Mainpage.Filtering[Mainpage.index].setText("중앙동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동6가":
			crolling.area += ",H1500490";
			Mainpage.Filtering[Mainpage.index].setText("중앙동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동7가":
			crolling.area += ",H1500500";
			Mainpage.Filtering[Mainpage.index].setText("중앙동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선동1가":
			crolling.area += ",H1500520";
			Mainpage.Filtering[Mainpage.index].setText("창선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선동2가":
			crolling.area += ",H1500530";
			Mainpage.Filtering[Mainpage.index].setText("창선동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송동":
			crolling.area += ",H1600040";
			Mainpage.Filtering[Mainpage.index].setText("반송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송1동":
			crolling.area += ",H1600010";
			Mainpage.Filtering[Mainpage.index].setText("반송1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송2동":
			crolling.area += ",H1600020";
			Mainpage.Filtering[Mainpage.index].setText("반송2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송3동":
			crolling.area += ",H1600030";
			Mainpage.Filtering[Mainpage.index].setText("반송3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여동":
			crolling.area += ",H1600090";
			Mainpage.Filtering[Mainpage.index].setText("반여동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여1동":
			crolling.area += ",H1600050";
			Mainpage.Filtering[Mainpage.index].setText("반여1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여2동":
			crolling.area += ",H1600060";
			Mainpage.Filtering[Mainpage.index].setText("반여2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여3동":
			crolling.area += ",H1600070";
			Mainpage.Filtering[Mainpage.index].setText("반여3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반여4동":
			crolling.area += ",H1600080";
			Mainpage.Filtering[Mainpage.index].setText("반여4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석대동":
			crolling.area += ",H1600100";
			Mainpage.Filtering[Mainpage.index].setText("석대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해운대구송정동":
			crolling.area += ",H1600110";
			Mainpage.Filtering[Mainpage.index].setText("해운대구송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우동":
			crolling.area += ",H1600140";
			Mainpage.Filtering[Mainpage.index].setText("우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우1동":
			crolling.area += ",H1600120";
			Mainpage.Filtering[Mainpage.index].setText("우1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우2동":
			crolling.area += ",H1600130";
			Mainpage.Filtering[Mainpage.index].setText("우2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우3동":
			crolling.area += ",H1600260";
			Mainpage.Filtering[Mainpage.index].setText("우3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재송동":
			crolling.area += ",H1600170";
			Mainpage.Filtering[Mainpage.index].setText("재송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재송1동":
			crolling.area += ",H1600150";
			Mainpage.Filtering[Mainpage.index].setText("재송1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재송2동":
			crolling.area += ",H1600160";
			Mainpage.Filtering[Mainpage.index].setText("재송2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌동":
			crolling.area += ",H1600220";
			Mainpage.Filtering[Mainpage.index].setText("좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌1동":
			crolling.area += ",H1600180";
			Mainpage.Filtering[Mainpage.index].setText("좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌2동":
			crolling.area += ",H1600190";
			Mainpage.Filtering[Mainpage.index].setText("좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌3동":
			crolling.area += ",H1600200";
			Mainpage.Filtering[Mainpage.index].setText("좌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌4동":
			crolling.area += ",H1600210";
			Mainpage.Filtering[Mainpage.index].setText("좌4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",H1600250";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중1동":
			crolling.area += ",H1600230";
			Mainpage.Filtering[Mainpage.index].setText("중1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중2동":
			crolling.area += ",H1600240";
			Mainpage.Filtering[Mainpage.index].setText("중2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
