package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Daejeon_AND_Sejong {
	public boolean flag;

	public void Daejeon_AND_SejongCity(ActionEvent e) {
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
		case "갈전등":
			crolling.area += ",G0100010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갈전등");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대화동":
			crolling.area += ",G0100020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕암동":
			crolling.area += ",G0100030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목상동":
			crolling.area += ",G0100040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("목상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문평동":
			crolling.area += ",G0100050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미호동":
			crolling.area += ",G0100060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("미호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법동":
			crolling.area += ",G0100090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("법동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법1동":
			crolling.area += ",G0100070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("법1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법2동":
			crolling.area += ",G0100080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("법2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부수동":
			crolling.area += ",G0100100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비래동":
			crolling.area += ",G0100110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("비래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정동":
			crolling.area += ",G0100120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상서동":
			crolling.area += ",G0100130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석봉동":
			crolling.area += ",G0100140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송촌동":
			crolling.area += ",G0100150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대동":
			crolling.area += ",G0100160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신일동":
			crolling.area += ",G0100170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신탄진동":
			crolling.area += ",G0100180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신탄진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연축동":
			crolling.area += ",G0100190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오정동":
			crolling.area += ",G0100200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와동":
			crolling.area += ",G0100210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("와동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호동":
			crolling.area += ",G0100220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍내동":
			crolling.area += ",G0100230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("읍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이현동":
			crolling.area += ",G0100240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("이현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동":
			crolling.area += ",G0100250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중리동":
			crolling.area += ",G0100260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평촌동":
			crolling.area += ",G0100270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("평촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황호동":
			crolling.area += ",G0100280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("황호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양동":
			crolling.area += ",G0200030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양1동":
			crolling.area += ",G0200010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양2동":
			crolling.area += ",G0200020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가오동":
			crolling.area += ",G0200040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구도동":
			crolling.area += ",G0200050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낭월동":
			crolling.area += ",G0200060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("낭월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내탑동":
			crolling.area += ",G0200070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대동":
			crolling.area += ",G0200100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대별동":
			crolling.area += ",G0200110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대별동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",G0200120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산동":
			crolling.area += ",G0200130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("마산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비룡동":
			crolling.area += ",G0200140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("비룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사성동":
			crolling.area += ",G0200150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼괴동":
			crolling.area += ",G0200160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼괴동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동":
			crolling.area += ",G0200190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전동구삼정동":
			crolling.area += ",G0200200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대전동구삼정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상소동":
			crolling.area += ",G0200210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",G0200240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세천동":
			crolling.area += ",G0200250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("세천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소제동":
			crolling.area += ",G0200260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소호동":
			crolling.area += ",G0200270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신상동":
			crolling.area += ",G0200280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신안동":
			crolling.area += ",G0200290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",G0200300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신하동":
			crolling.area += ",G0200310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",G0200320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오동":
			crolling.area += ",G0200330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용계동":
			crolling.area += ",G0200340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용운동":
			crolling.area += ",G0200350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용전동":
			crolling.area += ",G0200360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			crolling.area += ",G0200370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이사동":
			crolling.area += ",G0200380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("이사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인동":
			crolling.area += ",G0200390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양동":
			crolling.area += ",G0200400";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("자양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장척동":
			crolling.area += ",G0200410";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정동":
			crolling.area += ",G0200420";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주산동":
			crolling.area += ",G0200430";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주촌동":
			crolling.area += ",G0200440";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",G0200450";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직동":
			crolling.area += ",G0200460";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천동":
			crolling.area += ",G0200470";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추동":
			crolling.area += ",G0200480";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("추동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판암동":
			crolling.area += ",G0200510";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("판암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판암1동":
			crolling.area += ",G0200490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("판암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판암2동":
			crolling.area += ",G0200500";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("판암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하소동":
			crolling.area += ",G0200520";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("하소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍도동":
			crolling.area += ",G0200530";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("홍도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효동":
			crolling.area += ",G0200540";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효평동":
			crolling.area += ",G0200550";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("효평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가수원동":
			crolling.area += ",G0300010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가수원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가장동":
			crolling.area += ",G0300020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈마동":
			crolling.area += ",G0300050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갈마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈마1동":
			crolling.area += ",G0300030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갈마1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈마2동":
			crolling.area += ",G0300040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갈마2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관저동":
			crolling.area += ",G0300080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("관저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관저1동":
			crolling.area += ",G0300060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("관저1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관저2동":
			crolling.area += ",G0300070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("관저2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴곡동":
			crolling.area += ",G0300090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("괴곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴정동":
			crolling.area += ",G0300100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("괴정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",G0300110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도마동":
			crolling.area += ",G0300140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도마1동":
			crolling.area += ",G0300120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도마1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도마2동":
			crolling.area += ",G0300130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도마2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도안동":
			crolling.area += ",G0300150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔산동":
			crolling.area += ",G0300180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("둔산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔산1동":
			crolling.area += ",G0300160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("둔산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔산2동":
			crolling.area += ",G0300170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("둔산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔산3동":
			crolling.area += ",G0300250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("둔산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만년동":
			crolling.area += ",G0300190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("만년동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매노동":
			crolling.area += ",G0300200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("매노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "변동":
			crolling.area += ",G0300210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복수동":
			crolling.area += ",G0300220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("복수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉곡동":
			crolling.area += ",G0300230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산직동":
			crolling.area += ",G0300240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전서구오동":
			crolling.area += ",G0300260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대전서구오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문동":
			crolling.area += ",G0300270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용촌동":
			crolling.area += ",G0300280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우명동":
			crolling.area += ",G0300290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("우명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원정동":
			crolling.area += ",G0300300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월평1동":
			crolling.area += ",G0300310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월평2동":
			crolling.area += ",G0300320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월평3동":
			crolling.area += ",G0300330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월평동":
			crolling.area += ",G0300340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			crolling.area += ",G0300350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정림동":
			crolling.area += ",G0300360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("정림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄방동":
			crolling.area += ",G0300370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("탄방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전서구평촌동":
			crolling.area += ",G0300380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대전서구평촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑석동":
			crolling.area += ",G0300390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("흑석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정동":
			crolling.area += ",G0400010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갑동":
			crolling.area += ",G0400020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산동":
			crolling.area += ",G0400030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("계산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관평동":
			crolling.area += ",G0400040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("관평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교촌동":
			crolling.area += ",G0400050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("교촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구룡동":
			crolling.area += ",G0400060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구성동":
			crolling.area += ",G0400070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암동":
			crolling.area += ",G0400080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁동":
			crolling.area += ",G0400090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금고동":
			crolling.area += ",G0400100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금탄동":
			crolling.area += ",G0400110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노은동":
			crolling.area += ",G0400120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("노은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전유성구대동":
			crolling.area += ",G0400130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대전유성구대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대정동":
			crolling.area += ",G0400140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕명동":
			crolling.area += ",G0400150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진동":
			crolling.area += ",G0400160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도룡동":
			crolling.area += ",G0400170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔곡동":
			crolling.area += ",G0400180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("둔곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문지동":
			crolling.area += ",G0400190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반석동":
			crolling.area += ",G0400200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("반석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방동":
			crolling.area += ",G0400210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방현동":
			crolling.area += ",G0400220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("방현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복용동":
			crolling.area += ",G0400230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("복용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명동":
			crolling.area += ",G0400240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			crolling.area += ",G0400250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대동":
			crolling.area += ",G0400260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			crolling.area += ",G0400270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세동":
			crolling.area += ",G0400280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("세동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송강동":
			crolling.area += ",G0400290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",G0400300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수남동":
			crolling.area += ",G0400310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",G0400320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신봉동":
			crolling.area += ",G0400330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신성동":
			crolling.area += ",G0400340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산동":
			crolling.area += ",G0400350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("안산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어은동":
			crolling.area += ",G0400360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("어은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외삼동":
			crolling.area += ",G0400370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("외삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전유성구용계동":
			crolling.area += ",G0400380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대전유성구용계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",G0400390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원내동":
			crolling.area += ",G0400400";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원신흥동":
			crolling.area += ",G0400410";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원촌동":
			crolling.area += ",G0400420";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자운동":
			crolling.area += ",G0400430";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("자운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장대동":
			crolling.area += ",G0400440";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전유성구장동":
			crolling.area += ",G0400450";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대전유성구장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전민동":
			crolling.area += ",G0400460";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("전민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽동":
			crolling.area += ",G0400470";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지족동":
			crolling.area += ",G0400480";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지족동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추목동":
			crolling.area += ",G0400490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("추목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑립동":
			crolling.area += ",G0400500";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("탑립동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하기동":
			crolling.area += ",G0400510";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("하기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학하동":
			crolling.area += ",G0400520";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("학하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화암동":
			crolling.area += ",G0400530";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구완동":
			crolling.area += ",G0500010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구완동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동":
			crolling.area += ",G0500020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대사동":
			crolling.area += ",G0500030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			crolling.area += ",G0500040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목달동":
			crolling.area += ",G0500050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("목달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",G0500060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무수동":
			crolling.area += ",G0500070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("무수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문창동":
			crolling.area += ",G0500080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			crolling.area += ",G0500110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화1동":
			crolling.area += ",G0500090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화2동":
			crolling.area += ",G0500100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부사동":
			crolling.area += ",G0500120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사정동":
			crolling.area += ",G0500130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			crolling.area += ",G0500140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석교동":
			crolling.area += ",G0500150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선화동":
			crolling.area += ",G0500160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("선화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안영동":
			crolling.area += ",G0500170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("안영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어남동":
			crolling.area += ",G0500180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("어남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류동":
			crolling.area += ",G0500190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥계동":
			crolling.area += ",G0500200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("옥계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",G0500210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천동":
			crolling.area += ",G0500240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천1동":
			crolling.area += ",G0500220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천2동":
			crolling.area += ",G0500230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행동":
			crolling.area += ",G0500250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정생동":
			crolling.area += ",G0500260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("정생동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중촌동":
			crolling.area += ",G0500270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "침산동":
			crolling.area += ",G0500280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("침산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			crolling.area += ",G0500310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평1동":
			crolling.area += ",G0500290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평2동":
			crolling.area += ",G0500300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호동":
			crolling.area += ",G0500320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가람동":
			crolling.area += ",10100110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가람동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고운동":
			crolling.area += ",10100120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("고운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남면":
			crolling.area += ",10100010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나성동":
			crolling.area += ",10100130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("나성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다정동":
			crolling.area += ",10100140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("다정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평동":
			crolling.area += ",10100150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도담동":
			crolling.area += ",10100160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반곡동":
			crolling.area += ",10100170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("반곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보람동":
			crolling.area += ",10100180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("보람동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부강면":
			crolling.area += ",10100090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "새롬동":
			crolling.area += ",10100190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("새롬동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소담동":
			crolling.area += ",10100200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소정면":
			crolling.area += ",10100050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아름동":
			crolling.area += ",10100210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("아름동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어진동":
			crolling.area += ",10100220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("어진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연기면":
			crolling.area += ",10100020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연동면":
			crolling.area += ",10100030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연서면":
			crolling.area += ",10100040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군면":
			crolling.area += ",10100100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장군면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동면":
			crolling.area += ",10100060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("전동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전의면":
			crolling.area += ",10100070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("전의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조치원읍":
			crolling.area += ",10100080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("조치원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종촌동":
			crolling.area += ",10100230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("종촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한솔동":
			crolling.area += ",10100240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("한솔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
