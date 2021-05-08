package region;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Gyeonggi {
	public boolean flag;

	public void GyeonggiCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			Albamoncrolling.area = "";
			AlbaHeavencrolling.area="";
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
		case "가평읍":
			Albamoncrolling.area += ",B0100010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%B0%A1%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("가평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			Albamoncrolling.area += ",B0100020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상면":
			Albamoncrolling.area += ",B0100030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설악면":
			Albamoncrolling.area += ",B0100040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%BC%B3%BE%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("설악면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조종면":
			Albamoncrolling.area += ",B0100060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%C1%B6%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("조종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청평면":
			Albamoncrolling.area += ",B0100050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%C3%BB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강매동":
			Albamoncrolling.area += ",B0200010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B0%AD%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고양동":
			Albamoncrolling.area += ",B0200020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B0%ED%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관산동":
			Albamoncrolling.area += ",B0200030";
			AlbaHeavencrolling.area += "C031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B0%FC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			Albamoncrolling.area += ",B0200040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내유동":
			Albamoncrolling.area += ",B0200050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B3%BB%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능곡동":
			Albamoncrolling.area += ",B0200400";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%EB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("능곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕동":
			Albamoncrolling.area += ",B0200410";
			Mainpage.Filtering[Mainpage.index].setText("대덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대자동":
			Albamoncrolling.area += ",B0200060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%EB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대장동":
			Albamoncrolling.area += ",B0200070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕은동":
			Albamoncrolling.area += ",B0200080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%F6%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도내동":
			Albamoncrolling.area += ",B0200090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B5%B5%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			Albamoncrolling.area += ",B0200100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벽제동":
			Albamoncrolling.area += ",B0200110";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BA%AE%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("벽제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북한동":
			Albamoncrolling.area += ",B0200120";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BA%CF%C7%D1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북한동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼송동":
			Albamoncrolling.area += ",B0200130";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BB%EF%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선유동":
			Albamoncrolling.area += ",B0200140";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%B1%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사동":
			Albamoncrolling.area += ",B0200170";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%BA%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사1동":
			Albamoncrolling.area += ",B0200150";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%BA%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사2동":
			Albamoncrolling.area += ",B0200160";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%BA%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신원동":
			Albamoncrolling.area += ",B0200180";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BD%C5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			Albamoncrolling.area += ",B0200140";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			Albamoncrolling.area += ",B0200170";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			Albamoncrolling.area += ",B0200150";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			Albamoncrolling.area += ",B0200160";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원신동":
			Albamoncrolling.area += ",B0200180";
			Mainpage.Filtering[Mainpage.index].setText("원신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원흥동":
			Albamoncrolling.area += ",B0200230";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%F8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교동":
			Albamoncrolling.area += ",B0200240";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C1%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지축동":
			Albamoncrolling.area += ",B0200250";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C1%F6%C3%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창릉동":
			Albamoncrolling.area += ",B0200430";
			Mainpage.Filtering[Mainpage.index].setText("창릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토당동":
			Albamoncrolling.area += ",B0200260";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C5%E4%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신동":
			Albamoncrolling.area += ",B0200300";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신1동":
			Albamoncrolling.area += ",B0200270";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행신1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신2동":
			Albamoncrolling.area += ",B0200280";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행신2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신3동":
			Albamoncrolling.area += ",B0200290";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행신3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주내동":
			Albamoncrolling.area += ",B0200310";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%C1%D6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행주내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주동":
			Albamoncrolling.area += ",B0200440";
			Mainpage.Filtering[Mainpage.index].setText("행주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주외동":
			Albamoncrolling.area += ",B0200320";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%C1%D6%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행주외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향동동":
			Albamoncrolling.area += ",B0200330";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E2%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("향동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현천동":
			Albamoncrolling.area += ",B0200340";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			Albamoncrolling.area += ",B0200350";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정동":
			Albamoncrolling.area += ",B0200380";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정1동":
			Albamoncrolling.area += ",B0200360";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정2동":
			Albamoncrolling.area += ",B0200370";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			Albamoncrolling.area += ",B0200390";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥도동":
			Albamoncrolling.area += ",B0200450";
			Mainpage.Filtering[Mainpage.index].setText("흥도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고봉동":
			Albamoncrolling.area += ",B0300180";
			Mainpage.Filtering[Mainpage.index].setText("고봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두동":
			Albamoncrolling.area += ",B0300030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B8%B6%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두1동":
			Albamoncrolling.area += ",B0300010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B8%B6%B5%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마두1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두2동":
			Albamoncrolling.area += ",B0300020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B8%B6%B5%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마두2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문봉동":
			Albamoncrolling.area += ",B0300040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%AE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석동":
			Albamoncrolling.area += ",B0300050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%E9%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석1동":
			Albamoncrolling.area += ",B0300044";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%E9%BC%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백석1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석2동":
			Albamoncrolling.area += ",B0300045";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%E9%BC%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백석2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사리현동":
			Albamoncrolling.area += ",B0300060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BB%E7%B8%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사리현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산황동":
			Albamoncrolling.area += ",B0300070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BB%EA%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설문동":
			Albamoncrolling.area += ",B0300080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BC%B3%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("설문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성석동":
			Albamoncrolling.area += ",B0300090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BC%BA%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식사동":
			Albamoncrolling.area += ",B0300100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BD%C4%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("식사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항동":
			Albamoncrolling.area += ",B0300130";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C0%E5%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항1동":
			Albamoncrolling.area += ",B0300110";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C0%E5%C7%D71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장항1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항2동":
			Albamoncrolling.area += ",B0300120";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C0%E5%C7%D72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장항2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정발산동":
			Albamoncrolling.area += ",B0300140";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C1%A4%B9%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중산동":
			Albamoncrolling.area += ",B0300150";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지영동":
			Albamoncrolling.area += ",B0300160";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C1%F6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍동":
			Albamoncrolling.area += ",B0300170";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산동":
			Albamoncrolling.area += ",B0300190";
			Mainpage.Filtering[Mainpage.index].setText("풍산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌동":
			Albamoncrolling.area += ",B0310010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			Albamoncrolling.area += ",B0310020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대화동":
			Albamoncrolling.area += ",B0310030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B4%EB%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕이동":
			Albamoncrolling.area += ",B0310040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B4%F6%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법곳동":
			Albamoncrolling.area += ",B0310050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B9%FD%B0%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("법곳동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			Albamoncrolling.area += ",B0310140";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송포동":
			Albamoncrolling.area += ",B0310150";
			Mainpage.Filtering[Mainpage.index].setText("송포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산동":
			Albamoncrolling.area += ",B0310090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산1동":
			Albamoncrolling.area += ",B0310060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산2동":
			Albamoncrolling.area += ",B0310070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산3동":
			Albamoncrolling.area += ",B0310080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽동":
			Albamoncrolling.area += ",B0310120";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C1%D6%BF%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주엽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽1동":
			Albamoncrolling.area += ",B0310100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C1%D6%BF%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주엽1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽2동":
			Albamoncrolling.area += ",B0310110";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C1%D6%BF%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주엽2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄현동":
			Albamoncrolling.area += ",B0310130";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C5%BA%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탄현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			Albamoncrolling.area += ",B0400010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과천동":
			Albamoncrolling.area += ",B0400020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B0%FA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("과천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관문동":
			Albamoncrolling.area += ",B0400030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B0%FC%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "막계동":
			Albamoncrolling.area += ",B0400040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B8%B7%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("막계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문원동":
			Albamoncrolling.area += ",B0400050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B9%AE%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별양동":
			Albamoncrolling.area += ",B0400060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%BA%B0%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("별양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			Albamoncrolling.area += ",B0400070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원문동":
			Albamoncrolling.area += ",B0400080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%BF%F8%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주암동":
			Albamoncrolling.area += ",B0400090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%C1%D6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",B0400100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가학동":
			Albamoncrolling.area += ",B0500010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B0%A1%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명동":
			Albamoncrolling.area += ",B0500090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명1동":
			Albamoncrolling.area += ",B0500020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명2동":
			Albamoncrolling.area += ",B0500030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명3동":
			Albamoncrolling.area += ",B0500040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명4동":
			Albamoncrolling.area += ",B0500050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명5동":
			Albamoncrolling.area += ",B0500060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명6동":
			Albamoncrolling.area += ",B0500070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명7동":
			Albamoncrolling.area += ",B0500080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노온사동":
			Albamoncrolling.area += ",B0500100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B3%EB%BF%C2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노온사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하동":
			Albamoncrolling.area += ",B0500130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BC%D2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하1동":
			Albamoncrolling.area += ",B0500110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BC%D2%C7%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소하1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하2동":
			Albamoncrolling.area += "B0500120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BC%D2%C7%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소하2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥길동":
			Albamoncrolling.area += ",B0500140";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BF%C1%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일직동":
			Albamoncrolling.area += ",B0500150";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C0%CF%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산동":
			Albamoncrolling.area += ",B0500200";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("철산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산1동":
			Albamoncrolling.area += ",B0500160";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("철산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산2동":
			Albamoncrolling.area += ",B0500170";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("철산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산3동":
			Albamoncrolling.area += ",B0500180";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("철산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산4동":
			Albamoncrolling.area += ",B0500190";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("철산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안동":
			Albamoncrolling.area += ",B0500250";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안1동":
			Albamoncrolling.area += ",B0500210";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안2동":
			Albamoncrolling.area += ",B0500220";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안3동":
			Albamoncrolling.area += ",B0500230";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안4동":
			Albamoncrolling.area += ",B0500240";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경안동":
			Albamoncrolling.area += ",B0600010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B0%E6%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곤지암읍":
			Albamoncrolling.area += ",B0600080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B0%EF%C1%F6%BE%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("곤지암읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남종면":
			Albamoncrolling.area += ",B0600020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B3%B2%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남한산성면":
			Albamoncrolling.area += ",B0600140";
			Mainpage.Filtering[Mainpage.index].setText("남한산성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도척면":
			Albamoncrolling.area += ",B0600030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B5%B5%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			Albamoncrolling.area += ",B0600040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목현동":
			Albamoncrolling.area += ",B0600050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B8%F1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동":
			Albamoncrolling.area += ",B0600060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			Albamoncrolling.area += ",B0600070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍령동":
			Albamoncrolling.area += ",B0600090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BD%D6%B7%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍령동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역동":
			Albamoncrolling.area += ",B0600100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BF%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오포읍":
			Albamoncrolling.area += ",B0600110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BF%C0%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("오포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			Albamoncrolling.area += ",B0600120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중대동":
			Albamoncrolling.area += ",B0600130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C1%DF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직동":
			Albamoncrolling.area += ",B0600150";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초월읍":
			Albamoncrolling.area += ",B0600160";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C3%CA%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("초월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄벌동":
			Albamoncrolling.area += ",B0600170";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C5%BA%B9%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탄벌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태전동":
			Albamoncrolling.area += ",B0600180";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C5%C2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴촌면":
			Albamoncrolling.area += ",B0600190";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C5%F0%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("퇴촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회덕동":
			Albamoncrolling.area += ",B0600200";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C8%B8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈매동":
			Albamoncrolling.area += ",B0700010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B0%A5%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문동":
			Albamoncrolling.area += ",B0700040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B1%B3%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문1동":
			Albamoncrolling.area += ",B0700020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B1%B3%B9%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문2동":
			Albamoncrolling.area += ",B0700030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B1%B3%B9%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동구동":
			Albamoncrolling.area += ",B0700050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B5%BF%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사노동":
			Albamoncrolling.area += ",B0700060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BB%E7%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택동":
			Albamoncrolling.area += ",B0700100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수택동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택1동":
			Albamoncrolling.area += ",B0700070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수택1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택2동":
			Albamoncrolling.area += ",B0700080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수택2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택3동":
			Albamoncrolling.area += ",B0700090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수택3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아천동":
			Albamoncrolling.area += ",B0700120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BE%C6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인창동":
			Albamoncrolling.area += ",B0700130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%C0%CE%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토평동":
			Albamoncrolling.area += ",B0700140";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%C5%E4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광정동":
			Albamoncrolling.area += ",B0800010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%A4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포1동":
			Albamoncrolling.area += ",B0800020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%BA%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포2동":
			Albamoncrolling.area += ",B0800030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%BA%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁내동":
			Albamoncrolling.area += ",B0800040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%C3%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("궁내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금정동":
			Albamoncrolling.area += ",B0800050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당동":
			Albamoncrolling.area += ",B0800060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당정동":
			Albamoncrolling.area += ",B0800070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B4%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야미동":
			Albamoncrolling.area += ",B0800080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B4%EB%BE%DF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대야미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도마교동":
			Albamoncrolling.area += ",B0800090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B5%B5%B8%B6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도마교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔대동":
			Albamoncrolling.area += ",B0800100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B5%D0%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			Albamoncrolling.area += ",B0800110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본동":
			Albamoncrolling.area += ",B0800140";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BB%EA%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본1동":
			Albamoncrolling.area += ",B0800120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BB%EA%BA%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산본1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본2동":
			Albamoncrolling.area += ",B0800130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BB%EA%BA%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산본2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속달동":
			Albamoncrolling.area += ",B0800150";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BC%D3%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("속달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수리동":
			Albamoncrolling.area += ",B0800160";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BC%F6%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포시오금동":
			Albamoncrolling.area += ",B0800170";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군포시오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재궁동":
			Albamoncrolling.area += ",B0800180";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%C0%E7%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감정동":
			Albamoncrolling.area += ",B0900010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B0%A8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "걸포동":
			Albamoncrolling.area += ",B0900020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B0%C9%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("걸포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고촌읍":
			Albamoncrolling.area += ",B0900030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B0%ED%C3%CC%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("고촌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구래동":
			Albamoncrolling.area += ",B0900035";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B1%B8%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김포본동":
			Albamoncrolling.area += ",B0900140";
			Mainpage.Filtering[Mainpage.index].setText("김포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곶면":
			Albamoncrolling.area += ",B0900040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B4%EB%B0%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산동":
			Albamoncrolling.area += ",B0900045";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B8%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북변동":
			Albamoncrolling.area += ",B0900050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BA%CF%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사우동":
			Albamoncrolling.area += ",B0900060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BB%E7%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양촌읍":
			Albamoncrolling.area += ",B0900070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BE%E7%C3%CC%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("양촌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운양동":
			Albamoncrolling.area += ",B0900080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BF%EE%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곶면":
			Albamoncrolling.area += ",B0900090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BF%F9%B0%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("월곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기동":
			Albamoncrolling.area += ",B0900100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기본동":
			Albamoncrolling.area += ",B0900150";
			Mainpage.Filtering[Mainpage.index].setText("장기본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통진읍":
			Albamoncrolling.area += "B0900110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C5%EB%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("통진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍무동":
			Albamoncrolling.area += ",B0900120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C7%B3%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하성면":
			Albamoncrolling.area += ",B0900130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C7%CF%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가운동":
			Albamoncrolling.area += ",B1000010";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B0%A1%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			Albamoncrolling.area += ",B1000020";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산동":
			Albamoncrolling.area += ",B1000220";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B4%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산1동":
			Albamoncrolling.area += ",B1000230";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B4%D9%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산2동":
			Albamoncrolling.area += ",B1000240";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B4%D9%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도농동":
			Albamoncrolling.area += ",B1000030";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B5%B5%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별내동":
			Albamoncrolling.area += ",B1000210";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BA%B0%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("별내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별내면":
			Albamoncrolling.area += ",B1000040";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BA%B0%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("별내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼패동":
			Albamoncrolling.area += ",B1000050";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BB%EF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동면":
			Albamoncrolling.area += ",B1000060";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BC%F6%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수석동":
			Albamoncrolling.area += ",B1000070";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BC%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정동":
			Albamoncrolling.area += ",B1000080";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BE%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오남읍":
			Albamoncrolling.area += ",B1000090";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BF%C0%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("오남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와부읍":
			Albamoncrolling.area += ",B1000100";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BF%CD%BA%CE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("와부읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이패동":
			Albamoncrolling.area += ",B1000110";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C0%CC%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일패동":
			Albamoncrolling.area += ",B1000120";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C0%CF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조안면":
			Albamoncrolling.area += ",B1000130";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%B6%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("조안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지금동":
			Albamoncrolling.area += ",B1000140";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%F6%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진건읍":
			Albamoncrolling.area += "B1000150";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%F8%B0%C7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진건읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진접읍":
			Albamoncrolling.area += ",B1000160";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%F8%C1%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진접읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴계원면":
			Albamoncrolling.area += ",B1000170";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C5%F0%B0%E8%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("퇴계원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평내동":
			Albamoncrolling.area += ",B1000180";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C6%F2%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호평동":
			Albamoncrolling.area += ",B1000190";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C8%A3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화도읍":
			Albamoncrolling.area += ",B1000200";
			AlbaHeavencrolling.area += "2C031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C8%AD%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("화도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "걸산동":
			Albamoncrolling.area += ",B1100010";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%B0%C9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("걸산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광암동":
			Albamoncrolling.area += ",B1100020";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%B1%A4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동두천동":
			Albamoncrolling.area += ",B1100030";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%B5%BF%B5%CE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동두천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보산동":
			Albamoncrolling.area += ",B1100040";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BA%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불현동":
			Albamoncrolling.area += ",B1100160";
			Mainpage.Filtering[Mainpage.index].setText("불현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉암동":
			Albamoncrolling.area += ",B1100050";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%F3%BA%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상패동":
			Albamoncrolling.area += ",B1100060";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%F3%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연1동":
			Albamoncrolling.area += ",B1100070";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%FD%BF%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("생연");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연2동":
			Albamoncrolling.area += ",B1100080";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%FD%BF%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연동":
			Albamoncrolling.area += ",B1100090";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%FD%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("생연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소요동":
			Albamoncrolling.area += ",B1100170";
			Mainpage.Filtering[Mainpage.index].setText("소요동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내동":
			Albamoncrolling.area += ",B1100100";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥동":
			Albamoncrolling.area += ",B1100110";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BE%C8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동두천중앙동":
			Albamoncrolling.area += ",B1100120";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동두천중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지행동":
			Albamoncrolling.area += ",B1100130";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C1%F6%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동동":
			Albamoncrolling.area += ",B1100140";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C5%BE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탑동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하봉암동":
			Albamoncrolling.area += ",B1100150";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C7%CF%BA%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계수동":
			Albamoncrolling.area += ",B1250010";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%E8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강동":
			Albamoncrolling.area += ",B1250020";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%ED%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강1동":
			Albamoncrolling.area += ",B1250030";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%ED%B0%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고강1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강본동":
			Albamoncrolling.area += ",B1250040";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%ED%B0%AD%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고강본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴안동":
			Albamoncrolling.area += ",B1250050";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B1%AB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			Albamoncrolling.area += ",B1250060";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시대장동":
			Albamoncrolling.area += ",B1250070";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부천시대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도당동":
			Albamoncrolling.area += ",B1250080";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B5%B5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범박동":
			Albamoncrolling.area += ",B1250090";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B9%FC%B9%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범박동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정동":
			Albamoncrolling.area += ",B1250100";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%EF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			Albamoncrolling.area += ",B1250110";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상1동":
			Albamoncrolling.area += ",B1250120";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상2동":
			Albamoncrolling.area += ",B1250130";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상3동":
			Albamoncrolling.area += ",B1250140";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성곡동":
			Albamoncrolling.area += ",B1250150";
			Mainpage.Filtering[Mainpage.index].setText("성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			Albamoncrolling.area += ",B1250160";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사본동":
			Albamoncrolling.area += ",B1250170";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%D2%BB%E7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소사본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사본3동":
			Albamoncrolling.area += ",B1250180";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%D2%BB%E7%BA%BB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소사본3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시송내동":
			Albamoncrolling.area += ",B1250190";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부천시송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내1동":
			Albamoncrolling.area += ",B1250200";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내2동":
			Albamoncrolling.area += ",B1250210";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			Albamoncrolling.area += ",B1250220";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			Albamoncrolling.area += ",B1250230";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡1동":
			Albamoncrolling.area += ",B1250240";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡2동":
			Albamoncrolling.area += ",B1250250";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡3동":
			Albamoncrolling.area += ",B1250260";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡본동":
			Albamoncrolling.area += ",B1250270";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡본1동":
			Albamoncrolling.area += ",B1250280";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE%BA%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡본1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약대동":
			Albamoncrolling.area += ",B1250290";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BE%E0%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("약대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여월동":
			Albamoncrolling.area += ",B1250300";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%A9%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여우러동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡동":
			Albamoncrolling.area += ",B1250310";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡1동":
			Albamoncrolling.area += ",B1250320";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡2동":
			Albamoncrolling.area += ",B1250330";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡3동":
			Albamoncrolling.area += ",B1250340";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오정동":
			Albamoncrolling.area += ",B1250350";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%C0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시옥길동":
			Albamoncrolling.area += ",B1250360";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%C1%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부천시옥길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미동":
			Albamoncrolling.area += ",B1250370";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미1동":
			Albamoncrolling.area += ",B1250380";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%B9%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미2동":
			Albamoncrolling.area += ",B1250390";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%B9%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원미2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종동":
			Albamoncrolling.area += ",B1250400";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%C1%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원종동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종1동":
			Albamoncrolling.area += ",B1250410";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%C1%BE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원종1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종2동":
			Albamoncrolling.area += ",B1250420";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%C1%BE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원종2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작동":
			Albamoncrolling.area += ",B1250430";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			Albamoncrolling.area += ",B1250440";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중1동":
			Albamoncrolling.area += ",B1250450";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중2동":
			Albamoncrolling.area += ",B1250460";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중3동":
			Albamoncrolling.area += ",B1250470";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중4동":
			Albamoncrolling.area += ",B1250480";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘의동":
			Albamoncrolling.area += ",B1250490";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C3%E1%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("춘의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미동":
			Albamoncrolling.area += ",B1500010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B1%B8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미1동":
			Albamoncrolling.area += ",B1500190";
			Mainpage.Filtering[Mainpage.index].setText("구미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시궁내동":
			Albamoncrolling.area += ",B1500020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B1%C3%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남시궁내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시금곡동":
			Albamoncrolling.area += ",B1500030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남시금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시대장동":
			Albamoncrolling.area += ",B1500040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남시대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동원동":
			Albamoncrolling.area += ",B1500050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B5%BF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백현동":
			Albamoncrolling.area += ",B1500060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B9%E9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "분당동":
			Albamoncrolling.area += ",B1500070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BA%D0%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("분당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼평동":
			Albamoncrolling.area += ",B1500080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BB%EF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현동":
			Albamoncrolling.area += ",B1500090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%AD%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현1동":
			Albamoncrolling.area += ",B1500200";
			Mainpage.Filtering[Mainpage.index].setText("서현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현2동":
			Albamoncrolling.area += ",B1500210";
			Mainpage.Filtering[Mainpage.index].setText("서현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석운동":
			Albamoncrolling.area += ",B1500100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%AE%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내동":
			Albamoncrolling.area += ",B1500110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내1동":
			Albamoncrolling.area += ",B1500112";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내2동":
			Albamoncrolling.area += ",B1500114";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내3동":
			Albamoncrolling.area += ",B1500116";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수내3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑동":
			Albamoncrolling.area += ",B1500120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BE%DF%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("야탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑1동":
			Albamoncrolling.area += ",B1500220";
			Mainpage.Filtering[Mainpage.index].setText("야탑1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑2동":
			Albamoncrolling.area += ",B1500230";
			Mainpage.Filtering[Mainpage.index].setText("야탑2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑3동":
			Albamoncrolling.area += ",B1500240";
			Mainpage.Filtering[Mainpage.index].setText("야탑3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운중동":
			Albamoncrolling.area += ",B1500130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BF%EE%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율동":
			Albamoncrolling.area += ",B1500140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매동":
			Albamoncrolling.area += ",B1500150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C0%CC%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매1동":
			Albamoncrolling.area += ",B1500250";
			Mainpage.Filtering[Mainpage.index].setText("이매1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매2동":
			Albamoncrolling.area += ",B1500260";
			Mainpage.Filtering[Mainpage.index].setText("이매2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자동":
			Albamoncrolling.area += ",B1500160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자1동":
			Albamoncrolling.area += ",B1500270";
			Mainpage.Filtering[Mainpage.index].setText("정자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자2동":
			Albamoncrolling.area += ",B1500280";
			Mainpage.Filtering[Mainpage.index].setText("정자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자3동":
			Albamoncrolling.area += ",B1500290";
			Mainpage.Filtering[Mainpage.index].setText("정자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판교동":
			Albamoncrolling.area += ",B1500170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C6%C7%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("판교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하산운동":
			Albamoncrolling.area += ",B1500180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C7%CF%BB%EA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하산운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고등동":
			Albamoncrolling.area += ",B1600010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B0%ED%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금토동":
			Albamoncrolling.area += ",B1600020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B1%DD%C5%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금토동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단대동":
			Albamoncrolling.area += ",B1600030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B4%DC%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔전동":
			Albamoncrolling.area += ",B1600040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B5%D0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복정동":
			Albamoncrolling.area += ",B1600050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BA%B9%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사송동":
			Albamoncrolling.area += ",B1600060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BB%E7%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			Albamoncrolling.area += ",B1600070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상적동":
			Albamoncrolling.area += ",B1600080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BB%F3%C0%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진동":
			Albamoncrolling.area += ",B1600110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BC%F6%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진1동":
			Albamoncrolling.area += ",B1600090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BC%F6%C1%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수진1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진2동":
			Albamoncrolling.area += ",B1600100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BC%F6%C1%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수진2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥동":
			Albamoncrolling.area += ",B1600120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C3%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			Albamoncrolling.area += ",B1600130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시신흥동":
			Albamoncrolling.area += ",B1600170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남시신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥1동":
			Albamoncrolling.area += ",B1600140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥2동":
			Albamoncrolling.area += ",B1600150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥3동":
			Albamoncrolling.area += ",B1600160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시심곡동":
			Albamoncrolling.area += ",B1600180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("김곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양지동":
			Albamoncrolling.area += ",B1600190";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BE%E7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오야동":
			Albamoncrolling.area += ",B1600200";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BF%C0%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			Albamoncrolling.area += ",B1600270";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창곡동":
			Albamoncrolling.area += ",B1600210";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C3%A2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			Albamoncrolling.area += ",B1600260";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평1동":
			Albamoncrolling.area += ",B1600220";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평2동":
			Albamoncrolling.area += ",B1600230";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평3동":
			Albamoncrolling.area += ",B1600240";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평4동":
			Albamoncrolling.area += ",B1600250";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태평4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시갈현동":
			Albamoncrolling.area += ",B1700010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남시갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광동":
			Albamoncrolling.area += ",B1700040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B1%DD%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광1동":
			Albamoncrolling.area += ",B1700020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B1%DD%B1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금광1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광2동":
			Albamoncrolling.area += ",B1700030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B1%DD%B1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금광2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도촌동":
			Albamoncrolling.area += ",B1700050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B5%B5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원동":
			Albamoncrolling.area += ",B1700090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원1동":
			Albamoncrolling.area += ",B1700060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원2동":
			Albamoncrolling.area += ",B1700070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원3동":
			Albamoncrolling.area += ",B1700080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대원3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			Albamoncrolling.area += ",B1700100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수동":
			Albamoncrolling.area += ",B1700110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BF%A9%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행동":
			Albamoncrolling.area += ",B1700140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C0%BA%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행1동":
			Albamoncrolling.area += ",B1700120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C0%BA%C7%E01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은행1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행2동":
			Albamoncrolling.area += ",B1700130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C0%BA%C7%E02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은행2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시중앙동":
			Albamoncrolling.area += ",B1700150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하대원동":
			Albamoncrolling.area += ",B1700160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C7%CF%B4%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고색동":
			Albamoncrolling.area += ",B1800010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B0%ED%BB%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고색동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곡반정동":
			Albamoncrolling.area += ",B1800020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B0%EE%B9%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("곡반정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구운동":
			Albamoncrolling.area += ",B1800030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B1%B8%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권선동":
			Albamoncrolling.area += ",B1800040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B1%C7%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("권선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시금곡동":
			Albamoncrolling.area += ",B1800050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원시금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당수동":
			Albamoncrolling.area += ",B1800060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B4%E7%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대황교동":
			Albamoncrolling.area += ",B1800070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B4%EB%C8%B2%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대황교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서둔동":
			Albamoncrolling.area += ",B1800080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%AD%B5%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서둔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류동":
			Albamoncrolling.area += ",B1800120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("세류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류1동":
			Albamoncrolling.area += ",B1800090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("세류1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류2동":
			Albamoncrolling.area += ",B1800100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("세류2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류3동":
			Albamoncrolling.area += ",B1800110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("세류3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오목천동":
			Albamoncrolling.area += ",B1800130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BF%C0%B8%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오목천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입북동":
			Albamoncrolling.area += ",B1800140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C0%D4%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("입북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시장지동":
			Albamoncrolling.area += ",B1800150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원시장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			Albamoncrolling.area += ",B1800160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			Albamoncrolling.area += ",B1800170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리동":
			Albamoncrolling.area += ",B1800180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C6%F2%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호매실동":
			Albamoncrolling.area += ",B1800190";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C8%A3%B8%C5%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호매실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광교동":
			Albamoncrolling.area += ",B2010120";
			Mainpage.Filtering[Mainpage.index].setText("광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망포동":
			Albamoncrolling.area += ",B2010010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C1%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄동":
			Albamoncrolling.area += ",B2010060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄1동":
			Albamoncrolling.area += ",B2010020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매탄1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄2동":
			Albamoncrolling.area += ",B2010030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매탄2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄3동":
			Albamoncrolling.area += ",B2010040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매탄3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄4동":
			Albamoncrolling.area += ",B2010050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매탄4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			Albamoncrolling.area += ",B2010070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통동":
			Albamoncrolling.area += ",B2010080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%B5%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통1동":
			Albamoncrolling.area += ",B2010075";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%B5%C5%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영통1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통2동":
			Albamoncrolling.area += ",B2010076";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%B5%C5%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영통2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원천동":
			Albamoncrolling.area += ",B2010090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%F8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이의동":
			Albamoncrolling.area += ",B2010100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%C0%CC%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장동":
			Albamoncrolling.area += ",B2010130";
			Mainpage.Filtering[Mainpage.index].setText("태장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			Albamoncrolling.area += ",B2010110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상광교동":
			Albamoncrolling.area += ",B1900010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BB%F3%B1%A4%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송죽동":
			Albamoncrolling.area += ",B1900020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BC%DB%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연무동":
			Albamoncrolling.area += ",B1900030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BF%AC%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영화동":
			Albamoncrolling.area += ",B1900040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BF%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율전동":
			Albamoncrolling.area += ",B1900050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C0%B2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이목동":
			Albamoncrolling.area += ",B1900060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C0%CC%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자동":
			Albamoncrolling.area += ",B1900100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자1동":
			Albamoncrolling.area += ",B1900070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원정자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자2동":
			Albamoncrolling.area += ",B1900080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원정자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자3동":
			Albamoncrolling.area += ",B1900090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원정자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원동":
			Albamoncrolling.area += ",B1900110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%B6%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원1동":
			Albamoncrolling.area += ",B1900111";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%B6%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원2동":
			Albamoncrolling.area += ",B1900112";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%B6%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천천동":
			Albamoncrolling.area += ",B1900120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C3%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파장동":
			Albamoncrolling.area += ",B1900130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C6%C4%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("파장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하광교동":
			Albamoncrolling.area += ",B1900140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C7%CF%B1%A4%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시고등동":
			Albamoncrolling.area += ",B2000010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B0%ED%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원시고등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			Albamoncrolling.area += ",B2000020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구천동":
			Albamoncrolling.area += ",B2000030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B1%B8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남수동":
			Albamoncrolling.area += ",B2000040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B3%B2%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남창동":
			Albamoncrolling.area += ",B2000050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B3%B2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매교동":
			Albamoncrolling.area += ",B2000060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로1가":
			Albamoncrolling.area += ",B2000070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%BB%EA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("매산로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로2가":
			Albamoncrolling.area += ",B2000080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%BB%EA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("매산로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로3가":
			Albamoncrolling.area += ",B2000090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%BB%EA%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("매산로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매향동":
			Albamoncrolling.area += ",B2000100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북수동":
			Albamoncrolling.area += ",B2000110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BA%CF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신풍동":
			Albamoncrolling.area += ",B2000120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BD%C5%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			Albamoncrolling.area += ",B2000130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만동":
			Albamoncrolling.area += ",B2000160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%EC%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만1동":
			Albamoncrolling.area += ",B2000140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%EC%B8%B81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우만1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만2동":
			Albamoncrolling.area += ",B2000150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%EC%B8%B82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우만2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인계동":
			Albamoncrolling.area += ",B2000170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C0%CE%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			Albamoncrolling.area += ",B2000180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시중동":
			Albamoncrolling.area += ",B2000190";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수원시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지동":
			Albamoncrolling.area += ",B2000200";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로1가":
			Albamoncrolling.area += ",B2000210";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C6%C8%B4%DE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔달로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로2가":
			Albamoncrolling.area += ",B2000220";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C6%C8%B4%DE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔달로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로3가":
			Albamoncrolling.area += ",B2000230";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C6%C8%B4%DE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("팔달로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서동":
			Albamoncrolling.area += ",B2000260";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C8%AD%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서1동":
			Albamoncrolling.area += ",B2000240";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C8%AD%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서2동":
			Albamoncrolling.area += ",B2000250";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C8%AD%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거모동":
			Albamoncrolling.area += ",B2100010";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B0%C5%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시계수동":
			Albamoncrolling.area += ",B2100020";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B0%E8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥시계수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과림동":
			Albamoncrolling.area += ",B2100030";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B0%FA%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("과림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광석동":
			Albamoncrolling.area += ",B2100040";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B1%A4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			Albamoncrolling.area += ",B2100050";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B1%BA%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금이동":
			Albamoncrolling.area += ",B2100060";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B1%DD%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논곡동":
			Albamoncrolling.area += ",B2100070";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B3%ED%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("논곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시능곡동":
			Albamoncrolling.area += ",B2100080";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B4%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥시능곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야동":
			Albamoncrolling.area += ",B2100090";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B4%EB%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도창동":
			Albamoncrolling.area += ",B2100100";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B5%B5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매화동":
			Albamoncrolling.area += ",B2100110";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B8%C5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목감동":
			Albamoncrolling.area += ",B2100120";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B8%F1%B0%A8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무지내동":
			Albamoncrolling.area += ",B2100130";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%AB%C1%F6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무지내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "물왕동":
			Albamoncrolling.area += ",B2100140";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%B0%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("물왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미산동":
			Albamoncrolling.area += ",B2100150";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%CC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산동":
			Albamoncrolling.area += ",B2100160";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배곧동":
			Albamoncrolling.area += ",B2100165";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%E8%B0%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("배곧동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산현동":
			Albamoncrolling.area += ",B2100170";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BB%EA%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			Albamoncrolling.area += ",B2100180";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신현동":
			Albamoncrolling.area += ",B2100350";
			Mainpage.Filtering[Mainpage.index].setText("신현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안현동":
			Albamoncrolling.area += ",B2100190";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BE%C8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연성동":
			Albamoncrolling.area += ",B2100360";

			Mainpage.Filtering[Mainpage.index].setText("연성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곶동":
			Albamoncrolling.area += ",B2100200";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BF%F9%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시은행동":
			Albamoncrolling.area += ",B2100210";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C0%BA%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥시은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장곡동":
			Albamoncrolling.area += ",B2100220";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C0%E5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장현동":
			Albamoncrolling.area += ",B2100230";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C0%E5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕동":
			Albamoncrolling.area += ",B2100280";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕1동":
			Albamoncrolling.area += ",B2100240";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정왕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕2동":
			Albamoncrolling.area += ",B2100250";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정왕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕3동":
			Albamoncrolling.area += ",B2100260";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정왕3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕4동":
			Albamoncrolling.area += ",B2100270";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정왕4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕본동":
			Albamoncrolling.area += ",B2100285";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D5%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정왕본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조남동":
			Albamoncrolling.area += ",B2100290";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%B6%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽율동":
			Albamoncrolling.area += ",B2100300";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%D7%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포동":
			Albamoncrolling.area += ",B2100310";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하상동":
			Albamoncrolling.area += ",B2100320";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C7%CF%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하중동":
			Albamoncrolling.area += ",B2100330";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C7%CF%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시화정동":
			Albamoncrolling.area += ",B2100340";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥시화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고잔동":
			Albamoncrolling.area += ",B2200030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B0%ED%C0%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고잔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부남동":
			Albamoncrolling.area += ",B2200040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B4%EB%BA%CE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대부남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부동":
			Albamoncrolling.area += ",B2200230";
			Mainpage.Filtering[Mainpage.index].setText("대부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부동동":
			Albamoncrolling.area += ",B2200050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B4%EB%BA%CE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대부동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부북동":
			Albamoncrolling.area += ",B2200060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B4%EB%BA%CE%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대부북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목내동":
			Albamoncrolling.area += ",B2200070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B8%F1%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운동":
			Albamoncrolling.area += ",B2200240";
			Mainpage.Filtering[Mainpage.index].setText("백운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선감동":
			Albamoncrolling.area += ",B2200080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%B0%A8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부동":
			Albamoncrolling.area += ",B2200120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부1동":
			Albamoncrolling.area += ",B2200090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선부1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부2동":
			Albamoncrolling.area += ",B2200100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선부2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부3동":
			Albamoncrolling.area += ",B2200110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선부3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시성곡동":
			Albamoncrolling.area += ",B2200130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%BA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안산시성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길동":
			Albamoncrolling.area += ",B2200140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BD%C5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와동":
			Albamoncrolling.area += ",B2200150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BF%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("와동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원곡동":
			Albamoncrolling.area += ",B2200180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BF%F8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원시동":
			Albamoncrolling.area += ",B2200190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BF%F8%BD%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원시동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시중앙동":
			Albamoncrolling.area += ",B2200250";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안산시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초지동":
			Albamoncrolling.area += ",B2200200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C3%CA%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍도동":
			Albamoncrolling.area += ",B2200210";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C7%B3%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호수동":
			Albamoncrolling.area += ",B2200260";
			Mainpage.Filtering[Mainpage.index].setText("호수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시화정동":
			Albamoncrolling.area += ",B2200220";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안산시화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건건동":
			Albamoncrolling.area += ",B2210010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%B0%C7%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("건건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			Albamoncrolling.area += ",B2210210";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오동":
			Albamoncrolling.area += ",B2210050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오1동":
			Albamoncrolling.area += ",B2210020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본오1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오2동":
			Albamoncrolling.area += ",B2210030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본오2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오3동":
			Albamoncrolling.area += ",B2210040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C03%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본오3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시부곡동":
			Albamoncrolling.area += ",B2210060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안산시부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			Albamoncrolling.area += ",B2210090";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사사동":
			Albamoncrolling.area += ",B2210100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BB%E7%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사이동":
			Albamoncrolling.area += ",B2210080";
			Mainpage.Filtering[Mainpage.index].setText("사이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성포동":
			Albamoncrolling.area += ",B2210110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BC%BA%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수암동":
			Albamoncrolling.area += ",B2210120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BC%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산동":
			Albamoncrolling.area += ",B2210220";
			Mainpage.Filtering[Mainpage.index].setText("안산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양상동":
			Albamoncrolling.area += ",B2210130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BE%E7%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월피동":
			Albamoncrolling.area += ",B2210140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BF%F9%C7%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월피동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			Albamoncrolling.area += ",B2210150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일동":
			Albamoncrolling.area += ",B2210160";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장상동":
			Albamoncrolling.area += ",B2210170";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%E5%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장하동":
			Albamoncrolling.area += ",B2210180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%E5%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔곡이동":
			Albamoncrolling.area += ",B2210190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C6%C8%B0%EE%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔곡이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔곡일동":
			Albamoncrolling.area += ",B2210200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C6%C8%B0%EE%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("팔곡일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해양동":
			Albamoncrolling.area += ",B2210230";
			Mainpage.Filtering[Mainpage.index].setText("해양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
