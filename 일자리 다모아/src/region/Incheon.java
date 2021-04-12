package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;

public class Incheon {
	public boolean flag;

	public void IncheonCity(ActionEvent e) {
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
		case "강화읍":
			crolling.area += "K0100010";
			Mainpage.Filtering[Mainpage.index].setText("강화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동면":
			crolling.area += ",K0100020";
			Mainpage.Filtering[Mainpage.index].setText("교동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길상면":
			crolling.area += ",K0100030";
			Mainpage.Filtering[Mainpage.index].setText("길상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내가면":
			crolling.area += "K0100040";
			Mainpage.Filtering[Mainpage.index].setText("내가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불은면":
			crolling.area += ",K0100050";
			Mainpage.Filtering[Mainpage.index].setText("불은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산면":
			crolling.area += ",K0100060";
			Mainpage.Filtering[Mainpage.index].setText("삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서도면":
			crolling.area += ",K0100070";
			Mainpage.Filtering[Mainpage.index].setText("서도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선원면":
			crolling.area += ",K0100080";
			Mainpage.Filtering[Mainpage.index].setText("선원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송해면":
			crolling.area += ",K0100090";
			Mainpage.Filtering[Mainpage.index].setText("송해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양도면":
			crolling.area += ",K0100100";
			Mainpage.Filtering[Mainpage.index].setText("양도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양사면":
			crolling.area += ",K0100110";
			Mainpage.Filtering[Mainpage.index].setText("양사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하점면":
			crolling.area += ",K0100120";
			Mainpage.Filtering[Mainpage.index].setText("하점면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화도면":
			crolling.area += ",K0100130";
			Mainpage.Filtering[Mainpage.index].setText("화도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			crolling.area += ",K0200010";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산동":
			crolling.area += ",K0200060";
			Mainpage.Filtering[Mainpage.index].setText("계산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산1동":
			crolling.area += ",K0200020";
			Mainpage.Filtering[Mainpage.index].setText("계산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산2동":
			crolling.area += ",K0200030";
			Mainpage.Filtering[Mainpage.index].setText("계산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산3동":
			crolling.area += ",K0200040";
			Mainpage.Filtering[Mainpage.index].setText("계산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산4동":
			crolling.area += ",K0200050";
			Mainpage.Filtering[Mainpage.index].setText("계산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귤현동":
			crolling.area += ",K0200070";
			Mainpage.Filtering[Mainpage.index].setText("귤현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노오지동":
			crolling.area += ",K0200080";
			Mainpage.Filtering[Mainpage.index].setText("노오지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다남동":
			crolling.area += ",K0200090";
			Mainpage.Filtering[Mainpage.index].setText("다남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동양동":
			crolling.area += ",K0200100";
			Mainpage.Filtering[Mainpage.index].setText("동양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둑실동":
			crolling.area += ",K0200110";
			Mainpage.Filtering[Mainpage.index].setText("둑실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목상동":
			crolling.area += ",K0200120";
			Mainpage.Filtering[Mainpage.index].setText("목상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박촌동":
			crolling.area += ",K0200130";
			Mainpage.Filtering[Mainpage.index].setText("박촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방축동":
			crolling.area += ",K0200140";
			Mainpage.Filtering[Mainpage.index].setText("방축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병방동":
			crolling.area += ",K0200150";
			Mainpage.Filtering[Mainpage.index].setText("병방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상야동":
			crolling.area += ",K0200160";
			Mainpage.Filtering[Mainpage.index].setText("상야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서운동":
			crolling.area += "K0200170";
			Mainpage.Filtering[Mainpage.index].setText("서운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선주지동":
			crolling.area += ",K0200180";
			Mainpage.Filtering[Mainpage.index].setText("선주지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류동":
			crolling.area += ",K0200190";
			Mainpage.Filtering[Mainpage.index].setText("오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용종동":
			crolling.area += ",K0200200";
			Mainpage.Filtering[Mainpage.index].setText("용종동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이화동":
			crolling.area += ",K0200210";
			Mainpage.Filtering[Mainpage.index].setText("이화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임학동":
			crolling.area += ",K0200220";
			Mainpage.Filtering[Mainpage.index].setText("임학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전동":
			crolling.area += ",K0200260";
			Mainpage.Filtering[Mainpage.index].setText("작전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전1동":
			crolling.area += ",K0200230";
			Mainpage.Filtering[Mainpage.index].setText("작전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전2동":
			crolling.area += ",K0200240";
			Mainpage.Filtering[Mainpage.index].setText("작전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전3동":
			crolling.area += ",K0200250";
			Mainpage.Filtering[Mainpage.index].setText("작전3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전서운동":
			crolling.area += ",K0200330";
			Mainpage.Filtering[Mainpage.index].setText("작전서운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기동":
			crolling.area += ",K0200270";
			Mainpage.Filtering[Mainpage.index].setText("장기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",K0200280";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하야동":
			crolling.area += ",K0200290";
			Mainpage.Filtering[Mainpage.index].setText("하야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효성동":
			crolling.area += ",K0200320";
			Mainpage.Filtering[Mainpage.index].setText("효성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효성1동":
			crolling.area += ",K0200300";
			Mainpage.Filtering[Mainpage.index].setText("효성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효성2동":
			crolling.area += ",K0200310";
			Mainpage.Filtering[Mainpage.index].setText("효성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석동":
			crolling.area += ",K0400050";
			Mainpage.Filtering[Mainpage.index].setText("간석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석1동":
			crolling.area += ",K0400010";
			Mainpage.Filtering[Mainpage.index].setText("간석1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석2동":
			crolling.area += ",K0400020";
			Mainpage.Filtering[Mainpage.index].setText("간석2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석3동":
			crolling.area += ",K0400030";
			Mainpage.Filtering[Mainpage.index].setText("간석3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석4동":
			crolling.area += ",K0400040";
			Mainpage.Filtering[Mainpage.index].setText("간석4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고잔동":
			crolling.area += ",K0400060";
			Mainpage.Filtering[Mainpage.index].setText("고잔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월동":
			crolling.area += ",K0400110";
			Mainpage.Filtering[Mainpage.index].setText("구월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월1동":
			crolling.area += ",K0400070";
			Mainpage.Filtering[Mainpage.index].setText("구월1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월2동":
			crolling.area += ",K0400080";
			Mainpage.Filtering[Mainpage.index].setText("구월2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월3동":
			crolling.area += ",K0400090";
			Mainpage.Filtering[Mainpage.index].setText("구월3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월4동":
			crolling.area += ",K0400100";
			Mainpage.Filtering[Mainpage.index].setText("구월4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남촌동":
			crolling.area += ",K0400120";
			Mainpage.Filtering[Mainpage.index].setText("남촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현동":
			crolling.area += ",K0400130";
			Mainpage.Filtering[Mainpage.index].setText("논현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도림동":
			crolling.area += ",K0400140";
			Mainpage.Filtering[Mainpage.index].setText("도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수동":
			crolling.area += ",K0400210";
			Mainpage.Filtering[Mainpage.index].setText("만수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수1동":
			crolling.area += ",K0400150";
			Mainpage.Filtering[Mainpage.index].setText("만수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수2동":
			crolling.area += ",K0400160";
			Mainpage.Filtering[Mainpage.index].setText("만수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수3동":
			crolling.area += ",K0400170";
			Mainpage.Filtering[Mainpage.index].setText("만수3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수4동":
			crolling.area += ",K0400180";
			Mainpage.Filtering[Mainpage.index].setText("만수4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수5동":
			crolling.area += ",K0400190";
			Mainpage.Filtering[Mainpage.index].setText("만수5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수6동":
			crolling.area += ",K0400200";
			Mainpage.Filtering[Mainpage.index].setText("만수6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서창동":
			crolling.area += ",K0400220";
			Mainpage.Filtering[Mainpage.index].setText("서창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수산동":
			crolling.area += ",K0400230";
			Mainpage.Filtering[Mainpage.index].setText("수산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운연동":
			crolling.area += ",K0400240";
			Mainpage.Filtering[Mainpage.index].setText("운연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장수동":
			crolling.area += ",K0400250";
			Mainpage.Filtering[Mainpage.index].setText("장수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",K0500010";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만석동":
			crolling.area += ",K0500020";
			Mainpage.Filtering[Mainpage.index].setText("만석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림동":
			crolling.area += "K0500090";
			Mainpage.Filtering[Mainpage.index].setText("송림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림1동":
			crolling.area += ",K0500030";
			Mainpage.Filtering[Mainpage.index].setText("송림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림2동":
			crolling.area += ",K0500040";
			Mainpage.Filtering[Mainpage.index].setText("송림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림3.5동":
			crolling.area += ",K0500050";
			Mainpage.Filtering[Mainpage.index].setText("송림3.5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림4동":
			crolling.area += ",K0500060";
			Mainpage.Filtering[Mainpage.index].setText("송림4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림6동":
			crolling.area += ",K0500080";
			Mainpage.Filtering[Mainpage.index].setText("송림6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			crolling.area += ",K0500130";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현1.2동":
			crolling.area += ",K0500100";
			Mainpage.Filtering[Mainpage.index].setText("송현1.2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현3동":
			crolling.area += ",K0500120";
			Mainpage.Filtering[Mainpage.index].setText("송현3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창영동":
			crolling.area += ",K0500140";
			Mainpage.Filtering[Mainpage.index].setText("창영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화수동":
			crolling.area += ",K0500170";
			Mainpage.Filtering[Mainpage.index].setText("화수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화수1동":
			crolling.area += ",K0500150";
			Mainpage.Filtering[Mainpage.index].setText("화수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화수2동":
			crolling.area += ",K0500160";
			Mainpage.Filtering[Mainpage.index].setText("화수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화평동":
			crolling.area += ",K0500180";
			Mainpage.Filtering[Mainpage.index].setText("화평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관교동":
			crolling.area += ",K0300010";
			Mainpage.Filtering[Mainpage.index].setText("관교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화동":
			crolling.area += ",K0300050";
			Mainpage.Filtering[Mainpage.index].setText("도화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화1동":
			crolling.area += ",K0300020";
			Mainpage.Filtering[Mainpage.index].setText("도화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화2동":
			crolling.area += ",K0300030";
			Mainpage.Filtering[Mainpage.index].setText("도화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화3동":
			crolling.area += ",K0300040";
			Mainpage.Filtering[Mainpage.index].setText("도화3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문학동":
			crolling.area += ",K0300060";
			Mainpage.Filtering[Mainpage.index].setText("문학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의동":
			crolling.area += ",K0300110";
			Mainpage.Filtering[Mainpage.index].setText("숭의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의1동":
			crolling.area += ",K0300070";
			Mainpage.Filtering[Mainpage.index].setText("숭의1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의2동":
			crolling.area += ",K0300080";
			Mainpage.Filtering[Mainpage.index].setText("숭의2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의3동":
			crolling.area += ",K0300090";
			Mainpage.Filtering[Mainpage.index].setText("숭의3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의4동":
			crolling.area += ",K0300100";
			Mainpage.Filtering[Mainpage.index].setText("숭의4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현동":
			crolling.area += ",K0300170";
			Mainpage.Filtering[Mainpage.index].setText("용현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현1동":
			crolling.area += ",K0300120";
			Mainpage.Filtering[Mainpage.index].setText("용현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현2동":
			crolling.area += ",K0300130";
			Mainpage.Filtering[Mainpage.index].setText("용현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현3동":
			crolling.area += ",K0300140";
			Mainpage.Filtering[Mainpage.index].setText("용현3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현4동":
			crolling.area += ",K0300150";
			Mainpage.Filtering[Mainpage.index].setText("용현4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현5동":
			crolling.area += ",K0300160";
			Mainpage.Filtering[Mainpage.index].setText("용현5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안동":
			crolling.area += ",K0300260";
			Mainpage.Filtering[Mainpage.index].setText("주안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안1동":
			crolling.area += ",K0300180";
			Mainpage.Filtering[Mainpage.index].setText("주안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안2동":
			crolling.area += ",K0300190";
			Mainpage.Filtering[Mainpage.index].setText("주안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안3동":
			crolling.area += ",K0300200";
			Mainpage.Filtering[Mainpage.index].setText("주안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안4동":
			crolling.area += ",K0300210";
			Mainpage.Filtering[Mainpage.index].setText("주안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안5동":
			crolling.area += ",K0300220";
			Mainpage.Filtering[Mainpage.index].setText("주안5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안6동":
			crolling.area += ",K0300230";
			Mainpage.Filtering[Mainpage.index].setText("주안6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안7동":
			crolling.area += ",K0300240";
			Mainpage.Filtering[Mainpage.index].setText("주안7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안8동":
			crolling.area += ",K0300250";
			Mainpage.Filtering[Mainpage.index].setText("주안8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학익동":
			crolling.area += ",K0300290";
			Mainpage.Filtering[Mainpage.index].setText("학익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학익1동":
			crolling.area += ",K0300270";
			Mainpage.Filtering[Mainpage.index].setText("학익1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학익2동":
			crolling.area += ",K0300280";
			Mainpage.Filtering[Mainpage.index].setText("학익2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			crolling.area += ",K0600030";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산1동":
			crolling.area += ",K0600010";
			Mainpage.Filtering[Mainpage.index].setText("갈산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산2동":
			crolling.area += ",K0600020";
			Mainpage.Filtering[Mainpage.index].setText("갈산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			crolling.area += ",K0600040";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개동":
			crolling.area += ",K0600080";
			Mainpage.Filtering[Mainpage.index].setText("부개동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개1동":
			crolling.area += ",K0600050";
			Mainpage.Filtering[Mainpage.index].setText("부개1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개2동":
			crolling.area += ",K0600060";
			Mainpage.Filtering[Mainpage.index].setText("부개2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개3동":
			crolling.area += ",K0600070";
			Mainpage.Filtering[Mainpage.index].setText("부개3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동":
			crolling.area += ",K0600150";
			Mainpage.Filtering[Mainpage.index].setText("부평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평1동":
			crolling.area += ",K0600090";
			Mainpage.Filtering[Mainpage.index].setText("부평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평2동":
			crolling.area += ",K0600100";
			Mainpage.Filtering[Mainpage.index].setText("부평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평3동":
			crolling.area += ",K0600110";
			Mainpage.Filtering[Mainpage.index].setText("부평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평4동":
			crolling.area += ",K0600120";
			Mainpage.Filtering[Mainpage.index].setText("부평4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평5동":
			crolling.area += ",K0600130";
			Mainpage.Filtering[Mainpage.index].setText("부평5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평6동":
			crolling.area += ",K0600140";
			Mainpage.Filtering[Mainpage.index].setText("부평6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			crolling.area += ",K0600200";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡1동":
			crolling.area += ",K0600160";
			Mainpage.Filtering[Mainpage.index].setText("산곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡2동":
			crolling.area += ",K0600170";
			Mainpage.Filtering[Mainpage.index].setText("산곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡3동":
			crolling.area += ",K0600180";
			Mainpage.Filtering[Mainpage.index].setText("산곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡4동":
			crolling.area += ",K0600190";
			Mainpage.Filtering[Mainpage.index].setText("산곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산동":
			crolling.area += ",K0600210";
			Mainpage.Filtering[Mainpage.index].setText("삼산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산1동":
			crolling.area += ",K0600205";
			Mainpage.Filtering[Mainpage.index].setText("삼산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산2동":
			crolling.area += ",K0600206";
			Mainpage.Filtering[Mainpage.index].setText("삼산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "십정동":
			crolling.area += ",K0600240";
			Mainpage.Filtering[Mainpage.index].setText("십정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "십정1동":
			crolling.area += ",K0600220";
			Mainpage.Filtering[Mainpage.index].setText("십정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "십정2동":
			crolling.area += ",K0600230";
			Mainpage.Filtering[Mainpage.index].setText("십정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일신동":
			crolling.area += ",K0600250";
			Mainpage.Filtering[Mainpage.index].setText("일신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천동":
			crolling.area += ",K0600280";
			Mainpage.Filtering[Mainpage.index].setText("청천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천1동":
			crolling.area += ",K0600260";
			Mainpage.Filtering[Mainpage.index].setText("청천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천2동":
			crolling.area += ",K0600270";
			Mainpage.Filtering[Mainpage.index].setText("청천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정동":
			crolling.area += ",K0700040";
			Mainpage.Filtering[Mainpage.index].setText("가정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정1동":
			crolling.area += ",K0700010";
			Mainpage.Filtering[Mainpage.index].setText("가정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정2동":
			crolling.area += ",K0700020";
			Mainpage.Filtering[Mainpage.index].setText("가정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정3동":
			crolling.area += ",K0700030";
			Mainpage.Filtering[Mainpage.index].setText("가정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌동":
			crolling.area += ",K0700090";
			Mainpage.Filtering[Mainpage.index].setText("가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌1동":
			crolling.area += ",K0700050";
			Mainpage.Filtering[Mainpage.index].setText("가좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌2동":
			crolling.area += ",K0700060";
			Mainpage.Filtering[Mainpage.index].setText("가좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌3동":
			crolling.area += ",K0700070";
			Mainpage.Filtering[Mainpage.index].setText("가좌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌4동":
			crolling.area += ",K0700080";
			Mainpage.Filtering[Mainpage.index].setText("가좌4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검암동":
			crolling.area += ",K0700100";
			Mainpage.Filtering[Mainpage.index].setText("검암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경서동":
			crolling.area += ",K0700110";
			Mainpage.Filtering[Mainpage.index].setText("경서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공촌동":
			crolling.area += ",K0700120";
			Mainpage.Filtering[Mainpage.index].setText("공촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인천서구금곡동":
			crolling.area += ",K0700130";
			Mainpage.Filtering[Mainpage.index].setText("인천서구금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당하동":
			crolling.area += ",K0700140";
			Mainpage.Filtering[Mainpage.index].setText("당하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곡동":
			crolling.area += ",K0700150";
			Mainpage.Filtering[Mainpage.index].setText("대곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마전동":
			crolling.area += ",K0700160";
			Mainpage.Filtering[Mainpage.index].setText("마전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석동":
			crolling.area += ",K0700170";
			Mainpage.Filtering[Mainpage.index].setText("백석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불로동":
			crolling.area += ",K0700180";
			Mainpage.Filtering[Mainpage.index].setText("불로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남동":
			crolling.area += ",K0700220";
			Mainpage.Filtering[Mainpage.index].setText("석남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남1동":
			crolling.area += ",K0700190";
			Mainpage.Filtering[Mainpage.index].setText("석남1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남2동":
			crolling.area += ",K0700200";
			Mainpage.Filtering[Mainpage.index].setText("석남2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남3동":
			crolling.area += ",K0700210";
			Mainpage.Filtering[Mainpage.index].setText("석남3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시천동":
			crolling.area += ",K0700230";
			Mainpage.Filtering[Mainpage.index].setText("시천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신현동":
			crolling.area += ",K0700240";
			Mainpage.Filtering[Mainpage.index].setText("신현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			crolling.area += ",K0700250";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연희동":
			crolling.area += ",K0700260";
			Mainpage.Filtering[Mainpage.index].setText("연희동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인천서구오류동":
			crolling.area += ",K0700270";
			Mainpage.Filtering[Mainpage.index].setText("인천서구오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕길동":
			crolling.area += ",K0700280";
			Mainpage.Filtering[Mainpage.index].setText("왕길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			crolling.area += ",K0700290";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원창동":
			crolling.area += ",K0700300";
			Mainpage.Filtering[Mainpage.index].setText("원창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라동":
			crolling.area += ",K0700310";
			Mainpage.Filtering[Mainpage.index].setText("청라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라1동":
			crolling.area += ",K0700320";
			Mainpage.Filtering[Mainpage.index].setText("청라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라2동":
			crolling.area += ",K0700330";
			Mainpage.Filtering[Mainpage.index].setText("청라2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라3동":
			crolling.area += ",K0700340";
			Mainpage.Filtering[Mainpage.index].setText("청라3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘동":
			crolling.area += ",K0800040";
			Mainpage.Filtering[Mainpage.index].setText("동춘동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘1동":
			crolling.area += ",K0800010";
			Mainpage.Filtering[Mainpage.index].setText("동춘1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘2동":
			crolling.area += ",K0800020";
			Mainpage.Filtering[Mainpage.index].setText("동춘2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘3동":
			crolling.area += ",K0800030";
			Mainpage.Filtering[Mainpage.index].setText("동춘3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선학동":
			crolling.area += ",K0800050";
			Mainpage.Filtering[Mainpage.index].setText("선학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도동":
			crolling.area += ",K0800060";
			Mainpage.Filtering[Mainpage.index].setText("송도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도1동":
			crolling.area += ",K0800061";
			Mainpage.Filtering[Mainpage.index].setText("송도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도2동":
			crolling.area += ",K0800062";
			Mainpage.Filtering[Mainpage.index].setText("송도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도3동":
			crolling.area += ",K0800063";
			Mainpage.Filtering[Mainpage.index].setText("송도3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도4동":
			crolling.area += ",K0800064";
			Mainpage.Filtering[Mainpage.index].setText("송도4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도5동":
			crolling.area += ",K0800065";
			Mainpage.Filtering[Mainpage.index].setText("송도5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수동":
			crolling.area += ",K0800100";
			Mainpage.Filtering[Mainpage.index].setText("연수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수1동":
			crolling.area += ",K0800070";
			Mainpage.Filtering[Mainpage.index].setText("연수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수2동":
			crolling.area += ",K0800080";
			Mainpage.Filtering[Mainpage.index].setText("연수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수3동":
			crolling.area += ",K0800090";
			Mainpage.Filtering[Mainpage.index].setText("연수3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥련동":
			crolling.area += ",K0800110";
			Mainpage.Filtering[Mainpage.index].setText("옥련동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥련1동":
			crolling.area += ",K0800105";
			Mainpage.Filtering[Mainpage.index].setText("옥련1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥련2동":
			crolling.area += ",K0800106";
			Mainpage.Filtering[Mainpage.index].setText("옥련2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			crolling.area += ",K0800120";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청면":
			crolling.area += ",K0900010";
			Mainpage.Filtering[Mainpage.index].setText("대청면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕적면":
			crolling.area += ",K0900020";
			Mainpage.Filtering[Mainpage.index].setText("덕적면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백령면":
			crolling.area += ",K0900030";
			Mainpage.Filtering[Mainpage.index].setText("백령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북도면":
			crolling.area += ",K0900040";
			Mainpage.Filtering[Mainpage.index].setText("북도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연평면":
			crolling.area += ",K0900050";
			Mainpage.Filtering[Mainpage.index].setText("연평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영흥면":
			crolling.area += ",K0900060";
			Mainpage.Filtering[Mainpage.index].setText("영흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자월면":
			crolling.area += ",K0900070";
			Mainpage.Filtering[Mainpage.index].setText("자월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경동":
			crolling.area += ",K1000010";
			Mainpage.Filtering[Mainpage.index].setText("경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동1가":
			crolling.area += ",K1000020";
			Mainpage.Filtering[Mainpage.index].setText("관동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동2가":
			crolling.area += ",K1000030";
			Mainpage.Filtering[Mainpage.index].setText("관동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동3가":
			crolling.area += ",K1000040";
			Mainpage.Filtering[Mainpage.index].setText("관동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남북동":
			crolling.area += ",K1000050";
			Mainpage.Filtering[Mainpage.index].setText("남북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",K1000060";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답동":
			crolling.area += ",K1000070";
			Mainpage.Filtering[Mainpage.index].setText("답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕교동":
			crolling.area += ",K1000080";
			Mainpage.Filtering[Mainpage.index].setText("덕교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도원동":
			crolling.area += ",K1000090";
			Mainpage.Filtering[Mainpage.index].setText("도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무의동":
			crolling.area += ",K1000100";
			Mainpage.Filtering[Mainpage.index].setText("무의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성동1가":
			crolling.area += ",K1000110";
			Mainpage.Filtering[Mainpage.index].setText("북성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성동2가":
			crolling.area += ",K1000120";
			Mainpage.Filtering[Mainpage.index].setText("북성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성동3가":
			crolling.area += ",K1000130";
			Mainpage.Filtering[Mainpage.index].setText("북성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			crolling.area += ",K1000140";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선린동":
			crolling.area += ",K1000150";
			Mainpage.Filtering[Mainpage.index].setText("선린동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선화동":
			crolling.area += ",K1000160";
			Mainpage.Filtering[Mainpage.index].setText("선화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동1가":
			crolling.area += ",K1000170";
			Mainpage.Filtering[Mainpage.index].setText("송월동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동2가":
			crolling.area += ",K1000180";
			Mainpage.Filtering[Mainpage.index].setText("송월동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동3가":
			crolling.area += ",K1000190";
			Mainpage.Filtering[Mainpage.index].setText("송월동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동1가":
			crolling.area += ",K1000200";
			Mainpage.Filtering[Mainpage.index].setText("송학동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동2가":
			crolling.area += ",K1000210";
			Mainpage.Filtering[Mainpage.index].setText("송학동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동3가":
			crolling.area += ",K1000220";
			Mainpage.Filtering[Mainpage.index].setText("송학동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신생동":
			crolling.area += ",K1000230";
			Mainpage.Filtering[Mainpage.index].setText("신생동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신포동":
			crolling.area += ",K1000240";
			Mainpage.Filtering[Mainpage.index].setText("신포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동1가":
			crolling.area += ",K1000250";
			Mainpage.Filtering[Mainpage.index].setText("신흥동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동2가":
			crolling.area += ",K1000260";
			Mainpage.Filtering[Mainpage.index].setText("신흥동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동3가":
			crolling.area += ",K1000270";
			Mainpage.Filtering[Mainpage.index].setText("신흥동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			crolling.area += ",K1000280";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운남동":
			crolling.area += ",K1000290";
			Mainpage.Filtering[Mainpage.index].setText("운남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운북동":
			crolling.area += ",K1000300";
			Mainpage.Filtering[Mainpage.index].setText("운북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운서동":
			crolling.area += ",K1000310";
			Mainpage.Filtering[Mainpage.index].setText("운서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유동":
			crolling.area += ",K1000320";
			Mainpage.Filtering[Mainpage.index].setText("유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율목동":
			crolling.area += ",K1000330";
			Mainpage.Filtering[Mainpage.index].setText("율목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을왕동":
			crolling.area += ",K1000340";
			Mainpage.Filtering[Mainpage.index].setText("을왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동":
			crolling.area += ",K1000350";
			Mainpage.Filtering[Mainpage.index].setText("인현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동":
			crolling.area += ",K1000360";
			Mainpage.Filtering[Mainpage.index].setText("전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중산동":
			crolling.area += ",K1000370";
			Mainpage.Filtering[Mainpage.index].setText("중산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			crolling.area += ",K1000380";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			crolling.area += ",K1000390";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			crolling.area += ",K1000400";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동4가":
			crolling.area += ",K1000410";
			Mainpage.Filtering[Mainpage.index].setText("중앙동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동1가":
			crolling.area += ",K1000420";
			Mainpage.Filtering[Mainpage.index].setText("항동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동2가":
			crolling.area += ",K1000430";
			Mainpage.Filtering[Mainpage.index].setText("항동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동3가":
			crolling.area += ",K1000440";
			Mainpage.Filtering[Mainpage.index].setText("항동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동4가":
			crolling.area += ",K1000450";
			Mainpage.Filtering[Mainpage.index].setText("항동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동5가":
			crolling.area += ",K1000460";
			Mainpage.Filtering[Mainpage.index].setText("항동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동6가":
			crolling.area += ",K1000470";
			Mainpage.Filtering[Mainpage.index].setText("항동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동7가":
			crolling.area += ",K1000480";
			Mainpage.Filtering[Mainpage.index].setText("항동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동1가":
			crolling.area += ",K1000490";
			Mainpage.Filtering[Mainpage.index].setText("해안동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동2가":
			crolling.area += ",K1000500";
			Mainpage.Filtering[Mainpage.index].setText("해안동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동3가":
			crolling.area += ",K1000510";
			Mainpage.Filtering[Mainpage.index].setText("해안동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동4가":
			crolling.area += ",K1000520";
			Mainpage.Filtering[Mainpage.index].setText("해안동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
