package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Jeju {
	public boolean flag;

	public void JejuCity(ActionEvent e) {
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
		case "강정동":
			crolling.area += ",N0300010";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B0%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남원읍":
			crolling.area += ",N0300012";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B3%B2%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("남원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대정읍":
			crolling.area += ",N0300015";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("대정읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			crolling.area += ",N0300020";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도순동":
			crolling.area += ",N0300030";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%B5%BC%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도순동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동홍동":
			crolling.area += ",N0300040";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%BF%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동홍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법환동":
			crolling.area += ",N0300050";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B9%FD%C8%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("법환동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보목동":
			crolling.area += ",N0300060";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BA%B8%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상예동":
			crolling.area += ",N0300070";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상예동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상효동":
			crolling.area += ",N0300080";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "색달동":
			crolling.area += ",N0300090";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("색달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서귀동":
			crolling.area += ",N0300100";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%B1%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서귀동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호동":
			crolling.area += ",N0300110";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서홍동":
			crolling.area += ",N0300120";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서홍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산읍":
			crolling.area += ",N0300125";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%BA%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("성산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",N0300130";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신효동":
			crolling.area += ",N0300140";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BD%C5%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안덕면":
			crolling.area += ",N0300146";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BE%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영남동":
			crolling.area += ",N0300150";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용흥동":
			crolling.area += ",N0300160";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월평동":
			crolling.area += ",N0300170";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정방동":
			crolling.area += ",N0300180";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%A4%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정바동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중문동":
			crolling.area += ",N0300190";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",N0300200";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("웅앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천지동":
			crolling.area += ",N0300210";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C3%B5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토평동":
			crolling.area += ",N0300220";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C5%E4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("토평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "표선면":
			crolling.area += ",N0300225";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%A5%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("표선면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하예동":
			crolling.area += ",N0300230";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하예동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하원동":
			crolling.area += ",N0300240";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하효동":
			crolling.area += ",N0300250";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호근동":
			crolling.area += ",N0300260";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%A3%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호근동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회수동":
			crolling.area += ",N0300270";
			wewe.area = "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건입동":
			crolling.area += ",N0400010";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B0%C7%C0%D4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("건입동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구좌읍":
			crolling.area += ",N0400015";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B1%B8%C1%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("구좌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내도동":
			crolling.area += ",N0400020";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%BB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노형동":
			crolling.area += ",N0400030";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%EB%C7%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노형동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			crolling.area += ",N0400040";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도두동":
			crolling.area += ",N0400070";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도두1동":
			crolling.area += ",N0400050";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도두1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도두2동":
			crolling.area += ",N0400060";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도두2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도련1동":
			crolling.area += ",N0400080";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도련1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도련2동":
			crolling.area += ",N0400090";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도련2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도평동":
			crolling.area += ",N0400110";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉개동":
			crolling.area += ",N0400120";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BA%C0%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉개동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼도1동":
			crolling.area += ",N0400130";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼마2동":
			crolling.area += ",N0400140";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼마2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양동":
			crolling.area += ",N0400190";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양1동":
			crolling.area += ",N0400160";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양2동":
			crolling.area += ",N0400170";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양3동":
			crolling.area += ",N0400180";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아라동":
			crolling.area += ",N0400220";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아라1동":
			crolling.area += ",N0400200";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아라2동":
			crolling.area += ",N0400210";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아라2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "애월읍":
			crolling.area += ",N0400225";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%D6%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("애월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연동":
			crolling.area += ",N0400230";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영평동":
			crolling.area += ",N0400240";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오등동":
			crolling.area += ",N0400250";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라동":
			crolling.area += ",N0400290";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라1동":
			crolling.area += ",N0400260";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라2동":
			crolling.area += ",N0400270";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오라3동":
			crolling.area += ",N0400280";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오라3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외도동":
			crolling.area += ",N0400320";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외도1동":
			crolling.area += ",N0400300";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외도2동":
			crolling.area += ",N0400310";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			crolling.area += ",N0400330";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담1동":
			crolling.area += ",N0400340";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담2동":
			crolling.area += ",N0400350";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담3동":
			crolling.area += ",N0400360";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우도면":
			crolling.area += ",N0400375";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EC%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("우도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제주시월평동":
			crolling.area += ",N0400380";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이도1동":
			crolling.area += ",N0400390";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이도2동":
			crolling.area += ",N0400400";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이호동":
			crolling.area += ",N0400440";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이호1동":
			crolling.area += ",N0400420";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이호1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이호2동":
			crolling.area += ",N0400430";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이호2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일도1동":
			crolling.area += ",N0400450";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일도1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일도2동":
			crolling.area += ",N0400460";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일도2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조천읍":
			crolling.area += ",N0400475";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C1%B6%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("조천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추자면":
			crolling.area += ",N0400473";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C3%DF%C0%DA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("추자면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한경면":
			crolling.area += ",N0400476";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한경면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한림읍":
			crolling.area += ",N0400477";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B8%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("한림읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동":
			crolling.area += ",N0400480";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북동":
			crolling.area += ",N0400510";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북1동":
			crolling.area += ",N0400490";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화북1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북2동":
			crolling.area += ",N0400500";
			wewe.area = "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화북2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회천동":
			crolling.area += ",N0400520";
			wewe.area = "C064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%B8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}