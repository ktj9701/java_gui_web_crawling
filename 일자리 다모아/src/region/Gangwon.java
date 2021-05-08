package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Gangwon {
	public boolean flag;

	public void GangwonCity(ActionEvent e) {
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
		case "강동면":
			Albamoncrolling.area += ",A0100010";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강문동":
			Albamoncrolling.area += ",A0100020";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("강문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "견소동":
			Albamoncrolling.area += ",A0100030";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%DF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("견소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			Albamoncrolling.area += ",A0100060";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교1동":
			Albamoncrolling.area += ",A0100040";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교2동":
			Albamoncrolling.area += ",A0100050";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("교2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구정면":
			Albamoncrolling.area += ",A0100070";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B8%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("구정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금학동":
			Albamoncrolling.area += ",A0100080";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%DD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난곡동":
			Albamoncrolling.area += ",A0100090";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("난곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문동":
			Albamoncrolling.area += ",A0100100";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%B2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남항진동":
			Albamoncrolling.area += ",A0100110";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%B2%C7%D7%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남항진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			Albamoncrolling.area += ",A0100120";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노암동":
			Albamoncrolling.area += ",A0100130";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "담산동":
			Albamoncrolling.area += ",A0100140";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B4%E3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("담산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전동":
			Albamoncrolling.area += ",A0100150";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B4%EB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두산동":
			Albamoncrolling.area += ",A0100160";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B5%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("두산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명주동":
			Albamoncrolling.area += ",A0100170";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B8%ED%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박월동":
			Albamoncrolling.area += ",A0100180";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B9%DA%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("박월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병산동":
			Albamoncrolling.area += ",A0100190";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BA%B4%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("병산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사천면":
			Albamoncrolling.area += ",A0100200";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BB%E7%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			Albamoncrolling.area += ",A0100210";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			Albamoncrolling.area += ",A0100220";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산면":
			Albamoncrolling.area += ",A0100230";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("성산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			Albamoncrolling.area += ",A0100240";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신석동":
			Albamoncrolling.area += ",A0100250";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BD%C5%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안현동":
			Albamoncrolling.area += ",A0100260";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BE%C8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("안현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연곡면":
			Albamoncrolling.area += ",A0100270";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%AC%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("연곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥계면":
			Albamoncrolling.area += ",A0100280";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%C1%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("옥계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			Albamoncrolling.area += ",A0100290";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕산면":
			Albamoncrolling.area += ",A0100300";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%D5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("왕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			Albamoncrolling.area += ",A0100310";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운산동":
			Albamoncrolling.area += ",A0100320";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운정동":
			Albamoncrolling.area += ",A0100330";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월호평동":
			Albamoncrolling.area += ",A0100340";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%F9%C8%A3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("월호평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유산동":
			Albamoncrolling.area += ",A0100350";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%AF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천동":
			Albamoncrolling.area += ",A0100360";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("유천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임당동":
			Albamoncrolling.area += ",A0100370";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%D3%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("임당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입암동":
			Albamoncrolling.area += ",A0100380";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%D4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("입암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장현동":
			Albamoncrolling.area += ",A0100390";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%E5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동":
			Albamoncrolling.area += ",A0100400";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주문진읍":
			Albamoncrolling.area += ",A0100410";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%D6%B9%AE%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("주문진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽헌동":
			Albamoncrolling.area += ",A0100420";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%D7%C7%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽헌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지변동":
			Albamoncrolling.area += ",A0100430";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%F6%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청량동":
			Albamoncrolling.area += ",A0100440";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C3%BB%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초당동":
			Albamoncrolling.area += ",A0100450";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C3%CA%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포남동":
			Albamoncrolling.area += ",A0100480";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("포남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포남1동":
			Albamoncrolling.area += ",A0100460";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("포남1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포남2동":
			Albamoncrolling.area += ",A0100470";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("포남2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학동":
			Albamoncrolling.area += ",A0100490";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제동":
			Albamoncrolling.area += ",A0100500";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C8%AB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("홍제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회산동":
			Albamoncrolling.area += ",A0100510";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C8%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("회산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간성읍":
			Albamoncrolling.area += ",A0200010";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%A3%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("간성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거진읍":
			Albamoncrolling.area += ",A0200020";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%C5%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("거진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽왕면":
			Albamoncrolling.area += ",A0200030";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C1%D7%BF%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("죽왕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성면":
			Albamoncrolling.area += ",A0200040";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C5%E4%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("토성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현내면":
			Albamoncrolling.area += ",A0200050";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%F6%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴란동":
			Albamoncrolling.area += ",A0300010";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%AB%B6%F5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("괴란동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미동":
			Albamoncrolling.area += ",A0300020";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%B8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구호동":
			Albamoncrolling.area += ",A0300030";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%B8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀운동":
			Albamoncrolling.area += ",A0300040";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%CD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("귀운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나안동":
			Albamoncrolling.area += ",A0300050";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B3%AA%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("나안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			Albamoncrolling.area += ",A0300060";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단봉동":
			Albamoncrolling.area += ",A0300070";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%DC%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달방동":
			Albamoncrolling.area += ",A0300080";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%DE%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("달방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대구동":
			Albamoncrolling.area += ",A0300090";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%EB%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대진동":
			Albamoncrolling.area += ",A0300100";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%EB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동호동":
			Albamoncrolling.area += ",A0300110";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동회동":
			Albamoncrolling.area += ",A0300120";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B5%BF%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동회동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만우동":
			Albamoncrolling.area += ",A0300130";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B8%B8%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("만우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망상동":
			Albamoncrolling.area += ",A0300140";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B8%C1%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("망상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵호진동":
			Albamoncrolling.area += ",A0300150";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B9%AC%C8%A3%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("묵호진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "발한동":
			Albamoncrolling.area += ",A0300160";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B9%DF%C7%D1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("발한동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			Albamoncrolling.area += ",A0300170";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북평동":
			Albamoncrolling.area += ",A0300190";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%CF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("북평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비천동":
			Albamoncrolling.area += ",A0300200";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("비천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼화동":
			Albamoncrolling.area += ",A0300210";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BB%EF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동해시송정동":
			Albamoncrolling.area += ",A0300220";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동해시송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쇄운동":
			Albamoncrolling.area += ",A0300230";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BC%E2%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("쇄운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			Albamoncrolling.area += ",A0300240";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			Albamoncrolling.area += ",A0300250";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어달동":
			Albamoncrolling.area += ",A0300260";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BE%EE%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("어달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용정동":
			Albamoncrolling.area += ",A0300270";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이기동":
			Albamoncrolling.area += ",A0300280";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이도동":
			Albamoncrolling.area += ",A0300290";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이로동":
			Albamoncrolling.area += ",A0300300";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("이로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지가동":
			Albamoncrolling.area += ",A0300310";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C1%F6%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지흥동":
			Albamoncrolling.area += ",A0300320";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C1%F6%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("지흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천곡동":
			Albamoncrolling.area += ",A0300330";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%B5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("천곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초구동":
			Albamoncrolling.area += ",A0300340";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%CA%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("초구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추암동":
			Albamoncrolling.area += ",A0300350";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%DF%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("추암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평릉동":
			Albamoncrolling.area += ",A0300360";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C6%F2%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호현동":
			Albamoncrolling.area += ",A0300370";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C8%A3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("호현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효가동":
			Albamoncrolling.area += ",A0300380";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C8%BF%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가곡면":
			Albamoncrolling.area += ",A0400010";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("가곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈천동":
			Albamoncrolling.area += ",A0400020";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%A5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("갈천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건지동":
			Albamoncrolling.area += ",A0400030";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%C7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("건지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼척시교동":
			Albamoncrolling.area += ",A0400040";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼척시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근덕면":
			Albamoncrolling.area += ",A0400050";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%D9%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("근덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근산동":
			Albamoncrolling.area += ",A0400060";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("근산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양동":
			Albamoncrolling.area += ",A0400070";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("남양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노곡면":
			Albamoncrolling.area += ",A0400080";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B3%EB%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("노곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당저동":
			Albamoncrolling.area += ",A0400090";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B4%E7%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("당저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도경동":
			Albamoncrolling.area += ",A0400100";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%B5%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도계읍":
			Albamoncrolling.area += ",A0400110";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%B5%B0%E8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("도계읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등봉동":
			Albamoncrolling.area += ",A0400120";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%EE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("등봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마달동":
			Albamoncrolling.area += ",A0400130";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B8%B6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마평동":
			Albamoncrolling.area += ",A0400140";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B8%B6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("마평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미로면":
			Albamoncrolling.area += ",A0400150";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B9%CC%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			Albamoncrolling.area += ",A0400160";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼척시성남동":
			Albamoncrolling.area += ",A0400170";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼척시성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼척시성내동":
			Albamoncrolling.area += ",A0400180";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼척시성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			Albamoncrolling.area += ",A0400190";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기면":
			Albamoncrolling.area += ",A0400200";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BD%C5%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오분동":
			Albamoncrolling.area += ",A0400210";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%C0%BA%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오분동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오사동":
			Albamoncrolling.area += ",A0400220";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%C0%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("오사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우지동":
			Albamoncrolling.area += ",A0400230";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%EC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			Albamoncrolling.area += ",A0400240";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원덕읍":
			Albamoncrolling.area += ",A0400250";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%F8%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("원덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍상동":
			Albamoncrolling.area += ",A0400260";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%BE%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("읍상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍중동":
			Albamoncrolling.area += ",A0400270";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%BE%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("읍중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자원동":
			Albamoncrolling.area += ",A0400280";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%DA%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("자원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적노동":
			Albamoncrolling.area += ",A0400290";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%FB%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("적노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정상동":
			Albamoncrolling.area += ",A0400300";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정하동":
			Albamoncrolling.area += ",A0400310";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("정하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조비동":
			Albamoncrolling.area += ",A0400320";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%B6%BA%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조비동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증산동":
			Albamoncrolling.area += ",A0400330";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("증산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평전동":
			Albamoncrolling.area += ",A0400340";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C6%F2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하장면":
			Albamoncrolling.area += ",A0400350";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C7%CF%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속초시교동":
			Albamoncrolling.area += ",A0500010";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("속초시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동":
			Albamoncrolling.area += ",A0500020";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노학동":
			Albamoncrolling.area += ",A0500030";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B3%EB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("노학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			Albamoncrolling.area += ",A0500040";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도문동":
			Albamoncrolling.area += ",A0500050";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B5%B5%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("도문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동명동":
			Albamoncrolling.area += ",A0500060";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B5%BF%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설악동":
			Albamoncrolling.area += ",A0500070";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%BC%B3%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("설악동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영랑동":
			Albamoncrolling.area += ",A0500080";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%BF%B5%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("영랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장사동":
			Albamoncrolling.area += ",A0500090";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조양동":
			Albamoncrolling.area += ",A0500100";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			Albamoncrolling.area += ",A0500110";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			Albamoncrolling.area += ",A0500120";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청호동":
			Albamoncrolling.area += ",A0500130";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C3%BB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("청호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			Albamoncrolling.area += ",A0600010";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동면":
			Albamoncrolling.area += ",A0600020";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산면":
			Albamoncrolling.area += ",A0600030";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B9%E6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("방산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양구읍":
			Albamoncrolling.area += ",A0600040";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%BE%E7%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("양구읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안면":
			Albamoncrolling.area += ",A0600050";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%C7%D8%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("해안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강현면":
			Albamoncrolling.area += ",A0700010";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%B0%AD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			Albamoncrolling.area += ",A0700020";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "손양면":
			Albamoncrolling.area += ",A0700030";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BC%D5%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("손양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양양읍":
			Albamoncrolling.area += ",A0700040";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BE%E7%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("양양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현남면":
			Albamoncrolling.area += ",A0700050";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%C7%F6%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현북면":
			Albamoncrolling.area += ",A0700060";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%C7%F6%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("현북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김삿갓면":
			Albamoncrolling.area += ",A0800090";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%B1%E8%BB%F1%B0%AB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("김삿갓면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영월군남면":
			Albamoncrolling.area += ",A0800010";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("영월군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무릉도원면":
			Albamoncrolling.area += ",A0800050";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("무릉도원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			Albamoncrolling.area += ",A0800020";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동읍":
			Albamoncrolling.area += ",A0800030";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BB%F3%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("상동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영월읍":
			Albamoncrolling.area += ",A0800060";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BF%B5%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("영월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주천면":
			Albamoncrolling.area += ",A0800070";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("주천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동면":
			Albamoncrolling.area += ",A0800080";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C1%DF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("중동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한반도면":
			Albamoncrolling.area += ",A0800040";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C7%D1%B9%DD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("한반도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가현동":
			Albamoncrolling.area += ",A0900010";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%A1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("가현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개운동":
			Albamoncrolling.area += ",A0900020";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("개운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관설동":
			Albamoncrolling.area += ",A0900030";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%FC%BC%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("관설동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀래면":
			Albamoncrolling.area += ",A0900040";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B1%CD%B7%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("귀래면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단계동":
			Albamoncrolling.area += ",A0900050";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B4%DC%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단구동":
			Albamoncrolling.area += ",A0900060";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B4%DC%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("단구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			Albamoncrolling.area += ",A0900090";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜1동":
			Albamoncrolling.area += ",A0900070";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명륜1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜2동":
			Albamoncrolling.area += ",A0900080";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("명륜2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무실동":
			Albamoncrolling.area += ",A0900100";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%AB%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("무실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문막읍":
			Albamoncrolling.area += ",A0900110";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%AE%B8%B7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("문막읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반곡동":
			Albamoncrolling.area += ",A0900120";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("반곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			Albamoncrolling.area += ",A0900130";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부론면":
			Albamoncrolling.area += ",A0900140";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BA%CE%B7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("부론면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소초면":
			Albamoncrolling.area += ",A0900150";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BC%D2%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("소초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신림면":
			Albamoncrolling.area += ",A0900160";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BD%C5%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우산동":
			Albamoncrolling.area += ",A0900170";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			Albamoncrolling.area += ",A0900180";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인동":
			Albamoncrolling.area += ",A0900190";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산동":
			Albamoncrolling.area += ",A0900200";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C0%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("일산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원주시중앙동":
			Albamoncrolling.area += ",A0900210";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("주앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지정면":
			Albamoncrolling.area += ",A0900220";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C1%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("지정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장동":
			Albamoncrolling.area += ",A0900250";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장1동":
			Albamoncrolling.area += ",A0900230";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장2동":
			Albamoncrolling.area += ",A0900240";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판부면":
			Albamoncrolling.area += ",A0900260";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C6%C7%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("판부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평원동":
			Albamoncrolling.area += ",A0900270";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C6%F2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("평원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학성동":
			Albamoncrolling.area += ",A0900280";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C7%D0%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("학성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행구동":
			Albamoncrolling.area += ",A0900290";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C7%E0%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("행구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호저면":
			Albamoncrolling.area += ",A0900300";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C8%A3%C0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("호저면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥업면":
			Albamoncrolling.area += ",A0900310";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C8%EF%BE%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("흥업면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기린면":
			Albamoncrolling.area += ",A1000010";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%B1%E2%B8%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("기리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제군남면":
			Albamoncrolling.area += ",A1000020";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("인제군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제군북면":
			Albamoncrolling.area += ",A1000030";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("인제군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상남면":
			Albamoncrolling.area += ",A1000040";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BB%F3%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서화면":
			Albamoncrolling.area += ",A1000050";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BC%AD%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제읍":
			Albamoncrolling.area += ",A1000060";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%C0%CE%C1%A6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("인제읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고한읍":
			Albamoncrolling.area += ",A1100010";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%B0%ED%C7%D1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("고한읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정선군남면":
			Albamoncrolling.area += ",A1100020";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("정선군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북평면":
			Albamoncrolling.area += ",A1100050";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BA%CF%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사북읍":
			Albamoncrolling.area += ",A1100060";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BB%E7%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("사북읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동읍":
			Albamoncrolling.area += ",A1100070";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BD%C5%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("신동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여량면":
			Albamoncrolling.area += ",A1100040";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BF%A9%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("여량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임계면":
			Albamoncrolling.area += ",A1100080";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C0%D3%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("임계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정선읍":
			Albamoncrolling.area += ",A1100090";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C1%A4%BC%B1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("정선읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화암면":
			Albamoncrolling.area += ",A1100030";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C8%AD%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈말읍":
			Albamoncrolling.area += ",A1200010";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B0%A5%B8%BB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("갈말읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근남면":
			Albamoncrolling.area += ",A1200020";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%D9%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("근남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근북면":
			Albamoncrolling.area += ",A1200030";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%D9%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("근북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김화읍":
			Albamoncrolling.area += ",A1200040";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%E8%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("김화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동송읍":
			Albamoncrolling.area += ",A1200050";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B5%BF%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("동송읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철원군서면":
			Albamoncrolling.area += ",A1200060";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("철원군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철원읍":
			Albamoncrolling.area += ",A1200070";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%C3%B6%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("철원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시교동":
			Albamoncrolling.area += ",A1300010";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("춘천시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근화동":
			Albamoncrolling.area += ",A1300020";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B1%D9%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("근화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			Albamoncrolling.area += ",A1300030";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시남면":
			Albamoncrolling.area += ",A1300040";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("춘천시남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산면":
			Albamoncrolling.area += ",A1300050";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("남산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동내면":
			Albamoncrolling.area += ",A1300060";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시동면":
			Albamoncrolling.area += ",A1300070";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("춘천시동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산면":
			Albamoncrolling.area += ",A1300080";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("동산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉의동":
			Albamoncrolling.area += ",A1300090";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BA%C0%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("봉의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북산면":
			Albamoncrolling.area += ",A1300100";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BA%CF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사농동":
			Albamoncrolling.area += ",A1300110";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%E7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("사농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사북면":
			Albamoncrolling.area += ",A1300120";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%E7%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동":
			Albamoncrolling.area += ",A1300130";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%EF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시서면":
			Albamoncrolling.area += ",A1300140";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("춘천시서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석사동":
			Albamoncrolling.area += ",A1300150";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%AE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("석사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로1가":
			Albamoncrolling.area += ",A1300160";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("소양로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로2가":
			Albamoncrolling.area += ",A1300170";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("소양로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로3가":
			Albamoncrolling.area += ",A1300180";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("소양로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로4가":
			Albamoncrolling.area += ",A1300190";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("소양로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송암동":
			Albamoncrolling.area += ",A1300200";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%DB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("송암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			Albamoncrolling.area += ",A1300210";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동면":
			Albamoncrolling.area += ",A1300220";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("신동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신북읍":
			Albamoncrolling.area += ",A1300230";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("신북읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약사동":
			Albamoncrolling.area += ",A1300240";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BE%E0%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("약사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시옥천동":
			Albamoncrolling.area += ",A1300250";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("춘천시옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온의동":
			Albamoncrolling.area += ",A1300260";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%C2%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("온의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "요선동":
			Albamoncrolling.area += ",A1300270";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%E4%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("요선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우두동":
			Albamoncrolling.area += ",A1300280";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%EC%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("우두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운교동":
			Albamoncrolling.area += ",A1300290";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%EE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("운교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시조양동":
			Albamoncrolling.area += ",A1300300";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("춘천시조양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			Albamoncrolling.area += ",A1300310";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중도동":
			Albamoncrolling.area += ",A1300320";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("중도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로1가":
			Albamoncrolling.area += ",A1300330";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로2가":
			Albamoncrolling.area += ",A1300340";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로3가":
			Albamoncrolling.area += ",A1300350";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("중앙로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠전동":
			Albamoncrolling.area += ",A1300360";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C4%A5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("칠전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴계동":
			Albamoncrolling.area += ",A1300370";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C5%F0%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("퇴계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			Albamoncrolling.area += ",A1300410";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자1동":
			Albamoncrolling.area += ",A1300380";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자2동":
			Albamoncrolling.area += ",A1300390";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자3동":
			Albamoncrolling.area += ",A1300400";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("효자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평동":
			Albamoncrolling.area += ",A1300450";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("후평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평1동":
			Albamoncrolling.area += ",A1300420";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("후평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평2동":
			Albamoncrolling.area += ",A1300430";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("후평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평3동":
			Albamoncrolling.area += ",A1300440";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("후평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구문소동":
			Albamoncrolling.area += ",A1400010";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B1%B8%B9%AE%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("구문소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천동":
			Albamoncrolling.area += ",A1400020";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B1%DD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("금천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동점동":
			Albamoncrolling.area += ",A1400030";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B5%BF%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("동점동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문곡동":
			Albamoncrolling.area += ",A1400040";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B9%AE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("문곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백산동":
			Albamoncrolling.area += ",A1400050";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B9%E9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("백산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼수동":
			Albamoncrolling.area += ",A1400060";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%EF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("삼수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상사미동":
			Albamoncrolling.area += ",A1400070";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%F3%BB%E7%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상사미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상장동":
			Albamoncrolling.area += ",A1400080";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%F3%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("상장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소도동":
			Albamoncrolling.area += ",A1400090";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BC%D2%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("소도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태백시원동":
			Albamoncrolling.area += ",A1400100";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("태백시원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성동":
			Albamoncrolling.area += ",A1400110";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("장성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적각동":
			Albamoncrolling.area += ",A1400120";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C0%FB%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("적각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조탄동":
			Albamoncrolling.area += ",A1400130";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C1%B6%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("조탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창죽동":
			Albamoncrolling.area += ",A1400140";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C3%A2%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("창죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철암동":
			Albamoncrolling.area += ",A1400150";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C3%B6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("철암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통동":
			Albamoncrolling.area += ",A1400160";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하사미동":
			Albamoncrolling.area += ",A1400170";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C7%CF%BB%E7%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("하사미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "혈동":
			Albamoncrolling.area += ",A1400180";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C7%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("혈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			Albamoncrolling.area += ",A1400190";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황연동":
			Albamoncrolling.area += ",A1400200";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%B2%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황지동":
			Albamoncrolling.area += ",A1400210";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%B2%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("황지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대관령면":
			Albamoncrolling.area += ",A1500020";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B4%EB%B0%FC%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대관령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대화면":
			Albamoncrolling.area += ",A1500010";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B4%EB%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("대화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미탄면":
			Albamoncrolling.area += ",A1500030";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B9%CC%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("미탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방림면":
			Albamoncrolling.area += ",A1500040";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B9%E6%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("방림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉평면":
			Albamoncrolling.area += ",A1500050";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%BA%C0%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("봉평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용평면":
			Albamoncrolling.area += ",A1500060";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%BF%EB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("용평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진부면":
			Albamoncrolling.area += ",A1500070";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%C1%F8%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("진부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평창읍":
			Albamoncrolling.area += ",A1500080";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%C6%F2%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("평창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천군남면":
			Albamoncrolling.area += ",A1600010";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("홍천군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내면":
			Albamoncrolling.area += ",A1600020";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내촌면":
			Albamoncrolling.area += ",A1600030";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%BB%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("내촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천군동면":
			Albamoncrolling.area += ",A1600040";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("홍천군동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두촌면":
			Albamoncrolling.area += ",A1600050";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B5%CE%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("두촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북방면":
			Albamoncrolling.area += ",A1600060";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BA%CF%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("북방면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천군서면":
			Albamoncrolling.area += ",A1600070";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("홍천군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서석면":
			Albamoncrolling.area += ",A1600080";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BC%AD%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서석면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천읍":
			Albamoncrolling.area += ",A1600090";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%C8%AB%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("홍천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화촌면":
			Albamoncrolling.area += ",A1600100";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%C8%AD%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("화촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간동면":
			Albamoncrolling.area += ",A1700010";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%B0%A3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("간동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사내면":
			Albamoncrolling.area += ",A1700020";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%BB%E7%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("사내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상서면":
			Albamoncrolling.area += ",A1700030";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%BB%F3%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("상서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남면":
			Albamoncrolling.area += ",A1700040";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%C7%CF%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("하남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화천읍":
			Albamoncrolling.area += ",A1700050";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%C8%AD%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("화천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갑천면":
			Albamoncrolling.area += ",A1800010";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%A9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("갑천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강림면":
			Albamoncrolling.area += ",A1800020";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%AD%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("강림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공근면":
			Albamoncrolling.area += ",A1800030";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%F8%B1%D9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("공근면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔내면":
			Albamoncrolling.area += ",A1800040";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B5%D0%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("둔내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서원면":
			Albamoncrolling.area += ",A1800050";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BC%AD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("서원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥면":
			Albamoncrolling.area += ",A1800060";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BE%C8%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("안흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우천면":
			Albamoncrolling.area += ",A1800070";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BF%EC%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("우천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청일면":
			Albamoncrolling.area += ",A1800080";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%C3%BB%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("청일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "횡성읍":
			Albamoncrolling.area += ",A1800090";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%C8%BE%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("횡성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
