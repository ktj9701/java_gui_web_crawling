package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;

public class Gyeonggi2 {
	public boolean flag;

	public void Gyeonggi2City(ActionEvent e) {
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

		case "가사동":
			crolling.area += ",B2300010";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%A1%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가현동":
			crolling.area += ",B2300020";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%A1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계동":
			crolling.area += ",B2300030";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고삼면":
			crolling.area += "B2300040";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%ED%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고삼면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공도읍":
			crolling.area += ",B2300050";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%F8%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("공도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포동":
			crolling.area += ",B2300060";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광면":
			crolling.area += ",B2300070";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산동":
			crolling.area += "B2300080";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금석동":
			crolling.area += ",B2300090";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			crolling.area += ",B2300100";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당왕동":
			crolling.area += ",B2300110";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%E7%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕면":
			crolling.area += ",B2300120";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천동":
			crolling.area += "B2300130";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도기동":
			crolling.area += ",B2300140";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B5%B5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동본동":
			crolling.area += ",B2300150";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B5%BF%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",B2300160";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미양면":
			crolling.area += "B2300170";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B9%CC%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "발화동":
			crolling.area += ",B2300180";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B9%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("발화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보개면":
			crolling.area += ",B2300190";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%B8%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("보개면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉남동":
			crolling.area += ",B2300200";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%C0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			crolling.area += ",B2300210";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사곡동":
			crolling.area += ",B2300220";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BB%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼죽면":
			crolling.area += ",B2300230";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BB%EF%C1%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼죽면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서운면":
			crolling.area += ",B2300240";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AD%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서인동":
			crolling.area += ",B2300250";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AD%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석정동":
			crolling.area += ",B2300260";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",B2300270";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			crolling.area += ",B2300280";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신건지동":
			crolling.area += ",B2300290";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%B0%C7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신건지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신모산동":
			crolling.area += ",B2300300";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신모산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신소현동":
			crolling.area += ",B2300310";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%BC%D2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신소현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",B2300320";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아양동":
			crolling.area += ",B2300330";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성1동":
			crolling.area += ",B2300460";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성2동":
			crolling.area += ",B2300470";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성3동":
			crolling.area += ",B2300480";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안성3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양성면":
			crolling.area += ",ㅌB2300480";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%E7%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			crolling.area += ",B2300350";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",B2300360";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산동":
			crolling.area += ",B2300370";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			crolling.area += ",B2300380";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원곡면":
			crolling.area += ",B2300390";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%F8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("원곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인지동":
			crolling.area += ",B2300400";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C0%CE%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일죽면":
			crolling.area += ",B2300410";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C0%CF%C1%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("일죽면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽산면":
			crolling.area += ",B2300420";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C1%D7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("죽산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중리동":
			crolling.area += ",B2300430";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창전동":
			crolling.area += ",B2300440";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현수동":
			crolling.area += ",B2300450";
			wewe.area = "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C7%F6%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길산동":
			crolling.area += ",B2400010";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("길산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관양동":
			crolling.area += ",B2400040";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관양1동":
			crolling.area += ",B2400020";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관양2동":
			crolling.area += ",B2400030";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀인동":
			crolling.area += ",B2400050";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B1%CD%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귀인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달안동":
			crolling.area += ",B2400060";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B4%DE%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("달안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범계동":
			crolling.area += ",B2400070";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B9%FC%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("범계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			crolling.area += ",B2400080";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부흥동":
			crolling.area += ",B2400090";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산동":
			crolling.area += ",B2400130";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산1동":
			crolling.area += ",B2400100";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산2동":
			crolling.area += ",B2400110";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산3동":
			crolling.area += ",B2400120";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",B2400140";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평안동":
			crolling.area += ",B2400150";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평촌동":
			crolling.area += ",B2400160";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계동":
			crolling.area += ",B2400200";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계1동":
			crolling.area += ",B2400170";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계2동":
			crolling.area += ",B2400180";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호계2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계3동":
			crolling.area += "B2400190";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호계3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박달동":
			crolling.area += ",B2500030";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("박달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박달1동":
			crolling.area += ",B2500010";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("박달1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박달2동":
			crolling.area += ",B2500020";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("박달2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수동":
			crolling.area += ",B2500070";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수1동":
			crolling.area += ",B2500040";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수2동":
			crolling.area += ",B2500050";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수3동":
			crolling.area += ",B2500060";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석수3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양동":
			crolling.area += ",B2500170";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양1동":
			crolling.area += ",B2500080";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양2동":
			crolling.area += ",B2500090";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양3동":
			crolling.area += ",B2500100";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양4동":
			crolling.area += ",B2500110";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양5동":
			crolling.area += ",B2500120";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양6동":
			crolling.area += ",B2500130";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양7동":
			crolling.area += ",B2500140";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양8동":
			crolling.area += ",B2500150";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E78%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양9동":
			crolling.area += ",B2500160";
			wewe.area = "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E79%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안양9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고암동":
			crolling.area += ",B2600010";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B0%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고읍동":
			crolling.area += ",B2600020";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B0%ED%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광사동":
			crolling.area += ",B2600030";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B1%A4%BB%E7%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("광사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광적면":
			crolling.area += ",B2600040";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B1%A4%C0%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("광적면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",B2600050";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남방동":
			crolling.area += ",B2600060";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B3%B2%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕계동":
			crolling.area += ",B2600070";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B4%F6%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕정동":
			crolling.area += ",B2600080";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B4%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마전동":
			crolling.area += "B2600090";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만송동":
			crolling.area += ",B2600100";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B8%B8%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석읍":
			crolling.area += ",B2600110";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B9%E9%BC%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("백석읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉양동":
			crolling.area += ",B2600120";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BA%C0%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북동":
			crolling.area += ",B2600130";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BB%EA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼숭동":
			crolling.area += ",B2600140";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BB%EF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼숭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어둔동":
			crolling.area += ",B2600150";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BE%EE%B5%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어둔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥정동":
			crolling.area += ",B2600160";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BF%C1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유양동":
			crolling.area += ",B2600170";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%AF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율정동":
			crolling.area += ",B2600180";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은현면":
			crolling.area += ",B2600190";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%BA%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("은현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장흥면":
			crolling.area += ",B2600200";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%E5%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("증흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회암동":
			crolling.area += ",B2600210";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C8%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회정동":
			crolling.area += ",B2600220";
			wewe.area = "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C8%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강상면":
			crolling.area += ",B2700010";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%AD%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강하면":
			crolling.area += ",B2700020";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%AD%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개군면":
			crolling.area += ",B2700030";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%B3%B1%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("개군면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단월면":
			crolling.area += ",B2700040";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B4%DC%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("단월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서종면":
			crolling.area += ",B2700050";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BC%AD%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양동면":
			crolling.area += ",B2700060";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양서면":
			crolling.area += ",B2700070";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평읍":
			crolling.area += ",B2700080";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("양평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천면":
			crolling.area += ",B2700090";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BF%C1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문면":
			crolling.area += ",B2700100";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BF%EB%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지평면":
			crolling.area += ",B2700110";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%C1%F6%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청운면":
			crolling.area += ",B2700120";
			wewe.area = "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%C3%BB%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가남읍":
			crolling.area += ",B2800010";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%A1%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("가남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가업동":
			crolling.area += ",B2800140";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%A1%BE%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가업동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강천면":
			crolling.area += ",B2800020";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%AD%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",B2800150";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금사면":
			crolling.area += ",B2800030";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B1%DD%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능서면":
			crolling.area += ",B2800040";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%C9%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("능서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능현동":
			crolling.area += ",B2800160";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%C9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("능현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단현동":
			crolling.area += ",B2800170";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%DC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대신면":
			crolling.area += ",B2800050";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%EB%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매룡동":
			crolling.area += ",B2800180";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B8%C5%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("매룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "멱곡동":
			crolling.area += ",B2800190";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B8%E8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("멱곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북내면":
			crolling.area += ",B2800060";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BA%CF%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북면":
			crolling.area += ",B2800070";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%EA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼교동":
			crolling.area += ",B2800200";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%EF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상거동":
			crolling.area += ",B2800210";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%F3%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",B2800220";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신진동":
			crolling.area += ",B2800230";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BD%C5%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여흥동":
			crolling.area += ",B2800110";
			Mainpage.Filtering[Mainpage.index].setText("여흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연라동":
			crolling.area += ",B2800240";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%AC%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연양동":
			crolling.area += ",B2800250";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%AC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			crolling.area += ",B2800260";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오학동":
			crolling.area += ",B2800120";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%C0%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만동":
			crolling.area += ",B2800270";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%EC%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월송동":
			crolling.area += ",B2800280";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%F9%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점동면":
			crolling.area += ",B2800090";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C1%A1%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("점동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점봉동":
			crolling.area += ",B2800290";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C1%A1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("점봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",B2800130";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			crolling.area += ",B2800300";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천송동":
			crolling.area += ",B2800310";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C3%B5%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하거동":
			crolling.area += ",B2800320";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%CF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			crolling.area += ",B2800330";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현암동":
			crolling.area += ",B2800340";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍문동":
			crolling.area += ",B2800350";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C8%AB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥천면":
			crolling.area += ",B2800100";
			wewe.area = "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C8%EF%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("흥천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군남면":
			crolling.area += ",B2900010";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B1%BA%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미산면":
			crolling.area += ",B2900020";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B9%CC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백학면":
			crolling.area += ",B2900030";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B9%E9%C7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백학면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신서면":
			crolling.area += ",B2900040";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BD%C5%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연천읍":
			crolling.area += ",B2900050";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BF%AC%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("연천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕징면":
			crolling.area += ",B2900060";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BF%D5%C2%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("와징면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장남면":
			crolling.area += ",B2900070";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C0%E5%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전곡읍":
			crolling.area += ",B2900080";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C0%FC%B0%EE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("전곡읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중면":
			crolling.area += ",B2900090";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("중면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청산면":
			crolling.area += ",B2900100";
			wewe.area = "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E";
			Mainpage.Filtering[Mainpage.index].setText("청산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가수동":
			crolling.area += ",B3000010";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A1%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가장동":
			crolling.area += ",B3000020";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A1%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈곶동":
			crolling.area += ",B3000030";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A5%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고현동":
			crolling.area += ",B3000040";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궐동":
			crolling.area += ",B3000050";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B1%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("궐동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암동":
			crolling.area += ",B3000060";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내삼미동":
			crolling.area += ",B3000070";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B3%BB%BB%EF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내삼미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누읍동":
			crolling.area += ",B3000080";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B4%A9%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("누읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두곡동":
			crolling.area += ",B3000090";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B5%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벌음동":
			crolling.area += ",B3000100";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B9%FA%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("벌음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부산동":
			crolling.area += ",B3000110";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BA%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서동":
			crolling.area += ",B3000120";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서랑동":
			crolling.area += ",B3000130";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%AD%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세교동":
			crolling.area += ",B3000140";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%BC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("세교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수청동":
			crolling.area += ",B3000150";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%F6%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양산동":
			crolling.area += ",B3000160";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BE%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("양산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산동":
			crolling.area += ",B3000170";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외삼미동":
			crolling.area += ",B3000180";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%DC%BB%EF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외삼미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			crolling.area += ",B3000190";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은계동":
			crolling.area += ",B3000200";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C0%BA%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("은계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곶동":
			crolling.area += ",B3000210";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C1%F6%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			crolling.area += ",B3000220";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청호동":
			crolling.area += ",B3000230";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C3%BB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			crolling.area += ",B3000240";
			wewe.area = "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고매동":
			crolling.area += ",B3100010";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B0%ED%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공세동":
			crolling.area += ",B3100020";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B0%F8%BC%BC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("공세동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구갈동":
			crolling.area += ",B3100030";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B1%B8%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구성동":
			crolling.area += ",B3100190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기흥동":
			crolling.area += ",B3100200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("기흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농서동":
			crolling.area += ",B3100040";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B3%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("농서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동백동":
			crolling.area += ",B3100050";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B5%BF%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마북동":
			crolling.area += ",B3100060";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B8%B6%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보라동":
			crolling.area += ",B3100070";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BA%B8%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보정동":
			crolling.area += ",B3100080";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BA%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("보정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상갈동":
			crolling.area += ",B3100090";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BB%F3%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상하동":
			crolling.area += ",B3100100";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BB%F3%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서농동":
			crolling.area += ",B3100210";
			Mainpage.Filtering[Mainpage.index].setText("서농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서천동":
			crolling.area += ",B3100110";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BC%AD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신갈동":
			crolling.area += ",B3100120";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BD%C5%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "언남동":
			crolling.area += ",B3100130";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BE%F0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("언남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영덕동":
			crolling.area += ",B3100140";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BF%B5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",B3100150";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡동":
			crolling.area += ",B3100160";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C1%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청덕동":
			crolling.area += ",B3100170";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하갈동":
			crolling.area += ",B3100180";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C7%CF%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고기동":
			crolling.area += ",B3110010";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%B0%ED%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동천동":
			crolling.area += ",B3110020";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상현1동":
			crolling.area += ",B3110030";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상현2동":
			crolling.area += ",B3110040";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상현동":
			crolling.area += ",B3110050";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성복동":
			crolling.area += ",B3110060";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BC%BA%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신봉동":
			crolling.area += ",B3110070";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전동":
			crolling.area += ",B3110100";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전1동":
			crolling.area += ",B3110080";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전2동":
			crolling.area += ",B3110090";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕천동":
			crolling.area += ",B3110130";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍덕천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕천1동":
			crolling.area += ",B3110110";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍덕천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕천2동":
			crolling.area += ",B3110120";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍덕천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고림동":
			crolling.area += ",B3120010";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B0%ED%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김량장동":
			crolling.area += ",B3120020";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B1%E8%B7%AE%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("김량장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남동":
			crolling.area += ",B3120030";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남사면":
			crolling.area += ",B3120040";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B3%B2%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동부동":
			crolling.area += ",B3120180";
			Mainpage.Filtering[Mainpage.index].setText("동부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마평동":
			crolling.area += ",B3120050";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B8%B6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모현읍":
			crolling.area += ",B3120060";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B8%F0%C7%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("모현읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백암면":
			crolling.area += ",B3120070";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B9%E9%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼가동":
			crolling.area += ",B3120080";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BB%EF%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양지면":
			crolling.area += ",B3120090";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BE%E7%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역북동":
			crolling.area += ",B3120100";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%AA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("역북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼동":
			crolling.area += ",B3120190";
			Mainpage.Filtering[Mainpage.index].setText("역삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운학동":
			crolling.area += ",B3120110";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%EE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원삼면":
			crolling.area += ",B3120120";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%F8%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("원삼면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유림동":
			crolling.area += ",B3120200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유방동":
			crolling.area += ",B3120130";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C0%AF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동읍":
			crolling.area += ",B3120140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("이동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용인시중앙동":
			crolling.area += ",B3120210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용인시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포곡읍":
			crolling.area += ",B3120150";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C6%F7%B0%EE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("포곡읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해곡동":
			crolling.area += ",B3120160";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C7%D8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("해곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호동":
			crolling.area += ",B3120170";
			wewe.area = "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고천동":
			crolling.area += ",B3200010";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B0%ED%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내손동":
			crolling.area += ",B3200040";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내손동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내손1동":
			crolling.area += ",B3200020";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내손1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내손2동":
			crolling.area += ",B3200030";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내손2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",B3200140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동":
			crolling.area += ",B3200050";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오전동":
			crolling.area += ",B3200060";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%C0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕곡동":
			crolling.area += ",B3200070";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%D5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("왕곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월암동":
			crolling.area += ",B3200080";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%F9%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",B3200090";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청계동":
			crolling.area += ",B3200100";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초평동":
			crolling.area += ",B3200110";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C3%CA%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포일동":
			crolling.area += ",B3200120";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C6%F7%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("포일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학의동":
			crolling.area += ",B3200130";
			wewe.area = "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C7%D0%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가능동":
			crolling.area += ",B3300040";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%A1%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가능1동":
			crolling.area += ",B3300010";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%A1%B4%C91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가능1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고산동":
			crolling.area += ",B3300050";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금오동":
			crolling.area += ",B3300060";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B1%DD%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙양동":
			crolling.area += ",B3300070";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B3%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹양동":
			crolling.area += ",B3300080";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B3%EC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("녹양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "민락동":
			crolling.area += ",B3300090";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B9%CE%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("민락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			crolling.area += ",B3300100";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산1동":
			crolling.area += ",B3300240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산2동":
			crolling.area += ",B3300250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡동":
			crolling.area += ",B3300130";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡1동":
			crolling.area += ",B3300110";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡2동":
			crolling.area += ",B3300120";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현동":
			crolling.area += ",B3300140";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BF%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부동":
			crolling.area += ",B3300180";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("의정부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부1동":
			crolling.area += ",B3300150";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("의정부1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부2동":
			crolling.area += ",B3300160";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("의정부2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부3동":
			crolling.area += ",B3300170";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("의정부3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자금동":
			crolling.area += ",B3300260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("자금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자일동":
			crolling.area += ",B3300190";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%DA%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장암동":
			crolling.area += ",B3300200";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%E5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호원동":
			crolling.area += ",B3300230";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호원1동":
			crolling.area += ",B3300210";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호원2동":
			crolling.area += ",B3300220";
			wewe.area = "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥선동":
			crolling.area += ",B3300270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("흥선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			crolling.area += ",B3400010";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고담동":
			crolling.area += ",B3400020";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%ED%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관고동":
			crolling.area += ",B3400030";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%FC%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단월동":
			crolling.area += ",B3400040";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%DC%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대월면":
			crolling.area += ",B3400050";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%EB%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			crolling.area += ",B3400060";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마장면":
			crolling.area += ",B3400070";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B8%B6%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모가면":
			crolling.area += ",B3400080";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B8%F0%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("모가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백사면":
			crolling.area += ",B3400090";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B9%E9%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부발읍":
			crolling.area += ",B3400100";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BA%CE%B9%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("부발읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사음동":
			crolling.area += ",B3400110";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BB%E7%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설성면":
			crolling.area += ",B3400120";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BC%B3%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("설성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",B3400130";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신둔면":
			crolling.area += ",B3400140";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BD%C5%B5%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신둔면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥동":
			crolling.area += ",B3400150";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BE%C8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율면":
			crolling.area += ",B3400160";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("율면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율현동":
			crolling.area += ",B3400170";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장록동":
			crolling.area += ",B3400180";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%E5%B7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장록동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장호원읍":
			crolling.area += ",B3400190";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%E5%C8%A3%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("장호원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이천시중리동":
			crolling.area += ",B3400200";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이천시중리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증일동":
			crolling.area += ",B3400210";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("증일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증포동":
			crolling.area += ",B3400220";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F5%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("증포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진리동":
			crolling.area += ",B3400230";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F8%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이천시창전동":
			crolling.area += ",B3400240";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이천시창전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호법면":
			crolling.area += ",B3400250";
			wewe.area = "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C8%A3%B9%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("호법면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검산동":
			crolling.area += ",B3500010";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B0%CB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("검산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광탄면":
			crolling.area += ",B3500020";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%A4%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("광탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교하동":
			crolling.area += ",B3500030";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%B3%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군내면":
			crolling.area += ",B3500040";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금능동":
			crolling.area += "B3500050";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금촌동":
			crolling.area += ",B3500080";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금촌1동":
			crolling.area += ",B3500060";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금촌2동":
			crolling.area += ",B3500070";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다율동":
			crolling.area += ",B3500230";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B4%D9%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("다율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당하동":
			crolling.area += ",B3500240";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B4%E7%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동패동":
			crolling.area += ",B3500250";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B5%BF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "맥금동":
			crolling.area += ",B3500090";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B8%C6%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("맥금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동동":
			crolling.area += ",B3500260";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B8%F1%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문발동":
			crolling.area += ",B3500270";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%AE%B9%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문발동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문산읍":
			crolling.area += ",B3500100";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%AE%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("문산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법원읍":
			crolling.area += ",B3500110";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%FD%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("법원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신남동":
			crolling.area += ",B3500280";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BB%EA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상지석동":
			crolling.area += ",B3500290";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BB%F3%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상지석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서패동":
			crolling.area += ",B3500300";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BC%AD%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송촌동":
			crolling.area += ",B3500310";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파주시신촌동":
			crolling.area += ",B3500320";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("파주시신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아동동":
			crolling.area += ",B3500120";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%C6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("아동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야당동":
			crolling.area += ",B3500330";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%DF%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("야당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야동동":
			crolling.area += ",B3500130";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%DF%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("야동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연다산동":
			crolling.area += ",B3500340";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%AC%B4%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오도동":
			crolling.area += ",B3500350";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%C0%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와동동":
			crolling.area += ",B3500360";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%CD%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("와동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월롱면":
			crolling.area += ",B3500330";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%F9%B7%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("월롱면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장단면":
			crolling.area += ",B3500130";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C0%E5%B4%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장단면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적성면":
			crolling.area += ",B3500340";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("적성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조리읍":
			crolling.area += ",B3500170";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C1%B6%B8%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("조리읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄현면":
			crolling.area += ",B3500200";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C5%BA%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("탄현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파주읍":
			crolling.area += ",B3500210";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C6%C4%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("파주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파평면":
			crolling.area += ",B3500220";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C6%C4%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("파평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하지석동":
			crolling.area += ",B3500370";
			wewe.area = "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C7%CF%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하지석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가재동":
			crolling.area += ",B3600010";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B0%A1%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕면":
			crolling.area += ",B3600020";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B0%ED%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("고덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군문동":
			crolling.area += ",B3600030";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B1%BA%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("군문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도일동":
			crolling.area += ",B3600040";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%B5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독곡동":
			crolling.area += ",B3600050";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("독곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삭동":
			crolling.area += ",B3600060";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%BF%BB%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동삭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모곡동":
			crolling.area += ",B3600070";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B8%F0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비전동":
			crolling.area += ",B3600100";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비전1동":
			crolling.area += ",B3600080";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비전2동":
			crolling.area += ",B3600090";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서정동":
			crolling.area += ",B3600110";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서탄면":
			crolling.area += ",B3600120";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%AD%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평택시세교동":
			crolling.area += ",B3600130";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%BC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평택시세교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			crolling.area += ",B3600140";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대동":
			crolling.area += ",B3600150";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장동":
			crolling.area += ",B3600180";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장1동":
			crolling.area += ",B3600160";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장2동":
			crolling.area += ",B3600170";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안중읍":
			crolling.area += ",B3600190";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BE%C8%C1%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("안중읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오성면":
			crolling.area += ",B3600200";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%C0%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("오성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용이동":
			crolling.area += ",B3600210";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%EB%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡동":
			crolling.area += ",B3600220";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천동":
			crolling.area += ",B3600230";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이충동":
			crolling.area += ",B3600240";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%CC%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장당동":
			crolling.area += ",B3600250";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%E5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			crolling.area += ",B3600260";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽백동":
			crolling.area += ",B3600270";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%D7%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산동":
			crolling.area += ",B3600280";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지제동":
			crolling.area += ",B3600290";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F6%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진위면":
			crolling.area += ",B3600300";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F8%C0%A7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진위면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청룡동":
			crolling.area += ",B3600310";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청북면":
			crolling.area += ",B3600320";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C3%BB%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("청북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠괴동":
			crolling.area += ",B3600330";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C4%A5%B1%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("칠괴동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠원동":
			crolling.area += ",B3600340";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C4%A5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("칠원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통복동":
			crolling.area += ",B3600350";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C5%EB%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팽성읍":
			crolling.area += ",B3600360";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%D8%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("팽성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평택동":
			crolling.area += ",B3600370";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%F2%C5%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평택동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포승읍":
			crolling.area += ",B3600380";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%F7%BD%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("포승읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합정동":
			crolling.area += ",B3600390";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C7%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("합정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현덕면":
			crolling.area += ",B3600400";
			wewe.area = "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C7%F6%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가산면":
			crolling.area += ",B3700010";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B0%A1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관인면":
			crolling.area += ",B3700020";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B0%FC%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("관인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포천시군내면":
			crolling.area += ",B3700030";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("포천시군내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내촌면":
			crolling.area += ",B3700040";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B3%BB%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동교동":
			crolling.area += ",B3700050";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B5%BF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선단동":
			crolling.area += ",B3700060";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%B1%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선단동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설운동":
			crolling.area += ",B3700070";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("설운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소흘읍":
			crolling.area += ",B3700080";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%D2%C8%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("소흘읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신북면":
			crolling.area += ",B3700090";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BD%C5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신읍동":
			crolling.area += ",B3700100";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BD%C5%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어룡동":
			crolling.area += ",B3700110";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BE%EE%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영북면":
			crolling.area += ",B3700120";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BF%B5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영중면":
			crolling.area += ",B3700130";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BF%B5%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영중면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동면":
			crolling.area += ",B3700140";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%CC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);	
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일동면":
			crolling.area += ",B3700150";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%CF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("일동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자작동":
			crolling.area += ",B3700160";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%DA%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창수면":
			crolling.area += ",B3700170";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C3%A2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("창수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포천동":
			crolling.area += ",B3700190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("포천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화현면":
			crolling.area += ",B3700180";
			wewe.area = "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C8%AD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감북동":
			crolling.area += ",B3800010";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감이동":
			crolling.area += ",B3800020";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감일동":
			crolling.area += ",B3800030";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("감일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광암동":
			crolling.area += ",B3800040";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B1%A4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("광암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교산동":
			crolling.area += ",B3800050";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B1%B3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당정동":
			crolling.area += ",B3800290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("당정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍동":
			crolling.area += ",B3800090";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍1동":
			crolling.area += ",B3800060";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕풍1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍2동":
			crolling.area += ",B3800070";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕풍2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍3동":
			crolling.area += ",B3800080";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("덕풍3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망월동":
			crolling.area += ",B3800100";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B8%C1%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미사동":
			crolling.area += ",B3800110";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B9%CC%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미사1동":
			crolling.area += ",B3800300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("미사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미사2동":
			crolling.area += ",B3800310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("미사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배알미동":
			crolling.area += ",B3800120";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B9%E8%BE%CB%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("배알미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상사창동":
			crolling.area += ",B3800130";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BB%F3%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상사창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상산곡동":
			crolling.area += ",B3800140";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BB%F3%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선동":
			crolling.area += ",B3800150";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남시신장동":
			crolling.area += ",B3800180";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하남시신장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남시신장1동":
			crolling.area += ",B3800160";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하남시신장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남시신장2동":
			crolling.area += ",B3800170";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하남시신장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			crolling.area += ",B3800320";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창우동":
			crolling.area += ",B3800190";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%A2%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천현동":
			crolling.area += ",B3800200";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%B5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초이동":
			crolling.area += ",B3800210";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%CA%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초일동":
			crolling.area += ",B3800220";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%CA%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘궁동":
			crolling.area += ",B3800230";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%E1%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("춘궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산동":
			crolling.area += ",B3800240";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%B3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하사창동":
			crolling.area += ",B3800250";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%CF%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하사창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하산곡동":
			crolling.area += ",B3800260";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%CF%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학암동":
			crolling.area += ",B3800270";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%D0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동":
			crolling.area += ",B3800280";
			wewe.area = "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",B3900520";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기배동":
			crolling.area += ",B3900430";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("기배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기산동":
			crolling.area += ",B3900010";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("기산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기안동":
			crolling.area += ",B3900020";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("기안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양읍":
			crolling.area += ",B3900030";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B3%B2%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("남양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능동":
			crolling.area += ",B3900040";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄1동":
			crolling.area += ",B3900440";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄2동":
			crolling.area += ",B3900450";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄3동":
			crolling.area += ",B3900460";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄4동":
			crolling.area += ",B3900470";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄5동":
			crolling.area += ",B3900530";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동틴6동":
			crolling.area += ",B3900540";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동틴6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄7동":
			crolling.area += ",B3900640";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄8동":
			crolling.area += ",B3900650";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동탄8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마도면":
			crolling.area += ",B3900060";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%B6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매송면":
			crolling.area += ",B3900070";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%C5%BC%DB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("매송면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",B3900550";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송동":
			crolling.area += ",B3900100";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",B3900110";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반정동":
			crolling.area += ",B3900120";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방교동":
			crolling.area += ",B3900560";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%E6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배양동":
			crolling.area += ",B3900130";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%E8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("배양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병점동":
			crolling.area += ",B3900140";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("병점동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병점1동":
			crolling.area += ",B3900570";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("병점1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병점2동":
			crolling.area += ",B3900580";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("병점2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉담읍":
			crolling.area += ",B3900150";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%C0%B4%E3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("봉담읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉면":
			crolling.area += ",B3900170";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%F1%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("비봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산척동":
			crolling.area += ",B3900590";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BB%EA%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "새솔동":
			crolling.area += ",B3900510";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BB%F5%BC%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("새솔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서신면":
			crolling.area += ",B3900180";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%AD%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석우동":
			crolling.area += ",B3900190";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%AE%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송동":
			crolling.area += ",B3900600";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",B3900210";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산면":
			crolling.area += ",B3900220";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("송산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",B3900610";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안녕동":
			crolling.area += ",B3900270";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BE%C8%B3%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안녕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양감면":
			crolling.area += ",B3900290";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BE%E7%B0%A8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양감면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영천동":
			crolling.area += ",B3900480";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성시오산동":
			crolling.area += ",B3900490";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화성시오산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우정읍":
			crolling.area += ",B3900310";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%EC%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("우정읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안면":
			crolling.area += ",B3900340";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C0%E5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			crolling.area += ",B3900620";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정남면":
			crolling.area += ",B3900360";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%A4%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성시중동":
			crolling.area += ",B3900360";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화성시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안동":
			crolling.area += ",B3900630";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%F8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("진안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성시청계동":
			crolling.area += ",B3900420";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화성시청계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔탄면":
			crolling.area += ",B3900380";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C6%C8%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("팔탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향남읍":
			crolling.area += ",B3900390";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C7%E2%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("향남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산동":
			crolling.area += ",B3900500";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황계동":
			crolling.area += ",B3900410";
			wewe.area = "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C8%B2%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
