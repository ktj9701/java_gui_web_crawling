package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;
public class Jeonnam {
	public boolean flag;

	public void JeonnamCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			crolling.area = "";
		wewe.area ="";
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
		case "강진읍":
			crolling.area += ",L0100010";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B0%AD%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("강진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군동면":
			crolling.area += ",L0100020";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B1%BA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대구면":
			crolling.area += ",L0100030";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B4%EB%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도암면":
			crolling.area += ",L0100040";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B5%B5%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마량면":
			crolling.area += ",L0100050";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B8%B6%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병영면":
			crolling.area += ",L0100060";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BA%B4%BF%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("병영면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성전면":
			crolling.area += ",L0100070";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BC%BA%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신전면":
			crolling.area += ",L0100080";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BD%C5%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옴천면":
			crolling.area += ",L0100090";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BF%C8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옴천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작천면":
			crolling.area += ",L0100100";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%C0%DB%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("작천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠량면":
			crolling.area += ",L0100110";
			wewe.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%C4%A5%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("칠량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고흥읍":
			crolling.area += ",L0200010";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B0%ED%C8%EF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("고흥읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과역면":
			crolling.area += ",L0200020";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B0%FA%BF%AA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("과역면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산면":
			crolling.area += ",L0200030";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B1%DD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양면":
			crolling.area += ",L0200040";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B3%B2%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대서면":
			crolling.area += ",L0200050";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B4%EB%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도덕면":
			crolling.area += ",L0200060";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%B5%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도양읍":
			crolling.area += ",L0200070";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%B5%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("도양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화면":
			crolling.area += ",L0200080";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%B5%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동강면":
			crolling.area += ",L0200090";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%BF%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동일면":
			crolling.area += ",L0200100";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%BF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두원면":
			crolling.area += ",L0200110";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%CE%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("두원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래면":
			crolling.area += ",L0200120";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%BA%C0%B7%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉래면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영남면":
			crolling.area += ",L0200130";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%BF%B5%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점암면":
			crolling.area += ",L0200140";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%C1%A1%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("점암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포두면":
			crolling.area += ",L0200150";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%C6%F7%B5%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("포두면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍양면":
			crolling.area += ",L0200160";
			wewe.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%C7%B3%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("풍양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "겸면":
			crolling.area += ",L0300010";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B0%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("겸면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고달면":
			crolling.area += ",L0300020";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B0%ED%B4%DE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고달면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곡성읍":
			crolling.area += ",L0300030";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B0%EE%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("곡성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목사동면":
			crolling.area += ",L0300040";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B8%F1%BB%E7%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("목사동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼기면":
			crolling.area += ",L0300050";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BB%EF%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석곡면":
			crolling.area += ",L0300060";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BC%AE%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("석곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오곡면":
			crolling.area += ",L0300070";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BF%C0%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("오곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산면":
			crolling.area += ",L0300080";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BF%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("오산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥과면":
			crolling.area += ",L0300090";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BF%C1%B0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥과면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입면":
			crolling.area += ",L0300100";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%C0%D4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("입면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽곡면":
			crolling.area += ",L0300110";
			wewe.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%C1%D7%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("죽곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광양읍":
			crolling.area += ",L0400010";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B1%A4%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("광양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광영동":
			crolling.area += ",L0400020";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B1%A4%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동":
			crolling.area += ",L0400030";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다압면":
			crolling.area += ",L0400040";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B4%D9%BE%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("다압면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도이동":
			crolling.area += ",L0400050";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B5%B5%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마동":
			crolling.area += ",L0400060";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉강면":
			crolling.area += ",L0400070";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BA%C0%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성황동":
			crolling.area += ",L0400080";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BC%BA%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥곡면":
			crolling.area += ",L0400090";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BF%C1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥룡면":
			crolling.area += ",L0400100";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BF%C1%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중군동":
			crolling.area += ",L0400110";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%DF%B1%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중군동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",L0400120";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진상면":
			crolling.area += ",L0400130";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%F8%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진월면":
			crolling.area += ",L0400140";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%F8%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태인동":
			crolling.area += ",L0400150";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C5%C2%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금동":
			crolling.area += ",L0400160";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황길동":
			crolling.area += ",L0400170";
			wewe.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C8%B2%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간전면":
			crolling.area += ",L0500010";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B0%A3%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("간전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광의면":
			crolling.area += ",L0500020";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B1%A4%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("광의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구례읍":
			crolling.area += ",L0500030";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B1%B8%B7%CA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("구례읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산면":
			crolling.area += ",L0500040";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B8%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문척면":
			crolling.area += ",L0500050";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B9%AE%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산동면":
			crolling.area += ",L0500060";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%BB%EA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용방면":
			crolling.area += ",L0500070";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%BF%EB%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용방면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토지면":
			crolling.area += ",L0500080";
			wewe.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%C5%E4%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("토지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경현동":
			crolling.area += ",L0600010";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%E6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공산면":
			crolling.area += ",L0600020";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%F8%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("공산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과원동":
			crolling.area += ",L0600030";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%FA%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("과원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관정동":
			crolling.area += ",L0600040";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%FC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",L0600050";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금계동":
			crolling.area += ",L0600060";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%DD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남동":
			crolling.area += ",L0600070";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("금남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양동":
			crolling.area += ",L0600080";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("가양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성동":
			crolling.area += ",L0600090";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%DD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천면":
			crolling.area += ",L0600100";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%DD%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남내동":
			crolling.area += ",L0600110";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%B2%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남외동":
			crolling.area += ",L0600120";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%B2%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남평읍":
			crolling.area += ",L0600130";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%B2%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("남평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노안면":
			crolling.area += ",L0600140";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%EB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("노안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다도면":
			crolling.area += ",L0600150";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%D9%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("다도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다시면":
			crolling.area += ",L0600160";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%D9%BD%C3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("다시면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대기동":
			crolling.area += ",L0600170";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%EB%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대호동":
			crolling.area += ",L0600180";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고흥군동강면":
			crolling.area += ",L0600190";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B5%BF%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고흥군동강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동수동":
			crolling.area += ",L0600200";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B5%BF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문평면":
			crolling.area += ",L0600210";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B9%AE%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반남면":
			crolling.area += ",L0600220";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B9%DD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("반남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보산동":
			crolling.area += ",L0600230";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉황면":
			crolling.area += ",L0600240";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%C0%C8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉황면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부덕동":
			crolling.area += ",L0600250";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%CE%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "빛가람동":
			crolling.area += ",L0600260";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%FB%B0%A1%B6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("빛가람동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정동":
			crolling.area += ",L0600270";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산포면":
			crolling.area += ",L0600280";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EA%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼도동":
			crolling.area += ",L0600290";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EF%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼영동":
			crolling.area += ",L0600300";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EF%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서내동":
			crolling.area += ",L0600310";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%AD%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석현동":
			crolling.area += ",L0600320";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			crolling.area += ",L0600330";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세지면":
			crolling.area += ",L0600340";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%BC%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("세지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동":
			crolling.area += ",L0600350";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%DB%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송촌동":
			crolling.area += ",L0600360";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안창동":
			crolling.area += ",L0600370";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BE%C8%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영강동":
			crolling.area += ",L0600380";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("영강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영산동":
			crolling.area += ",L06009010";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%B5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오량동":
			crolling.area += ",L0600400";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%C0%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("난향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕곡면":
			crolling.area += ",L0600410";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%D5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("왕곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",L0600420";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운곡동":
			crolling.area += ",L0600430";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%EE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이창동":
			crolling.area += ",L0600440";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C0%CC%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",L0600450";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",L0600460";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진포동":
			crolling.area += ",L0600470";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C1%F8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청동":
			crolling.area += ",L0600480";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토계동":
			crolling.area += ",L0600490";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C5%E4%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평산동":
			crolling.area += ",L0600500";
			wewe.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C6%F2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고서면":
			crolling.area += ",L0700010";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B0%ED%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",L0700020";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",L0700030";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "담양읍":
			crolling.area += ",L0700040";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B4%E3%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("담양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕면":
			crolling.area += ",L0700050";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전면":
			crolling.area += ",L0700060";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B4%EB%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무정면":
			crolling.area += ",L0700070";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B9%AB%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("무정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산면":
			crolling.area += ",L0700080";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수북면":
			crolling.area += ",L0700090";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BC%F6%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용면":
			crolling.area += ",L0700100";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BF%EB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월산면":
			crolling.area += ",L0700110";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BF%F9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("월산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창평면":
			crolling.area += ",L0700120";
			wewe.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%C3%A2%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("창평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경동1가":
			crolling.area += ",L0800020";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B0%E6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("경동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경동2가":
			crolling.area += ",L0800030";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B0%E6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("경동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광동1가":
			crolling.area += ",L0800060";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%A4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광동2가":
			crolling.area += ",L0800070";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%A4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광동3가":
			crolling.area += ",L0800080";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%A4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("광동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동1가":
			crolling.area += ",L0800100";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%DD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("금동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동2가":
			crolling.area += ",L0800110";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%DD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("금동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금화동":
			crolling.area += ",L0800120";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%DD%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남교동":
			crolling.area += ",L0800130";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B3%B2%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달동":
			crolling.area += ",L0800140";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",L0800150";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대안동":
			crolling.area += ",L0800160";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대양동":
			crolling.area += ",L0800170";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동1가":
			crolling.area += ",L0800180";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%C0%C7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대의동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동2가":
			crolling.area += ",L0800190";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%C0%C7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대의동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동3가":
			crolling.area += ",L0800200";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%C0%C7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("대의동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동명동":
			crolling.area += ",L0800210";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B5%BF%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만호동":
			crolling.area += ",L0800220";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B8%B8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",L0800230";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무안동":
			crolling.area += ",L0800240";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B9%AB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동1가":
			crolling.area += ",L0800250";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B8%B1%A4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동2가":
			crolling.area += ",L0800260";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B8%B1%A4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동3가":
			crolling.area += ",L0800270";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B8%B1%A4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("보광동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복만동":
			crolling.area += ",L0800280";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B9%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부주동":
			crolling.area += ",L0800290";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("부주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부흥동":
			crolling.area += ",L0800300";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북교동":
			crolling.area += ",L0800310";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%CF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북항동":
			crolling.area += ",L0800320";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%CF%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정1동":
			crolling.area += ",L0800330";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("산정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정2동":
			crolling.area += ",L0800340";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("산정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목포시산정동":
			crolling.area += ",L0800350";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목포시산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정3동":
			crolling.area += ",L0800360";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("산정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼학동":
			crolling.area += ",L0800370";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%EF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",L0800380";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상락동1가":
			crolling.area += ",L0800390";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%F3%B6%F4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("상락동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상락동2가":
			crolling.area += ",L0800400";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%F3%B6%F4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("상락동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서산동":
			crolling.area += ",L0800410";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목포시석현동":
			crolling.area += ",L0800420";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목포시석현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수강동1가":
			crolling.area += ",L0800430";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%F6%B0%AD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("수강동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수강동2가":
			crolling.area += ",L0800440";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%F6%B0%AD%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("수강동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",L0800450";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양동":
			crolling.area += ",L0800460";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산동":
			crolling.area += ",L0800470";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%AC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영해동1가":
			crolling.area += ",L0800480";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%B5%C7%D8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("영해동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥암동":
			crolling.area += ",L0800490";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%C1%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온금동":
			crolling.area += ",L0800500";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%C2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당1동":
			crolling.area += ",L0800510";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당2동":
			crolling.area += ",L0800520";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당동":
			crolling.area += ",L0800530";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용해동":
			crolling.area += ",L0800540";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%C7%D8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용해동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원산동":
			crolling.area += ",L0800550";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%F8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유달동":
			crolling.area += ",L0800560";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C0%AF%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유동":
			crolling.area += ",L0800570";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율도동":
			crolling.area += ",L0800580";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C0%B2%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽교동":
			crolling.area += ",L0800590";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%D7%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽동":
			crolling.area += ",L0800600";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동1가":
			crolling.area += ",L0800610";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동2가":
			crolling.area += ",L0800620";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			crolling.area += ",L0800630";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			crolling.area += ",L0800640";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			crolling.area += ",L0800650";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창평동":
			crolling.area += ",L0800660";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%A2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축복동1가":
			crolling.area += ",L0800670";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%E0%BA%B9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("축복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축복동2가":
			crolling.area += ",L0800680";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%E0%BA%B9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("축복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축복동3가":
			crolling.area += ",L0800690";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%E0%BA%B9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("축복동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "측후동":
			crolling.area += ",L0800700";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%F8%C8%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("측후동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하당동":
			crolling.area += ",L0800710";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%CF%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동":
			crolling.area += ",L0800720";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D7%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동1가":
			crolling.area += ",L0800730";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동2가":
			crolling.area += ",L0800740";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동3가":
			crolling.area += ",L0800750";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동4가":
			crolling.area += ",L0800760";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("해안동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행복동1가":
			crolling.area += ",L0800770";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%E0%BA%B9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("행복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행복동2가":
			crolling.area += ",L0800780";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%E0%BA%B9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("행복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호남동":
			crolling.area += ",L0800790";
			wewe.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C8%A3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망운면":
			crolling.area += ",L0900010";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%B8%C1%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("망운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "몽탄면":
			crolling.area += ",L0900020";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%B8%F9%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("몽탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무안읍":
			crolling.area += ",L0900030";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%B9%AB%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("무안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼향읍":
			crolling.area += ",L0900040";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%BB%EF%C7%E2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("삼향읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운남면":
			crolling.area += ",L090050";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%BF%EE%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("운남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일로읍":
			crolling.area += ",L0900060";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C0%CF%B7%CE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("일로읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청계면":
			crolling.area += ",L0900070";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C3%BB%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해제면":
			crolling.area += ",L0900080";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C7%D8%C1%A6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해제면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현경면":
			crolling.area += ",L0900090";
			wewe.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C7%F6%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현경면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "겸백면":
			crolling.area += ",L1000010";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B0%E2%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("겸백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노동면":
			crolling.area += ",L1000020";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B3%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("노동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "득량면":
			crolling.area += ",L1000030";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B5%E6%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("득량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문덕면":
			crolling.area += ",L1000040";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B9%AE%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미력면":
			crolling.area += ",L1000050";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B9%CC%B7%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미력면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벌교읍":
			crolling.area += ",L1000060";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B9%FA%B1%B3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("벌교읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보성읍":
			crolling.area += ",L1000070";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%BA%B8%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("보성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복내면":
			crolling.area += ",L1000080";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%BA%B9%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("복내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅치면":
			crolling.area += ",L1000090";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%BF%F5%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("웅치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율어면":
			crolling.area += ",L1000100";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%C0%B2%BE%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("율어면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조성면":
			crolling.area += ",L1000110";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%C1%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("조성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회천면":
			crolling.area += ",L1000120";
			wewe.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%C8%B8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("회천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가곡동":
			crolling.area += ",L1100010";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B0%A1%B0%EE%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("가곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교량동":
			crolling.area += ",L1100020";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B1%B3%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",L1100030";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙안면":
			crolling.area += ",L1100040";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B3%AB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("낙안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시남내동":
			crolling.area += ",L1100050";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B3%B2%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순천시남내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남정동":
			crolling.area += ",L1100060";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B3%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대대동":
			crolling.area += ",L1100070";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%EB%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대룡동":
			crolling.area += ",L1100080";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%EB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕암동":
			crolling.area += ",L1100090";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕월동":
			crolling.area += ",L1100100";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%F6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동외동":
			crolling.area += ",L1100110";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B5%BF%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매곡동":
			crolling.area += ",L1100120";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B8%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별량면":
			crolling.area += ",L1100130";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BA%B0%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("별량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼거동":
			crolling.area += ",L1100140";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BB%EF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상사면":
			crolling.area += ",L1100150";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BB%F3%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생목동":
			crolling.area += ",L1100160";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BB%FD%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("생목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			crolling.area += ",L1100170";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시석현동":
			crolling.area += ",L1100180";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BC%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순천시석현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송광면":
			crolling.area += ",L1100190";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BC%DB%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("송광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "승주읍":
			crolling.area += ",L1100200";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BD%C2%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("승주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안풍동":
			crolling.area += ",L1100210";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BE%C8%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야흥동":
			crolling.area += ",L1100220";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BE%DF%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("야흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연향동":
			crolling.area += ",L1100230";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%AC%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",L1100240";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오천동":
			crolling.area += ",L1100250";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%C0%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			crolling.area += ",L1100260";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡동":
			crolling.area += ",L1100270";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("와룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕지동":
			crolling.area += ",L1100280";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%D5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("왕지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외서면":
			crolling.area += ",L1100290";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%DC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("외서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시용당동":
			crolling.area += ",L1100300";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순천시용당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월등면":
			crolling.area += ",L1100310";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%F9%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("월등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인월동":
			crolling.area += ",L1100320";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%CE%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제동":
			crolling.area += ",L1100330";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%CE%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장천동":
			crolling.area += ",L1100340";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%E5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저전동":
			crolling.area += ",L1100350";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%FA%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("저전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조곡동":
			crolling.area += ",L1100360";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조례동":
			crolling.area += ",L1100370";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%B6%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주암면":
			crolling.area += ",L1100380";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%D6%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시중앙동":
			crolling.area += ",L1100390";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("순천시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕동":
			crolling.area += ",L1100400";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C7%B3%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해룡면":
			crolling.area += ",L1100410";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C7%D8%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행동":
			crolling.area += ",L1100420";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍내동":
			crolling.area += ",L1100430";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C8%AB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황전면":
			crolling.area += ",L1100440";
			wewe.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C8%B2%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("황전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도초면":
			crolling.area += ",L1200010";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%B5%B5%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비금면":
			crolling.area += ",L1200020";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BA%F1%B1%DD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("비금면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신의면":
			crolling.area += ",L1200030";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BD%C5%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안좌면":
			crolling.area += ",L1200040";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BE%C8%C1%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안좌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암태면":
			crolling.area += ",L1200050";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BE%CF%C5%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("암태면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "압해면":
			crolling.area += ",L1200060";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BE%D0%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("압해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임자면":
			crolling.area += ",L1200070";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C0%D3%C0%DA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("임자면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자은면":
			crolling.area += ",L1200080";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C0%DA%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("자은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장산면":
			crolling.area += ",L1200090";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C0%E5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증도면":
			crolling.area += ",L1200100";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C1%F5%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("증도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지도읍":
			crolling.area += ",L1200110";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C1%F6%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("지도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔금면":
			crolling.area += ",L1200120";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C6%C8%B1%DD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("팔금면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하의면":
			crolling.area += ",L1200130";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C7%CF%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑산면":
			crolling.area += ",L1200140";
			wewe.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C8%E6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("흑산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경호동":
			crolling.area += ",L1300010";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%E6%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고소동":
			crolling.area += ",L1300010";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%ED%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공화동":
			crolling.area += ",L1300020";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%F8%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관문동":
			crolling.area += ",L1300030";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%FC%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광무동":
			crolling.area += ",L1300040";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%A4%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시교동":
			crolling.area += ",L1300050";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여수시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "국동":
			crolling.area += ",L1300060";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("국동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			crolling.area += ",L1300070";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%BA%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙포동":
			crolling.area += ",L1300080";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B3%AB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시남면":
			crolling.area += ",L1300090";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("여수시남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			crolling.area += ",L1300100";
			wewe.area += "C061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕충동":
			crolling.area += ",L1300110";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B4%F6%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돌산읍":
			crolling.area += ",L1300120";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B5%B9%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("돌산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			crolling.area += ",L1300130";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔덕동":
			crolling.area += ",L1300140";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B5%D0%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("둔덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만흥동":
			crolling.area += ",L1300150";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B8%B8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘도동":
			crolling.area += ",L1300160";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B9%A6%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묘도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문수동":
			crolling.area += ",L1300170";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B9%AE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미평동":
			crolling.area += ",L1300180";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B9%CC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉강동":
			crolling.area += ",L1300190";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BA%C0%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉계동":
			crolling.area += ",L1300200";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BA%C0%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			crolling.area += ",L1300210";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산면":
			crolling.area += ",L1300220";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상암동":
			crolling.area += ",L1300230";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BB%F3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서교동":
			crolling.area += ",L1300240";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%AD%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선원동":
			crolling.area += ",L1300250";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%B1%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소라면":
			crolling.area += ",L1300260";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%D2%B6%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소라면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소호동":
			crolling.area += ",L1300270";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%D2%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정동":
			crolling.area += ",L1300280";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시전동":
			crolling.area += ",L1300290";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C3%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			crolling.area += ",L1300300";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신덕동":
			crolling.area += ",L1300310";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",L1300320";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산동":
			crolling.area += ",L1300330";
			wewe.area += "61%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BE%C8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여서동":
			crolling.area += ",L1300340";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%A9%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여천동":
			crolling.area += ",L1300350";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%A9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연등동":
			crolling.area += ",L1300360";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%AC%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오림동":
			crolling.area += ",L1300370";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%C0%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시오천동":
			crolling.area += ",L1300380";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%C0%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여수시오천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅천동":
			crolling.area += ",L1300390";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%F5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("웅천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월내동":
			crolling.area += ",L1300400";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%F9%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월하동":
			crolling.area += ",L1300410";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%F9%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율촌면":
			crolling.area += ",L1300420";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C0%B2%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("율촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적량동":
			crolling.area += ",L1300430";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C0%FB%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("적량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종화동":
			crolling.area += ",L1300440";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%BE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("종화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주삼동":
			crolling.area += ",L1300450";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%D6%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시중앙동":
			crolling.area += ",L1300460";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중흥동":
			crolling.area += ",L1300470";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%DF%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동":
			crolling.area += ",L1300480";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평려동":
			crolling.area += ",L1300490";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C6%F2%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평려동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학동":
			crolling.area += ",L1300500";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학용동":
			crolling.area += ",L1300510";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C7%D0%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해산동":
			crolling.area += ",L1300520";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C7%D8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호명동":
			crolling.area += ",L1300530";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%A3%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화양면":
			crolling.area += ",L1300540";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화장동":
			crolling.area += ",L1300550";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정면":
			crolling.area += ",L1300560";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화치동":
			crolling.area += ",L1300570";
			wewe.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군남면":
			crolling.area += ",L1400010";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B1%BA%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군서면":
			crolling.area += ",L1400020";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙월면":
			crolling.area += ",L1400030";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B3%AB%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("낙월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대마면":
			crolling.area += ",L1400040";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B4%EB%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘량면":
			crolling.area += ",L1400050";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B9%A6%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("묘량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백수읍":
			crolling.area += ",L1400060";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B9%E9%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("백수읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법성면":
			crolling.area += ",L1400070";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B9%FD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("법성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불갑면":
			crolling.area += ",L1400080";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%BA%D2%B0%A9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("불갑면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염산면":
			crolling.area += ",L1400090";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%BF%B0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("염산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영광읍":
			crolling.area += ",L1400100";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%BF%B5%B1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("영광읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍농읍":
			crolling.area += ",L1400110";
			wewe.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%C8%AB%B3%F3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("홍농읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영암군군서면":
			crolling.area += ",L1500010";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영암군군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금정면":
			crolling.area += ",L1500020";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B1%DD%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진면":
			crolling.area += ",L1500030";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B4%F6%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도포면":
			crolling.area += ",L1500040";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B5%B5%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미암면":
			crolling.area += ",L1500050";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B9%CC%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼호읍":
			crolling.area += ",L1500060";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BB%EF%C8%A3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("삼호읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호면":
			crolling.area += ",L1500070";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BC%AD%C8%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서호면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시종면":
			crolling.area += ",L1500080";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BD%C3%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("시종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신북면":
			crolling.area += ",L1500090";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BD%C5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영암읍":
			crolling.area += ",L1500100";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BF%B5%BE%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("영암읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학산면":
			crolling.area += ",L1500110";
			wewe.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%C7%D0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("학산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고금면":
			crolling.area += ",L1600010";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B0%ED%B1%DD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고금면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군외면":
			crolling.area += ",L1600020";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B1%BA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금당면":
			crolling.area += ",L1600030";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B1%DD%B4%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금당면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금일읍":
			crolling.area += ",L1600040";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B1%DD%C0%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("금일읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노화읍":
			crolling.area += ",L1600050";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B3%EB%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("노화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보길면":
			crolling.area += ",L1600060";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BA%B8%B1%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("보길면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생일면":
			crolling.area += ",L1600070";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BB%FD%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("생일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소안면":
			crolling.area += ",L1600080";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BC%D2%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신지면":
			crolling.area += ",L1600090";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BD%C5%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약산면":
			crolling.area += ",L1600100";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BE%E0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("약산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완도읍":
			crolling.area += ",L1600110";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BF%CF%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("완도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청산면":
			crolling.area += ",L1600120";
			wewe.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성군남면":
			crolling.area += ",L1700010";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장선군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동화면":
			crolling.area += ",L1700020";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%B5%BF%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북이면":
			crolling.area += ",L1700030";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BA%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북일면":
			crolling.area += ",L1700040";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BA%CF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북하면":
			crolling.area += ",L1700050";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BA%CF%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼계면":
			crolling.area += ",L1700060";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BB%EF%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼서면":
			crolling.area += ",L1700070";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BB%EF%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서삼면":
			crolling.area += ",L1700080";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BC%AD%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서삼면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성읍":
			crolling.area += ",L1700090";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%C0%E5%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("장성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진원면":
			crolling.area += ",L1700100";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%C1%F8%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황룡면":
			crolling.area += ",L1700110";
			wewe.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%C8%B2%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("황룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관산읍":
			crolling.area += ",L1800010";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%B0%FC%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("관산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕읍":
			crolling.area += ",L1800020";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%B4%EB%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("대덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부산면":
			crolling.area += ",L1800030";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%BA%CE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양면":
			crolling.area += ",L1800040";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%BE%C8%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산면":
			crolling.area += ",L1800050";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%BF%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유치면":
			crolling.area += ",L1800060";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%AF%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("유치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동면":
			crolling.area += ",L1800070";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%E5%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장평면":
			crolling.area += ",L1800080";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%E5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장흥읍":
			crolling.area += ",L1800090";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%E5%C8%EF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("장흥읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회진면":
			crolling.area += ",L1800100";
			wewe.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C8%B8%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("회진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고군면":
			crolling.area += ",L1900010";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%B0%ED%B1%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고군면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군내면":
			crolling.area += ",L1900020";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의신면":
			crolling.area += ",L1900030";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C0%C7%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("의신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임회면":
			crolling.area += ",L1900040";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C0%D3%C8%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("임회면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조도면":
			crolling.area += ",L1900050";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C1%B6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("조도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산면":
			crolling.area += ",L1900060";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C1%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진도읍":
			crolling.area += ",L1900070";
			wewe.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C1%F8%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나산면":
			crolling.area += ",L2000010";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%B3%AA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("나산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대동면":
			crolling.area += ",L2000020";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%B4%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "손불면":
			crolling.area += ",L2000030";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BC%D5%BA%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("손불면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신광면":
			crolling.area += ",L2000040";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BD%C5%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄다면":
			crolling.area += ",L2000050";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BE%F6%B4%D9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("엄다면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월야면":
			crolling.area += ",L2000060";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BF%F9%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("월야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학교면":
			crolling.area += ",L2000070";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%C7%D0%B1%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("학교면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함평읍":
			crolling.area += ",L2000080";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%C7%D4%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("함평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해보면":
			crolling.area += ",L2000090";
			wewe.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%C7%D8%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계곡면":
			crolling.area += ",L2100010";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%B0%E8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("계곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남군마산면":
			crolling.area += ",L2100020";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%B8%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해남군마산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문내면":
			crolling.area += ",L2100030";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%B9%AE%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남군북일면":
			crolling.area += ",L2100040";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BA%CF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해남군북일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북평면":
			crolling.area += ",L2100050";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BA%CF%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산이면":
			crolling.area += ",L2100060";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BB%EA%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남군삼산면":
			crolling.area += ",L2100070";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해남군삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송지면":
			crolling.area += ",L2100080";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BC%DB%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("송지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천면":
			crolling.area += ",L2100090";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BF%C1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남읍":
			crolling.area += ",L2100100";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C7%D8%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("해남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산면":
			crolling.area += ",L2100110";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C7%F6%BB%EA%B8%E9%";
			Mainpage.Filtering[Mainpage.index].setText("화산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화원면":
			crolling.area += ",L2100120";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C8%AD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황산면":
			crolling.area += ",L2100130";
			wewe.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C8%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("황산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화순군남면":
			crolling.area += ",L2200010";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화순군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능주면":
			crolling.area += ",L2200020";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B4%C9%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("능주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡면":
			crolling.area += ",L2200030";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%B5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화순군도암면":
			crolling.area += ",L2200040";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%B5%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화순군도암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동면":
			crolling.area += ",L2200050";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동복면":
			crolling.area += ",L2200060";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%BF%BA%B9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동복면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",L2200070";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이서면":
			crolling.area += ",L2200080";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C0%CC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이양면":
			crolling.area += ",L2200090";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C0%CC%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청풍면":
			crolling.area += ",L2200100";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C3%BB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘양면":
			crolling.area += ",L2200110";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C3%E1%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("춘양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한천면":
			crolling.area += ",L2200120";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C7%D1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화순읍":
			crolling.area += ",L2200130";
			wewe.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C8%AD%BC%F8%C0%BE&";
			Mainpage.Filtering[Mainpage.index].setText("화순읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
