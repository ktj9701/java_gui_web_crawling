package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Gyeongnam {
	public boolean flag;

	public void GyeongnamCity(ActionEvent e) {
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
		// 거제시
		case "거제면":
			crolling.area += ",C0100010";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B0%C5%C1%A6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("거제면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고현동":
			crolling.area += ",C0100015";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B0%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부면":
			crolling.area += ",C0100020";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B3%B2%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능포동":
			crolling.area += ",C0100030";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B4%C9%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("능포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕포동":
			crolling.area += ",C0100040";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B4%F6%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동부면":
			crolling.area += ",C0100050";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B5%BF%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두모동":
			crolling.area += ",C0100060";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B5%CE%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔덕면":
			crolling.area += ",C0100070";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B5%D0%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("둔덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마전동":
			crolling.area += ",C0100080";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문동동":
			crolling.area += ",C0100085";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B9%AE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사등면":
			crolling.area += ",C0100090";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BB%E7%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼거동":
			crolling.area += ",C0100092";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BB%EF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동동":
			crolling.area += ",C0100093";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BB%F3%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수월동":
			crolling.area += ",C0100095";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BC%F6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아양동":
			crolling.area += ",C0100110";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BE%C6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아주동":
			crolling.area += ",C0100120";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BE%C6%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정동":
			crolling.area += ",C0100125";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BE%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연초면":
			crolling.area += ",C0100130";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%AC%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("연초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥포동":
			crolling.area += ",C0100160";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%C1%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥포1동":
			crolling.area += ",C0100140";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%C1%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥포2동":
			crolling.area += ",C0100150";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%C1%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일운면":
			crolling.area += ",C0100170";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%CF%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("일운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장목면":
			crolling.area += ",C0100180";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%E5%B8%F1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장목면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장승포동":
			crolling.area += ",C0100190";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%E5%BD%C2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장승포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장평동":
			crolling.area += ",C0100195";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%E5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하청면":
			crolling.area += ",C0100200";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C7%CF%C3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하청면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 거창군
		case "가북면":
			crolling.area += ",C0200010";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%A1%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가조면":
			crolling.area += ",C0200020";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%A1%C1%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가조면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거창읍":
			crolling.area += ",C0200040";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%C5%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("거창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고제면":
			crolling.area += ",C0200040";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%ED%C1%A6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고제면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남상면":
			crolling.area += ",C0200050";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B3%B2%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남하면":
			crolling.area += ",C0200060";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B3%B2%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마리면":
			crolling.area += ",C0200070";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B8%B6%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북상면":
			crolling.area += ",C0200080";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%BA%CF%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신원면":
			crolling.area += ",C0200090";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%BD%C5%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅양면":
			crolling.area += ",C0200100";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%BF%F5%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("웅양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위천면":
			crolling.area += ",C0200110";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%C0%A7%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("위천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주상면":
			crolling.area += ",C0200120";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%C1%D6%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 고성군
		case "개천면":
			crolling.area += ",C0300010";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("개천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거류면":
			crolling.area += ",C0300020";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%C5%B7%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("거류면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고성읍":
			crolling.area += ",C0300030";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%ED%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("고성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구만면":
			crolling.area += ",C0300040";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B1%B8%B8%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구만면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대가면":
			crolling.area += ",C0300050";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B4%EB%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동해면":
			crolling.area += ",C0300060";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B5%BF%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마암면":
			crolling.area += ",C0300070";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B8%B6%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산면":
			crolling.area += ",C0300080";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상리면":
			crolling.area += ",C0300090";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BB%F3%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영오면":
			crolling.area += ",C0300100";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BF%B5%BF%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영오면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영현면":
			crolling.area += ",C0300110";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BF%B5%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하이면":
			crolling.area += ",C0300120";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하일면":
			crolling.area += ",C0300130";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%CF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회화면":
			crolling.area += ",C0300140";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C8%B8%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("회화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 김해시
		case "강동":
			crolling.area += ",C0400010";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관동동":
			crolling.area += ",C0400410";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B0%FC%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			crolling.area += ",C0400020";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕동":
			crolling.area += ",C0400320";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",C0400030";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내외동":
			crolling.area += ",C0400470";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("내외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대동면":
			crolling.area += ",C0400040";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B4%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",C0400050";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대청동":
			crolling.area += ",C0400390";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B4%EB%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동상동":
			crolling.area += ",C0400060";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B5%BF%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명법동":
			crolling.area += ",C0400070";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B8%ED%B9%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명법동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무계동":
			crolling.area += ",C0400330";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B9%AB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉황동":
			crolling.area += ",C0400080";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%C0%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",C0400340";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부원동":
			crolling.area += ",C0400090";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%CE%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북부동":
			crolling.area += ",C0400480";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("북부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불암동":
			crolling.area += ",C0400100";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%D2%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼계동":
			crolling.area += ",C0400110";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼문동":
			crolling.area += ",C0400380";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼방동":
			crolling.area += ",C0400120";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼안동":
			crolling.area += ",C0400510";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("삼안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정동":
			crolling.area += ",C0400130";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동면":
			crolling.area += ",C0400140";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%F3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생림면":
			crolling.area += ",C0400150";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%FD%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("생림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서상동":
			crolling.area += ",C0400160";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BC%AD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수가동":
			crolling.area += ",C0400420";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BC%F6%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문동":
			crolling.area += ",C0400350";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BD%C5%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안동":
			crolling.area += ",C0400170";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어방동":
			crolling.area += ",C0400180";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BE%EE%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외동":
			crolling.area += ",C0400190";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유하동":
			crolling.area += ",C0400360";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%AF%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율하동":
			crolling.area += ",C0400430";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%B2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응달동":
			crolling.area += ",C0400440";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%C0%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",C0400200";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장유1동":
			crolling.area += ",C0400310";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("장유1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장유2동":
			crolling.area += ",C0400370";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("장유2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장유3동":
			crolling.area += ",C0400400";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("장유3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장유동":
			crolling.area += ",C0400450";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%E5%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전하동":
			crolling.area += ",C0400220";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%FC%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("전하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주촌면":
			crolling.area += ",C0400230";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%D6%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지내동":
			crolling.area += ",C0400240";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%F6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진례면":
			crolling.area += ",C0400250";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%F8%B7%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진례면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진영읍":
			crolling.area += ",C0400260";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%F8%BF%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진영읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠산서부동":
			crolling.area += ",C0400490";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("칠산서부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍유동":
			crolling.area += ",C0400270";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C7%B3%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한림면":
			crolling.area += ",C0400280";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C7%D1%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화목동":
			crolling.area += ",C0400290";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C8%AD%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "활천동":
			crolling.area += ",C0400500";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("활천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동":
			crolling.area += ",C0400460";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("회현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥동":
			crolling.area += ",C0400300";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 남해군
		case "고현면":
			crolling.area += ",C0500010";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B0%ED%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",C0500020";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남해읍":
			crolling.area += ",C0500030";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B3%B2%C7%D8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("남해읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미조면":
			crolling.area += ",C0500040";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B9%CC%C1%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미조면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동면":
			crolling.area += ",C0500050";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BB%EF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상주면":
			crolling.area += ",C0500060";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BB%F3%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			crolling.area += ",C0500070";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설천면":
			crolling.area += ",C0500080";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BC%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("설천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동면":
			crolling.area += ",C0500090";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%C0%CC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창선면":
			crolling.area += ",C0500100";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%C3%A2%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("창선면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 밀양시
		case "가곡동":
			crolling.area += ",C0800010";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B0%A1%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",C0800020";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포동":
			crolling.area += ",C0800030";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B3%B2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내이동":
			crolling.area += ",C0800040";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B3%BB%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내일동":
			crolling.area += ",C0800050";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B3%BB%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단장면":
			crolling.area += ",C0800060";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B4%DC%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("단장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무안면":
			crolling.area += ",C0800070";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B9%AB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("무안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부북면":
			crolling.area += ",C0800080";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BA%CE%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산내면":
			crolling.area += ",C0800090";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산외면":
			crolling.area += ",C0800100";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼랑진읍":
			crolling.area += ",C0800110";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EF%B6%FB%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("삼랑진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "밀양시삼문동":
			crolling.area += ",C0800120";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("밀양시삼문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상남면":
			crolling.area += ",C0800130";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%F3%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "밀양시상동면":
			crolling.area += ",C0800140";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%F3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("밀양시상동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용평동":
			crolling.area += ",C0800150";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BF%EB%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청도면":
			crolling.area += ",C0800160";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C3%BB%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초동면":
			crolling.area += ",C0800170";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C3%CA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("초동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남읍":
			crolling.area += ",C0800180";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C7%CF%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("하남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "활성동":
			crolling.area += ",C0800190";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C8%B0%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("활성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 사천시
		case "공명면":
			crolling.area += ",C0900010";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B0%EF%B8%ED%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("곤명면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곤양면":
			crolling.area += ",C0900020";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B0%EF%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("곤양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁지동":
			crolling.area += ",C0900030";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B1%C3%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("궁지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노룡동":
			crolling.area += ",C0900040";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B3%EB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "늑도동":
			crolling.area += ",C0900050";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B4%C1%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("늑도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대방동":
			crolling.area += ",C0900060";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			crolling.area += ",C0900070";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동금동":
			crolling.area += ",C0900080";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B5%BF%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동동":
			crolling.area += ",C0900090";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동림동":
			crolling.area += ",C0900100";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B5%BF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마도동":
			crolling.area += ",C0900110";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B8%B6%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백천동":
			crolling.area += ",C0900120";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B9%E9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벌리동":
			crolling.area += ",C0900130";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B9%FA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("벌리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉남동":
			crolling.area += ",C0900140";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BA%C0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사남면":
			crolling.area += ",C0900150";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BB%E7%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사등동":
			crolling.area += ",C0900160";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BB%E7%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사천읍":
			crolling.area += ",C0900170";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BB%E7%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("사천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서금동":
			crolling.area += ",C0900180";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%AD%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서동":
			crolling.area += ",C0900190";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서포면":
			crolling.area += ",C0900200";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%AD%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선구동":
			crolling.area += ",C0900210";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%B1%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송포동":
			crolling.area += ",C0900220";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%DB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신벽동":
			crolling.area += ",C0900230";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BD%C5%BA%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신벽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신수동":
			crolling.area += ",C0900240";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BD%C5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "실안동":
			crolling.area += ",C0900250";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BD%C7%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("실안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡동":
			crolling.area += ",C0900260";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("와룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			crolling.area += ",C0900270";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현면":
			crolling.area += ",C0900280";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BF%EB%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이금동":
			crolling.area += ",C0900290";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C0%CC%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이홀동":
			crolling.area += ",C0900300";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C0%CC%C8%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이홀동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정동면":
			crolling.area += ",C0900310";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C1%A4%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌룡동":
			crolling.area += ",C0900320";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C1%C2%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("좌룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",C0900330";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축동면":
			crolling.area += ",C0900340";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C3%E0%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("축동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향촌동":
			crolling.area += ",C0900350";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C7%E2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("향촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 산청군
		case "금서면":
			crolling.area += ",C1000010";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%B1%DD%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단성면":
			crolling.area += ",C1000020";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%B4%DC%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("단성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산청읍":
			crolling.area += ",C1000030";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%EA%C3%BB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("산청읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼장면":
			crolling.area += ",C1000040";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%EF%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생비량면":
			crolling.area += ",C1000050";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%FD%BA%F1%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("생비량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생초면":
			crolling.area += ",C1000060";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%FD%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("생초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시천면":
			crolling.area += ",C1000070";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BD%C3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("시천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신등면":
			crolling.area += ",C1000080";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BD%C5%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신안면":
			crolling.area += ",C1000090";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BD%C5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오부면":
			crolling.area += ",C1000100";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BF%C0%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("오부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "차황면":
			crolling.area += ",C1000110";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%C2%F7%C8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("차황면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 양산시
		case "양산시교동":
			crolling.area += ",C1100010";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양산시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부동":
			crolling.area += ",C1100020";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B3%B2%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다방동":
			crolling.area += ",C1100030";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B4%D9%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕계동":
			crolling.area += ",C1100035";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B4%F6%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동면":
			crolling.area += ",C1100040";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매곡동":
			crolling.area += ",C1100066";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B8%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명곡동":
			crolling.area += ",C1100050";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B8%ED%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동":
			crolling.area += ",C1100055";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "물금읍":
			crolling.area += ",C1100060";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B9%B0%B1%DD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("물금읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양산시북부동":
			crolling.area += ",C1100070";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BA%CF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양산시북부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북정동":
			crolling.area += ",C1100080";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BA%CF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산막동":
			crolling.area += ",C1100090";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BB%EA%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산막동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼호동":
			crolling.area += ",C1100095";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BB%EF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상북면":
			crolling.area += ",C1100100";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BB%F3%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소주동":
			crolling.area += ",C1100105";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BC%D2%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			crolling.area += ",C1100110";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어곡동":
			crolling.area += ",C1100120";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BE%EE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당동":
			crolling.area += ",C1100125";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅상읍":
			crolling.area += ",C1100130";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("웅상읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동면":
			crolling.area += ",C1100140";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BF%F8%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("원동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유산동":
			crolling.area += ",C1100150";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C0%AF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주남동":
			crolling.area += ",C1100154";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C1%D6%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주진동":
			crolling.area += ",C1100156";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C1%D6%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중부동":
			crolling.area += ",C1100160";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C1%DF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평산동":
			crolling.area += ",C1100165";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C6%F2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하북면":
			crolling.area += ",C1100170";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C7%CF%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계동":
			crolling.area += ",C1100180";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C8%A3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 의령군
		case "가례면":
			crolling.area += ",C1200010";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B0%A1%B7%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가례면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁류면":
			crolling.area += ",C1200020";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B1%C3%B7%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("궁류면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙서면":
			crolling.area += ",C1200030";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B3%AB%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("낙서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의면":
			crolling.area += ",C1200040";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B4%EB%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉수면":
			crolling.area += ",C1200050";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%BA%C0%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림면":
			crolling.area += ",C1200060";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%BA%CE%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용덕면":
			crolling.area += ",C1200070";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%BF%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유곡면":
			crolling.area += ",C1200080";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C0%AF%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("유곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의령읍":
			crolling.area += ",C1200090";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C0%C7%B7%C9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("의령읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정곡면":
			crolling.area += ",C1200100";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C1%A4%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지정면":
			crolling.area += ",C1200110";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C1%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠곡면":
			crolling.area += ",C1200120";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C4%A5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("칠곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정면":
			crolling.area += ",C1200130";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C8%AD%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 진주시
		case "가좌동":
			crolling.area += ",C1300010";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강남동":
			crolling.area += ",C1300020";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B0%AD%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계동":
			crolling.area += ",C1300030";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀곡동":
			crolling.area += ",C1300040";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B1%CD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귀곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡면":
			crolling.area += ",C1300050";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B1%DD%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산면":
			crolling.area += ",C1300060";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B1%DD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남성동":
			crolling.area += ",C1300070";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B3%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동면":
			crolling.area += ",C1300080";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B3%BB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곡면":
			crolling.area += ",C1300090";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B4%EB%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대안동":
			crolling.area += ",C1300100";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평면":
			crolling.area += ",C1300110";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B4%EB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동성동":
			crolling.area += ",C1300120";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B5%BF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망경동":
			crolling.area += ",C1300140";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B8%C1%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명석면":
			crolling.area += ",C1300160";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B8%ED%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("명석면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문산읍":
			crolling.area += ",C1300170";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B9%AE%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("문산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "미천면":
			crolling.area += ",C1300180";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B9%CC%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본성동":
			crolling.area += ",C1300190";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BA%BB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("본성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉곡동":
			crolling.area += ",C1300200";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동":
			crolling.area += ",C1300210";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BA%C0%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사봉면":
			crolling.area += ",C1300220";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%E7%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대1동":
			crolling.area += ",C1300230";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대2동":
			crolling.area += ",C1300240";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대동":
			crolling.area += ",C1300250";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉동":
			crolling.area += ",C1300260";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상평동":
			crolling.area += ",C1300290";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡면":
			crolling.area += ",C1300300";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BC%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정동":
			crolling.area += ",C1300310";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BC%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신안동":
			crolling.area += ",C1300320";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BD%C5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥봉동":
			crolling.area += ",C1300340";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BF%C1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유곡동":
			crolling.area += ",C1300360";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%AF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이반성면":
			crolling.area += ",C1300370";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CC%B9%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이반성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이현동":
			crolling.area += ",C1300380";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인사동":
			crolling.area += ",C1300390";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일반성면":
			crolling.area += ",C1300400";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CF%B9%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("일반성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장대동":
			crolling.area += ",C1300410";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%E5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장재동":
			crolling.area += ",C1300420";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%E5%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정촌면":
			crolling.area += ",C1300430";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%A4%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주약동":
			crolling.area += ",C1300440";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%D6%BE%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주약동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중안동":
			crolling.area += ",C1300450";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%DF%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",C1300590";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지수면":
			crolling.area += ",C1300460";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%F6%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진성면":
			crolling.area += ",C1300470";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%F8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "집현면":
			crolling.area += ",C1300480";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%FD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("집현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초전동":
			crolling.area += ",C1300490";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C3%CA%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무공동":
			crolling.area += ",C1300600";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C3%E6%B9%AB%B0%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충무공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠암동":
			crolling.area += ",C1300500";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C4%A5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("칠암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판문동":
			crolling.area += ",C1300510";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C6%C7%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("판문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평거동":
			crolling.area += ",C1300520";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C6%F2%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평안동":
			crolling.area += ",C1300530";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하대동":
			crolling.area += ",C1300560";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하대1동":
			crolling.area += ",C1300540";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하대1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하대2동":
			crolling.area += ",C1300550";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하대2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하촌동":
			crolling.area += ",C1300570";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호탄동":
			crolling.area += ",C1300580";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C8%A3%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 창녕군
		case "계성면":
			crolling.area += ",C1500010";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B0%E8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("계성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고암면":
			crolling.area += ",C1500020";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B0%ED%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길곡면":
			crolling.area += ",C1500030";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B1%E6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("길곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남지읍":
			crolling.area += ",C1500040";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B3%B2%C1%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("남지읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대지면":
			crolling.area += ",C1500050";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B4%EB%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대합면":
			crolling.area += ",C1500060";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B4%EB%C7%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대합면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도천면":
			crolling.area += ",C1500070";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B5%B5%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡면":
			crolling.area += ",C1500080";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%BA%CE%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산면":
			crolling.area += ",C1500090";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영산면":
			crolling.area += ",C1500100";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%BF%B5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유어면":
			crolling.area += ",C1500110";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C0%AF%BE%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("유어면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이방면":
			crolling.area += ",C1500120";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C0%CC%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이방면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장마면":
			crolling.area += ",C1500130";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C0%E5%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창녕읍":
			crolling.area += ",C1500140";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C3%A2%B3%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("창녕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
