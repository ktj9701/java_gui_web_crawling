package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Gyeongbuk2 {
	public boolean flag;

	public void Gyeongbuk2City(ActionEvent e) {
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
		//성주군
		case "가천면":
			crolling.area += ",D1000010";
			Mainpage.Filtering[Mainpage.index].setText("가천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금수면":
			crolling.area += ",D1000020";
			Mainpage.Filtering[Mainpage.index].setText("금수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대가면":
			crolling.area += ",D1000030";
			Mainpage.Filtering[Mainpage.index].setText("대가면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벽진면":
			crolling.area += ",D1000040";
			Mainpage.Filtering[Mainpage.index].setText("벽진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선남면":
			crolling.area += ",D1000050";
			Mainpage.Filtering[Mainpage.index].setText("선남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성주읍":
			crolling.area += ",D1000060";
			Mainpage.Filtering[Mainpage.index].setText("성주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수륜면":
			crolling.area += ",D1000070";
			Mainpage.Filtering[Mainpage.index].setText("수륜면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용암면":
			crolling.area += ",D1000080";
			Mainpage.Filtering[Mainpage.index].setText("용암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월항면":
			crolling.area += ",D1000090";
			Mainpage.Filtering[Mainpage.index].setText("월항면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초전면":
			crolling.area += ",D1000100";
			Mainpage.Filtering[Mainpage.index].setText("초전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//안동시
		case "광석동":
			crolling.area += ",D1100010";
			Mainpage.Filtering[Mainpage.index].setText("광석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",D1100020";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길안면":
			crolling.area += ",D1100030";
			Mainpage.Filtering[Mainpage.index].setText("길안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문동":
			crolling.area += ",D1100040";
			Mainpage.Filtering[Mainpage.index].setText("남문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남부동":
			crolling.area += ",D1100050";
			Mainpage.Filtering[Mainpage.index].setText("남부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남선면":
			crolling.area += ",D1100060";
			Mainpage.Filtering[Mainpage.index].setText("남선면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남후면":
			crolling.area += ",D1100070";
			Mainpage.Filtering[Mainpage.index].setText("남후면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노하동":
			crolling.area += ",D1100080";
			Mainpage.Filtering[Mainpage.index].setText("노하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹전면":
			crolling.area += ",D1100090";
			Mainpage.Filtering[Mainpage.index].setText("녹전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당북동":
			crolling.area += ",D1100100";
			Mainpage.Filtering[Mainpage.index].setText("당북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대석동":
			crolling.area += ",D1100110";
			Mainpage.Filtering[Mainpage.index].setText("대석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도산면":
			crolling.area += ",D1100120";
			Mainpage.Filtering[Mainpage.index].setText("도산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동문동":
			crolling.area += ",D1100130";
			Mainpage.Filtering[Mainpage.index].setText("동문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동부동":
			crolling.area += ",D1100140";
			Mainpage.Filtering[Mainpage.index].setText("동부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",D1100150";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목성동":
			crolling.area += ",D1100160";
			Mainpage.Filtering[Mainpage.index].setText("목성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법상동":
			crolling.area += ",D1100170";
			Mainpage.Filtering[Mainpage.index].setText("법상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법흥동":
			crolling.area += ",D1100180";
			Mainpage.Filtering[Mainpage.index].setText("법흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북문동":
			crolling.area += ",D1100190";
			Mainpage.Filtering[Mainpage.index].setText("북문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북후면":
			crolling.area += ",D1100200";
			Mainpage.Filtering[Mainpage.index].setText("북후면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산동":
			crolling.area += ",D1100210";
			Mainpage.Filtering[Mainpage.index].setText("삼산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상아동":
			crolling.area += ",D1100220";
			Mainpage.Filtering[Mainpage.index].setText("상아동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서부동":
			crolling.area += ",D1100230";
			Mainpage.Filtering[Mainpage.index].setText("서부동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서후면":
			crolling.area += ",D1100240";
			Mainpage.Filtering[Mainpage.index].setText("서후면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석동동":
			crolling.area += ",D1100250";
			Mainpage.Filtering[Mainpage.index].setText("석동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성곡동":
			crolling.area += ",D1100260";
			Mainpage.Filtering[Mainpage.index].setText("성곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동":
			crolling.area += ",D1100270";
			Mainpage.Filtering[Mainpage.index].setText("송천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송현동":
			crolling.area += ",D1100280";
			Mainpage.Filtering[Mainpage.index].setText("송현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수상동":
			crolling.area += ",D1100290";
			Mainpage.Filtering[Mainpage.index].setText("수상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수하동":
			crolling.area += ",D1100300";
			Mainpage.Filtering[Mainpage.index].setText("수하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신세동":
			crolling.area += ",D1100310";
			Mainpage.Filtering[Mainpage.index].setText("신세동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신안동":
			crolling.area += ",D1100320";
			Mainpage.Filtering[Mainpage.index].setText("신안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안기동":
			crolling.area += ",D1100330";
			Mainpage.Filtering[Mainpage.index].setText("안기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안막동":
			crolling.area += ",D1100340";
			Mainpage.Filtering[Mainpage.index].setText("안막동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥동":
			crolling.area += ",D1100350";
			Mainpage.Filtering[Mainpage.index].setText("안흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예안면":
			crolling.area += ",D1100360";
			Mainpage.Filtering[Mainpage.index].setText("예안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥동":
			crolling.area += ",D1100370";
			Mainpage.Filtering[Mainpage.index].setText("옥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥야동":
			crolling.area += ",D1100380";
			Mainpage.Filtering[Mainpage.index].setText("옥야동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥정동":
			crolling.area += ",D1100390";
			Mainpage.Filtering[Mainpage.index].setText("옥정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡면":
			crolling.area += ",D1100400";
			Mainpage.Filtering[Mainpage.index].setText("와룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용상동":
			crolling.area += ",D1100410";
			Mainpage.Filtering[Mainpage.index].setText("용상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운안동":
			crolling.area += ",D1100420";
			Mainpage.Filtering[Mainpage.index].setText("운안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운흥동":
			crolling.area += ",D1100430";
			Mainpage.Filtering[Mainpage.index].setText("운흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율세동":
			crolling.area += ",D1100440";
			Mainpage.Filtering[Mainpage.index].setText("율세동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이천동":
			crolling.area += ",D1100450";
			Mainpage.Filtering[Mainpage.index].setText("이천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일직면":
			crolling.area += ",D1100460";
			Mainpage.Filtering[Mainpage.index].setText("일직면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임동면":
			crolling.area += ",D1100470";
			Mainpage.Filtering[Mainpage.index].setText("임동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임하면":
			crolling.area += ",D1100480";
			Mainpage.Filtering[Mainpage.index].setText("임하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정상동":
			crolling.area += ",D1100490";
			Mainpage.Filtering[Mainpage.index].setText("정상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정하동":
			crolling.area += ",D1100500";
			Mainpage.Filtering[Mainpage.index].setText("정하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천리동":
			crolling.area += ",D1100510";
			Mainpage.Filtering[Mainpage.index].setText("천리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태화동":
			crolling.area += ",D1100520";
			Mainpage.Filtering[Mainpage.index].setText("태화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평화동":
			crolling.area += ",D1100530";
			Mainpage.Filtering[Mainpage.index].setText("평화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍산읍":
			crolling.area += ",D1100540";
			Mainpage.Filtering[Mainpage.index].setText("풍산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍천면":
			crolling.area += ",D1100550";
			Mainpage.Filtering[Mainpage.index].setText("풍천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화성동":
			crolling.area += ",D1100560";
			Mainpage.Filtering[Mainpage.index].setText("화성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//영덕군
		case "강구면":
			crolling.area += ",D1200010";
			Mainpage.Filtering[Mainpage.index].setText("강구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남정면":
			crolling.area += ",D1200020";
			Mainpage.Filtering[Mainpage.index].setText("남정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달산면":
			crolling.area += ",D1200030";
			Mainpage.Filtering[Mainpage.index].setText("달산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병곡면":
			crolling.area += ",D1200040";
			Mainpage.Filtering[Mainpage.index].setText("병곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영덕읍":
			crolling.area += ",D1200050";
			Mainpage.Filtering[Mainpage.index].setText("영덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영해면":
			crolling.area += ",D1200060";
			Mainpage.Filtering[Mainpage.index].setText("영해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지품면":
			crolling.area += ",D1200070";
			Mainpage.Filtering[Mainpage.index].setText("지품면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창수면":
			crolling.area += ",D1200080";
			Mainpage.Filtering[Mainpage.index].setText("창수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축산면":
			crolling.area += ",D1200090";
			Mainpage.Filtering[Mainpage.index].setText("축산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//영양군
		case "석보면":
			crolling.area += ",D1300010";
			Mainpage.Filtering[Mainpage.index].setText("석보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수비면":
			crolling.area += ",D1300020";
			Mainpage.Filtering[Mainpage.index].setText("수비면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영양읍":
			crolling.area += ",D1300030";
			Mainpage.Filtering[Mainpage.index].setText("영양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일월면":
			crolling.area += ",D1300040";
			Mainpage.Filtering[Mainpage.index].setText("일월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입암면":
			crolling.area += ",D1300050";
			Mainpage.Filtering[Mainpage.index].setText("입암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청기면":
			crolling.area += ",D1300060";
			Mainpage.Filtering[Mainpage.index].setText("청기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//영주시
		case "가흥동":
			crolling.area += ",D1400030";
			Mainpage.Filtering[Mainpage.index].setText("가흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가흥1동":
			crolling.area += ",D1400010";
			Mainpage.Filtering[Mainpage.index].setText("가흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가흥2동":
			crolling.area += ",D1400020";
			Mainpage.Filtering[Mainpage.index].setText("가흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고현동":
			crolling.area += ",D1400040";
			Mainpage.Filtering[Mainpage.index].setText("고현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단산면":
			crolling.area += ",D1400050";
			Mainpage.Filtering[Mainpage.index].setText("단산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문수면":
			crolling.area += ",D1400060";
			Mainpage.Filtering[Mainpage.index].setText("문수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문정동":
			crolling.area += ",D1400070";
			Mainpage.Filtering[Mainpage.index].setText("문정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉현면":
			crolling.area += ",D1400080";
			Mainpage.Filtering[Mainpage.index].setText("봉현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부석면":
			crolling.area += ",D1400090";
			Mainpage.Filtering[Mainpage.index].setText("부석면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상망동":
			crolling.area += ",D1400100";
			Mainpage.Filtering[Mainpage.index].setText("상망동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상줄동":
			crolling.area += ",D1400110";
			Mainpage.Filtering[Mainpage.index].setText("상줄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순흥면":
			crolling.area += ",D1400120";
			Mainpage.Filtering[Mainpage.index].setText("순흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아지동":
			crolling.area += ",D1400130";
			Mainpage.Filtering[Mainpage.index].setText("아지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안정면":
			crolling.area += ",D1400140";
			Mainpage.Filtering[Mainpage.index].setText("안정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주동":
			crolling.area += ",D1400170";
			Mainpage.Filtering[Mainpage.index].setText("영주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주1동":
			crolling.area += ",D1400150";
			Mainpage.Filtering[Mainpage.index].setText("영주1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영주2동":
			crolling.area += ",D1400160";
			Mainpage.Filtering[Mainpage.index].setText("영주2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이산면":
			crolling.area += ",D1400180";
			Mainpage.Filtering[Mainpage.index].setText("이산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장수면":
			crolling.area += ",D1400190";
			Mainpage.Filtering[Mainpage.index].setText("장수면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적서동":
			crolling.area += ",D1400200";
			Mainpage.Filtering[Mainpage.index].setText("적서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조암동":
			crolling.area += ",D1400210";
			Mainpage.Filtering[Mainpage.index].setText("조암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조와동":
			crolling.area += ",D1400220";
			Mainpage.Filtering[Mainpage.index].setText("조와동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창진동":
			crolling.area += ",D1400230";
			Mainpage.Filtering[Mainpage.index].setText("창진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평은면":
			crolling.area += ",D1400240";
			Mainpage.Filtering[Mainpage.index].setText("평은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍기읍":
			crolling.area += ",D1400250";
			Mainpage.Filtering[Mainpage.index].setText("풍기읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하망동":
			crolling.area += ",D1400260";
			Mainpage.Filtering[Mainpage.index].setText("하망동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴천동":
			crolling.area += ",D1400300";
			Mainpage.Filtering[Mainpage.index].setText("휴천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴천1동":
			crolling.area += ",D1400270";
			Mainpage.Filtering[Mainpage.index].setText("휴천1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴천2동":
			crolling.area += ",D1400280";
			Mainpage.Filtering[Mainpage.index].setText("휴천2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휴천3동":
			crolling.area += ",D1400290";
			Mainpage.Filtering[Mainpage.index].setText("휴천3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//영천시
		case "고경면":
			crolling.area += ",D1500010";
			Mainpage.Filtering[Mainpage.index].setText("고경면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과전동":
			crolling.area += ",D1500020";
			Mainpage.Filtering[Mainpage.index].setText("과전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴연동":
			crolling.area += ",D1500030";
			Mainpage.Filtering[Mainpage.index].setText("괴연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교촌동":
			crolling.area += ",D1500040";
			Mainpage.Filtering[Mainpage.index].setText("교촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금노동":
			crolling.area += ",D1500050";
			Mainpage.Filtering[Mainpage.index].setText("금노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호읍":
			crolling.area += ",D1500060";
			Mainpage.Filtering[Mainpage.index].setText("금호읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "녹전동":
			crolling.area += ",D1500070";
			Mainpage.Filtering[Mainpage.index].setText("녹전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전동":
			crolling.area += ",D1500080";
			Mainpage.Filtering[Mainpage.index].setText("대전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대창면":
			crolling.area += ",D1500090";
			Mainpage.Filtering[Mainpage.index].setText("대창면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도남동":
			crolling.area += ",D1500100";
			Mainpage.Filtering[Mainpage.index].setText("도남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도동":
			crolling.area += ",D1500110";
			Mainpage.Filtering[Mainpage.index].setText("도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도림동":
			crolling.area += ",D1500120";
			Mainpage.Filtering[Mainpage.index].setText("도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망정동":
			crolling.area += ",D1500130";
			Mainpage.Filtering[Mainpage.index].setText("망정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매산동":
			crolling.area += ",D1500140";
			Mainpage.Filtering[Mainpage.index].setText("매산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문내동":
			crolling.area += ",D1500150";
			Mainpage.Filtering[Mainpage.index].setText("문내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문외동":
			crolling.area += ",D1500160";
			Mainpage.Filtering[Mainpage.index].setText("문외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "범어동":
			crolling.area += ",D1500170";
			Mainpage.Filtering[Mainpage.index].setText("범어동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본촌동":
			crolling.area += ",D1500180";
			Mainpage.Filtering[Mainpage.index].setText("본촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉동":
			crolling.area += ",D1500190";
			Mainpage.Filtering[Mainpage.index].setText("봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북안면":
			crolling.area += ",D1500200";
			Mainpage.Filtering[Mainpage.index].setText("북안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서산동":
			crolling.area += ",D1500210";
			Mainpage.Filtering[Mainpage.index].setText("서산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			crolling.area += ",D1500220";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			crolling.area += ",D1500230";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신녕면":
			crolling.area += ",D1500240";
			Mainpage.Filtering[Mainpage.index].setText("신녕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍계동":
			crolling.area += ",D1500250";
			Mainpage.Filtering[Mainpage.index].setText("쌍계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야사동":
			crolling.area += ",D1500260";
			Mainpage.Filtering[Mainpage.index].setText("야사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "언하동":
			crolling.area += ",D1500270";
			Mainpage.Filtering[Mainpage.index].setText("언하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오미동":
			crolling.area += ",D1500280";
			Mainpage.Filtering[Mainpage.index].setText("오미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오수동":
			crolling.area += ",D1500290";
			Mainpage.Filtering[Mainpage.index].setText("오수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완산동":
			crolling.area += ",D1500300";
			Mainpage.Filtering[Mainpage.index].setText("완산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임고면":
			crolling.area += ",D1500310";
			Mainpage.Filtering[Mainpage.index].setText("임고면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양면":
			crolling.area += ",D1500320";
			Mainpage.Filtering[Mainpage.index].setText("자양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작산동":
			crolling.area += ",D1500330";
			Mainpage.Filtering[Mainpage.index].setText("작산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조교동":
			crolling.area += ",D1500340";
			Mainpage.Filtering[Mainpage.index].setText("조교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창구동":
			crolling.area += ",D1500350";
			Mainpage.Filtering[Mainpage.index].setText("창구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "채신동":
			crolling.area += ",D1500360";
			Mainpage.Filtering[Mainpage.index].setText("채신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청통면":
			crolling.area += ",D1500370";
			Mainpage.Filtering[Mainpage.index].setText("청통면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화남면":
			crolling.area += ",D1500380";
			Mainpage.Filtering[Mainpage.index].setText("화남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화룡동":
			crolling.area += ",D1500390";
			Mainpage.Filtering[Mainpage.index].setText("화룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화북면":
			crolling.area += ",D1500400";
			Mainpage.Filtering[Mainpage.index].setText("화북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산면":
			crolling.area += ",D1500410";
			Mainpage.Filtering[Mainpage.index].setText("화산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//예천군
		case "감천면":
			crolling.area += ",D1600010";
			Mainpage.Filtering[Mainpage.index].setText("감천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포면":
			crolling.area += ",D1600020";
			Mainpage.Filtering[Mainpage.index].setText("개포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문면":
			crolling.area += ",D1600030";
			Mainpage.Filtering[Mainpage.index].setText("보문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "예천읍":
			crolling.area += ",D1600050";
			Mainpage.Filtering[Mainpage.index].setText("예천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용궁면":
			crolling.area += ",D1600060";
			Mainpage.Filtering[Mainpage.index].setText("용궁면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용문면":
			crolling.area += ",D1600070";
			Mainpage.Filtering[Mainpage.index].setText("용문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천면":
			crolling.area += ",D1600080";
			Mainpage.Filtering[Mainpage.index].setText("유천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은풍면":
			crolling.area += ",D1600110";
			Mainpage.Filtering[Mainpage.index].setText("은풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지보면":
			crolling.area += ",D1600090";
			Mainpage.Filtering[Mainpage.index].setText("지보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍양면":
			crolling.area += ",D1600100";
			Mainpage.Filtering[Mainpage.index].setText("풍양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호명면":
			crolling.area += ",D1600120";
			Mainpage.Filtering[Mainpage.index].setText("호명면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자면":
			crolling.area += ",D1600040";
			Mainpage.Filtering[Mainpage.index].setText("효자면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//울릉군
		case "북면":
			crolling.area += ",D1700010";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			crolling.area += ",D1700020";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "울릉읍":
			crolling.area += ",D1700030";
			Mainpage.Filtering[Mainpage.index].setText("울릉읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//울진군
		case "근남면":
			crolling.area += ",D1800010";
			Mainpage.Filtering[Mainpage.index].setText("근남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금강송면":
			crolling.area += ",D1800040";
			Mainpage.Filtering[Mainpage.index].setText("금강송면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기성면":
			crolling.area += ",D1800020";
			Mainpage.Filtering[Mainpage.index].setText("기성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "울진군북면":
			crolling.area += ",D1800030";
			Mainpage.Filtering[Mainpage.index].setText("울진군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온정면":
			crolling.area += ",D1800050";
			Mainpage.Filtering[Mainpage.index].setText("온정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "울진읍":
			crolling.area += ",D1800060";
			Mainpage.Filtering[Mainpage.index].setText("울진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원남면":
			crolling.area += ",D1800070";
			Mainpage.Filtering[Mainpage.index].setText("원남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽변면":
			crolling.area += ",D1800080";
			Mainpage.Filtering[Mainpage.index].setText("죽변면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평해읍":
			crolling.area += ",D1800090";
			Mainpage.Filtering[Mainpage.index].setText("평해읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후포면":
			crolling.area += ",D1800100";
			Mainpage.Filtering[Mainpage.index].setText("후포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//의성군
		case "가음면":
			crolling.area += ",D1900010";
			Mainpage.Filtering[Mainpage.index].setText("가음면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구천면":
			crolling.area += ",D1900020";
			Mainpage.Filtering[Mainpage.index].setText("구천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",D1900030";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다인면":
			crolling.area += ",D1900040";
			Mainpage.Filtering[Mainpage.index].setText("다인면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단밀면":
			crolling.area += ",D1900050";
			Mainpage.Filtering[Mainpage.index].setText("단밀면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단북면":
			crolling.area += ",D1900060";
			Mainpage.Filtering[Mainpage.index].setText("단북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단촌면":
			crolling.area += ",D1900070";
			Mainpage.Filtering[Mainpage.index].setText("단촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉양면":
			crolling.area += ",D1900080";
			Mainpage.Filtering[Mainpage.index].setText("봉양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비안면":
			crolling.area += ",D1900090";
			Mainpage.Filtering[Mainpage.index].setText("비안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사곡면":
			crolling.area += ",D1900100";
			Mainpage.Filtering[Mainpage.index].setText("사곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신평면":
			crolling.area += ",D1900110";
			Mainpage.Filtering[Mainpage.index].setText("신평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안계면":
			crolling.area += ",D1900120";
			Mainpage.Filtering[Mainpage.index].setText("안계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안사면":
			crolling.area += ",D1900130";
			Mainpage.Filtering[Mainpage.index].setText("안사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안평면":
			crolling.area += ",D1900140";
			Mainpage.Filtering[Mainpage.index].setText("안평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥산면":
			crolling.area += ",D1900150";
			Mainpage.Filtering[Mainpage.index].setText("옥산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의성읍":
			crolling.area += ",D1900160";
			Mainpage.Filtering[Mainpage.index].setText("의성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점곡면":
			crolling.area += ",D1900170";
			Mainpage.Filtering[Mainpage.index].setText("점곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘산면":
			crolling.area += ",D1900180";
			Mainpage.Filtering[Mainpage.index].setText("춘산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//청도군
		case "각남면":
			crolling.area += ",D2000010";
			Mainpage.Filtering[Mainpage.index].setText("각남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "각북면":
			crolling.area += ",D2000020";
			Mainpage.Filtering[Mainpage.index].setText("각북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천면":
			crolling.area += ",D2000030";
			Mainpage.Filtering[Mainpage.index].setText("금천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매전면":
			crolling.area += ",D2000040";
			Mainpage.Filtering[Mainpage.index].setText("매전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운문면":
			crolling.area += ",D2000050";
			Mainpage.Filtering[Mainpage.index].setText("운문면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이서면":
			crolling.area += ",D2000060";
			Mainpage.Filtering[Mainpage.index].setText("이서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청도읍":
			crolling.area += ",D2000070";
			Mainpage.Filtering[Mainpage.index].setText("청도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍각면":
			crolling.area += ",D2000080";
			Mainpage.Filtering[Mainpage.index].setText("풍각면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화양읍":
			crolling.area += ",D2000090";
			Mainpage.Filtering[Mainpage.index].setText("화양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//청송군
		case "부남면":
			crolling.area += ",D2100010";
			Mainpage.Filtering[Mainpage.index].setText("부남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부동면":
			crolling.area += ",D2100020";
			Mainpage.Filtering[Mainpage.index].setText("부동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안덕면":
			crolling.area += ",D2100030";
			Mainpage.Filtering[Mainpage.index].setText("안덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진보면":
			crolling.area += ",D2100040";
			Mainpage.Filtering[Mainpage.index].setText("진보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청송읍":
			crolling.area += ",D2100050";
			Mainpage.Filtering[Mainpage.index].setText("청송읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "파천면":
			crolling.area += ",D2100060";
			Mainpage.Filtering[Mainpage.index].setText("파천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현동면":
			crolling.area += ",D2100070";
			Mainpage.Filtering[Mainpage.index].setText("현동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현서면":
			crolling.area += ",D2100080";
			Mainpage.Filtering[Mainpage.index].setText("현서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//칠곡군
		case "가산면":
			crolling.area += ",D2200010";
			Mainpage.Filtering[Mainpage.index].setText("가산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기산면":
			crolling.area += ",D2200020";
			Mainpage.Filtering[Mainpage.index].setText("기산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동명면":
			crolling.area += ",D2200030";
			Mainpage.Filtering[Mainpage.index].setText("동명면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북삼읍":
			crolling.area += ",D2200040";
			Mainpage.Filtering[Mainpage.index].setText("북삼읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석적읍":
			crolling.area += ",D2200050";
			Mainpage.Filtering[Mainpage.index].setText("석적읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약목면":
			crolling.area += ",D2200060";
			Mainpage.Filtering[Mainpage.index].setText("약목면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왜관읍":
			crolling.area += ",D2200070";
			Mainpage.Filtering[Mainpage.index].setText("왜관읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지천면":
			crolling.area += ",D2200080";
			Mainpage.Filtering[Mainpage.index].setText("지천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//포항시 남구
		case "괴동동":
			crolling.area += ",D2300010";
			Mainpage.Filtering[Mainpage.index].setText("괴동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구룡포읍":
			crolling.area += ",D2300020";
			Mainpage.Filtering[Mainpage.index].setText("구룡포읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대도동":
			crolling.area += ",D2300030";
			Mainpage.Filtering[Mainpage.index].setText("대도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대송면":
			crolling.area += ",D2300050";
			Mainpage.Filtering[Mainpage.index].setText("대송면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대잠동":
			crolling.area += ",D2300060";
			Mainpage.Filtering[Mainpage.index].setText("대잠동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동촌동":
			crolling.area += ",D2300070";
			Mainpage.Filtering[Mainpage.index].setText("동촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동해면":
			crolling.area += ",D2300080";
			Mainpage.Filtering[Mainpage.index].setText("동해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도동":
			crolling.area += ",D2300090";
			Mainpage.Filtering[Mainpage.index].setText("상도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송내동":
			crolling.area += ",D2300100";
			Mainpage.Filtering[Mainpage.index].setText("송내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송도동":
			crolling.area += ",D2300110";
			Mainpage.Filtering[Mainpage.index].setText("송도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",D2300120";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연일읍":
			crolling.area += ",D2300130";
			Mainpage.Filtering[Mainpage.index].setText("연일읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오천읍":
			crolling.area += ",D2300140";
			Mainpage.Filtering[Mainpage.index].setText("오천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이동":
			crolling.area += ",D2300150";
			Mainpage.Filtering[Mainpage.index].setText("이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인덕동":
			crolling.area += ",D2300160";
			Mainpage.Filtering[Mainpage.index].setText("인덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일월동":
			crolling.area += ",D2300170";
			Mainpage.Filtering[Mainpage.index].setText("일월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장기면":
			crolling.area += ",D2300180";
			Mainpage.Filtering[Mainpage.index].setText("장기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장흥동":
			crolling.area += ",D2300190";
			Mainpage.Filtering[Mainpage.index].setText("장흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지곡동":
			crolling.area += ",D2300200";
			Mainpage.Filtering[Mainpage.index].setText("지곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청림동":
			crolling.area += ",D2300210";
			Mainpage.Filtering[Mainpage.index].setText("청림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해도동":
			crolling.area += ",D2300240";
			Mainpage.Filtering[Mainpage.index].setText("해도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호동":
			crolling.area += ",D2300250";
			Mainpage.Filtering[Mainpage.index].setText("호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호미곶면":
			crolling.area += ",D2300040";
			Mainpage.Filtering[Mainpage.index].setText("호미곶면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			crolling.area += ",D2300260";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;


		//포항시 북구
		case "기계면":
			crolling.area += ",D2400010";
			Mainpage.Filtering[Mainpage.index].setText("기계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기북면":
			crolling.area += ",D2400020";
			Mainpage.Filtering[Mainpage.index].setText("기북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남빈동":
			crolling.area += ",D2400030";
			Mainpage.Filtering[Mainpage.index].setText("남빈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대신동":
			crolling.area += ",D2400040";
			Mainpage.Filtering[Mainpage.index].setText("대신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			crolling.area += ",D2400050";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕산동":
			crolling.area += ",D2400060";
			Mainpage.Filtering[Mainpage.index].setText("덕산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕수동":
			crolling.area += ",D2400070";
			Mainpage.Filtering[Mainpage.index].setText("덕수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동빈1가":
			crolling.area += ",D2400080";
			Mainpage.Filtering[Mainpage.index].setText("동빈1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동빈2가":
			crolling.area += ",D2400090";
			Mainpage.Filtering[Mainpage.index].setText("동빈2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두호동":
			crolling.area += ",D2400110";
			Mainpage.Filtering[Mainpage.index].setText("두호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "득량동":
			crolling.area += ",D2400120";
			Mainpage.Filtering[Mainpage.index].setText("득량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상원동":
			crolling.area += ",D2400130";
			Mainpage.Filtering[Mainpage.index].setText("상원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송라면":
			crolling.area += ",D2400140";
			Mainpage.Filtering[Mainpage.index].setText("송라면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신광면":
			crolling.area += ",D2400150";
			Mainpage.Filtering[Mainpage.index].setText("신광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",D2400160";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양덕동":
			crolling.area += ",D2400170";
			Mainpage.Filtering[Mainpage.index].setText("양덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여남동":
			crolling.area += ",D2400180";
			Mainpage.Filtering[Mainpage.index].setText("여남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여천동":
			crolling.area += ",D2400190";
			Mainpage.Filtering[Mainpage.index].setText("여천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용흥동":
			crolling.area += ",D2400200";
			Mainpage.Filtering[Mainpage.index].setText("용흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우현동":
			crolling.area += ",D2400210";
			Mainpage.Filtering[Mainpage.index].setText("우현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성동":
			crolling.area += ",D2400220";
			Mainpage.Filtering[Mainpage.index].setText("장성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽도동":
			crolling.area += ",D2400250";
			Mainpage.Filtering[Mainpage.index].setText("죽도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽장면":
			crolling.area += ",D2400260";
			Mainpage.Filtering[Mainpage.index].setText("죽장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",D2400270";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창포동":
			crolling.area += ",D2400280";
			Mainpage.Filtering[Mainpage.index].setText("창포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청하면":
			crolling.area += ",D2400290";
			Mainpage.Filtering[Mainpage.index].setText("청하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학산동":
			crolling.area += ",D2400300";
			Mainpage.Filtering[Mainpage.index].setText("학산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학잠동":
			crolling.area += ",D2400310";
			Mainpage.Filtering[Mainpage.index].setText("학잠동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항구동":
			crolling.area += ",D2400320";
			Mainpage.Filtering[Mainpage.index].setText("항구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "환호동":
			crolling.area += ",D2400330";
			Mainpage.Filtering[Mainpage.index].setText("환호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥해읍":
			crolling.area += ",D2400340";
			Mainpage.Filtering[Mainpage.index].setText("흥해읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}