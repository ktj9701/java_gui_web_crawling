package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Ulsan {
		public boolean flag;

		public void UlsanCity(ActionEvent e) {
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
			case "개운동":
				Albamoncrolling.area += ",J0100010";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B0%B3%BF%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("개운동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "고사동":
				Albamoncrolling.area += ",J0100020";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B0%ED%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("고사동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "남화동":
				Albamoncrolling.area += ",J0100030";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B3%B2%C8%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("남화동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "달동":
				Albamoncrolling.area += ",J0100040";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B4%DE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("달동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "두왕동":
				Albamoncrolling.area += ",J0100050";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B5%CE%BF";
				Mainpage.Filtering[Mainpage.index].setText("두왕동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "매암동":
				Albamoncrolling.area += ",J0100060";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B8%C5%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("매암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "무거동":
				Albamoncrolling.area += ",J0100090";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B9%AB%B0%C5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("무거동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "부곡동":
				Albamoncrolling.area += ",J0100100";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("부곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "삼산동":
				Albamoncrolling.area += ",J0100110";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BB%EF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("삼산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "상개동":
				Albamoncrolling.area += ",J0100120";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BB%F3%B0%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("상개동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "선암동":
				Albamoncrolling.area += ",J0100130";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BC%B1%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("선암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "성암동":
				Albamoncrolling.area += ",J0100140";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BC%BA%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("성암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정동":
				Albamoncrolling.area += ",J0100200";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정1동":
				Albamoncrolling.area += ",J0100150";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신정1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정2동":
				Albamoncrolling.area += ",J0100160";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신정2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정3동":
				Albamoncrolling.area += ",J0100170";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신정3동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정4동":
				Albamoncrolling.area += ",J0100180";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신정4동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신정5동":
				Albamoncrolling.area += ",J0100190";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A45%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신정5동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "야음동":
				Albamoncrolling.area += ",J0100240";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BE%DF%C0%BD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("야음동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "여천동":
				Albamoncrolling.area += ",J0100250";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%A9%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("여천동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "옥동":
				Albamoncrolling.area += ",J0100260";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%C1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("옥동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "용연동":
				Albamoncrolling.area += ",J0100270";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%BF%AC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("용연동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "용잠동":
				Albamoncrolling.area += ",J0100280";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C0%E1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("용잠동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "장생포동":
				Albamoncrolling.area += ",J0100290";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%C0%E5%BB%FD%C6%F7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("장생포동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "황성동":
				Albamoncrolling.area += ",J0100300";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%C8%B2%BC%BA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("황성동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "대송동":
				Albamoncrolling.area += ",J0200010";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%BC%DB%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("대송동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "동부동":
				Albamoncrolling.area += ",J0200020";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%BA%CE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("동부동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "방어동":
				Albamoncrolling.area += ",J0200030";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%B9%E6%BE%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("방어동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "서부동":
				Albamoncrolling.area += ",J0200040";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%BA%CE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("서부동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "일산동":
				Albamoncrolling.area += ",J0200050";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%CF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("일산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "전하동":
				Albamoncrolling.area += ",J0200090";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("전하동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "전하1동":
				Albamoncrolling.area += ",J0200060";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("전하1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "전하2동":
				Albamoncrolling.area += ",J0200070";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("전하2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "주전동":
				Albamoncrolling.area += ",J0200100";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C1%D6%C0%FC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("주전동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "화정동":
				Albamoncrolling.area += ",J0200110";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("화정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "가대동":
				Albamoncrolling.area += ",J0300010";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B0%A1%B4%EB%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("가대동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "구유동":
				Albamoncrolling.area += ",J0300020";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C0%AF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("구유동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "달천동":
				Albamoncrolling.area += ",J0300030";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%DE%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("달천동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "당사동":
				Albamoncrolling.area += ",J0300040";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%E7%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("당사동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "대안동":
				Albamoncrolling.area += ",J0300050";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("대안동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "매곡동":
				Albamoncrolling.area += ",J0300060";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("매곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "명촌동":
				Albamoncrolling.area += ",J0300070";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B8%ED%C3%CC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("명촌동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "무룡동":
				Albamoncrolling.area += ",J0300080";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B9%AB%B7%E6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("무룡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "산하동":
				Albamoncrolling.area += ",J0300090";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%C7%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("산하동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "상안동":
				Albamoncrolling.area += ",J0300100";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BB%F3%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("상안동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "송정동":
				Albamoncrolling.area += ",J0300110";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("송정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "시례동":
				Albamoncrolling.area += ",J0300120";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C3%B7%CA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("시례동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신명동":
				Albamoncrolling.area += ",J0300130";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%B8%ED%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신명동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신천동":
				Albamoncrolling.area += ",J0300140";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신천동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "신현동":
				Albamoncrolling.area += ",J0300150";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%C7%F6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("신현동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "양정동":
				Albamoncrolling.area += ",J0300160";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BE%E7%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("양정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "어물동":
				Albamoncrolling.area += ",J0300170";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BE%EE%B9%B0%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("어물동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "연암동":
				Albamoncrolling.area += ",J0300180";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("연암동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "염포동":
				Albamoncrolling.area += ",J0300190";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BF%B0%C6%F7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("염포동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "정자동":
				Albamoncrolling.area += ",J0300200";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("정자동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "중산동":
				Albamoncrolling.area += ",J0300210";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("중산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "진장동":
				Albamoncrolling.area += ",J0300220";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%F8%C0%E5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("진장동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "창평동":
				Albamoncrolling.area += ",J0300230";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C3%A2%C6%F2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("창평동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "천곡동":
				Albamoncrolling.area += ",J0300240";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C3%B5%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("천곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "호계동":
				Albamoncrolling.area += ",J0300250";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%A3%B0%E8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("호계동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "화봉동":
				Albamoncrolling.area += ",J0300260";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%BA%C0%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("화봉동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "효문동":
				Albamoncrolling.area += ",J0300270";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%BF%B9%AE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("효문동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "두동면":
				Albamoncrolling.area += ",J0400010";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B5%CE%B5%BF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("두동면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "두서면":
				Albamoncrolling.area += ",J0400020";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B5%CE%BC%AD%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("두서면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "범서읍":
				Albamoncrolling.area += ",J0400030";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B9%FC%BC%AD%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("범서읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "삼남면":
				Albamoncrolling.area += ",J0400040";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%EF%B3%B2%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("삼남면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "삼동면":
				Albamoncrolling.area += ",J0400050";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%EF%B5%BF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("삼동면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "상북면":
				Albamoncrolling.area += ",J0400060";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%F3%BA%CF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("상북면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "서생면":
				Albamoncrolling.area += ",J0400070";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BC%AD%BB%FD%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("서생면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "언양읍":
				Albamoncrolling.area += ",J0400080";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BE%F0%BE%E7%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("언양읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "온산읍":
				Albamoncrolling.area += ",J0400090";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%C2%BB%EA%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("온산읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "온양읍":
				Albamoncrolling.area += ",J0400100";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%C2%BE%E7%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("온양읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "웅촌면":
				Albamoncrolling.area += ",J0400110";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%F5%C3%CC%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("웅촌면");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "청량읍":
				Albamoncrolling.area += ",J0400120";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%C3%BB%B7%AE%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("청량읍");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "교동":
				Albamoncrolling.area += ",J0500010";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B1%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("교동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "남외동":
				Albamoncrolling.area += ",J0500020";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BF%DC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("남외동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "다운동":
				Albamoncrolling.area += ",J0500030";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%BF%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("다운동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "동동":
				Albamoncrolling.area += ",J0500040";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("동동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "반구동":
				Albamoncrolling.area += ",J0500070";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("반구동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "반구1동":
				Albamoncrolling.area += ",J0500050";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B81%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("반구1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "반구2동":
				Albamoncrolling.area += ",J0500060";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B82%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("반구2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "복산동":
				Albamoncrolling.area += ",J0500100";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("복산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "복산1동":
				Albamoncrolling.area += ",J0500080";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("복산1동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "복산2동":
				Albamoncrolling.area += ",J0500090";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("복산2동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "북정동":
				Albamoncrolling.area += ",J0500110";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("북정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "서동":
				Albamoncrolling.area += ",J0500120";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("서동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "성남동":
				Albamoncrolling.area += ",J0500130";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%BA%B3%B2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("성남동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "성안동":
				Albamoncrolling.area += ",J0500140";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%BA%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("성안동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "약사동":
				Albamoncrolling.area += ",J0500150";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BE%E0%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("약사동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "옥교동":
				Albamoncrolling.area += ",J0500160";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BF%C1%B1%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("옥교동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "우정동":
				Albamoncrolling.area += ",J0500170";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BF%EC%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("우정동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "유곡동":
				Albamoncrolling.area += ",J0500180";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("유곡동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;	
			case "장현동":
				Albamoncrolling.area += ",J0500190";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C7%F6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("장현동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "태화동":
				Albamoncrolling.area += ",J0500200";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C8%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("태화동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "학산동":
				Albamoncrolling.area += ",J0500210";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C7%D0%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("학산동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "학성동":
				Albamoncrolling.area += ",J0500220";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C7%D0%BC%BA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("학성동");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			}

	}
}
