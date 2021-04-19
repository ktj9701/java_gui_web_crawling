package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Chungnam {
	public boolean flag;

	public void ChungnamCity(ActionEvent e) {
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
		case "금앙동":
			crolling.area += ",O1600010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두마면":
			crolling.area += ",O1600030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신도안면":
			crolling.area += ",O1600020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신도안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄사면":
			crolling.area += ",O1600040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("엄사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "검상동":
			crolling.area += ",O0100010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("검상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계룡면":
			crolling.area += ",O0100020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("계룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",O0100030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성동":
			crolling.area += ",O0100040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금학동":
			crolling.area += ",O0100050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금흉동":
			crolling.area += ",O0100060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금흉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무릉동":
			crolling.area += ",O0100070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("무릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반죽동":
			crolling.area += ",O0100080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("반죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포면":
			crolling.area += ",O0100090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("반포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉정동":
			crolling.area += ",O0100100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉황동":
			crolling.area += ",O0100110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사곡면":
			crolling.area += ",O0100120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산성동":
			crolling.area += ",O0100130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("산성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상왕동":
			crolling.area += ",O0100140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소학동":
			crolling.area += ",O0100150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신관동":
			crolling.area += ",O0100160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			crolling.area += ",O0100170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신풍면":
			crolling.area += ",O0100180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍신동":
			crolling.area += ",O0100190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오곡동":
			crolling.area += ",O0100200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥룡동":
			crolling.area += ",O0100210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("옥룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우성면":
			crolling.area += ",O0100220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("우성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅진동":
			crolling.area += ",O0100230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("웅진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월미동":
			crolling.area += ",O0100240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월송동":
			crolling.area += ",O0100250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("월송동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유구읍":
			crolling.area += ",O0100260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유구읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의당면":
			crolling.area += ",O0100270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("의당면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이인면":
			crolling.area += ",O0100280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("이인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정안면":
			crolling.area += ",O0100300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("정안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주미동":
			crolling.area += ",O0100310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",O0100320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중학동":
			crolling.area += ",O0100330";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("중학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탄천면":
			crolling.area += ",O0100340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("탄천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태봉동":
			crolling.area += ",O0100350";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군북면":
			crolling.area += ",O0200010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산읍":
			crolling.area += ",O0200020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",O0200030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남이면":
			crolling.area += ",O0200040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남일면":
			crolling.area += ",O0200050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복수면":
			crolling.area += ",O0200060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("복수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부리면":
			crolling.area += ",O0200070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제원면":
			crolling.area += ",O0200080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("제원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진산면":
			crolling.area += ",O0200090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("진산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추부면":
			crolling.area += ",O0200100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("추부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가야곡면":
			crolling.area += ",O0300010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("가야곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강경읍":
			crolling.area += ",O0300020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("강경읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강산동":
			crolling.area += ",O0300030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("강산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관촉동":
			crolling.area += ",O0300040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("관촉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광석면":
			crolling.area += ",O0300050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("광석면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",O0300060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노성면":
			crolling.area += ",O0300070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("노성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대교동":
			crolling.area += ",O0300080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕지동":
			crolling.area += ",O0300090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등화동":
			crolling.area += ",O0300100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("등화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반월동":
			crolling.area += ",O0300110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("반월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벌곡면":
			crolling.area += ",O0300120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("벌곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부적면":
			crolling.area += ",O0300130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부적면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부창동":
			crolling.area += ",O0300140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상월면":
			crolling.area += ",O0300150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("상월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성동면":
			crolling.area += ",O0300160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양촌면":
			crolling.area += ",O0300170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연무읍":
			crolling.area += ",O0300180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연무읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산면":
			crolling.area += ",O0300190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("연산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은진면":
			crolling.area += ",O0300200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("은진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산동":
			crolling.area += ",O0300210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "채운면":
			crolling.area += ",O0300220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("채운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "취암동":
			crolling.area += ",O0300230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("취암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화지동":
			crolling.area += ",O0300240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고대면":
			crolling.area += ",O0400010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("고대면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구룡동":
			crolling.area += ",O0400130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당진1동":
			crolling.area += ",O0400021";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("당진1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당진2동":
			crolling.area += ",O0400022";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("당진2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당진3동":
			crolling.area += ",O0400023";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("당진3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕동":
			crolling.area += ",O0400140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대호지면":
			crolling.area += ",O0400030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대호지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "면천면":
			crolling.area += ",O0400040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("면천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사기소동":
			crolling.area += ",O0400150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사기소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석문면":
			crolling.area += ",O0400050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송산면":
			crolling.area += ",O0400060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송악읍":
			crolling.area += ",O0400070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송악읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수청동":
			crolling.area += ",O0400160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순성면":
			crolling.area += ",O0400080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("순성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시곡동":
			crolling.area += ",O0400170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("시곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평면":
			crolling.area += ",O0400090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용연동":
			crolling.area += ",O0400180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우강면":
			crolling.area += ",O0400100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("우강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우두동":
			crolling.area += ",O0400190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("우두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			crolling.area += ",O0400200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍내동":
			crolling.area += ",O0400210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("읍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정미면":
			crolling.area += ",O0400110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("정미면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "채운동":
			crolling.area += ",O0400220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("채운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합덕읍":
			crolling.area += ",O0400120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("합덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행정동":
			crolling.area += ",O0400230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("행정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁촌동":
			crolling.area += ",O0500010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("궁촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남곡동":
			crolling.area += ",O0500020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남포면":
			crolling.area += ",O0500030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내항동":
			crolling.area += ",O0500040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천동":
			crolling.area += ",O0500070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천1동":
			crolling.area += ",O0500050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대천2동":
			crolling.area += ",O0500060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동대동":
			crolling.area += ",O0500080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명천동":
			crolling.area += ",O0500090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("명천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미산면":
			crolling.area += ",O0500100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("미산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성주면":
			crolling.area += ",O0500110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신혹동":
			crolling.area += ",O0500120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신혹동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오천면":
			crolling.area += ",O0500130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "요암동":
			crolling.area += ",O0500140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("요암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅천읍":
			crolling.area += ",O0500150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("웅천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주교면":
			crolling.area += ",O0500160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주교면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주산면":
			crolling.area += ",O0500170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주포면":
			crolling.area += ",O0500180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("주포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽정동":
			crolling.area += ",O0500190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("죽정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천북면":
			crolling.area += ",O0500200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("천북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청라면":
			crolling.area += ",O0500210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청라면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청소면":
			crolling.area += ",O0500220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청소면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산동":
			crolling.area += ",O0500230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구룡면":
			crolling.area += ",O0600010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "규암면":
			crolling.area += ",O0600020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("규암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",O0600030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내산면":
			crolling.area += ",O0600040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("내산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부여읍":
			crolling.area += ",O0600050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부여읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석성면":
			crolling.area += ",O0600060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세도면":
			crolling.area += ",O0600070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("세도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양화면":
			crolling.area += ",O0600080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산면":
			crolling.area += ",O0600090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("옥산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외산면":
			crolling.area += ",O0600100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("외산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은산면":
			crolling.area += ",O0600110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("은산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임천면":
			crolling.area += ",O0600120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("임천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장암면":
			crolling.area += ",O0600130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("역동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초촌면":
			crolling.area += ",O0600140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("초촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충화면":
			crolling.area += ",O0600150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("충화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍산면":
			crolling.area += ",O0600160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("홍산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산동":
			crolling.area += ",O0700010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갈산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고북면":
			crolling.area += ",O0700020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("고북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대산읍":
			crolling.area += ",O0700030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕지천동":
			crolling.area += ",O0700040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕지천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동문동":
			crolling.area += ",O0700050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부석면":
			crolling.area += ",O0700060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부석면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석남동":
			crolling.area += ",O0700070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석림동":
			crolling.area += ",O0700080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("석림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성연면":
			crolling.area += ",O0700090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성연면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수석동":
			crolling.area += ",O0700100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양대동":
			crolling.area += ",O0700110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("양대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예천동":
			crolling.area += ",O0700120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("예천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오남동":
			crolling.area += ",O0700130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온석동":
			crolling.area += ",O0700140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("온석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운산면":
			crolling.area += ",O0700150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "음암면":
			crolling.area += ",O0700160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("음암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서산시읍내동":
			crolling.area += ",O0700170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서산시읍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인지면":
			crolling.area += ",O0700180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("인지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠홍동":
			crolling.area += ",O0700190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("잠홍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동":
			crolling.area += ",O0700200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽성동":
			crolling.area += ",O0700210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("죽성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡면":
			crolling.area += ",O0700220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("지곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔봉면":
			crolling.area += ",O0700230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("팔봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해미면":
			crolling.area += ",O0700240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("해미면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기산면":
			crolling.area += ",O0800010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("기산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산면":
			crolling.area += ",O0800020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("마산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마서면":
			crolling.area += ",O0800030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("마서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문산면":
			crolling.area += ",O0800040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비인면":
			crolling.area += ",O0800050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("비인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			crolling.area += ",O0800060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서천읍":
			crolling.area += ",O0800070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시초면":
			crolling.area += ",O0800080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("시초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장항읍":
			crolling.area += ",O0800090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장항읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종천면":
			crolling.area += ",O0800100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("종천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판교면":
			crolling.area += ",O0800110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("판교면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한산면":
			crolling.area += ",O0800120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("한산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화양면":
			crolling.area += ",O0800130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "권곡동":
			crolling.area += ",O0900010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("권곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기산동":
			crolling.area += ",O0900020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("기산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남동":
			crolling.area += ",O0900030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도고면":
			crolling.area += ",O0900040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("도고면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔포면":
			crolling.area += ",O0900050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("둔포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "득산동":
			crolling.area += ",O0900060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("득산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "모종동":
			crolling.area += ",O0900070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("모종동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방축동":
			crolling.area += ",O0900080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("방축동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배미동":
			crolling.area += ",O0900090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("배미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "배방읍":
			crolling.area += ",O0900100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("배방읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법곡동":
			crolling.area += ",O0900110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("법곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선장면":
			crolling.area += ",O0900120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("선장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송악면":
			crolling.area += ",O0900130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("송악면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",O0900140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신인동":
			crolling.area += ",O0900150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신창면":
			crolling.area += ",O0900160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신창면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "실옥동":
			crolling.area += ",O0900170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("실옥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염치읍":
			crolling.area += ",O0900180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("염치읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영인면":
			crolling.area += ",O0900190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("영인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온양1동":
			crolling.area += ",O0900200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("온양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온양2동":
			crolling.area += ",O0900210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("온양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온천동":
			crolling.area += ",O0900220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("온천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용화동":
			crolling.area += ",O0900230";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "음봉면":
			crolling.area += ",O0900240";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("음봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아산시읍내동":
			crolling.area += ",O0900250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("아산시읍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인주면":
			crolling.area += ",O0900260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("인주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장존동":
			crolling.area += ",O0900270";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장존동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점양동":
			crolling.area += ",O0900280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("점양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "좌부동":
			crolling.area += ",O0900290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("좌부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초사동":
			crolling.area += ",O0900300";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("초사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "탕정면":
			crolling.area += ",O0900310";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("탕정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍기동":
			crolling.area += ",O0900320";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("풍기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕면":
			crolling.area += ",O1100010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("고덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광시면":
			crolling.area += ",O1100020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("광시면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대술면":
			crolling.area += ",O1100030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대술면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥면":
			crolling.area += ",O1100040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산면":
			crolling.area += ",O1100050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("덕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산면":
			crolling.area += ",O1100060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삽교읍":
			crolling.area += ",O1100070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삽교읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신암면":
			crolling.area += ",O1100080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신양면":
			crolling.area += ",O1100090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예산읍":
			crolling.area += ",O1100100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("예산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오가면":
			crolling.area += ",O1100110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응봉면":
			crolling.area += ",O1100120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("응봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광덕면":
			crolling.area += ",O1200010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("광덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천안시구룡동":
			crolling.area += ",O1200020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("천안시구룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구성동":
			crolling.area += ",O1200030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다가동":
			crolling.area += ",O1200040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("다가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			crolling.area += ",O1200050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동면":
			crolling.area += ",O1200060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목천읍":
			crolling.area += ",O1200080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("목천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문화동":
			crolling.area += ",O1200090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("문화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병천면":
			crolling.area += ",O1200110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("병천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉명동":
			crolling.area += ",O1200120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("봉명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",O1200140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",O1200160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼룡동":
			crolling.area += ",O1200170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("삼룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남면":
			crolling.area += ",O1200190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성황동":
			crolling.area += ",O1200250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수신면":
			crolling.area += ",O1200260";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("수신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신방동":
			crolling.area += ",O1200280";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신부동":
			crolling.area += ",O1200290";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안서동":
			crolling.area += ",O1200340";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("안서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영성동":
			crolling.area += ",O1200360";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("영성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오룡동":
			crolling.area += ",O1200370";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("오룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용곡동":
			crolling.area += ",O1200390";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("용곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원성동":
			crolling.area += ",O1200420";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원성1동":
			crolling.area += ",O1200400";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원성2동":
			crolling.area += ",O1200410";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유량동":
			crolling.area += ",O1200430";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("유량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청당동":
			crolling.area += ",O1200470";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청수동":
			crolling.area += ",O1200480";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍세면":
			crolling.area += ",O1200490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("풍세면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두정동":
			crolling.area += ",O1210010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("두정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백석동":
			crolling.area += ",O1210020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("백석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부대동":
			crolling.area += ",O1210030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부성1동":
			crolling.area += ",O1210210";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부성2동":
			crolling.area += ",O1210220";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("부성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불당동":
			crolling.area += ",O1210040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("불당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성거읍":
			crolling.area += ",O1210050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성거읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성성동":
			crolling.area += ",O1210060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성정동":
			crolling.area += ",O1210090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성정1동":
			crolling.area += ",O1210070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성정2동":
			crolling.area += ",O1210080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성환읍":
			crolling.area += ",O1210100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("성환읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신당동":
			crolling.area += ",O1210110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("신당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍용동":
			crolling.area += ",O1210150";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍용1동":
			crolling.area += ",O1210120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍용1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍용2동":
			crolling.area += ",O1210130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍용2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍용3동":
			crolling.area += ",O1210140";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("쌍용3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "업성동":
			crolling.area += ",O1210160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("업성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와촌동":
			crolling.area += ",O1210170";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("와촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입장면":
			crolling.area += ",O1210180";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("입장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "직산읍":
			crolling.area += ",O1210190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("직산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "차암동":
			crolling.area += ",O1210200";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("차암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양면":
			crolling.area += ",O1300010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("남양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치면":
			crolling.area += ",O1300020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("대치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목면":
			crolling.area += ",O1300030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("목면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비봉면":
			crolling.area += ",O1300040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("비봉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운곡면":
			crolling.area += ",O1300050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("운곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장평면":
			crolling.area += ",O1300060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정산면":
			crolling.area += ",O1300070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("정산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청남면":
			crolling.area += ",O1300080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청양읍":
			crolling.area += ",O1300090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("청양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성면":
			crolling.area += ",O1300100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("화성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고남면":
			crolling.area += ",O1400010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("고남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근흉면":
			crolling.area += ",O1400020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("근흉면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태안군남면":
			crolling.area += ",O1400030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태안군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소원면":
			crolling.area += ",O1400040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("소원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안면읍":
			crolling.area += ",O1400050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("안면읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원북면":
			crolling.area += ",O1400060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("원북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이원면":
			crolling.area += ",O1400070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("이원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태안읍":
			crolling.area += ",O1400080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("태안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈산면":
			crolling.area += ",O1500010";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("갈산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "결성면":
			crolling.area += ",O1500020";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("결성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광천읍":
			crolling.area += ",O1500030";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("광천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구항면":
			crolling.area += ",O1500040";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("구항면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금마면":
			crolling.area += ",O1500050";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("금마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서부면":
			crolling.area += ",O1500060";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("서부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은하면":
			crolling.area += ",O1500070";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("은하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장곡면":
			crolling.area += ",O1500080";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("장곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍동면":
			crolling.area += ",O1500090";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("홍동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍북읍":
			crolling.area += ",O1500100";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("홍북읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍성읍":
			crolling.area += ",O1500110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("홍성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
