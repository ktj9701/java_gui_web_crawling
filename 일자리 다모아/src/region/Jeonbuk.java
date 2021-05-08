package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
public class Jeonbuk {
	public boolean flag;

	public void JeonbukCity(ActionEvent e) {
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
		case "고수면":
			Albamoncrolling.area += ",M0100010";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B0%ED%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고창읍":
			Albamoncrolling.area += ",M0100020";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B0%ED%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("고창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공음면":
			Albamoncrolling.area += ",M0100030";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B0%F8%C0%BD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("공음면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대산면":
			Albamoncrolling.area += ",M0100040";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무장면":
			Albamoncrolling.area += ",M0100050";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B9%AB%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("무장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부안면":
			Albamoncrolling.area += ",M0100060";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BA%CE%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상하면":
			Albamoncrolling.area += ",M0100070";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BB%F3%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내면":
			Albamoncrolling.area += ",M0100080";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BC%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성송면":
			Albamoncrolling.area += ",M0100090";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BC%BA%BC%DB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성송면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신림면":
			Albamoncrolling.area += ",M0100100";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BD%C5%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심원면":
			Albamoncrolling.area += ",M0100110";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BD%C9%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("심원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아산면":
			Albamoncrolling.area += ",M0100120";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BE%C6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("아산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해리면":
			Albamoncrolling.area += ",M0100130";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%C7%D8%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥덕면":
			Albamoncrolling.area += ",M0100140";
			AlbaHeavencrolling.area += "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%C8%EF%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("흥덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개복동":
			Albamoncrolling.area += ",M0200010";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개사동":
			Albamoncrolling.area += ",M0200020";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개정동":
			Albamoncrolling.area += ",M0200030";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개정면":
			Albamoncrolling.area += ",M0200040";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("개정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경암동":
			Albamoncrolling.area += ",M0200050";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%E6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경장동":
			Albamoncrolling.area += ",M0200060";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%E6%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암동":
			Albamoncrolling.area += ",M0200070";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광동":
			Albamoncrolling.area += ",M0200080";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%DD%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동":
			Albamoncrolling.area += ",M0200090";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암동":
			Albamoncrolling.area += ",M0200100";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운동":
			Albamoncrolling.area += ",M0200140";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("나운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운1동":
			Albamoncrolling.area += ",M0200110";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("나운1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운2동":
			Albamoncrolling.area += ",M0200120";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("나운2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나운3동":
			Albamoncrolling.area += ",M0200130";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("나운3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나포면":
			Albamoncrolling.area += ",M0200150";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("나포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내초동":
			Albamoncrolling.area += ",M0200160";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%BB%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내흥동":
			Albamoncrolling.area += ",M0200170";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%BB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대명동":
			Albamoncrolling.area += ",M0200180";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B4%EB%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야면":
			Albamoncrolling.area += ",M0200190";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B4%EB%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동흥남동":
			Albamoncrolling.area += ",M0200200";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B5%BF%C8%EF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동흥남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔율동":
			Albamoncrolling.area += ",M0200210";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B5%D0%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명산동":
			Albamoncrolling.area += ",M0200220";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B8%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			Albamoncrolling.area += ",M0200230";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미룡동":
			Albamoncrolling.area += ",M0200240";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%CC%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미원동":
			Albamoncrolling.area += ",M0200250";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%CC%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미장동":
			Albamoncrolling.area += ",M0200260";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%CC%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비응도동":
			Albamoncrolling.area += ",M0200270";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BA%F1%C0%C0%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비응도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사정동":
			Albamoncrolling.area += ",M0200280";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북동":
			Albamoncrolling.area += ",M0200290";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BB%EA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼학동":
			Albamoncrolling.area += ",M0200300";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BB%EF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서수면":
			Albamoncrolling.area += ",M0200310";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%AD%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서흥남동":
			Albamoncrolling.area += ",M0200320";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%AD%C8%EF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서흥남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선양동":
			Albamoncrolling.area += ",M0200330";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%B1%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산면":
			Albamoncrolling.area += ",M0200340";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소룡동":
			Albamoncrolling.area += ",M0200350";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%D2%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송창동":
			Albamoncrolling.area += ",M0200360";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%DB%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송풍동":
			Albamoncrolling.area += ",M0200370";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%DB%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			Albamoncrolling.area += ",M0200380";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신관동":
			Albamoncrolling.area += ",M0200390";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신영동":
			Albamoncrolling.area += ",M0200400";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			Albamoncrolling.area += ",M0200410";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신풍동":
			Albamoncrolling.area += ",M0200420";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			Albamoncrolling.area += ",M0200430";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			Albamoncrolling.area += ",M0200440";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영화동":
			Albamoncrolling.area += ",M0200450";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오룡동":
			Albamoncrolling.area += ",M0200460";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C0%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오식도동":
			Albamoncrolling.area += ",M0200470";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C0%BD%C4%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오식도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥구읍":
			Albamoncrolling.area += ",M0200480";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("옥구읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥도면":
			Albamoncrolling.area += ",M0200490";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산면":
			Albamoncrolling.area += ",M0200500";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥서면":
			Albamoncrolling.area += ",M0200510";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월명동":
			Albamoncrolling.area += ",M0200520";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%F9%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임피면":
			Albamoncrolling.area += ",M0200530";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C0%D3%C7%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("임피면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장미동":
			Albamoncrolling.area += ",M0200540";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C0%E5%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장재동":
			Albamoncrolling.area += ",M0200550";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C0%E5%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조촌동":
			Albamoncrolling.area += ",M0200560";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%B6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽성동":
			Albamoncrolling.area += ",M0200570";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%D7%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			Albamoncrolling.area += ",M0200580";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로1가":
			Albamoncrolling.area += ",M0200590";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로2가":
			Albamoncrolling.area += ",M0200600";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로3가":
			Albamoncrolling.area += ",M0200610";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡동":
			Albamoncrolling.area += ",M0200620";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창성동":
			Albamoncrolling.area += ",M0200630";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C3%A2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동":
			Albamoncrolling.area += ",M0200640";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해망동":
			Albamoncrolling.area += ",M0200650";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C7%D8%B8%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해망동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현면":
			Albamoncrolling.area += ",M0200660";
			AlbaHeavencrolling.area += "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C8%B8%C7%F6%B8";
			Mainpage.Filtering[Mainpage.index].setText("회현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈공동":
			Albamoncrolling.area += ",M0300010";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B0%A5%B0%F8%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("갈공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검산동":
			Albamoncrolling.area += ",M0300020";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B0%CB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("검산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공덕면":
			Albamoncrolling.area += ",M0300030";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B0%F8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("공덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광활면":
			Albamoncrolling.area += ",M0300040";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%A4%C8%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("광활면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			Albamoncrolling.area += ",M0300050";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금구면":
			Albamoncrolling.area += ",M0300060";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%DD%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산면":
			Albamoncrolling.area += ",M0300070";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%DD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난봉동":
			Albamoncrolling.area += ",M0300080";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B3%AD%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("난봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도장동":
			Albamoncrolling.area += ",M0300090";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B5%B5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만경읍":
			Albamoncrolling.area += ",M0300100";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B8%B8%B0%E6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("만경읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명덕동":
			Albamoncrolling.area += ",M0300110";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B8%ED%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백구면":
			Albamoncrolling.area += ",M0300120";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B9%E9%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백산면":
			Albamoncrolling.area += ",M0300130";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B9%E9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백학동":
			Albamoncrolling.area += ",M0300140";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B9%E9%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복죽동":
			Albamoncrolling.area += ",M0300150";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BA%B9%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉남면":
			Albamoncrolling.area += ",M0300160";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BA%C0%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부량면":
			Albamoncrolling.area += ",M0300170";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BA%CE%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동동":
			Albamoncrolling.area += ",M0300180";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BB%F3%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서암동":
			Albamoncrolling.area += ",M0300190";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%AD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서정동":
			Albamoncrolling.area += ",M0300200";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성덕면":
			Albamoncrolling.area += ",M0300210";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%BA%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순동":
			Albamoncrolling.area += ",M0300220";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡동":
			Albamoncrolling.area += ",M0300230";
			AlbaHeavencrolling.area += "C063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신덕동":
			Albamoncrolling.area += ",M0300240";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			Albamoncrolling.area += ",M0300250";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김제시신풍동":
			Albamoncrolling.area += ",M0300260";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("김제시신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양전동":
			Albamoncrolling.area += ",M0300270";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BE%E7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연정동":
			Albamoncrolling.area += ",M0300280";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%AC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오정동":
			Albamoncrolling.area += ",M0300290";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%C0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산동":
			Albamoncrolling.area += ",M0300300";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "요촌동":
			Albamoncrolling.area += ",M0300310";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%E4%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("요촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			Albamoncrolling.area += ",M0300320";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용지면":
			Albamoncrolling.area += ",M0300330";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%EB%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월봉동":
			Albamoncrolling.area += ",M0300340";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%F9%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월성동":
			Albamoncrolling.area += ",M0300350";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입석동":
			Albamoncrolling.area += ",M0300360";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C0%D4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("입석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장화동":
			Albamoncrolling.area += ",M0300370";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C0%E5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제월동":
			Albamoncrolling.area += ",M0300380";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C1%A6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("제월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽산면":
			Albamoncrolling.area += ",M0300390";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C1%D7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("죽산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진봉면":
			Albamoncrolling.area += ",M0300400";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C1%F8%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청하면":
			Albamoncrolling.area += ",M0300410";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C3%BB%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			Albamoncrolling.area += ",M0300420";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황산동":
			Albamoncrolling.area += ",M0300430";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C8%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황산면":
			Albamoncrolling.area += ",M0300440";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C8%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("황산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥사동":
			Albamoncrolling.area += ",M0300450";
			AlbaHeavencrolling.area += "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C8%EF%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흥사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈치동":
			Albamoncrolling.area += ",M0400030";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B0%A5%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고죽동":
			Albamoncrolling.area += ",M0400040";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B0%ED%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광치동":
			Albamoncrolling.area += ",M0400050";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B1%A4%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원시금동":
			Albamoncrolling.area += ",M0400060";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남원시금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금지면":
			Albamoncrolling.area += ",M0400070";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B1%DD%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내척동":
			Albamoncrolling.area += ",M0400080";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B3%BB%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노암동":
			Albamoncrolling.area += ",M0400090";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B3%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대강면":
			Albamoncrolling.area += ",M0400100";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B4%EB%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원시대산면":
			Albamoncrolling.area += ",M0400110";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남원시대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕과면":
			Albamoncrolling.area += ",M0400120";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B4%F6%B0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕과면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도통동":
			Albamoncrolling.area += ",M0400130";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B5%B5%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동충동":
			Albamoncrolling.area += ",M0400140";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B5%BF%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보절면":
			Albamoncrolling.area += ",M0400150";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BA%B8%C0%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("보절면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사매면":
			Albamoncrolling.area += ",M0400160";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%E7%B8%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사매면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			Albamoncrolling.area += ",M0400170";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산내면":
			Albamoncrolling.area += ",M0400180";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산동면":
			Albamoncrolling.area += ",M0400190";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%EA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송동면":
			Albamoncrolling.area += ",M0400200";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BC%DB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("송동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수지면":
			Albamoncrolling.area += ",M0400210";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BC%F6%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식정동":
			Albamoncrolling.area += ",M0400220";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%C4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("식정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원시신정동":
			Albamoncrolling.area += ",M0400230";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남원시 신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			Albamoncrolling.area += ",M0400240";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍교동":
			Albamoncrolling.area += ",IM0400250";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아영면":
			Albamoncrolling.area += ",M0400260";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BE%C6%BF%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("아영면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어현동":
			Albamoncrolling.area += ",M0400270";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BE%EE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕정동":
			Albamoncrolling.area += ",M0400280";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("왕정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용정동":
			Albamoncrolling.area += ",M0400290";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운봉읍":
			Albamoncrolling.area += ",M0400300";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%EE%BA%C0%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("운봉읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월락동":
			Albamoncrolling.area += ",M0400310";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%F9%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이백면":
			Albamoncrolling.area += ",M0400320";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C0%CC%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인월면":
			Albamoncrolling.area += ",M0400330";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C0%CE%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("인월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조산동":
			Albamoncrolling.area += ",M0400340";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주생면":
			Albamoncrolling.area += ",M0400350";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%D6%BB%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주생면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주천면":
			Albamoncrolling.area += ",M0400360";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽항동":
			Albamoncrolling.area += ",M0400370";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%D7%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천거동":
			Albamoncrolling.area += ",M0400380";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C3%B5%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하정동":
			Albamoncrolling.area += ",M0400390";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C7%CF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향교동":
			Albamoncrolling.area += ",M0400010";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C7%E2%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("향교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정동":
			Albamoncrolling.area += ",M0400020";
			AlbaHeavencrolling.area += "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무주읍":
			Albamoncrolling.area += ",M0500010";
			AlbaHeavencrolling.area += "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%B9%AB%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("무주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무풍면":
			Albamoncrolling.area += ",M0500020";
			AlbaHeavencrolling.area += "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%B9%AB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("무풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부남면":
			Albamoncrolling.area += ",M0500030";
			AlbaHeavencrolling.area += "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%BA%CE%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설천면":
			Albamoncrolling.area += ",M0500040";
			AlbaHeavencrolling.area += "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%BC%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("설천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성면":
			Albamoncrolling.area += ",M0500050";
			AlbaHeavencrolling.area += "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%BE%C8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적상면":
			Albamoncrolling.area += ",M0500060";
			AlbaHeavencrolling.area += "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%C0%FB%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("적상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계화면":
			Albamoncrolling.area += ",M0600010";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%B0%E8%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("계화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동진면":
			Albamoncrolling.area += ",M0600020";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%B5%BF%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부안군백산면":
			Albamoncrolling.area += ",M0600030";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%B9%E9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부안군백산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "변산면":
			Albamoncrolling.area += ",M0600040";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BA%AF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("변산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보안면":
			Albamoncrolling.area += ",M0600050";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BA%B8%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("보안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부안읍":
			Albamoncrolling.area += ",M0600060";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BA%CE%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("부안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상서면":
			Albamoncrolling.area += ",M0600070";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BB%F3%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위도면":
			Albamoncrolling.area += ",M0600080";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C0%A7%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("위도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주산면":
			Albamoncrolling.area += ",M0600090";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C1%D6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "줄포면":
			Albamoncrolling.area += ",M0600100";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C1%D9%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("줄포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진서면":
			Albamoncrolling.area += ",M0600110";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C1%F8%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하서면":
			Albamoncrolling.area += ",M0600120";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C7%CF%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행안면":
			Albamoncrolling.area += ",M0600130";
			AlbaHeavencrolling.area += "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C7%E0%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("행안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구림면":
			Albamoncrolling.area += ",M0700010";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%B1%B8%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금과면":
			Albamoncrolling.area += ",M0700020";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%B1%DD%B0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금과면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동계면":
			Albamoncrolling.area += ",M0700030";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%B5%BF%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복흥면":
			Albamoncrolling.area += ",M0700040";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%BA%B9%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("복흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순창읍":
			Albamoncrolling.area += ",M0700050";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%BC%F8%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("순창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍치면":
			Albamoncrolling.area += ",M0700060";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%BD%D6%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("쌍치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유등면":
			Albamoncrolling.area += ",M0700070";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C0%AF%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("유등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인계면":
			Albamoncrolling.area += ",M0700080";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C0%CE%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("인계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적성면":
			Albamoncrolling.area += ",M0700090";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("적성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔덕면":
			Albamoncrolling.area += ",M0700100";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C6%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("팔덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산면":
			Albamoncrolling.area += ",M0700110";
			AlbaHeavencrolling.area += "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C7%B3%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("풍산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경천면":
			Albamoncrolling.area += ",M0800010";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B0%E6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("경천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고산면":
			Albamoncrolling.area += ",M0800020";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B0%ED%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구이면":
			Albamoncrolling.area += ",M0800030";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B1%B8%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동상면":
			Albamoncrolling.area += ",M0800040";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B5%BF%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉동읍":
			Albamoncrolling.area += ",M0800050";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BA%C0%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("봉동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉면":
			Albamoncrolling.area += ",M0800060";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BA%F1%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("비봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼례읍":
			Albamoncrolling.area += ",M0800070";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BB%EF%B7%CA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("삼례읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상관면":
			Albamoncrolling.area += ",M0800080";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BB%F3%B0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상관면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양면":
			Albamoncrolling.area += ",M0800090";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BC%D2%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용진읍":
			Albamoncrolling.area += ",M0800100";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BF%EB%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운주면":
			Albamoncrolling.area += ",M0800110";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BF%EE%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("운주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이서면":
			Albamoncrolling.area += ",M0800120";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%C0%CC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산면":
			Albamoncrolling.area += ",M0800130";
			AlbaHeavencrolling.area += "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%C8%AD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			Albamoncrolling.area += ",M0900010";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금강동":
			Albamoncrolling.area += ",M0900020";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B1%DD%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금마면":
			Albamoncrolling.area += ",M0900030";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B1%DD%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남중동":
			Albamoncrolling.area += ",M0900040";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B3%B2%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낭산면":
			Albamoncrolling.area += ",M0900050";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B3%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("낭산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕기동":
			Albamoncrolling.area += ",M0900060";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B4%F6%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			Albamoncrolling.area += ",M0900070";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마동":
			Albamoncrolling.area += ",M0900080";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만석동":
			Albamoncrolling.area += ",M0900090";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%B8%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망성면":
			Albamoncrolling.area += ",M0900100";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%C1%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("망성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모현동1가":
			Albamoncrolling.area += ",M0900120";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%F0%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("모현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모현동2가":
			Albamoncrolling.area += ",M0900130";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%F0%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("모현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목천동":
			Albamoncrolling.area += ",M0900140";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부송동":
			Albamoncrolling.area += ",M0900150";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BA%CE%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼기면":
			Albamoncrolling.area += ",M0900160";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BB%EF%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석암동":
			Albamoncrolling.area += ",M0900170";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%AE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석왕동":
			Albamoncrolling.area += ",M0900180";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%AE%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석탄동":
			Albamoncrolling.area += ",M0900190";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%AE%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성당면":
			Albamoncrolling.area += ",M0900200";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%BA%B4%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성당면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동":
			Albamoncrolling.area += ",M0900210";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%DB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			Albamoncrolling.area += ",M0900220";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신용동":
			Albamoncrolling.area += ",M0900230";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BD%C5%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익산시신흥동":
			Albamoncrolling.area += ",M0900240";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("익산시신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어양동":
			Albamoncrolling.area += ",M0900250";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BE%EE%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여산면":
			Albamoncrolling.area += ",M0900260";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%A9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("여산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등동":
			Albamoncrolling.area += ",M0900270";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%B5%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산면":
			Albamoncrolling.area += ",M0900280";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("오산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕궁면":
			Albamoncrolling.area += ",M0900290";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%D5%B1%C3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("왕궁면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동면":
			Albamoncrolling.area += ",M0900300";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용안면":
			Albamoncrolling.area += ",M0900310";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%EB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용제동":
			Albamoncrolling.area += ",M0900320";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%EB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅포면":
			Albamoncrolling.area += ",M0900330";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%F5%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("웅포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익산시월성동":
			Albamoncrolling.area += ",M0900340";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("익산시월성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은기동":
			Albamoncrolling.area += ",M0900350";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%BA%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인화동":
			Albamoncrolling.area += ",M0900360";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%CE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인화동1가":
			Albamoncrolling.area += ",M0900370";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%CE%C8%AD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인화동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인화동2가":
			Albamoncrolling.area += ",M0900380";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%CE%C8%AD%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인화동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임상동":
			Albamoncrolling.area += ",M0900390";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%D3%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("임상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정족동":
			Albamoncrolling.area += ",M0900400";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%A4%C1%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정족동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주현동":
			Albamoncrolling.area += ",M0900410";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%D6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",M0900420";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			Albamoncrolling.area += ",M0900430";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			Albamoncrolling.area += ",M0900440";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			Albamoncrolling.area += ",M0900450";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창인동1가":
			Albamoncrolling.area += ",M0900470";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C3%A2%C0%CE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창인동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창인동2가":
			Albamoncrolling.area += ",M0900480";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C3%A2%C0%CE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창인동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘포면":
			Albamoncrolling.area += ",M0900490";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C3%E1%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("춘포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔봉동":
			Albamoncrolling.area += ",M0900500";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C6%C8%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익산시평화동":
			Albamoncrolling.area += ",M0900510";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("익산시평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함라면":
			Albamoncrolling.area += ",M0900520";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C7%D4%B6%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("함라면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함열읍":
			Albamoncrolling.area += ",M0900530";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C7%D4%BF%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("함열읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현영동":
			Albamoncrolling.area += ",M0900540";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C7%F6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황등면":
			Albamoncrolling.area += ",M0900550";
			AlbaHeavencrolling.area += "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C8%B2%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("황등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강진면":
			Albamoncrolling.area += ",M1000010";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%B0%AD%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관촌면":
			Albamoncrolling.area += ",M1000020";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%B0%FC%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("관촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕치면":
			Albamoncrolling.area += ",M1000030";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%B4%F6%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼계면":
			Albamoncrolling.area += ",M1000040";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BB%EF%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수면":
			Albamoncrolling.area += ",M1000050";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BC%BA%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신덕면":
			Albamoncrolling.area += ",M1000060";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BD%C5%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평면":
			Albamoncrolling.area += ",M1000070";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BD%C5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오수면":
			Albamoncrolling.area += ",M1000080";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BF%C0%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("오수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운암면":
			Albamoncrolling.area += ",M1000090";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BF%EE%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("운암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임실읍":
			Albamoncrolling.area += ",M1000100";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%C0%D3%BD%C7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("임실읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지사면":
			Albamoncrolling.area += ",M1000110";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%C1%F6%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청웅면":
			Albamoncrolling.area += ",M1000120";
			AlbaHeavencrolling.area += "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%C3%BB%BF%F5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청웅면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계남면":
			Albamoncrolling.area += ",M1100010";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%B0%E8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("계남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계북면":
			Albamoncrolling.area += ",M1100020";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%B0%E8%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("계북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번암면":
			Albamoncrolling.area += ",M1100030";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%B9%F8%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("번암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산서면":
			Albamoncrolling.area += ",M1100040";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%BB%EA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장계면":
			Albamoncrolling.area += ",M1100050";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%C0%E5%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장수읍":
			Albamoncrolling.area += ",M1100060";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%C0%E5%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("장수읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천천면":
			Albamoncrolling.area += ",M1100070";
			AlbaHeavencrolling.area += "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%C3%B5%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("천천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강흥동":
			Albamoncrolling.area += ",M1200010";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B0%AD%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고랑동":
			Albamoncrolling.area += ",M1200020";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B0%ED%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금상동":
			Albamoncrolling.area += ",M1200030";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암1동":
			Albamoncrolling.area += ",M1200040";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암2동":
			Albamoncrolling.area += ",M1200050";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시금암동":
			Albamoncrolling.area += ",M1200060";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전주시금암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남정동":
			Albamoncrolling.area += ",M1200070";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B3%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진동1가":
			Albamoncrolling.area += ",M1200080";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B4%F6%C1%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("덕진동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진동2가":
			Albamoncrolling.area += ",M1200090";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B4%F6%C1%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("덕진동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도덕동":
			Albamoncrolling.area += ",M1200100";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B5%B5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도도동":
			Albamoncrolling.area += ",M1200110";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B5%B5%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시동산동":
			Albamoncrolling.area += ",M1200120";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전주시동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만성동":
			Albamoncrolling.area += ",M1200130";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B8%B8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			Albamoncrolling.area += ",M1200140";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정동":
			Albamoncrolling.area += ",M1200150";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성덕동":
			Albamoncrolling.area += ",M1200160";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BC%BA%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동1가":
			Albamoncrolling.area += ",M1200170";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BC%DB%C3%B5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송천동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동2가":
			Albamoncrolling.area += ",M1200180";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BC%DB%C3%B5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송천동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여의동":
			Albamoncrolling.area += ",M1200190";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%A9%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시용정동":
			Albamoncrolling.area += ",M1200200";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전주시용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우아동1가":
			Albamoncrolling.area += "M1200220";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EC%BE%C6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("우아동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우아동2가":
			Albamoncrolling.area += ",M1200230";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EC%BE%C6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("우아동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우아동3가":
			Albamoncrolling.area += ",M1200235";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EC%BE%C6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("우아동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			Albamoncrolling.area += ",M1200240";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인후동1가":
			Albamoncrolling.area += ",M1200250";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%CE%C8%C4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인후동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인후동2가":
			Albamoncrolling.area += ",M1200260";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%CE%C8%C4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("인후동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동":
			Albamoncrolling.area += ",M1200270";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전미동1가":
			Albamoncrolling.area += ",M1200280";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%FC%B9%CC%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("전미동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전미동2가":
			Albamoncrolling.area += ",M1200290";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%FC%B9%CC%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("전미동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중동":
			Albamoncrolling.area += ",M1200310";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전주시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진북동":
			Albamoncrolling.area += ",M1200300";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C1%F8%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동1가":
			Albamoncrolling.area += ",M1200310";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동2가":
			Albamoncrolling.area += ",M1200320";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동3가":
			Albamoncrolling.area += ",M1200330";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔복동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔복동4가":
			Albamoncrolling.area += ",M1200340";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔복동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호성동1가":
			Albamoncrolling.area += ",M1200350";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%A3%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("호성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호성동2가":
			Albamoncrolling.area += ",M1200360";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%A3%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("호성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호성동3가":
			Albamoncrolling.area += ",M1200370";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%A3%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("호성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			Albamoncrolling.area += ",M1200380";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경원동1가":
			Albamoncrolling.area += ",M1300010";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%E6%BF%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("경원동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경원동2가":
			Albamoncrolling.area += ",M1300020";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%E6%BF%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("경원동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경원동3가":
			Albamoncrolling.area += ",M1300030";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%E6%BF%F8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("경원동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고사동":
			Albamoncrolling.area += ",M1300040";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%ED%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시교동":
			Albamoncrolling.area += ",M1300050";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전주시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남노송동":
			Albamoncrolling.area += ",M1300060";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B3%B2%B3%EB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남노송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동1가":
			Albamoncrolling.area += ",M1300070";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("다가동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동2가":
			Albamoncrolling.area += ",M1300080";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("다가동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동3가":
			Albamoncrolling.area += ",M1300090";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("다가동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동4가":
			Albamoncrolling.area += ",M1300100";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("다가동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			Albamoncrolling.area += ",M1300110";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동서학동":
			Albamoncrolling.area += ",M1300120";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B5%BF%BC%AD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동서학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동완산동":
			Albamoncrolling.area += ",M1300130";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B5%BF%BF%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동완산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동1가":
			Albamoncrolling.area += ",M1300140";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%EF%C3%B5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼천동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동2가":
			Albamoncrolling.area += ",M1300150";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%EF%C3%B5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼천동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동3가":
			Albamoncrolling.area += ",M1300160";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%EF%C3%B5%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼천동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상림동":
			Albamoncrolling.area += ",M1300170";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%F3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "색장동":
			Albamoncrolling.area += ",M1300180";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%F6%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("색장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서노송동":
			Albamoncrolling.area += ",M1300190";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%B3%EB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서노송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서서학동":
			Albamoncrolling.area += ",M1300200";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BC%AD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서서학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서신동":
			Albamoncrolling.area += ",M1300210";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서완산동1가":
			Albamoncrolling.area += ",M1300220";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BF%CF%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서완산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서완산동2가":
			Albamoncrolling.area += ",M1300230";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BF%CF%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("서완산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석구동":
			Albamoncrolling.area += ",M1300240";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AE%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용복동":
			Albamoncrolling.area += ",M1300250";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BF%EB%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			Albamoncrolling.area += ",M1300260";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동":
			Albamoncrolling.area += ",M1300270";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동3가":
			Albamoncrolling.area += ",M1300280";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C0%FC%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("전동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중노송동":
			Albamoncrolling.area += ",M1300290";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%B3%EB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중노송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중앙동1가":
			Albamoncrolling.area += ",M1300310";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("전주시중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중앙동2가":
			Albamoncrolling.area += ",M1300320";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("전주시중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전주시중앙동3가":
			Albamoncrolling.area += ",M1300330";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("전주시중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동4가":
			Albamoncrolling.area += ",M130340";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중인동":
			Albamoncrolling.area += ",M1300350";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화산동1가":
			Albamoncrolling.area += ",M1300360";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%C8%AD%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중화산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화산동2가":
			Albamoncrolling.area += ",M1300370";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%C8%AD%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중화산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			Albamoncrolling.area += ",M1300380";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동1가":
			Albamoncrolling.area += ",M1300390";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("평화동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동2가":
			Albamoncrolling.area += ",M1300400";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("평화동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동3가":
			Albamoncrolling.area += ",M1300410";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("평화동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍남동1가":
			Albamoncrolling.area += ",M1300420";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C7%B3%B3%B2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("풍남동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍남동2가":
			Albamoncrolling.area += ",M1300430";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C7%B3%B3%B2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("풍남동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍남동3가":
			Albamoncrolling.area += ",M1300440";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C7%B3%B3%B2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("풍남동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동1가":
			Albamoncrolling.area += ",M1300450";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("효자동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동2가":
			Albamoncrolling.area += ",M1300460";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("효자동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동3가":
			Albamoncrolling.area += ",M1300470";
			AlbaHeavencrolling.area += "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("효자동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감곡면":
			Albamoncrolling.area += ",M1400010";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%A8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("감곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고부면":
			Albamoncrolling.area += ",M1400020";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%ED%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			Albamoncrolling.area += ",M1400030";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과교동":
			Albamoncrolling.area += ",M1400040";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%FA%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("과교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교암동":
			Albamoncrolling.area += ",M1400050";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B1%B3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구룡동":
			Albamoncrolling.area += ",M1400060";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B1%B8%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금붕동":
			Albamoncrolling.area += ",M1400070";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B1%DD%BA%D8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금붕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내장동":
			Albamoncrolling.area += ",M1400080";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B3%BB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농소동":
			Albamoncrolling.area += ",M1400090";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B3%F3%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("농소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕천면":
			Albamoncrolling.area += ",M1400100";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B4%F6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망제동":
			Albamoncrolling.area += ",M1400110";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B8%C1%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부전동":
			Albamoncrolling.area += ",M1400120";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BA%CE%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			Albamoncrolling.area += ",M1400130";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정읍시산내면":
			Albamoncrolling.area += ",M1400140";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정읍시산내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산외면":
			Albamoncrolling.area += ",M1400150";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산동":
			Albamoncrolling.area += ",M1400160";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%EF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			Albamoncrolling.area += ",M1400170";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상평동":
			Albamoncrolling.area += ",M1400180";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%F3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소성면":
			Albamoncrolling.area += ",M1400190";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BC%D2%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			Albamoncrolling.area += ",M1400200";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동":
			Albamoncrolling.area += ",M1400210";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BC%F6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시기동":
			Albamoncrolling.area += ",M1400250";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C3%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정읍시신월동":
			Albamoncrolling.area += ",M1400260";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정읍시신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정동":
			Albamoncrolling.area += ",M1400270";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신태인읍":
			Albamoncrolling.area += ",M1400280";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C5%C5%C2%C0%CE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("신태인읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍암동":
			Albamoncrolling.area += ",M1400290";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%D6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			Albamoncrolling.area += ",M1400300";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영원면":
			Albamoncrolling.area += ",M1400310";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%B5%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영파동":
			Albamoncrolling.area += ",M1400320";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%B5%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옹동면":
			Albamoncrolling.area += ",M1400330";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%CB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옹동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용계동":
			Albamoncrolling.area += ",M1400340";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			Albamoncrolling.area += ",M1400350";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이평면":
			Albamoncrolling.area += ",M1400360";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C0%CC%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입암면":
			Albamoncrolling.area += ",M1400370";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C0%D4%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("입암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장명동":
			Albamoncrolling.area += ",M1400380";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C0%E5%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정우면":
			Albamoncrolling.area += ",M1400390";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C1%A4%BF%EC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정우면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진산동":
			Albamoncrolling.area += ",M1400400";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C1%F8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초산동":
			Albamoncrolling.area += ",M1400240";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C3%CA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠보면":
			Albamoncrolling.area += ",M1400410";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C4%A5%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("칠보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태인면":
			Albamoncrolling.area += ",M1400420";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C5%C2%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("태인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하모동":
			Albamoncrolling.area += ",M1400430";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C7%CF%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하북동":
			Albamoncrolling.area += ",M1400440";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C7%CF%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑암동":
			Albamoncrolling.area += ",M1400450";
			AlbaHeavencrolling.area += "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C8%E6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흑암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동향면":
			Albamoncrolling.area += ",M1500010";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%B5%BF%C7%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동향면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마령면":
			Albamoncrolling.area += ",M1500020";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%B8%B6%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운면":
			Albamoncrolling.area += ",M1500030";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%B9%E9%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부귀면":
			Albamoncrolling.area += ",M1500040";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BA%CE%B1%CD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부귀면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상전면":
			Albamoncrolling.area += ",M1500050";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BB%F3%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안군성수면":
			Albamoncrolling.area += ",M1500060";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BC%BA%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진안군성수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안천면":
			Albamoncrolling.area += ",M1500070";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BE%C8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담면":
			Albamoncrolling.area += ",M1500080";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BF%EB%B4%E3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용담면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정천면":
			Albamoncrolling.area += "M1500090";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%C1%A4%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안군주천면":
			Albamoncrolling.area += ",M1500100";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진안군주천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안읍":
			Albamoncrolling.area += ",M1500110";
			AlbaHeavencrolling.area += "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%C1%F8%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
