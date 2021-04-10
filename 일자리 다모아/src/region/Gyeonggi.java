package region;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;

public class Gyeonggi {
	public boolean flag;

	public void GyeonggiCity(ActionEvent e) {
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
			crolling.area += ",B0100010";
			Mainpage.Filtering[Mainpage.index].setText("가평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",B0100020";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상면":
			crolling.area += ",B0100030";
			Mainpage.Filtering[Mainpage.index].setText("상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설악면":
			crolling.area += ",B0100040";
			Mainpage.Filtering[Mainpage.index].setText("설악면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조종면":
			crolling.area += ",B0100060";
			Mainpage.Filtering[Mainpage.index].setText("조종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청평면":
			crolling.area += ",B0100050";
			Mainpage.Filtering[Mainpage.index].setText("청평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강매동":
			crolling.area += ",B0200010";
			Mainpage.Filtering[Mainpage.index].setText("강매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고양동":
			crolling.area += ",B0200020";
			Mainpage.Filtering[Mainpage.index].setText("고양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관산동":
			crolling.area += ",B0200030";
			Mainpage.Filtering[Mainpage.index].setText("관산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			crolling.area += ",B0200040";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내유동":
			crolling.area += ",B0200050";
			Mainpage.Filtering[Mainpage.index].setText("내유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능곡동":
			crolling.area += ",B0200400";
			Mainpage.Filtering[Mainpage.index].setText("능곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕동":
			crolling.area += ",B0200410";
			Mainpage.Filtering[Mainpage.index].setText("대덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대자동":
			crolling.area += ",B0200060";
			Mainpage.Filtering[Mainpage.index].setText("대자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대장동":
			crolling.area += ",B0200070";
			Mainpage.Filtering[Mainpage.index].setText("대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕은동":
			crolling.area += ",B0200080";
			Mainpage.Filtering[Mainpage.index].setText("덕은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도내동":
			crolling.area += ",B0200090";
			Mainpage.Filtering[Mainpage.index].setText("도내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			crolling.area += ",B0200100";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벽제동":
			crolling.area += ",B0200110";
			Mainpage.Filtering[Mainpage.index].setText("벽제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북한동":
			crolling.area += ",B0200120";
			Mainpage.Filtering[Mainpage.index].setText("북한동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼송동":
			crolling.area += ",B0200130";
			Mainpage.Filtering[Mainpage.index].setText("삼송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선유동":
			crolling.area += ",B0200140";
			Mainpage.Filtering[Mainpage.index].setText("선유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사동":
			crolling.area += ",B0200170";
			Mainpage.Filtering[Mainpage.index].setText("성사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사1동":
			crolling.area += ",B0200150";
			Mainpage.Filtering[Mainpage.index].setText("성사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성사2동":
			crolling.area += ",B0200160";
			Mainpage.Filtering[Mainpage.index].setText("성사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신원동":
			crolling.area += ",B0200180";
			Mainpage.Filtering[Mainpage.index].setText("신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평동":
			crolling.area += ",B0200140";
			Mainpage.Filtering[Mainpage.index].setText("신평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오금동":
			crolling.area += ",B0200170";
			Mainpage.Filtering[Mainpage.index].setText("오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",B0200150";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			crolling.area += ",B0200160";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원신동":
			crolling.area += ",B0200180";
			Mainpage.Filtering[Mainpage.index].setText("원신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원흥동":
			crolling.area += ",B0200230";
			Mainpage.Filtering[Mainpage.index].setText("원흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교동":
			crolling.area += ",B0200240";
			Mainpage.Filtering[Mainpage.index].setText("주교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지축동":
			crolling.area += ",B0200250";
			Mainpage.Filtering[Mainpage.index].setText("지축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창릉동":
			crolling.area += ",B0200430";
			Mainpage.Filtering[Mainpage.index].setText("창릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토당동":
			crolling.area += ",B0200260";
			Mainpage.Filtering[Mainpage.index].setText("토당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신동":
			crolling.area += ",B0200300";
			Mainpage.Filtering[Mainpage.index].setText("행신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신1동":
			crolling.area += ",B0200270";
			Mainpage.Filtering[Mainpage.index].setText("행신1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신2동":
			crolling.area += ",B0200280";
			Mainpage.Filtering[Mainpage.index].setText("행신2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행신3동":
			crolling.area += ",B0200290";
			Mainpage.Filtering[Mainpage.index].setText("행신3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주내동":
			crolling.area += ",B0200310";
			Mainpage.Filtering[Mainpage.index].setText("행주내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주동":
			crolling.area += ",B0200440";
			Mainpage.Filtering[Mainpage.index].setText("행주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행주외동":
			crolling.area += ",B0200320";
			Mainpage.Filtering[Mainpage.index].setText("행주외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "향동동":
			crolling.area += ",B0200330";
			Mainpage.Filtering[Mainpage.index].setText("향동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현천동":
			crolling.area += ",B0200340";
			Mainpage.Filtering[Mainpage.index].setText("현천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			crolling.area += ",B0200350";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정동":
			crolling.area += ",B0200380";
			Mainpage.Filtering[Mainpage.index].setText("화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정1동":
			crolling.area += ",B0200360";
			Mainpage.Filtering[Mainpage.index].setText("화정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정2동":
			crolling.area += ",B0200370";
			Mainpage.Filtering[Mainpage.index].setText("화정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			crolling.area += ",B0200390";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥도동":
			crolling.area += ",B0200450";
			Mainpage.Filtering[Mainpage.index].setText("흥도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고봉동":
			crolling.area += ",B0300180";
			Mainpage.Filtering[Mainpage.index].setText("고봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두동":
			crolling.area += ",B0300030";
			Mainpage.Filtering[Mainpage.index].setText("마두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두1동":
			crolling.area += ",B0300010";
			Mainpage.Filtering[Mainpage.index].setText("마두1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마두2동":
			crolling.area += ",B0300020";
			Mainpage.Filtering[Mainpage.index].setText("마두2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문봉동":
			crolling.area += ",B0300040";
			Mainpage.Filtering[Mainpage.index].setText("문봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석동":
			crolling.area += ",B0300050";
			Mainpage.Filtering[Mainpage.index].setText("백석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석1동":
			crolling.area += ",B0300044";
			Mainpage.Filtering[Mainpage.index].setText("백석1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석2동":
			crolling.area += ",B0300045";
			Mainpage.Filtering[Mainpage.index].setText("백석2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사리현동":
			crolling.area += ",B0300060";
			Mainpage.Filtering[Mainpage.index].setText("사리현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산황동":
			crolling.area += ",B0300070";
			Mainpage.Filtering[Mainpage.index].setText("산황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설문동":
			crolling.area += ",B0300080";
			Mainpage.Filtering[Mainpage.index].setText("설문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성석동":
			crolling.area += ",B0300090";
			Mainpage.Filtering[Mainpage.index].setText("성석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "식사동":
			crolling.area += ",B0300100";
			Mainpage.Filtering[Mainpage.index].setText("식사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항동":
			crolling.area += ",B0300130";
			Mainpage.Filtering[Mainpage.index].setText("장항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항1동":
			crolling.area += ",B0300110";
			Mainpage.Filtering[Mainpage.index].setText("장항1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항2동":
			crolling.area += ",B0300120";
			Mainpage.Filtering[Mainpage.index].setText("장항2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정발산동":
			crolling.area += ",B0300140";
			Mainpage.Filtering[Mainpage.index].setText("정발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중산동":
			crolling.area += ",B0300150";
			Mainpage.Filtering[Mainpage.index].setText("중산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지영동":
			crolling.area += ",B0300160";
			Mainpage.Filtering[Mainpage.index].setText("지영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍동":
			crolling.area += ",B0300170";
			Mainpage.Filtering[Mainpage.index].setText("풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산동":
			crolling.area += ",B0300190";
			Mainpage.Filtering[Mainpage.index].setText("풍산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가좌동":
			crolling.area += ",B0310010";
			Mainpage.Filtering[Mainpage.index].setText("가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구산동":
			crolling.area += ",B0310020";
			Mainpage.Filtering[Mainpage.index].setText("구산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대화동":
			crolling.area += ",B0310030";
			Mainpage.Filtering[Mainpage.index].setText("대화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕이동":
			crolling.area += ",B0310040";
			Mainpage.Filtering[Mainpage.index].setText("덕이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법곳동":
			crolling.area += ",B0310050";
			Mainpage.Filtering[Mainpage.index].setText("법곳동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산동":
			crolling.area += ",B0310140";
			Mainpage.Filtering[Mainpage.index].setText("송산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송포동":
			crolling.area += ",B0310150";
			Mainpage.Filtering[Mainpage.index].setText("송포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산동":
			crolling.area += ",B0310090";
			Mainpage.Filtering[Mainpage.index].setText("일산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산1동":
			crolling.area += ",B0310060";
			Mainpage.Filtering[Mainpage.index].setText("일산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산2동":
			crolling.area += ",B0310070";
			Mainpage.Filtering[Mainpage.index].setText("일산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산3동":
			crolling.area += ",B0310080";
			Mainpage.Filtering[Mainpage.index].setText("일산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽동":
			crolling.area += ",B0310120";
			Mainpage.Filtering[Mainpage.index].setText("주엽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽1동":
			crolling.area += ",B0310100";
			Mainpage.Filtering[Mainpage.index].setText("주엽1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주엽2동":
			crolling.area += ",B0310110";
			Mainpage.Filtering[Mainpage.index].setText("주엽2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄현동":
			crolling.area += ",B0310130";
			Mainpage.Filtering[Mainpage.index].setText("탄현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈현동":
			crolling.area += ",B0400010";
			Mainpage.Filtering[Mainpage.index].setText("갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과천동":
			crolling.area += ",B0400020";
			Mainpage.Filtering[Mainpage.index].setText("과천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관문동":
			crolling.area += ",B0400030";
			Mainpage.Filtering[Mainpage.index].setText("관문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "막계동":
			crolling.area += ",B0400040";
			Mainpage.Filtering[Mainpage.index].setText("막계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문원동":
			crolling.area += ",B0400050";
			Mainpage.Filtering[Mainpage.index].setText("문원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별양동":
			crolling.area += ",B0400060";
			Mainpage.Filtering[Mainpage.index].setText("별양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부림동":
			crolling.area += ",B0400070";
			Mainpage.Filtering[Mainpage.index].setText("부림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원문동":
			crolling.area += ",B0400080";
			Mainpage.Filtering[Mainpage.index].setText("원문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주암동":
			crolling.area += ",B0400090";
			Mainpage.Filtering[Mainpage.index].setText("주암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",B0400100";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가학동":
			crolling.area += ",B0500010";
			Mainpage.Filtering[Mainpage.index].setText("가학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명동":
			crolling.area += ",B0500090";
			Mainpage.Filtering[Mainpage.index].setText("광명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명1동":
			crolling.area += ",B0500020";
			Mainpage.Filtering[Mainpage.index].setText("광명1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명2동":
			crolling.area += ",B0500030";
			Mainpage.Filtering[Mainpage.index].setText("광명2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명3동":
			crolling.area += ",B0500040";
			Mainpage.Filtering[Mainpage.index].setText("광명3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명4동":
			crolling.area += ",B0500050";
			Mainpage.Filtering[Mainpage.index].setText("광명4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명5동":
			crolling.area += ",B0500060";
			Mainpage.Filtering[Mainpage.index].setText("광명5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명6동":
			crolling.area += ",B0500070";
			Mainpage.Filtering[Mainpage.index].setText("광명6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광명7동":
			crolling.area += ",B0500080";
			Mainpage.Filtering[Mainpage.index].setText("광명7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노온사동":
			crolling.area += ",B0500100";
			Mainpage.Filtering[Mainpage.index].setText("노온사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하동":
			crolling.area += ",B0500130";
			Mainpage.Filtering[Mainpage.index].setText("소하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하1동":
			crolling.area += ",B0500110";
			Mainpage.Filtering[Mainpage.index].setText("소하1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소하2동":
			crolling.area += "B0500120";
			Mainpage.Filtering[Mainpage.index].setText("소하2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥길동":
			crolling.area += ",B0500140";
			Mainpage.Filtering[Mainpage.index].setText("옥길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일직동":
			crolling.area += ",B0500150";
			Mainpage.Filtering[Mainpage.index].setText("일직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산동":
			crolling.area += ",B0500200";
			Mainpage.Filtering[Mainpage.index].setText("철산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산1동":
			crolling.area += ",B0500160";
			Mainpage.Filtering[Mainpage.index].setText("철산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산2동":
			crolling.area += ",B0500170";
			Mainpage.Filtering[Mainpage.index].setText("철산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산3동":
			crolling.area += ",B0500180";
			Mainpage.Filtering[Mainpage.index].setText("철산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철산4동":
			crolling.area += ",B0500190";
			Mainpage.Filtering[Mainpage.index].setText("철산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안동":
			crolling.area += ",B0500250";
			Mainpage.Filtering[Mainpage.index].setText("하안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안1동":
			crolling.area += ",B0500210";
			Mainpage.Filtering[Mainpage.index].setText("하안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안2동":
			crolling.area += ",B0500220";
			Mainpage.Filtering[Mainpage.index].setText("하안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안3동":
			crolling.area += ",B0500230";
			Mainpage.Filtering[Mainpage.index].setText("하안3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하안4동":
			crolling.area += ",B0500240";
			Mainpage.Filtering[Mainpage.index].setText("하안4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경안동":
			crolling.area += ",B0600010";
			Mainpage.Filtering[Mainpage.index].setText("경안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곤지암읍":
			crolling.area += ",B0600080";
			Mainpage.Filtering[Mainpage.index].setText("곤지암읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남종면":
			crolling.area += ",B0600020";
			Mainpage.Filtering[Mainpage.index].setText("남종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남한산성면":
			crolling.area += ",B0600140";
			Mainpage.Filtering[Mainpage.index].setText("남한산성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도척면":
			crolling.area += ",B0600030";
			Mainpage.Filtering[Mainpage.index].setText("도척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목동":
			crolling.area += ",B0600040";
			Mainpage.Filtering[Mainpage.index].setText("목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목현동":
			crolling.area += ",B0600050";
			Mainpage.Filtering[Mainpage.index].setText("목현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼동":
			crolling.area += ",B0600060";
			Mainpage.Filtering[Mainpage.index].setText("삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",B0600070";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍령동":
			crolling.area += ",B0600090";
			Mainpage.Filtering[Mainpage.index].setText("쌍령동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역동":
			crolling.area += ",B0600100";
			Mainpage.Filtering[Mainpage.index].setText("역동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오포읍":
			crolling.area += ",B0600110";
			Mainpage.Filtering[Mainpage.index].setText("오포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장지동":
			crolling.area += ",B0600120";
			Mainpage.Filtering[Mainpage.index].setText("장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중대동":
			crolling.area += ",B0600130";
			Mainpage.Filtering[Mainpage.index].setText("중대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직동":
			crolling.area += ",B0600150";
			Mainpage.Filtering[Mainpage.index].setText("직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초월읍":
			crolling.area += ",B0600160";
			Mainpage.Filtering[Mainpage.index].setText("초월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄벌동":
			crolling.area += ",B0600170";
			Mainpage.Filtering[Mainpage.index].setText("탄벌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태전동":
			crolling.area += ",B0600180";
			Mainpage.Filtering[Mainpage.index].setText("태전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴촌면":
			crolling.area += ",B0600190";
			Mainpage.Filtering[Mainpage.index].setText("퇴촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회덕동":
			crolling.area += ",B0600200";
			Mainpage.Filtering[Mainpage.index].setText("회덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈매동":
			crolling.area += ",B0700010";
			Mainpage.Filtering[Mainpage.index].setText("갈매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문동":
			crolling.area += ",B0700040";
			Mainpage.Filtering[Mainpage.index].setText("교문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문1동":
			crolling.area += ",B0700020";
			Mainpage.Filtering[Mainpage.index].setText("교문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교문2동":
			crolling.area += ",B0700030";
			Mainpage.Filtering[Mainpage.index].setText("교문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동구동":
			crolling.area += ",B0700050";
			Mainpage.Filtering[Mainpage.index].setText("동구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사노동":
			crolling.area += ",B0700060";
			Mainpage.Filtering[Mainpage.index].setText("사노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택동":
			crolling.area += ",B0700100";
			Mainpage.Filtering[Mainpage.index].setText("수택동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택1동":
			crolling.area += ",B0700070";
			Mainpage.Filtering[Mainpage.index].setText("수택1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택2동":
			crolling.area += ",B0700080";
			Mainpage.Filtering[Mainpage.index].setText("수택2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수택3동":
			crolling.area += ",B0700090";
			Mainpage.Filtering[Mainpage.index].setText("수택3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아천동":
			crolling.area += ",B0700120";
			Mainpage.Filtering[Mainpage.index].setText("아천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인창동":
			crolling.area += ",B0700130";
			Mainpage.Filtering[Mainpage.index].setText("인창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토평동":
			crolling.area += ",B0700140";
			Mainpage.Filtering[Mainpage.index].setText("토평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광정동":
			crolling.area += ",B0800010";
			Mainpage.Filtering[Mainpage.index].setText("광정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포1동":
			crolling.area += ",B0800020";
			Mainpage.Filtering[Mainpage.index].setText("군포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포2동":
			crolling.area += ",B0800030";
			Mainpage.Filtering[Mainpage.index].setText("군포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁내동":
			crolling.area += ",B0800040";
			Mainpage.Filtering[Mainpage.index].setText("궁내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금정동":
			crolling.area += ",B0800050";
			Mainpage.Filtering[Mainpage.index].setText("금정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당동":
			crolling.area += ",B0800060";
			Mainpage.Filtering[Mainpage.index].setText("당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당정동":
			crolling.area += ",B0800070";
			Mainpage.Filtering[Mainpage.index].setText("당정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야미동":
			crolling.area += ",B0800080";
			Mainpage.Filtering[Mainpage.index].setText("대야미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도마교동":
			crolling.area += ",B0800090";
			Mainpage.Filtering[Mainpage.index].setText("도마교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔대동":
			crolling.area += ",B0800100";
			Mainpage.Filtering[Mainpage.index].setText("둔대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",B0800110";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본동":
			crolling.area += ",B0800140";
			Mainpage.Filtering[Mainpage.index].setText("산본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본1동":
			crolling.area += ",B0800120";
			Mainpage.Filtering[Mainpage.index].setText("산본1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산본2동":
			crolling.area += ",B0800130";
			Mainpage.Filtering[Mainpage.index].setText("산본2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속달동":
			crolling.area += ",B0800150";
			Mainpage.Filtering[Mainpage.index].setText("속달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수리동":
			crolling.area += ",B0800160";
			Mainpage.Filtering[Mainpage.index].setText("수리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군포시오금동":
			crolling.area += ",B0800170";
			Mainpage.Filtering[Mainpage.index].setText("군포시오금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "재궁동":
			crolling.area += ",B0800180";
			Mainpage.Filtering[Mainpage.index].setText("재궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "감정동":
			crolling.area += ",B0900010";
			Mainpage.Filtering[Mainpage.index].setText("감정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "걸포동":
			crolling.area += ",B0900020";
			Mainpage.Filtering[Mainpage.index].setText("걸포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고촌읍":
			crolling.area += ",B0900030";
			Mainpage.Filtering[Mainpage.index].setText("고촌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구래동":
			crolling.area += ",B0900035";
			Mainpage.Filtering[Mainpage.index].setText("구래동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김포본동":
			crolling.area += ",B0900140";
			Mainpage.Filtering[Mainpage.index].setText("김포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대곶면":
			crolling.area += ",B0900040";
			Mainpage.Filtering[Mainpage.index].setText("대곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산동":
			crolling.area += ",B0900045";
			Mainpage.Filtering[Mainpage.index].setText("마산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북변동":
			crolling.area += ",B0900050";
			Mainpage.Filtering[Mainpage.index].setText("북변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사우동":
			crolling.area += ",B0900060";
			Mainpage.Filtering[Mainpage.index].setText("사우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양촌읍":
			crolling.area += ",B0900070";
			Mainpage.Filtering[Mainpage.index].setText("양촌읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운양동":
			crolling.area += ",B0900080";
			Mainpage.Filtering[Mainpage.index].setText("운양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곶면":
			crolling.area += ",B0900090";
			Mainpage.Filtering[Mainpage.index].setText("월곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기동":
			crolling.area += ",B0900100";
			Mainpage.Filtering[Mainpage.index].setText("장기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기본동":
			crolling.area += ",B0900150";
			Mainpage.Filtering[Mainpage.index].setText("장기본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통진읍":
			crolling.area += "B0900110";
			Mainpage.Filtering[Mainpage.index].setText("통진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍무동":
			crolling.area += ",B0900120";
			Mainpage.Filtering[Mainpage.index].setText("풍무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하성면":
			crolling.area += ",B0900130";
			Mainpage.Filtering[Mainpage.index].setText("하성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가운동":
			crolling.area += ",B1000010";
			Mainpage.Filtering[Mainpage.index].setText("가운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",B1000020";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산동":
			crolling.area += ",B1000220";
			Mainpage.Filtering[Mainpage.index].setText("다산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산1동":
			crolling.area += ",B1000230";
			Mainpage.Filtering[Mainpage.index].setText("다산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다산2동":
			crolling.area += ",B1000240";
			Mainpage.Filtering[Mainpage.index].setText("다산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도농동":
			crolling.area += ",B1000030";
			Mainpage.Filtering[Mainpage.index].setText("도농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별내동":
			crolling.area += ",B1000210";
			Mainpage.Filtering[Mainpage.index].setText("별내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별내면":
			crolling.area += ",B1000040";
			Mainpage.Filtering[Mainpage.index].setText("별내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼패동":
			crolling.area += ",B1000050";
			Mainpage.Filtering[Mainpage.index].setText("삼패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수동면":
			crolling.area += ",B1000060";
			Mainpage.Filtering[Mainpage.index].setText("수동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수석동":
			crolling.area += ",B1000070";
			Mainpage.Filtering[Mainpage.index].setText("수석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양정동":
			crolling.area += ",B1000080";
			Mainpage.Filtering[Mainpage.index].setText("양정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오남읍":
			crolling.area += ",B1000090";
			Mainpage.Filtering[Mainpage.index].setText("오남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와부읍":
			crolling.area += ",B1000100";
			Mainpage.Filtering[Mainpage.index].setText("와부읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이패동":
			crolling.area += ",B1000110";
			Mainpage.Filtering[Mainpage.index].setText("이패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일패동":
			crolling.area += ",B1000120";
			Mainpage.Filtering[Mainpage.index].setText("일패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조안면":
			crolling.area += ",B1000130";
			Mainpage.Filtering[Mainpage.index].setText("조안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지금동":
			crolling.area += ",B1000140";
			Mainpage.Filtering[Mainpage.index].setText("지금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진건읍":
			crolling.area += "B1000150";
			Mainpage.Filtering[Mainpage.index].setText("진건읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진접읍":
			crolling.area += ",B1000160";
			Mainpage.Filtering[Mainpage.index].setText("진접읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴계원면":
			crolling.area += ",B1000170";
			Mainpage.Filtering[Mainpage.index].setText("퇴계원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평내동":
			crolling.area += ",B1000180";
			Mainpage.Filtering[Mainpage.index].setText("평내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호평동":
			crolling.area += ",B1000190";
			Mainpage.Filtering[Mainpage.index].setText("호평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화도읍":
			crolling.area += ",B1000200";
			Mainpage.Filtering[Mainpage.index].setText("화도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "걸산동":
			crolling.area += ",B1100010";
			Mainpage.Filtering[Mainpage.index].setText("걸산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광암동":
			crolling.area += ",B1100020";
			Mainpage.Filtering[Mainpage.index].setText("광암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동두천동":
			crolling.area += ",B1100030";
			Mainpage.Filtering[Mainpage.index].setText("동두천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보산동":
			crolling.area += ",B1100040";
			Mainpage.Filtering[Mainpage.index].setText("보산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불현동":
			crolling.area += ",B1100160";
			Mainpage.Filtering[Mainpage.index].setText("불현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상봉암동":
			crolling.area += ",B1100050";
			Mainpage.Filtering[Mainpage.index].setText("상봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상패동":
			crolling.area += ",B1100060";
			Mainpage.Filtering[Mainpage.index].setText("상패동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연1동":
			crolling.area += ",B1100070";
			Mainpage.Filtering[Mainpage.index].setText("생연");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연2동":
			crolling.area += ",B1100080";
			Mainpage.Filtering[Mainpage.index].setText("재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생연동":
			crolling.area += ",B1100090";
			Mainpage.Filtering[Mainpage.index].setText("생연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소요동":
			crolling.area += ",B1100170";
			Mainpage.Filtering[Mainpage.index].setText("소요동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내동":
			crolling.area += ",B1100100";
			Mainpage.Filtering[Mainpage.index].setText("송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥동":
			crolling.area += ",B1100110";
			Mainpage.Filtering[Mainpage.index].setText("안흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동두천중앙동":
			crolling.area += ",B1100120";
			Mainpage.Filtering[Mainpage.index].setText("동두천중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지행동":
			crolling.area += ",B1100130";
			Mainpage.Filtering[Mainpage.index].setText("지행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동동":
			crolling.area += ",B1100140";
			Mainpage.Filtering[Mainpage.index].setText("탑동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하봉암동":
			crolling.area += ",B1100150";
			Mainpage.Filtering[Mainpage.index].setText("하봉암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계수동":
			crolling.area += ",B1250010";
			Mainpage.Filtering[Mainpage.index].setText("계수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강동":
			crolling.area += ",B1250020";
			Mainpage.Filtering[Mainpage.index].setText("고강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강1동":
			crolling.area += ",B1250030";
			Mainpage.Filtering[Mainpage.index].setText("고강1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고강본동":
			crolling.area += ",B1250040";
			Mainpage.Filtering[Mainpage.index].setText("고강본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴안동":
			crolling.area += ",B1250050";
			Mainpage.Filtering[Mainpage.index].setText("괴안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",B1250060";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시대장동":
			crolling.area += ",B1250070";
			Mainpage.Filtering[Mainpage.index].setText("부천시대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도당동":
			crolling.area += ",B1250080";
			Mainpage.Filtering[Mainpage.index].setText("도당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범박동":
			crolling.area += ",B1250090";
			Mainpage.Filtering[Mainpage.index].setText("범박동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼정동":
			crolling.area += ",B1250100";
			Mainpage.Filtering[Mainpage.index].setText("삼정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",B1250110";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상1동":
			crolling.area += ",B1250120";
			Mainpage.Filtering[Mainpage.index].setText("상1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상2동":
			crolling.area += ",B1250130";
			Mainpage.Filtering[Mainpage.index].setText("상2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상3동":
			crolling.area += ",B1250140";
			Mainpage.Filtering[Mainpage.index].setText("상3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성곡동":
			crolling.area += ",B1250150";
			Mainpage.Filtering[Mainpage.index].setText("성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사동":
			crolling.area += ",B1250160";
			Mainpage.Filtering[Mainpage.index].setText("소사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사본동":
			crolling.area += ",B1250170";
			Mainpage.Filtering[Mainpage.index].setText("소사본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소사본3동":
			crolling.area += ",B1250180";
			Mainpage.Filtering[Mainpage.index].setText("소사본3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시송내동":
			crolling.area += ",B1250190";
			Mainpage.Filtering[Mainpage.index].setText("부천시송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내1동":
			crolling.area += ",B1250200";
			Mainpage.Filtering[Mainpage.index].setText("송내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내2동":
			crolling.area += ",B1250210";
			Mainpage.Filtering[Mainpage.index].setText("송내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",B1250220";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			crolling.area += ",B1250230";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡1동":
			crolling.area += ",B1250240";
			Mainpage.Filtering[Mainpage.index].setText("심곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡2동":
			crolling.area += ",B1250250";
			Mainpage.Filtering[Mainpage.index].setText("심곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡3동":
			crolling.area += ",B1250260";
			Mainpage.Filtering[Mainpage.index].setText("심곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡본동":
			crolling.area += ",B1250270";
			Mainpage.Filtering[Mainpage.index].setText("심곡본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡본1동":
			crolling.area += ",B1250280";
			Mainpage.Filtering[Mainpage.index].setText("심곡본1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약대동":
			crolling.area += ",B1250290";
			Mainpage.Filtering[Mainpage.index].setText("약대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여우러동":
			crolling.area += ",B1250300";
			Mainpage.Filtering[Mainpage.index].setText("여우러동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡동":
			crolling.area += ",B1250310";
			Mainpage.Filtering[Mainpage.index].setText("역곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡1동":
			crolling.area += ",B1250320";
			Mainpage.Filtering[Mainpage.index].setText("역곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡2동":
			crolling.area += ",B1250330";
			Mainpage.Filtering[Mainpage.index].setText("역곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역곡3동":
			crolling.area += ",B1250340";
			Mainpage.Filtering[Mainpage.index].setText("역곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오정동":
			crolling.area += ",B1250350";
			Mainpage.Filtering[Mainpage.index].setText("오정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부천시옥길동":
			crolling.area += ",B1250360";
			Mainpage.Filtering[Mainpage.index].setText("부천시옥길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미동":
			crolling.area += ",B1250370";
			Mainpage.Filtering[Mainpage.index].setText("원미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미1동":
			crolling.area += ",B1250380";
			Mainpage.Filtering[Mainpage.index].setText("원미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원미2동":
			crolling.area += ",B1250390";
			Mainpage.Filtering[Mainpage.index].setText("원미2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종동":
			crolling.area += ",B1250400";
			Mainpage.Filtering[Mainpage.index].setText("원종동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종1동":
			crolling.area += ",B1250410";
			Mainpage.Filtering[Mainpage.index].setText("원종1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원종2동":
			crolling.area += ",B1250420";
			Mainpage.Filtering[Mainpage.index].setText("원종2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작동":
			crolling.area += ",B1250430";
			Mainpage.Filtering[Mainpage.index].setText("작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",B1250440";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중1동":
			crolling.area += ",B1250450";
			Mainpage.Filtering[Mainpage.index].setText("중1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중2동":
			crolling.area += ",B1250460";
			Mainpage.Filtering[Mainpage.index].setText("중2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중3동":
			crolling.area += ",B1250470";
			Mainpage.Filtering[Mainpage.index].setText("중3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중4동":
			crolling.area += ",B1250480";
			Mainpage.Filtering[Mainpage.index].setText("중4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘의동":
			crolling.area += ",B1250490";
			Mainpage.Filtering[Mainpage.index].setText("춘의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미동":
			crolling.area += ",B1500010";
			Mainpage.Filtering[Mainpage.index].setText("구미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미1동":
			crolling.area += ",B1500190";
			Mainpage.Filtering[Mainpage.index].setText("구미1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시궁내동":
			crolling.area += ",B1500020";
			Mainpage.Filtering[Mainpage.index].setText("성남시궁내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시금곡동":
			crolling.area += ",B1500030";
			Mainpage.Filtering[Mainpage.index].setText("성남시금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시대장동":
			crolling.area += ",B1500040";
			Mainpage.Filtering[Mainpage.index].setText("성남시대장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동원동":
			crolling.area += ",B1500050";
			Mainpage.Filtering[Mainpage.index].setText("동원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백현동":
			crolling.area += ",B1500060";
			Mainpage.Filtering[Mainpage.index].setText("백현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "분당동":
			crolling.area += ",B1500070";
			Mainpage.Filtering[Mainpage.index].setText("분당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼평동":
			crolling.area += ",B1500080";
			Mainpage.Filtering[Mainpage.index].setText("삼평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현동":
			crolling.area += ",B1500090";
			Mainpage.Filtering[Mainpage.index].setText("서현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현1동":
			crolling.area += ",B1500200";
			Mainpage.Filtering[Mainpage.index].setText("서현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서현2동":
			crolling.area += ",B1500210";
			Mainpage.Filtering[Mainpage.index].setText("서현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석운동":
			crolling.area += ",B1500100";
			Mainpage.Filtering[Mainpage.index].setText("석운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내동":
			crolling.area += ",B1500110";
			Mainpage.Filtering[Mainpage.index].setText("수내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내1동":
			crolling.area += ",B1500112";
			Mainpage.Filtering[Mainpage.index].setText("수내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내2동":
			crolling.area += ",B1500114";
			Mainpage.Filtering[Mainpage.index].setText("수내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수내3동":
			crolling.area += ",B1500116";
			Mainpage.Filtering[Mainpage.index].setText("수내3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑동":
			crolling.area += ",B1500120";
			Mainpage.Filtering[Mainpage.index].setText("야탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑1동":
			crolling.area += ",B1500220";
			Mainpage.Filtering[Mainpage.index].setText("야탑1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑2동":
			crolling.area += ",B1500230";
			Mainpage.Filtering[Mainpage.index].setText("야탑2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야탑3동":
			crolling.area += ",B1500240";
			Mainpage.Filtering[Mainpage.index].setText("야탑3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운중동":
			crolling.area += ",B1500130";
			Mainpage.Filtering[Mainpage.index].setText("운중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율동":
			crolling.area += ",B1500140";
			Mainpage.Filtering[Mainpage.index].setText("율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매동":
			crolling.area += ",B1500150";
			Mainpage.Filtering[Mainpage.index].setText("이매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매1동":
			crolling.area += ",B1500250";
			Mainpage.Filtering[Mainpage.index].setText("이매1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이매2동":
			crolling.area += ",B1500260";
			Mainpage.Filtering[Mainpage.index].setText("이매2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자동":
			crolling.area += ",B1500160";
			Mainpage.Filtering[Mainpage.index].setText("정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자1동":
			crolling.area += ",B1500270";
			Mainpage.Filtering[Mainpage.index].setText("정자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자2동":
			crolling.area += ",B1500280";
			Mainpage.Filtering[Mainpage.index].setText("정자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정자3동":
			crolling.area += ",B1500290";
			Mainpage.Filtering[Mainpage.index].setText("정자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판교동":
			crolling.area += ",B1500170";
			Mainpage.Filtering[Mainpage.index].setText("판교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하산운동":
			crolling.area += ",B1500180";
			Mainpage.Filtering[Mainpage.index].setText("하산운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고등동":
			crolling.area += ",B1600010";
			Mainpage.Filtering[Mainpage.index].setText("고등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금토동":
			crolling.area += ",B1600020";
			Mainpage.Filtering[Mainpage.index].setText("금토동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단대동":
			crolling.area += ",B1600030";
			Mainpage.Filtering[Mainpage.index].setText("단대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔전동":
			crolling.area += ",B1600040";
			Mainpage.Filtering[Mainpage.index].setText("둔전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복정동":
			crolling.area += ",B1600050";
			Mainpage.Filtering[Mainpage.index].setText("복정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사송동":
			crolling.area += ",B1600060";
			Mainpage.Filtering[Mainpage.index].setText("사송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			crolling.area += ",B1600070";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상적동":
			crolling.area += ",B1600080";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진동":
			crolling.area += ",B1600110";
			Mainpage.Filtering[Mainpage.index].setText("수진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진1동":
			crolling.area += ",B1600090";
			Mainpage.Filtering[Mainpage.index].setText("수진1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수진2동":
			crolling.area += ",B1600100";
			Mainpage.Filtering[Mainpage.index].setText("수진2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥동":
			crolling.area += ",B1600120";
			Mainpage.Filtering[Mainpage.index].setText("시흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",B1600130";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시신흥동":
			crolling.area += ",B1600170";
			Mainpage.Filtering[Mainpage.index].setText("성남시신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥1동":
			crolling.area += ",B1600140";
			Mainpage.Filtering[Mainpage.index].setText("신흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥2동":
			crolling.area += ",B1600150";
			Mainpage.Filtering[Mainpage.index].setText("신흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥3동":
			crolling.area += ",B1600160";
			Mainpage.Filtering[Mainpage.index].setText("신흥3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김곡동":
			crolling.area += ",B1600180";
			Mainpage.Filtering[Mainpage.index].setText("김곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양지동":
			crolling.area += ",B1600190";
			Mainpage.Filtering[Mainpage.index].setText("양지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오야동":
			crolling.area += ",B1600200";
			Mainpage.Filtering[Mainpage.index].setText("오야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "위례동":
			crolling.area += ",B1600270";
			Mainpage.Filtering[Mainpage.index].setText("위례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창곡동":
			crolling.area += ",B1600210";
			Mainpage.Filtering[Mainpage.index].setText("창곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평동":
			crolling.area += ",B1600260";
			Mainpage.Filtering[Mainpage.index].setText("태평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평1동":
			crolling.area += ",B1600220";
			Mainpage.Filtering[Mainpage.index].setText("태평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평2동":
			crolling.area += ",B1600230";
			Mainpage.Filtering[Mainpage.index].setText("태평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평3동":
			crolling.area += ",B1600240";
			Mainpage.Filtering[Mainpage.index].setText("태평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태평4동":
			crolling.area += ",B1600250";
			Mainpage.Filtering[Mainpage.index].setText("태평4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시갈현동":
			crolling.area += ",B1700010";
			Mainpage.Filtering[Mainpage.index].setText("성남시갈현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광동":
			crolling.area += ",B1700040";
			Mainpage.Filtering[Mainpage.index].setText("금광동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광1동":
			crolling.area += ",B1700020";
			Mainpage.Filtering[Mainpage.index].setText("금광1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금광2동":
			crolling.area += ",B1700030";
			Mainpage.Filtering[Mainpage.index].setText("금광2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도촌동":
			crolling.area += ",B1700050";
			Mainpage.Filtering[Mainpage.index].setText("도촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원동":
			crolling.area += ",B1700090";
			Mainpage.Filtering[Mainpage.index].setText("상대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원1동":
			crolling.area += ",B1700060";
			Mainpage.Filtering[Mainpage.index].setText("상대원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원2동":
			crolling.area += ",B1700070";
			Mainpage.Filtering[Mainpage.index].setText("상대원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상대원3동":
			crolling.area += ",B1700080";
			Mainpage.Filtering[Mainpage.index].setText("상대원3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",B1700100";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수동":
			crolling.area += ",B1700110";
			Mainpage.Filtering[Mainpage.index].setText("여수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행동":
			crolling.area += ",B1700140";
			Mainpage.Filtering[Mainpage.index].setText("은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행1동":
			crolling.area += ",B1700120";
			Mainpage.Filtering[Mainpage.index].setText("은행1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은행2동":
			crolling.area += ",B1700130";
			Mainpage.Filtering[Mainpage.index].setText("은행2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남시중앙동":
			crolling.area += ",B1700150";
			Mainpage.Filtering[Mainpage.index].setText("성남시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하대원동":
			crolling.area += ",B1700160";
			Mainpage.Filtering[Mainpage.index].setText("하대원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고색동":
			crolling.area += ",B1800010";
			Mainpage.Filtering[Mainpage.index].setText("고색동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곡반정동":
			crolling.area += ",B1800020";
			Mainpage.Filtering[Mainpage.index].setText("곡반정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구운동":
			crolling.area += ",B1800030";
			Mainpage.Filtering[Mainpage.index].setText("구운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권선동":
			crolling.area += ",B1800040";
			Mainpage.Filtering[Mainpage.index].setText("권선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시금곡동":
			crolling.area += ",B1800050";
			Mainpage.Filtering[Mainpage.index].setText("수원시금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당수동":
			crolling.area += ",B1800060";
			Mainpage.Filtering[Mainpage.index].setText("당수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대황교동":
			crolling.area += ",B1800070";
			Mainpage.Filtering[Mainpage.index].setText("대황교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서둔동":
			crolling.area += ",B1800080";
			Mainpage.Filtering[Mainpage.index].setText("서둔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류동":
			crolling.area += ",B1800120";
			Mainpage.Filtering[Mainpage.index].setText("세류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류1동":
			crolling.area += ",B1800090";
			Mainpage.Filtering[Mainpage.index].setText("세류1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류2동":
			crolling.area += ",B1800100";
			Mainpage.Filtering[Mainpage.index].setText("세류2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세류3동":
			crolling.area += ",B1800110";
			Mainpage.Filtering[Mainpage.index].setText("세류3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오목천동":
			crolling.area += ",B1800130";
			Mainpage.Filtering[Mainpage.index].setText("오목천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입북동":
			crolling.area += ",B1800140";
			Mainpage.Filtering[Mainpage.index].setText("입북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시장지동":
			crolling.area += ",B1800150";
			Mainpage.Filtering[Mainpage.index].setText("수원시장지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탑동":
			crolling.area += ",B1800160";
			Mainpage.Filtering[Mainpage.index].setText("탑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평동":
			crolling.area += ",B1800170";
			Mainpage.Filtering[Mainpage.index].setText("평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평리동":
			crolling.area += ",B1800180";
			Mainpage.Filtering[Mainpage.index].setText("평리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호매실동":
			crolling.area += ",B1800190";
			Mainpage.Filtering[Mainpage.index].setText("호매실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광교동":
			crolling.area += ",B2010120";
			Mainpage.Filtering[Mainpage.index].setText("광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망포동":
			crolling.area += ",B2010010";
			Mainpage.Filtering[Mainpage.index].setText("망포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄동":
			crolling.area += ",B2010060";
			Mainpage.Filtering[Mainpage.index].setText("매탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄1동":
			crolling.area += ",B2010020";
			Mainpage.Filtering[Mainpage.index].setText("매탄1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄2동":
			crolling.area += ",B2010030";
			Mainpage.Filtering[Mainpage.index].setText("매탄2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄3동":
			crolling.area += ",B2010040";
			Mainpage.Filtering[Mainpage.index].setText("매탄3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매탄4동":
			crolling.area += ",B2010050";
			Mainpage.Filtering[Mainpage.index].setText("매탄4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",B2010070";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통동":
			crolling.area += ",B2010080";
			Mainpage.Filtering[Mainpage.index].setText("영통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통1동":
			crolling.area += ",B2010075";
			Mainpage.Filtering[Mainpage.index].setText("영통1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영통2동":
			crolling.area += ",B2010076";
			Mainpage.Filtering[Mainpage.index].setText("영통2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원천동":
			crolling.area += ",B2010090";
			Mainpage.Filtering[Mainpage.index].setText("원천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이의동":
			crolling.area += ",B2010100";
			Mainpage.Filtering[Mainpage.index].setText("이의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장동":
			crolling.area += ",B2010130";
			Mainpage.Filtering[Mainpage.index].setText("태장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하동":
			crolling.area += ",B2010110";
			Mainpage.Filtering[Mainpage.index].setText("하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상광교동":
			crolling.area += ",B1900010";
			Mainpage.Filtering[Mainpage.index].setText("상광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송죽동":
			crolling.area += ",B1900020";
			Mainpage.Filtering[Mainpage.index].setText("송죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연무동":
			crolling.area += ",B1900030";
			Mainpage.Filtering[Mainpage.index].setText("연무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영화동":
			crolling.area += ",B1900040";
			Mainpage.Filtering[Mainpage.index].setText("영화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율전동":
			crolling.area += ",B1900050";
			Mainpage.Filtering[Mainpage.index].setText("율전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이목동":
			crolling.area += ",B1900060";
			Mainpage.Filtering[Mainpage.index].setText("이목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자동":
			crolling.area += ",B1900100";
			Mainpage.Filtering[Mainpage.index].setText("수원정자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자1동":
			crolling.area += ",B1900070";
			Mainpage.Filtering[Mainpage.index].setText("수원정자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자2동":
			crolling.area += ",B1900080";
			Mainpage.Filtering[Mainpage.index].setText("수원정자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원정자3동":
			crolling.area += ",B1900090";
			Mainpage.Filtering[Mainpage.index].setText("수원정자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원동":
			crolling.area += ",B1900110";
			Mainpage.Filtering[Mainpage.index].setText("조원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원1동":
			crolling.area += ",B1900111";
			Mainpage.Filtering[Mainpage.index].setText("조원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원2동":
			crolling.area += ",B1900112";
			Mainpage.Filtering[Mainpage.index].setText("조원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천천동":
			crolling.area += ",B1900120";
			Mainpage.Filtering[Mainpage.index].setText("천천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파장동":
			crolling.area += ",B1900130";
			Mainpage.Filtering[Mainpage.index].setText("파장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하광교동":
			crolling.area += ",B1900140";
			Mainpage.Filtering[Mainpage.index].setText("하광교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시고등동":
			crolling.area += ",B2000010";
			Mainpage.Filtering[Mainpage.index].setText("수원시고등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",B2000020";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구천동":
			crolling.area += ",B2000030";
			Mainpage.Filtering[Mainpage.index].setText("구천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남수동":
			crolling.area += ",B2000040";
			Mainpage.Filtering[Mainpage.index].setText("남수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남창동":
			crolling.area += ",B2000050";
			Mainpage.Filtering[Mainpage.index].setText("남창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매교동":
			crolling.area += ",B2000060";
			Mainpage.Filtering[Mainpage.index].setText("매교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로1가":
			crolling.area += ",B2000070";
			Mainpage.Filtering[Mainpage.index].setText("매산로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로2가":
			crolling.area += ",B2000080";
			Mainpage.Filtering[Mainpage.index].setText("매산로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산로3가":
			crolling.area += ",B2000090";
			Mainpage.Filtering[Mainpage.index].setText("매산로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매향동":
			crolling.area += ",B2000100";
			Mainpage.Filtering[Mainpage.index].setText("매향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북수동":
			crolling.area += ",B2000110";
			Mainpage.Filtering[Mainpage.index].setText("북수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신풍동":
			crolling.area += ",B2000120";
			Mainpage.Filtering[Mainpage.index].setText("신풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",B2000130";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만동":
			crolling.area += ",B2000160";
			Mainpage.Filtering[Mainpage.index].setText("우만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만1동":
			crolling.area += ",B2000140";
			Mainpage.Filtering[Mainpage.index].setText("우만1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우만2동":
			crolling.area += ",B2000150";
			Mainpage.Filtering[Mainpage.index].setText("우만2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인계동":
			crolling.area += ",B2000170";
			Mainpage.Filtering[Mainpage.index].setText("인계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			crolling.area += ",B2000180";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수원시중동":
			crolling.area += ",B2000190";
			Mainpage.Filtering[Mainpage.index].setText("수원시중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지동":
			crolling.area += ",B2000200";
			Mainpage.Filtering[Mainpage.index].setText("지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로1가":
			crolling.area += ",B2000210";
			Mainpage.Filtering[Mainpage.index].setText("팔달로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로2가":
			crolling.area += ",B2000220";
			Mainpage.Filtering[Mainpage.index].setText("팔달로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔달로3가":
			crolling.area += ",B2000230";
			Mainpage.Filtering[Mainpage.index].setText("팔달로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서동":
			crolling.area += ",B2000260";
			Mainpage.Filtering[Mainpage.index].setText("화서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서1동":
			crolling.area += ",B2000240";
			Mainpage.Filtering[Mainpage.index].setText("화서1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화서2동":
			crolling.area += ",B2000250";
			Mainpage.Filtering[Mainpage.index].setText("화서2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거모동":
			crolling.area += ",B2100010";
			Mainpage.Filtering[Mainpage.index].setText("거모동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시계수동":
			crolling.area += ",B2100020";
			Mainpage.Filtering[Mainpage.index].setText("시흥시계수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과림동":
			crolling.area += ",B2100030";
			Mainpage.Filtering[Mainpage.index].setText("과림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광석동":
			crolling.area += ",B2100040";
			Mainpage.Filtering[Mainpage.index].setText("광석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			crolling.area += ",B2100050";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금이동":
			crolling.area += ",B2100060";
			Mainpage.Filtering[Mainpage.index].setText("금이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논곡동":
			crolling.area += ",B2100070";
			Mainpage.Filtering[Mainpage.index].setText("논곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시능곡동":
			crolling.area += ",B2100080";
			Mainpage.Filtering[Mainpage.index].setText("시흥시능곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대야동":
			crolling.area += ",B2100090";
			Mainpage.Filtering[Mainpage.index].setText("대야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도창동":
			crolling.area += ",B2100100";
			Mainpage.Filtering[Mainpage.index].setText("도창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매화동":
			crolling.area += ",B2100110";
			Mainpage.Filtering[Mainpage.index].setText("매화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목감동":
			crolling.area += ",B2100120";
			Mainpage.Filtering[Mainpage.index].setText("목감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무지내동":
			crolling.area += ",B2100130";
			Mainpage.Filtering[Mainpage.index].setText("무지내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "물왕동":
			crolling.area += ",B2100140";
			Mainpage.Filtering[Mainpage.index].setText("물왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미산동":
			crolling.area += ",B2100150";
			Mainpage.Filtering[Mainpage.index].setText("미산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산동":
			crolling.area += ",B2100160";
			Mainpage.Filtering[Mainpage.index].setText("방산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배곧동":
			crolling.area += ",B2100165";
			Mainpage.Filtering[Mainpage.index].setText("배곧동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산현동":
			crolling.area += ",B2100170";
			Mainpage.Filtering[Mainpage.index].setText("산현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신천동":
			crolling.area += ",B2100180";
			Mainpage.Filtering[Mainpage.index].setText("신천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신현동":
			crolling.area += ",B2100350";
			Mainpage.Filtering[Mainpage.index].setText("신현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안현동":
			crolling.area += ",B2100190";
			Mainpage.Filtering[Mainpage.index].setText("안현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연성동":
			crolling.area += ",B2100360";
			Mainpage.Filtering[Mainpage.index].setText("연성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곶동":
			crolling.area += ",B2100200";
			Mainpage.Filtering[Mainpage.index].setText("월곶동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시은행동":
			crolling.area += ",B2100210";
			Mainpage.Filtering[Mainpage.index].setText("시흥시은행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장곡동":
			crolling.area += ",B2100220";
			Mainpage.Filtering[Mainpage.index].setText("장곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장현동":
			crolling.area += ",B2100230";
			Mainpage.Filtering[Mainpage.index].setText("장현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕동":
			crolling.area += ",B2100280";
			Mainpage.Filtering[Mainpage.index].setText("정왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕1동":
			crolling.area += ",B2100240";
			Mainpage.Filtering[Mainpage.index].setText("정왕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕2동":
			crolling.area += ",B2100250";
			Mainpage.Filtering[Mainpage.index].setText("정왕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕3동":
			crolling.area += ",B2100260";
			Mainpage.Filtering[Mainpage.index].setText("정왕3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕4동":
			crolling.area += ",B2100270";
			Mainpage.Filtering[Mainpage.index].setText("정왕4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정왕본동":
			crolling.area += ",B2100285";
			Mainpage.Filtering[Mainpage.index].setText("정왕본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조남동":
			crolling.area += ",B2100290";
			Mainpage.Filtering[Mainpage.index].setText("조남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽율동":
			crolling.area += ",B2100300";
			Mainpage.Filtering[Mainpage.index].setText("죽율동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포동":
			crolling.area += ",B2100310";
			Mainpage.Filtering[Mainpage.index].setText("포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하상동":
			crolling.area += ",B2100320";
			Mainpage.Filtering[Mainpage.index].setText("하상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하중동":
			crolling.area += ",B2100330";
			Mainpage.Filtering[Mainpage.index].setText("하중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥시화정동":
			crolling.area += ",B2100340";
			Mainpage.Filtering[Mainpage.index].setText("시흥시화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고잔동":
			crolling.area += ",B2200030";
			Mainpage.Filtering[Mainpage.index].setText("고잔동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부남동":
			crolling.area += ",B2200040";
			Mainpage.Filtering[Mainpage.index].setText("대부남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부동":
			crolling.area += ",B2200230";
			Mainpage.Filtering[Mainpage.index].setText("대부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부동동":
			crolling.area += ",B2200050";
			Mainpage.Filtering[Mainpage.index].setText("대부동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대부북동":
			crolling.area += ",B2200060";
			Mainpage.Filtering[Mainpage.index].setText("대부북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목내동":
			crolling.area += ",B2200070";
			Mainpage.Filtering[Mainpage.index].setText("목내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백운동":
			crolling.area += ",B2200240";
			Mainpage.Filtering[Mainpage.index].setText("백운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선감동":
			crolling.area += ",B2200080";
			Mainpage.Filtering[Mainpage.index].setText("선감동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부동":
			crolling.area += ",B2200120";
			Mainpage.Filtering[Mainpage.index].setText("선부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부1동":
			crolling.area += ",B2200090";
			Mainpage.Filtering[Mainpage.index].setText("선부1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부2동":
			crolling.area += ",B2200100";
			Mainpage.Filtering[Mainpage.index].setText("선부2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선부3동":
			crolling.area += ",B2200110";
			Mainpage.Filtering[Mainpage.index].setText("선부3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시성곡동":
			crolling.area += ",B2200130";
			Mainpage.Filtering[Mainpage.index].setText("안산시성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신길동":
			crolling.area += ",B2200140";
			Mainpage.Filtering[Mainpage.index].setText("신길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와동":
			crolling.area += ",B2200150";
			Mainpage.Filtering[Mainpage.index].setText("와동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원곡동":
			crolling.area += ",B2200180";
			Mainpage.Filtering[Mainpage.index].setText("원곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원시동":
			crolling.area += ",B2200190";
			Mainpage.Filtering[Mainpage.index].setText("원시동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시중앙동":
			crolling.area += ",B2200250";
			Mainpage.Filtering[Mainpage.index].setText("안산시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초지동":
			crolling.area += ",B2200200";
			Mainpage.Filtering[Mainpage.index].setText("초지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍도동":
			crolling.area += ",B2200210";
			Mainpage.Filtering[Mainpage.index].setText("풍도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호수동":
			crolling.area += ",B2200260";
			Mainpage.Filtering[Mainpage.index].setText("호수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시화정동":
			crolling.area += ",B2200220";
			Mainpage.Filtering[Mainpage.index].setText("안산시화정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건건동":
			crolling.area += ",B2210010";
			Mainpage.Filtering[Mainpage.index].setText("건건동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",B2210210";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오동":
			crolling.area += ",B2210050";
			Mainpage.Filtering[Mainpage.index].setText("본오동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오1동":
			crolling.area += ",B2210020";
			Mainpage.Filtering[Mainpage.index].setText("본오1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오2동":
			crolling.area += ",B2210030";
			Mainpage.Filtering[Mainpage.index].setText("본오2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본오3동":
			crolling.area += ",B2210040";
			Mainpage.Filtering[Mainpage.index].setText("본오3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산시부곡동":
			crolling.area += ",B2210060";
			Mainpage.Filtering[Mainpage.index].setText("안산시부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사동":
			crolling.area += ",B2210090";
			Mainpage.Filtering[Mainpage.index].setText("사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사사동":
			crolling.area += ",B2210100";
			Mainpage.Filtering[Mainpage.index].setText("사사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사이동":
			crolling.area += ",B2210080";
			Mainpage.Filtering[Mainpage.index].setText("사이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성포동":
			crolling.area += ",B2210110";
			Mainpage.Filtering[Mainpage.index].setText("성포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수암동":
			crolling.area += ",B2210120";
			Mainpage.Filtering[Mainpage.index].setText("수암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산동":
			crolling.area += ",B2210220";
			Mainpage.Filtering[Mainpage.index].setText("안산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양상동":
			crolling.area += ",B2210130";
			Mainpage.Filtering[Mainpage.index].setText("양상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월피동":
			crolling.area += ",B2210140";
			Mainpage.Filtering[Mainpage.index].setText("월피동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",B2210150";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일동":
			crolling.area += ",B2210160";
			Mainpage.Filtering[Mainpage.index].setText("일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장상동":
			crolling.area += ",B2210170";
			Mainpage.Filtering[Mainpage.index].setText("장상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장하동":
			crolling.area += ",B2210180";
			Mainpage.Filtering[Mainpage.index].setText("장하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔곡이동":
			crolling.area += ",B2210190";
			Mainpage.Filtering[Mainpage.index].setText("팔곡이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔곡일동":
			crolling.area += ",B2210200";
			Mainpage.Filtering[Mainpage.index].setText("팔곡일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해양동":
			crolling.area += ",B2210230";
			Mainpage.Filtering[Mainpage.index].setText("해양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
