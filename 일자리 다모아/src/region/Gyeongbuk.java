package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Gyeongbuk {
	public boolean flag;

	public void GyeongbukCity(ActionEvent e) {
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
		// 경북
		// 경산시
		case "갑제동":
			Albamoncrolling.area += ",D0100010";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B0%A9%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갑제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계양동":
			Albamoncrolling.area += ",D0100020";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B0%E8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남방동":
			Albamoncrolling.area += ",D0100030";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%B2%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산면":
			Albamoncrolling.area += ",D0100040";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천면":
			Albamoncrolling.area += ",D0100050";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%B2%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			Albamoncrolling.area += ",D0100060";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대동":
			Albamoncrolling.area += ",D0100070";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대정동":
			Albamoncrolling.area += ",D0100080";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B4%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대평동":
			Albamoncrolling.area += ",D0100090";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B4%EB%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백천동":
			Albamoncrolling.area += ",D0100100";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B9%E9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			Albamoncrolling.area += ",D0100110";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사정동":
			Albamoncrolling.area += ",D0100120";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼남동":
			Albamoncrolling.area += ",D0100130";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%EF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼북동":
			Albamoncrolling.area += ",D0100140";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%EF%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼풍동":
			Albamoncrolling.area += ",D0100150";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%EF%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상방동":
			Albamoncrolling.area += ",D0100160";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%F3%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서상동":
			Albamoncrolling.area += ",D0100170";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BC%AD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신교동":
			Albamoncrolling.area += ",D0100180";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BD%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			Albamoncrolling.area += ",D0100190";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "압량면":
			Albamoncrolling.area += ",D0100200";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BE%D0%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("압량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여천동":
			Albamoncrolling.area += ",D0100210";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%A9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("여천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥곡동":
			Albamoncrolling.area += ",D0100220";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%C1%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산동":
			Albamoncrolling.area += ",D0100230";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와촌면":
			Albamoncrolling.area += ",D0100240";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%CD%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("와촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용성면":
			Albamoncrolling.area += ",D0100250";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%EB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유곡동":
			Albamoncrolling.area += ",D0100260";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C0%AF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임당동":
			Albamoncrolling.area += ",D0100270";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C0%D3%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("임당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자인면":
			Albamoncrolling.area += ",D0100280";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C0%DA%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("자인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점촌동":
			Albamoncrolling.area += ",D0100290";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%A1%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("점촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정평동":
			Albamoncrolling.area += ",D0100300";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%A4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조영동":
			Albamoncrolling.area += ",D0100310";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%B6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중방동":
			Albamoncrolling.area += ",D0100320";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%DF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중산동":
			Albamoncrolling.area += ",D0100330";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진량읍":
			Albamoncrolling.area += ",D0100340";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%F8%B7%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진량읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평산동":
			Albamoncrolling.area += ",D0100350";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C6%F2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하양읍":
			Albamoncrolling.area += ",D0100360";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C7%CF%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("하양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 경주시
		case "감포읍":
			Albamoncrolling.area += ",D0200010";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B0%A8%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("감포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강동면":
			Albamoncrolling.area += ",D0200020";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B0%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건천읍":
			Albamoncrolling.area += ",D0200030";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B0%C7%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("건천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명동":
			Albamoncrolling.area += ",D0200040";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%A4%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			Albamoncrolling.area += ",D0200050";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구정동":
			Albamoncrolling.area += ",D0200060";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구황동":
			Albamoncrolling.area += ",D0200070";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%B8%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			Albamoncrolling.area += ",D0200080";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내남면":
			Albamoncrolling.area += ",D0200090";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%BB%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노동동":
			Albamoncrolling.area += ",D0200100";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%EB%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노서동":
			Albamoncrolling.area += ",D0200110";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%EB%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕동":
			Albamoncrolling.area += ",D0200120";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도지동":
			Albamoncrolling.area += ",D0200130";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%B5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동방동":
			Albamoncrolling.area += ",D0200140";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%BF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동부동":
			Albamoncrolling.area += ",D0200150";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%BF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동천동":
			Albamoncrolling.area += ",D0200160";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마동":
			Albamoncrolling.area += ",D0200170";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배동":
			Albamoncrolling.area += ",D0200180";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배반동":
			Albamoncrolling.area += ",D0200190";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B9%E8%B9%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("배반동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동":
			Albamoncrolling.area += ",D0200200";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BA%B8%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북군동":
			Albamoncrolling.area += ",D0200210";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BA%CF%B1%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북군동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북부동":
			Albamoncrolling.area += ",D0200220";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BA%CF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경주시사정동":
			Albamoncrolling.area += ",D0200230";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("경주시사정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산내면":
			Albamoncrolling.area += ",D0200240";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			Albamoncrolling.area += ",D0200250";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서부동":
			Albamoncrolling.area += ",D0200260";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AD%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서악동":
			Albamoncrolling.area += ",D0200270";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AD%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서악동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석장동":
			Albamoncrolling.area += ",D0200280";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AE%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성건동":
			Albamoncrolling.area += ",D0200290";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%BA%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성동동":
			Albamoncrolling.area += ",D0200300";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%BA%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "손곡동":
			Albamoncrolling.area += ",D0200310";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%D5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("손곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시동":
			Albamoncrolling.area += ",D0200320";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BD%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시래동":
			Albamoncrolling.area += ",D0200330";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BD%C3%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			Albamoncrolling.area += ",D0200340";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안강읍":
			Albamoncrolling.area += ",D0200350";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%C8%B0%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("안강읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암곡동":
			Albamoncrolling.area += ",D0200360";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%CF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("암곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양남면":
			Albamoncrolling.area += ",D0200370";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%E7%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양북면":
			Albamoncrolling.area += ",D0200380";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%E7%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외동읍":
			Albamoncrolling.area += ",D0200390";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BF%DC%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("외동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			Albamoncrolling.area += ",D0200400";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율동":
			Albamoncrolling.area += ",D0200410";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인왕동":
			Albamoncrolling.area += ",D0200420";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C0%CE%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조양동":
			Albamoncrolling.area += ",D0200430";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진현동":
			Albamoncrolling.area += ",D0200440";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C1%F8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천군동":
			Albamoncrolling.area += ",D0200450";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C3%B5%B1%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천군동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천북면":
			Albamoncrolling.area += ",D0200460";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C3%B5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("천북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충효동":
			Albamoncrolling.area += ",D0200470";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C3%E6%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			Albamoncrolling.area += ",D0200480";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			Albamoncrolling.area += ",D0200490";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			Albamoncrolling.area += ",D0200500";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현곡면":
			Albamoncrolling.area += ",D0200510";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C7%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황남동":
			Albamoncrolling.area += ",D0200520";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황성동":
			Albamoncrolling.area += ",D0200530";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황오동":
			Albamoncrolling.area += ",D0200540";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황용동":
			Albamoncrolling.area += ",D0200550";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효현동":
			Albamoncrolling.area += ",D0200560";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%BF%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 고령군
		case "개진면":
			Albamoncrolling.area += ",D0300010";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%B0%B3%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("개진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산면":
			Albamoncrolling.area += ",D0300030";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%B4%D9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("다산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대가야읍":
			Albamoncrolling.area += ",D0300020";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("대가야읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕곡면":
			Albamoncrolling.area += ",D0300040";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%B4%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산면":
			Albamoncrolling.area += ",D0300050";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍림면":
			Albamoncrolling.area += ",D0300060";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BD%D6%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("쌍림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우곡면":
			Albamoncrolling.area += ",D0300070";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BF%EC%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("우곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운수면":
			Albamoncrolling.area += ",D0300080";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BF%EE%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("운수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 구미시
		case "거의동":
			Albamoncrolling.area += ",D0400010";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%C5%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고아읍":
			Albamoncrolling.area += ",D0400020";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%ED%BE%C6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("고아읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공단동":
			Albamoncrolling.area += ",D0400050";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%F8%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공단동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공단1동":
			Albamoncrolling.area += ",D0400030";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%F8%B4%DC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공단1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공단2동":
			Albamoncrolling.area += ",D0400040";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%F8%B4%DC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공단2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광평동":
			Albamoncrolling.area += ",D0400060";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%A4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구평동":
			Albamoncrolling.area += ",D0400070";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%B8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포동":
			Albamoncrolling.area += ",D0400080";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금전동":
			Albamoncrolling.area += ",D0400090";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%DD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남통동":
			Albamoncrolling.area += ",D0400100";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B3%B2%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도개면":
			Albamoncrolling.area += ",D0400110";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B5%B5%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도개면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도량동":
			Albamoncrolling.area += ",D0400140";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B5%B5%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무을면":
			Albamoncrolling.area += ",D0400150";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B9%AB%C0%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("무을면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉곡동":
			Albamoncrolling.area += ",D0400160";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			Albamoncrolling.area += ",D0400170";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산동":
			Albamoncrolling.area += ",D0400180";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사곡동":
			Albamoncrolling.area += ",D0400190";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BB%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산동면":
			Albamoncrolling.area += ",D0400200";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BB%EA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상모동":
			Albamoncrolling.area += ",D0400210";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BB%F3%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선기동":
			Albamoncrolling.area += ",D0400220";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%B1%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선산읍":
			Albamoncrolling.area += ",D0400230";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%B1%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("선산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			Albamoncrolling.area += ",D0400240";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수점동":
			Albamoncrolling.area += ",D0400250";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%F6%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수점동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시미동":
			Albamoncrolling.area += ",D0400260";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C3%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("시미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			Albamoncrolling.area += ",D0400270";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미시신평동":
			Albamoncrolling.area += ",D0400300";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구미시신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평1동":
			Albamoncrolling.area += ",D0400280";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평2동":
			Albamoncrolling.area += ",D0400290";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양호동":
			Albamoncrolling.area += ",D0400310";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BE%E7%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오태동":
			Albamoncrolling.area += ",D0400320";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%C0%C5%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오태동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥계동":
			Albamoncrolling.area += ",D0400330";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%C1%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥성면":
			Albamoncrolling.area += ",D0400340";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%C1%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원평동":
			Albamoncrolling.area += ",D0400370";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원평1동":
			Albamoncrolling.area += ",D0400350";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%F8%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원평2동":
			Albamoncrolling.area += ",D0400360";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%F8%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인의동":
			Albamoncrolling.area += ",D0400380";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임수동":
			Albamoncrolling.area += ",D0400390";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%D3%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("임수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임은동":
			Albamoncrolling.area += ",D0400400";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%D3%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("임은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장천면":
			Albamoncrolling.area += ",D0400410";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%E5%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산동":
			Albamoncrolling.area += ",D0400420";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진평동":
			Albamoncrolling.area += ",D0400430";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C1%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해평면":
			Albamoncrolling.area += ",D0400440";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%D8%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "형곡동":
			Albamoncrolling.area += ",D0400470";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%FC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("형곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "형곡1동":
			Albamoncrolling.area += ",D0400450";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%FC%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("형곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "형곡2동":
			Albamoncrolling.area += ",D0400460";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%FC%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("형곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황상동":
			Albamoncrolling.area += ",D0400480";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C8%B2%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 군위군
		case "고로면":
			Albamoncrolling.area += ",D0500010";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%B0%ED%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군위읍":
			Albamoncrolling.area += ",D0500020";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%B1%BA%C0%A7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("군위읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부계면":
			Albamoncrolling.area += ",D0500030";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BA%CE%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성면":
			Albamoncrolling.area += ",D0500040";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BB%EA%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소보면":
			Albamoncrolling.area += ",D0500050";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BC%D2%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우보면":
			Albamoncrolling.area += ",D0500060";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BF%EC%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("우보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의흥면":
			Albamoncrolling.area += ",D0500070";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%C0%C7%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("의흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효령면":
			Albamoncrolling.area += ",D0500080";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%C8%BF%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("효령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 김천시
		case "감문면":
			Albamoncrolling.area += ",D0600010";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%A8%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("감문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감천면":
			Albamoncrolling.area += ",D0600020";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%A8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("감천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감호동":
			Albamoncrolling.area += ",D0600030";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%A8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개령면":
			Albamoncrolling.area += ",D0600040";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%B3%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("개령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김천시교동":
			Albamoncrolling.area += ",D0600050";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("김천시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구성면":
			Albamoncrolling.area += ",D0600060";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B1%B8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			Albamoncrolling.area += ",D0600080";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김천시남산동":
			Albamoncrolling.area += ",D0600090";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("김천시남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농소면":
			Albamoncrolling.area += ",D0600100";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B3%F3%BC%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("농소면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다수동":
			Albamoncrolling.area += ",D0600110";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%D9%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대광동":
			Albamoncrolling.area += ",D0600120";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%EB%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕면":
			Albamoncrolling.area += ",D0600130";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대항면":
			Albamoncrolling.area += ",D0600140";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%EB%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대항면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕곡동":
			Albamoncrolling.area += ",D0600150";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모암동":
			Albamoncrolling.area += ",D0600160";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B8%F0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문당동":
			Albamoncrolling.area += ",D0600170";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B9%AE%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백옥동":
			Albamoncrolling.area += ",D0600180";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B9%E9%BF%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백옥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산면":
			Albamoncrolling.area += ",D0600190";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김천시부곡동":
			Albamoncrolling.area += ",D0600200";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("김천시부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부항면":
			Albamoncrolling.area += ",D0600210";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BA%CE%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부항면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼락동":
			Albamoncrolling.area += ",D0600220";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BB%EF%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			Albamoncrolling.area += ",D0600230";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신음동":
			Albamoncrolling.area += ",D0600240";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BD%C5%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아포읍":
			Albamoncrolling.area += ",D0600250";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BE%C6%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("아포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양천동":
			Albamoncrolling.area += ",D0600260";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BE%E7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어모면":
			Albamoncrolling.area += ",D0600270";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BE%EE%B8%F0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("어모면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			Albamoncrolling.area += ",D0600280";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율곡동":
			Albamoncrolling.area += ",D0600370";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C0%B2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응명동":
			Albamoncrolling.area += ",D0600300";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C0%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("응명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조마면":
			Albamoncrolling.area += ",D0600310";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%B6%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("조마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증산면":
			Albamoncrolling.area += ",D0600320";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%F5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("증산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지례면":
			Albamoncrolling.area += ",D0600330";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%F6%B7%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지례면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지좌동":
			Albamoncrolling.area += ",D0600340";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%F6%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동":
			Albamoncrolling.area += ",D0600350";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금동":
			Albamoncrolling.area += ",D0600360";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 문경시
		case "가은읍":
			Albamoncrolling.area += ",D0700010";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B0%A1%C0%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("가은읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			Albamoncrolling.area += ",D0700020";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농암면":
			Albamoncrolling.area += ",D0700030";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B3%F3%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("농암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동로면":
			Albamoncrolling.area += ",D0700040";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B5%BF%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마성면":
			Albamoncrolling.area += ",D0700050";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B8%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모전동":
			Albamoncrolling.area += ",D0700060";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B8%F0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문경읍":
			Albamoncrolling.area += ",D0700070";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B9%AE%B0%E6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("문경읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불정동":
			Albamoncrolling.area += ",D0700080";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BA%D2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("불정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북면":
			Albamoncrolling.area += ",D0700090";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BB%EA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산양면":
			Albamoncrolling.area += ",D0700100";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BB%EA%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			Albamoncrolling.area += ",D0700110";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영순면":
			Albamoncrolling.area += ",D0700120";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BF%B5%BC%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영순면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영신동":
			Albamoncrolling.area += ",D0700130";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BF%B5%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우지동":
			Albamoncrolling.area += ",D0700140";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BF%EC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문경시유곡동":
			Albamoncrolling.area += ",D0700150";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C0%AF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문경시유곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "윤직동":
			Albamoncrolling.area += ",D0700160";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C0%B1%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("윤직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문경시점촌동":
			Albamoncrolling.area += ",D0700170";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C1%A1%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문경시점촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			Albamoncrolling.area += ",D0700180";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계면":
			Albamoncrolling.area += ",D0700190";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C8%A3%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("호계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥덕동":
			Albamoncrolling.area += ",D0700200";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C8%EF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흥덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 봉화군
		case "명호면":
			Albamoncrolling.area += ",D0800010";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%B8%ED%C8%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("명호면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "물야면":
			Albamoncrolling.area += ",D0800020";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%B9%B0%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("물야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법전면":
			Albamoncrolling.area += ",D0800030";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%B9%FD%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("법전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉성면":
			Albamoncrolling.area += ",D0800040";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BA%C0%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉화읍":
			Albamoncrolling.area += ",D0800050";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BA%C0%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("봉화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상운면":
			Albamoncrolling.area += ",D0800060";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BB%F3%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석포면":
			Albamoncrolling.area += ",D0800070";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BC%AE%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("석포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소천면":
			Albamoncrolling.area += ",D0800080";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BC%D2%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재산면":
			Albamoncrolling.area += ",D0800090";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%C0%E7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("재산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘양면":
			Albamoncrolling.area += ",D0800100";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%C3%E1%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("춘양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// 상주시
		case "가장동":
			Albamoncrolling.area += ",D0900010";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%A1%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개운동":
			Albamoncrolling.area += ",D0900020";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거동동":
			Albamoncrolling.area += ",D0900030";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%C5%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("거동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계산동":
			Albamoncrolling.area += ",D0900040";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%E8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공검면":
			Albamoncrolling.area += ",D0900050";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%F8%B0%CB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("공검면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공성면":
			Albamoncrolling.area += ",D0900060";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%F8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("공성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙동면":
			Albamoncrolling.area += ",D0900070";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%AB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("낙동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙상동":
			Albamoncrolling.area += ",D0900080";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%AB%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙양동":
			Albamoncrolling.area += ",D0900090";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남성동":
			Albamoncrolling.area += ",D0900100";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남장동":
			Albamoncrolling.area += ",D0900110";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%B2%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남적동":
			Albamoncrolling.area += ",D0900120";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%B2%C0%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남적동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내서면":
			Albamoncrolling.area += ",D0900130";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%BB%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "냉림동":
			Albamoncrolling.area += ",D0900140";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%C3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("냉림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			Albamoncrolling.area += ",D0900150";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만산동":
			Albamoncrolling.area += ",D0900160";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B8%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모동면":
			Albamoncrolling.area += ",D0900170";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B8%F0%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("모동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모서면":
			Albamoncrolling.area += ",D0900180";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B8%F0%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("모서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무양동":
			Albamoncrolling.area += ",D0900190";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B9%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병성동":
			Albamoncrolling.area += ",D0900200";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BA%B4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("병성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복룡동":
			Albamoncrolling.area += ",D0900210";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BA%B9%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부원동":
			Albamoncrolling.area += ",D0900220";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BA%CE%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사벌면":
			Albamoncrolling.area += ",D0900230";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BB%E7%B9%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사벌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서곡동":
			Albamoncrolling.area += ",D0900240";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서문동":
			Albamoncrolling.area += ",D0900250";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서성동":
			Albamoncrolling.area += ",D0900260";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%AD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상주시성동동":
			Albamoncrolling.area += ",D0900270";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%BA%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상주시성동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성하동":
			Albamoncrolling.area += ",D0900280";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%BA%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신봉동":
			Albamoncrolling.area += ",D0900290";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양촌동":
			Albamoncrolling.area += ",D0900300";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BE%E7%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연원동":
			Albamoncrolling.area += ",D0900310";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%AC%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오대동":
			Albamoncrolling.area += ",D0900320";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%C0%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외남면":
			Albamoncrolling.area += ",D0900330";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%DC%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("외남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외답동":
			Albamoncrolling.area += ",D0900340";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%DC%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외서면":
			Albamoncrolling.area += ",D0900350";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%DC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("외서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은척면":
			Albamoncrolling.area += ",D0900360";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%BA%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("은척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이안면":
			Albamoncrolling.area += ",D0900370";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%CC%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인봉동":
			Albamoncrolling.area += ",D0900380";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%CE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인평동":
			Albamoncrolling.area += ",D0900390";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%CE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전동":
			Albamoncrolling.area += ",D0900400";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중덕동":
			Albamoncrolling.area += ",D0900410";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%DF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동면":
			Albamoncrolling.area += ",D0900420";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%DF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("중동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지천동":
			Albamoncrolling.area += ",D0900430";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청리면":
			Albamoncrolling.area += ",D0900440";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C3%BB%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초산동":
			Albamoncrolling.area += ",D0900450";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C3%CA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함창읍":
			Albamoncrolling.area += ",D0900460";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C7%D4%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("함창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "헌신동":
			Albamoncrolling.area += ",D0900470";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C7%E5%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("헌신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화개동":
			Albamoncrolling.area += ",D0900480";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화개동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화남면":
			Albamoncrolling.area += ",D0900490";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화동면":
			Albamoncrolling.area += ",D0900500";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북면":
			Albamoncrolling.area += ",D0900510";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산동":
			Albamoncrolling.area += ",D0900520";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서면":
			Albamoncrolling.area += ",D0900530";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥각동":
			Albamoncrolling.area += ",D0900540";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흥각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
