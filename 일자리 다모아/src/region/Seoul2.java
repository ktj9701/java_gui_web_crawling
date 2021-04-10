package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
public class Seoul2 {
	public boolean flag;

	public void Seoul2City(ActionEvent e) {
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
		case "가락동":
			crolling.area += ",I1800030";
			Mainpage.Filtering[Mainpage.index].setText("가락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락1동":
			crolling.area += ",I1800010";
			Mainpage.Filtering[Mainpage.index].setText("가락1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락2동":
			crolling.area += ",I1800020";
			Mainpage.Filtering[Mainpage.index].setText("가락2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가락본동":
			crolling.area += "I1800040";
			Mainpage.Filtering[Mainpage.index].setText("가락본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여동":
			crolling.area += ",I1800070";
			Mainpage.Filtering[Mainpage.index].setText("거여동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여1동":
			crolling.area += ",I1800050";
			Mainpage.Filtering[Mainpage.index].setText("거여1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거여2동":
			crolling.area += ",I1800060";
			Mainpage.Filtering[Mainpage.index].setText("거여2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천동":
			crolling.area += "I1800100";
			Mainpage.Filtering[Mainpage.index].setText("마천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천1동":
			crolling.area += ",I1800080";
			Mainpage.Filtering[Mainpage.index].setText("마천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마천2동":
			crolling.area += ",I1800090";
			Mainpage.Filtering[Mainpage.index].setText("마천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정동":
			crolling.area += ",I1800130";
			Mainpage.Filtering[Mainpage.index].setText("문정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정1동":
			crolling.area += ",I1800110";
			Mainpage.Filtering[Mainpage.index].setText("문정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정2동":
			crolling.area += "I1800120";
			Mainpage.Filtering[Mainpage.index].setText("문정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이동":
			crolling.area += ",I1800160";
			Mainpage.Filtering[Mainpage.index].setText("방이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이1동":
			crolling.area += ",I1800140";
			Mainpage.Filtering[Mainpage.index].setText("방이1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방이2동":
			crolling.area += ",I1800150";
			Mainpage.Filtering[Mainpage.index].setText("방이2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼전동":
			crolling.area += "I1800170";
			Mainpage.Filtering[Mainpage.index].setText("삼전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석촌동":
			crolling.area += ",I1800180";
			Mainpage.Filtering[Mainpage.index].setText("석촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파동":
			crolling.area += ",I1800210";
			Mainpage.Filtering[Mainpage.index].setText("송파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파1동":
			crolling.area += ",I1800190";
			Mainpage.Filtering[Mainpage.index].setText("송파1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송파2동":
			crolling.area += ",I1800200";
			Mainpage.Filtering[Mainpage.index].setText("송파2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			crolling.area += ",I1800220";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			crolling.area += ",I1800230";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오륜동":
			crolling.area += ",I1800240";
			Mainpage.Filtering[Mainpage.index].setText("오륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			crolling.area += ",I1800380";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실동":
			crolling.area += ",I1800320";
			Mainpage.Filtering[Mainpage.index].setText("잠실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실2동":
			crolling.area += ",I1800260";
			Mainpage.Filtering[Mainpage.index].setText("잠실2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실3동":
			crolling.area += ",I1800270";
			Mainpage.Filtering[Mainpage.index].setText("잠실3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실4동":
			crolling.area += ",I1800280";
			Mainpage.Filtering[Mainpage.index].setText("잠실4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실6동":
			crolling.area += ",I1800300";
			Mainpage.Filtering[Mainpage.index].setText("잠실6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실7동":
			crolling.area += ",I1800310";
			Mainpage.Filtering[Mainpage.index].setText("잠실7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠실본동":
			crolling.area += ",I1800330";
			Mainpage.Filtering[Mainpage.index].setText("잠실본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			crolling.area += ",I1800340";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납동":
			crolling.area += ",I1800370";
			Mainpage.Filtering[Mainpage.index].setText("풍납동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납1동":
			crolling.area += ",I1800350";
			Mainpage.Filtering[Mainpage.index].setText("풍납1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍납2동":
			crolling.area += ",I1800360";
			Mainpage.Filtering[Mainpage.index].setText("풍납2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",I1900070";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목1동":
			crolling.area += ",I1900010";
			Mainpage.Filtering[Mainpage.index].setText("목1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목2동":
			crolling.area += ",I1900020";
			Mainpage.Filtering[Mainpage.index].setText("목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목3동":
			crolling.area += ",I1900030";
			Mainpage.Filtering[Mainpage.index].setText("목3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목4동":
			crolling.area += ",I1900040";
			Mainpage.Filtering[Mainpage.index].setText("목4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목5동":
			crolling.area += ",I1900050";
			Mainpage.Filtering[Mainpage.index].setText("목5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",I1900150";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월1동":
			crolling.area += ",I1900080";
			Mainpage.Filtering[Mainpage.index].setText("신월1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월2동":
			crolling.area += ",I1900090";
			Mainpage.Filtering[Mainpage.index].setText("신월2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월3동":
			crolling.area += ",I1900100";
			Mainpage.Filtering[Mainpage.index].setText("신월3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월4동":
			crolling.area += ",I1900110";
			Mainpage.Filtering[Mainpage.index].setText("신월4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월5동":
			crolling.area += ",I1900120";
			Mainpage.Filtering[Mainpage.index].setText("신월5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월6동":
			crolling.area += ",I1900130";
			Mainpage.Filtering[Mainpage.index].setText("신월6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월7동":
			crolling.area += ",I1900140";
			Mainpage.Filtering[Mainpage.index].setText("신월7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양천구신정동":
			crolling.area += ",I1900230";
			Mainpage.Filtering[Mainpage.index].setText("양천구신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정1동":
			crolling.area += ",I1900160";
			Mainpage.Filtering[Mainpage.index].setText("신정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정2동":
			crolling.area += ",I1900170";
			Mainpage.Filtering[Mainpage.index].setText("신정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정3동":
			crolling.area += ",I1900180";
			Mainpage.Filtering[Mainpage.index].setText("신정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정4동":
			crolling.area += ",I1900190";
			Mainpage.Filtering[Mainpage.index].setText("신정4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정6동":
			crolling.area += ",I1900210";
			Mainpage.Filtering[Mainpage.index].setText("신정6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정7동":
			crolling.area += ",I1900220";
			Mainpage.Filtering[Mainpage.index].setText("신정7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동":
			crolling.area += ",I2000010";
			Mainpage.Filtering[Mainpage.index].setText("당산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동1가":
			crolling.area += ",I2000020";
			Mainpage.Filtering[Mainpage.index].setText("당산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동2가":
			crolling.area += ",I2000030";
			Mainpage.Filtering[Mainpage.index].setText("당산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동3가":
			crolling.area += ",I2000040";
			Mainpage.Filtering[Mainpage.index].setText("당산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동4가":
			crolling.area += ",I2000050";
			Mainpage.Filtering[Mainpage.index].setText("당산동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동5가":
			crolling.area += ",I2000060";
			Mainpage.Filtering[Mainpage.index].setText("당산동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당산동6가":
			crolling.area += ",I2000070";
			Mainpage.Filtering[Mainpage.index].setText("당산동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림동":
			crolling.area += ",I2000110";
			Mainpage.Filtering[Mainpage.index].setText("대림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림1동":
			crolling.area += ",I2000080";
			Mainpage.Filtering[Mainpage.index].setText("대림1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림2동":
			crolling.area += ",I2000090";
			Mainpage.Filtering[Mainpage.index].setText("대림2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대림3동":
			crolling.area += "I2000100";
			Mainpage.Filtering[Mainpage.index].setText("대림3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도림동":
			crolling.area += ",I2000140";
			Mainpage.Filtering[Mainpage.index].setText("도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동":
			crolling.area += ",I2000150";
			Mainpage.Filtering[Mainpage.index].setText("문래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동1가":
			crolling.area += ",I2000160";
			Mainpage.Filtering[Mainpage.index].setText("문래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동2가":
			crolling.area += ",I2000170";
			Mainpage.Filtering[Mainpage.index].setText("문래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동3가":
			crolling.area += ",I2000180";
			Mainpage.Filtering[Mainpage.index].setText("문래동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동4가":
			crolling.area += ",I2000190";
			Mainpage.Filtering[Mainpage.index].setText("문래동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동5가":
			crolling.area += ",I2000200";
			Mainpage.Filtering[Mainpage.index].setText("문래동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문래동6가":
			crolling.area += ",I2000210";
			Mainpage.Filtering[Mainpage.index].setText("문래동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길동":
			crolling.area += ",I2000290";
			Mainpage.Filtering[Mainpage.index].setText("신길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길1동":
			crolling.area += ",I2000220";
			Mainpage.Filtering[Mainpage.index].setText("신길1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길3동":
			crolling.area += ",I2000240";
			Mainpage.Filtering[Mainpage.index].setText("신길3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길4동":
			crolling.area += ",I2000250";
			Mainpage.Filtering[Mainpage.index].setText("신길4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길5동":
			crolling.area += ",I2000260";
			Mainpage.Filtering[Mainpage.index].setText("신길5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길6동":
			crolling.area += ",I2000270";
			Mainpage.Filtering[Mainpage.index].setText("신길6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길7동":
			crolling.area += ",I2000280";
			Mainpage.Filtering[Mainpage.index].setText("신길7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동":
			crolling.area += ",I2000300";
			Mainpage.Filtering[Mainpage.index].setText("양평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동1가":
			crolling.area += ",I2000310";
			Mainpage.Filtering[Mainpage.index].setText("양평동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동2가":
			crolling.area += ",I2000320";
			Mainpage.Filtering[Mainpage.index].setText("양평동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동3가":
			crolling.area += ",I2000330";
			Mainpage.Filtering[Mainpage.index].setText("양평동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동4가":
			crolling.area += ",I2000340";
			Mainpage.Filtering[Mainpage.index].setText("양평동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동5가":
			crolling.area += ",I2000350";
			Mainpage.Filtering[Mainpage.index].setText("양평동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평동6가":
			crolling.area += ",I2000360";
			Mainpage.Filtering[Mainpage.index].setText("양평동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양화동":
			crolling.area += ",I2000370";
			Mainpage.Filtering[Mainpage.index].setText("양화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여의도동":
			crolling.area += ",I2000380";
			Mainpage.Filtering[Mainpage.index].setText("여의도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동":
			crolling.area += ",I2000390";
			Mainpage.Filtering[Mainpage.index].setText("영등포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동1가":
			crolling.area += ",I2000400";
			Mainpage.Filtering[Mainpage.index].setText("영등포동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동2가":
			crolling.area += ",I2000410";
			Mainpage.Filtering[Mainpage.index].setText("영등포동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동3가":
			crolling.area += ",I2000420";
			Mainpage.Filtering[Mainpage.index].setText("영등포동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포4가":
			crolling.area += ",I2000430";
			Mainpage.Filtering[Mainpage.index].setText("영등포4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동5가":
			crolling.area += ",I2000440";
			Mainpage.Filtering[Mainpage.index].setText("영등포동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동6가":
			crolling.area += ",I2000450";
			Mainpage.Filtering[Mainpage.index].setText("영등포동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동7가":
			crolling.area += ",I2000460";
			Mainpage.Filtering[Mainpage.index].setText("영등포동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포동8가":
			crolling.area += ",I2000470";
			Mainpage.Filtering[Mainpage.index].setText("영등포동8가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영등포본동":
			crolling.area += ",I2000230";
			Mainpage.Filtering[Mainpage.index].setText("영등포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈월동":
			crolling.area += ",I2100010";
			Mainpage.Filtering[Mainpage.index].setText("갈월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남영동":
			crolling.area += ",I2100020";
			Mainpage.Filtering[Mainpage.index].setText("남영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도원동":
			crolling.area += ",I2100030";
			Mainpage.Filtering[Mainpage.index].setText("도원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동빙고동":
			crolling.area += ",I2100040";
			Mainpage.Filtering[Mainpage.index].setText("동빙고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동자동":
			crolling.area += ",I2100050";
			Mainpage.Filtering[Mainpage.index].setText("동자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문배동":
			crolling.area += ",I2100060";
			Mainpage.Filtering[Mainpage.index].setText("문배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동":
			crolling.area += ",I2100070";
			Mainpage.Filtering[Mainpage.index].setText("보광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산천동":
			crolling.area += "I2100080";
			Mainpage.Filtering[Mainpage.index].setText("산천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서계동":
			crolling.area += ",I2100090";
			Mainpage.Filtering[Mainpage.index].setText("서계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서빙고동":
			crolling.area += ",I2100100";
			Mainpage.Filtering[Mainpage.index].setText("서빙고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신계동":
			crolling.area += ",I2100110";
			Mainpage.Filtering[Mainpage.index].setText("신계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창동":
			crolling.area += ",I2100120";
			Mainpage.Filtering[Mainpage.index].setText("신창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문동":
			crolling.area += ",I2100130";
			Mainpage.Filtering[Mainpage.index].setText("용문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동1가":
			crolling.area += ",I2100140";
			Mainpage.Filtering[Mainpage.index].setText("용산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동2가":
			crolling.area += ",I2100150";
			Mainpage.Filtering[Mainpage.index].setText("용산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동3가":
			crolling.area += ",I2100160";
			Mainpage.Filtering[Mainpage.index].setText("용산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동4가":
			crolling.area += ",I2100170";
			Mainpage.Filtering[Mainpage.index].setText("용산동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동5가":
			crolling.area += ",I2100180";
			Mainpage.Filtering[Mainpage.index].setText("용산동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동6가":
			crolling.area += ",I2100190";
			Mainpage.Filtering[Mainpage.index].setText("용산동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로1가":
			crolling.area += ",I2100200";
			Mainpage.Filtering[Mainpage.index].setText("원효로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로2가":
			crolling.area += ",I2100210";
			Mainpage.Filtering[Mainpage.index].setText("원효로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로3가":
			crolling.area += ",I2100220";
			Mainpage.Filtering[Mainpage.index].setText("원효로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원효로4가":
			crolling.area += ",I2100230";
			Mainpage.Filtering[Mainpage.index].setText("원효로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌동":
			crolling.area += ",I2100260";
			Mainpage.Filtering[Mainpage.index].setText("이촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌1동":
			crolling.area += ",I2100240";
			Mainpage.Filtering[Mainpage.index].setText("이촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이촌2동":
			crolling.area += ",I2100250";
			Mainpage.Filtering[Mainpage.index].setText("이촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원동":
			crolling.area += ",I2100290";
			Mainpage.Filtering[Mainpage.index].setText("이태원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원1동":
			crolling.area += ",I2100270";
			Mainpage.Filtering[Mainpage.index].setText("이태원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이태원2동":
			crolling.area += ",I2100280";
			Mainpage.Filtering[Mainpage.index].setText("이태원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주성동":
			crolling.area += ",I2100300";
			Mainpage.Filtering[Mainpage.index].setText("주성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청암동":
			crolling.area += ",I2100310";
			Mainpage.Filtering[Mainpage.index].setText("청암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동1가":
			crolling.area += ",I2100320";
			Mainpage.Filtering[Mainpage.index].setText("청파동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동2가":
			crolling.area += ",I2100330";
			Mainpage.Filtering[Mainpage.index].setText("청파동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청파동3가":
			crolling.area += ",I2100340";
			Mainpage.Filtering[Mainpage.index].setText("청파동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로1가":
			crolling.area += ",I2100350";
			Mainpage.Filtering[Mainpage.index].setText("한강로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로2가":
			crolling.area += ",I2100360";
			Mainpage.Filtering[Mainpage.index].setText("한강로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한강로3가":
			crolling.area += ",I2100370";
			Mainpage.Filtering[Mainpage.index].setText("한강로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한남동":
			crolling.area += ",I2100400";
			Mainpage.Filtering[Mainpage.index].setText("한남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효창동":
			crolling.area += ",I2100410";
			Mainpage.Filtering[Mainpage.index].setText("효창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후암동":
			crolling.area += ",I2100420";
			Mainpage.Filtering[Mainpage.index].setText("후암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			crolling.area += ",I2200030";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현1동":
			crolling.area += ",I2200010";
			Mainpage.Filtering[Mainpage.index].setText("갈현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현2동":
			crolling.area += ",I2200020";
			Mainpage.Filtering[Mainpage.index].setText("갈현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			crolling.area += ",I2200040";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹번동":
			crolling.area += ",I2200060";
			Mainpage.Filtering[Mainpage.index].setText("녹번동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대조동":
			crolling.area += ",I2200070";
			Mainpage.Filtering[Mainpage.index].setText("대조동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광동":
			crolling.area += ",I2200110";
			Mainpage.Filtering[Mainpage.index].setText("불광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광1동":
			crolling.area += ",I2200080";
			Mainpage.Filtering[Mainpage.index].setText("불광1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불광2동":
			crolling.area += ",I2200090";
			Mainpage.Filtering[Mainpage.index].setText("불광2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수색동":
			crolling.area += ",I2200120";
			Mainpage.Filtering[Mainpage.index].setText("수색동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사동":
			crolling.area += ",I2200150";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사1동":
			crolling.area += ",I2200130";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은평구신사2동":
			crolling.area += ",I2200140";
			Mainpage.Filtering[Mainpage.index].setText("은평구신사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역촌동":
			crolling.area += ",I2200180";
			Mainpage.Filtering[Mainpage.index].setText("역촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암동":
			crolling.area += ",I2200230";
			Mainpage.Filtering[Mainpage.index].setText("응암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암1동":
			crolling.area += ",I2200190";
			Mainpage.Filtering[Mainpage.index].setText("응암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암2동":
			crolling.area += ",I2200200";
			Mainpage.Filtering[Mainpage.index].setText("응암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응암3동":
			crolling.area += ",I2200210";
			Mainpage.Filtering[Mainpage.index].setText("응암3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증산동":
			crolling.area += ",I2200240";
			Mainpage.Filtering[Mainpage.index].setText("증산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진관동":
			crolling.area += ",I2200250";
			Mainpage.Filtering[Mainpage.index].setText("진관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가회동":
			crolling.area += ",I2300010";
			Mainpage.Filtering[Mainpage.index].setText("가회동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "견지동":
			crolling.area += ",I2300020";
			Mainpage.Filtering[Mainpage.index].setText("견지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경운동":
			crolling.area += ",I2300030";
			Mainpage.Filtering[Mainpage.index].setText("경운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계동":
			crolling.area += ",I2300040";
			Mainpage.Filtering[Mainpage.index].setText("계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공평동":
			crolling.area += ",I2300050";
			Mainpage.Filtering[Mainpage.index].setText("공평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관수동":
			crolling.area += ",I2300060";
			Mainpage.Filtering[Mainpage.index].setText("관수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관철동":
			crolling.area += ",I2300070";
			Mainpage.Filtering[Mainpage.index].setText("관철동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관훈동":
			crolling.area += ",I2300080";
			Mainpage.Filtering[Mainpage.index].setText("관훈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교남동":
			crolling.area += ",I2300090";
			Mainpage.Filtering[Mainpage.index].setText("교남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교북동":
			crolling.area += ",I2300100";
			Mainpage.Filtering[Mainpage.index].setText("교북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구기동":
			crolling.area += ",I2300110";
			Mainpage.Filtering[Mainpage.index].setText("구기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁정동":
			crolling.area += ",I2300120";
			Mainpage.Filtering[Mainpage.index].setText("궁정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권농동":
			crolling.area += ",I2300130";
			Mainpage.Filtering[Mainpage.index].setText("권농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			crolling.area += ",I2300140";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내수동":
			crolling.area += ",I2300150";
			Mainpage.Filtering[Mainpage.index].setText("내수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내자동":
			crolling.area += ",I2300160";
			Mainpage.Filtering[Mainpage.index].setText("내자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누상동":
			crolling.area += ",I2300170";
			Mainpage.Filtering[Mainpage.index].setText("누상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누하동":
			crolling.area += ",I2300180";
			Mainpage.Filtering[Mainpage.index].setText("누하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당주동":
			crolling.area += ",I2300190";
			Mainpage.Filtering[Mainpage.index].setText("당주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도렴동":
			crolling.area += ",I2300200";
			Mainpage.Filtering[Mainpage.index].setText("도렴동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈의동":
			crolling.area += ",I2300210";
			Mainpage.Filtering[Mainpage.index].setText("돈의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동숭동":
			crolling.area += ",I2300220";
			Mainpage.Filtering[Mainpage.index].setText("동숭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜1가":
			crolling.area += ",I2300230";
			Mainpage.Filtering[Mainpage.index].setText("명륜1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜2가":
			crolling.area += ",I2300240";
			Mainpage.Filtering[Mainpage.index].setText("명륜2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜3가":
			crolling.area += ",I2300250";
			Mainpage.Filtering[Mainpage.index].setText("명륜3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜4가":
			crolling.area += ",I2300260";
			Mainpage.Filtering[Mainpage.index].setText("명륜4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘동":
			crolling.area += ",I2300270";
			Mainpage.Filtering[Mainpage.index].setText("묘동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무악동":
			crolling.area += ",I2300280";
			Mainpage.Filtering[Mainpage.index].setText("무악동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉익동":
			crolling.area += ",I2300290";
			Mainpage.Filtering[Mainpage.index].setText("봉익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부암동":
			crolling.area += ",I2300300";
			Mainpage.Filtering[Mainpage.index].setText("부암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사간동":
			crolling.area += ",I2300310";
			Mainpage.Filtering[Mainpage.index].setText("사간동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",I2300320";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼청동":
			crolling.area += ",I2300330";
			Mainpage.Filtering[Mainpage.index].setText("삼청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서린동":
			crolling.area += ",I2300340";
			Mainpage.Filtering[Mainpage.index].setText("서린동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세종로":
			crolling.area += ",I2300350";
			Mainpage.Filtering[Mainpage.index].setText("세종로");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소격동":
			crolling.area += ",I2300360";
			Mainpage.Filtering[Mainpage.index].setText("소격동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동":
			crolling.area += ",I2300370";
			Mainpage.Filtering[Mainpage.index].setText("송월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			crolling.area += ",I2300380";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수송동":
			crolling.area += ",I2300390";
			Mainpage.Filtering[Mainpage.index].setText("수송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			crolling.area += ",I2300420";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인1동":
			crolling.area += ",I2300400";
			Mainpage.Filtering[Mainpage.index].setText("숭인1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인2동":
			crolling.area += ",I2300410";
			Mainpage.Filtering[Mainpage.index].setText("숭인2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신교동":
			crolling.area += ",I2300430";
			Mainpage.Filtering[Mainpage.index].setText("신교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문로1가":
			crolling.area += ",I2300440";
			Mainpage.Filtering[Mainpage.index].setText("신문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신문로2가":
			crolling.area += ",I2300450";
			Mainpage.Filtering[Mainpage.index].setText("신문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신영동":
			crolling.area += ",I2300460";
			Mainpage.Filtering[Mainpage.index].setText("신영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안국동":
			crolling.area += "I2300470";
			Mainpage.Filtering[Mainpage.index].setText("안국동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연건동":
			crolling.area += ",I2300480";
			Mainpage.Filtering[Mainpage.index].setText("연건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			crolling.area += ",I2300490";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예지동":
			crolling.area += ",I2300500";
			Mainpage.Filtering[Mainpage.index].setText("예지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥인동":
			crolling.area += ",I2300510";
			Mainpage.Filtering[Mainpage.index].setText("옥인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡동":
			crolling.area += ",I2300520";
			Mainpage.Filtering[Mainpage.index].setText("와룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운니동":
			crolling.area += ",I2300530";
			Mainpage.Filtering[Mainpage.index].setText("운니동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원남동":
			crolling.area += ",I2300540";
			Mainpage.Filtering[Mainpage.index].setText("원남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원서동":
			crolling.area += ",I2300550";
			Mainpage.Filtering[Mainpage.index].setText("원서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이화동":
			crolling.area += ",I2300560";
			Mainpage.Filtering[Mainpage.index].setText("이화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "익선동":
			crolling.area += ",I2300570";
			Mainpage.Filtering[Mainpage.index].setText("익선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인사동":
			crolling.area += ",I2300580";
			Mainpage.Filtering[Mainpage.index].setText("인사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인의동":
			crolling.area += ",I2300590";
			Mainpage.Filtering[Mainpage.index].setText("인의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장사동":
			crolling.area += ",I2300600";
			Mainpage.Filtering[Mainpage.index].setText("장사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재동":
			crolling.area += ",I2300610";
			Mainpage.Filtering[Mainpage.index].setText("재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적선동":
			crolling.area += ",I2300620";
			Mainpage.Filtering[Mainpage.index].setText("적선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로1가":
			crolling.area += ",I2300630";
			Mainpage.Filtering[Mainpage.index].setText("종로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로2가":
			crolling.area += ",I2300640";
			Mainpage.Filtering[Mainpage.index].setText("종로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로3가":
			crolling.area += ",I2300650";
			Mainpage.Filtering[Mainpage.index].setText("종로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로4가":
			crolling.area += ",I2300660";
			Mainpage.Filtering[Mainpage.index].setText("종로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로5가":
			crolling.area += ",I2300670";
			Mainpage.Filtering[Mainpage.index].setText("종로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종로6가":
			crolling.area += ",I2300680";
			Mainpage.Filtering[Mainpage.index].setText("종로6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중학동":
			crolling.area += ",I2300690";
			Mainpage.Filtering[Mainpage.index].setText("중학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창성동":
			crolling.area += ",I2300700";
			Mainpage.Filtering[Mainpage.index].setText("창성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신동":
			crolling.area += ",I2300740";
			Mainpage.Filtering[Mainpage.index].setText("창신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신1동":
			crolling.area += ",I2300710";
			Mainpage.Filtering[Mainpage.index].setText("창신1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신2동":
			crolling.area += ",I2300720";
			Mainpage.Filtering[Mainpage.index].setText("창신2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창신3동":
			crolling.area += ",I2300730";
			Mainpage.Filtering[Mainpage.index].setText("창신3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청운동":
			crolling.area += ",I2300750";
			Mainpage.Filtering[Mainpage.index].setText("청운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청진동":
			crolling.area += ",I2300760";
			Mainpage.Filtering[Mainpage.index].setText("청진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "체부동":
			crolling.area += ",I2300770";
			Mainpage.Filtering[Mainpage.index].setText("체부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충신동":
			crolling.area += ",I2300780";
			Mainpage.Filtering[Mainpage.index].setText("충신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통의동":
			crolling.area += ",I2300790";
			Mainpage.Filtering[Mainpage.index].setText("통의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통인동":
			crolling.area += ",I2300800";
			Mainpage.Filtering[Mainpage.index].setText("통인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔판동":
			crolling.area += ",I2300810";
			Mainpage.Filtering[Mainpage.index].setText("팔판동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",I2300820";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평창동":
			crolling.area += ",I2300830";
			Mainpage.Filtering[Mainpage.index].setText("평창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필운동":
			crolling.area += ",I2300840";
			Mainpage.Filtering[Mainpage.index].setText("필운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행촌동":
			crolling.area += ",I2300850";
			Mainpage.Filtering[Mainpage.index].setText("행촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "혜화동":
			crolling.area += ",I2300860";
			Mainpage.Filtering[Mainpage.index].setText("혜화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍지동":
			crolling.area += ",I2300870";
			Mainpage.Filtering[Mainpage.index].setText("홍지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍파동":
			crolling.area += ",I2300880";
			Mainpage.Filtering[Mainpage.index].setText("홍파동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화동":
			crolling.area += ",I2300890";
			Mainpage.Filtering[Mainpage.index].setText("화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			crolling.area += ",I2300900";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호제동":
			crolling.area += ",I2300910";
			Mainpage.Filtering[Mainpage.index].setText("호제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "훈정동":
			crolling.area += ",I2300920";
			Mainpage.Filtering[Mainpage.index].setText("훈정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광희동1가":
			crolling.area += ",I2400010";
			Mainpage.Filtering[Mainpage.index].setText("광희동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광희동2가":
			crolling.area += ",I2400020";
			Mainpage.Filtering[Mainpage.index].setText("광희동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로1가":
			crolling.area += ",I2400030";
			Mainpage.Filtering[Mainpage.index].setText("남대문로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로2가":
			crolling.area += ",I2400040";
			Mainpage.Filtering[Mainpage.index].setText("남대문로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로3가":
			crolling.area += ",I2400050";
			Mainpage.Filtering[Mainpage.index].setText("남대문로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로4가":
			crolling.area += ",I2400060";
			Mainpage.Filtering[Mainpage.index].setText("남대문로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남대문로5가":
			crolling.area += ",I2400070";
			Mainpage.Filtering[Mainpage.index].setText("남대문로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동1가":
			crolling.area += ",I2400080";
			Mainpage.Filtering[Mainpage.index].setText("남산동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동2가":
			crolling.area += ",I2400090";
			Mainpage.Filtering[Mainpage.index].setText("남산동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동3가":
			crolling.area += ",I2400100";
			Mainpage.Filtering[Mainpage.index].setText("남산동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남창동":
			crolling.area += ",I2400110";
			Mainpage.Filtering[Mainpage.index].setText("남창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남학동":
			crolling.area += ",I2400120";
			Mainpage.Filtering[Mainpage.index].setText("남학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다동":
			crolling.area += ",I2400130";
			Mainpage.Filtering[Mainpage.index].setText("다동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산동":
			crolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동화동":
			crolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("동화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만리동1가":
			crolling.area += ",I2400140";
			Mainpage.Filtering[Mainpage.index].setText("만리동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만리동2가":
			crolling.area += ",I2400150";
			Mainpage.Filtering[Mainpage.index].setText("만리동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동1가":
			crolling.area += ",I2400160";
			Mainpage.Filtering[Mainpage.index].setText("명동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명동2가":
			crolling.area += ",I2400170";
			Mainpage.Filtering[Mainpage.index].setText("명동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무교동":
			crolling.area += ",I2400180";
			Mainpage.Filtering[Mainpage.index].setText("무교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무학동":
			crolling.area += ",I2400190";
			Mainpage.Filtering[Mainpage.index].setText("무학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵정동":
			crolling.area += ",I2400200";
			Mainpage.Filtering[Mainpage.index].setText("묵정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산동":
			crolling.area += ",I2400210";
			Mainpage.Filtering[Mainpage.index].setText("방산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동1가":
			crolling.area += ",I2400220";
			Mainpage.Filtering[Mainpage.index].setText("봉래동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래동2가":
			crolling.area += ",I2400230";
			Mainpage.Filtering[Mainpage.index].setText("봉래동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북창동":
			crolling.area += ",I2400240";
			Mainpage.Filtering[Mainpage.index].setText("북창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산림동":
			crolling.area += ",I2400250";
			Mainpage.Filtering[Mainpage.index].setText("산림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼각동":
			crolling.area += ",I2400260";
			Mainpage.Filtering[Mainpage.index].setText("삼각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서소문동":
			crolling.area += ",I2400270";
			Mainpage.Filtering[Mainpage.index].setText("서소문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소공동":
			crolling.area += ",I2400280";
			Mainpage.Filtering[Mainpage.index].setText("소공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수표동":
			crolling.area += ",I2400290";
			Mainpage.Filtering[Mainpage.index].setText("수표동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수하동":
			crolling.area += ",I2400300";
			Mainpage.Filtering[Mainpage.index].setText("수하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순화동":
			crolling.area += ",I2400310";
			Mainpage.Filtering[Mainpage.index].setText("순화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당동":
			crolling.area += ",I2400380";
			Mainpage.Filtering[Mainpage.index].setText("신당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당1동":
			crolling.area += ",I2400320";
			Mainpage.Filtering[Mainpage.index].setText("신당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당5동":
			crolling.area += ",I2400360";
			Mainpage.Filtering[Mainpage.index].setText("신당5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍림동":
			crolling.area += ",I2400390";
			Mainpage.Filtering[Mainpage.index].setText("쌍림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약수동":
			crolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("약수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예관동":
			crolling.area += ",I2400400";
			Mainpage.Filtering[Mainpage.index].setText("예관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예장동":
			crolling.area += ",I2400410";
			Mainpage.Filtering[Mainpage.index].setText("예장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오장동":
			crolling.area += ",I2400420";
			Mainpage.Filtering[Mainpage.index].setText("오장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로1가":
			crolling.area += ",I2400430";
			Mainpage.Filtering[Mainpage.index].setText("을지로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로2가":
			crolling.area += ",I2400440";
			Mainpage.Filtering[Mainpage.index].setText("을지로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로3가":
			crolling.area += ",I2400450";
			Mainpage.Filtering[Mainpage.index].setText("을지로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로4가":
			crolling.area += ",I2400460";
			Mainpage.Filtering[Mainpage.index].setText("을지로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로5가":
			crolling.area += ",I2400470";
			Mainpage.Filtering[Mainpage.index].setText("을지로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로6가":
			crolling.area += ",I2400480";
			Mainpage.Filtering[Mainpage.index].setText("을지로6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "을지로7가":
			crolling.area += ",I2400490";
			Mainpage.Filtering[Mainpage.index].setText("을지로7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의주로1가":
			crolling.area += ",I2400500";
			Mainpage.Filtering[Mainpage.index].setText("의주로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의주로2가":
			crolling.area += ",I2400510";
			Mainpage.Filtering[Mainpage.index].setText("의주로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동1가":
			crolling.area += ",I2400520";
			Mainpage.Filtering[Mainpage.index].setText("인현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인현동2가":
			crolling.area += ",I2400530";
			Mainpage.Filtering[Mainpage.index].setText("인현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입정동":
			crolling.area += ",I2400540";
			Mainpage.Filtering[Mainpage.index].setText("입정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장교동":
			crolling.area += ",I2400550";
			Mainpage.Filtering[Mainpage.index].setText("장교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장충동1가":
			crolling.area += ",I2400560";
			Mainpage.Filtering[Mainpage.index].setText("장충동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장충동2가":
			crolling.area += ",I2400570";
			Mainpage.Filtering[Mainpage.index].setText("장충동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동1가":
			crolling.area += "I2400580";
			Mainpage.Filtering[Mainpage.index].setText("저동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동2가":
			crolling.area += ",I2400590";
			Mainpage.Filtering[Mainpage.index].setText("저동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정동":
			crolling.area += ",I2400600";
			Mainpage.Filtering[Mainpage.index].setText("정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교동":
			crolling.area += ",I2400610";
			Mainpage.Filtering[Mainpage.index].setText("주교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주자동":
			crolling.area += ",I2400620";
			Mainpage.Filtering[Mainpage.index].setText("주자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중림동":
			crolling.area += ",I2400630";
			Mainpage.Filtering[Mainpage.index].setText("중림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청구동":
			crolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("청구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초동":
			crolling.area += ",I2400640";
			Mainpage.Filtering[Mainpage.index].setText("초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로1가":
			crolling.area += ",I2400650";
			Mainpage.Filtering[Mainpage.index].setText("충무로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로2가":
			crolling.area += ",I2400660";
			Mainpage.Filtering[Mainpage.index].setText("충무로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로3가":
			crolling.area += ",I2400670";
			Mainpage.Filtering[Mainpage.index].setText("충무로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로4가":
			crolling.area += ",I2400680";
			Mainpage.Filtering[Mainpage.index].setText("충무로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무로5가":
			crolling.area += ",I2400690";
			Mainpage.Filtering[Mainpage.index].setText("충무로5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로1가":
			crolling.area += ",I2400700";
			Mainpage.Filtering[Mainpage.index].setText("충정로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로1가":
			crolling.area += ",I2400710";
			Mainpage.Filtering[Mainpage.index].setText("태평로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평로2가":
			crolling.area += ",I2400720";
			Mainpage.Filtering[Mainpage.index].setText("태평로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동1가":
			crolling.area += ",I2400730";
			Mainpage.Filtering[Mainpage.index].setText("필동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동2가":
			crolling.area += ",I2400740";
			Mainpage.Filtering[Mainpage.index].setText("필동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "필동3가":
			crolling.area += ",I2400750";
			Mainpage.Filtering[Mainpage.index].setText("필동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황학동":
			crolling.area += ",I2400760";
			Mainpage.Filtering[Mainpage.index].setText("황학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동1가":
			crolling.area += ",I2400770";
			Mainpage.Filtering[Mainpage.index].setText("회현동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동2가":
			crolling.area += ",I2400780";
			Mainpage.Filtering[Mainpage.index].setText("회현동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회현동3가":
			crolling.area += ",I2400790";
			Mainpage.Filtering[Mainpage.index].setText("회현동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥인동":
			crolling.area += ",I2400800";
			Mainpage.Filtering[Mainpage.index].setText("흥인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우동":
			crolling.area += ",I2500040";
			Mainpage.Filtering[Mainpage.index].setText("망우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우3동":
			crolling.area += ",I2500030";
			Mainpage.Filtering[Mainpage.index].setText("망우3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망우본동":
			crolling.area += ",I2500010";
			Mainpage.Filtering[Mainpage.index].setText("망우본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목동":
			crolling.area += ",I2500130";
			Mainpage.Filtering[Mainpage.index].setText("면목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목2동":
			crolling.area += ",I2500060";
			Mainpage.Filtering[Mainpage.index].setText("면목2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목3.8동":
			crolling.area += ",I2500070";
			Mainpage.Filtering[Mainpage.index].setText("면목3.8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목4동":
			crolling.area += ",I2500080";
			Mainpage.Filtering[Mainpage.index].setText("면목4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목5동":
			crolling.area += ",I2500090";
			Mainpage.Filtering[Mainpage.index].setText("면목5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목7동":
			crolling.area += ",I2500110";
			Mainpage.Filtering[Mainpage.index].setText("면목7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면목본동":
			crolling.area += ",I2500050";
			Mainpage.Filtering[Mainpage.index].setText("면목본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵동":
			crolling.area += ",I2500160";
			Mainpage.Filtering[Mainpage.index].setText("묵동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵1동":
			crolling.area += ",I2500140";
			Mainpage.Filtering[Mainpage.index].setText("묵1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵2동":
			crolling.area += ",I2500150";
			Mainpage.Filtering[Mainpage.index].setText("묵2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉동":
			crolling.area += ",I2500190";
			Mainpage.Filtering[Mainpage.index].setText("상봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉1동":
			crolling.area += ",I2500170";
			Mainpage.Filtering[Mainpage.index].setText("상봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉2동":
			crolling.area += ",I2500180";
			Mainpage.Filtering[Mainpage.index].setText("상봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내동":
			crolling.area += ",I2500220";
			Mainpage.Filtering[Mainpage.index].setText("신내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내1동":
			crolling.area += ",I2500200";
			Mainpage.Filtering[Mainpage.index].setText("신내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신내2동":
			crolling.area += ",I2500210";
			Mainpage.Filtering[Mainpage.index].setText("신내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화동":
			crolling.area += ",I2500260";
			Mainpage.Filtering[Mainpage.index].setText("중화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화1동":
			crolling.area += ",I2500230";
			Mainpage.Filtering[Mainpage.index].setText("중화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중화2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("중화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
