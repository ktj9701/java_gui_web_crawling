import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class Gyeonggi {
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

		case "가평읍":
			crolling.area += ",I1800030";
			Mainpage.Filtering[Mainpage.index].setText("가평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",I1800010";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상면":
			crolling.area += ",I1800020";
			Mainpage.Filtering[Mainpage.index].setText("상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설악면":
			crolling.area += "I1800040";
			Mainpage.Filtering[Mainpage.index].setText("설악면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조종면":
			crolling.area += ",I1800070";
			Mainpage.Filtering[Mainpage.index].setText("조종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "총평면":
			crolling.area += ",I1800050";
			Mainpage.Filtering[Mainpage.index].setText("총평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강매동":
			crolling.area += ",I1800060";
			Mainpage.Filtering[Mainpage.index].setText("강매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고양동":
			crolling.area += "I1800100";
			Mainpage.Filtering[Mainpage.index].setText("고양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관산동":
			crolling.area += ",I1800080";
			Mainpage.Filtering[Mainpage.index].setText("관산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			crolling.area += ",I1800090";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내유동":
			crolling.area += ",I1800130";
			Mainpage.Filtering[Mainpage.index].setText("내유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능곡동":
			crolling.area += ",I1800110";
			Mainpage.Filtering[Mainpage.index].setText("능곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕동":
			crolling.area += "I1800120";
			Mainpage.Filtering[Mainpage.index].setText("대덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대자동":
			crolling.area += ",I1800160";
			Mainpage.Filtering[Mainpage.index].setText("대자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대장동":
			crolling.area += ",I1800140";
			Mainpage.Filtering[Mainpage.index].setText("대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕은동":
			crolling.area += ",I1800150";
			Mainpage.Filtering[Mainpage.index].setText("덕은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도내동":
			crolling.area += "I1800170";
			Mainpage.Filtering[Mainpage.index].setText("도내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			crolling.area += ",I1800180";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벽제동":
			crolling.area += ",I1800210";
			Mainpage.Filtering[Mainpage.index].setText("벽제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북한동":
			crolling.area += ",I1800190";
			Mainpage.Filtering[Mainpage.index].setText("북한동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼송동":
			crolling.area += ",I1800200";
			Mainpage.Filtering[Mainpage.index].setText("삼송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선유동":
			crolling.area += ",I1800220";
			Mainpage.Filtering[Mainpage.index].setText("선유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사동":
			crolling.area += ",I1800230";
			Mainpage.Filtering[Mainpage.index].setText("성사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사1동":
			crolling.area += ",I1800240";
			Mainpage.Filtering[Mainpage.index].setText("성사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사2동":
			crolling.area += ",I1800380";
			Mainpage.Filtering[Mainpage.index].setText("성사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신원동":
			crolling.area += ",I1800320";
			Mainpage.Filtering[Mainpage.index].setText("신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			crolling.area += ",I1800260";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			crolling.area += ",I1800270";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",I1800280";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			crolling.area += ",I1800300";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원신동":
			crolling.area += ",I1800310";
			Mainpage.Filtering[Mainpage.index].setText("원신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원흥동":
			crolling.area += ",I1800330";
			Mainpage.Filtering[Mainpage.index].setText("원흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교동":
			crolling.area += ",I1800340";
			Mainpage.Filtering[Mainpage.index].setText("주교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지축동":
			crolling.area += ",I1800370";
			Mainpage.Filtering[Mainpage.index].setText("지축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창릉동":
			crolling.area += ",I1800350";
			Mainpage.Filtering[Mainpage.index].setText("창릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토당동":
			crolling.area += ",I1800360";
			Mainpage.Filtering[Mainpage.index].setText("토당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신동":
			crolling.area += ",I1900070";
			Mainpage.Filtering[Mainpage.index].setText("행신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신1동":
			crolling.area += ",I1900010";
			Mainpage.Filtering[Mainpage.index].setText("행신1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신2동":
			crolling.area += ",I1900020";
			Mainpage.Filtering[Mainpage.index].setText("행신2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신3동":
			crolling.area += ",I1900030";
			Mainpage.Filtering[Mainpage.index].setText("행신3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주내동":
			crolling.area += ",I1900040";
			Mainpage.Filtering[Mainpage.index].setText("행주내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주동":
			crolling.area += ",I1900050";
			Mainpage.Filtering[Mainpage.index].setText("행주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주외동":
			crolling.area += ",I1900150";
			Mainpage.Filtering[Mainpage.index].setText("행주외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향동동":
			crolling.area += ",I1900080";
			Mainpage.Filtering[Mainpage.index].setText("향동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현천동":
			crolling.area += ",I1900090";
			Mainpage.Filtering[Mainpage.index].setText("현천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			crolling.area += ",I1900100";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정동":
			crolling.area += ",I1900110";
			Mainpage.Filtering[Mainpage.index].setText("화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정1동":
			crolling.area += ",I1900120";
			Mainpage.Filtering[Mainpage.index].setText("화정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정2동":
			crolling.area += ",I1900130";
			Mainpage.Filtering[Mainpage.index].setText("화정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			crolling.area += ",I1900140";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥도동":
			crolling.area += ",I1900230";
			Mainpage.Filtering[Mainpage.index].setText("흥도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고봉동":
			crolling.area += ",I1900160";
			Mainpage.Filtering[Mainpage.index].setText("고봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두동":
			crolling.area += ",I1900170";
			Mainpage.Filtering[Mainpage.index].setText("마두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두1동":
			crolling.area += ",I1900180";
			Mainpage.Filtering[Mainpage.index].setText("마두1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두2동":
			crolling.area += ",I1900190";
			Mainpage.Filtering[Mainpage.index].setText("마두2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문봉동":
			crolling.area += ",I1900210";
			Mainpage.Filtering[Mainpage.index].setText("문봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석동":
			crolling.area += ",I1900220";
			Mainpage.Filtering[Mainpage.index].setText("백석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석1동":
			crolling.area += ",I2000010";
			Mainpage.Filtering[Mainpage.index].setText("백석1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석2동":
			crolling.area += ",I2000020";
			Mainpage.Filtering[Mainpage.index].setText("백석2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사리현동":
			crolling.area += ",I2000030";
			Mainpage.Filtering[Mainpage.index].setText("사리현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산황동":
			crolling.area += ",I2000040";
			Mainpage.Filtering[Mainpage.index].setText("산황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설문동":
			crolling.area += ",I2000050";
			Mainpage.Filtering[Mainpage.index].setText("설문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성석동":
			crolling.area += ",I2000060";
			Mainpage.Filtering[Mainpage.index].setText("성석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식사동":
			crolling.area += ",I2000070";
			Mainpage.Filtering[Mainpage.index].setText("식사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항동":
			crolling.area += ",I2000110";
			Mainpage.Filtering[Mainpage.index].setText("장항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항1동":
			crolling.area += ",I2000080";
			Mainpage.Filtering[Mainpage.index].setText("장항1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항2동":
			crolling.area += ",I2000090";
			Mainpage.Filtering[Mainpage.index].setText("장항2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정발산동":
			crolling.area += "I2000100";
			Mainpage.Filtering[Mainpage.index].setText("정발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중산동":
			crolling.area += ",I2000140";
			Mainpage.Filtering[Mainpage.index].setText("중산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지영동":
			crolling.area += ",I2000150";
			Mainpage.Filtering[Mainpage.index].setText("지영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍동":
			crolling.area += ",I2000160";
			Mainpage.Filtering[Mainpage.index].setText("풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산동":
			crolling.area += ",I2000170";
			Mainpage.Filtering[Mainpage.index].setText("풍산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌동":
			crolling.area += ",I2000180";
			Mainpage.Filtering[Mainpage.index].setText("가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			crolling.area += ",I2000190";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대화동":
			crolling.area += ",I2000200";
			Mainpage.Filtering[Mainpage.index].setText("대화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕이동":
			crolling.area += ",I2000210";
			Mainpage.Filtering[Mainpage.index].setText("덕이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법곳동":
			crolling.area += ",I2000290";
			Mainpage.Filtering[Mainpage.index].setText("법곳동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",I2000220";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송포동":
			crolling.area += ",I2000240";
			Mainpage.Filtering[Mainpage.index].setText("송포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산동":
			crolling.area += ",I2000250";
			Mainpage.Filtering[Mainpage.index].setText("일산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산1동":
			crolling.area += ",I2000260";
			Mainpage.Filtering[Mainpage.index].setText("일산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산2동":
			crolling.area += ",I2000270";
			Mainpage.Filtering[Mainpage.index].setText("일산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산3동":
			crolling.area += ",I2000280";
			Mainpage.Filtering[Mainpage.index].setText("일산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽동":
			crolling.area += ",I2000300";
			Mainpage.Filtering[Mainpage.index].setText("주엽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽1동":
			crolling.area += ",I2000310";
			Mainpage.Filtering[Mainpage.index].setText("주엽1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽2동":
			crolling.area += ",I2000320";
			Mainpage.Filtering[Mainpage.index].setText("주엽2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄현동":
			crolling.area += ",I2000330";
			Mainpage.Filtering[Mainpage.index].setText("탄현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			crolling.area += ",I2000340";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과천동":
			crolling.area += ",I2000350";
			Mainpage.Filtering[Mainpage.index].setText("과천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관문동":
			crolling.area += ",I2000360";
			Mainpage.Filtering[Mainpage.index].setText("관문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "막계동":
			crolling.area += ",I2000370";
			Mainpage.Filtering[Mainpage.index].setText("막계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문원동":
			crolling.area += ",I2000380";
			Mainpage.Filtering[Mainpage.index].setText("문원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별양동":
			crolling.area += ",I2000390";
			Mainpage.Filtering[Mainpage.index].setText("별양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			crolling.area += ",I2000400";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원문동":
			crolling.area += ",I2000410";
			Mainpage.Filtering[Mainpage.index].setText("원문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주암동":
			crolling.area += ",I2000420";
			Mainpage.Filtering[Mainpage.index].setText("주암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",I2000430";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가학동":
			crolling.area += ",I2000440";
			Mainpage.Filtering[Mainpage.index].setText("가학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명동":
			crolling.area += ",I2000450";
			Mainpage.Filtering[Mainpage.index].setText("광명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명1동":
			crolling.area += ",I2000460";
			Mainpage.Filtering[Mainpage.index].setText("광명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명2동":
			crolling.area += ",I2000470";
			Mainpage.Filtering[Mainpage.index].setText("광명2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명3동":
			crolling.area += ",I2000230";
			Mainpage.Filtering[Mainpage.index].setText("광명3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명4동":
			crolling.area += ",I2100010";
			Mainpage.Filtering[Mainpage.index].setText("광명4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명5동":
			crolling.area += ",I2100020";
			Mainpage.Filtering[Mainpage.index].setText("광명5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명6동":
			crolling.area += ",I2100030";
			Mainpage.Filtering[Mainpage.index].setText("광명6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명7동":
			crolling.area += ",I2100040";
			Mainpage.Filtering[Mainpage.index].setText("광명7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노온사동":
			crolling.area += ",I2100050";
			Mainpage.Filtering[Mainpage.index].setText("노온사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하동":
			crolling.area += ",I2100060";
			Mainpage.Filtering[Mainpage.index].setText("소하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하1동":
			crolling.area += ",I2100070";
			Mainpage.Filtering[Mainpage.index].setText("소하1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하2동":
			crolling.area += "I2100080";
			Mainpage.Filtering[Mainpage.index].setText("소하2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥길동":
			crolling.area += ",I2100090";
			Mainpage.Filtering[Mainpage.index].setText("옥길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일직동":
			crolling.area += ",I2100100";
			Mainpage.Filtering[Mainpage.index].setText("일직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산동":
			crolling.area += ",I2100110";
			Mainpage.Filtering[Mainpage.index].setText("철산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산1동":
			crolling.area += ",I2100120";
			Mainpage.Filtering[Mainpage.index].setText("철산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산2동":
			crolling.area += ",I2100130";
			Mainpage.Filtering[Mainpage.index].setText("철산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산3동":
			crolling.area += ",I2100140";
			Mainpage.Filtering[Mainpage.index].setText("철산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산4동":
			crolling.area += ",I2100150";
			Mainpage.Filtering[Mainpage.index].setText("철산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안동":
			crolling.area += ",I2100160";
			Mainpage.Filtering[Mainpage.index].setText("하안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안1동":
			crolling.area += ",I2100170";
			Mainpage.Filtering[Mainpage.index].setText("하안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안2동":
			crolling.area += ",I2100180";
			Mainpage.Filtering[Mainpage.index].setText("하안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안3동":
			crolling.area += ",I2100190";
			Mainpage.Filtering[Mainpage.index].setText("하안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안4동":
			crolling.area += ",I2100200";
			Mainpage.Filtering[Mainpage.index].setText("하안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경안동":
			crolling.area += ",I2100210";
			Mainpage.Filtering[Mainpage.index].setText("경안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곤지암읍":
			crolling.area += ",I2100220";
			Mainpage.Filtering[Mainpage.index].setText("곤지암읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남종면":
			crolling.area += ",I2100230";
			Mainpage.Filtering[Mainpage.index].setText("남종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남한산성면":
			crolling.area += ",I2100260";
			Mainpage.Filtering[Mainpage.index].setText("남한산성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도척면":
			crolling.area += ",I2100240";
			Mainpage.Filtering[Mainpage.index].setText("도척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",I2100250";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목현동":
			crolling.area += ",I2100290";
			Mainpage.Filtering[Mainpage.index].setText("목현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동":
			crolling.area += ",I2100270";
			Mainpage.Filtering[Mainpage.index].setText("삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",I2100280";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍령동":
			crolling.area += ",I2100300";
			Mainpage.Filtering[Mainpage.index].setText("쌍령동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역동":
			crolling.area += ",I2100310";
			Mainpage.Filtering[Mainpage.index].setText("역동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오포읍":
			crolling.area += ",I2100320";
			Mainpage.Filtering[Mainpage.index].setText("오포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			crolling.area += ",I2100330";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중대동":
			crolling.area += ",I2100340";
			Mainpage.Filtering[Mainpage.index].setText("중대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직동":
			crolling.area += ",I2100350";
			Mainpage.Filtering[Mainpage.index].setText("직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초월읍":
			crolling.area += ",I2100360";
			Mainpage.Filtering[Mainpage.index].setText("초월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄벌동":
			crolling.area += ",I2100370";
			Mainpage.Filtering[Mainpage.index].setText("탄벌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태전동":
			crolling.area += ",I2100400";
			Mainpage.Filtering[Mainpage.index].setText("태전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴촌면":
			crolling.area += ",I2100410";
			Mainpage.Filtering[Mainpage.index].setText("퇴촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회덕동":
			crolling.area += ",I2100420";
			Mainpage.Filtering[Mainpage.index].setText("회덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈매동":
			crolling.area += ",I2200030";
			Mainpage.Filtering[Mainpage.index].setText("갈매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문동":
			crolling.area += ",I2200010";
			Mainpage.Filtering[Mainpage.index].setText("교문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문1동":
			crolling.area += ",I2200020";
			Mainpage.Filtering[Mainpage.index].setText("교문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문2동":
			crolling.area += ",I2200040";
			Mainpage.Filtering[Mainpage.index].setText("교문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동구동":
			crolling.area += ",I2200060";
			Mainpage.Filtering[Mainpage.index].setText("동구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사노동":
			crolling.area += ",I2200070";
			Mainpage.Filtering[Mainpage.index].setText("사노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택동":
			crolling.area += ",I2200110";
			Mainpage.Filtering[Mainpage.index].setText("수택동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택1동":
			crolling.area += ",I2200080";
			Mainpage.Filtering[Mainpage.index].setText("수택1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택2동":
			crolling.area += ",I2200090";
			Mainpage.Filtering[Mainpage.index].setText("수택2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택3동":
			crolling.area += ",I2200120";
			Mainpage.Filtering[Mainpage.index].setText("수택3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아천동":
			crolling.area += ",I2200150";
			Mainpage.Filtering[Mainpage.index].setText("아천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인창동":
			crolling.area += ",I2200130";
			Mainpage.Filtering[Mainpage.index].setText("인창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토평동":
			crolling.area += ",I2200140";
			Mainpage.Filtering[Mainpage.index].setText("토평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광정동":
			crolling.area += ",I2200180";
			Mainpage.Filtering[Mainpage.index].setText("광정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포1동":
			crolling.area += ",I2200230";
			Mainpage.Filtering[Mainpage.index].setText("군포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포2동":
			crolling.area += ",I2200190";
			Mainpage.Filtering[Mainpage.index].setText("군포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁내동":
			crolling.area += ",I2200200";
			Mainpage.Filtering[Mainpage.index].setText("궁내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금정동":
			crolling.area += ",I2200210";
			Mainpage.Filtering[Mainpage.index].setText("금정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당동":
			crolling.area += ",I2200240";
			Mainpage.Filtering[Mainpage.index].setText("당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당정동":
			crolling.area += ",I2200250";
			Mainpage.Filtering[Mainpage.index].setText("당정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야미동":
			crolling.area += ",I2300010";
			Mainpage.Filtering[Mainpage.index].setText("대야미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도마교동":
			crolling.area += ",I2300020";
			Mainpage.Filtering[Mainpage.index].setText("도마교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔대동":
			crolling.area += ",I2300030";
			Mainpage.Filtering[Mainpage.index].setText("둔대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",I2300040";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본동":
			crolling.area += ",I2300050";
			Mainpage.Filtering[Mainpage.index].setText("산본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본1동":
			crolling.area += ",I2300060";
			Mainpage.Filtering[Mainpage.index].setText("산본1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본2동":
			crolling.area += ",I2300070";
			Mainpage.Filtering[Mainpage.index].setText("산본2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속달동":
			crolling.area += ",I2300080";
			Mainpage.Filtering[Mainpage.index].setText("속달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수리동":
			crolling.area += ",I2300090";
			Mainpage.Filtering[Mainpage.index].setText("수리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포시오금동":
			crolling.area += ",I2300100";
			Mainpage.Filtering[Mainpage.index].setText("군포시오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재궁동":
			crolling.area += ",I2300110";
			Mainpage.Filtering[Mainpage.index].setText("재궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감정동":
			crolling.area += ",I2300120";
			Mainpage.Filtering[Mainpage.index].setText("감정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "걸포동":
			crolling.area += ",I2300130";
			Mainpage.Filtering[Mainpage.index].setText("걸포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고촌읍":
			crolling.area += ",I2300140";
			Mainpage.Filtering[Mainpage.index].setText("고촌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구래동":
			crolling.area += ",I2300150";
			Mainpage.Filtering[Mainpage.index].setText("구래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김포본동":
			crolling.area += ",I2300160";
			Mainpage.Filtering[Mainpage.index].setText("김포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곶면":
			crolling.area += ",I2300170";
			Mainpage.Filtering[Mainpage.index].setText("대곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산동":
			crolling.area += ",I2300180";
			Mainpage.Filtering[Mainpage.index].setText("마산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북변동":
			crolling.area += ",I2300190";
			Mainpage.Filtering[Mainpage.index].setText("북변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사우동":
			crolling.area += ",I2300200";
			Mainpage.Filtering[Mainpage.index].setText("사우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양촌읍":
			crolling.area += ",I2300210";
			Mainpage.Filtering[Mainpage.index].setText("양촌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운양동":
			crolling.area += ",I2300220";
			Mainpage.Filtering[Mainpage.index].setText("운양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곶면":
			crolling.area += ",I2300230";
			Mainpage.Filtering[Mainpage.index].setText("월곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기동":
			crolling.area += ",I2300240";
			Mainpage.Filtering[Mainpage.index].setText("장기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기본동":
			crolling.area += ",I2300250";
			Mainpage.Filtering[Mainpage.index].setText("장기본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통진읍":
			crolling.area += ",I2300260";
			Mainpage.Filtering[Mainpage.index].setText("통진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍무동":
			crolling.area += ",I2300270";
			Mainpage.Filtering[Mainpage.index].setText("풍무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하성면":
			crolling.area += ",I2300280";
			Mainpage.Filtering[Mainpage.index].setText("하성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가운동":
			crolling.area += ",I2300290";
			Mainpage.Filtering[Mainpage.index].setText("가운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",I2300300";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산동":
			crolling.area += ",I2300310";
			Mainpage.Filtering[Mainpage.index].setText("다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산1동":
			crolling.area += ",I2300320";
			Mainpage.Filtering[Mainpage.index].setText("다산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산2동":
			crolling.area += ",I2300330";
			Mainpage.Filtering[Mainpage.index].setText("다산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도농동":
			crolling.area += ",I2300340";
			Mainpage.Filtering[Mainpage.index].setText("도농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별내동":
			crolling.area += ",I2300350";
			Mainpage.Filtering[Mainpage.index].setText("별내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별내면":
			crolling.area += ",I2300360";
			Mainpage.Filtering[Mainpage.index].setText("별내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼패동":
			crolling.area += ",I2300370";
			Mainpage.Filtering[Mainpage.index].setText("삼패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동면":
			crolling.area += ",I2300380";
			Mainpage.Filtering[Mainpage.index].setText("수동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수석동":
			crolling.area += ",I2300390";
			Mainpage.Filtering[Mainpage.index].setText("수석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정동":
			crolling.area += ",I2300420";
			Mainpage.Filtering[Mainpage.index].setText("양정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오남읍":
			crolling.area += ",I2300400";
			Mainpage.Filtering[Mainpage.index].setText("오남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와부읍":
			crolling.area += ",I2300410";
			Mainpage.Filtering[Mainpage.index].setText("와부읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이패동":
			crolling.area += ",I2300430";
			Mainpage.Filtering[Mainpage.index].setText("이패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일패동":
			crolling.area += ",I2300440";
			Mainpage.Filtering[Mainpage.index].setText("일패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조안면":
			crolling.area += ",I2300450";
			Mainpage.Filtering[Mainpage.index].setText("조안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지금동":
			crolling.area += ",I2300460";
			Mainpage.Filtering[Mainpage.index].setText("지금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진건읍":
			crolling.area += "I2300470";
			Mainpage.Filtering[Mainpage.index].setText("진건읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진접읍":
			crolling.area += ",I2300480";
			Mainpage.Filtering[Mainpage.index].setText("진접읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴계원면":
			crolling.area += ",I2300490";
			Mainpage.Filtering[Mainpage.index].setText("퇴계원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평내동":
			crolling.area += ",I2300500";
			Mainpage.Filtering[Mainpage.index].setText("평내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호평동":
			crolling.area += ",I2300510";
			Mainpage.Filtering[Mainpage.index].setText("호평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화도읍":
			crolling.area += ",I2300520";
			Mainpage.Filtering[Mainpage.index].setText("화도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "걸산동":
			crolling.area += ",I2300530";
			Mainpage.Filtering[Mainpage.index].setText("걸산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광암동":
			crolling.area += ",I2300540";
			Mainpage.Filtering[Mainpage.index].setText("광암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동두천동":
			crolling.area += ",I2300550";
			Mainpage.Filtering[Mainpage.index].setText("동두천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보산동":
			crolling.area += ",I2300560";
			Mainpage.Filtering[Mainpage.index].setText("보산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불현동":
			crolling.area += ",I2300570";
			Mainpage.Filtering[Mainpage.index].setText("불현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉암동":
			crolling.area += ",I2300580";
			Mainpage.Filtering[Mainpage.index].setText("상봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상패동":
			crolling.area += ",I2300590";
			Mainpage.Filtering[Mainpage.index].setText("상패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연1동":
			crolling.area += ",I2300600";
			Mainpage.Filtering[Mainpage.index].setText("생연");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연2동":
			crolling.area += ",I2300610";
			Mainpage.Filtering[Mainpage.index].setText("재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연동":
			crolling.area += ",I2300620";
			Mainpage.Filtering[Mainpage.index].setText("생연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소요동":
			crolling.area += ",I2300630";
			Mainpage.Filtering[Mainpage.index].setText("소요동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내동":
			crolling.area += ",I2300640";
			Mainpage.Filtering[Mainpage.index].setText("송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥동":
			crolling.area += ",I2300650";
			Mainpage.Filtering[Mainpage.index].setText("안흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동두천중앙동":
			crolling.area += ",I2300660";
			Mainpage.Filtering[Mainpage.index].setText("동두천중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지행동":
			crolling.area += ",I2300670";
			Mainpage.Filtering[Mainpage.index].setText("지행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동동":
			crolling.area += ",I2300680";
			Mainpage.Filtering[Mainpage.index].setText("탑동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하봉암동":
			crolling.area += ",I2300690";
			Mainpage.Filtering[Mainpage.index].setText("하봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계수동":
			crolling.area += ",I2300700";
			Mainpage.Filtering[Mainpage.index].setText("계수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강동":
			crolling.area += ",I2300740";
			Mainpage.Filtering[Mainpage.index].setText("고강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강1동":
			crolling.area += ",I2300710";
			Mainpage.Filtering[Mainpage.index].setText("고강1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강본동":
			crolling.area += ",I2300720";
			Mainpage.Filtering[Mainpage.index].setText("고강본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴안동":
			crolling.area += ",I2300730";
			Mainpage.Filtering[Mainpage.index].setText("괴안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",I2300750";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시대장동":
			crolling.area += ",I2300760";
			Mainpage.Filtering[Mainpage.index].setText("부천시대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도당동":
			crolling.area += ",I2300770";
			Mainpage.Filtering[Mainpage.index].setText("도당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범박동":
			crolling.area += ",I2300780";
			Mainpage.Filtering[Mainpage.index].setText("범박동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정동":
			crolling.area += ",I2300790";
			Mainpage.Filtering[Mainpage.index].setText("삼정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",I2300800";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상1동":
			crolling.area += ",I2300810";
			Mainpage.Filtering[Mainpage.index].setText("상1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상2동":
			crolling.area += ",I2300820";
			Mainpage.Filtering[Mainpage.index].setText("상2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상3동":
			crolling.area += ",I2300830";
			Mainpage.Filtering[Mainpage.index].setText("상3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성곡동":
			crolling.area += ",I2300840";
			Mainpage.Filtering[Mainpage.index].setText("성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			crolling.area += ",I2300850";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사본동":
			crolling.area += ",I2300860";
			Mainpage.Filtering[Mainpage.index].setText("소사본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사본3동":
			crolling.area += ",I2300870";
			Mainpage.Filtering[Mainpage.index].setText("소사본3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시송내동":
			crolling.area += ",I2300880";
			Mainpage.Filtering[Mainpage.index].setText("부천시송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내1동":
			crolling.area += ",I2300890";
			Mainpage.Filtering[Mainpage.index].setText("송내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내2동":
			crolling.area += ",I2300900";
			Mainpage.Filtering[Mainpage.index].setText("송내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",I2300910";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			crolling.area += ",I2300920";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡1동":
			crolling.area += ",I2400010";
			Mainpage.Filtering[Mainpage.index].setText("심곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡2동":
			crolling.area += ",I2400020";
			Mainpage.Filtering[Mainpage.index].setText("심곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡3동":
			crolling.area += ",I2400030";
			Mainpage.Filtering[Mainpage.index].setText("심곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡본동":
			crolling.area += ",I2400040";
			Mainpage.Filtering[Mainpage.index].setText("심곡본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡본1동":
			crolling.area += ",I2400050";
			Mainpage.Filtering[Mainpage.index].setText("심곡본1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약대동":
			crolling.area += ",I2400060";
			Mainpage.Filtering[Mainpage.index].setText("약대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여우러동":
			crolling.area += ",I2400070";
			Mainpage.Filtering[Mainpage.index].setText("여우러동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡동":
			crolling.area += ",I2400080";
			Mainpage.Filtering[Mainpage.index].setText("역곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡1동":
			crolling.area += ",I2400090";
			Mainpage.Filtering[Mainpage.index].setText("역곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡2동":
			crolling.area += ",I2400100";
			Mainpage.Filtering[Mainpage.index].setText("역곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡3동":
			crolling.area += ",I2400110";
			Mainpage.Filtering[Mainpage.index].setText("역곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오정동":
			crolling.area += ",I2400120";
			Mainpage.Filtering[Mainpage.index].setText("오정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시옥길동":
			crolling.area += ",I2400130";
			Mainpage.Filtering[Mainpage.index].setText("부천시옥길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미동":
			crolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("원미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미1동":
			crolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("원미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미2동":
			crolling.area += ",I2400140";
			Mainpage.Filtering[Mainpage.index].setText("원미2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종동":
			crolling.area += ",I2400150";
			Mainpage.Filtering[Mainpage.index].setText("원종동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종1동":
			crolling.area += ",I2400160";
			Mainpage.Filtering[Mainpage.index].setText("원종1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종2동":
			crolling.area += ",I2400170";
			Mainpage.Filtering[Mainpage.index].setText("원종2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작동":
			crolling.area += ",I2400180";
			Mainpage.Filtering[Mainpage.index].setText("작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",I2400190";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중1동":
			crolling.area += ",I2400200";
			Mainpage.Filtering[Mainpage.index].setText("중1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중2동":
			crolling.area += ",I2400210";
			Mainpage.Filtering[Mainpage.index].setText("중2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중3동":
			crolling.area += ",I2400220";
			Mainpage.Filtering[Mainpage.index].setText("중3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중4동":
			crolling.area += ",I2400230";
			Mainpage.Filtering[Mainpage.index].setText("중4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘의동":
			crolling.area += ",I2400240";
			Mainpage.Filtering[Mainpage.index].setText("춘의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미동":
			crolling.area += ",I2400250";
			Mainpage.Filtering[Mainpage.index].setText("구미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미1동":
			crolling.area += ",I2400260";
			Mainpage.Filtering[Mainpage.index].setText("구미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시궁내동":
			crolling.area += ",I2400270";
			Mainpage.Filtering[Mainpage.index].setText("성남시궁내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시금곡동":
			crolling.area += ",I2400280";
			Mainpage.Filtering[Mainpage.index].setText("성남시금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시대장동":
			crolling.area += ",I2400290";
			Mainpage.Filtering[Mainpage.index].setText("성남시대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동원동":
			crolling.area += ",I2400300";
			Mainpage.Filtering[Mainpage.index].setText("동원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백현동":
			crolling.area += ",I2400310";
			Mainpage.Filtering[Mainpage.index].setText("백현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "분당동":
			crolling.area += ",I2400380";
			Mainpage.Filtering[Mainpage.index].setText("분당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼평동":
			crolling.area += ",I2400320";
			Mainpage.Filtering[Mainpage.index].setText("삼평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현동":
			crolling.area += ",I2400360";
			Mainpage.Filtering[Mainpage.index].setText("서현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현1동":
			crolling.area += ",I2400390";
			Mainpage.Filtering[Mainpage.index].setText("서현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현2동":
			crolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("서현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석운동":
			crolling.area += ",I2400400";
			Mainpage.Filtering[Mainpage.index].setText("석운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내동":
			crolling.area += ",I2400410";
			Mainpage.Filtering[Mainpage.index].setText("수내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내1동":
			crolling.area += ",I2400420";
			Mainpage.Filtering[Mainpage.index].setText("수내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내2동":
			crolling.area += ",I2400430";
			Mainpage.Filtering[Mainpage.index].setText("수내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내3동":
			crolling.area += ",I2400440";
			Mainpage.Filtering[Mainpage.index].setText("수내3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑동":
			crolling.area += ",I2400450";
			Mainpage.Filtering[Mainpage.index].setText("야탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑1동":
			crolling.area += ",I2400460";
			Mainpage.Filtering[Mainpage.index].setText("야탑1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑2동":
			crolling.area += ",I2400470";
			Mainpage.Filtering[Mainpage.index].setText("야탑2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑3동":
			crolling.area += ",I2400480";
			Mainpage.Filtering[Mainpage.index].setText("야탑3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운중동":
			crolling.area += ",I2400490";
			Mainpage.Filtering[Mainpage.index].setText("운중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율동":
			crolling.area += ",I2400500";
			Mainpage.Filtering[Mainpage.index].setText("율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매동":
			crolling.area += ",I2400510";
			Mainpage.Filtering[Mainpage.index].setText("이매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매1동":
			crolling.area += ",I2400520";
			Mainpage.Filtering[Mainpage.index].setText("이매1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매2동":
			crolling.area += ",I2400530";
			Mainpage.Filtering[Mainpage.index].setText("이매2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자동":
			crolling.area += ",I2400540";
			Mainpage.Filtering[Mainpage.index].setText("정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자1동":
			crolling.area += ",I2400550";
			Mainpage.Filtering[Mainpage.index].setText("정자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자2동":
			crolling.area += ",I2400560";
			Mainpage.Filtering[Mainpage.index].setText("정자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자3동":
			crolling.area += ",I2400570";
			Mainpage.Filtering[Mainpage.index].setText("정자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판교동":
			crolling.area += "I2400580";
			Mainpage.Filtering[Mainpage.index].setText("판교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하산운동":
			crolling.area += ",I2400590";
			Mainpage.Filtering[Mainpage.index].setText("하산운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고등동":
			crolling.area += ",I2400600";
			Mainpage.Filtering[Mainpage.index].setText("고등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금토동":
			crolling.area += ",I2400610";
			Mainpage.Filtering[Mainpage.index].setText("금토동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단대동":
			crolling.area += ",I2400620";
			Mainpage.Filtering[Mainpage.index].setText("단대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔전동":
			crolling.area += ",I2400630";
			Mainpage.Filtering[Mainpage.index].setText("둔전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복정동":
			crolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("복정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사송동":
			crolling.area += ",I2400640";
			Mainpage.Filtering[Mainpage.index].setText("사송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			crolling.area += ",I2400650";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상적동":
			crolling.area += ",I2400660";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진동":
			crolling.area += ",I2400670";
			Mainpage.Filtering[Mainpage.index].setText("수진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진1동":
			crolling.area += ",I2400680";
			Mainpage.Filtering[Mainpage.index].setText("수진1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진2동":
			crolling.area += ",I2400690";
			Mainpage.Filtering[Mainpage.index].setText("수진2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥동":
			crolling.area += ",I2400700";
			Mainpage.Filtering[Mainpage.index].setText("시흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",I2400710";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시신흥동":
			crolling.area += ",I2400720";
			Mainpage.Filtering[Mainpage.index].setText("성남시신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥1동":
			crolling.area += ",I2400730";
			Mainpage.Filtering[Mainpage.index].setText("신흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥2동":
			crolling.area += ",I2400740";
			Mainpage.Filtering[Mainpage.index].setText("신흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥3동":
			crolling.area += ",I2400750";
			Mainpage.Filtering[Mainpage.index].setText("신흥3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김곡동":
			crolling.area += ",I2400760";
			Mainpage.Filtering[Mainpage.index].setText("김곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양지동":
			crolling.area += ",I2400770";
			Mainpage.Filtering[Mainpage.index].setText("양지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오야동":
			crolling.area += ",I2400780";
			Mainpage.Filtering[Mainpage.index].setText("오야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			crolling.area += ",I2400790";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창곡동":
			crolling.area += ",I2400800";
			Mainpage.Filtering[Mainpage.index].setText("창곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			crolling.area += ",I2500040";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평1동":
			crolling.area += ",I2500030";
			Mainpage.Filtering[Mainpage.index].setText("태평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평2동":
			crolling.area += ",I2500010";
			Mainpage.Filtering[Mainpage.index].setText("태평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평3동":
			crolling.area += ",I2500130";
			Mainpage.Filtering[Mainpage.index].setText("태평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평4동":
			crolling.area += ",I2500060";
			Mainpage.Filtering[Mainpage.index].setText("태평4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시갈현동":
			crolling.area += ",I2500070";
			Mainpage.Filtering[Mainpage.index].setText("성남시갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광동":
			crolling.area += ",I2500080";
			Mainpage.Filtering[Mainpage.index].setText("금광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광1동":
			crolling.area += ",I2500090";
			Mainpage.Filtering[Mainpage.index].setText("금광1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광2동":
			crolling.area += ",I2500110";
			Mainpage.Filtering[Mainpage.index].setText("금광2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도촌동":
			crolling.area += ",I2500050";
			Mainpage.Filtering[Mainpage.index].setText("도촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원동":
			crolling.area += ",I2500160";
			Mainpage.Filtering[Mainpage.index].setText("상대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원1동":
			crolling.area += ",I2500140";
			Mainpage.Filtering[Mainpage.index].setText("상대원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원2동":
			crolling.area += ",I2500150";
			Mainpage.Filtering[Mainpage.index].setText("상대원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원3동":
			crolling.area += ",I2500190";
			Mainpage.Filtering[Mainpage.index].setText("상대원3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",I2500170";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수동":
			crolling.area += ",I2500180";
			Mainpage.Filtering[Mainpage.index].setText("여수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행동":
			crolling.area += ",I2500220";
			Mainpage.Filtering[Mainpage.index].setText("은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행1동":
			crolling.area += ",I2500200";
			Mainpage.Filtering[Mainpage.index].setText("은행1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행2동":
			crolling.area += ",I2500210";
			Mainpage.Filtering[Mainpage.index].setText("은행2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시중앙동":
			crolling.area += ",I2500260";
			Mainpage.Filtering[Mainpage.index].setText("성남시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하대원동":
			crolling.area += ",I2500230";
			Mainpage.Filtering[Mainpage.index].setText("하대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고색동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("고색동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곡반정동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("곡반정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구운동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("구운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권선동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("권선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시금곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원시금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당수동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("당수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대황교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("대황교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서둔동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("서둔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("세류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("세류1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("세류2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("세류3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오목천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("오목천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입북동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("입북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시장지동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원시장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("평리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호매실동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("호매실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망포동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("망포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매탄1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매탄2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매탄3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄4동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매탄4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영통1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영통2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("원천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이의동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("이의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("태장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상광교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("상광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송죽동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("송죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연무동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("연무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영화동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율전동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("율전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이목동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("이목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원정자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원정자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원정자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("조원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("조원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("조원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("천천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파장동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("파장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하광교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시고등동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원시고등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("구천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남수동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("남수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남창동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("남창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매교동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로1가":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매산로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로2가":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매산로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로3가":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매산로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매향동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북수동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("북수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신풍동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("우만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("우만1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("우만2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인계동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("인계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시중동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수원시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로1가":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팔달로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로2가":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팔달로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로3가":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팔달로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("화서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거모동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("거모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시계수동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("시흥시계수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과림동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("과림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광석동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("광석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("금이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("논곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시능곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("시흥시능곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("대야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도창동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("도창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매화동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("매화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목감동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("목감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무지내동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("무지내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "물왕동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("물왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("미산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("방산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배곧동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("배곧동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산현동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("산현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신현동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안현동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연성동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("연성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곶동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("월곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시은행동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("시흥시은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장현동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정왕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정왕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정왕3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕4동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정왕4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕본동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("정왕본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조남동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("조남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽율동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("죽율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하상동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하중동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("하중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시화정동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("시흥시화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고잔동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("고잔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부남동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("대부남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("대부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부동동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("대부동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부북동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("대부북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목내동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("목내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("백운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선감동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선부1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선부2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("선부3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시성곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안산시성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("신길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("와동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("원곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원시동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("원시동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시중앙동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안산시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초지동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("초지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍도동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("풍도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호수동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("호수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시화정동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안산시화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건건동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("건건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("본오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오1동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("본오1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오2동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("본오2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오3동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("본오3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시부곡동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안산시부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사사동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("사사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("사이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성포동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("성포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수암동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("수암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("안산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양상동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("양상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월피동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("월피동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장상동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장하동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("장하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔곡이동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팔곡이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔곡일동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("팔곡일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해양동":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("해양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
