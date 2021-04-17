package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Ulsan {
		public boolean flag;

		public void UlsanCity(ActionEvent e) {
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
			case "개운동":
				crolling.area += ",J0100010";
				Mainpage.Filtering[Mainpage.index].setText("개운동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "고사동":
				crolling.area += ",J0100020";
				Mainpage.Filtering[Mainpage.index].setText("고사동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "남화동":
				crolling.area += ",J0100030";
				Mainpage.Filtering[Mainpage.index].setText("남화동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "달동":
				crolling.area += ",J0100040";
				Mainpage.Filtering[Mainpage.index].setText("달동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "두왕동":
				crolling.area += ",J0100050";
				Mainpage.Filtering[Mainpage.index].setText("두왕동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "매암동":
				crolling.area += ",J0100060";
				Mainpage.Filtering[Mainpage.index].setText("매암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "무거동":
				crolling.area += ",J0100090";
				Mainpage.Filtering[Mainpage.index].setText("무거동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "부곡동":
				crolling.area += ",J0100100";
				Mainpage.Filtering[Mainpage.index].setText("부곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "삼산동":
				crolling.area += ",J0100110";
				Mainpage.Filtering[Mainpage.index].setText("삼산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "상개동":
				crolling.area += ",J0100120";
				Mainpage.Filtering[Mainpage.index].setText("상개동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "선암동":
				crolling.area += ",J0100130";
				Mainpage.Filtering[Mainpage.index].setText("선암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "성암동":
				crolling.area += ",J0100140";
				Mainpage.Filtering[Mainpage.index].setText("성암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정동":
				crolling.area += ",J0100200";
				Mainpage.Filtering[Mainpage.index].setText("신정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정1동":
				crolling.area += ",J0100150";
				Mainpage.Filtering[Mainpage.index].setText("신정1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정2동":
				crolling.area += ",J0100160";
				Mainpage.Filtering[Mainpage.index].setText("신정2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정3동":
				crolling.area += ",J0100170";
				Mainpage.Filtering[Mainpage.index].setText("신정3동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정4동":
				crolling.area += ",J0100180";
				Mainpage.Filtering[Mainpage.index].setText("신정4동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정5동":
				crolling.area += ",J0100190";
				Mainpage.Filtering[Mainpage.index].setText("신정5동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "야음동":
				crolling.area += ",J0100240";
				Mainpage.Filtering[Mainpage.index].setText("야음동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "여천동":
				crolling.area += ",J0100250";
				Mainpage.Filtering[Mainpage.index].setText("여천동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "옥동":
				crolling.area += ",J0100260";
				Mainpage.Filtering[Mainpage.index].setText("옥동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "용연동":
				crolling.area += ",J0100270";
				Mainpage.Filtering[Mainpage.index].setText("용연동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "용잠동":
				crolling.area += ",J0100280";
				Mainpage.Filtering[Mainpage.index].setText("용잠동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "장생포동":
				crolling.area += ",J0100290";
				Mainpage.Filtering[Mainpage.index].setText("장생포동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "황성동":
				crolling.area += ",J0100300";
				Mainpage.Filtering[Mainpage.index].setText("황성동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "대송동":
				crolling.area += ",J0200010";
				Mainpage.Filtering[Mainpage.index].setText("대송동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "동부동":
				crolling.area += ",J0200020";
				Mainpage.Filtering[Mainpage.index].setText("동부동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "방어동":
				crolling.area += ",J0200030";
				Mainpage.Filtering[Mainpage.index].setText("방어동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "서부동":
				crolling.area += ",J0200040";
				Mainpage.Filtering[Mainpage.index].setText("서부동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "일산동":
				crolling.area += ",J0200050";
				Mainpage.Filtering[Mainpage.index].setText("일산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "전하동":
				crolling.area += ",J0200090";
				Mainpage.Filtering[Mainpage.index].setText("전하동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "전하1동":
				crolling.area += ",J0200060";
				Mainpage.Filtering[Mainpage.index].setText("전하1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "전하2동":
				crolling.area += ",J0200070";
				Mainpage.Filtering[Mainpage.index].setText("전하2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "주전동":
				crolling.area += ",J0200100";
				Mainpage.Filtering[Mainpage.index].setText("주전동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "화정동":
				crolling.area += ",J0200110";
				Mainpage.Filtering[Mainpage.index].setText("화정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "가대동":
				crolling.area += ",J0300010";
				Mainpage.Filtering[Mainpage.index].setText("가대동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "구유동":
				crolling.area += ",J0300020";
				Mainpage.Filtering[Mainpage.index].setText("구유동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "달천동":
				crolling.area += ",J0300030";
				Mainpage.Filtering[Mainpage.index].setText("달천동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "당사동":
				crolling.area += ",J0300040";
				Mainpage.Filtering[Mainpage.index].setText("당사동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "대안동":
				crolling.area += ",J0300050";
				Mainpage.Filtering[Mainpage.index].setText("대안동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "매곡동":
				crolling.area += ",J0300060";
				Mainpage.Filtering[Mainpage.index].setText("매곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "명촌동":
				crolling.area += ",J0300070";
				Mainpage.Filtering[Mainpage.index].setText("명촌동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "무룡동":
				crolling.area += ",J0300080";
				Mainpage.Filtering[Mainpage.index].setText("무룡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "산하동":
				crolling.area += ",J0300090";
				Mainpage.Filtering[Mainpage.index].setText("산하동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "상안동":
				crolling.area += ",J0300100";
				Mainpage.Filtering[Mainpage.index].setText("상안동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "송정동":
				crolling.area += ",J0300110";
				Mainpage.Filtering[Mainpage.index].setText("송정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "시례동":
				crolling.area += ",J0300120";
				Mainpage.Filtering[Mainpage.index].setText("시례동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신명동":
				crolling.area += ",J0300130";
				Mainpage.Filtering[Mainpage.index].setText("신명동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신천동":
				crolling.area += ",J0300140";
				Mainpage.Filtering[Mainpage.index].setText("신천동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신현동":
				crolling.area += ",J0300150";
				Mainpage.Filtering[Mainpage.index].setText("신현동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "양정동":
				crolling.area += ",J0300160";
				Mainpage.Filtering[Mainpage.index].setText("양정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "어물동":
				crolling.area += ",J0300170";
				Mainpage.Filtering[Mainpage.index].setText("어물동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "연암동":
				crolling.area += ",J0300180";
				Mainpage.Filtering[Mainpage.index].setText("연암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "염포동":
				crolling.area += ",J0300190";
				Mainpage.Filtering[Mainpage.index].setText("염포동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "정자동":
				crolling.area += ",J0300200";
				Mainpage.Filtering[Mainpage.index].setText("정자동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "중산동":
				crolling.area += ",J0300210";
				Mainpage.Filtering[Mainpage.index].setText("중산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "진장동":
				crolling.area += ",J0300220";
				Mainpage.Filtering[Mainpage.index].setText("진장동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "창평동":
				crolling.area += ",J0300230";
				Mainpage.Filtering[Mainpage.index].setText("창평동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "천곡동":
				crolling.area += ",J0300240";
				Mainpage.Filtering[Mainpage.index].setText("천곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "호계동":
				crolling.area += ",J0300250";
				Mainpage.Filtering[Mainpage.index].setText("호계동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "화봉동":
				crolling.area += ",J0300260";
				Mainpage.Filtering[Mainpage.index].setText("화봉동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "효문동":
				crolling.area += ",J0300270";
				Mainpage.Filtering[Mainpage.index].setText("효문동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "두동면":
				crolling.area += ",J0400010";
				Mainpage.Filtering[Mainpage.index].setText("두동면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "두서면":
				crolling.area += ",J0400020";
				Mainpage.Filtering[Mainpage.index].setText("두서면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "범서읍":
				crolling.area += ",J0400030";
				Mainpage.Filtering[Mainpage.index].setText("범서읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "삼남면":
				crolling.area += ",J0400040";
				Mainpage.Filtering[Mainpage.index].setText("삼남면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "삼동면":
				crolling.area += ",J0400050";
				Mainpage.Filtering[Mainpage.index].setText("삼동면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "상북면":
				crolling.area += ",J0400060";
				Mainpage.Filtering[Mainpage.index].setText("상북면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "서생면":
				crolling.area += ",J0400070";
				Mainpage.Filtering[Mainpage.index].setText("서생면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "언양읍":
				crolling.area += ",J0400080";
				Mainpage.Filtering[Mainpage.index].setText("언양읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "온산읍":
				crolling.area += ",J0400090";
				Mainpage.Filtering[Mainpage.index].setText("온산읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "온양읍":
				crolling.area += ",J0400100";
				Mainpage.Filtering[Mainpage.index].setText("온양읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "웅촌면":
				crolling.area += ",J0400110";
				Mainpage.Filtering[Mainpage.index].setText("웅촌면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "청량읍":
				crolling.area += ",J0400120";
				Mainpage.Filtering[Mainpage.index].setText("청량읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "교동":
				crolling.area += ",J0500010";
				Mainpage.Filtering[Mainpage.index].setText("교동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "남외동":
				crolling.area += ",J0500020";
				Mainpage.Filtering[Mainpage.index].setText("남외동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "다운동":
				crolling.area += ",J0500030";
				Mainpage.Filtering[Mainpage.index].setText("다운동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "동동":
				crolling.area += ",J0500040";
				Mainpage.Filtering[Mainpage.index].setText("동동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "반구동":
				crolling.area += ",J0500070";
				Mainpage.Filtering[Mainpage.index].setText("반구동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "반구1동":
				crolling.area += ",J0500050";
				Mainpage.Filtering[Mainpage.index].setText("반구1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "반구2동":
				crolling.area += ",J0500060";
				Mainpage.Filtering[Mainpage.index].setText("반구2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "복산동":
				crolling.area += ",J0500100";
				Mainpage.Filtering[Mainpage.index].setText("복산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "복산1동":
				crolling.area += ",J0500080";
				Mainpage.Filtering[Mainpage.index].setText("복산1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "복산2동":
				crolling.area += ",J0500090";
				Mainpage.Filtering[Mainpage.index].setText("복산2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "북정동":
				crolling.area += ",J0500110";
				Mainpage.Filtering[Mainpage.index].setText("북정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "서동":
				crolling.area += ",J0500120";
				Mainpage.Filtering[Mainpage.index].setText("서동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "성남동":
				crolling.area += ",J0500130";
				Mainpage.Filtering[Mainpage.index].setText("성남동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "성안동":
				crolling.area += ",J0500140";
				Mainpage.Filtering[Mainpage.index].setText("성안동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "약사동":
				crolling.area += ",J0500150";
				Mainpage.Filtering[Mainpage.index].setText("약사동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "옥교동":
				crolling.area += ",J0500160";
				Mainpage.Filtering[Mainpage.index].setText("옥교동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "우정동":
				crolling.area += ",J0500170";
				Mainpage.Filtering[Mainpage.index].setText("우정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "유곡동":
				crolling.area += ",J0500180";
				Mainpage.Filtering[Mainpage.index].setText("유곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;	
			case "장현동":
				crolling.area += ",J0500190";
				Mainpage.Filtering[Mainpage.index].setText("장현동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "태화동":
				crolling.area += ",J0500200";
				Mainpage.Filtering[Mainpage.index].setText("태화동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "학산동":
				crolling.area += ",J0500210";
				Mainpage.Filtering[Mainpage.index].setText("학산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "학성동":
				crolling.area += ",J0500220";
				Mainpage.Filtering[Mainpage.index].setText("학성동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			}
		
	}
}
