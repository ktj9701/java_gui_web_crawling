package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
public class Jeonbuk {
	public boolean flag;

	public void JeonbukCity(ActionEvent e) {
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
		case "고수면":
			crolling.area += ",M0100010";
			Mainpage.Filtering[Mainpage.index].setText("고수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고창읍":
			crolling.area += ",M0100020";
			Mainpage.Filtering[Mainpage.index].setText("고창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공음면":
			crolling.area += ",M0100030";
			Mainpage.Filtering[Mainpage.index].setText("공음면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대산면":
			crolling.area += ",M0100040";
			Mainpage.Filtering[Mainpage.index].setText("대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무장면":
			crolling.area += ",M0100050";
			Mainpage.Filtering[Mainpage.index].setText("무장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부안면":
			crolling.area += ",M0100060";
			Mainpage.Filtering[Mainpage.index].setText("부안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상하면":
			crolling.area += ",M0100070";
			Mainpage.Filtering[Mainpage.index].setText("상하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내면":
			crolling.area += ",M0100080";
			Mainpage.Filtering[Mainpage.index].setText("성내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성송면":
			crolling.area += ",M0100090";
			Mainpage.Filtering[Mainpage.index].setText("성송면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신림면":
			crolling.area += ",M0100100";
			Mainpage.Filtering[Mainpage.index].setText("신림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심원면":
			crolling.area += ",M0100110";
			Mainpage.Filtering[Mainpage.index].setText("심원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아산면":
			crolling.area += ",M0100120";
			Mainpage.Filtering[Mainpage.index].setText("아산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해리면":
			crolling.area += ",M0100130";
			Mainpage.Filtering[Mainpage.index].setText("해리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥덕면":
			crolling.area += ",M0100140";
			Mainpage.Filtering[Mainpage.index].setText("흥덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개복동":
			crolling.area += ",M0200010";
			Mainpage.Filtering[Mainpage.index].setText("개복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개사동":
			crolling.area += ",M0200020";
			Mainpage.Filtering[Mainpage.index].setText("개사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개정동":
			crolling.area += ",M0200030";
			Mainpage.Filtering[Mainpage.index].setText("개정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개정면":
			crolling.area += ",M0200040";
			Mainpage.Filtering[Mainpage.index].setText("개정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경암동":
			crolling.area += ",M0200050";
			Mainpage.Filtering[Mainpage.index].setText("경암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경장동":
			crolling.area += ",M0200060";
			Mainpage.Filtering[Mainpage.index].setText("경장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암동":
			crolling.area += ",M0200070";
			Mainpage.Filtering[Mainpage.index].setText("구암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광동":
			crolling.area += ",M0200080";
			Mainpage.Filtering[Mainpage.index].setText("금광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동":
			crolling.area += ",M0200090";
			Mainpage.Filtering[Mainpage.index].setText("금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암동":
			crolling.area += ",M0200100";
			Mainpage.Filtering[Mainpage.index].setText("금암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운동":
			crolling.area += ",M0200140";
			Mainpage.Filtering[Mainpage.index].setText("나운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운1동":
			crolling.area += ",M0200110";
			Mainpage.Filtering[Mainpage.index].setText("나운1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운2동":
			crolling.area += ",M0200120";
			Mainpage.Filtering[Mainpage.index].setText("나운2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운3동":
			crolling.area += ",M0200130";
			Mainpage.Filtering[Mainpage.index].setText("나운3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나포면":
			crolling.area += ",M0200150";
			Mainpage.Filtering[Mainpage.index].setText("나포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내초동":
			crolling.area += ",M0200160";
			Mainpage.Filtering[Mainpage.index].setText("내초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내흥동":
			crolling.area += ",M0200170";
			Mainpage.Filtering[Mainpage.index].setText("내흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명동":
			crolling.area += ",M0200180";
			Mainpage.Filtering[Mainpage.index].setText("대명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야면":
			crolling.area += ",M0200190";
			Mainpage.Filtering[Mainpage.index].setText("대야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동흥남동":
			crolling.area += ",M0200200";
			Mainpage.Filtering[Mainpage.index].setText("동흥남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔율동":
			crolling.area += ",M0200210";
			Mainpage.Filtering[Mainpage.index].setText("둔율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명산동":
			crolling.area += ",M0200220";
			Mainpage.Filtering[Mainpage.index].setText("명산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			crolling.area += ",M0200230";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미룡동":
			crolling.area += ",M0200240";
			Mainpage.Filtering[Mainpage.index].setText("미룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미원동":
			crolling.area += ",M0200250";
			Mainpage.Filtering[Mainpage.index].setText("미원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미장동":
			crolling.area += ",M0200260";
			Mainpage.Filtering[Mainpage.index].setText("미장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비응도동":
			crolling.area += ",M0200270";
			Mainpage.Filtering[Mainpage.index].setText("비응도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사정동":
			crolling.area += ",M0200280";
			Mainpage.Filtering[Mainpage.index].setText("사정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북동":
			crolling.area += ",M0200290";
			Mainpage.Filtering[Mainpage.index].setText("산북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼학동":
			crolling.area += ",M0200300";
			Mainpage.Filtering[Mainpage.index].setText("삼학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서수면":
			crolling.area += ",M0200310";
			Mainpage.Filtering[Mainpage.index].setText("서수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서흥남동":
			crolling.area += ",M0200320";
			Mainpage.Filtering[Mainpage.index].setText("서흥남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선양동":
			crolling.area += ",M0200330";
			Mainpage.Filtering[Mainpage.index].setText("선양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산면":
			crolling.area += ",M0200340";
			Mainpage.Filtering[Mainpage.index].setText("성산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소룡동":
			crolling.area += ",M0200350";
			Mainpage.Filtering[Mainpage.index].setText("소룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송창동":
			crolling.area += ",M0200360";
			Mainpage.Filtering[Mainpage.index].setText("송창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송풍동":
			crolling.area += ",M0200370";
			Mainpage.Filtering[Mainpage.index].setText("송풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			crolling.area += ",M0200380";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신관동":
			crolling.area += ",M0200390";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신영동":
			crolling.area += ",M0200400";
			Mainpage.Filtering[Mainpage.index].setText("신영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			crolling.area += ",M0200410";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신풍동":
			crolling.area += ",M0200420";
			Mainpage.Filtering[Mainpage.index].setText("신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",M0200430";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",M0200440";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영화동":
			crolling.area += ",M0200450";
			Mainpage.Filtering[Mainpage.index].setText("영화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오룡동":
			crolling.area += ",M0200460";
			Mainpage.Filtering[Mainpage.index].setText("오룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오식도동":
			crolling.area += ",M0200470";
			Mainpage.Filtering[Mainpage.index].setText("오식도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥구읍":
			crolling.area += ",M0200480";
			Mainpage.Filtering[Mainpage.index].setText("옥구읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥도면":
			crolling.area += ",M0200490";
			Mainpage.Filtering[Mainpage.index].setText("옥도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산면":
			crolling.area += ",M0200500";
			Mainpage.Filtering[Mainpage.index].setText("옥산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥서면":
			crolling.area += ",M0200510";
			Mainpage.Filtering[Mainpage.index].setText("옥서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월명동":
			crolling.area += ",M0200520";
			Mainpage.Filtering[Mainpage.index].setText("월명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임피면":
			crolling.area += ",M0200530";
			Mainpage.Filtering[Mainpage.index].setText("임피면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장미동":
			crolling.area += ",M0200540";
			Mainpage.Filtering[Mainpage.index].setText("장미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장재동":
			crolling.area += ",M0200550";
			Mainpage.Filtering[Mainpage.index].setText("장재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조촌동":
			crolling.area += ",M0200560";
			Mainpage.Filtering[Mainpage.index].setText("조촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽성동":
			crolling.area += ",M0200570";
			Mainpage.Filtering[Mainpage.index].setText("죽성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",M0200580";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로1가":
			crolling.area += ",M0200590";
			Mainpage.Filtering[Mainpage.index].setText("중앙로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로2가":
			crolling.area += ",M0200600";
			Mainpage.Filtering[Mainpage.index].setText("중앙로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로3가":
			crolling.area += ",M0200610";
			Mainpage.Filtering[Mainpage.index].setText("중앙로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡동":
			crolling.area += ",M0200620";
			Mainpage.Filtering[Mainpage.index].setText("지곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창성동":
			crolling.area += ",M0200630";
			Mainpage.Filtering[Mainpage.index].setText("창성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동":
			crolling.area += ",M0200640";
			Mainpage.Filtering[Mainpage.index].setText("평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해망동":
			crolling.area += ",M0200650";
			Mainpage.Filtering[Mainpage.index].setText("해망동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현면":
			crolling.area += ",M0200660";
			Mainpage.Filtering[Mainpage.index].setText("회현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈공동":
			crolling.area += ",M0300010";
			Mainpage.Filtering[Mainpage.index].setText("갈공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검산동":
			crolling.area += ",M0300020";
			Mainpage.Filtering[Mainpage.index].setText("검산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공덕면":
			crolling.area += ",M0300030";
			Mainpage.Filtering[Mainpage.index].setText("공덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광활면":
			crolling.area += ",M0300040";
			Mainpage.Filtering[Mainpage.index].setText("광활면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",M0300050";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금구면":
			crolling.area += ",M0300060";
			Mainpage.Filtering[Mainpage.index].setText("금구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산면":
			crolling.area += ",M0300070";
			Mainpage.Filtering[Mainpage.index].setText("금산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난봉동":
			crolling.area += ",M0300080";
			Mainpage.Filtering[Mainpage.index].setText("난봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도장동":
			crolling.area += ",M0300090";
			Mainpage.Filtering[Mainpage.index].setText("도장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만경읍":
			crolling.area += ",M0300100";
			Mainpage.Filtering[Mainpage.index].setText("만경읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명덕동":
			crolling.area += ",M0300110";
			Mainpage.Filtering[Mainpage.index].setText("명덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백구면":
			crolling.area += ",M0300120";
			Mainpage.Filtering[Mainpage.index].setText("백구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백산면":
			crolling.area += ",M0300130";
			Mainpage.Filtering[Mainpage.index].setText("백산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백학동":
			crolling.area += ",M0300140";
			Mainpage.Filtering[Mainpage.index].setText("백학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복죽동":
			crolling.area += ",M0300150";
			Mainpage.Filtering[Mainpage.index].setText("복죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉남면":
			crolling.area += ",M0300160";
			Mainpage.Filtering[Mainpage.index].setText("봉남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부량면":
			crolling.area += ",M0300170";
			Mainpage.Filtering[Mainpage.index].setText("부량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동동":
			crolling.area += ",M0300180";
			Mainpage.Filtering[Mainpage.index].setText("상동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서암동":
			crolling.area += ",M0300190";
			Mainpage.Filtering[Mainpage.index].setText("서암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서정동":
			crolling.area += ",M0300200";
			Mainpage.Filtering[Mainpage.index].setText("서정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성덕면":
			crolling.area += ",M0300210";
			Mainpage.Filtering[Mainpage.index].setText("성덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순동":
			crolling.area += ",M0300220";
			Mainpage.Filtering[Mainpage.index].setText("순동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡동":
			crolling.area += ",M0300230";
			Mainpage.Filtering[Mainpage.index].setText("신곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신덕동":
			crolling.area += ",M0300240";
			Mainpage.Filtering[Mainpage.index].setText("신덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",M0300250";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김제시신풍동":
			crolling.area += ",M0300260";
			Mainpage.Filtering[Mainpage.index].setText("김제시신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양전동":
			crolling.area += ",M0300270";
			Mainpage.Filtering[Mainpage.index].setText("양전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연정동":
			crolling.area += ",M0300280";
			Mainpage.Filtering[Mainpage.index].setText("연정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오정동":
			crolling.area += ",M0300290";
			Mainpage.Filtering[Mainpage.index].setText("오정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산동":
			crolling.area += ",M0300300";
			Mainpage.Filtering[Mainpage.index].setText("옥산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "요촌동":
			crolling.area += ",M0300310";
			Mainpage.Filtering[Mainpage.index].setText("요촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			crolling.area += ",M0300320";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용지면":
			crolling.area += ",M0300330";
			Mainpage.Filtering[Mainpage.index].setText("용지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월봉동":
			crolling.area += ",M0300340";
			Mainpage.Filtering[Mainpage.index].setText("월봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월성동":
			crolling.area += ",M0300350";
			Mainpage.Filtering[Mainpage.index].setText("월성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입석동":
			crolling.area += ",M0300360";
			Mainpage.Filtering[Mainpage.index].setText("입석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장화동":
			crolling.area += ",M0300370";
			Mainpage.Filtering[Mainpage.index].setText("장화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제월동":
			crolling.area += ",M0300380";
			Mainpage.Filtering[Mainpage.index].setText("제월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽산면":
			crolling.area += ",M0300390";
			Mainpage.Filtering[Mainpage.index].setText("죽산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진봉면":
			crolling.area += ",M0300400";
			Mainpage.Filtering[Mainpage.index].setText("진봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청하면":
			crolling.area += ",M0300410";
			Mainpage.Filtering[Mainpage.index].setText("청하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			crolling.area += ",M0300420";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황산동":
			crolling.area += ",M0300430";
			Mainpage.Filtering[Mainpage.index].setText("황산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황산면":
			crolling.area += ",M0300440";
			Mainpage.Filtering[Mainpage.index].setText("황산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥사동":
			crolling.area += ",M0300450";
			Mainpage.Filtering[Mainpage.index].setText("흥사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈치동":
			crolling.area += ",M0400030";
			Mainpage.Filtering[Mainpage.index].setText("갈치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고죽동":
			crolling.area += ",M0400040";
			Mainpage.Filtering[Mainpage.index].setText("고죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광치동":
			crolling.area += ",M0400050";
			Mainpage.Filtering[Mainpage.index].setText("광치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원시금동":
			crolling.area += ",M0400060";
			Mainpage.Filtering[Mainpage.index].setText("남원시금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금지면":
			crolling.area += ",M0400070";
			Mainpage.Filtering[Mainpage.index].setText("금지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내척동":
			crolling.area += ",M0400080";
			Mainpage.Filtering[Mainpage.index].setText("내척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노암동":
			crolling.area += ",M0400090";
			Mainpage.Filtering[Mainpage.index].setText("노암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대강면":
			crolling.area += ",M0400100";
			Mainpage.Filtering[Mainpage.index].setText("대강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원시대산면":
			crolling.area += ",M0400110";
			Mainpage.Filtering[Mainpage.index].setText("남원시대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕과면":
			crolling.area += ",M0400120";
			Mainpage.Filtering[Mainpage.index].setText("덕과면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도통동":
			crolling.area += ",M0400130";
			Mainpage.Filtering[Mainpage.index].setText("도통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동충동":
			crolling.area += ",M0400140";
			Mainpage.Filtering[Mainpage.index].setText("동충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보절면":
			crolling.area += ",M0400150";
			Mainpage.Filtering[Mainpage.index].setText("보절면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사매면":
			crolling.area += ",M0400160";
			Mainpage.Filtering[Mainpage.index].setText("사매면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			crolling.area += ",M0400170";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산내면":
			crolling.area += ",M0400180";
			Mainpage.Filtering[Mainpage.index].setText("산내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산동면":
			crolling.area += ",M0400190";
			Mainpage.Filtering[Mainpage.index].setText("산동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송동면":
			crolling.area += ",M0400200";
			Mainpage.Filtering[Mainpage.index].setText("송동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수지면":
			crolling.area += ",M0400210";
			Mainpage.Filtering[Mainpage.index].setText("수지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식정동":
			crolling.area += ",M0400220";
			Mainpage.Filtering[Mainpage.index].setText("식정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원시신정동":
			crolling.area += ",M0400230";
			Mainpage.Filtering[Mainpage.index].setText("남원시 신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",M0400240";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍교동":
			crolling.area += ",IM0400250";
			Mainpage.Filtering[Mainpage.index].setText("쌍교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아영면":
			crolling.area += ",M0400260";
			Mainpage.Filtering[Mainpage.index].setText("아영면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어현동":
			crolling.area += ",M0400270";
			Mainpage.Filtering[Mainpage.index].setText("어현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕정동":
			crolling.area += ",M0400280";
			Mainpage.Filtering[Mainpage.index].setText("왕정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용정동":
			crolling.area += ",M0400290";
			Mainpage.Filtering[Mainpage.index].setText("용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운봉읍":
			crolling.area += ",M0400300";
			Mainpage.Filtering[Mainpage.index].setText("운봉읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월락동":
			crolling.area += ",M0400310";
			Mainpage.Filtering[Mainpage.index].setText("월락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이백면":
			crolling.area += ",M0400320";
			Mainpage.Filtering[Mainpage.index].setText("이백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인월면":
			crolling.area += ",M0400330";
			Mainpage.Filtering[Mainpage.index].setText("인월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조산동":
			crolling.area += ",M0400340";
			Mainpage.Filtering[Mainpage.index].setText("조산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주생면":
			crolling.area += ",M0400350";
			Mainpage.Filtering[Mainpage.index].setText("주생면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주천면":
			crolling.area += ",M0400360";
			Mainpage.Filtering[Mainpage.index].setText("주천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽항동":
			crolling.area += ",M0400370";
			Mainpage.Filtering[Mainpage.index].setText("죽항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천거동":
			crolling.area += ",M0400380";
			Mainpage.Filtering[Mainpage.index].setText("천거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하정동":
			crolling.area += ",M0400390";
			Mainpage.Filtering[Mainpage.index].setText("하정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향교동":
			crolling.area += ",M0400010";
			Mainpage.Filtering[Mainpage.index].setText("향교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정동":
			crolling.area += ",M0400020";
			Mainpage.Filtering[Mainpage.index].setText("화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무주읍":
			crolling.area += ",M0500010";
			Mainpage.Filtering[Mainpage.index].setText("무주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무풍면":
			crolling.area += ",M0500020";
			Mainpage.Filtering[Mainpage.index].setText("무풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부남면":
			crolling.area += ",M0500030";
			Mainpage.Filtering[Mainpage.index].setText("부남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설천면":
			crolling.area += ",M0500040";
			Mainpage.Filtering[Mainpage.index].setText("설천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성면":
			crolling.area += ",M0500050";
			Mainpage.Filtering[Mainpage.index].setText("안성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적상면":
			crolling.area += ",M0500060";
			Mainpage.Filtering[Mainpage.index].setText("적상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계화면":
			crolling.area += ",M0600010";
			Mainpage.Filtering[Mainpage.index].setText("계화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동진면":
			crolling.area += ",M0600020";
			Mainpage.Filtering[Mainpage.index].setText("동진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부안군백산면":
			crolling.area += ",M0600030";
			Mainpage.Filtering[Mainpage.index].setText("부안군백산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "변산면":
			crolling.area += ",M0600040";
			Mainpage.Filtering[Mainpage.index].setText("변산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보안면":
			crolling.area += ",M0600050";
			Mainpage.Filtering[Mainpage.index].setText("보안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부안읍":
			crolling.area += ",M0600060";
			Mainpage.Filtering[Mainpage.index].setText("부안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상서면":
			crolling.area += ",M0600070";
			Mainpage.Filtering[Mainpage.index].setText("상서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위도면":
			crolling.area += ",M0600080";
			Mainpage.Filtering[Mainpage.index].setText("위도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주산면":
			crolling.area += ",M0600090";
			Mainpage.Filtering[Mainpage.index].setText("주산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "줄포면":
			crolling.area += ",M0600100";
			Mainpage.Filtering[Mainpage.index].setText("줄포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진서면":
			crolling.area += ",M0600110";
			Mainpage.Filtering[Mainpage.index].setText("진서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하서면":
			crolling.area += ",M0600120";
			Mainpage.Filtering[Mainpage.index].setText("하서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행안면":
			crolling.area += ",M0600130";
			Mainpage.Filtering[Mainpage.index].setText("행안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구림면":
			crolling.area += ",M0700010";
			Mainpage.Filtering[Mainpage.index].setText("구림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금과면":
			crolling.area += ",M0700020";
			Mainpage.Filtering[Mainpage.index].setText("금과면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동계면":
			crolling.area += ",M0700030";
			Mainpage.Filtering[Mainpage.index].setText("동계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복흥면":
			crolling.area += ",M0700040";
			Mainpage.Filtering[Mainpage.index].setText("복흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순창읍":
			crolling.area += ",M0700050";
			Mainpage.Filtering[Mainpage.index].setText("순창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍치면":
			crolling.area += ",M0700060";
			Mainpage.Filtering[Mainpage.index].setText("쌍치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유등면":
			crolling.area += ",M0700070";
			Mainpage.Filtering[Mainpage.index].setText("유등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인계면":
			crolling.area += ",M0700080";
			Mainpage.Filtering[Mainpage.index].setText("인계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적성면":
			crolling.area += ",M0700090";
			Mainpage.Filtering[Mainpage.index].setText("적성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔덕면":
			crolling.area += ",M0700100";
			Mainpage.Filtering[Mainpage.index].setText("팔덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산면":
			crolling.area += ",M0700110";
			Mainpage.Filtering[Mainpage.index].setText("풍산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경천면":
			crolling.area += ",M0800010";
			Mainpage.Filtering[Mainpage.index].setText("경천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고산면":
			crolling.area += ",M0800020";
			Mainpage.Filtering[Mainpage.index].setText("고산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구이면":
			crolling.area += ",M0800030";
			Mainpage.Filtering[Mainpage.index].setText("구이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동상면":
			crolling.area += ",M0800040";
			Mainpage.Filtering[Mainpage.index].setText("동상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉동읍":
			crolling.area += ",M0800050";
			Mainpage.Filtering[Mainpage.index].setText("봉동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉면":
			crolling.area += ",M0800060";
			Mainpage.Filtering[Mainpage.index].setText("비봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼례읍":
			crolling.area += ",M0800070";
			Mainpage.Filtering[Mainpage.index].setText("삼례읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상관면":
			crolling.area += ",M0800080";
			Mainpage.Filtering[Mainpage.index].setText("상관면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양면":
			crolling.area += ",M0800090";
			Mainpage.Filtering[Mainpage.index].setText("소양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용진읍":
			crolling.area += ",M0800100";
			Mainpage.Filtering[Mainpage.index].setText("용진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운주면":
			crolling.area += ",M0800110";
			Mainpage.Filtering[Mainpage.index].setText("운주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이서면":
			crolling.area += ",M0800120";
			Mainpage.Filtering[Mainpage.index].setText("이서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산면":
			crolling.area += ",M0800130";
			Mainpage.Filtering[Mainpage.index].setText("화산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			crolling.area += ",M0900010";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금강동":
			crolling.area += ",M0900020";
			Mainpage.Filtering[Mainpage.index].setText("금강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금마면":
			crolling.area += ",M0900030";
			Mainpage.Filtering[Mainpage.index].setText("금마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남중동":
			crolling.area += ",M0900040";
			Mainpage.Filtering[Mainpage.index].setText("남중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낭산면":
			crolling.area += ",M0900050";
			Mainpage.Filtering[Mainpage.index].setText("낭산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕기동":
			crolling.area += ",M0900060";
			Mainpage.Filtering[Mainpage.index].setText("덕기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			crolling.area += ",M0900070";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마동":
			crolling.area += ",M0900080";
			Mainpage.Filtering[Mainpage.index].setText("마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만석동":
			crolling.area += ",M0900090";
			Mainpage.Filtering[Mainpage.index].setText("만석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망성면":
			crolling.area += ",M0900100";
			Mainpage.Filtering[Mainpage.index].setText("망성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모현동1가":
			crolling.area += ",M0900120";
			Mainpage.Filtering[Mainpage.index].setText("모현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모현동2가":
			crolling.area += ",M0900130";
			Mainpage.Filtering[Mainpage.index].setText("모현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목천동":
			crolling.area += ",M0900140";
			Mainpage.Filtering[Mainpage.index].setText("목천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부송동":
			crolling.area += ",M0900150";
			Mainpage.Filtering[Mainpage.index].setText("부송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼기면":
			crolling.area += ",M0900160";
			Mainpage.Filtering[Mainpage.index].setText("삼기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석암동":
			crolling.area += ",M0900170";
			Mainpage.Filtering[Mainpage.index].setText("석암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석왕동":
			crolling.area += ",M0900180";
			Mainpage.Filtering[Mainpage.index].setText("석왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석탄동":
			crolling.area += ",M0900190";
			Mainpage.Filtering[Mainpage.index].setText("석탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성당면":
			crolling.area += ",M0900200";
			Mainpage.Filtering[Mainpage.index].setText("성당면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동":
			crolling.area += ",M0900210";
			Mainpage.Filtering[Mainpage.index].setText("송학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",M0900220";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신용동":
			crolling.area += ",M0900230";
			Mainpage.Filtering[Mainpage.index].setText("신용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익산시신흥동":
			crolling.area += ",M0900240";
			Mainpage.Filtering[Mainpage.index].setText("익산시신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어양동":
			crolling.area += ",M0900250";
			Mainpage.Filtering[Mainpage.index].setText("어양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여산면":
			crolling.area += ",M0900260";
			Mainpage.Filtering[Mainpage.index].setText("여산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등동":
			crolling.area += ",M0900270";
			Mainpage.Filtering[Mainpage.index].setText("영등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산면":
			crolling.area += ",M0900280";
			Mainpage.Filtering[Mainpage.index].setText("오산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕궁면":
			crolling.area += ",M0900290";
			Mainpage.Filtering[Mainpage.index].setText("왕궁면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동면":
			crolling.area += ",M0900300";
			Mainpage.Filtering[Mainpage.index].setText("용동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용안면":
			crolling.area += ",M0900310";
			Mainpage.Filtering[Mainpage.index].setText("용안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용제동":
			crolling.area += ",M0900320";
			Mainpage.Filtering[Mainpage.index].setText("용제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅포면":
			crolling.area += ",M0900330";
			Mainpage.Filtering[Mainpage.index].setText("웅포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익산시월성동":
			crolling.area += ",M0900340";
			Mainpage.Filtering[Mainpage.index].setText("익산시월성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은기동":
			crolling.area += ",M0900350";
			Mainpage.Filtering[Mainpage.index].setText("은기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인화동":
			crolling.area += ",M0900360";
			Mainpage.Filtering[Mainpage.index].setText("인화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인화동1가":
			crolling.area += ",M0900370";
			Mainpage.Filtering[Mainpage.index].setText("인화동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인화동2가":
			crolling.area += ",M0900380";
			Mainpage.Filtering[Mainpage.index].setText("인화동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임상동":
			crolling.area += ",M0900390";
			Mainpage.Filtering[Mainpage.index].setText("임상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정족동":
			crolling.area += ",M0900400";
			Mainpage.Filtering[Mainpage.index].setText("정족동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주현동":
			crolling.area += ",M0900410";
			Mainpage.Filtering[Mainpage.index].setText("주현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",M0900420";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			crolling.area += ",M0900430";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			crolling.area += ",M0900440";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			crolling.area += ",M0900450";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창인동1가":
			crolling.area += ",M0900470";
			Mainpage.Filtering[Mainpage.index].setText("창인동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창인동2가":
			crolling.area += ",M0900480";
			Mainpage.Filtering[Mainpage.index].setText("창인동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘포면":
			crolling.area += ",M0900490";
			Mainpage.Filtering[Mainpage.index].setText("춘포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔봉동":
			crolling.area += ",M0900500";
			Mainpage.Filtering[Mainpage.index].setText("팔봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익산시평화동":
			crolling.area += ",M0900510";
			Mainpage.Filtering[Mainpage.index].setText("익산시평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함라면":
			crolling.area += ",M0900520";
			Mainpage.Filtering[Mainpage.index].setText("함라면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함열읍":
			crolling.area += ",M0900530";
			Mainpage.Filtering[Mainpage.index].setText("함열읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현영동":
			crolling.area += ",M0900540";
			Mainpage.Filtering[Mainpage.index].setText("현영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황등면":
			crolling.area += ",M0900550";
			Mainpage.Filtering[Mainpage.index].setText("황등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강진면":
			crolling.area += ",M1000010";
			Mainpage.Filtering[Mainpage.index].setText("강진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관촌면":
			crolling.area += ",M1000020";
			Mainpage.Filtering[Mainpage.index].setText("관촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕치면":
			crolling.area += ",M1000030";
			Mainpage.Filtering[Mainpage.index].setText("덕치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼계면":
			crolling.area += ",M1000040";
			Mainpage.Filtering[Mainpage.index].setText("삼계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수면":
			crolling.area += ",M1000050";
			Mainpage.Filtering[Mainpage.index].setText("성수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신덕면":
			crolling.area += ",M1000060";
			Mainpage.Filtering[Mainpage.index].setText("신덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평면":
			crolling.area += ",M1000070";
			Mainpage.Filtering[Mainpage.index].setText("신평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오수면":
			crolling.area += ",M1000080";
			Mainpage.Filtering[Mainpage.index].setText("오수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운암면":
			crolling.area += ",M1000090";
			Mainpage.Filtering[Mainpage.index].setText("운암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임실읍":
			crolling.area += ",M1000100";
			Mainpage.Filtering[Mainpage.index].setText("임실읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지사면":
			crolling.area += ",M1000110";
			Mainpage.Filtering[Mainpage.index].setText("지사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청웅면":
			crolling.area += ",M1000120";
			Mainpage.Filtering[Mainpage.index].setText("청웅면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계남면":
			crolling.area += ",M1100010";
			Mainpage.Filtering[Mainpage.index].setText("계남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계북면":
			crolling.area += ",M1100020";
			Mainpage.Filtering[Mainpage.index].setText("계북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번암면":
			crolling.area += ",M1100030";
			Mainpage.Filtering[Mainpage.index].setText("번암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산서면":
			crolling.area += ",M1100040";
			Mainpage.Filtering[Mainpage.index].setText("산서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장계면":
			crolling.area += ",M1100050";
			Mainpage.Filtering[Mainpage.index].setText("장계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장수읍":
			crolling.area += ",M1100060";
			Mainpage.Filtering[Mainpage.index].setText("장수읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천천면":
			crolling.area += ",M1100070";
			Mainpage.Filtering[Mainpage.index].setText("천천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강흥동":
			crolling.area += ",M1200010";
			Mainpage.Filtering[Mainpage.index].setText("강흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고랑동":
			crolling.area += ",M1200020";
			Mainpage.Filtering[Mainpage.index].setText("고랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금상동":
			crolling.area += ",M1200030";
			Mainpage.Filtering[Mainpage.index].setText("금상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암1동":
			crolling.area += ",M1200040";
			Mainpage.Filtering[Mainpage.index].setText("금암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암2동":
			crolling.area += ",M1200050";
			Mainpage.Filtering[Mainpage.index].setText("금암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시금암동":
			crolling.area += ",M1200060";
			Mainpage.Filtering[Mainpage.index].setText("전주시금암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남정동":
			crolling.area += ",M1200070";
			Mainpage.Filtering[Mainpage.index].setText("남정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진동1가":
			crolling.area += ",M1200080";
			Mainpage.Filtering[Mainpage.index].setText("덕진동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진동2가":
			crolling.area += ",M1200090";
			Mainpage.Filtering[Mainpage.index].setText("덕진동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도덕동":
			crolling.area += ",M1200100";
			Mainpage.Filtering[Mainpage.index].setText("도덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도도동":
			crolling.area += ",M1200110";
			Mainpage.Filtering[Mainpage.index].setText("도도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시동산동":
			crolling.area += ",M1200120";
			Mainpage.Filtering[Mainpage.index].setText("전주시동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만성동":
			crolling.area += ",M1200130";
			Mainpage.Filtering[Mainpage.index].setText("만성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",M1200140";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정동":
			crolling.area += ",M1200150";
			Mainpage.Filtering[Mainpage.index].setText("산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성덕동":
			crolling.area += ",M1200160";
			Mainpage.Filtering[Mainpage.index].setText("성덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동1가":
			crolling.area += ",M1200170";
			Mainpage.Filtering[Mainpage.index].setText("송천동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동2가":
			crolling.area += ",M1200180";
			Mainpage.Filtering[Mainpage.index].setText("송천동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여의동":
			crolling.area += ",M1200190";
			Mainpage.Filtering[Mainpage.index].setText("여의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시용정동":
			crolling.area += ",M1200200";
			Mainpage.Filtering[Mainpage.index].setText("전주시용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우아동1가":
			crolling.area += "M1200220";
			Mainpage.Filtering[Mainpage.index].setText("우아동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우아동2가":
			crolling.area += ",M1200230";
			Mainpage.Filtering[Mainpage.index].setText("우아동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우아동3가":
			crolling.area += ",M1200235";
			Mainpage.Filtering[Mainpage.index].setText("우아동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			crolling.area += ",M1200240";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인후동1가":
			crolling.area += ",M1200250";
			Mainpage.Filtering[Mainpage.index].setText("인후동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인후동2가":
			crolling.area += ",M1200260";
			Mainpage.Filtering[Mainpage.index].setText("인후동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동":
			crolling.area += ",M1200270";
			Mainpage.Filtering[Mainpage.index].setText("장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전미동1가":
			crolling.area += ",M1200280";
			Mainpage.Filtering[Mainpage.index].setText("전미동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전미동2가":
			crolling.area += ",M1200290";
			Mainpage.Filtering[Mainpage.index].setText("전미동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중동":
			crolling.area += ",M1200310";
			Mainpage.Filtering[Mainpage.index].setText("전주시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진북동":
			crolling.area += ",M1200300";
			Mainpage.Filtering[Mainpage.index].setText("진북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동1가":
			crolling.area += ",M1200310";
			Mainpage.Filtering[Mainpage.index].setText("팔복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동2가":
			crolling.area += ",M1200320";
			Mainpage.Filtering[Mainpage.index].setText("팔복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동3가":
			crolling.area += ",M1200330";
			Mainpage.Filtering[Mainpage.index].setText("팔복동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동4가":
			crolling.area += ",M1200340";
			Mainpage.Filtering[Mainpage.index].setText("팔복동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호성동1가":
			crolling.area += ",M1200350";
			Mainpage.Filtering[Mainpage.index].setText("호성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호성동2가":
			crolling.area += ",M1200360";
			Mainpage.Filtering[Mainpage.index].setText("호성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호성동3가":
			crolling.area += ",M1200370";
			Mainpage.Filtering[Mainpage.index].setText("호성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			crolling.area += ",M1200380";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경원동1가":
			crolling.area += ",M1300010";
			Mainpage.Filtering[Mainpage.index].setText("경원동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경원동2가":
			crolling.area += ",M1300020";
			Mainpage.Filtering[Mainpage.index].setText("경원동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경원동3가":
			crolling.area += ",M1300030";
			Mainpage.Filtering[Mainpage.index].setText("경원동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고사동":
			crolling.area += ",M1300040";
			Mainpage.Filtering[Mainpage.index].setText("고사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시교동":
			crolling.area += ",M1300050";
			Mainpage.Filtering[Mainpage.index].setText("전주시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남노송동":
			crolling.area += ",M1300060";
			Mainpage.Filtering[Mainpage.index].setText("남노송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동1가":
			crolling.area += ",M1300070";
			Mainpage.Filtering[Mainpage.index].setText("다가동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동2가":
			crolling.area += ",M1300080";
			Mainpage.Filtering[Mainpage.index].setText("다가동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동3가":
			crolling.area += ",M1300090";
			Mainpage.Filtering[Mainpage.index].setText("다가동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동4가":
			crolling.area += ",M1300100";
			Mainpage.Filtering[Mainpage.index].setText("다가동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",M1300110";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동서학동":
			crolling.area += ",M1300120";
			Mainpage.Filtering[Mainpage.index].setText("동서학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동완산동":
			crolling.area += ",M1300130";
			Mainpage.Filtering[Mainpage.index].setText("동완산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동1가":
			crolling.area += ",M1300140";
			Mainpage.Filtering[Mainpage.index].setText("삼천동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동2가":
			crolling.area += ",M1300150";
			Mainpage.Filtering[Mainpage.index].setText("삼천동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동3가":
			crolling.area += ",M1300160";
			Mainpage.Filtering[Mainpage.index].setText("삼천동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상림동":
			crolling.area += ",M1300170";
			Mainpage.Filtering[Mainpage.index].setText("상림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "색장동":
			crolling.area += ",M1300180";
			Mainpage.Filtering[Mainpage.index].setText("색장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서노송동":
			crolling.area += ",M1300190";
			Mainpage.Filtering[Mainpage.index].setText("서노송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서서학동":
			crolling.area += ",M1300200";
			Mainpage.Filtering[Mainpage.index].setText("서서학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서신동":
			crolling.area += ",M1300210";
			Mainpage.Filtering[Mainpage.index].setText("서신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서완산동1가":
			crolling.area += ",M1300220";
			Mainpage.Filtering[Mainpage.index].setText("서완산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서완산동2가":
			crolling.area += ",M1300230";
			Mainpage.Filtering[Mainpage.index].setText("서완산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석구동":
			crolling.area += ",M1300240";
			Mainpage.Filtering[Mainpage.index].setText("석구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용복동":
			crolling.area += ",M1300250";
			Mainpage.Filtering[Mainpage.index].setText("용복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			crolling.area += ",M1300260";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동":
			crolling.area += ",M1300270";
			Mainpage.Filtering[Mainpage.index].setText("전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동3가":
			crolling.area += ",M1300280";
			Mainpage.Filtering[Mainpage.index].setText("전동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중노송동":
			crolling.area += ",M1300290";
			Mainpage.Filtering[Mainpage.index].setText("중노송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중앙동1가":
			crolling.area += ",M1300310";
			Mainpage.Filtering[Mainpage.index].setText("전주시중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중앙동2가":
			crolling.area += ",M1300320";
			Mainpage.Filtering[Mainpage.index].setText("전주시중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중앙동3가":
			crolling.area += ",M1300330";
			Mainpage.Filtering[Mainpage.index].setText("전주시중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동4가":
			crolling.area += ",M130340";
			Mainpage.Filtering[Mainpage.index].setText("중앙동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중인동":
			crolling.area += ",M1300350";
			Mainpage.Filtering[Mainpage.index].setText("중인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화산동1가":
			crolling.area += ",M1300360";
			Mainpage.Filtering[Mainpage.index].setText("중화산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화산동2가":
			crolling.area += ",M1300370";
			Mainpage.Filtering[Mainpage.index].setText("중화산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			crolling.area += ",M1300380";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동1가":
			crolling.area += ",M1300390";
			Mainpage.Filtering[Mainpage.index].setText("평화동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동2가":
			crolling.area += ",M1300400";
			Mainpage.Filtering[Mainpage.index].setText("평화동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동3가":
			crolling.area += ",M1300410";
			Mainpage.Filtering[Mainpage.index].setText("평화동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍남동1가":
			crolling.area += ",M1300420";
			Mainpage.Filtering[Mainpage.index].setText("풍남동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍남동2가":
			crolling.area += ",M1300430";
			Mainpage.Filtering[Mainpage.index].setText("풍남동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍남동3가":
			crolling.area += ",M1300440";
			Mainpage.Filtering[Mainpage.index].setText("풍남동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동1가":
			crolling.area += ",M1300450";
			Mainpage.Filtering[Mainpage.index].setText("효자동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동2가":
			crolling.area += ",M1300460";
			Mainpage.Filtering[Mainpage.index].setText("효자동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동3가":
			crolling.area += ",M1300470";
			Mainpage.Filtering[Mainpage.index].setText("효자동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감곡면":
			crolling.area += ",M1400010";
			Mainpage.Filtering[Mainpage.index].setText("감곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고부면":
			crolling.area += ",M1400020";
			Mainpage.Filtering[Mainpage.index].setText("고부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			crolling.area += ",M1400030";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과교동":
			crolling.area += ",M1400040";
			Mainpage.Filtering[Mainpage.index].setText("과교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교암동":
			crolling.area += ",M1400050";
			Mainpage.Filtering[Mainpage.index].setText("교암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구룡동":
			crolling.area += ",M1400060";
			Mainpage.Filtering[Mainpage.index].setText("구룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금붕동":
			crolling.area += ",M1400070";
			Mainpage.Filtering[Mainpage.index].setText("금붕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내장동":
			crolling.area += ",M1400080";
			Mainpage.Filtering[Mainpage.index].setText("내장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농소동":
			crolling.area += ",M1400090";
			Mainpage.Filtering[Mainpage.index].setText("농소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천면":
			crolling.area += ",M1400100";
			Mainpage.Filtering[Mainpage.index].setText("덕천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망제동":
			crolling.area += ",M1400110";
			Mainpage.Filtering[Mainpage.index].setText("망제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전동":
			crolling.area += ",M1400120";
			Mainpage.Filtering[Mainpage.index].setText("부전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",M1400130";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정읍시산내면":
			crolling.area += ",M1400140";
			Mainpage.Filtering[Mainpage.index].setText("정읍시산내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산외면":
			crolling.area += ",M1400150";
			Mainpage.Filtering[Mainpage.index].setText("산외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산동":
			crolling.area += ",M1400160";
			Mainpage.Filtering[Mainpage.index].setText("삼산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",M1400170";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상평동":
			crolling.area += ",M1400180";
			Mainpage.Filtering[Mainpage.index].setText("상평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소성면":
			crolling.area += ",M1400190";
			Mainpage.Filtering[Mainpage.index].setText("소성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",M1400200";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동":
			crolling.area += ",M1400210";
			Mainpage.Filtering[Mainpage.index].setText("수성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시기동":
			crolling.area += ",M1400250";
			Mainpage.Filtering[Mainpage.index].setText("시기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정읍시신월동":
			crolling.area += ",M1400260";
			Mainpage.Filtering[Mainpage.index].setText("정읍시신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정동":
			crolling.area += ",M1400270";
			Mainpage.Filtering[Mainpage.index].setText("신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신태인읍":
			crolling.area += ",M1400280";
			Mainpage.Filtering[Mainpage.index].setText("신태인읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍암동":
			crolling.area += ",M1400290";
			Mainpage.Filtering[Mainpage.index].setText("쌍암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			crolling.area += ",M1400300";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영원면":
			crolling.area += ",M1400310";
			Mainpage.Filtering[Mainpage.index].setText("영원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영파동":
			crolling.area += ",M1400320";
			Mainpage.Filtering[Mainpage.index].setText("영파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옹동면":
			crolling.area += ",M1400330";
			Mainpage.Filtering[Mainpage.index].setText("옹동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용계동":
			crolling.area += ",M1400340";
			Mainpage.Filtering[Mainpage.index].setText("용계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",M1400350";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이평면":
			crolling.area += ",M1400360";
			Mainpage.Filtering[Mainpage.index].setText("이평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입암면":
			crolling.area += ",M1400370";
			Mainpage.Filtering[Mainpage.index].setText("입암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장명동":
			crolling.area += ",M1400380";
			Mainpage.Filtering[Mainpage.index].setText("장명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정우면":
			crolling.area += ",M1400390";
			Mainpage.Filtering[Mainpage.index].setText("정우면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진산동":
			crolling.area += ",M1400400";
			Mainpage.Filtering[Mainpage.index].setText("진산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초산동":
			crolling.area += ",M1400240";
			Mainpage.Filtering[Mainpage.index].setText("초산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠보면":
			crolling.area += ",M1400410";
			Mainpage.Filtering[Mainpage.index].setText("칠보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태인면":
			crolling.area += ",M1400420";
			Mainpage.Filtering[Mainpage.index].setText("태인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하모동":
			crolling.area += ",M1400430";
			Mainpage.Filtering[Mainpage.index].setText("하모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하북동":
			crolling.area += ",M1400440";
			Mainpage.Filtering[Mainpage.index].setText("하북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑암동":
			crolling.area += ",M1400450";
			Mainpage.Filtering[Mainpage.index].setText("흑암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동향면":
			crolling.area += ",M1500010";
			Mainpage.Filtering[Mainpage.index].setText("동향면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마령면":
			crolling.area += ",M1500020";
			Mainpage.Filtering[Mainpage.index].setText("마령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운면":
			crolling.area += ",M1500030";
			Mainpage.Filtering[Mainpage.index].setText("백운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부귀면":
			crolling.area += ",M1500040";
			Mainpage.Filtering[Mainpage.index].setText("부귀면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상전면":
			crolling.area += ",M1500050";
			Mainpage.Filtering[Mainpage.index].setText("상전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안군성수면":
			crolling.area += ",M1500060";
			Mainpage.Filtering[Mainpage.index].setText("진안군성수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안천면":
			crolling.area += ",M1500070";
			Mainpage.Filtering[Mainpage.index].setText("안천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담면":
			crolling.area += ",M1500080";
			Mainpage.Filtering[Mainpage.index].setText("용담면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정천면":
			crolling.area += "M1500090";
			Mainpage.Filtering[Mainpage.index].setText("정천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안군주천면":
			crolling.area += ",M1500100";
			Mainpage.Filtering[Mainpage.index].setText("진안군주천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안읍":
			crolling.area += ",M1500110";
			Mainpage.Filtering[Mainpage.index].setText("진안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
