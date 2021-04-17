package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Deagu {
	public boolean flag;

	public void DeaguCity(ActionEvent e) {
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
		//대구
				//남구
				case "대명동":
					crolling.area += ",F0100100";
					Mainpage.Filtering[Mainpage.index].setText("대명동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명1동":
					crolling.area += ",F0100030";
					Mainpage.Filtering[Mainpage.index].setText("대명1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명2동":
					crolling.area += ",F0100040";
					Mainpage.Filtering[Mainpage.index].setText("대명2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명3동":
					crolling.area += ",F0100050";
					Mainpage.Filtering[Mainpage.index].setText("대명3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명4동":
					crolling.area += ",F0100060";
					Mainpage.Filtering[Mainpage.index].setText("대명4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명5동":
					crolling.area += ",F0100070";
					Mainpage.Filtering[Mainpage.index].setText("대명5동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명6동":
					crolling.area += "F0100080";
					Mainpage.Filtering[Mainpage.index].setText("대명6동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명9동":
					crolling.area += ",F0100090";
					Mainpage.Filtering[Mainpage.index].setText("대명9동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명10동":
					crolling.area += ",F0100010";
					Mainpage.Filtering[Mainpage.index].setText("대명10동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대명11동":
					crolling.area += ",F0100020";
					Mainpage.Filtering[Mainpage.index].setText("대명11동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉덕동":
					crolling.area += ",F0100140";
					Mainpage.Filtering[Mainpage.index].setText("봉덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉덕1동":
					crolling.area += ",F0100110";
					Mainpage.Filtering[Mainpage.index].setText("봉덕1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉덕2동":
					crolling.area += ",F0100120";
					Mainpage.Filtering[Mainpage.index].setText("봉덕2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉덕3동":
					crolling.area += ",F0100130";
					Mainpage.Filtering[Mainpage.index].setText("봉덕3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "이천동":
					crolling.area += ",F0100150";
					Mainpage.Filtering[Mainpage.index].setText("이천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//달서구
				case "갈산동":
					crolling.area += ",F0200010";
					Mainpage.Filtering[Mainpage.index].setText("갈산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "감삼동":
					crolling.area += ",F0200020";
					Mainpage.Filtering[Mainpage.index].setText("감삼동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대곡동":
					crolling.area += ",F0200030";
					Mainpage.Filtering[Mainpage.index].setText("대곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대천동":
					crolling.area += ",F0200040";
					Mainpage.Filtering[Mainpage.index].setText("대천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도원동":
					crolling.area += ",F0200050";
					Mainpage.Filtering[Mainpage.index].setText("도원동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "두류동":
					crolling.area += ",F0200090";
					Mainpage.Filtering[Mainpage.index].setText("두류동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "두류1동":
					crolling.area += ",F0200060";
					Mainpage.Filtering[Mainpage.index].setText("두류1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "두류2동":
					crolling.area += ",F0200070";
					Mainpage.Filtering[Mainpage.index].setText("두류2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "두류3동":
					crolling.area += ",F0200080";
					Mainpage.Filtering[Mainpage.index].setText("두류3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "본동":
					crolling.area += ",F0200100";
					Mainpage.Filtering[Mainpage.index].setText("본동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "본리동":
					crolling.area += ",F0200110";
					Mainpage.Filtering[Mainpage.index].setText("본리동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상인동":
					crolling.area += ",F0200150";
					Mainpage.Filtering[Mainpage.index].setText("상인동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상인1동":
					crolling.area += ",F0200120";
					Mainpage.Filtering[Mainpage.index].setText("상인1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상인2동":
					crolling.area += ",F0200130";
					Mainpage.Filtering[Mainpage.index].setText("상인2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상인3동":
					crolling.area += ",F0200140";
					Mainpage.Filtering[Mainpage.index].setText("상인3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성당동":
					crolling.area += ",F0200180";
					Mainpage.Filtering[Mainpage.index].setText("성당동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성당1동":
					crolling.area += ",F0200160";
					Mainpage.Filtering[Mainpage.index].setText("성당1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성당2동":
					crolling.area += ",F0200170";
					Mainpage.Filtering[Mainpage.index].setText("성당2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "송현동":
					crolling.area += ",F0200210";
					Mainpage.Filtering[Mainpage.index].setText("송현동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "송현1동":
					crolling.area += ",F0200190";
					Mainpage.Filtering[Mainpage.index].setText("송현1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "송현2동":
					crolling.area += ",F0200200";
					Mainpage.Filtering[Mainpage.index].setText("송현2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신당동":
					crolling.area += ",F0200220";
					Mainpage.Filtering[Mainpage.index].setText("신당동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용산동":
					crolling.area += ",F0200250";
					Mainpage.Filtering[Mainpage.index].setText("용산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용산1동":
					crolling.area += ",F0200230";
					Mainpage.Filtering[Mainpage.index].setText("용산1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용산2동":
					crolling.area += ",F0200240";
					Mainpage.Filtering[Mainpage.index].setText("용산2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "월성동":
					crolling.area += ",F0200280";
					Mainpage.Filtering[Mainpage.index].setText("월성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "월성1동":
					crolling.area += ",F0200260";
					Mainpage.Filtering[Mainpage.index].setText("월성1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "월성2동":
					crolling.area += ",F0200270";
					Mainpage.Filtering[Mainpage.index].setText("월성2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "월암동":
					crolling.area += ",F0200290";
					Mainpage.Filtering[Mainpage.index].setText("우러암동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "유천동":
					crolling.area += ",F0200300";
					Mainpage.Filtering[Mainpage.index].setText("유천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "이곡동":
					crolling.area += ",F0200330";
					Mainpage.Filtering[Mainpage.index].setText("이곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "이곡1동":
					crolling.area += ",F0200310";
					Mainpage.Filtering[Mainpage.index].setText("이곡1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "이곡2동":
					crolling.area += ",F0200320";
					Mainpage.Filtering[Mainpage.index].setText("이곡2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "장기동":
					crolling.area += ",F0200340";
					Mainpage.Filtering[Mainpage.index].setText("장기동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "장동":
					crolling.area += ",F0200350";
					Mainpage.Filtering[Mainpage.index].setText("장동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "죽전동":
					crolling.area += ",F0200360";
					Mainpage.Filtering[Mainpage.index].setText("죽전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "진천동":
					crolling.area += ",F0200370";
					Mainpage.Filtering[Mainpage.index].setText("진천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "파호동":
					crolling.area += ",F0200380";
					Mainpage.Filtering[Mainpage.index].setText("파호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "호림동":
					crolling.area += ",F0200390";
					Mainpage.Filtering[Mainpage.index].setText("호림동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "호산동":
					crolling.area += ",F0200400";
					Mainpage.Filtering[Mainpage.index].setText("호산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//달성군
				case "가창면":
					crolling.area += ",F0300010";
					Mainpage.Filtering[Mainpage.index].setText("가창면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구지면":
					crolling.area += ",F0300020";
					Mainpage.Filtering[Mainpage.index].setText("구지면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "논공읍":
					crolling.area += ",F0300030";
					Mainpage.Filtering[Mainpage.index].setText("논공읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "다사읍":
					crolling.area += ",F0300040";
					Mainpage.Filtering[Mainpage.index].setText("다사읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "옥포면":
					crolling.area += ",F0300050";
					Mainpage.Filtering[Mainpage.index].setText("옥포면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "유가읍":
					crolling.area += ",F0300060";
					Mainpage.Filtering[Mainpage.index].setText("유가읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "하빈면":
					crolling.area += ",F0300070";
					Mainpage.Filtering[Mainpage.index].setText("하빈면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "현풍면":
					crolling.area += ",F0300080";
					Mainpage.Filtering[Mainpage.index].setText("현풍면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화원읍":
					crolling.area += ",F0300090";
					Mainpage.Filtering[Mainpage.index].setText("화원읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//동구
				case "각산동":
					crolling.area += ",F0400010";
					Mainpage.Filtering[Mainpage.index].setText("각산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "검사동":
					crolling.area += ",F0400020";
					Mainpage.Filtering[Mainpage.index].setText("검사동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "괴전동":
					crolling.area += ",F0400030";
					Mainpage.Filtering[Mainpage.index].setText("괴전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "금강동":
					crolling.area += ",F0400040";
					Mainpage.Filtering[Mainpage.index].setText("금강동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내곡동":
					crolling.area += ",F0400050";
					Mainpage.Filtering[Mainpage.index].setText("내곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내동":
					crolling.area += ",F0400060";
					Mainpage.Filtering[Mainpage.index].setText("내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "능성동":
					crolling.area += ",F0400070";
					Mainpage.Filtering[Mainpage.index].setText("능성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대림동":
					crolling.area += ",F0400080";
					Mainpage.Filtering[Mainpage.index].setText("대림동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "덕곡동":
					crolling.area += ",F0400090";
					Mainpage.Filtering[Mainpage.index].setText("덕곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도동":
					crolling.area += "F0400100";
					Mainpage.Filtering[Mainpage.index].setText("도동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도학동":
					crolling.area += ",F0400110";
					Mainpage.Filtering[Mainpage.index].setText("도학동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동내동":
					crolling.area += ",F0400120";
					Mainpage.Filtering[Mainpage.index].setText("동내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동호동":
					crolling.area += ",F0400130";
					Mainpage.Filtering[Mainpage.index].setText("동호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "둔산동":
					crolling.area += ",F0400140";
					Mainpage.Filtering[Mainpage.index].setText("둔산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "매여동":
					crolling.area += ",F0400150";
					Mainpage.Filtering[Mainpage.index].setText("매여동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "미곡동":
					crolling.area += ",F0400160";
					Mainpage.Filtering[Mainpage.index].setText("미곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "미대동":
					crolling.area += ",F0400170";
					Mainpage.Filtering[Mainpage.index].setText("미대동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "방촌동":
					crolling.area += ",F0400180";
					Mainpage.Filtering[Mainpage.index].setText("방촌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "백안동":
					crolling.area += ",F0400190";
					Mainpage.Filtering[Mainpage.index].setText("백안동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉무동":
					crolling.area += ",F0400200";
					Mainpage.Filtering[Mainpage.index].setText("봉무동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "부동":
					crolling.area += ",F0400210";
					Mainpage.Filtering[Mainpage.index].setText("부동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "불로동":
					crolling.area += ",F0400220";
					Mainpage.Filtering[Mainpage.index].setText("불로동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사복동":
					crolling.area += ",F0400230";
					Mainpage.Filtering[Mainpage.index].setText("사복동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상매동":
					crolling.area += ",F0400240";
					Mainpage.Filtering[Mainpage.index].setText("상매동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서호동":
					crolling.area += ",F0400250";
					Mainpage.Filtering[Mainpage.index].setText("서호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "송정동":
					crolling.area += ",F0400260";
					Mainpage.Filtering[Mainpage.index].setText("송정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "숙천동":
					crolling.area += ",F0400270";
					Mainpage.Filtering[Mainpage.index].setText("숙천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신기동":
					crolling.area += ",F0400280";
					Mainpage.Filtering[Mainpage.index].setText("신기동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신무동":
					crolling.area += ",F0400290";
					Mainpage.Filtering[Mainpage.index].setText("신무동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신서동":
					crolling.area += ",F0400300";
					Mainpage.Filtering[Mainpage.index].setText("신서동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신암동":
					crolling.area += ",F0400360";
					Mainpage.Filtering[Mainpage.index].setText("신암동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신암1동":
					crolling.area += ",F0400310";
					Mainpage.Filtering[Mainpage.index].setText("신암1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신암2동":
					crolling.area += ",F0400320";
					Mainpage.Filtering[Mainpage.index].setText("신암2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신암3동":
					crolling.area += ",F0400330";
					Mainpage.Filtering[Mainpage.index].setText("신암3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신암4동":
					crolling.area += ",F0400340";
					Mainpage.Filtering[Mainpage.index].setText("신암4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신암5동":
					crolling.area += ",F0400350";
					Mainpage.Filtering[Mainpage.index].setText("신암5동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신용동":
					crolling.area += ",F0400370";
					Mainpage.Filtering[Mainpage.index].setText("신용동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신천동":
					crolling.area += ",F0400410";
					Mainpage.Filtering[Mainpage.index].setText("신천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신천1,2동":
					crolling.area += ",F0400380";
					Mainpage.Filtering[Mainpage.index].setText("신천1,2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신천3동":
					crolling.area += ",F0400390";
					Mainpage.Filtering[Mainpage.index].setText("신천3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신천4동":
					crolling.area += ",F0400400";
					Mainpage.Filtering[Mainpage.index].setText("신천4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신평동":
					crolling.area += ",F0400420";
					Mainpage.Filtering[Mainpage.index].setText("신평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용계동":
					crolling.area += ",F0400430";
					Mainpage.Filtering[Mainpage.index].setText("용계동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용수동":
					crolling.area += ",F0400440";
					Mainpage.Filtering[Mainpage.index].setText("용수동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "율암동":
					crolling.area += ",F0400450";
					Mainpage.Filtering[Mainpage.index].setText("율암동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "율하동":
					crolling.area += ",F0400460";
					Mainpage.Filtering[Mainpage.index].setText("율하동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "입석동":
					crolling.area += ",F0400470";
					Mainpage.Filtering[Mainpage.index].setText("입석동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중대동":
					crolling.area += ",F0400480";
					Mainpage.Filtering[Mainpage.index].setText("중대동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지묘동":
					crolling.area += ",F0400490";
					Mainpage.Filtering[Mainpage.index].setText("지묘동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지저동":
					crolling.area += ",F0400500";
					Mainpage.Filtering[Mainpage.index].setText("지저동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "진인동":
					crolling.area += ",F0400510";
					Mainpage.Filtering[Mainpage.index].setText("진인동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평광동":
					crolling.area += ",F0400520";
					Mainpage.Filtering[Mainpage.index].setText("평광동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "효목동":
					crolling.area += ",F0400550";
					Mainpage.Filtering[Mainpage.index].setText("효목동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "효목1동":
					crolling.area += ",F0400530";
					Mainpage.Filtering[Mainpage.index].setText("효목1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "효목2동":
					crolling.area += ",F0400540";
					Mainpage.Filtering[Mainpage.index].setText("효목2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//북구
				case "검단동":
					crolling.area += ",F0500010";
					Mainpage.Filtering[Mainpage.index].setText("검단동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "고성동1가":
					crolling.area += ",F0500020";
					Mainpage.Filtering[Mainpage.index].setText("고성동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "고성동2가":
					crolling.area += ",F0500030";
					Mainpage.Filtering[Mainpage.index].setText("고성동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "고성동3가":
					crolling.area += ",F0500040";
					Mainpage.Filtering[Mainpage.index].setText("고성동3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "관음동":
					crolling.area += ",F0500050";
					Mainpage.Filtering[Mainpage.index].setText("관음동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구암동":
					crolling.area += ",F0500060";
					Mainpage.Filtering[Mainpage.index].setText("구암동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "국우동":
					crolling.area += ",F0500070";
					Mainpage.Filtering[Mainpage.index].setText("국우동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "금호동":
					crolling.area += ",F0500080";
					Mainpage.Filtering[Mainpage.index].setText("금호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노곡동":
					crolling.area += ",F0500090";
					Mainpage.Filtering[Mainpage.index].setText("노곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노원동1가":
					crolling.area += ",F0500100";
					Mainpage.Filtering[Mainpage.index].setText("노원동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노원동2가":
					crolling.area += ",F0500110";
					Mainpage.Filtering[Mainpage.index].setText("노원동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노원동3가":
					crolling.area += ",F0500120";
					Mainpage.Filtering[Mainpage.index].setText("노원동3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대현동":
					crolling.area += ",F0500150";
					Mainpage.Filtering[Mainpage.index].setText("대현동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대현1동":
					crolling.area += ",F0500130";
					Mainpage.Filtering[Mainpage.index].setText("대현1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대현2동":
					crolling.area += ",F0500140";
					Mainpage.Filtering[Mainpage.index].setText("대현2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도남동":
					crolling.area += ",F0500160";
					Mainpage.Filtering[Mainpage.index].setText("도남동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동변동":
					crolling.area += ",F0500170";
					Mainpage.Filtering[Mainpage.index].setText("동변동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동천동":
					crolling.area += ",F0500180";
					Mainpage.Filtering[Mainpage.index].setText("동천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "북구동호동":
					crolling.area += ",F0500190";
					Mainpage.Filtering[Mainpage.index].setText("북구동호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "매천동":
					crolling.area += ",F0500200";
					Mainpage.Filtering[Mainpage.index].setText("매천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "복현동":
					crolling.area += ",F0500230";
					Mainpage.Filtering[Mainpage.index].setText("복현동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "복현1동":
					crolling.area += ",F0500210";
					Mainpage.Filtering[Mainpage.index].setText("복현1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "복현2동":
					crolling.area += ",F0500220";
					Mainpage.Filtering[Mainpage.index].setText("복현2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사수동":
					crolling.area += ",F0500240";
					Mainpage.Filtering[Mainpage.index].setText("사수동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산격동":
					crolling.area += ",F0500290";
					Mainpage.Filtering[Mainpage.index].setText("산격동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산격1동":
					crolling.area += ",F0500250";
					Mainpage.Filtering[Mainpage.index].setText("산격1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산격2동":
					crolling.area += ",F0500260";
					Mainpage.Filtering[Mainpage.index].setText("산격2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산격3동":
					crolling.area += ",F0500270";
					Mainpage.Filtering[Mainpage.index].setText("산격3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산격4동":
					crolling.area += ",F0500280";
					Mainpage.Filtering[Mainpage.index].setText("산격4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서변동":
					crolling.area += ",F0500300";
					Mainpage.Filtering[Mainpage.index].setText("서변동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "연경동":
					crolling.area += ",F0500310";
					Mainpage.Filtering[Mainpage.index].setText("연경동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "읍내동":
					crolling.area += ",F0500320";
					Mainpage.Filtering[Mainpage.index].setText("읍내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "조야동":
					crolling.area += ",F0500330";
					Mainpage.Filtering[Mainpage.index].setText("조야동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "칠성동1가":
					crolling.area += ",F0500340";
					Mainpage.Filtering[Mainpage.index].setText("칠성동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "칠성동2가":
					crolling.area += ",F0500350";
					Mainpage.Filtering[Mainpage.index].setText("칠성동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "침산동":
					crolling.area += ",F0500390";
					Mainpage.Filtering[Mainpage.index].setText("침산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "침산1동":
					crolling.area += ",F0500360";
					Mainpage.Filtering[Mainpage.index].setText("침산1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "침산2동":
					crolling.area += ",F0500370";
					Mainpage.Filtering[Mainpage.index].setText("침산2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "침산3동":
					crolling.area += ",F0500380";
					Mainpage.Filtering[Mainpage.index].setText("침산3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "태전동":
					crolling.area += ",F0500420";
					Mainpage.Filtering[Mainpage.index].setText("태전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "태전1동":
					crolling.area += ",F0500400";
					Mainpage.Filtering[Mainpage.index].setText("태전1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "태전2동":
					crolling.area += ",F0500410";
					Mainpage.Filtering[Mainpage.index].setText("태전2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "팔달동":
					crolling.area += ",F0500430";
					Mainpage.Filtering[Mainpage.index].setText("팔달동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "학정동":
					crolling.area += ",F0500440";
					Mainpage.Filtering[Mainpage.index].setText("학정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;



				//서구
				case "내당동":
					crolling.area += ",F0600040";
					Mainpage.Filtering[Mainpage.index].setText("내당동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내당1동":
					crolling.area += ",F0600010";
					Mainpage.Filtering[Mainpage.index].setText("내당1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내당2,3동":
					crolling.area += ",F0600020";
					Mainpage.Filtering[Mainpage.index].setText("내당2,3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내당4동":
					crolling.area += ",F0600030";
					Mainpage.Filtering[Mainpage.index].setText("내당4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산동":
					crolling.area += ",F0600110";
					Mainpage.Filtering[Mainpage.index].setText("비산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산1동":
					crolling.area += ",F0600050";
					Mainpage.Filtering[Mainpage.index].setText("비산1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산2/3동":
					crolling.area += ",F0600060";
					Mainpage.Filtering[Mainpage.index].setText("비산2/3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산4동":
					crolling.area += ",F0600070";
					Mainpage.Filtering[Mainpage.index].setText("비산4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산5동":
					crolling.area += ",F0600080";
					Mainpage.Filtering[Mainpage.index].setText("비산5동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산6동":
					crolling.area += ",F0600090";
					Mainpage.Filtering[Mainpage.index].setText("비산6동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산7동":
					crolling.area += ",F0600100";
					Mainpage.Filtering[Mainpage.index].setText("비산7동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상리동":
					crolling.area += ",F0600120";
					Mainpage.Filtering[Mainpage.index].setText("상리동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "원대동1가":
					crolling.area += ",F0600130";
					Mainpage.Filtering[Mainpage.index].setText("원대동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "원대동2가":
					crolling.area += ",F0600140";
					Mainpage.Filtering[Mainpage.index].setText("원대동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "원대동3가":
					crolling.area += ",F0600150";
					Mainpage.Filtering[Mainpage.index].setText("원대동3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "이현동":
					crolling.area += ",F0600160";
					Mainpage.Filtering[Mainpage.index].setText("이현동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중리동":
					crolling.area += ",F0600170";
					Mainpage.Filtering[Mainpage.index].setText("중리동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리동":
					crolling.area += ",F0600240";
					Mainpage.Filtering[Mainpage.index].setText("평리동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리1동":
					crolling.area += ",F0600180";
					Mainpage.Filtering[Mainpage.index].setText("평리1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리2동":
					crolling.area += ",F0600190";
					Mainpage.Filtering[Mainpage.index].setText("평리2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리3동":
					crolling.area += ",F0600200";
					Mainpage.Filtering[Mainpage.index].setText("평리3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리4동":
					crolling.area += ",F0600210";
					Mainpage.Filtering[Mainpage.index].setText("평리4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리5동":
					crolling.area += ",F0600220";
					Mainpage.Filtering[Mainpage.index].setText("평리5동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평리6동":
					crolling.area += ",F0600230";
					Mainpage.Filtering[Mainpage.index].setText("평리6동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//수성구
				case "가천동":
					crolling.area += ",F0700010";
					Mainpage.Filtering[Mainpage.index].setText("가천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "고모동":
					crolling.area += ",F0700020";
					Mainpage.Filtering[Mainpage.index].setText("고모동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노변동":
					crolling.area += ",F0700030";
					Mainpage.Filtering[Mainpage.index].setText("노변동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대흥동":
					crolling.area += ",F0700040";
					Mainpage.Filtering[Mainpage.index].setText("대흥동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "두산동":
					crolling.area += ",F0700050";
					Mainpage.Filtering[Mainpage.index].setText("두산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "만촌동":
					crolling.area += ",F0700090";
					Mainpage.Filtering[Mainpage.index].setText("만촌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "만촌1동":
					crolling.area += ",F0700060";
					Mainpage.Filtering[Mainpage.index].setText("만촌1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "만촌2동":
					crolling.area += ",F0700070";
					Mainpage.Filtering[Mainpage.index].setText("만촌2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "만촌3동":
					crolling.area += ",F0700080";
					Mainpage.Filtering[Mainpage.index].setText("만촌3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "매호동":
					crolling.area += ",F0700100";
					Mainpage.Filtering[Mainpage.index].setText("매호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범물동":
					crolling.area += ",F0700130";
					Mainpage.Filtering[Mainpage.index].setText("범물동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범물1동":
					crolling.area += ",F0700110";
					Mainpage.Filtering[Mainpage.index].setText("범물1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범물2동":
					crolling.area += ",F0700120";
					Mainpage.Filtering[Mainpage.index].setText("범물2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범어동":
					crolling.area += ",F0700180";
					Mainpage.Filtering[Mainpage.index].setText("범어동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범어1동":
					crolling.area += ",F0700140";
					Mainpage.Filtering[Mainpage.index].setText("범어1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범어2동":
					crolling.area += ",F0700150";
					Mainpage.Filtering[Mainpage.index].setText("범어2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범어3동":
					crolling.area += ",F0700160";
					Mainpage.Filtering[Mainpage.index].setText("범어3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "범어4동":
					crolling.area += ",F0700170";
					Mainpage.Filtering[Mainpage.index].setText("범어4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사월동":
					crolling.area += ",F0700190";
					Mainpage.Filtering[Mainpage.index].setText("사월동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼덕동":
					crolling.area += ",F0700200";
					Mainpage.Filtering[Mainpage.index].setText("삼덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상동":
					crolling.area += ",F0700210";
					Mainpage.Filtering[Mainpage.index].setText("상동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성동":
					crolling.area += ",F0700220";
					Mainpage.Filtering[Mainpage.index].setText("성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수성동1가":
					crolling.area += ",F0700230";
					Mainpage.Filtering[Mainpage.index].setText("수성동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수성동2가":
					crolling.area += ",F0700240";
					Mainpage.Filtering[Mainpage.index].setText("수성동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수성동3가":
					crolling.area += ",F0700250";
					Mainpage.Filtering[Mainpage.index].setText("수성동3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수성동4가":
					crolling.area += ",F0700260";
					Mainpage.Filtering[Mainpage.index].setText("수성동4가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "시지동":
					crolling.area += ",F0700270";
					Mainpage.Filtering[Mainpage.index].setText("시지동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신매동":
					crolling.area += ",F0700280";
					Mainpage.Filtering[Mainpage.index].setText("신매동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "연호동":
					crolling.area += ",F0700290";
					Mainpage.Filtering[Mainpage.index].setText("연호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "욱수동":
					crolling.area += ",F0700300";
					Mainpage.Filtering[Mainpage.index].setText("욱수동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수성구이천동":
					crolling.area += ",F0700310";
					Mainpage.Filtering[Mainpage.index].setText("수성구이천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중동":
					crolling.area += ",F0700320";
					Mainpage.Filtering[Mainpage.index].setText("중동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지산동":
					crolling.area += ",F0700350";
					Mainpage.Filtering[Mainpage.index].setText("지산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지산1동":
					crolling.area += ",F0700330";
					Mainpage.Filtering[Mainpage.index].setText("지산1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지산2동":
					crolling.area += ",F0700340";
					Mainpage.Filtering[Mainpage.index].setText("지산2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "파동":
					crolling.area += ",F0700360";
					Mainpage.Filtering[Mainpage.index].setText("파동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황금동":
					crolling.area += ",F0700390";
					Mainpage.Filtering[Mainpage.index].setText("황금동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황금1동":
					crolling.area += ",F0700370";
					Mainpage.Filtering[Mainpage.index].setText("황금1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황금2동":
					crolling.area += ",F0700380";
					Mainpage.Filtering[Mainpage.index].setText("황금2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//중구
				case "계산동1가":
					crolling.area += ",F0800010";
					Mainpage.Filtering[Mainpage.index].setText("계산동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "계산동2가":
					crolling.area += ",F0800020";
					Mainpage.Filtering[Mainpage.index].setText("계산동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공평동":
					crolling.area += ",F0800030";
					Mainpage.Filtering[Mainpage.index].setText("공평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "교동":
					crolling.area += ",F0800040";
					Mainpage.Filtering[Mainpage.index].setText("교동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산동":
					crolling.area += ",F0800090";
					Mainpage.Filtering[Mainpage.index].setText("남산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산1동":
					crolling.area += ",F0800050";
					Mainpage.Filtering[Mainpage.index].setText("남산1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산2동":
					crolling.area += ",F0800060";
					Mainpage.Filtering[Mainpage.index].setText("남산2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산3동":
					crolling.area += ",F0800070";
					Mainpage.Filtering[Mainpage.index].setText("남산3동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산4동":
					crolling.area += ",F0800080";
					Mainpage.Filtering[Mainpage.index].setText("남산4동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남성로":
					crolling.area += ",F0800100";
					Mainpage.Filtering[Mainpage.index].setText("남성로");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남일동":
					crolling.area += ",F0800110";
					Mainpage.Filtering[Mainpage.index].setText("남일동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "달성동":
					crolling.area += ",F0800120";
					Mainpage.Filtering[Mainpage.index].setText("달성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대봉동":
					crolling.area += ",F0800150";
					Mainpage.Filtering[Mainpage.index].setText("대봉동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대봉1동":
					crolling.area += ",F0800130";
					Mainpage.Filtering[Mainpage.index].setText("대봉1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대봉2동":
					crolling.area += ",F0800140";
					Mainpage.Filtering[Mainpage.index].setText("대봉2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대신동":
					crolling.area += ",F0800160";
					Mainpage.Filtering[Mainpage.index].setText("대신동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대안동":
					crolling.area += ",F0800170";
					Mainpage.Filtering[Mainpage.index].setText("대안동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "덕산동":
					crolling.area += ",F0800180";
					Mainpage.Filtering[Mainpage.index].setText("덕산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중구도원동":
					crolling.area += ",F0800190";
					Mainpage.Filtering[Mainpage.index].setText("중구도원동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동문동":
					crolling.area += ",F0800200";
					Mainpage.Filtering[Mainpage.index].setText("동문동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동산동":
					crolling.area += ",F0800210";
					Mainpage.Filtering[Mainpage.index].setText("동산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동성로1가":
					crolling.area += ",F0800220";
					Mainpage.Filtering[Mainpage.index].setText("동성로1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동성로2가":
					crolling.area += ",F0800230";
					Mainpage.Filtering[Mainpage.index].setText("동성로2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동성로3가":
					crolling.area += ",F0800240";
					Mainpage.Filtering[Mainpage.index].setText("동성로3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동인동1가":
					crolling.area += ",F0800250";
					Mainpage.Filtering[Mainpage.index].setText("동인동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동인동2가":
					crolling.area += ",F0800260";
					Mainpage.Filtering[Mainpage.index].setText("동인동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동인동3가":
					crolling.area += ",F0800270";
					Mainpage.Filtering[Mainpage.index].setText("동인동3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동인동4가":
					crolling.area += ",F0800280";
					Mainpage.Filtering[Mainpage.index].setText("동인동4가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동일동":
					crolling.area += ",F0800290";
					Mainpage.Filtering[Mainpage.index].setText("동일동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "문화동":
					crolling.area += ",F0800300";
					Mainpage.Filtering[Mainpage.index].setText("문화동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉산동":
					crolling.area += ",F0800310";
					Mainpage.Filtering[Mainpage.index].setText("봉산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "북내동":
					crolling.area += ",F0800320";
					Mainpage.Filtering[Mainpage.index].setText("북내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "북성로1가":
					crolling.area += ",F0800330";
					Mainpage.Filtering[Mainpage.index].setText("북성로1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "북성로2가":
					crolling.area += ",F0800340";
					Mainpage.Filtering[Mainpage.index].setText("북성로2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사일동":
					crolling.area += ",F0800350";
					Mainpage.Filtering[Mainpage.index].setText("사일동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼덕동1가":
					crolling.area += ",F0800360";
					Mainpage.Filtering[Mainpage.index].setText("삼덕동1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼덕동2가":
					crolling.area += ",F0800370";
					Mainpage.Filtering[Mainpage.index].setText("삼덕동2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼덕동3가":
					crolling.area += ",F0800380";
					Mainpage.Filtering[Mainpage.index].setText("삼덕동3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상덕동":
					crolling.area += ",F0800390";
					Mainpage.Filtering[Mainpage.index].setText("상덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상서동":
					crolling.area += ",F0800400";
					Mainpage.Filtering[Mainpage.index].setText("상서동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서내동":
					crolling.area += ",F0800410";
					Mainpage.Filtering[Mainpage.index].setText("서내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서문로1가":
					crolling.area += ",F0800420";
					Mainpage.Filtering[Mainpage.index].setText("서문로1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서문로2가":
					crolling.area += ",F0800430";
					Mainpage.Filtering[Mainpage.index].setText("서문로2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서성로1가":
					crolling.area += ",F0800440";
					Mainpage.Filtering[Mainpage.index].setText("서성로1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서성로2가":
					crolling.area += ",F0800450";
					Mainpage.Filtering[Mainpage.index].setText("서성로2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서야동":
					crolling.area += ",F0800460";
					Mainpage.Filtering[Mainpage.index].setText("서야동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수동":
					crolling.area += ",F0800470";
					Mainpage.Filtering[Mainpage.index].setText("수동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수창동":
					crolling.area += ",F0800480";
					Mainpage.Filtering[Mainpage.index].setText("수창동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "시장북로":
					crolling.area += ",F0800490";
					Mainpage.Filtering[Mainpage.index].setText("시장북로");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "완정동":
					crolling.area += ",F0800500";
					Mainpage.Filtering[Mainpage.index].setText("완정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용덕동":
					crolling.area += ",F0800510";
					Mainpage.Filtering[Mainpage.index].setText("용덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "인교동":
					crolling.area += ",F0800520";
					Mainpage.Filtering[Mainpage.index].setText("인교동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "장관동":
					crolling.area += ",F0800530";
					Mainpage.Filtering[Mainpage.index].setText("장관동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "전동":
					crolling.area += ",F0800540";
					Mainpage.Filtering[Mainpage.index].setText("전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "종로1가":
					crolling.area += ",F0800550";
					Mainpage.Filtering[Mainpage.index].setText("종로1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "종로2가":
					crolling.area += ",F0800560";
					Mainpage.Filtering[Mainpage.index].setText("종로2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "태평로1가":
					crolling.area += ",F0800570";
					Mainpage.Filtering[Mainpage.index].setText("태평로1가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "태평로2가":
					crolling.area += ",F0800580";
					Mainpage.Filtering[Mainpage.index].setText("태평로2가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "태평로3가":
					crolling.area += ",F0800590";
					Mainpage.Filtering[Mainpage.index].setText("태평로3가");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "포정동":
					crolling.area += ",F0800600";
					Mainpage.Filtering[Mainpage.index].setText("포정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "하서동":
					crolling.area += ",F0800610";
					Mainpage.Filtering[Mainpage.index].setText("하서동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "향촌동":
					crolling.area += ",F0800620";
					Mainpage.Filtering[Mainpage.index].setText("향촌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화전동":
					crolling.area += ",F0800630";
					Mainpage.Filtering[Mainpage.index].setText("화전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
		}
	}
}
