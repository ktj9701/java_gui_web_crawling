package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Chungbuk {
	public boolean flag;

	public void ChungbukCity(ActionEvent e) {
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
		case "감물면":
			crolling.area += ",P0100010";
			Mainpage.Filtering[Mainpage.index].setText("감물면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴산읍":
			crolling.area += ",P0100020";
			Mainpage.Filtering[Mainpage.index].setText("괴산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문광면":
			crolling.area += ",P0100030";
			Mainpage.Filtering[Mainpage.index].setText("문광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불정면":
			crolling.area += ",P0100040";
			Mainpage.Filtering[Mainpage.index].setText("불정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사리면":
			crolling.area += ",P0100050";
			Mainpage.Filtering[Mainpage.index].setText("사리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소수면":
			crolling.area += ",P0100060";
			Mainpage.Filtering[Mainpage.index].setText("소수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연풍면":
			crolling.area += ",P0100070";
			Mainpage.Filtering[Mainpage.index].setText("연풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장연면":
			crolling.area += ",P0100080";
			Mainpage.Filtering[Mainpage.index].setText("장연면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청안면":
			crolling.area += ",P0100090";
			Mainpage.Filtering[Mainpage.index].setText("청안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천면":
			crolling.area += ",P0100100";
			Mainpage.Filtering[Mainpage.index].setText("청천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠성면":
			crolling.area += ",P0100110";
			Mainpage.Filtering[Mainpage.index].setText("칠성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가곡면":
			crolling.area += ",P0200010";
			Mainpage.Filtering[Mainpage.index].setText("가곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단성면":
			crolling.area += ",P0200020";
			Mainpage.Filtering[Mainpage.index].setText("단성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단양읍":
			crolling.area += ",P0200030";
			Mainpage.Filtering[Mainpage.index].setText("단양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대강면":
			crolling.area += ",P0200040";
			Mainpage.Filtering[Mainpage.index].setText("대강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매포읍":
			crolling.area += ",P0200050";
			Mainpage.Filtering[Mainpage.index].setText("매포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어상천면":
			crolling.area += ",P0200060";
			Mainpage.Filtering[Mainpage.index].setText("어상천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영춘면":
			crolling.area += ",P0200070";
			Mainpage.Filtering[Mainpage.index].setText("영춘면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적성면":
			crolling.area += ",P0200080";
			Mainpage.Filtering[Mainpage.index].setText("적성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내북면":
			crolling.area += ",P0300010";
			Mainpage.Filtering[Mainpage.index].setText("내북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마로면":
			crolling.area += ",P0300030";
			Mainpage.Filtering[Mainpage.index].setText("마로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보은읍":
			crolling.area += ",P0300040";
			Mainpage.Filtering[Mainpage.index].setText("보은읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산외면":
			crolling.area += ",P0300050";
			Mainpage.Filtering[Mainpage.index].setText("산외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼승면":
			crolling.area += ",P0300060";
			Mainpage.Filtering[Mainpage.index].setText("삼승면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속리산면":
			crolling.area += ",P0300020";
			Mainpage.Filtering[Mainpage.index].setText("속리산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수한면":
			crolling.area += ",P0300070";
			Mainpage.Filtering[Mainpage.index].setText("수한면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안면":
			crolling.area += ",P0300085";
			Mainpage.Filtering[Mainpage.index].setText("장안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄부면":
			crolling.area += ",P0300090";
			Mainpage.Filtering[Mainpage.index].setText("탄부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회남면":
			crolling.area += ",P0300100";
			Mainpage.Filtering[Mainpage.index].setText("회남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회북면":
			crolling.area += ",P0300110";
			Mainpage.Filtering[Mainpage.index].setText("회북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매곡면":
			crolling.area += ",P0400010";
			Mainpage.Filtering[Mainpage.index].setText("매곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상촌면":
			crolling.area += ",P0400020";
			Mainpage.Filtering[Mainpage.index].setText("상촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심천면":
			crolling.area += ",P0400030";
			Mainpage.Filtering[Mainpage.index].setText("심천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양강면":
			crolling.area += ",P0400040";
			Mainpage.Filtering[Mainpage.index].setText("양강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양산면":
			crolling.area += ",P0400050";
			Mainpage.Filtering[Mainpage.index].setText("양산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동읍":
			crolling.area += ",P0400060";
			Mainpage.Filtering[Mainpage.index].setText("영동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산면":
			crolling.area += ",P0400070";
			Mainpage.Filtering[Mainpage.index].setText("용산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용화면":
			crolling.area += ",P0400080";
			Mainpage.Filtering[Mainpage.index].setText("용화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추풍령면":
			crolling.area += ",P0400090";
			Mainpage.Filtering[Mainpage.index].setText("추풍령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학산면":
			crolling.area += ",P0400100";
			Mainpage.Filtering[Mainpage.index].setText("학산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황간면":
			crolling.area += ",P0400110";
			Mainpage.Filtering[Mainpage.index].setText("황간면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군북면":
			crolling.area += ",P0500010";
			Mainpage.Filtering[Mainpage.index].setText("군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군서면":
			crolling.area += ",P0500020";
			Mainpage.Filtering[Mainpage.index].setText("군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동이면":
			crolling.area += ",P0500030";
			Mainpage.Filtering[Mainpage.index].setText("동이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안남면":
			crolling.area += ",P0500040";
			Mainpage.Filtering[Mainpage.index].setText("안남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안내면":
			crolling.area += ",P0500050";
			Mainpage.Filtering[Mainpage.index].setText("안내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천읍":
			crolling.area += ",P0500060";
			Mainpage.Filtering[Mainpage.index].setText("옥천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이원면":
			crolling.area += ",P0500070";
			Mainpage.Filtering[Mainpage.index].setText("이원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청산면":
			crolling.area += ",P0500080";
			Mainpage.Filtering[Mainpage.index].setText("청산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청성면":
			crolling.area += ",P0500090";
			Mainpage.Filtering[Mainpage.index].setText("청성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감곡면":
			crolling.area += ",P0600020";
			Mainpage.Filtering[Mainpage.index].setText("감곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금왕읍":
			crolling.area += ",P0600030";
			Mainpage.Filtering[Mainpage.index].setText("금왕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대소면":
			crolling.area += ",P0600040";
			Mainpage.Filtering[Mainpage.index].setText("대소면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "맹동면":
			crolling.area += ",P0600050";
			Mainpage.Filtering[Mainpage.index].setText("맹동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성면":
			crolling.area += ",P0600060";
			Mainpage.Filtering[Mainpage.index].setText("삼성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생극면":
			crolling.area += ",P0600070";
			Mainpage.Filtering[Mainpage.index].setText("생극면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소이면":
			crolling.area += ",P0600080";
			Mainpage.Filtering[Mainpage.index].setText("소이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원남면":
			crolling.area += ",P0600090";
			Mainpage.Filtering[Mainpage.index].setText("원남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "음성읍":
			crolling.area += ",P0600100";
			Mainpage.Filtering[Mainpage.index].setText("음성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강제동":
			crolling.area += ",P0700010";
			Mainpage.Filtering[Mainpage.index].setText("강제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고명동":
			crolling.area += ",P0700020";
			Mainpage.Filtering[Mainpage.index].setText("고명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고암동":
			crolling.area += ",P0700030";
			Mainpage.Filtering[Mainpage.index].setText("고암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",P0700040";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",P0700050";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천동":
			crolling.area += ",P0700060";
			Mainpage.Filtering[Mainpage.index].setText("남천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대량동":
			crolling.area += ",P0700070";
			Mainpage.Filtering[Mainpage.index].setText("대량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산면":
			crolling.area += ",P0700080";
			Mainpage.Filtering[Mainpage.index].setText("덕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동현동":
			crolling.area += ",P0700090";
			Mainpage.Filtering[Mainpage.index].setText("동현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두학동":
			crolling.area += ",P0700100";
			Mainpage.Filtering[Mainpage.index].setText("두학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동":
			crolling.area += ",P0700110";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명지동":
			crolling.area += ",P0700120";
			Mainpage.Filtering[Mainpage.index].setText("명지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모산동":
			crolling.area += ",P0700130";
			Mainpage.Filtering[Mainpage.index].setText("모산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운면":
			crolling.area += ",P0700140";
			Mainpage.Filtering[Mainpage.index].setText("백운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉양읍":
			crolling.area += ",P0700150";
			Mainpage.Filtering[Mainpage.index].setText("봉양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			crolling.area += ",P0700160";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서부동":
			crolling.area += ",P0700170";
			Mainpage.Filtering[Mainpage.index].setText("서부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학면":
			crolling.area += ",P0700180";
			Mainpage.Filtering[Mainpage.index].setText("송학면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수산면":
			crolling.area += ",P0700190";
			Mainpage.Filtering[Mainpage.index].setText("수산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",P0700200";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신백동":
			crolling.area += ",P0700210";
			Mainpage.Filtering[Mainpage.index].setText("신백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",P0700220";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영천동":
			crolling.area += ",P0700230";
			Mainpage.Filtering[Mainpage.index].setText("영천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕암동":
			crolling.area += ",P0700240";
			Mainpage.Filtering[Mainpage.index].setText("왕암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의림동":
			crolling.area += ",P0700260";
			Mainpage.Filtering[Mainpage.index].setText("의림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자작동":
			crolling.area += ",P0700270";
			Mainpage.Filtering[Mainpage.index].setText("자작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장락동":
			crolling.area += ",P0700280";
			Mainpage.Filtering[Mainpage.index].setText("장락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로1가":
			crolling.area += ",P0700290";
			Mainpage.Filtering[Mainpage.index].setText("중앙로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로2가":
			crolling.area += ",P0700300";
			Mainpage.Filtering[Mainpage.index].setText("중앙로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천남동":
			crolling.area += ",P0700310";
			Mainpage.Filtering[Mainpage.index].setText("천남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청전동":
			crolling.area += ",P0700320";
			Mainpage.Filtering[Mainpage.index].setText("청전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청풍면":
			crolling.area += ",P0700330";
			Mainpage.Filtering[Mainpage.index].setText("청풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하소동":
			crolling.area += ",P0700340";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한수면":
			crolling.area += ",P0700350";
			Mainpage.Filtering[Mainpage.index].setText("한수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산동":
			crolling.area += ",P0700360";
			Mainpage.Filtering[Mainpage.index].setText("화산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑석동":
			crolling.area += ",P0700370";
			Mainpage.Filtering[Mainpage.index].setText("흑석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도안면":
			crolling.area += ",P1300010";
			Mainpage.Filtering[Mainpage.index].setText("도안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증평읍":
			crolling.area += ",P1300020";
			Mainpage.Filtering[Mainpage.index].setText("증평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광혜원면":
			crolling.area += ",P0800010";
			Mainpage.Filtering[Mainpage.index].setText("광혜원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진천군덕산면":
			crolling.area += ",P0800020";
			Mainpage.Filtering[Mainpage.index].setText("진천군덕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문백면":
			crolling.area += ",P0800030";
			Mainpage.Filtering[Mainpage.index].setText("문백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백곡면":
			crolling.area += ",P0800040";
			Mainpage.Filtering[Mainpage.index].setText("백곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이월면":
			crolling.area += ",P0800050";
			Mainpage.Filtering[Mainpage.index].setText("이월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진천읍":
			crolling.area += ",P0800060";
			Mainpage.Filtering[Mainpage.index].setText("진천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초평면":
			crolling.area += ",P0800070";
			Mainpage.Filtering[Mainpage.index].setText("대천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가덕면":
			crolling.area += ",P1000440";
			Mainpage.Filtering[Mainpage.index].setText("가덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천동":
			crolling.area += ",P1000010";
			Mainpage.Filtering[Mainpage.index].setText("금천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문로1가":
			crolling.area += ",P1000020";
			Mainpage.Filtering[Mainpage.index].setText("남문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문로2가":
			crolling.area += ",P1000030";
			Mainpage.Filtering[Mainpage.index].setText("남문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남일면":
			crolling.area += ",P1000450";
			Mainpage.Filtering[Mainpage.index].setText("남일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남주동":
			crolling.area += ",P1000040";
			Mainpage.Filtering[Mainpage.index].setText("남주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낭성면":
			crolling.area += ",P1000460";
			Mainpage.Filtering[Mainpage.index].setText("낭성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",P1000080";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명암동":
			crolling.area += ",P1000090";
			Mainpage.Filtering[Mainpage.index].setText("명암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문의면":
			crolling.area += ",P1000470";
			Mainpage.Filtering[Mainpage.index].setText("문의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			crolling.area += ",P1000100";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미원면":
			crolling.area += ",P1000480";
			Mainpage.Filtering[Mainpage.index].setText("미원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방서동":
			crolling.area += ",P1000110";
			Mainpage.Filtering[Mainpage.index].setText("방서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문로1가":
			crolling.area += ",P1000120";
			Mainpage.Filtering[Mainpage.index].setText("북문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문로2가":
			crolling.area += ",P1000130";
			Mainpage.Filtering[Mainpage.index].setText("북문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문로3가":
			crolling.area += ",P1000140";
			Mainpage.Filtering[Mainpage.index].setText("북문로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			crolling.area += ",P1000160";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서문동":
			crolling.area += ",P1000170";
			Mainpage.Filtering[Mainpage.index].setText("서문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서운동":
			crolling.area += ",P1000180";
			Mainpage.Filtering[Mainpage.index].setText("서운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석교동":
			crolling.area += ",P1000190";
			Mainpage.Filtering[Mainpage.index].setText("석교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성안동":
			crolling.area += ",P1000490";
			Mainpage.Filtering[Mainpage.index].setText("성안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동":
			crolling.area += ",P1000200";
			Mainpage.Filtering[Mainpage.index].setText("수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",P1000210";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영운동":
			crolling.area += ",P1000220";
			Mainpage.Filtering[Mainpage.index].setText("영운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담.명암.산성동":
			crolling.area += ",P1000500";
			Mainpage.Filtering[Mainpage.index].setText("용담.명암.산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담동":
			crolling.area += ",P1000270";
			Mainpage.Filtering[Mainpage.index].setText("용담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암동":
			crolling.area += ",P1000300";
			Mainpage.Filtering[Mainpage.index].setText("용암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암1동":
			crolling.area += ",P1000280";
			Mainpage.Filtering[Mainpage.index].setText("용암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암2동":
			crolling.area += ",P1000290";
			Mainpage.Filtering[Mainpage.index].setText("용암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용정동":
			crolling.area += ",P1000310";
			Mainpage.Filtering[Mainpage.index].setText("용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운동동":
			crolling.area += ",P1000330";
			Mainpage.Filtering[Mainpage.index].setText("운동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월오동":
			crolling.area += ",P1000340";
			Mainpage.Filtering[Mainpage.index].setText("월오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",P1000510";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지북동":
			crolling.area += ",P1000410";
			Mainpage.Filtering[Mainpage.index].setText("지북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑.대성동":
			crolling.area += ",P1000520";
			Mainpage.Filtering[Mainpage.index].setText("탑.대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			crolling.area += ",P1000420";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평촌동":
			crolling.area += ",P1000430";
			Mainpage.Filtering[Mainpage.index].setText("평촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개신동":
			crolling.area += ",P1400010";
			Mainpage.Filtering[Mainpage.index].setText("개신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남이면":
			crolling.area += ",P1400020";
			Mainpage.Filtering[Mainpage.index].setText("남이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모충동":
			crolling.area += ",P1400030";
			Mainpage.Filtering[Mainpage.index].setText("모충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미평동":
			crolling.area += ",P1400040";
			Mainpage.Filtering[Mainpage.index].setText("미평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "분평동":
			crolling.area += ",P1400050";
			Mainpage.Filtering[Mainpage.index].setText("분평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",P1400060";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직1동":
			crolling.area += ",P1400070";
			Mainpage.Filtering[Mainpage.index].setText("사직1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직2동":
			crolling.area += ",P1400080";
			Mainpage.Filtering[Mainpage.index].setText("사직2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사창동":
			crolling.area += ",P1400090";
			Mainpage.Filtering[Mainpage.index].setText("사창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신남동":
			crolling.area += ",P1400100";
			Mainpage.Filtering[Mainpage.index].setText("신남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성화.개신.죽림동":
			crolling.area += ",P1400110";
			Mainpage.Filtering[Mainpage.index].setText("성화.개신.죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성화동":
			crolling.area += ",P1400120";
			Mainpage.Filtering[Mainpage.index].setText("성화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡동":
			crolling.area += ",P1400130";
			Mainpage.Filtering[Mainpage.index].setText("수곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡1동":
			crolling.area += ",P1400140";
			Mainpage.Filtering[Mainpage.index].setText("수곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡2동":
			crolling.area += ",P1400150";
			Mainpage.Filtering[Mainpage.index].setText("수곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성동":
			crolling.area += ",P1400160";
			Mainpage.Filtering[Mainpage.index].setText("장성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장암동":
			crolling.area += ",P1400170";
			Mainpage.Filtering[Mainpage.index].setText("장암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",P1400180";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현도면":
			crolling.area += ",P1400190";
			Mainpage.Filtering[Mainpage.index].setText("현도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕동":
			crolling.area += ",P0900150";
			Mainpage.Filtering[Mainpage.index].setText("내덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕1동":
			crolling.area += ",P0900160";
			Mainpage.Filtering[Mainpage.index].setText("내덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕2동":
			crolling.area += ",P0900170";
			Mainpage.Filtering[Mainpage.index].setText("내덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내수읍":
			crolling.area += ",P0900070";
			Mainpage.Filtering[Mainpage.index].setText("내수읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북이면":
			crolling.area += ",P0900110";
			Mainpage.Filtering[Mainpage.index].setText("북이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사천동":
			crolling.area += ",P0900180";
			Mainpage.Filtering[Mainpage.index].setText("사천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오근장동":
			crolling.area += ",P0900190";
			Mainpage.Filtering[Mainpage.index].setText("오근장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오동동":
			crolling.area += ",P0900200";
			Mainpage.Filtering[Mainpage.index].setText("오동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오창읍":
			crolling.area += ",P0900120";
			Mainpage.Filtering[Mainpage.index].setText("오창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외남동":
			crolling.area += ",P0900210";
			Mainpage.Filtering[Mainpage.index].setText("외남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외평동":
			crolling.area += ",P0900220";
			Mainpage.Filtering[Mainpage.index].setText("외평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외하동":
			crolling.area += ",P0900230";
			Mainpage.Filtering[Mainpage.index].setText("외하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암동":
			crolling.area += ",P0900240";
			Mainpage.Filtering[Mainpage.index].setText("우암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율량.사천동":
			crolling.area += ",P0900250";
			Mainpage.Filtering[Mainpage.index].setText("율량.사천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율량동":
			crolling.area += ",P0900260";
			Mainpage.Filtering[Mainpage.index].setText("율량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정북동":
			crolling.area += ",P0900270";
			Mainpage.Filtering[Mainpage.index].setText("정북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정상동":
			crolling.area += ",P0900280";
			Mainpage.Filtering[Mainpage.index].setText("정상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정하동":
			crolling.area += ",P0900290";
			Mainpage.Filtering[Mainpage.index].setText("정하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주성동":
			crolling.area += ",P0900300";
			Mainpage.Filtering[Mainpage.index].setText("주성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주중동":
			crolling.area += ",P0900310";
			Mainpage.Filtering[Mainpage.index].setText("주중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가경동":
			crolling.area += ",P1100010";
			Mainpage.Filtering[Mainpage.index].setText("가경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강내면":
			crolling.area += ",P1100540";
			Mainpage.Filtering[Mainpage.index].setText("강내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강서동":
			crolling.area += ",P1100040";
			Mainpage.Filtering[Mainpage.index].setText("강서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강서1동":
			crolling.area += ",P1100020";
			Mainpage.Filtering[Mainpage.index].setText("강서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강서2동":
			crolling.area += ",P1100030";
			Mainpage.Filtering[Mainpage.index].setText("강서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오송읍":
			crolling.area += ",P1100550";
			Mainpage.Filtering[Mainpage.index].setText("오송읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남촌동":
			crolling.area += ",P1100060";
			Mainpage.Filtering[Mainpage.index].setText("남촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			crolling.area += ",P1100070";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동막동":
			crolling.area += ",P1100080";
			Mainpage.Filtering[Mainpage.index].setText("동막동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문암동":
			crolling.area += ",P1100100";
			Mainpage.Filtering[Mainpage.index].setText("문암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복대읍":
			crolling.area += ",P1100140";
			Mainpage.Filtering[Mainpage.index].setText("복대읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복대1동":
			crolling.area += ",P1100120";
			Mainpage.Filtering[Mainpage.index].setText("복대1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복대2동":
			crolling.area += ",P1100130";
			Mainpage.Filtering[Mainpage.index].setText("복대2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명동":
			crolling.area += ",P1100170";
			Mainpage.Filtering[Mainpage.index].setText("봉명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명1동":
			crolling.area += ",P1100150";
			Mainpage.Filtering[Mainpage.index].setText("봉명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명2.송정동":
			crolling.area += ",P1100160";
			Mainpage.Filtering[Mainpage.index].setText("봉명2.송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비하동":
			crolling.area += ",P1100190";
			Mainpage.Filtering[Mainpage.index].setText("비하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상신동":
			crolling.area += ",P1100250";
			Mainpage.Filtering[Mainpage.index].setText("상신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서촌동":
			crolling.area += ",P1100260";
			Mainpage.Filtering[Mainpage.index].setText("서촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석곡동":
			crolling.area += ",P1100270";
			Mainpage.Filtering[Mainpage.index].setText("석곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석소동":
			crolling.area += ",P1100280";
			Mainpage.Filtering[Mainpage.index].setText("석소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송절동":
			crolling.area += ",P1100300";
			Mainpage.Filtering[Mainpage.index].setText("송절동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",P1100310";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수의동":
			crolling.area += ",P1100350";
			Mainpage.Filtering[Mainpage.index].setText("수의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대동":
			crolling.area += ",P1100360";
			Mainpage.Filtering[Mainpage.index].setText("신대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신봉동":
			crolling.area += ",P1100370";
			Mainpage.Filtering[Mainpage.index].setText("신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신성동":
			crolling.area += ",P1100380";
			Mainpage.Filtering[Mainpage.index].setText("신성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신전동":
			crolling.area += ",P1100390";
			Mainpage.Filtering[Mainpage.index].setText("신전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",P1100400";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산면":
			crolling.area += ",P1100560";
			Mainpage.Filtering[Mainpage.index].setText("옥산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외북동":
			crolling.area += ",P1100410";
			Mainpage.Filtering[Mainpage.index].setText("외북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운천.신봉동":
			crolling.area += ",P1100570";
			Mainpage.Filtering[Mainpage.index].setText("운천.신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운천동":
			crolling.area += ",P1100420";
			Mainpage.Filtering[Mainpage.index].setText("운천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원평동":
			crolling.area += ",P1100430";
			Mainpage.Filtering[Mainpage.index].setText("원평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정봉동":
			crolling.area += ",P1100460";
			Mainpage.Filtering[Mainpage.index].setText("정봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지동동":
			crolling.area += ",P1100480";
			Mainpage.Filtering[Mainpage.index].setText("지동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",P1100490";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향정동":
			crolling.area += ",P1100500";
			Mainpage.Filtering[Mainpage.index].setText("향정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현암동":
			crolling.area += ",P1100510";
			Mainpage.Filtering[Mainpage.index].setText("현암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화계동":
			crolling.area += ",P1100520";
			Mainpage.Filtering[Mainpage.index].setText("화계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴암동":
			crolling.area += ",P1100530";
			Mainpage.Filtering[Mainpage.index].setText("휴암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가주동":
			crolling.area += ",P1200020";
			Mainpage.Filtering[Mainpage.index].setText("가주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교현동":
			crolling.area += ",P1200050";
			Mainpage.Filtering[Mainpage.index].setText("교현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교현1동":
			crolling.area += ",P1200030";
			Mainpage.Filtering[Mainpage.index].setText("교현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교현2동":
			crolling.area += ",P1200040";
			Mainpage.Filtering[Mainpage.index].setText("교현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금가면":
			crolling.area += ",P1200060";
			Mainpage.Filtering[Mainpage.index].setText("금가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금능동":
			crolling.area += ",P1200070";
			Mainpage.Filtering[Mainpage.index].setText("금능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노은면":
			crolling.area += ",P1200080";
			Mainpage.Filtering[Mainpage.index].setText("노은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단월동":
			crolling.area += ",P1200090";
			Mainpage.Filtering[Mainpage.index].setText("단월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달천동":
			crolling.area += ",P1200100";
			Mainpage.Filtering[Mainpage.index].setText("달천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대소원면":
			crolling.area += ",P1200320";
			Mainpage.Filtering[Mainpage.index].setText("대소원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동량면":
			crolling.area += ",P1200110";
			Mainpage.Filtering[Mainpage.index].setText("동량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목벌동":
			crolling.area += ",P1200120";
			Mainpage.Filtering[Mainpage.index].setText("목벌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목행동":
			crolling.area += ",P1200130";
			Mainpage.Filtering[Mainpage.index].setText("목행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충주시문화동":
			crolling.area += ",P1200140";
			Mainpage.Filtering[Mainpage.index].setText("충주시문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉방동":
			crolling.area += ",P1200150";
			Mainpage.Filtering[Mainpage.index].setText("봉방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산척면":
			crolling.area += ",P1200160";
			Mainpage.Filtering[Mainpage.index].setText("산척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "살미면":
			crolling.area += ",P1200170";
			Mainpage.Filtering[Mainpage.index].setText("살미면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",P1200180";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			crolling.area += ",P1200190";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성서동":
			crolling.area += ",P1200200";
			Mainpage.Filtering[Mainpage.index].setText("성서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소태면":
			crolling.area += ",P1200210";
			Mainpage.Filtering[Mainpage.index].setText("소태면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수안보면":
			crolling.area += ",P1200220";
			Mainpage.Filtering[Mainpage.index].setText("수안보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신니면":
			crolling.area += ",P1200230";
			Mainpage.Filtering[Mainpage.index].setText("신니면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안림동":
			crolling.area += ",P1200240";
			Mainpage.Filtering[Mainpage.index].setText("안림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "앙성면":
			crolling.area += ",P1200250";
			Mainpage.Filtering[Mainpage.index].setText("앙성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄정면":
			crolling.area += ",P1200260";
			Mainpage.Filtering[Mainpage.index].setText("엄정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수동":
			crolling.area += ",P1200270";
			Mainpage.Filtering[Mainpage.index].setText("연수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용관동":
			crolling.area += ",P1200280";
			Mainpage.Filtering[Mainpage.index].setText("용관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",P1200290";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",P1200300";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용탄동":
			crolling.area += ",P1200310";
			Mainpage.Filtering[Mainpage.index].setText("용탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종민동":
			crolling.area += ",P1200330";
			Mainpage.Filtering[Mainpage.index].setText("종민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주덕읍":
			crolling.area += ",P1200340";
			Mainpage.Filtering[Mainpage.index].setText("주덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙탑면":
			crolling.area += ",P1200010";
			Mainpage.Filtering[Mainpage.index].setText("중앙탑면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지현동":
			crolling.area += ",P1200350";
			Mainpage.Filtering[Mainpage.index].setText("지현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직동":
			crolling.area += ",P1200360";
			Mainpage.Filtering[Mainpage.index].setText("직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충의동":
			crolling.area += ",P1200370";
			Mainpage.Filtering[Mainpage.index].setText("충의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충인동":
			crolling.area += ",P1200380";
			Mainpage.Filtering[Mainpage.index].setText("충인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠금동":
			crolling.area += ",P1200390";
			Mainpage.Filtering[Mainpage.index].setText("칠금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍동":
			crolling.area += ",P1200400";
			Mainpage.Filtering[Mainpage.index].setText("풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호암동":
			crolling.area += ",P1200410";
			Mainpage.Filtering[Mainpage.index].setText("호암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}