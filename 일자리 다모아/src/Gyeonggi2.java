import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class Gyeonggi2 {
	boolean flag;

	public void Gyeonggi(ActionEvent e) {
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
			crolling.area += ",I1800030";
			Mainpage.Filtering[Mainpage.index].setText("가사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가현동":
			crolling.area += ",I1800010";
			Mainpage.Filtering[Mainpage.index].setText("가현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계동":
			crolling.area += ",I1800020";
			Mainpage.Filtering[Mainpage.index].setText("계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고삼면":
			crolling.area += "I1800040";
			Mainpage.Filtering[Mainpage.index].setText("고삼면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공도읍":
			crolling.area += ",I1800070";
			Mainpage.Filtering[Mainpage.index].setText("공도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구포동":
			crolling.area += ",I1800050";
			Mainpage.Filtering[Mainpage.index].setText("구포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광면":
			crolling.area += ",I1800060";
			Mainpage.Filtering[Mainpage.index].setText("금광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산동":
			crolling.area += "I1800100";
			Mainpage.Filtering[Mainpage.index].setText("금산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금석동":
			crolling.area += ",I1800080";
			Mainpage.Filtering[Mainpage.index].setText("금석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			crolling.area += ",I1800090";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당왕동":
			crolling.area += ",I1800130";
			Mainpage.Filtering[Mainpage.index].setText("당왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕면":
			crolling.area += ",I1800110";
			Mainpage.Filtering[Mainpage.index].setText("대덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천동":
			crolling.area += "I1800120";
			Mainpage.Filtering[Mainpage.index].setText("대천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도기동":
			crolling.area += ",I1800160";
			Mainpage.Filtering[Mainpage.index].setText("도기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동본동":
			crolling.area += ",I1800140";
			Mainpage.Filtering[Mainpage.index].setText("동본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",I1800150";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미양면":
			crolling.area += "I1800170";
			Mainpage.Filtering[Mainpage.index].setText("미양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "발화동":
			crolling.area += ",I1800180";
			Mainpage.Filtering[Mainpage.index].setText("발화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보개면":
			crolling.area += ",I1800210";
			Mainpage.Filtering[Mainpage.index].setText("보개면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉남동":
			crolling.area += ",I1800190";
			Mainpage.Filtering[Mainpage.index].setText("봉남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			crolling.area += ",I1800200";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사곡동":
			crolling.area += ",I1800220";
			Mainpage.Filtering[Mainpage.index].setText("사곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼죽면":
			crolling.area += ",I1800230";
			Mainpage.Filtering[Mainpage.index].setText("삼죽면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서운면":
			crolling.area += ",I1800240";
			Mainpage.Filtering[Mainpage.index].setText("서운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서인동":
			crolling.area += ",I1800380";
			Mainpage.Filtering[Mainpage.index].setText("서인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석정동":
			crolling.area += ",I1800320";
			Mainpage.Filtering[Mainpage.index].setText("석정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",I1800260";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "숭인동":
			crolling.area += ",I1800270";
			Mainpage.Filtering[Mainpage.index].setText("숭인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신건지동":
			crolling.area += ",I1800280";
			Mainpage.Filtering[Mainpage.index].setText("신건지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신모산동":
			crolling.area += ",I1800300";
			Mainpage.Filtering[Mainpage.index].setText("신모산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신소현동":
			crolling.area += ",I1800310";
			Mainpage.Filtering[Mainpage.index].setText("신소현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",I1800330";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아양동":
			crolling.area += ",I1800340";
			Mainpage.Filtering[Mainpage.index].setText("아양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성1동":
			crolling.area += ",I1800370";
			Mainpage.Filtering[Mainpage.index].setText("안성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성2동":
			crolling.area += ",I1800350";
			Mainpage.Filtering[Mainpage.index].setText("안성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안성3동":
			crolling.area += ",I1800360";
			Mainpage.Filtering[Mainpage.index].setText("안성3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양성면":
			crolling.area += ",I1900070";
			Mainpage.Filtering[Mainpage.index].setText("양성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연지동":
			crolling.area += ",I1900010";
			Mainpage.Filtering[Mainpage.index].setText("연지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동동":
			crolling.area += ",I1900020";
			Mainpage.Filtering[Mainpage.index].setText("영동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산동":
			crolling.area += ",I1900030";
			Mainpage.Filtering[Mainpage.index].setText("옥산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			crolling.area += ",I1900040";
			Mainpage.Filtering[Mainpage.index].setText("옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원곡면":
			crolling.area += ",I1900050";
			Mainpage.Filtering[Mainpage.index].setText("원곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인지동":
			crolling.area += ",I1900150";
			Mainpage.Filtering[Mainpage.index].setText("인지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일죽면":
			crolling.area += ",I1900080";
			Mainpage.Filtering[Mainpage.index].setText("일죽면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽산면":
			crolling.area += ",I1900090";
			Mainpage.Filtering[Mainpage.index].setText("죽산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중리동":
			crolling.area += ",I1900100";
			Mainpage.Filtering[Mainpage.index].setText("중리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창전동":
			crolling.area += ",I1900110";
			Mainpage.Filtering[Mainpage.index].setText("창전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현수동":
			crolling.area += ",I1900120";
			Mainpage.Filtering[Mainpage.index].setText("현수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길산동":
			crolling.area += ",I1900130";
			Mainpage.Filtering[Mainpage.index].setText("길산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관양동":
			crolling.area += ",I1900140";
			Mainpage.Filtering[Mainpage.index].setText("관양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관양1동":
			crolling.area += ",I1900230";
			Mainpage.Filtering[Mainpage.index].setText("관양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관양2동":
			crolling.area += ",I1900160";
			Mainpage.Filtering[Mainpage.index].setText("관양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀인동":
			crolling.area += ",I1900170";
			Mainpage.Filtering[Mainpage.index].setText("귀인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달안동":
			crolling.area += ",I1900180";
			Mainpage.Filtering[Mainpage.index].setText("달안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범계동":
			crolling.area += ",I1900190";
			Mainpage.Filtering[Mainpage.index].setText("범계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			crolling.area += ",I1900210";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부흥동":
			crolling.area += ",I1900220";
			Mainpage.Filtering[Mainpage.index].setText("부흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산동":
			crolling.area += ",I2000010";
			Mainpage.Filtering[Mainpage.index].setText("비산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산1동":
			crolling.area += ",I2000020";
			Mainpage.Filtering[Mainpage.index].setText("비산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산2동":
			crolling.area += ",I2000030";
			Mainpage.Filtering[Mainpage.index].setText("비산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비산3동":
			crolling.area += ",I2000040";
			Mainpage.Filtering[Mainpage.index].setText("비산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",I2000050";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평안동":
			crolling.area += ",I2000060";
			Mainpage.Filtering[Mainpage.index].setText("평안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평촌동":
			crolling.area += ",I2000070";
			Mainpage.Filtering[Mainpage.index].setText("평촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계동":
			crolling.area += ",I2000110";
			Mainpage.Filtering[Mainpage.index].setText("호계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계1동":
			crolling.area += ",I2000080";
			Mainpage.Filtering[Mainpage.index].setText("호계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계2동":
			crolling.area += ",I2000090";
			Mainpage.Filtering[Mainpage.index].setText("호계2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호계3동":
			crolling.area += "I2000100";
			Mainpage.Filtering[Mainpage.index].setText("호계3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박달동":
			crolling.area += ",I2000140";
			Mainpage.Filtering[Mainpage.index].setText("박달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박달1동":
			crolling.area += ",I2000150";
			Mainpage.Filtering[Mainpage.index].setText("박달1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박달2동":
			crolling.area += ",I2000160";
			Mainpage.Filtering[Mainpage.index].setText("박달2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수동":
			crolling.area += ",I2000170";
			Mainpage.Filtering[Mainpage.index].setText("석수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수1동":
			crolling.area += ",I2000180";
			Mainpage.Filtering[Mainpage.index].setText("석수1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수2동":
			crolling.area += ",I2000190";
			Mainpage.Filtering[Mainpage.index].setText("석수2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석수3동":
			crolling.area += ",I2000200";
			Mainpage.Filtering[Mainpage.index].setText("석수3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양동":
			crolling.area += ",I2000210";
			Mainpage.Filtering[Mainpage.index].setText("안양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양1동":
			crolling.area += ",I2000290";
			Mainpage.Filtering[Mainpage.index].setText("안양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양2동":
			crolling.area += ",I2000220";
			Mainpage.Filtering[Mainpage.index].setText("안양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양3동":
			crolling.area += ",I2000240";
			Mainpage.Filtering[Mainpage.index].setText("안양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양4동":
			crolling.area += ",I2000250";
			Mainpage.Filtering[Mainpage.index].setText("안양4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양5동":
			crolling.area += ",I2000260";
			Mainpage.Filtering[Mainpage.index].setText("안양5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양6동":
			crolling.area += ",I2000270";
			Mainpage.Filtering[Mainpage.index].setText("안양6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양7동":
			crolling.area += ",I2000280";
			Mainpage.Filtering[Mainpage.index].setText("안양7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양8동":
			crolling.area += ",I2000300";
			Mainpage.Filtering[Mainpage.index].setText("안양8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양9동":
			crolling.area += ",I2000310";
			Mainpage.Filtering[Mainpage.index].setText("안양9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고암동":
			crolling.area += ",I2000320";
			Mainpage.Filtering[Mainpage.index].setText("고암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고읍동":
			crolling.area += ",I2000330";
			Mainpage.Filtering[Mainpage.index].setText("고읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광사동":
			crolling.area += ",I2000340";
			Mainpage.Filtering[Mainpage.index].setText("광사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광적면":
			crolling.area += ",I2000350";
			Mainpage.Filtering[Mainpage.index].setText("광적면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",I2000360";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남방동":
			crolling.area += ",I2000370";
			Mainpage.Filtering[Mainpage.index].setText("남방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕계동":
			crolling.area += ",I2000380";
			Mainpage.Filtering[Mainpage.index].setText("덕계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕정동":
			crolling.area += ",I2000390";
			Mainpage.Filtering[Mainpage.index].setText("덕정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마전동":
			crolling.area += ",I2000400";
			Mainpage.Filtering[Mainpage.index].setText("마전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만송동":
			crolling.area += ",I2000410";
			Mainpage.Filtering[Mainpage.index].setText("만송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석읍":
			crolling.area += ",I2000420";
			Mainpage.Filtering[Mainpage.index].setText("백석읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉양동":
			crolling.area += ",I2000430";
			Mainpage.Filtering[Mainpage.index].setText("봉양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북동":
			crolling.area += ",I2000440";
			Mainpage.Filtering[Mainpage.index].setText("산북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼숭동":
			crolling.area += ",I2000450";
			Mainpage.Filtering[Mainpage.index].setText("삼숭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어둔동":
			crolling.area += ",I2000460";
			Mainpage.Filtering[Mainpage.index].setText("어둔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥정동":
			crolling.area += ",I2000470";
			Mainpage.Filtering[Mainpage.index].setText("옥정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유양동":
			crolling.area += ",I2000230";
			Mainpage.Filtering[Mainpage.index].setText("유양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율정동":
			crolling.area += ",I2100010";
			Mainpage.Filtering[Mainpage.index].setText("율정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은현면":
			crolling.area += ",I2100020";
			Mainpage.Filtering[Mainpage.index].setText("은현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증흥면":
			crolling.area += ",I2100030";
			Mainpage.Filtering[Mainpage.index].setText("증흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회암동":
			crolling.area += ",I2100040";
			Mainpage.Filtering[Mainpage.index].setText("회암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회정동":
			crolling.area += ",I2100050";
			Mainpage.Filtering[Mainpage.index].setText("회정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강상면":
			crolling.area += ",I2100060";
			Mainpage.Filtering[Mainpage.index].setText("강상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강하면":
			crolling.area += ",I2100070";
			Mainpage.Filtering[Mainpage.index].setText("강하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개군면":
			crolling.area += "I2100080";
			Mainpage.Filtering[Mainpage.index].setText("개군면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단월면":
			crolling.area += ",I2100090";
			Mainpage.Filtering[Mainpage.index].setText("단월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서종면":
			crolling.area += ",I2100100";
			Mainpage.Filtering[Mainpage.index].setText("서종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양동면":
			crolling.area += ",I2100110";
			Mainpage.Filtering[Mainpage.index].setText("양동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양서면":
			crolling.area += ",I2100120";
			Mainpage.Filtering[Mainpage.index].setText("양서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양평읍":
			crolling.area += ",I2100130";
			Mainpage.Filtering[Mainpage.index].setText("양평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천면":
			crolling.area += ",I2100140";
			Mainpage.Filtering[Mainpage.index].setText("옥천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문면":
			crolling.area += ",I2100150";
			Mainpage.Filtering[Mainpage.index].setText("용문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지평면":
			crolling.area += ",I2100160";
			Mainpage.Filtering[Mainpage.index].setText("지평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청운면":
			crolling.area += ",I2100170";
			Mainpage.Filtering[Mainpage.index].setText("청운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가남읍":
			crolling.area += ",I2100180";
			Mainpage.Filtering[Mainpage.index].setText("가남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가업동":
			crolling.area += ",I2100190";
			Mainpage.Filtering[Mainpage.index].setText("가업동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강천면":
			crolling.area += ",I2100200";
			Mainpage.Filtering[Mainpage.index].setText("강천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",I2100210";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금사면":
			crolling.area += ",I2100220";
			Mainpage.Filtering[Mainpage.index].setText("금사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능서면":
			crolling.area += ",I2100230";
			Mainpage.Filtering[Mainpage.index].setText("능서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능현동":
			crolling.area += ",I2100260";
			Mainpage.Filtering[Mainpage.index].setText("능현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단현동":
			crolling.area += ",I2100240";
			Mainpage.Filtering[Mainpage.index].setText("단현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대신면":
			crolling.area += ",I2100250";
			Mainpage.Filtering[Mainpage.index].setText("대신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매룡동":
			crolling.area += ",I2100290";
			Mainpage.Filtering[Mainpage.index].setText("매룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "멱곡동":
			crolling.area += ",I2100270";
			Mainpage.Filtering[Mainpage.index].setText("멱곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북내면":
			crolling.area += ",I2100280";
			Mainpage.Filtering[Mainpage.index].setText("북내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산북면":
			crolling.area += ",I2100300";
			Mainpage.Filtering[Mainpage.index].setText("산북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼교동":
			crolling.area += ",I2100310";
			Mainpage.Filtering[Mainpage.index].setText("삼교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상거동":
			crolling.area += ",I2100320";
			Mainpage.Filtering[Mainpage.index].setText("상거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",I2100330";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신진동":
			crolling.area += ",I2100340";
			Mainpage.Filtering[Mainpage.index].setText("신진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여흥동":
			crolling.area += ",I2100350";
			Mainpage.Filtering[Mainpage.index].setText("여흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연라동":
			crolling.area += ",I2100360";
			Mainpage.Filtering[Mainpage.index].setText("연라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연양동":
			crolling.area += ",I2100370";
			Mainpage.Filtering[Mainpage.index].setText("연양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			crolling.area += ",I2100400";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오학동":
			crolling.area += ",I2100410";
			Mainpage.Filtering[Mainpage.index].setText("오학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만동":
			crolling.area += ",I2100420";
			Mainpage.Filtering[Mainpage.index].setText("우만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월송동":
			crolling.area += ",I2200030";
			Mainpage.Filtering[Mainpage.index].setText("월송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점동면":
			crolling.area += ",I2200010";
			Mainpage.Filtering[Mainpage.index].setText("점동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점봉동":
			crolling.area += ",I2200020";
			Mainpage.Filtering[Mainpage.index].setText("점봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",I2200040";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			crolling.area += ",I2200060";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천송동":
			crolling.area += ",I2200070";
			Mainpage.Filtering[Mainpage.index].setText("천송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하거동":
			crolling.area += ",I2200110";
			Mainpage.Filtering[Mainpage.index].setText("하거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			crolling.area += ",I2200080";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현암동":
			crolling.area += ",I2200090";
			Mainpage.Filtering[Mainpage.index].setText("현암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍문동":
			crolling.area += ",I2200120";
			Mainpage.Filtering[Mainpage.index].setText("홍문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥천면":
			crolling.area += ",I2200150";
			Mainpage.Filtering[Mainpage.index].setText("흥천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군남면":
			crolling.area += ",I2200130";
			Mainpage.Filtering[Mainpage.index].setText("군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미산면":
			crolling.area += ",I2200140";
			Mainpage.Filtering[Mainpage.index].setText("미산면은평구신사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백학면":
			crolling.area += ",I2200180";
			Mainpage.Filtering[Mainpage.index].setText("백학면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신서면":
			crolling.area += ",I2200230";
			Mainpage.Filtering[Mainpage.index].setText("신서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연천읍":
			crolling.area += ",I2200190";
			Mainpage.Filtering[Mainpage.index].setText("연천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와징면":
			crolling.area += ",I2200200";
			Mainpage.Filtering[Mainpage.index].setText("와징면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장남면":
			crolling.area += ",I2200210";
			Mainpage.Filtering[Mainpage.index].setText("장남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전곡읍":
			crolling.area += ",I2200240";
			Mainpage.Filtering[Mainpage.index].setText("전곡읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중면":
			crolling.area += ",I2200250";
			Mainpage.Filtering[Mainpage.index].setText("중면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청산면":
			crolling.area += ",I2300010";
			Mainpage.Filtering[Mainpage.index].setText("청산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가수동":
			crolling.area += ",I2300020";
			Mainpage.Filtering[Mainpage.index].setText("가수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가장동":
			crolling.area += ",I2300030";
			Mainpage.Filtering[Mainpage.index].setText("가장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈곶동":
			crolling.area += ",I2300040";
			Mainpage.Filtering[Mainpage.index].setText("갈곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고현동":
			crolling.area += ",I2300050";
			Mainpage.Filtering[Mainpage.index].setText("고현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궐동":
			crolling.area += ",I2300060";
			Mainpage.Filtering[Mainpage.index].setText("궐동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금암동":
			crolling.area += ",I2300070";
			Mainpage.Filtering[Mainpage.index].setText("금암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내삼미동":
			crolling.area += ",I2300080";
			Mainpage.Filtering[Mainpage.index].setText("내삼미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "누읍동":
			crolling.area += ",I2300090";
			Mainpage.Filtering[Mainpage.index].setText("누읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두곡동":
			crolling.area += ",I2300100";
			Mainpage.Filtering[Mainpage.index].setText("두곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벌음동":
			crolling.area += ",I2300110";
			Mainpage.Filtering[Mainpage.index].setText("벌음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부산동":
			crolling.area += ",I2300120";
			Mainpage.Filtering[Mainpage.index].setText("부산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서동":
			crolling.area += ",I2300130";
			Mainpage.Filtering[Mainpage.index].setText("서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서랑동":
			crolling.area += ",I2300140";
			Mainpage.Filtering[Mainpage.index].setText("서랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세교동":
			crolling.area += ",I2300150";
			Mainpage.Filtering[Mainpage.index].setText("세교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수청동":
			crolling.area += ",I2300160";
			Mainpage.Filtering[Mainpage.index].setText("수청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양산동":
			crolling.area += ",I2300170";
			Mainpage.Filtering[Mainpage.index].setText("양산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산동":
			crolling.area += ",I2300180";
			Mainpage.Filtering[Mainpage.index].setText("오산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외삼미동":
			crolling.area += ",I2300190";
			Mainpage.Filtering[Mainpage.index].setText("외삼미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			crolling.area += ",I2300200";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은계동":
			crolling.area += ",I2300210";
			Mainpage.Filtering[Mainpage.index].setText("은계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곶동":
			crolling.area += ",I2300220";
			Mainpage.Filtering[Mainpage.index].setText("지곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			crolling.area += ",I2300230";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청호동":
			crolling.area += ",I2300240";
			Mainpage.Filtering[Mainpage.index].setText("청호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			crolling.area += ",I2300250";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고매동":
			crolling.area += ",I2300260";
			Mainpage.Filtering[Mainpage.index].setText("고매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공세동":
			crolling.area += ",I2300270";
			Mainpage.Filtering[Mainpage.index].setText("공세동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구갈동":
			crolling.area += ",I2300280";
			Mainpage.Filtering[Mainpage.index].setText("구갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구성동":
			crolling.area += ",I2300290";
			Mainpage.Filtering[Mainpage.index].setText("구성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기흥동":
			crolling.area += ",I2300300";
			Mainpage.Filtering[Mainpage.index].setText("기흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "농서동":
			crolling.area += ",I2300310";
			Mainpage.Filtering[Mainpage.index].setText("농서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동백동":
			crolling.area += ",I2300320";
			Mainpage.Filtering[Mainpage.index].setText("동백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마북동":
			crolling.area += ",I2300330";
			Mainpage.Filtering[Mainpage.index].setText("마북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보라동":
			crolling.area += ",I2300340";
			Mainpage.Filtering[Mainpage.index].setText("보라동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보정동":
			crolling.area += ",I2300350";
			Mainpage.Filtering[Mainpage.index].setText("보정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상갈동":
			crolling.area += ",I2300360";
			Mainpage.Filtering[Mainpage.index].setText("상갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상하동":
			crolling.area += ",I2300370";
			Mainpage.Filtering[Mainpage.index].setText("상하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서농동":
			crolling.area += ",I2300380";
			Mainpage.Filtering[Mainpage.index].setText("서농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서천동":
			crolling.area += ",I2300390";
			Mainpage.Filtering[Mainpage.index].setText("서천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신갈동":
			crolling.area += ",I2300420";
			Mainpage.Filtering[Mainpage.index].setText("신갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "언남동":
			crolling.area += ",I2300400";
			Mainpage.Filtering[Mainpage.index].setText("언남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영덕동":
			crolling.area += ",I2300410";
			Mainpage.Filtering[Mainpage.index].setText("영덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",I2300430";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡동":
			crolling.area += ",I2300440";
			Mainpage.Filtering[Mainpage.index].setText("지곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청덕동":
			crolling.area += ",I2300450";
			Mainpage.Filtering[Mainpage.index].setText("청덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하갈동":
			crolling.area += ",I2300460";
			Mainpage.Filtering[Mainpage.index].setText("하갈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고가동":
			crolling.area += "I2300470";
			Mainpage.Filtering[Mainpage.index].setText("고가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동천동":
			crolling.area += ",I2300480";
			Mainpage.Filtering[Mainpage.index].setText("동천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상현1동":
			crolling.area += ",I2300490";
			Mainpage.Filtering[Mainpage.index].setText("상현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상현2동":
			crolling.area += ",I2300500";
			Mainpage.Filtering[Mainpage.index].setText("상현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상현동":
			crolling.area += ",I2300510";
			Mainpage.Filtering[Mainpage.index].setText("상현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성복동":
			crolling.area += ",I2300520";
			Mainpage.Filtering[Mainpage.index].setText("성복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신봉동":
			crolling.area += ",I2300530";
			Mainpage.Filtering[Mainpage.index].setText("신봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전동":
			crolling.area += ",I2300540";
			Mainpage.Filtering[Mainpage.index].setText("죽전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전1동":
			crolling.area += ",I2300550";
			Mainpage.Filtering[Mainpage.index].setText("죽전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽전2동":
			crolling.area += ",I2300560";
			Mainpage.Filtering[Mainpage.index].setText("죽전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕천동":
			crolling.area += ",I2300570";
			Mainpage.Filtering[Mainpage.index].setText("풍덕천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕천1동":
			crolling.area += ",I2300580";
			Mainpage.Filtering[Mainpage.index].setText("풍덕천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕천2동":
			crolling.area += ",I2300590";
			Mainpage.Filtering[Mainpage.index].setText("풍덕천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고림동":
			crolling.area += ",I2300600";
			Mainpage.Filtering[Mainpage.index].setText("고림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김량장동":
			crolling.area += ",I2300610";
			Mainpage.Filtering[Mainpage.index].setText("김량장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남동":
			crolling.area += ",I2300620";
			Mainpage.Filtering[Mainpage.index].setText("남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남사면":
			crolling.area += ",I2300630";
			Mainpage.Filtering[Mainpage.index].setText("남사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동부동":
			crolling.area += ",I2300640";
			Mainpage.Filtering[Mainpage.index].setText("동부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마평동":
			crolling.area += ",I2300650";
			Mainpage.Filtering[Mainpage.index].setText("마평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모현읍":
			crolling.area += ",I2300660";
			Mainpage.Filtering[Mainpage.index].setText("모현읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백암면":
			crolling.area += ",I2300670";
			Mainpage.Filtering[Mainpage.index].setText("백암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼가동":
			crolling.area += ",I2300680";
			Mainpage.Filtering[Mainpage.index].setText("삼가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양지면":
			crolling.area += ",I2300690";
			Mainpage.Filtering[Mainpage.index].setText("양지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역북동":
			crolling.area += ",I2300700";
			Mainpage.Filtering[Mainpage.index].setText("역북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼동":
			crolling.area += ",I2300740";
			Mainpage.Filtering[Mainpage.index].setText("역삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운학동":
			crolling.area += ",I2300710";
			Mainpage.Filtering[Mainpage.index].setText("운학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원삼면":
			crolling.area += ",I2300720";
			Mainpage.Filtering[Mainpage.index].setText("원삼면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유림동":
			crolling.area += ",I2300730";
			Mainpage.Filtering[Mainpage.index].setText("유림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유방동":
			crolling.area += ",I2300750";
			Mainpage.Filtering[Mainpage.index].setText("유방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동읍":
			crolling.area += ",I2300760";
			Mainpage.Filtering[Mainpage.index].setText("이동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용인시중앙동":
			crolling.area += ",I2300770";
			Mainpage.Filtering[Mainpage.index].setText("용인시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포곡읍":
			crolling.area += ",I2300780";
			Mainpage.Filtering[Mainpage.index].setText("포곡읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해곡동":
			crolling.area += ",I2300790";
			Mainpage.Filtering[Mainpage.index].setText("해곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호동":
			crolling.area += ",I2300800";
			Mainpage.Filtering[Mainpage.index].setText("호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고천동":
			crolling.area += ",I2300810";
			Mainpage.Filtering[Mainpage.index].setText("고천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내손동":
			crolling.area += ",I2300820";
			Mainpage.Filtering[Mainpage.index].setText("내손동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내손1동":
			crolling.area += ",I2300830";
			Mainpage.Filtering[Mainpage.index].setText("내손1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내손2동":
			crolling.area += ",I2300840";
			Mainpage.Filtering[Mainpage.index].setText("내손2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",I2300850";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동":
			crolling.area += ",I2300860";
			Mainpage.Filtering[Mainpage.index].setText("삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오전동":
			crolling.area += ",I2300870";
			Mainpage.Filtering[Mainpage.index].setText("오전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕곡동":
			crolling.area += ",I2300880";
			Mainpage.Filtering[Mainpage.index].setText("왕곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월암동":
			crolling.area += ",I2300890";
			Mainpage.Filtering[Mainpage.index].setText("월암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",I2300900";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청계동":
			crolling.area += ",I2300910";
			Mainpage.Filtering[Mainpage.index].setText("청계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초평동":
			crolling.area += ",I2300920";
			Mainpage.Filtering[Mainpage.index].setText("초평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포일동":
			crolling.area += ",I2400010";
			Mainpage.Filtering[Mainpage.index].setText("포일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학의동":
			crolling.area += ",I2400020";
			Mainpage.Filtering[Mainpage.index].setText("학의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가능동":
			crolling.area += ",I2400030";
			Mainpage.Filtering[Mainpage.index].setText("가능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가능1동":
			crolling.area += ",I2400040";
			Mainpage.Filtering[Mainpage.index].setText("가능1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고산동":
			crolling.area += ",I2400050";
			Mainpage.Filtering[Mainpage.index].setText("고산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금오동":
			crolling.area += ",I2400060";
			Mainpage.Filtering[Mainpage.index].setText("금오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙양동":
			crolling.area += ",I2400070";
			Mainpage.Filtering[Mainpage.index].setText("낙양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹양동":
			crolling.area += ",I2400080";
			Mainpage.Filtering[Mainpage.index].setText("녹양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "민락동":
			crolling.area += ",I2400090";
			Mainpage.Filtering[Mainpage.index].setText("민락동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산곡동":
			crolling.area += ",I2400100";
			Mainpage.Filtering[Mainpage.index].setText("산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산1동":
			crolling.area += ",I2400110";
			Mainpage.Filtering[Mainpage.index].setText("송산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산2동":
			crolling.area += ",I2400120";
			Mainpage.Filtering[Mainpage.index].setText("송산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡동":
			crolling.area += ",I2400130";
			Mainpage.Filtering[Mainpage.index].setText("신곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡1동":
			crolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("신곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신곡2동":
			crolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("신곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용현동":
			crolling.area += ",I2400140";
			Mainpage.Filtering[Mainpage.index].setText("용현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부동":
			crolling.area += ",I2400150";
			Mainpage.Filtering[Mainpage.index].setText("의정부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부1동":
			crolling.area += ",I2400160";
			Mainpage.Filtering[Mainpage.index].setText("의정부1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부2동":
			crolling.area += ",I2400170";
			Mainpage.Filtering[Mainpage.index].setText("의정부2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의정부3동":
			crolling.area += ",I2400180";
			Mainpage.Filtering[Mainpage.index].setText("의정부3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자금동":
			crolling.area += ",I2400190";
			Mainpage.Filtering[Mainpage.index].setText("자금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자일동":
			crolling.area += ",I2400200";
			Mainpage.Filtering[Mainpage.index].setText("자일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장암동":
			crolling.area += ",I2400210";
			Mainpage.Filtering[Mainpage.index].setText("장암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호원동":
			crolling.area += ",I2400220";
			Mainpage.Filtering[Mainpage.index].setText("호원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호원1동":
			crolling.area += ",I2400230";
			Mainpage.Filtering[Mainpage.index].setText("호원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호원2동":
			crolling.area += ",I2400240";
			Mainpage.Filtering[Mainpage.index].setText("호원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥선동":
			crolling.area += ",I2400250";
			Mainpage.Filtering[Mainpage.index].setText("흥선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			crolling.area += ",I2400260";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고담동":
			crolling.area += ",I2400270";
			Mainpage.Filtering[Mainpage.index].setText("고담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관고동":
			crolling.area += ",I2400280";
			Mainpage.Filtering[Mainpage.index].setText("관고동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단월동":
			crolling.area += ",I2400290";
			Mainpage.Filtering[Mainpage.index].setText("단월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대월면":
			crolling.area += ",I2400300";
			Mainpage.Filtering[Mainpage.index].setText("대월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			crolling.area += ",I2400310";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마장면":
			crolling.area += ",I2400380";
			Mainpage.Filtering[Mainpage.index].setText("마장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모가면":
			crolling.area += ",I2400320";
			Mainpage.Filtering[Mainpage.index].setText("모가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백사면":
			crolling.area += ",I2400360";
			Mainpage.Filtering[Mainpage.index].setText("백사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부발읍":
			crolling.area += ",I2400390";
			Mainpage.Filtering[Mainpage.index].setText("부발읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사음동":
			crolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("사음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설성면":
			crolling.area += ",I2400400";
			Mainpage.Filtering[Mainpage.index].setText("설성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",I2400410";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신둔면":
			crolling.area += ",I2400420";
			Mainpage.Filtering[Mainpage.index].setText("신둔면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥동":
			crolling.area += ",I2400430";
			Mainpage.Filtering[Mainpage.index].setText("안흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율면":
			crolling.area += ",I2400440";
			Mainpage.Filtering[Mainpage.index].setText("율면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율현동":
			crolling.area += ",I2400450";
			Mainpage.Filtering[Mainpage.index].setText("율현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장록동":
			crolling.area += ",I2400460";
			Mainpage.Filtering[Mainpage.index].setText("장록동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장호원읍":
			crolling.area += ",I2400470";
			Mainpage.Filtering[Mainpage.index].setText("장호원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이천시중리동":
			crolling.area += ",I2400480";
			Mainpage.Filtering[Mainpage.index].setText("이천시중리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증일동":
			crolling.area += ",I2400490";
			Mainpage.Filtering[Mainpage.index].setText("증일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증포동":
			crolling.area += ",I2400500";
			Mainpage.Filtering[Mainpage.index].setText("증포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진리동":
			crolling.area += ",I2400510";
			Mainpage.Filtering[Mainpage.index].setText("진리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이천시창전동":
			crolling.area += ",I2400520";
			Mainpage.Filtering[Mainpage.index].setText("이천시창전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호법면":
			crolling.area += ",I2400530";
			Mainpage.Filtering[Mainpage.index].setText("호법면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검산동":
			crolling.area += ",I2400540";
			Mainpage.Filtering[Mainpage.index].setText("검산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광탄면":
			crolling.area += ",I2400550";
			Mainpage.Filtering[Mainpage.index].setText("광탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교하동":
			crolling.area += ",I2400560";
			Mainpage.Filtering[Mainpage.index].setText("교하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군내면":
			crolling.area += ",I2400570";
			Mainpage.Filtering[Mainpage.index].setText("군내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금능동":
			crolling.area += "I2400580";
			Mainpage.Filtering[Mainpage.index].setText("금능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금촌동":
			crolling.area += ",I2400590";
			Mainpage.Filtering[Mainpage.index].setText("금촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금촌1동":
			crolling.area += ",I2400600";
			Mainpage.Filtering[Mainpage.index].setText("금촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금촌2동":
			crolling.area += ",I2400610";
			Mainpage.Filtering[Mainpage.index].setText("금촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다율동":
			crolling.area += ",I2400620";
			Mainpage.Filtering[Mainpage.index].setText("다율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당하동":
			crolling.area += ",I2400630";
			Mainpage.Filtering[Mainpage.index].setText("당하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동패동":
			crolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("동패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "맥금동":
			crolling.area += ",I2400640";
			Mainpage.Filtering[Mainpage.index].setText("맥금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동동":
			crolling.area += ",I2400650";
			Mainpage.Filtering[Mainpage.index].setText("목동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문발동":
			crolling.area += ",I2400660";
			Mainpage.Filtering[Mainpage.index].setText("문발동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문산읍":
			crolling.area += ",I2400670";
			Mainpage.Filtering[Mainpage.index].setText("문산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법원읍":
			crolling.area += ",I2400680";
			Mainpage.Filtering[Mainpage.index].setText("법원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신남동":
			crolling.area += ",I2400690";
			Mainpage.Filtering[Mainpage.index].setText("신남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상지석동":
			crolling.area += ",I2400700";
			Mainpage.Filtering[Mainpage.index].setText("상지석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서패동":
			crolling.area += ",I2400710";
			Mainpage.Filtering[Mainpage.index].setText("서패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송촌동":
			crolling.area += ",I2400720";
			Mainpage.Filtering[Mainpage.index].setText("송촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파주시신촌동":
			crolling.area += ",I2400730";
			Mainpage.Filtering[Mainpage.index].setText("파주시신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아동동":
			crolling.area += ",I2400740";
			Mainpage.Filtering[Mainpage.index].setText("아동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월롱면":
			crolling.area += ",I2400750";
			Mainpage.Filtering[Mainpage.index].setText("월롱면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장단면":
			crolling.area += ",I2400760";
			Mainpage.Filtering[Mainpage.index].setText("장단면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적성면":
			crolling.area += ",I2400770";
			Mainpage.Filtering[Mainpage.index].setText("적성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조리읍":
			crolling.area += ",I2400780";
			Mainpage.Filtering[Mainpage.index].setText("조리읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄현면":
			crolling.area += ",I2400790";
			Mainpage.Filtering[Mainpage.index].setText("탄현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파주읍":
			crolling.area += ",I2400800";
			Mainpage.Filtering[Mainpage.index].setText("파주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파평면":
			crolling.area += ",I2500040";
			Mainpage.Filtering[Mainpage.index].setText("파평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하지석동":
			crolling.area += ",I2500030";
			Mainpage.Filtering[Mainpage.index].setText("하지석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가제동":
			crolling.area += ",I2500010";
			Mainpage.Filtering[Mainpage.index].setText("가제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕면":
			crolling.area += ",I2500130";
			Mainpage.Filtering[Mainpage.index].setText("고덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군문동":
			crolling.area += ",I2500060";
			Mainpage.Filtering[Mainpage.index].setText("군문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도일동":
			crolling.area += ",I2500070";
			Mainpage.Filtering[Mainpage.index].setText("도일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독곡동":
			crolling.area += ",I2500080";
			Mainpage.Filtering[Mainpage.index].setText("독곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동삭동":
			crolling.area += ",I2500090";
			Mainpage.Filtering[Mainpage.index].setText("동삭동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모곡동":
			crolling.area += ",I2500110";
			Mainpage.Filtering[Mainpage.index].setText("모곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비전동":
			crolling.area += ",I2500050";
			Mainpage.Filtering[Mainpage.index].setText("비전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비전1동":
			crolling.area += ",I2500160";
			Mainpage.Filtering[Mainpage.index].setText("비전1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비전2동":
			crolling.area += ",I2500140";
			Mainpage.Filtering[Mainpage.index].setText("비전2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서정동":
			crolling.area += ",I2500150";
			Mainpage.Filtering[Mainpage.index].setText("서정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서탄면":
			crolling.area += ",I2500190";
			Mainpage.Filtering[Mainpage.index].setText("서탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평택시세교동":
			crolling.area += ",I2500170";
			Mainpage.Filtering[Mainpage.index].setText("평택시세교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			crolling.area += ",I2500180";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대동":
			crolling.area += ",I2500220";
			Mainpage.Filtering[Mainpage.index].setText("신대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장동":
			crolling.area += ",I2500200";
			Mainpage.Filtering[Mainpage.index].setText("신장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장1동":
			crolling.area += ",I2500210";
			Mainpage.Filtering[Mainpage.index].setText("신장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신장2동":
			crolling.area += ",I2500260";
			Mainpage.Filtering[Mainpage.index].setText("신장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안중읍":
			crolling.area += ",I2500230";
			Mainpage.Filtering[Mainpage.index].setText("안중읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오성면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("오성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("용이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("유천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이충동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("이충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장당동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽백동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("죽백동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지제동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("지제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진위면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("진위면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청룡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("청룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청북면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("청북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠괴동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("칠괴동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠원동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("칠원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통복동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("통복동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팽성읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팽성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평택동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("평택동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포승읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("포승읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합정동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("합정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현덕면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("현덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가산면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("가산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관인면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("관인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포천시군내면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("포천시군내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내촌면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("내촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선단동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선단동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설운동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("설운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소흘읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("소흘읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신북면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신읍동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신읍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어룡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("어룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영북면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영중면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영중면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("이동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일동면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("일동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자각동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("자각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창수면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("창수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("포천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화현면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감북동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("감북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("감이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감일동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("감일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광암동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("광암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("교산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당정동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("당정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("덕풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("덕풍1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("덕풍2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕풍3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("덕풍3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망월동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("망월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미사동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("미사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미사1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("미사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미사2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("미사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배알미동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("배알미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상사창동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("상사창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상산곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("상산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남시신장동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하남시신장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남시신장1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하남시신장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남시신장2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하남시신장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창우동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("창우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천현동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("천현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("초이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초일동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("초일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘궁동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("춘궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("풍산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하사창동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하사창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하산곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하산곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학암동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("학암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기배동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("기배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("기산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기안동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("기안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("남양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄4동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄5동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동틴6동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동틴6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄7동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동탄8동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("동탄8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마도면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("마도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매송면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매송면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반송동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("반송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반정동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("반정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("방교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배양동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("배양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병점동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("병점동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병점1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("병점1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병점2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("병점2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉담읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("봉담읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("비봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산척동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("산척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "새솔동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("새솔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서신면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("서신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석우동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("석우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("송산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안녕동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안녕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양감면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("양감면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성시오산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화성시오산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우정읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("우정읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고잔동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("고잔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정남면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성시중동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화성시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진안동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("진안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성시청계동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화성시청계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔탄면":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팔탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향남읍":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("향남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황계동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("황계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		
		}
	}
}
