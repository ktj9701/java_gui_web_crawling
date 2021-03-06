package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Gyeongnam2 {
	public boolean flag;

	public void Gyeongnam2City(ActionEvent e) {
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

		// 창원시 마산합포구
		case "가포동":
			Albamoncrolling.area += ",C1600010";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B0%A1%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교방동":
			Albamoncrolling.area += ",C1600020";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B1%B3%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교원동":
			Albamoncrolling.area += ",C1600030";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B1%B3%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산면":
			Albamoncrolling.area += ",C1600040";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B1%B8%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남성동":
			Albamoncrolling.area += ",C1600080";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B3%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대내동":
			Albamoncrolling.area += ",C1600100";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동1가":
			Albamoncrolling.area += ",C1600120";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동2가":
			Albamoncrolling.area += ",C1600130";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대외동":
			Albamoncrolling.area += ",C1600140";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창동":
			Albamoncrolling.area += ",C1600150";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕동동":
			Albamoncrolling.area += ",C1600160";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%F6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동성동":
			Albamoncrolling.area += ",C1600170";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%BF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두월동1가":
			Albamoncrolling.area += ",C1600190";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%CE%BF%F9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("두월동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두월동2가":
			Albamoncrolling.area += ",C1600200";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%CE%BF%F9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("두월동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두월동3가":
			Albamoncrolling.area += ",C1600210";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%CE%BF%F9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("두월동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			Albamoncrolling.area += ",C1600230";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			Albamoncrolling.area += ",C1600240";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			Albamoncrolling.area += ",C1600260";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산호동":
			Albamoncrolling.area += ",C1600290";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BB%EA%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상남동":
			Albamoncrolling.area += ",C1600320";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BB%F3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서성동":
			Albamoncrolling.area += ",C1600330";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BC%AD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성호동":
			Albamoncrolling.area += ",C1600370";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BC%BA%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수성동":
			Albamoncrolling.area += ",C1600380";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			Albamoncrolling.area += ",C1600390";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			Albamoncrolling.area += ",C1600400";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신포동1가":
			Albamoncrolling.area += ",C1600420";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신포동2가":
			Albamoncrolling.area += ",C1600430";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			Albamoncrolling.area += ",C1600440";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예곡동":
			Albamoncrolling.area += ",C1600480";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%B9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("예곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오동동":
			Albamoncrolling.area += ",C1600490";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%C0%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완월동":
			Albamoncrolling.area += ",C1600500";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%CF%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("완월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우산동":
			Albamoncrolling.area += ",C1600510";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동1가":
			Albamoncrolling.area += ",C1600530";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("월남동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동2가":
			Albamoncrolling.area += ",C1600540";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("월남동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동3가":
			Albamoncrolling.area += ",C1600550";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("월남동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동4가":
			Albamoncrolling.area += ",C1600560";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("월남동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동5가":
			Albamoncrolling.area += ",C1600570";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("월남동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월영동":
			Albamoncrolling.area += ",C1600600";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월포동":
			Albamoncrolling.area += ",C1600610";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유록동":
			Albamoncrolling.area += ",C1600620";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%AF%B7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유록동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자산동":
			Albamoncrolling.area += ",C1600630";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%DA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동1가":
			Albamoncrolling.area += ",C1600650";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장군동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동2가":
			Albamoncrolling.area += ",C1600660";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장군동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동3가":
			Albamoncrolling.area += ",C1600670";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장군동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동4가":
			Albamoncrolling.area += ",C1600680";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장군동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장군동5가":
			Albamoncrolling.area += ",C1600690";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("장군동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중성동":
			Albamoncrolling.area += ",C1600700";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			Albamoncrolling.area += ",C1600720";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			Albamoncrolling.area += ",C1600730";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			Albamoncrolling.area += ",C1600740";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진동면":
			Albamoncrolling.area += ",C1600750";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%F8%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진북면":
			Albamoncrolling.area += ",C1600760";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%F8%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진전면":
			Albamoncrolling.area += ",C1600770";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%F8%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			Albamoncrolling.area += ",C1600780";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동1가":
			Albamoncrolling.area += ",C1600800";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동2가":
			Albamoncrolling.area += ",C1600810";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동3가":
			Albamoncrolling.area += ",C1600820";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("창포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청계동":
			Albamoncrolling.area += ",C1600830";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추산동":
			Albamoncrolling.area += ",C1600840";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("추산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동":
			Albamoncrolling.area += ",C1600850";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해운동":
			Albamoncrolling.area += ",C1600890";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C7%D8%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현동":
			Albamoncrolling.area += ",C1600900";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍문동":
			Albamoncrolling.area += ",C1600910";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C8%AB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화영동":
			Albamoncrolling.area += ",C1600920";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C8%AD%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 창원시 마산회원구
		case "구암동":
			Albamoncrolling.area += ",C1620070";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암1동":
			Albamoncrolling.area += ",C1620050";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B1%B8%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구암2동":
			Albamoncrolling.area += "C1620060";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B1%B8%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내서읍":
			Albamoncrolling.area += ",C1620090";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B3%BB%BC%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("내서읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두척동":
			Albamoncrolling.area += ",C1620220";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B5%CE%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉암동":
			Albamoncrolling.area += ",C1620250";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BA%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석전동":
			Albamoncrolling.area += ",C1620360";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BC%AE%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석전1동":
			Albamoncrolling.area += ",C1620340";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BC%AE%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석전2동":
			Albamoncrolling.area += ",C1620350";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BC%AE%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕동":
			Albamoncrolling.area += ",C1620470";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BE%E7%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕1동":
			Albamoncrolling.area += ",C1620450";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BE%E7%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕2동":
			Albamoncrolling.area += ",C1620460";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BE%E7%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합성동":
			Albamoncrolling.area += ",C1620880";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C7%D5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("합성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합성1동":
			Albamoncrolling.area += ",C1620860";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C7%D5%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("합성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합성2동":
			Albamoncrolling.area += ",C1620870";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C7%D5%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("합성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회성동":
			Albamoncrolling.area += ",C1620930";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회원동":
			Albamoncrolling.area += ",C1620960";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회원1동":
			Albamoncrolling.area += ",C1620940";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회원2동":
			Albamoncrolling.area += ",C1620950";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 창원시 성산구
		case "가음동":
			Albamoncrolling.area += ",C1640010";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B0%A1%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가음정동":
			Albamoncrolling.area += ",C1640020";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B0%A1%C0%BD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가음정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀곡동":
			Albamoncrolling.area += ",C1640030";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B1%CD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귀곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀산동":
			Albamoncrolling.area += ",C1640040";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B1%CD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귀산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀현동":
			Albamoncrolling.area += ",C1640050";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B1%CD%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귀현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			Albamoncrolling.area += ",C1640060";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양동":
			Albamoncrolling.area += ",C1640070";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남지동":
			Albamoncrolling.area += ",C1640080";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%B2%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			Albamoncrolling.area += ",C1640090";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대방동":
			Albamoncrolling.area += ",C1640110";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반림동":
			Albamoncrolling.area += ",C1640220";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B9%DD%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송동":
			Albamoncrolling.area += ",C1640230";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B9%DD%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반지동":
			Albamoncrolling.area += ",C1640240";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B9%DD%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불모산동":
			Albamoncrolling.area += ",C1640290";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BA%D2%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불모산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사파동":
			Albamoncrolling.area += ",C1640310";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%E7%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사파정동":
			Albamoncrolling.area += ",C1640320";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%E7%C6%C4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사파정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정자동":
			Albamoncrolling.area += ",C1640350";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%EF%C1%A4%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창원시상남동":
			Albamoncrolling.area += ",C1640360";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%F3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창원시상남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상복동":
			Albamoncrolling.area += ",C1640370";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%F3%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산동":
			Albamoncrolling.area += ",C1640400";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BC%BA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성주동":
			Albamoncrolling.area += ",C1640410";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BC%BA%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			Albamoncrolling.area += ",C1640450";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안민동":
			Albamoncrolling.area += ",C1640460";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BE%C8%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양곡동":
			Albamoncrolling.area += ",C1640470";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BE%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완암동":
			Albamoncrolling.area += ",C1640490";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%CF%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("완암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외동":
			Albamoncrolling.area += ",C1640500";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅남동":
			Albamoncrolling.area += ",C1640540";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%F5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("웅남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월림동":
			Albamoncrolling.area += ",C1640550";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%F9%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적현동":
			Albamoncrolling.area += ",C1640560";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C0%FB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("적현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",C1640580";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창곡동":
			Albamoncrolling.area += ",C1640610";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C3%A2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천선동":
			Albamoncrolling.area += ",C1640620";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C3%B5%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토월동":
			Albamoncrolling.area += ",C1640630";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C5%E4%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 창원시 의창구
		case "내리동":
			Albamoncrolling.area += ",C1660100";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B3%BB%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대산면":
			Albamoncrolling.area += ",C1660120";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대원동":
			Albamoncrolling.area += ",C1660130";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B4%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕정동":
			Albamoncrolling.area += ",C1660140";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B4%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도계동":
			Albamoncrolling.area += ",C1660150";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%B5%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동읍":
			Albamoncrolling.area += ",C1660160";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동정동":
			Albamoncrolling.area += ",C1660170";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%BF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두대동":
			Albamoncrolling.area += ",C1660180";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%CE%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명곡동":
			Albamoncrolling.area += ",C1660190";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B8%ED%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명서동":
			Albamoncrolling.area += ",C1660200";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B8%ED%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반계동":
			Albamoncrolling.area += ",C1660210";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B9%DD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉곡동":
			Albamoncrolling.area += ",C1660250";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉림동":
			Albamoncrolling.area += ",C1660260";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%C0%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북동":
			Albamoncrolling.area += ",C1660270";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			Albamoncrolling.area += ",C1660280";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사림동":
			Albamoncrolling.area += ",C1660300";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BB%E7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사화동":
			Albamoncrolling.area += ",C1660330";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BB%E7%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동동":
			Albamoncrolling.area += ",C1660340";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BB%EF%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서곡동":
			Albamoncrolling.area += ",C1660380";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서상동":
			Albamoncrolling.area += ",C1660390";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%AD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소계동":
			Albamoncrolling.area += ",C1660420";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%D2%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소답동":
			Albamoncrolling.area += ",C1660430";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%D2%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의창구신월동":
			Albamoncrolling.area += ",C1660440";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("의창구신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			Albamoncrolling.area += ",C1660510";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용지동":
			Albamoncrolling.area += ",C1660520";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BF%EB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용호동":
			Albamoncrolling.area += ",C1660530";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BF%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			Albamoncrolling.area += ",C1660570";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지귀동":
			Albamoncrolling.area += ",C1660590";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C1%F6%B1%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지귀동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "차룡동":
			Albamoncrolling.area += ",C1660600";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C2%F7%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("차룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴촌동":
			Albamoncrolling.area += ",C1660640";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C5%F0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("퇴촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔용동":
			Albamoncrolling.area += ",C1660650";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C6%C8%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 창원시 진해구
		case "가중동":
			Albamoncrolling.area += ",C1680010";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B0%A1%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경화동":
			Albamoncrolling.area += ",C1680020";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B0%E6%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광화동":
			Albamoncrolling.area += ",C1680030";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B1%A4%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근화동":
			Albamoncrolling.area += ",C1680040";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B1%D9%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("근화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문동":
			Albamoncrolling.area += ",C1680050";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B3%B2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText(",남문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남빈동":
			Albamoncrolling.area += ",C1680060";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B3%B2%BA%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남빈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구남양동":
			Albamoncrolling.area += ",C1680070";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진해구남양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대영동":
			Albamoncrolling.area += ",C1680080";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대장동":
			Albamoncrolling.area += ",C1680090";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대죽동":
			Albamoncrolling.area += ",C1680100";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천동":
			Albamoncrolling.area += ",C1680110";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			Albamoncrolling.area += ",C1680120";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산동":
			Albamoncrolling.area += ",C1680130";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도만동":
			Albamoncrolling.area += ",C1680140";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%B5%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도천동":
			Albamoncrolling.area += ",C1680150";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동상동":
			Albamoncrolling.area += ",C1680160";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%BF%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두동":
			Albamoncrolling.area += ",C1680170";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천동":
			Albamoncrolling.area += ",C1680180";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B8%B6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동":
			Albamoncrolling.area += ",C1680190";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무송동":
			Albamoncrolling.area += ",C1680200";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B9%AB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부흥동":
			Albamoncrolling.area += ",C1680210";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북부동":
			Albamoncrolling.area += ",C1680220";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BA%CF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉동":
			Albamoncrolling.area += ",C1680230";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BA%F1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서중동":
			Albamoncrolling.area += ",C1680240";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%AD%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석동":
			Albamoncrolling.area += ",C1680250";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			Albamoncrolling.area += ",C1680260";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			Albamoncrolling.area += ",C1680270";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속천동":
			Albamoncrolling.area += ",C1680280";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%D3%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("속천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송죽동":
			Albamoncrolling.area += ",C1680290";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%DB%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동":
			Albamoncrolling.area += ",C1680300";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수도동":
			Albamoncrolling.area += ",C1680310";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%F6%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			Albamoncrolling.area += ",C1680320";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			Albamoncrolling.area += ",C1680330";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구신흥동":
			Albamoncrolling.area += ",C1680340";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진해구신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안곡동":
			Albamoncrolling.area += ",C1680350";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BE%C8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안골동":
			Albamoncrolling.area += ",C1680360";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BE%C8%B0%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안골동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "앵곡동":
			Albamoncrolling.area += ",C1680370";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BE%DE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("앵곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여좌동":
			Albamoncrolling.area += ",C1680380";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%A9%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연도동":
			Albamoncrolling.area += ",C1680390";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%AC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용원동":
			Albamoncrolling.area += ",C1680400";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원포동":
			Albamoncrolling.area += ",C1680410";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%F8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			Albamoncrolling.area += ",C1680420";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익선동":
			Albamoncrolling.area += ",C1680430";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CD%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("익선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인사동":
			Albamoncrolling.area += ",C1680440";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인의동":
			Albamoncrolling.area += ",C1680450";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자은동":
			Albamoncrolling.area += ",C1680460";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%DA%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장천동":
			Albamoncrolling.area += ",C1680470";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%E5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제덕동":
			Albamoncrolling.area += ",C1680480";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%A6%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("제덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제황산동":
			Albamoncrolling.area += ",C1680490";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%A6%C8%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("제황산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽곡동":
			Albamoncrolling.area += ",C1680500";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%D7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구중앙동":
			Albamoncrolling.area += ",C1680510";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진해구중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중평동":
			Albamoncrolling.area += ",C1680520";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%DF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선동":
			Albamoncrolling.area += ",C1680530";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%A2%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청안동":
			Albamoncrolling.area += ",C1680540";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%BB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동":
			Albamoncrolling.area += ",C1680550";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충의동":
			Albamoncrolling.area += ",C1680560";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%E6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태백동":
			Albamoncrolling.area += ",C1680570";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C5%C2%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			Albamoncrolling.area += ",C1680580";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통신동":
			Albamoncrolling.area += ",C1680590";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C5%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평안동":
			Albamoncrolling.area += ",C1680600";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍호동":
			Albamoncrolling.area += ",C1680610";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C7%B3%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행암동":
			Albamoncrolling.area += ",C1680620";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C7%E0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진해구현동":
			Albamoncrolling.area += ",C1680630";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진해구현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화천동":
			Albamoncrolling.area += ",C1680640";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C8%AD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동":
			Albamoncrolling.area += ",C1680650";
			AlbaHeavencrolling.area += "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 통영시
		case "광도면":
			Albamoncrolling.area += ",C1700010";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B1%A4%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("광도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당동":
			Albamoncrolling.area += ",C1700020";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			Albamoncrolling.area += ",C1700050";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도산면":
			Albamoncrolling.area += ",C1700060";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%B5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시도천동":
			Albamoncrolling.area += ",C1700070";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통영시도천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동호동":
			Albamoncrolling.area += ",C1700080";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명정동":
			Albamoncrolling.area += ",C1700090";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B8%ED%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무전동":
			Albamoncrolling.area += ",C1700100";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B9%AB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시문화동":
			Albamoncrolling.area += ",C1700110";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통영시문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미수1동":
			Albamoncrolling.area += ",C1700120";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("미수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미수2동":
			Albamoncrolling.area += ",C1700130";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("미수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미수동":
			Albamoncrolling.area += ",C1700140";
			AlbaHeavencrolling.area += "55%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B9%CC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉평동":
			Albamoncrolling.area += ",C1700150";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BA%C0%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북신동":
			Albamoncrolling.area += ",C1700160";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BA%CF%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사량면":
			Albamoncrolling.area += ",C1700170";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BB%E7%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산양읍":
			Albamoncrolling.area += ",C1700180";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BB%EA%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("산양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호동":
			Albamoncrolling.area += ",C1700190";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "욕지면":
			Albamoncrolling.area += ",C1700200";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BF%E5%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("욕지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용남면":
			Albamoncrolling.area += ",C1700210";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BF%EB%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인평동":
			Albamoncrolling.area += ",C1700220";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C0%CE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정량동":
			Albamoncrolling.area += ",C1700230";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C1%A4%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시중앙동":
			Albamoncrolling.area += ",C1700240";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통영시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통영시태평동":
			Albamoncrolling.area += ",C1700250";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통영시태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평림동":
			Albamoncrolling.area += ",C1700280";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C6%F2%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한산면":
			Albamoncrolling.area += ",C1700290";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C7%D1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항남동":
			Albamoncrolling.area += ",C1700300";
			AlbaHeavencrolling.area += "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C7%D7%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("항남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 하동군
		case "고전면":
			Albamoncrolling.area += ",C1800010";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%B0%ED%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남면":
			Albamoncrolling.area += ",C1800020";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%B1%DD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			Albamoncrolling.area += ",C1800030";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북천면":
			Albamoncrolling.area += ",C1800040";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BA%CF%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "악양면":
			Albamoncrolling.area += ",C1800050";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BE%C7%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("악양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양보면":
			Albamoncrolling.area += ",C1800060";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BE%E7%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥종면":
			Albamoncrolling.area += ",C1800070";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BF%C1%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적량면":
			Albamoncrolling.area += ",C1800080";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C0%FB%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("적량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진교면":
			Albamoncrolling.area += ",C1800090";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C1%F8%B1%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진교면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청암면":
			Albamoncrolling.area += ",C1800100";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C3%BB%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동읍":
			Albamoncrolling.area += ",C1800110";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C7%CF%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("하동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화개면":
			Albamoncrolling.area += ",C1800120";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C8%AD%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화개면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "횡천면":
			Albamoncrolling.area += ",C1800130";
			AlbaHeavencrolling.area += "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C8%BE%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("횡천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 함안군
		case "가야읍":
			Albamoncrolling.area += ",C1900010";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B0%A1%BE%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("가야읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군북면":
			Albamoncrolling.area += ",C1900020";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B1%BA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함안군대산면":
			Albamoncrolling.area += ",C1900030";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("함안군대산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법수면":
			Albamoncrolling.area += ",C1900040";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B9%FD%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("법수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산인면":
			Albamoncrolling.area += ",C1900050";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%BB%EA%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여항면":
			Albamoncrolling.area += ",C1900060";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%BF%A9%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("여항면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠북면":
			Albamoncrolling.area += ",C1900070";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C4%A5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("칠북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠서면":
			Albamoncrolling.area += ",C1900080";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C4%A5%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("칠서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠원면":
			Albamoncrolling.area += ",C1900090";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C4%A5%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("칠원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함안면":
			Albamoncrolling.area += ",C1900100";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C7%D4%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("함안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 함양군
		case "마천면":
			Albamoncrolling.area += ",C2000010";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%B8%B6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백전면":
			Albamoncrolling.area += ",C2000020";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%B9%E9%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병곡면":
			Albamoncrolling.area += ",C2000030";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BA%B4%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("병곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서상면":
			Albamoncrolling.area += ",C2000040";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BC%AD%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서하면":
			Albamoncrolling.area += ",C2000050";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BC%AD%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동면":
			Albamoncrolling.area += ",C2000060";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BC%F6%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안의면":
			Albamoncrolling.area += ",C2000070";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BE%C8%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유림면":
			Albamoncrolling.area += ",C2000080";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C0%AF%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("유림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡면":
			Albamoncrolling.area += ",C2000090";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C1%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함양읍":
			Albamoncrolling.area += ",C2000100";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C7%D4%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("함양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴천면":
			Albamoncrolling.area += ",C2000110";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C8%DE%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("휴천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 합천군
		case "가야면":
			Albamoncrolling.area += ",C2100010";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B0%A1%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가회면":
			Albamoncrolling.area += ",C2100020";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B0%A1%C8%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가회면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대병면":
			Albamoncrolling.area += ",C2100030";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B4%EB%BA%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대병면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대양면":
			Albamoncrolling.area += ",C2100040";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B4%EB%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕곡면":
			Albamoncrolling.area += ",C2100050";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B4%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘산면":
			Albamoncrolling.area += ",C2100060";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B9%A6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("묘산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산면":
			Albamoncrolling.area += ",C2100070";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼가면":
			Albamoncrolling.area += ",C2100080";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BB%EF%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍백면":
			Albamoncrolling.area += ",C2100090";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BD%D6%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("쌍백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍책면":
			Albamoncrolling.area += ",C2100100";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BD%D6%C3%A5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("쌍책면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야로면":
			Albamoncrolling.area += ",C2100110";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BE%DF%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("야로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용주면":
			Albamoncrolling.area += ",C2100120";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BF%EB%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율곡면":
			Albamoncrolling.area += ",C2100130";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C0%B2%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("율곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적중면":
			Albamoncrolling.area += ",C2100140";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C0%FB%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("적중면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청덕면":
			Albamoncrolling.area += ",C2100150";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C3%BB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초계면":
			Albamoncrolling.area += ",C2100160";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C3%CA%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("초계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합천읍":
			Albamoncrolling.area += ",C2100170";
			AlbaHeavencrolling.area += "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C7%D5%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("합천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}