package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Jeju {
	public boolean flag;

	public void JejuCity(ActionEvent e) {
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
		case "강정동":
			Albamoncrolling.area += ",N0300010";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B0%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원읍":
			Albamoncrolling.area += ",N0300012";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B3%B2%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("남원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대정읍":
			Albamoncrolling.area += ",N0300015";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("대정읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			Albamoncrolling.area += ",N0300020";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도순동":
			Albamoncrolling.area += ",N0300030";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%B5%BC%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도순동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동홍동":
			Albamoncrolling.area += ",N0300040";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%BF%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동홍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법환동":
			Albamoncrolling.area += ",N0300050";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B9%FD%C8%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("법환동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보목동":
			Albamoncrolling.area += ",N0300060";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BA%B8%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상예동":
			Albamoncrolling.area += ",N0300070";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상예동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상효동":
			Albamoncrolling.area += ",N0300080";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "색달동":
			Albamoncrolling.area += ",N0300090";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("색달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서귀동":
			Albamoncrolling.area += ",N0300100";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%B1%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서귀동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호동":
			Albamoncrolling.area += ",N0300110";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서홍동":
			Albamoncrolling.area += ",N0300120";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서홍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산읍":
			Albamoncrolling.area += ",N0300125";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%BA%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("성산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			Albamoncrolling.area += ",N0300130";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신효동":
			Albamoncrolling.area += ",N0300140";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BD%C5%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안덕면":
			Albamoncrolling.area += ",N0300146";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BE%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영남동":
			Albamoncrolling.area += ",N0300150";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용흥동":
			Albamoncrolling.area += ",N0300160";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월평동":
			Albamoncrolling.area += ",N0300170";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정방동":
			Albamoncrolling.area += ",N0300180";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%A4%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정바동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중문동":
			Albamoncrolling.area += ",N0300190";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",N0300200";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("웅앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천지동":
			Albamoncrolling.area += ",N0300210";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C3%B5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토평동":
			Albamoncrolling.area += ",N0300220";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C5%E4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "표선면":
			Albamoncrolling.area += ",N0300225";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%A5%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("표선면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하예동":
			Albamoncrolling.area += ",N0300230";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하예동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하원동":
			Albamoncrolling.area += ",N0300240";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하효동":
			Albamoncrolling.area += ",N0300250";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호근동":
			Albamoncrolling.area += ",N0300260";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%A3%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호근동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회수동":
			Albamoncrolling.area += ",N0300270";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건입동":
			Albamoncrolling.area += ",N0400010";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B0%C7%C0%D4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("건입동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구좌읍":
			Albamoncrolling.area += ",N0400015";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B1%B8%C1%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("구좌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내도동":
			Albamoncrolling.area += ",N0400020";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%BB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노형동":
			Albamoncrolling.area += ",N0400030";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%EB%C7%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노형동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			Albamoncrolling.area += ",N0400040";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도두동":
			Albamoncrolling.area += ",N0400070";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도두1동":
			Albamoncrolling.area += ",N0400050";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도두1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도두2동":
			Albamoncrolling.area += ",N0400060";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도두2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도련1동":
			Albamoncrolling.area += ",N0400080";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도련1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도련2동":
			Albamoncrolling.area += ",N0400090";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도련2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도평동":
			Albamoncrolling.area += ",N0400110";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉개동":
			Albamoncrolling.area += ",N0400120";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BA%C0%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉개동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼도1동":
			Albamoncrolling.area += ",N0400130";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼마2동":
			Albamoncrolling.area += ",N0400140";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼마2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양동":
			Albamoncrolling.area += ",N0400190";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양1동":
			Albamoncrolling.area += ",N0400160";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양2동":
			Albamoncrolling.area += ",N0400170";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양3동":
			Albamoncrolling.area += ",N0400180";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아라동":
			Albamoncrolling.area += ",N0400220";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아라1동":
			Albamoncrolling.area += ",N0400200";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아라2동":
			Albamoncrolling.area += ",N0400210";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아라2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "애월읍":
			Albamoncrolling.area += ",N0400225";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%D6%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("애월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연동":
			Albamoncrolling.area += ",N0400230";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영평동":
			Albamoncrolling.area += ",N0400240";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오등동":
			Albamoncrolling.area += ",N0400250";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라동":
			Albamoncrolling.area += ",N0400290";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라1동":
			Albamoncrolling.area += ",N0400260";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라2동":
			Albamoncrolling.area += ",N0400270";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라3동":
			Albamoncrolling.area += ",N0400280";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외도동":
			Albamoncrolling.area += ",N0400320";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외도1동":
			Albamoncrolling.area += ",N0400300";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외도2동":
			Albamoncrolling.area += ",N0400310";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			Albamoncrolling.area += ",N0400330";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담1동":
			Albamoncrolling.area += ",N0400340";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담2동":
			Albamoncrolling.area += ",N0400350";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담3동":
			Albamoncrolling.area += ",N0400360";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우도면":
			Albamoncrolling.area += ",N0400375";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EC%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("우도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제주시월평동":
			Albamoncrolling.area += ",N0400380";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이도1동":
			Albamoncrolling.area += ",N0400390";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이도2동":
			Albamoncrolling.area += ",N0400400";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이호동":
			Albamoncrolling.area += ",N0400440";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이호1동":
			Albamoncrolling.area += ",N0400420";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이호1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이호2동":
			Albamoncrolling.area += ",N0400430";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이호2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일도1동":
			Albamoncrolling.area += ",N0400450";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일도2동":
			Albamoncrolling.area += ",N0400460";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조천읍":
			Albamoncrolling.area += ",N0400475";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C1%B6%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("조천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추자면":
			Albamoncrolling.area += ",N0400473";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C3%DF%C0%DA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("추자면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한경면":
			Albamoncrolling.area += ",N0400476";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한경면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한림읍":
			Albamoncrolling.area += ",N0400477";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B8%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("한림읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동":
			Albamoncrolling.area += ",N0400480";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북동":
			Albamoncrolling.area += ",N0400510";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북1동":
			Albamoncrolling.area += ",N0400490";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화북1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북2동":
			Albamoncrolling.area += ",N0400500";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화북2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회천동":
			Albamoncrolling.area += ",N0400520";
			AlbaHeavencrolling.area += "C064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%B8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}