package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Gyeongnam2 {
	public boolean flag;

	public void Gyeongnam2City(ActionEvent e) {
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
		
		//창원시 마산합포구
		case "가포동":
			crolling.area += ",C1600010";
			Mainpage.Filtering[Mainpage.index].setText("가포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교방동":
			crolling.area += ",C1600020";
			Mainpage.Filtering[Mainpage.index].setText("교방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교원동":
			crolling.area += ",C1600030";
			Mainpage.Filtering[Mainpage.index].setText("교원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산면":
			crolling.area += ",C1600040";
			Mainpage.Filtering[Mainpage.index].setText("구산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남성동":
			crolling.area += ",C1600080";
			Mainpage.Filtering[Mainpage.index].setText("남성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대내동":
			crolling.area += ",C1600100";
			Mainpage.Filtering[Mainpage.index].setText("대내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동1가":
			crolling.area += ",C1600120";
			Mainpage.Filtering[Mainpage.index].setText("대성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동2가":
			crolling.area += ",C1600130";
			Mainpage.Filtering[Mainpage.index].setText("대성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대외동":
			crolling.area += ",C1600140";
			Mainpage.Filtering[Mainpage.index].setText("대외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창동":
			crolling.area += ",C1600150";
			Mainpage.Filtering[Mainpage.index].setText("대창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕동동":
			crolling.area += ",C1600160";
			Mainpage.Filtering[Mainpage.index].setText("덕동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동성동":
			crolling.area += ",C1600170";
			Mainpage.Filtering[Mainpage.index].setText("동성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두월동1가":
			crolling.area += ",C1600190";
			Mainpage.Filtering[Mainpage.index].setText("두월동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두월동2가":
			crolling.area += ",C1600200";
			Mainpage.Filtering[Mainpage.index].setText("두월동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두월동3가":
			crolling.area += ",C1600210";
			Mainpage.Filtering[Mainpage.index].setText("두월동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			crolling.area += ",C1600230";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",C1600240";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			crolling.area += ",C1600260";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산호동":
			crolling.area += ",C1600290";
			Mainpage.Filtering[Mainpage.index].setText("산호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼남동":
			crolling.area += ",C1600320";
			Mainpage.Filtering[Mainpage.index].setText("상남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서성동":
			crolling.area += ",C1600330";
			Mainpage.Filtering[Mainpage.index].setText("서성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성호동":
			crolling.area += ",C1600370";
			Mainpage.Filtering[Mainpage.index].setText("성호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동":
			crolling.area += ",C1600380";
			Mainpage.Filtering[Mainpage.index].setText("수성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",C1600390";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			crolling.area += ",C1600400";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신포동1가":
			crolling.area += ",C1600420";
			Mainpage.Filtering[Mainpage.index].setText("신포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신포동2가":
			crolling.area += ",C1600430";
			Mainpage.Filtering[Mainpage.index].setText("신포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",C1600440";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예곡동":
			crolling.area += ",C1600480";
			Mainpage.Filtering[Mainpage.index].setText("예곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오동동":
			crolling.area += ",C1600490";
			Mainpage.Filtering[Mainpage.index].setText("오동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완월동":
			crolling.area += ",C1600500";
			Mainpage.Filtering[Mainpage.index].setText("완월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우산동":
			crolling.area += ",C1600510";
			Mainpage.Filtering[Mainpage.index].setText("우산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동1가":
			crolling.area += ",C1600530";
			Mainpage.Filtering[Mainpage.index].setText("월남동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동2가":
			crolling.area += ",C1600540";
			Mainpage.Filtering[Mainpage.index].setText("월남동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동3가":
			crolling.area += ",C1600550";
			Mainpage.Filtering[Mainpage.index].setText("월남동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동4가":
			crolling.area += ",C1600560";
			Mainpage.Filtering[Mainpage.index].setText("월남동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동5가":
			crolling.area += ",C1600570";
			Mainpage.Filtering[Mainpage.index].setText("월남동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월영동":
			crolling.area += ",C1600600";
			Mainpage.Filtering[Mainpage.index].setText("월영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월포동":
			crolling.area += ",C1600610";
			Mainpage.Filtering[Mainpage.index].setText("월포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유록동":
			crolling.area += ",C1600620";
			Mainpage.Filtering[Mainpage.index].setText("유록동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자산동":
			crolling.area += ",C1600630";
			Mainpage.Filtering[Mainpage.index].setText("자산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동1가":
			crolling.area += ",C1600650";
			Mainpage.Filtering[Mainpage.index].setText("장군동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동2가":
			crolling.area += ",C1600660";
			Mainpage.Filtering[Mainpage.index].setText("장군동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동3가":
			crolling.area += ",C1600670";
			Mainpage.Filtering[Mainpage.index].setText("장군동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동4가":
			crolling.area += ",C1600680";
			Mainpage.Filtering[Mainpage.index].setText("장군동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동5가":
			crolling.area += ",C1600690";
			Mainpage.Filtering[Mainpage.index].setText("장군동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중성동":
			crolling.area += ",C1600700";
			Mainpage.Filtering[Mainpage.index].setText("중성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			crolling.area += ",C1600720";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			crolling.area += ",C1600730";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			crolling.area += ",C1600740";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진동면":
			crolling.area += ",C1600750";
			Mainpage.Filtering[Mainpage.index].setText("진동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진북면":
			crolling.area += ",C1600760";
			Mainpage.Filtering[Mainpage.index].setText("진북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진전면":
			crolling.area += ",C1600770";
			Mainpage.Filtering[Mainpage.index].setText("진전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			crolling.area += ",C1600780";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동1가":
			crolling.area += ",C1600800";
			Mainpage.Filtering[Mainpage.index].setText("창포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동2가":
			crolling.area += ",C1600810";
			Mainpage.Filtering[Mainpage.index].setText("창포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동3가":
			crolling.area += ",C1600820";
			Mainpage.Filtering[Mainpage.index].setText("창포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청계동":
			crolling.area += ",C1600830";
			Mainpage.Filtering[Mainpage.index].setText("청계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추산동":
			crolling.area += ",C1600840";
			Mainpage.Filtering[Mainpage.index].setText("추산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동":
			crolling.area += ",C1600850";
			Mainpage.Filtering[Mainpage.index].setText("평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해운동":
			crolling.area += ",C1600890";
			Mainpage.Filtering[Mainpage.index].setText("해운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현동":
			crolling.area += ",C1600900";
			Mainpage.Filtering[Mainpage.index].setText("현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍문동":
			crolling.area += ",C1600910";
			Mainpage.Filtering[Mainpage.index].setText("홍문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화영동":
			crolling.area += ",C1600920";
			Mainpage.Filtering[Mainpage.index].setText("화영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//창원시 마산회원구
		case "구암동":
			crolling.area += ",C1620070";
			Mainpage.Filtering[Mainpage.index].setText("구암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암1동":
			crolling.area += ",C1620050";
			Mainpage.Filtering[Mainpage.index].setText("구암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암2동":
			crolling.area += "C1620060";
			Mainpage.Filtering[Mainpage.index].setText("구암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내서읍":
			crolling.area += ",C1620090";
			Mainpage.Filtering[Mainpage.index].setText("내서읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두척동":
			crolling.area += ",C1620220";
			Mainpage.Filtering[Mainpage.index].setText("두척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉암동":
			crolling.area += ",C1620250";
			Mainpage.Filtering[Mainpage.index].setText("봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석전동":
			crolling.area += ",C1620360";
			Mainpage.Filtering[Mainpage.index].setText("석전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석전1동":
			crolling.area += ",C1620340";
			Mainpage.Filtering[Mainpage.index].setText("석전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석전2동":
			crolling.area += ",C1620350";
			Mainpage.Filtering[Mainpage.index].setText("석전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕동":
			crolling.area += ",C1620470";
			Mainpage.Filtering[Mainpage.index].setText("양덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕1동":
			crolling.area += ",C1620450";
			Mainpage.Filtering[Mainpage.index].setText("양덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕2동":
			crolling.area += ",C1620460";
			Mainpage.Filtering[Mainpage.index].setText("양덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합성동":
			crolling.area += ",C1620880";
			Mainpage.Filtering[Mainpage.index].setText("합성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합성1동":
			crolling.area += ",C1620860";
			Mainpage.Filtering[Mainpage.index].setText("합성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합성2동":
			crolling.area += ",C1620870";
			Mainpage.Filtering[Mainpage.index].setText("합성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회성동":
			crolling.area += ",C1620930";
			Mainpage.Filtering[Mainpage.index].setText("회성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회원동":
			crolling.area += ",C1620960";
			Mainpage.Filtering[Mainpage.index].setText("회원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회원1동":
			crolling.area += ",C1620940";
			Mainpage.Filtering[Mainpage.index].setText("회원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회원2동":
			crolling.area += ",C1620950";
			Mainpage.Filtering[Mainpage.index].setText("회원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//창원시 성산구
		case "가음동":
			crolling.area += ",C1640010";
			Mainpage.Filtering[Mainpage.index].setText("가음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가음정동":
			crolling.area += ",C1640020";
			Mainpage.Filtering[Mainpage.index].setText("가음정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀곡동":
			crolling.area += ",C1640030";
			Mainpage.Filtering[Mainpage.index].setText("귀곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀산동":
			crolling.area += ",C1640040";
			Mainpage.Filtering[Mainpage.index].setText("귀산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀현동":
			crolling.area += ",C1640050";
			Mainpage.Filtering[Mainpage.index].setText("귀현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			crolling.area += ",C1640060";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양동":
			crolling.area += ",C1640070";
			Mainpage.Filtering[Mainpage.index].setText("남양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남지동":
			crolling.area += ",C1640080";
			Mainpage.Filtering[Mainpage.index].setText("남지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",C1640090";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대방동":
			crolling.area += ",C1640110";
			Mainpage.Filtering[Mainpage.index].setText("대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반림동":
			crolling.area += ",C1640220";
			Mainpage.Filtering[Mainpage.index].setText("반림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송동":
			crolling.area += ",C1640230";
			Mainpage.Filtering[Mainpage.index].setText("반송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반지동":
			crolling.area += ",C1640240";
			Mainpage.Filtering[Mainpage.index].setText("반지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불모산동":
			crolling.area += ",C1640290";
			Mainpage.Filtering[Mainpage.index].setText("불모산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사파동":
			crolling.area += ",C1640310";
			Mainpage.Filtering[Mainpage.index].setText("사파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사파정동":
			crolling.area += ",C1640320";
			Mainpage.Filtering[Mainpage.index].setText("사파정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정자동":
			crolling.area += ",C1640350";
			Mainpage.Filtering[Mainpage.index].setText("삼정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상남동":
			crolling.area += ",C1640360";
			Mainpage.Filtering[Mainpage.index].setText("상남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상복동":
			crolling.area += ",C1640370";
			Mainpage.Filtering[Mainpage.index].setText("상복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산동":
			crolling.area += ",C1640400";
			Mainpage.Filtering[Mainpage.index].setText("성산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성주동":
			crolling.area += ",C1640410";
			Mainpage.Filtering[Mainpage.index].setText("성주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",C1640450";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안민동":
			crolling.area += ",C1640460";
			Mainpage.Filtering[Mainpage.index].setText("안민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양곡동":
			crolling.area += ",C1640470";
			Mainpage.Filtering[Mainpage.index].setText("양곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완암동":
			crolling.area += ",C1640490";
			Mainpage.Filtering[Mainpage.index].setText("완암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외동":
			crolling.area += ",C1640500";
			Mainpage.Filtering[Mainpage.index].setText("외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅남동":
			crolling.area += ",C1640540";
			Mainpage.Filtering[Mainpage.index].setText("웅남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월림동":
			crolling.area += ",C1640550";
			Mainpage.Filtering[Mainpage.index].setText("월림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적현동":
			crolling.area += ",C1640560";
			Mainpage.Filtering[Mainpage.index].setText("적현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",C1640580";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창곡동":
			crolling.area += ",C1640610";
			Mainpage.Filtering[Mainpage.index].setText("창곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천선동":
			crolling.area += ",C1640620";
			Mainpage.Filtering[Mainpage.index].setText("천선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토월동":
			crolling.area += ",C1640630";
			Mainpage.Filtering[Mainpage.index].setText("토월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//창원시 의창구
		case "내리동":
			crolling.area += ",C1660100";
			Mainpage.Filtering[Mainpage.index].setText("내리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대산면":
			crolling.area += ",C1660120";
			Mainpage.Filtering[Mainpage.index].setText("대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대원동":
			crolling.area += ",C1660130";
			Mainpage.Filtering[Mainpage.index].setText("대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕정동":
			crolling.area += ",C1660140";
			Mainpage.Filtering[Mainpage.index].setText("덕정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도계동":
			crolling.area += ",C1660150";
			Mainpage.Filtering[Mainpage.index].setText("도계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동읍":
			crolling.area += ",C1660160";
			Mainpage.Filtering[Mainpage.index].setText("동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동정동":
			crolling.area += ",C1660170";
			Mainpage.Filtering[Mainpage.index].setText("동정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두대동":
			crolling.area += ",C1660180";
			Mainpage.Filtering[Mainpage.index].setText("두대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명곡동":
			crolling.area += ",C1660190";
			Mainpage.Filtering[Mainpage.index].setText("명곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명서동":
			crolling.area += ",C1660200";
			Mainpage.Filtering[Mainpage.index].setText("명서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반계동":
			crolling.area += ",C1660210";
			Mainpage.Filtering[Mainpage.index].setText("반계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉곡동":
			crolling.area += ",C1660250";
			Mainpage.Filtering[Mainpage.index].setText("봉곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉림동":
			crolling.area += ",C1660260";
			Mainpage.Filtering[Mainpage.index].setText("봉림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북동":
			crolling.area += ",C1660270";
			Mainpage.Filtering[Mainpage.index].setText("북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",C1660280";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사림동":
			crolling.area += ",C1660300";
			Mainpage.Filtering[Mainpage.index].setText("사림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사화동":
			crolling.area += ",C1660330";
			Mainpage.Filtering[Mainpage.index].setText("사화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동동":
			crolling.area += ",C1660340";
			Mainpage.Filtering[Mainpage.index].setText("삼동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서곡동":
			crolling.area += ",C1660380";
			Mainpage.Filtering[Mainpage.index].setText("서곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서상동":
			crolling.area += ",C1660390";
			Mainpage.Filtering[Mainpage.index].setText("서상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소계동":
			crolling.area += ",C1660420";
			Mainpage.Filtering[Mainpage.index].setText("소계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소답동":
			crolling.area += ",C1660430";
			Mainpage.Filtering[Mainpage.index].setText("소답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의창구신월동":
			crolling.area += ",C1660440";
			Mainpage.Filtering[Mainpage.index].setText("의창구신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			crolling.area += ",C1660510";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용지동":
			crolling.area += ",C1660520";
			Mainpage.Filtering[Mainpage.index].setText("용지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호동":
			crolling.area += ",C1660530";
			Mainpage.Filtering[Mainpage.index].setText("용호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",C1660570";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지귀동":
			crolling.area += ",C1660590";
			Mainpage.Filtering[Mainpage.index].setText("지귀동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "차룡동":
			crolling.area += ",C1660600";
			Mainpage.Filtering[Mainpage.index].setText("차룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴촌동":
			crolling.area += ",C1660640";
			Mainpage.Filtering[Mainpage.index].setText("퇴촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔용동":
			crolling.area += ",C1660650";
			Mainpage.Filtering[Mainpage.index].setText("팔용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//창원시 진해구
		case "가중동":
			crolling.area += ",C1680010";
			Mainpage.Filtering[Mainpage.index].setText("가주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경화동":
			crolling.area += ",C1680020";
			Mainpage.Filtering[Mainpage.index].setText("경화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광화동":
			crolling.area += ",C1680030";
			Mainpage.Filtering[Mainpage.index].setText("광화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근화동":
			crolling.area += ",C1680040";
			Mainpage.Filtering[Mainpage.index].setText("근화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문동":
			crolling.area += ",C1680050";
			Mainpage.Filtering[Mainpage.index].setText(",남문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남빈동":
			crolling.area += ",C1680060";
			Mainpage.Filtering[Mainpage.index].setText("남빈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구남양동":
			crolling.area += ",C1680070";
			Mainpage.Filtering[Mainpage.index].setText("진해구남양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대영동":
			crolling.area += ",C1680080";
			Mainpage.Filtering[Mainpage.index].setText("대영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대장동":
			crolling.area += ",C1680090";
			Mainpage.Filtering[Mainpage.index].setText("대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대죽동":
			crolling.area += ",C1680100";
			Mainpage.Filtering[Mainpage.index].setText("대죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천동":
			crolling.area += ",C1680110";
			Mainpage.Filtering[Mainpage.index].setText("대천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			crolling.area += ",C1680120";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산동":
			crolling.area += ",C1680130";
			Mainpage.Filtering[Mainpage.index].setText("덕산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도만동":
			crolling.area += ",C1680140";
			Mainpage.Filtering[Mainpage.index].setText("도만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도천동":
			crolling.area += ",C1680150";
			Mainpage.Filtering[Mainpage.index].setText("도천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동상동":
			crolling.area += ",C1680160";
			Mainpage.Filtering[Mainpage.index].setText("동상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두동":
			crolling.area += ",C1680170";
			Mainpage.Filtering[Mainpage.index].setText("두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천동":
			crolling.area += ",C1680180";
			Mainpage.Filtering[Mainpage.index].setText("마천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동":
			crolling.area += ",C1680190";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무송동":
			crolling.area += ",C1680200";
			Mainpage.Filtering[Mainpage.index].setText("무송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부흥동":
			crolling.area += ",C1680210";
			Mainpage.Filtering[Mainpage.index].setText("부흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북부동":
			crolling.area += ",C1680220";
			Mainpage.Filtering[Mainpage.index].setText("북부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉동":
			crolling.area += ",C1680230";
			Mainpage.Filtering[Mainpage.index].setText("비봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서중동":
			crolling.area += ",C1680240";
			Mainpage.Filtering[Mainpage.index].setText("서중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석동":
			crolling.area += ",C1680250";
			Mainpage.Filtering[Mainpage.index].setText("석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			crolling.area += ",C1680260";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			crolling.area += ",C1680270";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속천동":
			crolling.area += ",C1680280";
			Mainpage.Filtering[Mainpage.index].setText("속천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송죽동":
			crolling.area += ",C1680290";
			Mainpage.Filtering[Mainpage.index].setText("송죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동":
			crolling.area += ",C1680300";
			Mainpage.Filtering[Mainpage.index].setText("송학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수도동":
			crolling.area += ",C1680310";
			Mainpage.Filtering[Mainpage.index].setText("수도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			crolling.area += ",C1680320";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			crolling.area += ",C1680330";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구신흥동":
			crolling.area += ",C1680340";
			Mainpage.Filtering[Mainpage.index].setText("진해구신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안곡동":
			crolling.area += ",C1680350";
			Mainpage.Filtering[Mainpage.index].setText("안곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안골동":
			crolling.area += ",C1680360";
			Mainpage.Filtering[Mainpage.index].setText("안골동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "앵곡동":
			crolling.area += ",C1680370";
			Mainpage.Filtering[Mainpage.index].setText("앵곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여좌동":
			crolling.area += ",C1680380";
			Mainpage.Filtering[Mainpage.index].setText("여좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연도동":
			crolling.area += ",C1680390";
			Mainpage.Filtering[Mainpage.index].setText("연도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용원동":
			crolling.area += ",C1680400";
			Mainpage.Filtering[Mainpage.index].setText("용원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원포동":
			crolling.area += ",C1680410";
			Mainpage.Filtering[Mainpage.index].setText("원포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",C1680420";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익선동":
			crolling.area += ",C1680430";
			Mainpage.Filtering[Mainpage.index].setText("익선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인사동":
			crolling.area += ",C1680440";
			Mainpage.Filtering[Mainpage.index].setText("인사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인의동":
			crolling.area += ",C1680450";
			Mainpage.Filtering[Mainpage.index].setText("인의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자은동":
			crolling.area += ",C1680460";
			Mainpage.Filtering[Mainpage.index].setText("자은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장천동":
			crolling.area += ",C1680470";
			Mainpage.Filtering[Mainpage.index].setText("장천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제덕동":
			crolling.area += ",C1680480";
			Mainpage.Filtering[Mainpage.index].setText("제덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제황산동":
			crolling.area += ",C1680490";
			Mainpage.Filtering[Mainpage.index].setText("제황산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽곡동":
			crolling.area += ",C1680500";
			Mainpage.Filtering[Mainpage.index].setText("죽곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구중앙동":
			crolling.area += ",C1680510";
			Mainpage.Filtering[Mainpage.index].setText("진해구중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중평동":
			crolling.area += ",C1680520";
			Mainpage.Filtering[Mainpage.index].setText("중평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선동":
			crolling.area += ",C1680530";
			Mainpage.Filtering[Mainpage.index].setText("창선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청안동":
			crolling.area += ",C1680540";
			Mainpage.Filtering[Mainpage.index].setText("청안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동":
			crolling.area += ",C1680550";
			Mainpage.Filtering[Mainpage.index].setText("충무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충의동":
			crolling.area += ",C1680560";
			Mainpage.Filtering[Mainpage.index].setText("충의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태백동":
			crolling.area += ",C1680570";
			Mainpage.Filtering[Mainpage.index].setText("태백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			crolling.area += ",C1680580";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통신동":
			crolling.area += ",C1680590";
			Mainpage.Filtering[Mainpage.index].setText("통신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평안동":
			crolling.area += ",C1680600";
			Mainpage.Filtering[Mainpage.index].setText("평안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍호동":
			crolling.area += ",C1680610";
			Mainpage.Filtering[Mainpage.index].setText("풍호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행암동":
			crolling.area += ",C1680620";
			Mainpage.Filtering[Mainpage.index].setText("행암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구현동":
			crolling.area += ",C1680630";
			Mainpage.Filtering[Mainpage.index].setText("진해구현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화천동":
			crolling.area += ",C1680640";
			Mainpage.Filtering[Mainpage.index].setText("화천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동":
			crolling.area += ",C1680650";
			Mainpage.Filtering[Mainpage.index].setText("회현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//통영시
		case "광도면":
			crolling.area += ",C1700010";
			Mainpage.Filtering[Mainpage.index].setText("광도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당동":
			crolling.area += ",C1700020";
			Mainpage.Filtering[Mainpage.index].setText("당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			crolling.area += ",C1700050";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도산면":
			crolling.area += ",C1700060";
			Mainpage.Filtering[Mainpage.index].setText("도산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시도천동":
			crolling.area += ",C1700070";
			Mainpage.Filtering[Mainpage.index].setText("통영시도천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동호동":
			crolling.area += ",C1700080";
			Mainpage.Filtering[Mainpage.index].setText("동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명정동":
			crolling.area += ",C1700090";
			Mainpage.Filtering[Mainpage.index].setText("명정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무전동":
			crolling.area += ",C1700100";
			Mainpage.Filtering[Mainpage.index].setText("무전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시문화동":
			crolling.area += ",C1700110";
			Mainpage.Filtering[Mainpage.index].setText("통영시문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미수1동":
			crolling.area += ",C1700120";
			Mainpage.Filtering[Mainpage.index].setText("미수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미수2동":
			crolling.area += ",C1700130";
			Mainpage.Filtering[Mainpage.index].setText("미수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미수동":
			crolling.area += ",C1700140";
			Mainpage.Filtering[Mainpage.index].setText("미수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉평동":
			crolling.area += ",C1700150";
			Mainpage.Filtering[Mainpage.index].setText("봉평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북신동":
			crolling.area += ",C1700160";
			Mainpage.Filtering[Mainpage.index].setText("북신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사량면":
			crolling.area += ",C1700170";
			Mainpage.Filtering[Mainpage.index].setText("사량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산양읍":
			crolling.area += ",C1700180";
			Mainpage.Filtering[Mainpage.index].setText("산양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호동":
			crolling.area += ",C1700190";
			Mainpage.Filtering[Mainpage.index].setText("서호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "욕지면":
			crolling.area += ",C1700200";
			Mainpage.Filtering[Mainpage.index].setText("욕지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용남면":
			crolling.area += ",C1700210";
			Mainpage.Filtering[Mainpage.index].setText("용남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인평동":
			crolling.area += ",C1700220";
			Mainpage.Filtering[Mainpage.index].setText("인평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정량동":
			crolling.area += ",C1700230";
			Mainpage.Filtering[Mainpage.index].setText("정량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시중앙동":
			crolling.area += ",C1700240";
			Mainpage.Filtering[Mainpage.index].setText("통영시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시태평동":
			crolling.area += ",C1700250";
			Mainpage.Filtering[Mainpage.index].setText("통영시태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평림동":
			crolling.area += ",C1700280";
			Mainpage.Filtering[Mainpage.index].setText("평림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한산면":
			crolling.area += ",C1700290";
			Mainpage.Filtering[Mainpage.index].setText("한산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항남동":
			crolling.area += ",C1700300";
			Mainpage.Filtering[Mainpage.index].setText("항남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//하동군
		case "고전면":
			crolling.area += ",C1800010";
			Mainpage.Filtering[Mainpage.index].setText("고전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남면":
			crolling.area += ",C1800020";
			Mainpage.Filtering[Mainpage.index].setText("금남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",C1800030";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북천면":
			crolling.area += ",C1800040";
			Mainpage.Filtering[Mainpage.index].setText("북천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "악양면":
			crolling.area += ",C1800050";
			Mainpage.Filtering[Mainpage.index].setText("악양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양보면":
			crolling.area += ",C1800060";
			Mainpage.Filtering[Mainpage.index].setText("양보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥종면":
			crolling.area += ",C1800070";
			Mainpage.Filtering[Mainpage.index].setText("옥종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적량면":
			crolling.area += ",C1800080";
			Mainpage.Filtering[Mainpage.index].setText("적량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진교면":
			crolling.area += ",C1800090";
			Mainpage.Filtering[Mainpage.index].setText("진교면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청암면":
			crolling.area += ",C1800100";
			Mainpage.Filtering[Mainpage.index].setText("청암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동읍":
			crolling.area += ",C1800110";
			Mainpage.Filtering[Mainpage.index].setText("하동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화개면":
			crolling.area += ",C1800120";
			Mainpage.Filtering[Mainpage.index].setText("화개면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "횡천면":
			crolling.area += ",C1800130";
			Mainpage.Filtering[Mainpage.index].setText("횡천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//함안군
		case "가야읍":
			crolling.area += ",C1900010";
			Mainpage.Filtering[Mainpage.index].setText("가야읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군북면":
			crolling.area += ",C1900020";
			Mainpage.Filtering[Mainpage.index].setText("군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함안군대산면":
			crolling.area += ",C1900030";
			Mainpage.Filtering[Mainpage.index].setText("함안군대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법수면":
			crolling.area += ",C1900040";
			Mainpage.Filtering[Mainpage.index].setText("법수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산인면":
			crolling.area += ",C1900050";
			Mainpage.Filtering[Mainpage.index].setText("산인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여항면":
			crolling.area += ",C1900060";
			Mainpage.Filtering[Mainpage.index].setText("여항면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠북면":
			crolling.area += ",C1900070";
			Mainpage.Filtering[Mainpage.index].setText("칠북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠서면":
			crolling.area += ",C1900080";
			Mainpage.Filtering[Mainpage.index].setText("칠서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠원면":
			crolling.area += ",C1900090";
			Mainpage.Filtering[Mainpage.index].setText("칠원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함안면":
			crolling.area += ",C1900100";
			Mainpage.Filtering[Mainpage.index].setText("함안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//함양군
		case "마천면":
			crolling.area += ",C2000010";
			Mainpage.Filtering[Mainpage.index].setText("마천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백전면":
			crolling.area += ",C2000020";
			Mainpage.Filtering[Mainpage.index].setText("백전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병곡면":
			crolling.area += ",C2000030";
			Mainpage.Filtering[Mainpage.index].setText("병곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서상면":
			crolling.area += ",C2000040";
			Mainpage.Filtering[Mainpage.index].setText("서상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서하면":
			crolling.area += ",C2000050";
			Mainpage.Filtering[Mainpage.index].setText("서하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동면":
			crolling.area += ",C2000060";
			Mainpage.Filtering[Mainpage.index].setText("수동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안의면":
			crolling.area += ",C2000070";
			Mainpage.Filtering[Mainpage.index].setText("안의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유림면":
			crolling.area += ",C2000080";
			Mainpage.Filtering[Mainpage.index].setText("유림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡면":
			crolling.area += ",C2000090";
			Mainpage.Filtering[Mainpage.index].setText("지곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함양읍":
			crolling.area += ",C2000100";
			Mainpage.Filtering[Mainpage.index].setText("함양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴천면":
			crolling.area += ",C2000110";
			Mainpage.Filtering[Mainpage.index].setText("휴천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//합천군
		case "가야면":
			crolling.area += ",C2100010";
			Mainpage.Filtering[Mainpage.index].setText("가야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가회면":
			crolling.area += ",C2100020";
			Mainpage.Filtering[Mainpage.index].setText("가회면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대병면":
			crolling.area += ",C2100030";
			Mainpage.Filtering[Mainpage.index].setText("대병면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대양면":
			crolling.area += ",C2100040";
			Mainpage.Filtering[Mainpage.index].setText("대양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕곡면":
			crolling.area += ",C2100050";
			Mainpage.Filtering[Mainpage.index].setText("덕곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘산면":
			crolling.area += ",C2100060";
			Mainpage.Filtering[Mainpage.index].setText("묘산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산면":
			crolling.area += ",C2100070";
			Mainpage.Filtering[Mainpage.index].setText("봉산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼가면":
			crolling.area += ",C2100080";
			Mainpage.Filtering[Mainpage.index].setText("삼가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍백면":
			crolling.area += ",C2100090";
			Mainpage.Filtering[Mainpage.index].setText("쌍백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍책면":
			crolling.area += ",C2100100";
			Mainpage.Filtering[Mainpage.index].setText("쌍책면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야로면":
			crolling.area += ",C2100110";
			Mainpage.Filtering[Mainpage.index].setText("야로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용주면":
			crolling.area += ",C2100120";
			Mainpage.Filtering[Mainpage.index].setText("용주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율곡면":
			crolling.area += ",C2100130";
			Mainpage.Filtering[Mainpage.index].setText("율곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적중면":
			crolling.area += ",C2100140";
			Mainpage.Filtering[Mainpage.index].setText("적중면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청덕면":
			crolling.area += ",C2100150";
			Mainpage.Filtering[Mainpage.index].setText("청덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초계면":
			crolling.area += ",C2100160";
			Mainpage.Filtering[Mainpage.index].setText("초계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합천읍":
			crolling.area += ",C2100170";
			Mainpage.Filtering[Mainpage.index].setText("합천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}