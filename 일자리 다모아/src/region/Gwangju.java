package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;

public class Gwangju {
	public boolean flag;

	public void GwangjuCity(ActionEvent e) {
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
		case "고룡동":
			crolling.area += ",E0100010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("고룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광산동":
			crolling.area += ",E0100020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("광산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			crolling.area += ",E0100030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내산동":
			crolling.area += ",E0100040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대산동":
			crolling.area += ",E0100050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕림동":
			crolling.area += ",E0100060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도덕동":
			crolling.area += ",E0100070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도산동":
			crolling.area += ",E0100080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도천동":
			crolling.area += ",E0100090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도호동":
			crolling.area += ",I0100100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동림동":
			crolling.area += ",E0100110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			crolling.area += ",E0100120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동호동":
			crolling.area += ",E0100130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두정동":
			crolling.area += ",E0100140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등임동":
			crolling.area += ",E0100150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("등임동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명도동":
			crolling.area += ",E0100160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("명도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명화동":
			crolling.area += "E0100170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("명화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박호동":
			crolling.area += ",E0100180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("박호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복룡동":
			crolling.area += ",E0100190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("복룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본덕동":
			crolling.area += ",E0100200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("본덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북산동":
			crolling.area += ",E0100210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비아동":
			crolling.area += ",E0100220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("비아동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사호동":
			crolling.area += ",E0100230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산막동":
			crolling.area += ",E0100240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산막동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산수동":
			crolling.area += ",E0100250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산월동":
			crolling.area += ",E0100260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정동":
			crolling.area += ",E0100270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼도동":
			crolling.area += ",E0100280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼거동":
			crolling.area += ",E0100290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서봉동":
			crolling.area += ",E0100300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선동":
			crolling.area += ",E0100310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선임동":
			crolling.area += ",E0100320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("선임동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소촌동":
			crolling.area += ",E0100330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송대동":
			crolling.area += ",E0100340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",E0100350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정1동":
			crolling.area += ",E0100360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정2동":
			crolling.area += ",E0100370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",E0100380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송촌동":
			crolling.area += ",E0100390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송치동":
			crolling.area += ",E0100400";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송학동":
			crolling.area += ",E0100410";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수완동":
			crolling.area += ",E0100420";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수완동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신가동":
			crolling.area += ",E0100430";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",E0100450";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신룡동":
			crolling.area += ",E0100460";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			crolling.area += ",E0100470";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",E0100480";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "쌍임동":
			crolling.area += ",E0100490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍임동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안청동":
			crolling.area += ",E0100500";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("안청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양동":
			crolling.area += ",E0100510";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양산동":
			crolling.area += ",E0100520";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어룡동":
			crolling.area += ",E0100530";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("어룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산동":
			crolling.area += ",E0100540";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산동":
			crolling.area += ",E0100540";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오선동":
			crolling.area += ",E0100560";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오운동":
			crolling.area += ",E0100560";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥동":
			crolling.area += ",E0100570";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("옥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕동":
			crolling.area += ",E0100580";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "요기동":
			crolling.area += ",E0100590";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("요기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용곡동":
			crolling.area += ",E0100600";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용동":
			crolling.area += ",E0100610";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용봉동":
			crolling.area += ",E0100620";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우산동":
			crolling.area += ",E0100630";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("우산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운남동":
			crolling.area += ",E0100640";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운수동":
			crolling.area += ",E0100650";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계동":
			crolling.area += ",E0100660";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡1동":
			crolling.area += ",E0100670";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡2동":
			crolling.area += ",E0100680";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡동":
			crolling.area += ",E0100685";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월전동":
			crolling.area += ",E0100690";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유계동":
			crolling.area += ",E0100700";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임곡동":
			crolling.area += ",E0100710";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("임곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장덕동":
			crolling.area += ",E0100720";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장록동":
			crolling.area += ",E0100730";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장록동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장수동":
			crolling.area += ",E0100740";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산동":
			crolling.area += ",E0100750";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지정동":
			crolling.area += ",E0100760";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지죽동":
			crolling.area += ",E0100770";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지평동":
			crolling.area += ",E0100780";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진곡동":
			crolling.area += ",E0100790";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("진곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남동":
			crolling.area += ",E0100800";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("하남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하산동":
			crolling.area += ",E0100810";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("하산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황룡동":
			crolling.area += ",E0100820";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("황룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑석동":
			crolling.area += ",E0100830";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("흑석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구동":
			crolling.area += ",E0200010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구소동":
			crolling.area += ",E020020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노대동":
			crolling.area += ",E0200030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("노대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대지동":
			crolling.area += ",E0200040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕남동":
			crolling.area += ",E0200050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도금동":
			crolling.area += ",E0200060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방림1동":
			crolling.area += ",E0200100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("방림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방림2동":
			crolling.area += ",E0200110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("방림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방림동":
			crolling.area += ",E0200120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("방림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운1동":
			crolling.area += ",E0200130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("백운1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운2동":
			crolling.area += ",E0200140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("백운2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운동":
			crolling.area += ",E0200150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("백운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉선1동":
			crolling.area += ",E0200160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉선1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉선2동":
			crolling.area += ",E0200170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉선2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉선동":
			crolling.area += ",E0200180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			crolling.area += ",E0200190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서1동":
			crolling.area += ",E0200200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서2동":
			crolling.area += ",E0200210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서동":
			crolling.area += ",E0200220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석정동":
			crolling.area += ",E0200230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송하동":
			crolling.area += ",E0200240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "승촌동":
			crolling.area += ",E0200250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("승촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장동":
			crolling.area += ",E0200260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "압촌동":
			crolling.area += ",E0200270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("압촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양과동":
			crolling.area += ",E0200280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양과동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양림동":
			crolling.area += ",E0200290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양촌동":
			crolling.area += ",E0200300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원산동":
			crolling.area += ",E0200310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월산4동":
			crolling.area += ",E0200320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월산5동":
			crolling.area += ",E0200330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월산5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월산동":
			crolling.area += ",E0200340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월성동":
			crolling.area += ",E0200350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이장동":
			crolling.area += ",E0200360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("이장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임암동":
			crolling.area += ",E0200370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("임암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주월1동":
			crolling.area += ",E0200380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주월1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주월2동":
			crolling.area += ",E0200390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주월2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주월동":
			crolling.area += ",E020040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지석동":
			crolling.area += ",E0200410";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진월동":
			crolling.area += ",E0200420";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("진월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠석동":
			crolling.area += ",E0200430";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("칠석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행암동":
			crolling.area += ",E0200440";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("행암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화장동":
			crolling.area += ",E0200450";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계림1동":
			crolling.area += ",E0300010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("계림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계림2동":
			crolling.area += ",E0300020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("계림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계림동":
			crolling.area += ",I0600150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("계림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동구광산동":
			crolling.area += ",I0600120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동구광산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁동":
			crolling.area += ",I0600130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남로1가":
			crolling.area += ",I0600140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금남로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남로2가":
			crolling.area += ",I0600070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금남로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남로3가":
			crolling.area += ",I0600200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금남로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남로4가":
			crolling.area += ",I0600160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금남로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남로5가":
			crolling.area += ",I0600170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금남로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동":
			crolling.area += ",I0600180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남동":
			crolling.area += ",I0600190";
			Mainpage.Filtering[Mainpage.index].setText("남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내남동":
			crolling.area += ",I0600210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동":
			crolling.area += ",I0700030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대인동":
			crolling.area += ",I0700070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동명동":
			crolling.area += ",I0700040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불로동":
			crolling.area += ",I0700050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("불로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산수1동":
			crolling.area += ",I0700060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산수2동":
			crolling.area += ",I0700110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동구산수동":
			crolling.area += ",I0700090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동구산수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서석동":
			crolling.area += ",I0700100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선교동":
			crolling.area += ",I0700180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("선교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소태동":
			crolling.area += ",I0700120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소태동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수기동":
			crolling.area += ",I0700130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",I0700140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용연동":
			crolling.area += ",I0700150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운림동":
			crolling.area += ",I0700160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운람동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월남동":
			crolling.area += ",I0700200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동":
			crolling.area += ",I0700210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산1동":
			crolling.area += ",I0700240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산2동":
			crolling.area += ",I0700220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동구지산동":
			crolling.area += ",I0700230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동구지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충장로1가":
			crolling.area += ",E0300340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("충장로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충장로2가":
			crolling.area += ",E0300350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("충장로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충장로3가":
			crolling.area += ",E0300360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("충장로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충장로4가":
			crolling.area += ",E0300370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("충장로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학동":
			crolling.area += ",E0300380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호남동":
			crolling.area += ",E0300390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("호남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금동":
			crolling.area += ",E0300400";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("황금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "각화동":
			crolling.area += "E0400020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("각화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",E0400030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누문동":
			crolling.area += ",E0400040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("누문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대촌동":
			crolling.area += ",E0400050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕희동":
			crolling.area += ",E0400060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕희동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북구동림동":
			crolling.area += ",E0400070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북구동림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두암1동":
			crolling.area += ",E0400080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두암2동":
			crolling.area += ",E0400090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두암3동":
			crolling.area += ",E0400100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두암동":
			crolling.area += ",E0400110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망월동":
			crolling.area += ",E0400120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("망월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매곡동":
			crolling.area += ",E0400130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("매곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문흥1동":
			crolling.area += ",E0400140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문흥2동":
			crolling.area += ",E0400150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본촌동":
			crolling.area += ",E0400160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("본촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북동":
			crolling.area += ",E0400170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼각동":
			crolling.area += ",E0400180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생용동":
			crolling.area += ",E0400190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("생용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수곡동":
			crolling.area += ",E0400200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신안동":
			crolling.area += ",E0400210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신용동":
			crolling.area += ",E0400220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북구양산동":
			crolling.area += ",E0400230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북구양산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연제동":
			crolling.area += ",E0400240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오룡동":
			crolling.area += ",E0400250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오치1동":
			crolling.area += ",E0400260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오치1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오치2동":
			crolling.area += ",E0400270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오치2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오치동":
			crolling.area += ",E0400280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			crolling.area += ",E0400290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",E0400300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북구용봉동":
			crolling.area += ",E0400310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북구용봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용전동":
			crolling.area += ",E0400320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북구우산동":
			crolling.area += ",E0400330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북구우산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운암1동":
			crolling.area += ",E0400340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운암2동":
			crolling.area += ",E0400350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운암3동":
			crolling.area += ",E0400360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운암동":
			crolling.area += ",E0400370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운정동":
			crolling.area += ",E0400380";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월출동":
			crolling.area += ",E0400390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월출동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유동":
			crolling.area += ",E0400400";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일곡동":
			crolling.area += ",E0400410";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("일곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임동":
			crolling.area += ",E0400420";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("임동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장등동":
			crolling.area += ",E0400430";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중흥1동":
			crolling.area += ",E0400440";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중흥2동":
			crolling.area += ",E0400450";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중흥3동":
			crolling.area += ",E0400460";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중흥3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중흥동":
			crolling.area += ",E0400470";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지야동":
			crolling.area += ",E0400480";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청풍동":
			crolling.area += ",E0400490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충효동":
			crolling.area += ",E0400500";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("충효동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태령동":
			crolling.area += ",E0400510";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태령동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍향동":
			crolling.area += ",E0400520";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("풍향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화암동":
			crolling.area += ",E0400530";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효령동":
			crolling.area += ",E0400540";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("효령동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광천동":
			crolling.area += ",E0500020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("광천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동":
			crolling.area += ",E0500030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내방동":
			crolling.area += ",E0500040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농성1동":
			crolling.area += ",E0500050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("농성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농성2동":
			crolling.area += ",E0500060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("농성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농성동":
			crolling.area += ",E0500070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("농성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕흥동":
			crolling.area += ",E0500080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동천동":
			crolling.area += ",E0500090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마륵동":
			crolling.area += ",E0500100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("마륵동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매월동":
			crolling.area += ",E0500110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("매월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벽진동":
			crolling.area += ",E0500120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("벽진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상무1동":
			crolling.area += ",E0500130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상무1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상무2동":
			crolling.area += ",E0500140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상무2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상무동":
			crolling.area += ",E0500150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서창동":
			crolling.area += ",E0500160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세하동":
			crolling.area += ",E0500170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("세하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍촌동":
			crolling.area += ",E0500180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양3동":
			crolling.area += ",E0500190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서구양동":
			crolling.area += ",E0500200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서구양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서구용두동":
			crolling.area += ",E0500210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서구용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유촌동":
			crolling.area += ",E0500220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "치평동":
			crolling.area += ",E0500230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("치평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍암동":
			crolling.area += ",E0500240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("풍암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정1동":
			crolling.area += ",E0500250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정2동":
			crolling.area += ",E0500260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정3동":
			crolling.area += ",E0500270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정4동":
			crolling.area += ",E0500280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정동":
			crolling.area += ",E0500290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
