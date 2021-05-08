package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Incheon {
	public boolean flag;

	public void IncheonCity(ActionEvent e) {
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
		case "강화읍":
			Albamoncrolling.area += "K0100010";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B0%AD%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("강화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동면":
			Albamoncrolling.area += ",K0100020";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B1%B3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("교동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길상면":
			Albamoncrolling.area += ",K0100030";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B1%E6%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("길상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내가면":
			Albamoncrolling.area += "K0100040";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B3%BB%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불은면":
			Albamoncrolling.area += ",K0100050";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BA%D2%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("불은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산면":
			Albamoncrolling.area += ",K0100060";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서도면":
			Albamoncrolling.area += ",K0100070";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BC%AD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선원면":
			Albamoncrolling.area += ",K0100080";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BC%B1%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("선원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송해면":
			Albamoncrolling.area += ",K0100090";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BC%DB%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("송해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양도면":
			Albamoncrolling.area += ",K0100100";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BE%E7%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양사면":
			Albamoncrolling.area += ",K0100110";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BE%E7%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하점면":
			Albamoncrolling.area += ",K0100120";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%C7%CF%C1%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하점면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화도면":
			Albamoncrolling.area += ",K0100130";
			AlbaHeavencrolling.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%C8%AD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			Albamoncrolling.area += ",K0200010";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산동":
			Albamoncrolling.area += ",K0200060";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산1동":
			Albamoncrolling.area += ",K0200020";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산2동":
			Albamoncrolling.area += ",K0200030";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산3동":
			Albamoncrolling.area += ",K0200040";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산4동":
			Albamoncrolling.area += ",K0200050";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귤현동":
			Albamoncrolling.area += ",K0200070";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B1%D6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귤현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노오지동":
			Albamoncrolling.area += ",K0200080";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B3%EB%BF%C0%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노오지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다남동":
			Albamoncrolling.area += ",K0200090";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B4%D9%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동양동":
			Albamoncrolling.area += ",K0200100";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B5%BF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둑실동":
			Albamoncrolling.area += ",K0200110";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B5%CF%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둑실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목상동":
			Albamoncrolling.area += ",K0200120";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B8%F1%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박촌동":
			Albamoncrolling.area += ",K0200130";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B9%DA%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("박촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방축동":
			Albamoncrolling.area += ",K0200140";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B9%E6%C3%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병방동":
			Albamoncrolling.area += ",K0200150";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BA%B4%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("병방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상야동":
			Albamoncrolling.area += ",K0200160";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BB%F3%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서운동":
			Albamoncrolling.area += "K0200170";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선주지동":
			Albamoncrolling.area += ",K0200180";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BC%B1%C1%D6%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선주지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류동":
			Albamoncrolling.area += ",K0200190";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용종동":
			Albamoncrolling.area += ",K0200200";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BF%EB%C1%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용종동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이화동":
			Albamoncrolling.area += ",K0200210";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%CC%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임학동":
			Albamoncrolling.area += ",K0200220";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%D3%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("임학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전동":
			Albamoncrolling.area += ",K0200260";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("작전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전1동":
			Albamoncrolling.area += ",K0200230";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("작전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전2동":
			Albamoncrolling.area += ",K0200240";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("작전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전3동":
			Albamoncrolling.area += ",K0200250";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("작전3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작전서운동":
			Albamoncrolling.area += ",K0200330";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("작전서운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기동":
			Albamoncrolling.area += ",K0200270";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			Albamoncrolling.area += ",K0200280";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하야동":
			Albamoncrolling.area += ",K0200290";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C7%CF%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효성동":
			Albamoncrolling.area += ",K0200320";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C8%BF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효성1동":
			Albamoncrolling.area += ",K0200300";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C8%BF%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효성2동":
			Albamoncrolling.area += ",K0200310";
			AlbaHeavencrolling.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C8%BF%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석동":
			Albamoncrolling.area += ",K0400050";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("간석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석1동":
			Albamoncrolling.area += ",K0400010";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("간석1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석2동":
			Albamoncrolling.area += ",K0400020";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("간석2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석3동":
			Albamoncrolling.area += ",K0400030";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("간석3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간석4동":
			Albamoncrolling.area += ",K0400040";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("간석4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고잔동":
			Albamoncrolling.area += ",K0400060";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%ED%C0%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고잔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월동":
			Albamoncrolling.area += ",K0400110";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월1동":
			Albamoncrolling.area += ",K0400070";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구월1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월2동":
			Albamoncrolling.area += ",K0400080";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구월2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월3동":
			Albamoncrolling.area += ",K0400090";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구월3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구월4동":
			Albamoncrolling.area += ",K0400100";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구월4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남촌동":
			Albamoncrolling.area += ",K0400120";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B3%B2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현동":
			Albamoncrolling.area += ",K0400130";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B3%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("논현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도림동":
			Albamoncrolling.area += ",K0400140";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수동":
			Albamoncrolling.area += ",K0400210";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수1동":
			Albamoncrolling.area += ",K0400150";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수2동":
			Albamoncrolling.area += ",K0400160";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수3동":
			Albamoncrolling.area += ",K0400170";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수4동":
			Albamoncrolling.area += ",K0400180";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수5동":
			Albamoncrolling.area += ",K0400190";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만수6동":
			Albamoncrolling.area += ",K0400200";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F66%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만수6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서창동":
			Albamoncrolling.area += ",K0400220";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%BC%AD%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수산동":
			Albamoncrolling.area += ",K0400230";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%BC%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운연동":
			Albamoncrolling.area += ",K0400240";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%BF%EE%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장수동":
			Albamoncrolling.area += ",K0400250";
			AlbaHeavencrolling.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%C0%E5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			Albamoncrolling.area += ",K0500010";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만석동":
			Albamoncrolling.area += ",K0500020";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%B8%B8%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림동":
			Albamoncrolling.area += "K0500090";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림1동":
			Albamoncrolling.area += ",K0500030";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림2동":
			Albamoncrolling.area += ",K0500040";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림3.5동":
			Albamoncrolling.area += ",K0500050";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B23.5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송림3.5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림4동":
			Albamoncrolling.area += ",K0500060";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송림4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송림6동":
			Albamoncrolling.area += ",K0500080";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B26%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송림6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			Albamoncrolling.area += ",K0500130";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현1.2동":
			Albamoncrolling.area += ",K0500100";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C7%F61.2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현1.2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현3동":
			Albamoncrolling.area += ",K0500120";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C7%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송현3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창영동":
			Albamoncrolling.area += ",K0500140";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C3%A2%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화수동":
			Albamoncrolling.area += ",K0500170";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화수1동":
			Albamoncrolling.area += ",K0500150";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화수2동":
			Albamoncrolling.area += ",K0500160";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화평동":
			Albamoncrolling.area += ",K0500180";
			AlbaHeavencrolling.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관교동":
			Albamoncrolling.area += ",K0300010";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B0%FC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화동":
			Albamoncrolling.area += ",K0300050";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화1동":
			Albamoncrolling.area += ",K0300020";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화2동":
			Albamoncrolling.area += ",K0300030";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화3동":
			Albamoncrolling.area += ",K0300040";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도화3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문학동":
			Albamoncrolling.area += ",K0300060";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B9%AE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의동":
			Albamoncrolling.area += ",K0300110";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의1동":
			Albamoncrolling.area += ",K0300070";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C71.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭의1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의2동":
			Albamoncrolling.area += ",K0300080";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭의2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의3동":
			Albamoncrolling.area += ",K0300090";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("숭의3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭의4동":
			Albamoncrolling.area += ",K0300100";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭의4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현동":
			Albamoncrolling.area += ",K0300170";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현1동":
			Albamoncrolling.area += ",K0300120";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F61.4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현2동":
			Albamoncrolling.area += ",K0300130";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현3동":
			Albamoncrolling.area += ",K0300140";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현4동":
			Albamoncrolling.area += ",K0300150";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현5동":
			Albamoncrolling.area += ",K0300160";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안동":
			Albamoncrolling.area += ",K0300260";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안1동":
			Albamoncrolling.area += ",K0300180";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안2동":
			Albamoncrolling.area += ",K0300190";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안3동":
			Albamoncrolling.area += ",K0300200";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안4동":
			Albamoncrolling.area += ",K0300210";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안5동":
			Albamoncrolling.area += ",K0300220";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C85%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안6동":
			Albamoncrolling.area += ",K0300230";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C86%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안7동":
			Albamoncrolling.area += ",K0300240";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C87%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주안8동":
			Albamoncrolling.area += ",K0300250";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C88%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주안8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학익동":
			Albamoncrolling.area += ",K0300290";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C7%D0%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학익1동":
			Albamoncrolling.area += ",K0300270";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C7%D0%C0%CD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학익1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학익2동":
			Albamoncrolling.area += ",K0300280";
			AlbaHeavencrolling.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C7%D0%C0%CD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학익2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			Albamoncrolling.area += ",K0600030";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산1동":
			Albamoncrolling.area += ",K0600010";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B0%A5%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산2동":
			Albamoncrolling.area += ",K0600020";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B0%A5%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			Albamoncrolling.area += ",K0600040";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개동":
			Albamoncrolling.area += ",K0600080";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부개동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개1동":
			Albamoncrolling.area += ",K0600050";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부개1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개2동":
			Albamoncrolling.area += ",K0600060";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부개2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부개3동":
			Albamoncrolling.area += ",K0600070";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부개3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평동":
			Albamoncrolling.area += ",K0600150";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평1동":
			Albamoncrolling.area += ",K0600090";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평2동":
			Albamoncrolling.area += ",K0600100";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평3동":
			Albamoncrolling.area += ",K0600110";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평4동":
			Albamoncrolling.area += ",K0600120";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평5동":
			Albamoncrolling.area += ",K0600130";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F25%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부평6동":
			Albamoncrolling.area += ",K0600140";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F26%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부평6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			Albamoncrolling.area += ",K0600200";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡1동":
			Albamoncrolling.area += ",K0600160";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡2동":
			Albamoncrolling.area += ",K0600170";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡3동":
			Albamoncrolling.area += ",K0600180";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡4동":
			Albamoncrolling.area += ",K0600190";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산동":
			Albamoncrolling.area += ",K0600210";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산1동":
			Albamoncrolling.area += ",K0600205";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EF%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산2동":
			Albamoncrolling.area += ",K0600206";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EF%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "십정동":
			Albamoncrolling.area += ",K0600240";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BD%CA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("십정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "십정1동":
			Albamoncrolling.area += ",K0600220";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BD%CA%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("십정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "십정2동":
			Albamoncrolling.area += ",K0600230";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BD%CA%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("십정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일신동":
			Albamoncrolling.area += ",K0600250";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C0%CF%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천동":
			Albamoncrolling.area += ",K0600280";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C3%BB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천1동":
			Albamoncrolling.area += ",K0600260";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C3%BB%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천2동":
			Albamoncrolling.area += ",K0600270";
			AlbaHeavencrolling.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C3%BB%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정동":
			Albamoncrolling.area += ",K0700040";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정1동":
			Albamoncrolling.area += ",K0700010";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정2동":
			Albamoncrolling.area += ",K0700020";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가정3동":
			Albamoncrolling.area += ",K0700030";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌동":
			Albamoncrolling.area += ",K0700090";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌1동":
			Albamoncrolling.area += ",K0700050";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌2동":
			Albamoncrolling.area += ",K0700060";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌3동":
			Albamoncrolling.area += ",K0700070";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌4동":
			Albamoncrolling.area += ",K0700080";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검암동":
			Albamoncrolling.area += ",K0700100";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%CB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("검암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경서동":
			Albamoncrolling.area += ",K0700110";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%E6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공촌동":
			Albamoncrolling.area += ",K0700120";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%F8%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인천서구금곡동":
			Albamoncrolling.area += ",K0700130";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인천서구금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당하동":
			Albamoncrolling.area += ",K0700140";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B4%E7%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곡동":
			Albamoncrolling.area += ",K0700150";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B4%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마전동":
			Albamoncrolling.area += ",K0700160";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석동":
			Albamoncrolling.area += ",K0700170";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B9%E9%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불로동":
			Albamoncrolling.area += ",K0700180";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BA%D2%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남동":
			Albamoncrolling.area += ",K0700220";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남1동":
			Albamoncrolling.area += ",K0700190";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석남1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남2동":
			Albamoncrolling.area += ",K0700200";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석남2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남3동":
			Albamoncrolling.area += ",K0700210";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석남3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시천동":
			Albamoncrolling.area += ",K0700230";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BD%C3%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신현동":
			Albamoncrolling.area += ",K0700240";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BD%C5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			Albamoncrolling.area += ",K0700250";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연희동":
			Albamoncrolling.area += ",K0700260";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%AC%C8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연희동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인천서구오류동":
			Albamoncrolling.area += ",K0700270";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인천서구오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕길동":
			Albamoncrolling.area += ",K0700280";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%D5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("왕길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			Albamoncrolling.area += ",K0700290";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원창동":
			Albamoncrolling.area += ",K0700300";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라동":
			Albamoncrolling.area += ",K0700310";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라1동":
			Albamoncrolling.area += ",K0700320";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라2동":
			Albamoncrolling.area += ",K0700330";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청라2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라3동":
			Albamoncrolling.area += ",K0700340";
			AlbaHeavencrolling.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청라3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘동":
			Albamoncrolling.area += ",K0800040";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동춘동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘1동":
			Albamoncrolling.area += ",K0800010";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동춘1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘2동":
			Albamoncrolling.area += ",K0800020";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동춘2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동춘3동":
			Albamoncrolling.area += ",K0800030";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동춘3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선학동":
			Albamoncrolling.area += ",K0800050";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BC%B1%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도동":
			Albamoncrolling.area += ",K0800060";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BC%DB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도1동":
			Albamoncrolling.area += ",K0800061";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("송도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도2동":
			Albamoncrolling.area += ",K0800062";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("송도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도3동":
			Albamoncrolling.area += ",K0800063";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("송도3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도4동":
			Albamoncrolling.area += ",K0800064";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("송도4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도5동":
			Albamoncrolling.area += ",K0800065";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("송도5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수동":
			Albamoncrolling.area += ",K0800100";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수1동":
			Albamoncrolling.area += ",K0800070";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수2동":
			Albamoncrolling.area += ",K0800080";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수3동":
			Albamoncrolling.area += ",K0800090";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연수3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥련동":
			Albamoncrolling.area += ",K0800110";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%C1%B7%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥련동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥련1동":
			Albamoncrolling.area += ",K0800105";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%C1%B7%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥련1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥련2동":
			Albamoncrolling.area += ",K0800106";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%C1%B7%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥련2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			Albamoncrolling.area += ",K0800120";
			AlbaHeavencrolling.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청면":
			Albamoncrolling.area += ",K0900010";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%B4%EB%C3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대청면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕적면":
			Albamoncrolling.area += ",K0900020";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%B4%F6%C0%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕적면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백령면":
			Albamoncrolling.area += ",K0900030";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%B9%E9%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북도면":
			Albamoncrolling.area += ",K0900040";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%BA%CF%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연평면":
			Albamoncrolling.area += ",K0900050";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%BF%AC%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("연평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영흥면":
			Albamoncrolling.area += ",K0900060";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%BF%B5%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자월면":
			Albamoncrolling.area += ",K0900070";
			AlbaHeavencrolling.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%C0%DA%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("자월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경동":
			Albamoncrolling.area += ",K1000010";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동1가":
			Albamoncrolling.area += ",K1000020";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%FC%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("관동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동2가":
			Albamoncrolling.area += ",K1000030";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%FC%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("관동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동3가":
			Albamoncrolling.area += ",K1000040";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%FC%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("관동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남북동":
			Albamoncrolling.area += ",K1000050";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			Albamoncrolling.area += ",K1000060";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답동":
			Albamoncrolling.area += ",K1000070";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕교동":
			Albamoncrolling.area += ",K1000080";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B4%F6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도원동":
			Albamoncrolling.area += ",K1000090";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무의동":
			Albamoncrolling.area += ",K1000100";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성동1가":
			Albamoncrolling.area += ",K1000110";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성동2가":
			Albamoncrolling.area += ",K1000120";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북성동3가":
			Albamoncrolling.area += ",K1000130";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			Albamoncrolling.area += ",K1000140";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선린동":
			Albamoncrolling.area += ",K1000150";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%B1%B8%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선린동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선화동":
			Albamoncrolling.area += ",K1000160";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%B1%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동1가":
			Albamoncrolling.area += ",K1000170";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송월동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동2가":
			Albamoncrolling.area += ",K1000180";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송월동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동3가":
			Albamoncrolling.area += ",K1000190";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송월동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동1가":
			Albamoncrolling.area += ",K1000200";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송학동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동2가":
			Albamoncrolling.area += ",K1000210";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송학동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동3가":
			Albamoncrolling.area += ",K1000220";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("송학동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신생동":
			Albamoncrolling.area += ",K1000230";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%BB%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신생동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신포동":
			Albamoncrolling.area += ",K1000240";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동1가":
			Albamoncrolling.area += ",K1000250";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신흥동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동2가":
			Albamoncrolling.area += ",K1000260";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신흥동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동3가":
			Albamoncrolling.area += ",K1000270";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("신흥동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			Albamoncrolling.area += ",K1000280";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운남동":
			Albamoncrolling.area += ",K1000290";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운북동":
			Albamoncrolling.area += ",K1000300";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EE%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운서동":
			Albamoncrolling.area += ",K1000310";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EE%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유동":
			Albamoncrolling.area += ",K1000320";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율목동":
			Albamoncrolling.area +=",K1000330";
			AlbaHeavencrolling.area="032%7C%7C%C1%DF%B1%B8%7C%7C%C0%B2%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을왕동":
			Albamoncrolling.area += ",K1000340";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("을왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동":
			Albamoncrolling.area += ",K1000350";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전동":
			Albamoncrolling.area += ",K1000360";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중산동":
			Albamoncrolling.area += ",K1000370";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			Albamoncrolling.area += ",K1000380";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			Albamoncrolling.area += ",K1000390";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			Albamoncrolling.area += ",K1000400";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동4가":
			Albamoncrolling.area += ",K1000410";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동1가":
			Albamoncrolling.area += ",K1000420";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동2가":
			Albamoncrolling.area += ",K1000430";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동3가":
			Albamoncrolling.area += ",K1000440";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동4가":
			Albamoncrolling.area += ",K1000450";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동5가":
			Albamoncrolling.area += ",K1000460";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동6가":
			Albamoncrolling.area += ",K1000470";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동7가":
			Albamoncrolling.area += ",K1000480";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("항동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동1가":
			Albamoncrolling.area += ",K1000490";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동2가":
			Albamoncrolling.area += ",K1000500";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동3가":
			Albamoncrolling.area += ",K1000510";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동4가":
			Albamoncrolling.area += ",K1000520";
			AlbaHeavencrolling.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
