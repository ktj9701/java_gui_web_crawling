package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Seoul {
	public boolean flag;

	public void SeoulCity(ActionEvent e) {
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
		case "개포동":
			Albamoncrolling.area += ",I0100050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포1동":
			Albamoncrolling.area += ",I0100010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포2동":
			Albamoncrolling.area += ",I0100020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포4동":
			Albamoncrolling.area += ",I0100040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개포4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현동":
			Albamoncrolling.area += ",I0100080";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B3%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("논현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현1동":
			Albamoncrolling.area += ",I0100060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B3%ED%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("논현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현2동":
			Albamoncrolling.area += ",I0100070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B3%ED%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("논현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치동":
			Albamoncrolling.area += ",I0100130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치1동":
			Albamoncrolling.area += ",I0100090";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대치1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치2동":
			Albamoncrolling.area += ",I0100100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대치2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치4동":
			Albamoncrolling.area += ",I0100120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대치4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡동":
			Albamoncrolling.area += ",I0100160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B5%B5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡1동":
			Albamoncrolling.area += ",I0100140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B5%B5%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡2동":
			Albamoncrolling.area += ",I0100150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B5%B5%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동":
			Albamoncrolling.area += ",I0100190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BB%EF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성1동":
			Albamoncrolling.area += ",I0100170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BB%EF%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성2동":
			Albamoncrolling.area += "I0100180";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BB%EF%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세곡동":
			Albamoncrolling.area += ",I0100200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BC%BC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("세곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수서동":
			Albamoncrolling.area += ",I0100210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BC%F6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신사동":
			Albamoncrolling.area += ",I0100220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "압구정동":
			Albamoncrolling.area += ",I0100250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BE%D0%B1%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("압구정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼동":
			Albamoncrolling.area += ",I0100280";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BF%AA%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼1동":
			Albamoncrolling.area += ",I0100260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BF%AA%BB%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역삼1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼2동":
			Albamoncrolling.area += ",I0100270";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BF%AA%BB%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역삼2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율현동":
			Albamoncrolling.area += ",I0100290";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원동":
			Albamoncrolling.area += ",I0100320";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원1동":
			Albamoncrolling.area += ",I0100300";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원2동":
			Albamoncrolling.area += ",I0100310";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원본동":
			Albamoncrolling.area += ",I0100330";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F8%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일원본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자곡동":
			Albamoncrolling.area += ",I0100340";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%DA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청담동":
			Albamoncrolling.area += ",I0100370";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C3%BB%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강일동":
			Albamoncrolling.area += ",I0200010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%AD%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕동":
			Albamoncrolling.area += ",I0200040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%ED%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕1동":
			Albamoncrolling.area += ",I0200020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%ED%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕2동":
			Albamoncrolling.area += ",I0200030";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%ED%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길동":
			Albamoncrolling.area += ",I0200070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔촌동":
			Albamoncrolling.area += ",I0200100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B5%D0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔촌1동":
			Albamoncrolling.area += ",I0200080";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B5%D0%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔촌2동":
			Albamoncrolling.area += ",I0200090";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B5%D0%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명일동":
			Albamoncrolling.area += ",I0200130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B8%ED%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명일1동":
			Albamoncrolling.area += ",I0200110";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B8%ED%C0%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명일1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명일2동":
			Albamoncrolling.area += ",I0200120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B8%ED%C0%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명일2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상일동":
			Albamoncrolling.area += ",I0200140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BB%F3%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			Albamoncrolling.area += ",I0200180";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내1동":
			Albamoncrolling.area += ",I0200150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내2동":
			Albamoncrolling.area += ",I0200160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내3동":
			Albamoncrolling.area += ",I0200170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "암사동":
			Albamoncrolling.area += ",I0200230";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암사1동":
			Albamoncrolling.area += ",I0200190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암사2동":
			Albamoncrolling.area += ",I0200200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암사3동":
			Albamoncrolling.area += ",I0200210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암사3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호동":
			Albamoncrolling.area += ",I0200280";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호1동":
			Albamoncrolling.area += ",I0200240";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천호1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호2동":
			Albamoncrolling.area += ",I0200250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천호2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호3동":
			Albamoncrolling.area += ",I0200260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천호3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미아동":
			Albamoncrolling.area += ",I0300100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%CC%BE%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암사3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번동":
			Albamoncrolling.area += ",I0300140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("번동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번1동":
			Albamoncrolling.area += ",I0300110";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("번1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번2동":
			Albamoncrolling.area += ",I0300120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("번2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번3동":
			Albamoncrolling.area += ",I0300130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("번3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼각산동":
			Albamoncrolling.area += ",I0300060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BB%EF%B0%A2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼각산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양동":
			Albamoncrolling.area += ",I0300010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BB%EF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송중동":
			Albamoncrolling.area += ",I0300040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%DB%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동":
			Albamoncrolling.area += ",I0300050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%DB%C3%B5%B5%BF	";
			Mainpage.Filtering[Mainpage.index].setText("송천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유동":
			Albamoncrolling.area += ",I0300210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유1동":
			Albamoncrolling.area += ",I0300150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수유1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유2동":
			Albamoncrolling.area += ",I0300160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수유2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유3동":
			Albamoncrolling.area += ",I0300170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수유3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우이동":
			Albamoncrolling.area += ",I0300220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BF%EC%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인수동":
			Albamoncrolling.area += ",I0300190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%C0%CE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양동":
			Albamoncrolling.area += ",I0400040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양1동":
			Albamoncrolling.area += ",I0400010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양2동":
			Albamoncrolling.area += ",I0400020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양3동":
			Albamoncrolling.area += ",I0400030";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개화동":
			Albamoncrolling.area += ",I0400050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%B3%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공항동":
			Albamoncrolling.area += ",I0400060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%F8%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과해동":
			Albamoncrolling.area += ",I0400070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%FA%C7%D8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("과해동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내발산동":
			Albamoncrolling.area += ",I0400100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B3%BB%B9%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌동":
			Albamoncrolling.area += ",I0400140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("등촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌1동":
			Albamoncrolling.area += ",I0400110";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("등촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌2동":
			Albamoncrolling.area += ",I0400120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("등촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌3동":
			Albamoncrolling.area += ",I0400130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("등촌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마곡동":
			Albamoncrolling.area += ",I0400150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B8%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화동":
			Albamoncrolling.area += ",I0400190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화1동":
			Albamoncrolling.area += ",I0400160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화2동":
			Albamoncrolling.area += ",I0400170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화3동":
			Albamoncrolling.area += ",I0400180";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방화3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염창동":
			Albamoncrolling.area += ",I0400200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%B0%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("염창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오곡동":
			Albamoncrolling.area += ",I0400210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오쇠동":
			Albamoncrolling.area += ",I0400220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%C0%BC%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오쇠동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외발산동":
			Albamoncrolling.area += ",I0400230";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%DC%B9%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우장산동":
			Albamoncrolling.area += ",I0400280";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%EC%C0%E5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우장산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡동":
			Albamoncrolling.area += ",I0400320";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡1동":
			Albamoncrolling.area += ",I0400240";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡2동":
			Albamoncrolling.area += ",I0400250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡3동":
			Albamoncrolling.area += ",I0400260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡4동":
			Albamoncrolling.area += ",I0400270";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡6동":
			Albamoncrolling.area += ",I0400290";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡8동":
			Albamoncrolling.area += ",I0400310";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡본동":
			Albamoncrolling.area += ",I0400330";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화곡본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙성대동":
			Albamoncrolling.area += ",I0500100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%AB%BC%BA%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙성대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난곡동":
			Albamoncrolling.area += ",I0500210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("난곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난향동":
			Albamoncrolling.area += ",I0500250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%AD%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("난향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남현동":
			Albamoncrolling.area += ",I0500010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대학동":
			Albamoncrolling.area += ",I0500270";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B4%EB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미성동":
			Albamoncrolling.area += ",I0500160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B9%CC%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보라매동":
			Albamoncrolling.area += ",I0500040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BA%B8%B6%F3%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보라매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉천동":
			Albamoncrolling.area += ",I0500130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BA%C0%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관악구삼성동":
			Albamoncrolling.area += ",I0500240";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BB%EF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관악구 삼성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서림동":
			Albamoncrolling.area += ",I0500200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BC%AD%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서원동":
			Albamoncrolling.area += ",I0500290";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BC%AD%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성현동":
			Albamoncrolling.area += ",I0500050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BC%BA%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신림동":
			Albamoncrolling.area += ",I0500230";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BD%C5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관악구신사동":
			Albamoncrolling.area += ",I0500220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관악구신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신원동":
			Albamoncrolling.area += ",I0500190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BD%C5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은천동":
			Albamoncrolling.area += ",I0500120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C0%BA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인헌동":
			Albamoncrolling.area += ",I0500030";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C0%CE%C7%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인헌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원동":
			Albamoncrolling.area += ",I0500260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C1%B6%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",I0500020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("증앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청룡동":
			Albamoncrolling.area += ",I0500070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청림동":
			Albamoncrolling.area += ",I0500060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C3%BB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행운동":
			Albamoncrolling.area += ",I0500090";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C7%E0%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광장동":
			Albamoncrolling.area += ",I0600010";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%A4%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의동":
			Albamoncrolling.area += ",I0600050";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의1동":
			Albamoncrolling.area += ",I0600020";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구의1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의2동":
			Albamoncrolling.area += ",I0600030";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구의2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의3동":
			Albamoncrolling.area += ",I0600040";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구의3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			Albamoncrolling.area += ",I0600060";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%BA%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능동":
			Albamoncrolling.area += ",I0600100";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양동":
			Albamoncrolling.area += ",I0600150";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양1동":
			Albamoncrolling.area += ",I0600120";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양2동":
			Albamoncrolling.area += ",I0600130";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양3동":
			Albamoncrolling.area += ",I0600140";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양4동":
			Albamoncrolling.area += ",I0600070";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자양4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡동":
			Albamoncrolling.area += ",I0600200";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡1동":
			Albamoncrolling.area += ",I0600160";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡2동":
			Albamoncrolling.area += ",I0600170";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡3동":
			Albamoncrolling.area += ",I0600180";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡4동":
			Albamoncrolling.area += ",I0600190";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화양동":
			Albamoncrolling.area += ",I0600210";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C8%AD%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가리봉동":
			Albamoncrolling.area += ",I0700030";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%A1%B8%AE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가리봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉동":
			Albamoncrolling.area += ",I0700070";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉1동":
			Albamoncrolling.area += ",I0700040";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉2동":
			Albamoncrolling.area += ",I0700050";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉3동":
			Albamoncrolling.area += ",I0700060";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C03%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개봉3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고척동":
			Albamoncrolling.area += ",I0700110";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%ED%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고척1동":
			Albamoncrolling.area += ",I0700090";
			AlbaHeavencrolling.area="02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%ED%C3%B41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고척1동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고척2동":
			Albamoncrolling.area += ",I0700100";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%ED%C3%B42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고척2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로동":
			Albamoncrolling.area += ",I0700180";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로1동":
			Albamoncrolling.area += ",I0700120";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구로1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로2동":
			Albamoncrolling.area += ",I0700130";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구로2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로3동":
			Albamoncrolling.area += ",I0700140";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구로3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로4동":
			Albamoncrolling.area += ",I0700150";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구로4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로5동":
			Albamoncrolling.area += ",I0700160";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구로5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁동":
			Albamoncrolling.area += ",I0700200";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신도림동":
			Albamoncrolling.area += ",I0700210";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BD%C5%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류동":
			Albamoncrolling.area += ",I0700240";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류1동":
			Albamoncrolling.area += ",I0700220";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C0%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오류1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류2동":
			Albamoncrolling.area += ",I0700230";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C0%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오류2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온수동":
			Albamoncrolling.area += ",I0700250";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C2%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천왕동":
			Albamoncrolling.area += ",I0700260";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%C3%B5%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동":
			Albamoncrolling.area += ",I0700270";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가산동":
			Albamoncrolling.area += ",I0800010";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B0%A1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산동":
			Albamoncrolling.area += ",I0800060";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("독산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산1동":
			Albamoncrolling.area += ",I0800020";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("독산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산2동":
			Albamoncrolling.area += ",I0800030";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("독산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산3동":
			Albamoncrolling.area += "I0800040";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("독산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산4동":
			Albamoncrolling.area += ",I0800050";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("독산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥동":
			Albamoncrolling.area += ",I0800130";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥1동":
			Albamoncrolling.area += ",I0800080";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥2동":
			Albamoncrolling.area += ",I0800090";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥3동":
			Albamoncrolling.area += ",I0800100";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥4동":
			Albamoncrolling.area += ",I0800110";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥5동":
			Albamoncrolling.area += ",I0800120";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시흥5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공릉동":
			Albamoncrolling.area += ",I0900040";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%B0%F8%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공릉1.3동":
			Albamoncrolling.area += ",I0900010";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%B0%F8%B8%AA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공릉1.3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공릉2동":
			Albamoncrolling.area += ",I0900020";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%B0%F8%B8%AA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공릉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계동":
			Albamoncrolling.area += ",I0900150";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계1동":
			Albamoncrolling.area += ",I0900060";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계2동":
			Albamoncrolling.area += ",I0900070";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계3.4동":
			Albamoncrolling.area += ",I0900080";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E83.4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계3.4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계5동":
			Albamoncrolling.area += ",I0900100";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E85%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계6.7동":
			Albamoncrolling.area += ",I0900110";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E86.7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계6.7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계8동":
			Albamoncrolling.area += ",I0900130";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E88%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계9동":
			Albamoncrolling.area += ",I0900140";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E89%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계10동":
			Albamoncrolling.area += ",I0900050";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E810%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상계10동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계동":
			Albamoncrolling.area += ",I0900200";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계1동":
			Albamoncrolling.area += ",I0900160";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계2동":
			Albamoncrolling.area += ",I0900170";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월계2동\"");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계3동":
			Albamoncrolling.area += ",I0900180";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월계3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계동":
			Albamoncrolling.area += ",I0900250";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계1동":
			Albamoncrolling.area += ",I0900210";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계2.3동":
			Albamoncrolling.area += ",I0900220";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E82.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중계2.3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계4동":
			Albamoncrolling.area += ",I0900240";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중계4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계본동":
			Albamoncrolling.area += ",I0900260";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E8%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중계본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하계동":
			Albamoncrolling.area += ",I0900290";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C7%CF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하계1동":
			Albamoncrolling.area += ",I0900270";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C7%CF%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하계2동":
			Albamoncrolling.area += ",I0900280";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C7%CF%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하계2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도봉동":
			Albamoncrolling.area += ",I1000030";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B5%B5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도봉1동":
			Albamoncrolling.area += ",I1000010";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B5%B5%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도봉2동":
			Albamoncrolling.area += ",I1000020";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B5%B5%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학동":
			Albamoncrolling.area += ",I1000080";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학1동":
			Albamoncrolling.area += ",I1000040";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방학1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학2동":
			Albamoncrolling.area += ",I1000050";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방학2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학3동":
			Albamoncrolling.area += ",I1000060";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D03%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방학3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문동":
			Albamoncrolling.area += ",I1000130";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문1동":
			Albamoncrolling.area += ",I1000090";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문2동":
			Albamoncrolling.area += ",I1000100";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문3동":
			Albamoncrolling.area += ",I1000110";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍문3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문4동":
			Albamoncrolling.area += ",I1000120";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쌍문4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			Albamoncrolling.area += ",I1000190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창1동":
			Albamoncrolling.area += ",I1000140";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창2동":
			Albamoncrolling.area += ",I1000150";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창3동":
			Albamoncrolling.area += ",I1000160";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창4동":
			Albamoncrolling.area += ",I1000170";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창5동":
			Albamoncrolling.area += ",I1000180";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A25%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답십리동":
			Albamoncrolling.area += ",I1100060";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%B4%E4%BD%CA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("답십리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답십리1동":
			Albamoncrolling.area += ",I1100010";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%B4%E4%BD%CA%B8%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("답십리1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답십리2동":
			Albamoncrolling.area += ",I1100020";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%B4%E4%BD%CA%B8%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("답십리2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신설동":
			Albamoncrolling.area += ",I1100070";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%BD%C5%BC%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신설동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			Albamoncrolling.area += ",I1100100";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이문동":
			Albamoncrolling.area += ",I1100140";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%CC%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이문1동":
			Albamoncrolling.area += ",I1100110";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%CC%B9%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이문2동":
			Albamoncrolling.area += ",I1100120";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%CC%B9%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			Albamoncrolling.area += ",I1100190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안1동":
			Albamoncrolling.area += ",I1100150";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%E5%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안2동":
			Albamoncrolling.area += ",I1100160";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%E5%BE%C82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전농동":
			Albamoncrolling.area += ",I1100240";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%FC%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전농1동":
			Albamoncrolling.area += ",I1100200";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%FC%B3%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전농1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전농2동":
			Albamoncrolling.area += ",I1100210";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%FC%B3%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전농2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제기동":
			Albamoncrolling.area += ",I1100270";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C1%A6%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("제기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청량리동":
			Albamoncrolling.area += ",I1100300";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C3%BB%B7%AE%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청량리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회기동":
			Albamoncrolling.area += ",I1100310";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%B8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휘경동":
			Albamoncrolling.area += ",I1100340";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%D6%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("휘경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휘경1동":
			Albamoncrolling.area += ",I1100320";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%D6%B0%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("휘경1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휘경2동":
			Albamoncrolling.area += ",I1100330";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%D6%B0%E62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("휘경2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노량진동":
			Albamoncrolling.area += ",I1200030";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B3%EB%B7%AE%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노량진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노량진1동":
			Albamoncrolling.area += ",I1200010";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B3%EB%B7%AE%C1%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노량진1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노량진2동":
			Albamoncrolling.area += ",I1200020";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B3%EB%B7%AE%C1%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노량진2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대방동":
			Albamoncrolling.area += ",I1200040";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동작동":
			Albamoncrolling.area += ",I1200050";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B5%BF%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본동":
			Albamoncrolling.area += ",I1200060";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당동":
			Albamoncrolling.area += ",I1200120";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당1동":
			Albamoncrolling.area += ",I1200070";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당2동":
			Albamoncrolling.area += ",I1200080";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당3동":
			Albamoncrolling.area += ",I1200090";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당4동":
			Albamoncrolling.area += ",I1200100";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당5동":
			Albamoncrolling.area += ",I1200110";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도동":
			Albamoncrolling.area += ",I1200180";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도1동":
			Albamoncrolling.area += ",I1200130";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도2동":
			Albamoncrolling.area += ",I1200140";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도3동":
			Albamoncrolling.area += ",I1200150";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도4동":
			Albamoncrolling.area += ",I1200160";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대방동":
			Albamoncrolling.area += ",I1200210";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BD%C5%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대방1동":
			Albamoncrolling.area += ",I1200190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BD%C5%B4%EB%B9%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신대방1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대방2동":
			Albamoncrolling.area += ",I1200190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BD%C5%B4%EB%B9%E62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신대방2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑석동":
			Albamoncrolling.area += ",I1200250";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흑석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공덕동":
			Albamoncrolling.area += ",I1300030";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B0%F8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구수동":
			Albamoncrolling.area += ",I1300040";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B1%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노고산동":
			Albamoncrolling.area += ",I1300050";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B3%EB%B0%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노고산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당인동":
			Albamoncrolling.area += ",I1300060";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B4%E7%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			Albamoncrolling.area += ",I1300070";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화동":
			Albamoncrolling.area += ",I1300100";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B5%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동교동":
			Albamoncrolling.area += ",I1300110";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B5%BF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마포동":
			Albamoncrolling.area += ",I1300120";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%B6%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망원동":
			Albamoncrolling.area += ",I1300150";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%C1%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망원1동":
			Albamoncrolling.area += ",I1300130";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%C1%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망원2동":
			Albamoncrolling.area += "I1300140";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%C1%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상수동":
			Albamoncrolling.area += ",I1300160";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BB%F3%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상암동":
			Albamoncrolling.area += ",I1300170";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BB%F3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서교동":
			Albamoncrolling.area += ",I1300180";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%AD%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산동":
			Albamoncrolling.area += ",I1300210";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%BA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산1동":
			Albamoncrolling.area += ",I1300190";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%BA%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산2동":
			Albamoncrolling.area += ",I1300200";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%BA%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신공덕동":
			Albamoncrolling.area += ",I1300220";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BD%C5%B0%F8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신공덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신수동":
			Albamoncrolling.area += ",I1300230";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BD%C5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정동":
			Albamoncrolling.area += ",I1300240";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아현동":
			Albamoncrolling.area += ",I1300280";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BE%C6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연남동":
			Albamoncrolling.area += ",I1300290";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BF%AC%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염리동":
			Albamoncrolling.area += ",I1300300";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BF%B0%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("염리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			Albamoncrolling.area += ",I1300310";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			Albamoncrolling.area += ",I1300320";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창전동":
			Albamoncrolling.area += ",I1300325";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토정동":
			Albamoncrolling.area += ",I1300340";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C5%E4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하중동":
			Albamoncrolling.area += ",I1300350";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C7%CF%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합정동":
			Albamoncrolling.area += ",I1300360";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C7%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("합정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현석동":
			Albamoncrolling.area += ",I1300370";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C7%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남가좌동":
			Albamoncrolling.area += ",I1400030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%B2%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남가좌1동":
			Albamoncrolling.area += ",I1400010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%B2%B0%A1%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남가좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남가좌2동":
			Albamoncrolling.area += ",I1400020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%B2%B0%A1%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남가좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "냉천동":
			Albamoncrolling.area += ",I1400040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%C3%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("냉천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대신동":
			Albamoncrolling.area += ",I1400045";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B4%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대현동":
			Albamoncrolling.area += ",I1400060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B4%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미근동":
			Albamoncrolling.area += ",I1400070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B9%CC%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미근동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉원동":
			Albamoncrolling.area += ",I1400080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%C0%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북가좌동":
			Albamoncrolling.area += ",I1400110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북가좌1동":
			Albamoncrolling.area += ",I1400090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%B0%A1%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북가좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북가좌2동":
			Albamoncrolling.area += ",I1400100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%B0%A1%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북가좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북아현동":
			Albamoncrolling.area += ",I1400150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%BE%C6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북아현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			Albamoncrolling.area += ",I1400160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연희동":
			Albamoncrolling.area += ",I1400200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BF%AC%C8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연희동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영천동":
			Albamoncrolling.area += ",I1400210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			Albamoncrolling.area += ",I1400220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창천동":
			Albamoncrolling.area += ",I1400230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%A2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천연동":
			Albamoncrolling.area += ",I1400240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%B5%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로2가":
			Albamoncrolling.area += ",I1400250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충정로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로3가":
			Albamoncrolling.area += ",I1400260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("충정로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충현동":
			Albamoncrolling.area += ",I1400140";
			Mainpage.Filtering[Mainpage.index].setText("충현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합동":
			Albamoncrolling.area += ",I1400270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C7%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("합동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현저동":
			Albamoncrolling.area += ",I1400280";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C7%F6%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍은동":
			Albamoncrolling.area += ",I1400320";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C0%BA0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍은1동":
			Albamoncrolling.area += ",I1400290";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C0%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍은1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "홍은2동":
			Albamoncrolling.area += ",I1400300";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C0%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍은2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제동":
			Albamoncrolling.area += ",I1400370";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제1동":
			Albamoncrolling.area += ",I1400330";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍제1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제2동":
			Albamoncrolling.area += ",I1400340";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍제2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제3동":
			Albamoncrolling.area += ",I1400350";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍제3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			Albamoncrolling.area += ",I1500010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포동":
			Albamoncrolling.area += ",I1500060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포1동":
			Albamoncrolling.area += ",I1500020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포2동":
			Albamoncrolling.area += ",I1500030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포3동":
			Albamoncrolling.area += ",I1500040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반포3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포4동":
			Albamoncrolling.area += "I1500050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반포4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포본동":
			Albamoncrolling.area += ",I1500070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "빙배동":
			Albamoncrolling.area += ",I1500120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("빙배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배1동":
			Albamoncrolling.area += ",I1500080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방배1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배2동":
			Albamoncrolling.area += ",I1500090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방배2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배3동":
			Albamoncrolling.area += ",I1500100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방배3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배4동":
			Albamoncrolling.area += ",I1500110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방배4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배본동":
			Albamoncrolling.area += ",I1500130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E8%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방배본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초동":
			Albamoncrolling.area += ",I1500180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초1동":
			Albamoncrolling.area += ",I1500140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서초1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초2동":
			Albamoncrolling.area += ",I1500150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서초2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초3동":
			Albamoncrolling.area += ",I1500160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서초3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초4동":
			Albamoncrolling.area += ",I1500170";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서초4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초구신원동":
			Albamoncrolling.area += ",I1500190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BD%C5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서초구 신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양재동":
			Albamoncrolling.area += ",I1500220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BE%E7%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양재1동":
			Albamoncrolling.area += ",I1500200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BE%E7%C0%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양재1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양재2동":
			Albamoncrolling.area += ",I1500210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BE%E7%C0%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양재2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염곡동":
			Albamoncrolling.area += ",I1500230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BF%B0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("염곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우면동":
			Albamoncrolling.area += ",I1500240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BF%EC%B8%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우면동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원지동":
			Albamoncrolling.area += ",I1500250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BF%F8%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠원동":
			Albamoncrolling.area += ",I1500260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%C0%E1%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("잠원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동1가":
			Albamoncrolling.area += ",I1600010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("금호동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동2가":
			Albamoncrolling.area += ",I1600020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("금호동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동3가":
			Albamoncrolling.area += ",I1600030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("금호동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동4가":
			Albamoncrolling.area += ",I1600040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("금호동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도선동":
			Albamoncrolling.area += ",I1600050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B5%B5%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마장동":
			Albamoncrolling.area += ",I1600060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B8%B6%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사근동":
			Albamoncrolling.area += ",I1600070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BB%E7%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사근동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상왕십리동":
			Albamoncrolling.area += ",I1600080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BB%F3%BF%D5%BD%CA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상왕십리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수동1가":
			Albamoncrolling.area += ",I1600130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("성수동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수동2가":
			Albamoncrolling.area += ",I1600140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("성수동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수1가1동":
			Albamoncrolling.area += "I1600090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F61%B0%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성수1가1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수1가2동":
			Albamoncrolling.area += ",I1600100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F61%B0%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성수1가2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수2가1동":
			Albamoncrolling.area += ",I1600110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F62%B0%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성수2가1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수2가3동":
			Albamoncrolling.area += ",I1600120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F62%B0%A13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성수2가3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			Albamoncrolling.area += ",I1600150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥수동":
			Albamoncrolling.area += ",I1600180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BF%C1%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용답동":
			Albamoncrolling.area += ",I1600190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BF%EB%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응봉동":
			Albamoncrolling.area += ",I1600200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C0%C0%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하왕십리동":
			Albamoncrolling.area += ",I1600230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%CF%BF%D5%BD%CA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하왕십리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행당동":
			Albamoncrolling.area += ",I1600260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%E0%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행당1동":
			Albamoncrolling.area += ",I1600240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%E0%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행당2동":
			Albamoncrolling.area += ",I1600250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%E0%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍익동":
			Albamoncrolling.area += ",I1600270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C8%AB%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길음동":
			Albamoncrolling.area += ",I1700040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B1%E6%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("길음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길음1동":
			Albamoncrolling.area += ",I1700010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B1%E6%C0%BD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("길음1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길음2동":
			Albamoncrolling.area += ",I1700020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B1%E6%C0%BD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("길음2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈암동":
			Albamoncrolling.area += ",I1700070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%B7%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("돈암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈암1동":
			Albamoncrolling.area += ",I1700050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%B7%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("돈암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈암2동":
			Albamoncrolling.area += ",I1700060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%B7%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("돈암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동1가":
			Albamoncrolling.area += ",I1700080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동2가":
			Albamoncrolling.area += ",I1700090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동선동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동3가":
			Albamoncrolling.area += ",I1700100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동선동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동4가":
			Albamoncrolling.area += ",I1700110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동선동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동5가":
			Albamoncrolling.area += ",I1700120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동선동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동1가":
			Albamoncrolling.area += ",I1700130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동2가":
			Albamoncrolling.area += ",I1700140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동3가":
			Albamoncrolling.area += ",I1700150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동4가":
			Albamoncrolling.area += ",I1700160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동5가":
			Albamoncrolling.area += ",I1700170";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동6가":
			Albamoncrolling.area += ",I1700180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF+%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동7가":
			Albamoncrolling.area += ",I1700190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("동소문동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동1가":
			Albamoncrolling.area += ",I1700200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동2가":
			Albamoncrolling.area += ",I1700210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동3가":
			Albamoncrolling.area += ",I1700220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동4가":
			Albamoncrolling.area += ",I1700230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동5가":
			Albamoncrolling.area += ",I1700240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동6가":
			Albamoncrolling.area += ",I1700250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동7가":
			Albamoncrolling.area += ",I1700260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보문동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동1가":
			Albamoncrolling.area += ",I1700270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동2가":
			Albamoncrolling.area += ",I1700280";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "삼성동3가":
			Albamoncrolling.area += ",I1700290";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동4가":
			Albamoncrolling.area += ",I1700300";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼성동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동5가":
			Albamoncrolling.area += ",I1700310";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("삼성동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상월곡동":
			Albamoncrolling.area += ",I1700320";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%F3%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석관동":
			Albamoncrolling.area += ",I1700350";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BC%AE%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			Albamoncrolling.area += ",I1700380";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동1가":
			Albamoncrolling.area += ",I1700390";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("성북동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동1가":
			Albamoncrolling.area += ",I1700400";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("안암동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동2가":
			Albamoncrolling.area += ",I1700410";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("안암동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동3가":
			Albamoncrolling.area += ",I1700420";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("안암동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동4가":
			Albamoncrolling.area += ",I1700430";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("안암동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동5가":
			Albamoncrolling.area += ",I1700440";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("안암동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡1동":
			Albamoncrolling.area += ",I1700445";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BF%F9%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡2동":
			Albamoncrolling.area += ",I1700446";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BF%F9%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위동":
			Albamoncrolling.area += ",I1700480";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A70%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장위동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위1동":
			Albamoncrolling.area += ",I1700450";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장위1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위2동":
			Albamoncrolling.area += ",I1700460";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장위2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위3동":
			Albamoncrolling.area += ",I1700470";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장위3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉동":
			Albamoncrolling.area += ",I1700530";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉1동":
			Albamoncrolling.area += ",I1700490";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정릉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉2동":
			Albamoncrolling.area += ",I1700500";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정릉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉3동":
			Albamoncrolling.area += ",I1700510";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정릉3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉4동":
			Albamoncrolling.area += ",I1700520";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정릉4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종암동":
			Albamoncrolling.area += ",I1700560";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%BE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("종암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하월곡동":
			Albamoncrolling.area += ",I1700610";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C7%CF%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
