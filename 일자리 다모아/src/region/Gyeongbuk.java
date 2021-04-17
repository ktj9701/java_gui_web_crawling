package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Gyeongbuk {
	public boolean flag;

	public void GyeongbukCity(ActionEvent e) {
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
		//경북
				//경산시
				case "갑제동":
					crolling.area += ",D0100010";
					Mainpage.Filtering[Mainpage.index].setText("갑제동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "계양동":
					crolling.area += ",D0100020";
					Mainpage.Filtering[Mainpage.index].setText("계양동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남방동":
					crolling.area += ",D0100030";
					Mainpage.Filtering[Mainpage.index].setText("남방동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산면":
					crolling.area += ",D0100040";
					Mainpage.Filtering[Mainpage.index].setText("남산면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남천면":
					crolling.area += ",D0100050";
					Mainpage.Filtering[Mainpage.index].setText("남천면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내동":
					crolling.area += ",D0100060";
					Mainpage.Filtering[Mainpage.index].setText("내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대동":
					crolling.area += ",D0100070";
					Mainpage.Filtering[Mainpage.index].setText("대동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대정동":
					crolling.area += ",D0100080";
					Mainpage.Filtering[Mainpage.index].setText("대정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대평동":
					crolling.area += ",D0100090";
					Mainpage.Filtering[Mainpage.index].setText("대평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "백천동":
					crolling.area += ",D0100100";
					Mainpage.Filtering[Mainpage.index].setText("백천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사동":
					crolling.area += ",D0100110";
					Mainpage.Filtering[Mainpage.index].setText("사동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사정동":
					crolling.area += ",D0100120";
					Mainpage.Filtering[Mainpage.index].setText("사정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼남동":
					crolling.area += ",D0100130";
					Mainpage.Filtering[Mainpage.index].setText("삼남동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼북동":
					crolling.area += ",D0100140";
					Mainpage.Filtering[Mainpage.index].setText("삼북동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼풍동":
					crolling.area += ",D0100150";
					Mainpage.Filtering[Mainpage.index].setText("삼풍동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상방동":
					crolling.area += ",D0100160";
					Mainpage.Filtering[Mainpage.index].setText("상방동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서상동":
					crolling.area += ",D0100170";
					Mainpage.Filtering[Mainpage.index].setText("서상동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신교동":
					crolling.area += ",D0100180";
					Mainpage.Filtering[Mainpage.index].setText("신교동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신천동":
					crolling.area += ",D0100190";
					Mainpage.Filtering[Mainpage.index].setText("신천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "압량면":
					crolling.area += ",D0100200";
					Mainpage.Filtering[Mainpage.index].setText("압량면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "여천동":
					crolling.area += ",D0100210";
					Mainpage.Filtering[Mainpage.index].setText("여천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "옥곡동":
					crolling.area += ",D0100220";
					Mainpage.Filtering[Mainpage.index].setText("옥곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "옥산동":
					crolling.area += ",D0100230";
					Mainpage.Filtering[Mainpage.index].setText("옥산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "와촌면":
					crolling.area += ",D0100240";
					Mainpage.Filtering[Mainpage.index].setText("와촌면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용성면":
					crolling.area += ",D0100250";
					Mainpage.Filtering[Mainpage.index].setText("용성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "유곡동":
					crolling.area += ",D0100260";
					Mainpage.Filtering[Mainpage.index].setText("유곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "임당동":
					crolling.area += ",D0100270";
					Mainpage.Filtering[Mainpage.index].setText("임당동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "자인면":
					crolling.area += ",D0100280";
					Mainpage.Filtering[Mainpage.index].setText("자인면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "점촌동":
					crolling.area += ",D0100290";
					Mainpage.Filtering[Mainpage.index].setText("점촌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "정평동":
					crolling.area += ",D0100300";
					Mainpage.Filtering[Mainpage.index].setText("정평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "조영동":
					crolling.area += ",D0100310";
					Mainpage.Filtering[Mainpage.index].setText("조영동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중방동":
					crolling.area += ",D0100320";
					Mainpage.Filtering[Mainpage.index].setText("중방동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중산동":
					crolling.area += ",D0100330";
					Mainpage.Filtering[Mainpage.index].setText("중산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "진량읍":
					crolling.area += ",D0100340";
					Mainpage.Filtering[Mainpage.index].setText("진량읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평산동":
					crolling.area += ",D0100350";
					Mainpage.Filtering[Mainpage.index].setText("평산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "하양읍":
					crolling.area += ",D0100360";
					Mainpage.Filtering[Mainpage.index].setText("하양읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//경주시
				case "감포읍":
					crolling.area += ",D0200010";
					Mainpage.Filtering[Mainpage.index].setText("감포읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "강동면":
					crolling.area += ",D0200020";
					Mainpage.Filtering[Mainpage.index].setText("강동면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "건천읍":
					crolling.area += ",D0200030";
					Mainpage.Filtering[Mainpage.index].setText("건천읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "광명동":
					crolling.area += ",D0200040";
					Mainpage.Filtering[Mainpage.index].setText("광명동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "교동":
					crolling.area += ",D0200050";
					Mainpage.Filtering[Mainpage.index].setText("교동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구정동":
					crolling.area += ",D0200060";
					Mainpage.Filtering[Mainpage.index].setText("구정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구황동":
					crolling.area += ",D0200070";
					Mainpage.Filtering[Mainpage.index].setText("구황동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남산동":
					crolling.area += ",D0200080";
					Mainpage.Filtering[Mainpage.index].setText("남산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내남면":
					crolling.area += ",D0200090";
					Mainpage.Filtering[Mainpage.index].setText("내남면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노동동":
					crolling.area += ",D0200100";
					Mainpage.Filtering[Mainpage.index].setText("노동동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "노서동":
					crolling.area += ",D0200110";
					Mainpage.Filtering[Mainpage.index].setText("노서동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "덕동":
					crolling.area += ",D0200120";
					Mainpage.Filtering[Mainpage.index].setText("덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도지동":
					crolling.area += ",D0200130";
					Mainpage.Filtering[Mainpage.index].setText("도지동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동방동":
					crolling.area += ",D0200140";
					Mainpage.Filtering[Mainpage.index].setText("동방동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동부동":
					crolling.area += ",D0200150";
					Mainpage.Filtering[Mainpage.index].setText("동부동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동천동":
					crolling.area += ",D0200160";
					Mainpage.Filtering[Mainpage.index].setText("동천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "마동":
					crolling.area += ",D0200170";
					Mainpage.Filtering[Mainpage.index].setText("마동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "배동":
					crolling.area += ",D0200180";
					Mainpage.Filtering[Mainpage.index].setText("배동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "배반동":
					crolling.area += ",D0200190";
					Mainpage.Filtering[Mainpage.index].setText("배반동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "보문동":
					crolling.area += ",D0200200";
					Mainpage.Filtering[Mainpage.index].setText("보문동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "북군동":
					crolling.area += ",D0200210";
					Mainpage.Filtering[Mainpage.index].setText("북군동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "북부동":
					crolling.area += ",D0200220";
					Mainpage.Filtering[Mainpage.index].setText("북부동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "경주시사정동":
					crolling.area += ",D0200230";
					Mainpage.Filtering[Mainpage.index].setText("경주시사정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산내면":
					crolling.area += ",D0200240";
					Mainpage.Filtering[Mainpage.index].setText("산내면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서면":
					crolling.area += ",D0200250";
					Mainpage.Filtering[Mainpage.index].setText("서면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서부동":
					crolling.area += ",D0200260";
					Mainpage.Filtering[Mainpage.index].setText("서부동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서악동":
					crolling.area += ",D0200270";
					Mainpage.Filtering[Mainpage.index].setText("서악동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "석장동":
					crolling.area += ",D0200280";
					Mainpage.Filtering[Mainpage.index].setText("석장동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성건동":
					crolling.area += ",D0200290";
					Mainpage.Filtering[Mainpage.index].setText("성건동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성동동":
					crolling.area += ",D0200300";
					Mainpage.Filtering[Mainpage.index].setText("성동동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "손곡동":
					crolling.area += ",D0200310";
					Mainpage.Filtering[Mainpage.index].setText("손곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "시동":
					crolling.area += ",D0200320";
					Mainpage.Filtering[Mainpage.index].setText("시동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "시래동":
					crolling.area += ",D0200330";
					Mainpage.Filtering[Mainpage.index].setText("시래동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신평동":
					crolling.area += ",D0200340";
					Mainpage.Filtering[Mainpage.index].setText("신평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "안강읍":
					crolling.area += ",D0200350";
					Mainpage.Filtering[Mainpage.index].setText("안강읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "암곡동":
					crolling.area += ",D0200360";
					Mainpage.Filtering[Mainpage.index].setText("암곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "양남면":
					crolling.area += ",D0200370";
					Mainpage.Filtering[Mainpage.index].setText("양남면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "양북면":
					crolling.area += ",D0200380";
					Mainpage.Filtering[Mainpage.index].setText("양북면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "외동읍":
					crolling.area += ",D0200390";
					Mainpage.Filtering[Mainpage.index].setText("외동읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용강동":
					crolling.area += ",D0200400";
					Mainpage.Filtering[Mainpage.index].setText("용강동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "율동":
					crolling.area += ",D0200410";
					Mainpage.Filtering[Mainpage.index].setText("율동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "인왕동":
					crolling.area += ",D0200420";
					Mainpage.Filtering[Mainpage.index].setText("인왕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "조양동":
					crolling.area += ",D0200430";
					Mainpage.Filtering[Mainpage.index].setText("조양동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "진현동":
					crolling.area += ",D0200440";
					Mainpage.Filtering[Mainpage.index].setText("진현동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "천군동":
					crolling.area += ",D0200450";
					Mainpage.Filtering[Mainpage.index].setText("천군동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "천북면":
					crolling.area += ",D0200460";
					Mainpage.Filtering[Mainpage.index].setText("천북면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "충효동":
					crolling.area += ",D0200470";
					Mainpage.Filtering[Mainpage.index].setText("충효동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "탑동":
					crolling.area += ",D0200480";
					Mainpage.Filtering[Mainpage.index].setText("탑동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평동":
					crolling.area += ",D0200490";
					Mainpage.Filtering[Mainpage.index].setText("평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "하동":
					crolling.area += ",D0200500";
					Mainpage.Filtering[Mainpage.index].setText("하동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "현곡면":
					crolling.area += ",D0200510";
					Mainpage.Filtering[Mainpage.index].setText("현곡면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황남동":
					crolling.area += ",D0200520";
					Mainpage.Filtering[Mainpage.index].setText("황남동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황성동":
					crolling.area += ",D0200530";
					Mainpage.Filtering[Mainpage.index].setText("황성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황오동":
					crolling.area += ",D0200540";
					Mainpage.Filtering[Mainpage.index].setText("황오동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황용동":
					crolling.area += ",D0200550";
					Mainpage.Filtering[Mainpage.index].setText("황용동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "효현동":
					crolling.area += ",D0200560";
					Mainpage.Filtering[Mainpage.index].setText("효현동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//고령군
				case "개진면":
					crolling.area += ",D0300010";
					Mainpage.Filtering[Mainpage.index].setText("개진면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "다산면":
					crolling.area += ",D0300030";
					Mainpage.Filtering[Mainpage.index].setText("다산면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대가야읍":
					crolling.area += ",D0300020";
					Mainpage.Filtering[Mainpage.index].setText("대가야읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "덕곡면":
					crolling.area += ",D0300040";
					Mainpage.Filtering[Mainpage.index].setText("덕곡면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성산면":
					crolling.area += ",D0300050";
					Mainpage.Filtering[Mainpage.index].setText("성산면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "쌍림면":
					crolling.area += ",D0300060";
					Mainpage.Filtering[Mainpage.index].setText("쌍림면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "우곡면":
					crolling.area += ",D0300070";
					Mainpage.Filtering[Mainpage.index].setText("우곡면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "운수면":
					crolling.area += ",D0300080";
					Mainpage.Filtering[Mainpage.index].setText("운수면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//구미시
				case "거의동":
					crolling.area += ",D0400010";
					Mainpage.Filtering[Mainpage.index].setText("거의동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "고아읍":
					crolling.area += ",D0400020";
					Mainpage.Filtering[Mainpage.index].setText("고아읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공단동":
					crolling.area += ",D0400050";
					Mainpage.Filtering[Mainpage.index].setText("공단동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공단1동":
					crolling.area += ",D0400030";
					Mainpage.Filtering[Mainpage.index].setText("공단1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공단2동":
					crolling.area += ",D0400040";
					Mainpage.Filtering[Mainpage.index].setText("공단2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "광평동":
					crolling.area += ",D0400060";
					Mainpage.Filtering[Mainpage.index].setText("광평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구평동":
					crolling.area += ",D0400070";
					Mainpage.Filtering[Mainpage.index].setText("구평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구포동":
					crolling.area += ",D0400080";
					Mainpage.Filtering[Mainpage.index].setText("구포동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "금전동":
					crolling.area += ",D0400090";
					Mainpage.Filtering[Mainpage.index].setText("금전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남통동":
					crolling.area += ",D0400100";
					Mainpage.Filtering[Mainpage.index].setText("남통동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도개면":
					crolling.area += ",D0400110";
					Mainpage.Filtering[Mainpage.index].setText("도개면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도량동":
					crolling.area += ",D0400140";
					Mainpage.Filtering[Mainpage.index].setText("도량동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "무을면":
					crolling.area += ",D0400150";
					Mainpage.Filtering[Mainpage.index].setText("무을면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉곡동":
					crolling.area += ",D0400160";
					Mainpage.Filtering[Mainpage.index].setText("봉곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "부곡동":
					crolling.area += ",D0400170";
					Mainpage.Filtering[Mainpage.index].setText("부곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "비산동":
					crolling.area += ",D0400180";
					Mainpage.Filtering[Mainpage.index].setText("비산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사곡동":
					crolling.area += ",D0400190";
					Mainpage.Filtering[Mainpage.index].setText("사곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산동면":
					crolling.area += ",D0400200";
					Mainpage.Filtering[Mainpage.index].setText("산동면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상모동":
					crolling.area += ",D0400210";
					Mainpage.Filtering[Mainpage.index].setText("상모동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "선기동":
					crolling.area += ",D0400220";
					Mainpage.Filtering[Mainpage.index].setText("선기동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "선산읍":
					crolling.area += ",D0400230";
					Mainpage.Filtering[Mainpage.index].setText("선산읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "송정동":
					crolling.area += ",D0400240";
					Mainpage.Filtering[Mainpage.index].setText("송정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "수점동":
					crolling.area += ",D0400250";
					Mainpage.Filtering[Mainpage.index].setText("수점동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "시미동":
					crolling.area += ",D0400260";
					Mainpage.Filtering[Mainpage.index].setText("시미동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신동":
					crolling.area += ",D0400270";
					Mainpage.Filtering[Mainpage.index].setText("신동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구미시신평동":
					crolling.area += ",D0400300";
					Mainpage.Filtering[Mainpage.index].setText("구미시신평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신평1동":
					crolling.area += ",D0400280";
					Mainpage.Filtering[Mainpage.index].setText("신평1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신평2동":
					crolling.area += ",D0400290";
					Mainpage.Filtering[Mainpage.index].setText("신평2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "양호동":
					crolling.area += ",D0400310";
					Mainpage.Filtering[Mainpage.index].setText("양호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "오태동":
					crolling.area += ",D0400320";
					Mainpage.Filtering[Mainpage.index].setText("오태동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "옥계동":
					crolling.area += ",D0400330";
					Mainpage.Filtering[Mainpage.index].setText("옥계동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "옥성면":
					crolling.area += ",D0400340";
					Mainpage.Filtering[Mainpage.index].setText("옥성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "원평동":
					crolling.area += ",D0400370";
					Mainpage.Filtering[Mainpage.index].setText("원평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "원평1동":
					crolling.area += ",D0400350";
					Mainpage.Filtering[Mainpage.index].setText("원평1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "원평2동":
					crolling.area += ",D0400360";
					Mainpage.Filtering[Mainpage.index].setText("원평2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "인의동":
					crolling.area += ",D0400380";
					Mainpage.Filtering[Mainpage.index].setText("인의동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "임수동":
					crolling.area += ",D0400390";
					Mainpage.Filtering[Mainpage.index].setText("임수동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "임은동":
					crolling.area += ",D0400400";
					Mainpage.Filtering[Mainpage.index].setText("임은동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "장천면":
					crolling.area += ",D0400410";
					Mainpage.Filtering[Mainpage.index].setText("장천면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지산동":
					crolling.area += ",D0400420";
					Mainpage.Filtering[Mainpage.index].setText("지산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "진평동":
					crolling.area += ",D0400430";
					Mainpage.Filtering[Mainpage.index].setText("진평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "해평면":
					crolling.area += ",D0400440";
					Mainpage.Filtering[Mainpage.index].setText("해평면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "형곡동":
					crolling.area += ",D0400470";
					Mainpage.Filtering[Mainpage.index].setText("형곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "형곡1동":
					crolling.area += ",D0400450";
					Mainpage.Filtering[Mainpage.index].setText("형곡1동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "형곡2동":
					crolling.area += ",D0400460";
					Mainpage.Filtering[Mainpage.index].setText("형곡2동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황상동":
					crolling.area += ",D0400480";
					Mainpage.Filtering[Mainpage.index].setText("황상동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//군위군
				case "고로면":
					crolling.area += ",D0500010";
					Mainpage.Filtering[Mainpage.index].setText("고로면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "군위읍":
					crolling.area += ",D0500020";
					Mainpage.Filtering[Mainpage.index].setText("군위읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "부계면":
					crolling.area += ",D0500030";
					Mainpage.Filtering[Mainpage.index].setText("부계면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산성면":
					crolling.area += ",D0500040";
					Mainpage.Filtering[Mainpage.index].setText("산성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "소보면":
					crolling.area += ",D0500050";
					Mainpage.Filtering[Mainpage.index].setText("소보면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "우보면":
					crolling.area += ",D0500060";
					Mainpage.Filtering[Mainpage.index].setText("우보면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "의흥면":
					crolling.area += ",D0500070";
					Mainpage.Filtering[Mainpage.index].setText("의흥면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "효령면":
					crolling.area += ",D0500080";
					Mainpage.Filtering[Mainpage.index].setText("효령면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//김천시
				case "감문면":
					crolling.area += ",D0600010";
					Mainpage.Filtering[Mainpage.index].setText("감문면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "감천면":
					crolling.area += ",D0600020";
					Mainpage.Filtering[Mainpage.index].setText("감천면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "감호동":
					crolling.area += ",D0600030";
					Mainpage.Filtering[Mainpage.index].setText("감호동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "개령면":
					crolling.area += ",D0600040";
					Mainpage.Filtering[Mainpage.index].setText("개령면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "김천시교동":
					crolling.area += ",D0600050";
					Mainpage.Filtering[Mainpage.index].setText("김천시교동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "구성면":
					crolling.area += ",D0600060";
					Mainpage.Filtering[Mainpage.index].setText("구성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남면":
					crolling.area += ",D0600080";
					Mainpage.Filtering[Mainpage.index].setText("남면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "김천시남산동":
					crolling.area += ",D0600090";
					Mainpage.Filtering[Mainpage.index].setText("김천시남산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "농소면":
					crolling.area += ",D0600100";
					Mainpage.Filtering[Mainpage.index].setText("농소면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "다수동":
					crolling.area += ",D0600110";
					Mainpage.Filtering[Mainpage.index].setText("다수동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대광동":
					crolling.area += ",D0600120";
					Mainpage.Filtering[Mainpage.index].setText("대광동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대덕면":
					crolling.area += ",D0600130";
					Mainpage.Filtering[Mainpage.index].setText("대덕면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "대항면":
					crolling.area += ",D0600140";
					Mainpage.Filtering[Mainpage.index].setText("대항면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "덕곡동":
					crolling.area += ",D0600150";
					Mainpage.Filtering[Mainpage.index].setText("덕곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "모암동":
					crolling.area += ",D0600160";
					Mainpage.Filtering[Mainpage.index].setText("모암동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "문당동":
					crolling.area += ",D0600170";
					Mainpage.Filtering[Mainpage.index].setText("문당동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "백옥동":
					crolling.area += ",D0600180";
					Mainpage.Filtering[Mainpage.index].setText("백옥동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉산면":
					crolling.area += ",D0600190";
					Mainpage.Filtering[Mainpage.index].setText("봉산면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "김천시부곡동":
					crolling.area += ",D0600200";
					Mainpage.Filtering[Mainpage.index].setText("김천시부곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "부항면":
					crolling.area += ",D0600210";
					Mainpage.Filtering[Mainpage.index].setText("부항면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "삼락동":
					crolling.area += ",D0600220";
					Mainpage.Filtering[Mainpage.index].setText("삼락동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성내동":
					crolling.area += ",D0600230";
					Mainpage.Filtering[Mainpage.index].setText("성내동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신음동":
					crolling.area += ",D0600240";
					Mainpage.Filtering[Mainpage.index].setText("신음동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "아포읍":
					crolling.area += ",D0600250";
					Mainpage.Filtering[Mainpage.index].setText("아포읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "양천동":
					crolling.area += ",D0600260";
					Mainpage.Filtering[Mainpage.index].setText("양천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "어모면":
					crolling.area += ",D0600270";
					Mainpage.Filtering[Mainpage.index].setText("어모면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "용두동":
					crolling.area += ",D0600280";
					Mainpage.Filtering[Mainpage.index].setText("용두동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "율곡동":
					crolling.area += ",D0600370";
					Mainpage.Filtering[Mainpage.index].setText("율곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "응명동":
					crolling.area += ",D0600300";
					Mainpage.Filtering[Mainpage.index].setText("응명동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "조마면":
					crolling.area += ",D0600310";
					Mainpage.Filtering[Mainpage.index].setText("조마면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "증산면":
					crolling.area += ",D0600320";
					Mainpage.Filtering[Mainpage.index].setText("증산면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지례면":
					crolling.area += ",D0600330";
					Mainpage.Filtering[Mainpage.index].setText("지례면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지좌동":
					crolling.area += ",D0600340";
					Mainpage.Filtering[Mainpage.index].setText("지좌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "평화동":
					crolling.area += ",D0600350";
					Mainpage.Filtering[Mainpage.index].setText("평화동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "황금동":
					crolling.area += ",D0600360";
					Mainpage.Filtering[Mainpage.index].setText("황금동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//문경시
				case "가은읍":
					crolling.area += ",D0700010";
					Mainpage.Filtering[Mainpage.index].setText("가은읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공평동":
					crolling.area += ",D0700020";
					Mainpage.Filtering[Mainpage.index].setText("공평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "농암면":
					crolling.area += ",D0700030";
					Mainpage.Filtering[Mainpage.index].setText("농암면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "동로면":
					crolling.area += ",D0700040";
					Mainpage.Filtering[Mainpage.index].setText("동로면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "마성면":
					crolling.area += ",D0700050";
					Mainpage.Filtering[Mainpage.index].setText("마성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "모전동":
					crolling.area += ",D0700060";
					Mainpage.Filtering[Mainpage.index].setText("모전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "문경읍":
					crolling.area += ",D0700070";
					Mainpage.Filtering[Mainpage.index].setText("문경읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "불정동":
					crolling.area += ",D0700080";
					Mainpage.Filtering[Mainpage.index].setText("불정동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산북면":
					crolling.area += ",D0700090";
					Mainpage.Filtering[Mainpage.index].setText("산북면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "산양면":
					crolling.area += ",D0700100";
					Mainpage.Filtering[Mainpage.index].setText("산양면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신기동":
					crolling.area += ",D0700110";
					Mainpage.Filtering[Mainpage.index].setText("신기동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "영순면":
					crolling.area += ",D0700120";
					Mainpage.Filtering[Mainpage.index].setText("영순면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "영신동":
					crolling.area += ",D0700130";
					Mainpage.Filtering[Mainpage.index].setText("영신동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "우지동":
					crolling.area += ",D0700140";
					Mainpage.Filtering[Mainpage.index].setText("우지동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "문경시유곡동":
					crolling.area += ",D0700150";
					Mainpage.Filtering[Mainpage.index].setText("문경시유곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "윤직동":
					crolling.area += ",D0700160";
					Mainpage.Filtering[Mainpage.index].setText("윤직동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "문경시점촌동":
					crolling.area += ",D0700170";
					Mainpage.Filtering[Mainpage.index].setText("문경시점촌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "창동":
					crolling.area += ",D0700180";
					Mainpage.Filtering[Mainpage.index].setText("창동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "호계면":
					crolling.area += ",D0700190";
					Mainpage.Filtering[Mainpage.index].setText("호계면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "흥덕동":
					crolling.area += ",D0700200";
					Mainpage.Filtering[Mainpage.index].setText("흥덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//봉화군
				case "명호면":
					crolling.area += ",D0800010";
					Mainpage.Filtering[Mainpage.index].setText("명호면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "물야면":
					crolling.area += ",D0800020";
					Mainpage.Filtering[Mainpage.index].setText("물야면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "법전면":
					crolling.area += ",D0800030";
					Mainpage.Filtering[Mainpage.index].setText("법전면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉성면":
					crolling.area += ",D0800040";
					Mainpage.Filtering[Mainpage.index].setText("봉성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "봉화읍":
					crolling.area += ",D0800050";
					Mainpage.Filtering[Mainpage.index].setText("봉화읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상운면":
					crolling.area += ",D0800060";
					Mainpage.Filtering[Mainpage.index].setText("상운면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "석포면":
					crolling.area += ",D0800070";
					Mainpage.Filtering[Mainpage.index].setText("석포면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "소천면":
					crolling.area += ",D0800080";
					Mainpage.Filtering[Mainpage.index].setText("소천면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "재산면":
					crolling.area += ",D0800090";
					Mainpage.Filtering[Mainpage.index].setText("재산면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "춘양면":
					crolling.area += ",D0800100";
					Mainpage.Filtering[Mainpage.index].setText("춘양면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//상주시
				case "가장동":
					crolling.area += ",D0900010";
					Mainpage.Filtering[Mainpage.index].setText("가장동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "개운동":
					crolling.area += ",D0900020";
					Mainpage.Filtering[Mainpage.index].setText("개운동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "거동동":
					crolling.area += ",D0900030";
					Mainpage.Filtering[Mainpage.index].setText("거동동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "계산동":
					crolling.area += ",D0900040";
					Mainpage.Filtering[Mainpage.index].setText("계산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공검면":
					crolling.area += ",D0900050";
					Mainpage.Filtering[Mainpage.index].setText("공검면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "공성면":
					crolling.area += ",D0900060";
					Mainpage.Filtering[Mainpage.index].setText("공성면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "낙동면":
					crolling.area += ",D0900070";
					Mainpage.Filtering[Mainpage.index].setText("낙동면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "낙상동":
					crolling.area += ",D0900080";
					Mainpage.Filtering[Mainpage.index].setText("낙상동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "낙양동":
					crolling.area += ",D0900090";
					Mainpage.Filtering[Mainpage.index].setText("낙양동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남성동":
					crolling.area += ",D0900100";
					Mainpage.Filtering[Mainpage.index].setText("남성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남장동":
					crolling.area += ",D0900110";
					Mainpage.Filtering[Mainpage.index].setText("남장동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "남적동":
					crolling.area += ",D0900120";
					Mainpage.Filtering[Mainpage.index].setText("남적동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "내서면":
					crolling.area += ",D0900130";
					Mainpage.Filtering[Mainpage.index].setText("내서면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "냉림동":
					crolling.area += ",D0900140";
					Mainpage.Filtering[Mainpage.index].setText("냉림동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "도남동":
					crolling.area += ",D0900150";
					Mainpage.Filtering[Mainpage.index].setText("도남동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "만산동":
					crolling.area += ",D0900160";
					Mainpage.Filtering[Mainpage.index].setText("만산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "모동면":
					crolling.area += ",D0900170";
					Mainpage.Filtering[Mainpage.index].setText("모동면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "모서면":
					crolling.area += ",D0900180";
					Mainpage.Filtering[Mainpage.index].setText("모서면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "무양동":
					crolling.area += ",D0900190";
					Mainpage.Filtering[Mainpage.index].setText("무양동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "병성동":
					crolling.area += ",D0900200";
					Mainpage.Filtering[Mainpage.index].setText("병성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "복룡동":
					crolling.area += ",D0900210";
					Mainpage.Filtering[Mainpage.index].setText("복룡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "부원동":
					crolling.area += ",D0900220";
					Mainpage.Filtering[Mainpage.index].setText("부원동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "사벌면":
					crolling.area += ",D0900230";
					Mainpage.Filtering[Mainpage.index].setText("사벌면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서곡동":
					crolling.area += ",D0900240";
					Mainpage.Filtering[Mainpage.index].setText("서곡동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서문동":
					crolling.area += ",D0900250";
					Mainpage.Filtering[Mainpage.index].setText("서문동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "서성동":
					crolling.area += ",D0900260";
					Mainpage.Filtering[Mainpage.index].setText("서성동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "상주시성동동":
					crolling.area += ",D0900270";
					Mainpage.Filtering[Mainpage.index].setText("상주시성동동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "성하동":
					crolling.area += ",D0900280";
					Mainpage.Filtering[Mainpage.index].setText("성하동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "신봉동":
					crolling.area += ",D0900290";
					Mainpage.Filtering[Mainpage.index].setText("신봉동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "양촌동":
					crolling.area += ",D0900300";
					Mainpage.Filtering[Mainpage.index].setText("양촌동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "연원동":
					crolling.area += ",D0900310";
					Mainpage.Filtering[Mainpage.index].setText("연원동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "오대동":
					crolling.area += ",D0900320";
					Mainpage.Filtering[Mainpage.index].setText("오대동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "외남면":
					crolling.area += ",D0900330";
					Mainpage.Filtering[Mainpage.index].setText("외남면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "외답동":
					crolling.area += ",D0900340";
					Mainpage.Filtering[Mainpage.index].setText("외답동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "외서면":
					crolling.area += ",D0900350";
					Mainpage.Filtering[Mainpage.index].setText("외서면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "은척면":
					crolling.area += ",D0900360";
					Mainpage.Filtering[Mainpage.index].setText("은척면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "이안면":
					crolling.area += ",D0900370";
					Mainpage.Filtering[Mainpage.index].setText("이안면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "인봉동":
					crolling.area += ",D0900380";
					Mainpage.Filtering[Mainpage.index].setText("인봉동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "인평동":
					crolling.area += ",D0900390";
					Mainpage.Filtering[Mainpage.index].setText("인평동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "죽전동":
					crolling.area += ",D0900400";
					Mainpage.Filtering[Mainpage.index].setText("죽전동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중덕동":
					crolling.area += ",D0900410";
					Mainpage.Filtering[Mainpage.index].setText("중덕동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "중동면":
					crolling.area += ",D0900420";
					Mainpage.Filtering[Mainpage.index].setText("중동면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "지천동":
					crolling.area += ",D0900430";
					Mainpage.Filtering[Mainpage.index].setText("지천동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "청리면":
					crolling.area += ",D0900440";
					Mainpage.Filtering[Mainpage.index].setText("청리면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "초산동":
					crolling.area += ",D0900450";
					Mainpage.Filtering[Mainpage.index].setText("초산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "함창읍":
					crolling.area += ",D0900460";
					Mainpage.Filtering[Mainpage.index].setText("함창읍");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "헌신동":
					crolling.area += ",D0900470";
					Mainpage.Filtering[Mainpage.index].setText("헌신동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화개동":
					crolling.area += ",D0900480";
					Mainpage.Filtering[Mainpage.index].setText("화개동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화남면":
					crolling.area += ",D0900490";
					Mainpage.Filtering[Mainpage.index].setText("화남면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화동면":
					crolling.area += ",D0900500";
					Mainpage.Filtering[Mainpage.index].setText("화동면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화북면":
					crolling.area += ",D0900510";
					Mainpage.Filtering[Mainpage.index].setText("화북면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화산동":
					crolling.area += ",D0900520";
					Mainpage.Filtering[Mainpage.index].setText("화산동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "화서면":
					crolling.area += ",D0900530";
					Mainpage.Filtering[Mainpage.index].setText("화서면");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "흥각동":
					crolling.area += ",D0900540";
					Mainpage.Filtering[Mainpage.index].setText("흥각동");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;

		}
	}
}
