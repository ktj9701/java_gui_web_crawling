package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Chungbuk {
	public boolean flag;

	public void ChungbukCity(ActionEvent e) {
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
		case "감물면":
			crolling.area += ",P0100010";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B0%A8%B9%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("감물면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴산읍":
			crolling.area += ",P0100020";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B1%AB%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("괴산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문광면":
			crolling.area += ",P0100030";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B9%AE%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불정면":
			crolling.area += ",P0100040";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BA%D2%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("불정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사리면":
			crolling.area += ",P0100050";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BB%E7%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소수면":
			crolling.area += ",P0100060";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BC%D2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연풍면":
			crolling.area += ",P0100070";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BF%AC%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("연풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장연면":
			crolling.area += ",P0100080";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C0%E5%BF%AC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장연면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청안면":
			crolling.area += ",P0100090";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C3%BB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청천면":
			crolling.area += ",P0100100";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C3%BB%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠성면":
			crolling.area += ",P0100110";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C4%A5%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("칠성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가곡면":
			crolling.area += ",P0200010";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B0%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단성면":
			crolling.area += ",P0200020";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%DC%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("단성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단양읍":
			crolling.area += ",P0200030";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%DC%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("단양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대강면":
			crolling.area += ",P0200040";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%EB%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매포읍":
			crolling.area += ",P0200050";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B8%C5%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("매포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어상천면":
			crolling.area += ",P0200060";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%BE%EE%BB%F3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("어상천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영춘면":
			crolling.area += ",P0200070";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%BF%B5%C3%E1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영춘면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적성면":
			crolling.area += ",P0200080";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("적성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내북면":
			crolling.area += ",P0300010";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%B3%BB%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마로면":
			crolling.area += ",P0300030";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%B8%B6%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("마로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보은읍":
			crolling.area += ",P0300040";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BA%B8%C0%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("보은읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산외면":
			crolling.area += ",P0300050";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼승면":
			crolling.area += ",P0300060";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BB%EF%BD%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼승면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속리산면":
			crolling.area += ",P0300020";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BC%D3%B8%AE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("속리산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수한면":
			crolling.area += ",P0300070";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BC%F6%C7%D1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수한면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안면":
			crolling.area += ",P0300085";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C0%E5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("장안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄부면":
			crolling.area += ",P0300090";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C5%BA%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("탄부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회남면":
			crolling.area += ",P0300100";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C8%B8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("회남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회북면":
			crolling.area += ",P0300110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("회북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매곡면":
			crolling.area += ",P0400010";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%B8%C5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("매곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상촌면":
			crolling.area += ",P0400020";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BB%F3%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심천면":
			crolling.area += ",P0400030";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BD%C9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("심천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양강면":
			crolling.area += ",P0400040";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BE%E7%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양산면":
			crolling.area += ",P0400050";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BE%E7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("양산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동읍":
			crolling.area += ",P0400060";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%B5%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("영동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산면":
			crolling.area += ",P0400070";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용화면":
			crolling.area += ",P0400080";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%EB%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추풍령면":
			crolling.area += ",P0400090";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C3%DF%C7%B3%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("추풍령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학산면":
			crolling.area += ",P0400100";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C7%D0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("학산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황간면":
			crolling.area += ",P0400110";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C8%B2%B0%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("황간면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군북면":
			crolling.area += ",P0500010";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B1%BA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군서면":
			crolling.area += ",P0500020";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동이면":
			crolling.area += ",P0500030";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B5%BF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안남면":
			crolling.area += ",P0500040";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BE%C8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안내면":
			crolling.area += ",P0500050";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BE%C8%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천읍":
			crolling.area += ",P0500060";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BF%C1%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("옥천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이원면":
			crolling.area += ",P0500070";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C0%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청산면":
			crolling.area += ",P0500080";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청성면":
			crolling.area += ",P0500090";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C3%BB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감곡면":
			crolling.area += ",P0600020";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B0%A8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("감곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금왕읍":
			crolling.area += ",P0600030";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B1%DD%BF%D5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("금왕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대소면":
			crolling.area += ",P0600040";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B4%EB%BC%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대소면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "맹동면":
			crolling.area += ",P0600050";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B8%CD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("맹동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성면":
			crolling.area += ",P0600060";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BB%EF%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("삼성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생극면":
			crolling.area += ",P0600070";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BB%FD%B1%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("생극면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소이면":
			crolling.area += ",P0600080";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BC%D2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원남면":
			crolling.area += ",P0600090";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BF%F8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("원남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "음성읍":
			crolling.area += ",P0600100";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%C0%BD%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("음성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강제동":
			crolling.area += ",P0700010";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%AD%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고명동":
			crolling.area += ",P0700020";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%ED%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고암동":
			crolling.area += ",P0700030";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("고암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",P0700040";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",P0700050";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남천동":
			crolling.area += ",P0700060";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B3%B2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대량동":
			crolling.area += ",P0700070";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B4%EB%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산면":
			crolling.area += ",P0700080";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B4%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("덕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동현동":
			crolling.area += ",P0700090";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B5%BF%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두학동":
			crolling.area += ",P0700100";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B5%CE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동":
			crolling.area += ",P0700110";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명지동":
			crolling.area += ",P0700120";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%ED%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모산동":
			crolling.area += ",P0700130";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운면":
			crolling.area += ",P0700140";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B9%E9%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉양읍":
			crolling.area += ",P0700150";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BA%C0%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("봉양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			crolling.area += ",P0700160";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서부동":
			crolling.area += ",P0700170";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%AD%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학면":
			crolling.area += ",P0700180";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%DB%C7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("송학면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수산면":
			crolling.area += ",P0700190";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",P0700200";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신백동":
			crolling.area += ",P0700210";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",P0700220";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영천동":
			crolling.area += ",P0700230";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕암동":
			crolling.area += ",P0700240";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BF%D5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("왕암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의림동":
			crolling.area += ",P0700260";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%C7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("의림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자작동":
			crolling.area += ",P0700270";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%DA%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장락동":
			crolling.area += ",P0700280";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%E5%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로1가":
			crolling.area += ",P0700290";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로2가":
			crolling.area += ",P0700300";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천남동":
			crolling.area += ",P0700310";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청전동":
			crolling.area += ",P0700320";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%BB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청풍면":
			crolling.area += ",P0700330";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%BB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하소동":
			crolling.area += ",P0700340";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C7%CF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한수면":
			crolling.area += ",P0700350";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C7%D1%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산동":
			crolling.area += ",P0700360";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑석동":
			crolling.area += ",P0700370";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("흑석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도안면":
			crolling.area += ",P1300010";
			wewe.area = "043%7C%7C%C1%F5%C6%F2%B1%BA%7C%7C%B5%B5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("도안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증평읍":
			crolling.area += ",P1300020";
			wewe.area = "043%7C%7C%C1%F5%C6%F2%B1%BA%7C%7C%C1%F5%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("증평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광혜원면":
			crolling.area += ",P0800010";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B1%A4%C7%FD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("광혜원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진천군덕산면":
			crolling.area += ",P0800020";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B4%F6%BB%EA%B8%E9%";
			Mainpage.Filtering[Mainpage.index].setText("진천군덕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문백면":
			crolling.area += ",P0800030";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B9%AE%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백곡면":
			crolling.area += ",P0800040";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B9%E9%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("백곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이월면":
			crolling.area += ",P0800050";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C0%CC%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("이월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진천읍":
			crolling.area += ",P0800060";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C1%F8%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("진천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초평면":
			crolling.area += ",P0800070";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C3%CA%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가덕면":
			crolling.area += ",P1000440";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B0%A1%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천동":
			crolling.area += ",P1000010";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B1%DD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문로1가":
			crolling.area += ",P1000020";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문로2가":
			crolling.area += ",P1000030";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("남문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남일면":
			crolling.area += ",P1000450";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남주동":
			crolling.area += ",P1000040";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낭성면":
			crolling.area += ",P1000460";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("낭성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",P1000080";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명암동":
			crolling.area += ",P1000090";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B8%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문의면":
			crolling.area += ",P1000470";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%AE%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("문의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			crolling.area += ",P1000100";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미원면":
			crolling.area += ",P1000480";
			wewe.area = "43%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방서동":
			crolling.area += ",P1000110";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%E6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("방서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문로1가":
			crolling.area += ",P1000120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문로2가":
			crolling.area += ",P1000130";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문로3가":
			crolling.area += ",P1000140";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("북문로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			crolling.area += ",P1000160";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서문동":
			crolling.area += ",P1000170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서운동":
			crolling.area += ",P1000180";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석교동":
			crolling.area += ",P1000190";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성안동":
			crolling.area += ",P1000490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동":
			crolling.area += ",P1000200";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",P1000210";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영운동":
			crolling.area += ",P1000220";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%B5%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담.명암.산성동":
			crolling.area += ",P1000500";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용담.명암.산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용담동":
			crolling.area += ",P1000270";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암동":
			crolling.area += ",P1000300";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암1동":
			crolling.area += ",P1000280";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암2동":
			crolling.area += ",P1000290";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용정동":
			crolling.area += ",P1000310";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운동동":
			crolling.area += ",P1000330";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월오동":
			crolling.area += ",P1000340";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%F9%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",P1000510";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지북동":
			crolling.area += ",P1000410";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C1%F6%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑.대성동":
			crolling.area += ",P1000520";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("탑.대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			crolling.area += ",P1000420";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평촌동":
			crolling.area += ",P1000430";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개신동":
			crolling.area += ",P1400010";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B0%B3%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남이면":
			crolling.area += ",P1400020";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B3%B2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모충동":
			crolling.area += ",P1400030";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B8%F0%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("모충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미평동":
			crolling.area += ",P1400040";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B9%CC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("미평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "분평동":
			crolling.area += ",P1400050";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BA%D0%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("분평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",P1400060";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직1동":
			crolling.area += ",P1400070";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직2동":
			crolling.area += ",P1400080";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사창동":
			crolling.area += ",P1400090";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산남동":
			crolling.area += ",P1400100";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%EA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성화.개신.죽림동":
			crolling.area += ",P1400110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성화.개신.죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성화동":
			crolling.area += ",P1400120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%BA%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡동":
			crolling.area += ",P1400130";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡1동":
			crolling.area += ",P1400140";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡2동":
			crolling.area += ",P1400150";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성동":
			crolling.area += ",P1400160";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장암동":
			crolling.area += ",P1400170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C0%E5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",P1400180";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현도면":
			crolling.area += ",P1400190";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C7%F6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕동":
			crolling.area += ",P0900150";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕1동":
			crolling.area += ",P0900160";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내덕2동":
			crolling.area += ",P0900170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내수읍":
			crolling.area += ",P0900070";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("내수읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북이면":
			crolling.area += ",P0900110";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BA%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사천동":
			crolling.area += ",P0900180";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BB%E7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오근장동":
			crolling.area += ",P0900190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오근장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오동동":
			crolling.area += ",P0900200";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%C0%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오창읍":
			crolling.area += ",P0900120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%C0%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("오창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외남동":
			crolling.area += ",P0900210";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외평동":
			crolling.area += ",P0900220";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외하동":
			crolling.area += ",P0900230";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우암동":
			crolling.area += ",P0900240";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%EC%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율량.사천동":
			crolling.area += ",P0900250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("율량.사천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율량동":
			crolling.area += ",P0900260";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C0%B2%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("율량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정북동":
			crolling.area += ",P0900270";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정상동":
			crolling.area += ",P0900280";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정하동":
			crolling.area += ",P0900290";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주성동":
			crolling.area += ",P0900300";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주중동":
			crolling.area += ",P0900310";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%D6%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가경동":
			crolling.area += ",P1100010";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%A1%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강내면":
			crolling.area += ",P1100540";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강서동":
			crolling.area += ",P1100040";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강서1동":
			crolling.area += ",P1100020";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강서2동":
			crolling.area += ",P1100030";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오송읍":
			crolling.area += ",P1100550";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%C0%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("오송읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남촌동":
			crolling.area += ",P1100060";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B3%B2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			crolling.area += ",P1100070";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동막동":
			crolling.area += ",P1100080";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B5%BF%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동막동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문암동":
			crolling.area += ",P1100100";
			wewe.area = "43%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B9%AE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복대읍":
			crolling.area += ",P1100140";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복대읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복대1동":
			crolling.area += ",P1100120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복대1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복대2동":
			crolling.area += ",P1100130";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("복대2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명동":
			crolling.area += ",P1100170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명1동":
			crolling.area += ",P1100150";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%C0%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명2.송정동":
			crolling.area += ",P1100160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉명2.송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비하동":
			crolling.area += ",P1100190";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%F1%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상신동":
			crolling.area += ",P1100250";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BB%F3%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서촌동":
			crolling.area += ",P1100260";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("서촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석곡동":
			crolling.area += ",P1100270";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석소동":
			crolling.area += ",P1100280";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AE%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송절동":
			crolling.area += ",P1100300";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%DB%C0%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송절동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",P1100310";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수의동":
			crolling.area += ",P1100350";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%F6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("수의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대동":
			crolling.area += ",P1100360";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신봉동":
			crolling.area += ",P1100370";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신성동":
			crolling.area += ",P1100380";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신전동":
			crolling.area += ",P1100390";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",P1100400";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산면":
			crolling.area += ",P1100560";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외북동":
			crolling.area += ",P1100410";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%DC%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("외북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운천.신봉동":
			crolling.area += ",P1100570";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운천.신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운천동":
			crolling.area += ",P1100420";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%EE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원평동":
			crolling.area += ",P1100430";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정봉동":
			crolling.area += ",P1100460";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C1%A4%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지동동":
			crolling.area += ",P1100480";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C1%F6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",P1100490";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향정동":
			crolling.area += ",P1100500";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C7%E2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("향정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현암동":
			crolling.area += ",P1100510";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C7%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("현암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화계동":
			crolling.area += ",P1100520";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C8%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴암동":
			crolling.area += ",P1100530";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C8%DE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("휴암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가주동":
			crolling.area += ",P1200020";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B0%A1%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교현동":
			crolling.area += ",P1200050";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교현1동":
			crolling.area += ",P1200030";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교현2동":
			crolling.area += ",P1200040";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금가면":
			crolling.area += ",P1200060";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%DD%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("금가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금능동":
			crolling.area += ",P1200070";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%DD%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노은면":
			crolling.area += ",P1200080";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B3%EB%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("노은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단월동":
			crolling.area += ",P1200090";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%DC%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달천동":
			crolling.area += ",P1200100";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%DE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("달천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대소원면":
			crolling.area += ",P1200320";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%EB%BC%D2%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대소원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동량면":
			crolling.area += ",P1200110";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B5%BF%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목벌동":
			crolling.area += ",P1200120";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B8%F1%B9%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목벌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목행동":
			crolling.area += ",P1200130";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B8%F1%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("목행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충주시문화동":
			crolling.area += ",P1200140";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충주시문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉방동":
			crolling.area += ",P1200150";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BA%C0%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산척면":
			crolling.area += ",P1200160";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BB%EA%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("산척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "살미면":
			crolling.area += ",P1200170";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BB%EC%B9%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("살미면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",P1200180";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			crolling.area += ",P1200190";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성서동":
			crolling.area += ",P1200200";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소태면":
			crolling.area += ",P1200210";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%D2%C5%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소태면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수안보면":
			crolling.area += ",P1200220";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%F6%BE%C8%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("수안보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신니면":
			crolling.area += ",P1200230";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BD%C5%B4%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신니면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안림동":
			crolling.area += ",P1200240";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%C8%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "앙성면":
			crolling.area += ",P1200250";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%D3%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("앙성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄정면":
			crolling.area += ",P1200260";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("엄정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연수동":
			crolling.area += ",P1200270";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%AC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("연수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용관동":
			crolling.area += ",P1200280";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",P1200290";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",P1200300";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용탄동":
			crolling.area += ",P1200310";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종민동":
			crolling.area += ",P1200330";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%BE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("종민동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주덕읍":
			crolling.area += ",P1200340";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%D6%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("주덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙탑면":
			crolling.area += ",P1200010";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%C5%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("중앙탑면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지현동":
			crolling.area += ",P1200350";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%F6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직동":
			crolling.area += ",P1200360";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충의동":
			crolling.area += ",P1200370";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C3%E6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충인동":
			crolling.area += ",P1200380";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C3%E6%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("충인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠금동":
			crolling.area += ",P1200390";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C4%A5%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("칠금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍동":
			crolling.area += ",P1200400";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호암동":
			crolling.area += ",P1200410";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C8%A3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}