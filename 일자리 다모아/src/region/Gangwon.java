package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Gangwon {
	public boolean flag;

	public void GangwonCity(ActionEvent e) {
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
		case "강동면":
			crolling.area += ",A0100010";
			Mainpage.Filtering[Mainpage.index].setText("강동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강문동":
			crolling.area += ",A0100020";
			Mainpage.Filtering[Mainpage.index].setText("강문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "견소동":
			crolling.area += ",A0100030";
			Mainpage.Filtering[Mainpage.index].setText("견소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",A0100060";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교1동":
			crolling.area += ",A0100040";
			Mainpage.Filtering[Mainpage.index].setText("교1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교2동":
			crolling.area += ",A0100050";
			Mainpage.Filtering[Mainpage.index].setText("교2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구정면":
			crolling.area += ",A0100070";
			Mainpage.Filtering[Mainpage.index].setText("구정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금학동":
			crolling.area += ",A0100080";
			Mainpage.Filtering[Mainpage.index].setText("금학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난곡동":
			crolling.area += ",A0100090";
			Mainpage.Filtering[Mainpage.index].setText("난곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남문동":
			crolling.area += ",A0100100";
			Mainpage.Filtering[Mainpage.index].setText("남문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남항진동":
			crolling.area += ",A0100110";
			Mainpage.Filtering[Mainpage.index].setText("남항진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			crolling.area += ",A0100120";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노암동":
			crolling.area += ",A0100130";
			Mainpage.Filtering[Mainpage.index].setText("노암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "담산동":
			crolling.area += ",A0100140";
			Mainpage.Filtering[Mainpage.index].setText("담산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전동":
			crolling.area += ",A0100150";
			Mainpage.Filtering[Mainpage.index].setText("대전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두산동":
			crolling.area += ",A0100160";
			Mainpage.Filtering[Mainpage.index].setText("두산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명주동":
			crolling.area += ",A0100170";
			Mainpage.Filtering[Mainpage.index].setText("명주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "박월동":
			crolling.area += ",A0100180";
			Mainpage.Filtering[Mainpage.index].setText("박월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병산동":
			crolling.area += ",A0100190";
			Mainpage.Filtering[Mainpage.index].setText("병산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사천면":
			crolling.area += ",A0100200";
			Mainpage.Filtering[Mainpage.index].setText("사천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성남동":
			crolling.area += ",A0100210";
			Mainpage.Filtering[Mainpage.index].setText("성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			crolling.area += ",A0100220";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산면":
			crolling.area += ",A0100230";
			Mainpage.Filtering[Mainpage.index].setText("성산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",A0100240";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신석동":
			crolling.area += ",A0100250";
			Mainpage.Filtering[Mainpage.index].setText("신석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안현동":
			crolling.area += ",A0100260";
			Mainpage.Filtering[Mainpage.index].setText("안현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연곡면":
			crolling.area += ",A0100270";
			Mainpage.Filtering[Mainpage.index].setText("연곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥계면":
			crolling.area += ",A0100280";
			Mainpage.Filtering[Mainpage.index].setText("옥계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			crolling.area += ",A0100290";
			Mainpage.Filtering[Mainpage.index].setText("옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕산면":
			crolling.area += ",A0100300";
			Mainpage.Filtering[Mainpage.index].setText("왕산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			crolling.area += ",A0100310";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운산동":
			crolling.area += ",A0100320";
			Mainpage.Filtering[Mainpage.index].setText("운산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운정동":
			crolling.area += ",A0100330";
			Mainpage.Filtering[Mainpage.index].setText("운정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월호평동":
			crolling.area += ",A0100340";
			Mainpage.Filtering[Mainpage.index].setText("월호평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유산동":
			crolling.area += ",A0100350";
			Mainpage.Filtering[Mainpage.index].setText("유산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유천동":
			crolling.area += ",A0100360";
			Mainpage.Filtering[Mainpage.index].setText("유천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임당동":
			crolling.area += ",A0100370";
			Mainpage.Filtering[Mainpage.index].setText("임당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입암동":
			crolling.area += ",A0100380";
			Mainpage.Filtering[Mainpage.index].setText("입암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장현동":
			crolling.area += ",A0100390";
			Mainpage.Filtering[Mainpage.index].setText("장현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저동":
			crolling.area += ",A0100400";
			Mainpage.Filtering[Mainpage.index].setText("저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주문진읍":
			crolling.area += ",A0100410";
			Mainpage.Filtering[Mainpage.index].setText("주문진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽헌동":
			crolling.area += ",A0100420";
			Mainpage.Filtering[Mainpage.index].setText("죽헌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지변동":
			crolling.area += ",A0100430";
			Mainpage.Filtering[Mainpage.index].setText("지변동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청량동":
			crolling.area += ",A0100440";
			Mainpage.Filtering[Mainpage.index].setText("청량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초당동":
			crolling.area += ",A0100450";
			Mainpage.Filtering[Mainpage.index].setText("초당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포남동":
			crolling.area += ",A0100480";
			Mainpage.Filtering[Mainpage.index].setText("포남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포남1동":
			crolling.area += ",A0100460";
			Mainpage.Filtering[Mainpage.index].setText("포남1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포남2동":
			crolling.area += ",A0100470";
			Mainpage.Filtering[Mainpage.index].setText("포남2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학동":
			crolling.area += ",A0100490";
			Mainpage.Filtering[Mainpage.index].setText("학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제동":
			crolling.area += ",A0100500";
			Mainpage.Filtering[Mainpage.index].setText("홍제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회산동":
			crolling.area += ",A0100510";
			Mainpage.Filtering[Mainpage.index].setText("회산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간성읍":
			crolling.area += ",A0200010";
			Mainpage.Filtering[Mainpage.index].setText("간성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "거진읍":
			crolling.area += ",A0200020";
			Mainpage.Filtering[Mainpage.index].setText("거진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽왕면":
			crolling.area += ",A0200030";
			Mainpage.Filtering[Mainpage.index].setText("죽왕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토성면":
			crolling.area += ",A0200040";
			Mainpage.Filtering[Mainpage.index].setText("토성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현내면":
			crolling.area += ",A0200050";
			Mainpage.Filtering[Mainpage.index].setText("현내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "괴란동":
			crolling.area += ",A0300010";
			Mainpage.Filtering[Mainpage.index].setText("괴란동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구미동":
			crolling.area += ",A0300020";
			Mainpage.Filtering[Mainpage.index].setText("구미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구호동":
			crolling.area += ",A0300030";
			Mainpage.Filtering[Mainpage.index].setText("구호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀운동":
			crolling.area += ",A0300040";
			Mainpage.Filtering[Mainpage.index].setText("귀운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나안동":
			crolling.area += ",A0300050";
			Mainpage.Filtering[Mainpage.index].setText("나안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내동":
			crolling.area += ",A0300060";
			Mainpage.Filtering[Mainpage.index].setText("내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단봉동":
			crolling.area += ",A0300070";
			Mainpage.Filtering[Mainpage.index].setText("단봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달방동":
			crolling.area += ",A0300080";
			Mainpage.Filtering[Mainpage.index].setText("달방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대구동":
			crolling.area += ",A0300090";
			Mainpage.Filtering[Mainpage.index].setText("대구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대진동":
			crolling.area += ",A0300100";
			Mainpage.Filtering[Mainpage.index].setText("대진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동호동":
			crolling.area += ",A0300110";
			Mainpage.Filtering[Mainpage.index].setText("동호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동회동":
			crolling.area += ",A0300120";
			Mainpage.Filtering[Mainpage.index].setText("동회동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만우동":
			crolling.area += ",A0300130";
			Mainpage.Filtering[Mainpage.index].setText("만우동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망상동":
			crolling.area += ",A0300140";
			Mainpage.Filtering[Mainpage.index].setText("망상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묵호진동":
			crolling.area += ",A0300150";
			Mainpage.Filtering[Mainpage.index].setText("묵호진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "발한동":
			crolling.area += ",A0300160";
			Mainpage.Filtering[Mainpage.index].setText("발한동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부곡동":
			crolling.area += ",A0300170";
			Mainpage.Filtering[Mainpage.index].setText("부곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북평동":
			crolling.area += ",A0300190";
			Mainpage.Filtering[Mainpage.index].setText("북평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비천동":
			crolling.area += ",A0300200";
			Mainpage.Filtering[Mainpage.index].setText("비천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼화동":
			crolling.area += ",A0300210";
			Mainpage.Filtering[Mainpage.index].setText("삼화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동해시송정동":
			crolling.area += ",A0300220";
			Mainpage.Filtering[Mainpage.index].setText("동해시송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쇄운동":
			crolling.area += ",A0300230";
			Mainpage.Filtering[Mainpage.index].setText("쇄운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",A0300240";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "심곡동":
			crolling.area += ",A0300250";
			Mainpage.Filtering[Mainpage.index].setText("심곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "어달동":
			crolling.area += ",A0300260";
			Mainpage.Filtering[Mainpage.index].setText("어달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용정동":
			crolling.area += ",A0300270";
			Mainpage.Filtering[Mainpage.index].setText("용정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이기동":
			crolling.area += ",A0300280";
			Mainpage.Filtering[Mainpage.index].setText("이기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이도동":
			crolling.area += ",A0300290";
			Mainpage.Filtering[Mainpage.index].setText("이도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이로동":
			crolling.area += ",A0300300";
			Mainpage.Filtering[Mainpage.index].setText("이로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지가동":
			crolling.area += ",A0300310";
			Mainpage.Filtering[Mainpage.index].setText("지가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지흥동":
			crolling.area += ",A0300320";
			Mainpage.Filtering[Mainpage.index].setText("지흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천곡동":
			crolling.area += ",A0300330";
			Mainpage.Filtering[Mainpage.index].setText("천곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "초구동":
			crolling.area += ",A0300340";
			Mainpage.Filtering[Mainpage.index].setText("초구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "추암동":
			crolling.area += ",A0300350";
			Mainpage.Filtering[Mainpage.index].setText("추암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평릉동":
			crolling.area += ",A0300360";
			Mainpage.Filtering[Mainpage.index].setText("평릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호현동":
			crolling.area += ",A0300370";
			Mainpage.Filtering[Mainpage.index].setText("호현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효가동":
			crolling.area += ",A0300380";
			Mainpage.Filtering[Mainpage.index].setText("효가동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가곡면":
			crolling.area += ",A0400010";
			Mainpage.Filtering[Mainpage.index].setText("가곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈천동":
			crolling.area += ",A0400020";
			Mainpage.Filtering[Mainpage.index].setText("갈천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "건지동":
			crolling.area += ",A0400030";
			Mainpage.Filtering[Mainpage.index].setText("건지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼척시교동":
			crolling.area += ",A0400040";
			Mainpage.Filtering[Mainpage.index].setText("삼척시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근덕면":
			crolling.area += ",A0400050";
			Mainpage.Filtering[Mainpage.index].setText("근덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근산동":
			crolling.area += ",A0400060";
			Mainpage.Filtering[Mainpage.index].setText("근산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양동":
			crolling.area += ",A0400070";
			Mainpage.Filtering[Mainpage.index].setText("남양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노곡면":
			crolling.area += ",A0400080";
			Mainpage.Filtering[Mainpage.index].setText("노곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당저동":
			crolling.area += ",A0400090";
			Mainpage.Filtering[Mainpage.index].setText("당저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도경동":
			crolling.area += ",A0400100";
			Mainpage.Filtering[Mainpage.index].setText("도경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도계읍":
			crolling.area += ",A0400110";
			Mainpage.Filtering[Mainpage.index].setText("도계읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등봉동":
			crolling.area += ",A0400120";
			Mainpage.Filtering[Mainpage.index].setText("등봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마달동":
			crolling.area += ",A0400130";
			Mainpage.Filtering[Mainpage.index].setText("마달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마평동":
			crolling.area += ",A0400140";
			Mainpage.Filtering[Mainpage.index].setText("마평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미로면":
			crolling.area += ",A0400150";
			Mainpage.Filtering[Mainpage.index].setText("미로면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사직동":
			crolling.area += ",A0400160";
			Mainpage.Filtering[Mainpage.index].setText("사직동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼척시성남동":
			crolling.area += ",A0400170";
			Mainpage.Filtering[Mainpage.index].setText("삼척시성남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼척시성내동":
			crolling.area += ",A0400180";
			Mainpage.Filtering[Mainpage.index].setText("삼척시성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			crolling.area += ",A0400190";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기면":
			crolling.area += ",A0400200";
			Mainpage.Filtering[Mainpage.index].setText("신기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오분동":
			crolling.area += ",A0400210";
			Mainpage.Filtering[Mainpage.index].setText("오분동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오사동":
			crolling.area += ",A0400220";
			Mainpage.Filtering[Mainpage.index].setText("오사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우지동":
			crolling.area += ",A0400230";
			Mainpage.Filtering[Mainpage.index].setText("우지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원당동":
			crolling.area += ",A0400240";
			Mainpage.Filtering[Mainpage.index].setText("원당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원덕읍":
			crolling.area += ",A0400250";
			Mainpage.Filtering[Mainpage.index].setText("원덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍상동":
			crolling.area += ",A0400260";
			Mainpage.Filtering[Mainpage.index].setText("읍상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "읍중동":
			crolling.area += ",A0400270";
			Mainpage.Filtering[Mainpage.index].setText("읍중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자원동":
			crolling.area += ",A0400280";
			Mainpage.Filtering[Mainpage.index].setText("자원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적노동":
			crolling.area += ",A0400290";
			Mainpage.Filtering[Mainpage.index].setText("적노동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정상동":
			crolling.area += ",A0400300";
			Mainpage.Filtering[Mainpage.index].setText("정상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정하동":
			crolling.area += ",A0400310";
			Mainpage.Filtering[Mainpage.index].setText("정하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조비동":
			crolling.area += ",A0400320";
			Mainpage.Filtering[Mainpage.index].setText("조비동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증산동":
			crolling.area += ",A0400330";
			Mainpage.Filtering[Mainpage.index].setText("증산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평전동":
			crolling.area += ",A0400340";
			Mainpage.Filtering[Mainpage.index].setText("평전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하장면":
			crolling.area += ",A0400350";
			Mainpage.Filtering[Mainpage.index].setText("하장면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "속초시교동":
			crolling.area += ",A0500010";
			Mainpage.Filtering[Mainpage.index].setText("속초시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동":
			crolling.area += ",A0500020";
			Mainpage.Filtering[Mainpage.index].setText("금호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노학동":
			crolling.area += ",A0500030";
			Mainpage.Filtering[Mainpage.index].setText("노학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대포동":
			crolling.area += ",A0500040";
			Mainpage.Filtering[Mainpage.index].setText("대포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도문동":
			crolling.area += ",A0500050";
			Mainpage.Filtering[Mainpage.index].setText("도문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동명동":
			crolling.area += ",A0500060";
			Mainpage.Filtering[Mainpage.index].setText("동명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "설악동":
			crolling.area += ",A0500070";
			Mainpage.Filtering[Mainpage.index].setText("설악동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영랑동":
			crolling.area += ",A0500080";
			Mainpage.Filtering[Mainpage.index].setText("영랑동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장사동":
			crolling.area += ",A0500090";
			Mainpage.Filtering[Mainpage.index].setText("장사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조양동":
			crolling.area += ",A0500100";
			Mainpage.Filtering[Mainpage.index].setText("조양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",A0500110";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청학동":
			crolling.area += ",A0500120";
			Mainpage.Filtering[Mainpage.index].setText("청학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청호동":
			crolling.area += ",A0500130";
			Mainpage.Filtering[Mainpage.index].setText("청호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",A0600010";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동면":
			crolling.area += ",A0600020";
			Mainpage.Filtering[Mainpage.index].setText("동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방산면":
			crolling.area += ",A0600030";
			Mainpage.Filtering[Mainpage.index].setText("방산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양구읍":
			crolling.area += ",A0600040";
			Mainpage.Filtering[Mainpage.index].setText("양구읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안면":
			crolling.area += ",A0600050";
			Mainpage.Filtering[Mainpage.index].setText("해안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강현면":
			crolling.area += ",A0700010";
			Mainpage.Filtering[Mainpage.index].setText("강현면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			crolling.area += ",A0700020";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "손양면":
			crolling.area += ",A0700030";
			Mainpage.Filtering[Mainpage.index].setText("손양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양양읍":
			crolling.area += ",A0700040";
			Mainpage.Filtering[Mainpage.index].setText("양양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현남면":
			crolling.area += ",A0700050";
			Mainpage.Filtering[Mainpage.index].setText("현남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현북면":
			crolling.area += ",A0700060";
			Mainpage.Filtering[Mainpage.index].setText("현북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김삿갓면":
			crolling.area += ",A0800090";
			Mainpage.Filtering[Mainpage.index].setText("김삿갓면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영월군남면":
			crolling.area += ",A0800010";
			Mainpage.Filtering[Mainpage.index].setText("영월군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무릉도원면":
			crolling.area += ",A0800050";
			Mainpage.Filtering[Mainpage.index].setText("무릉도원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",A0800020";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동읍":
			crolling.area += ",A0800030";
			Mainpage.Filtering[Mainpage.index].setText("상동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영월읍":
			crolling.area += ",A0800060";
			Mainpage.Filtering[Mainpage.index].setText("영월읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주천면":
			crolling.area += ",A0800070";
			Mainpage.Filtering[Mainpage.index].setText("주천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동면":
			crolling.area += ",A0800080";
			Mainpage.Filtering[Mainpage.index].setText("중동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한반도면":
			crolling.area += ",A0800040";
			Mainpage.Filtering[Mainpage.index].setText("한반도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가현동":
			crolling.area += ",A0900010";
			Mainpage.Filtering[Mainpage.index].setText("가현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개운동":
			crolling.area += ",A0900020";
			Mainpage.Filtering[Mainpage.index].setText("개운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관설동":
			crolling.area += ",A0900030";
			Mainpage.Filtering[Mainpage.index].setText("관설동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "귀래면":
			crolling.area += ",A0900040";
			Mainpage.Filtering[Mainpage.index].setText("귀래면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단계동":
			crolling.area += ",A0900050";
			Mainpage.Filtering[Mainpage.index].setText("단계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "단구동":
			crolling.area += ",A0900060";
			Mainpage.Filtering[Mainpage.index].setText("단구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",A0900090";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜1동":
			crolling.area += ",A0900070";
			Mainpage.Filtering[Mainpage.index].setText("명륜1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜2동":
			crolling.area += ",A0900080";
			Mainpage.Filtering[Mainpage.index].setText("명륜2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무실동":
			crolling.area += ",A0900100";
			Mainpage.Filtering[Mainpage.index].setText("무실동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문막읍":
			crolling.area += ",A0900110";
			Mainpage.Filtering[Mainpage.index].setText("문막읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반곡동":
			crolling.area += ",A0900120";
			Mainpage.Filtering[Mainpage.index].setText("반곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			crolling.area += ",A0900130";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부론면":
			crolling.area += ",A0900140";
			Mainpage.Filtering[Mainpage.index].setText("부론면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소초면":
			crolling.area += ",A0900150";
			Mainpage.Filtering[Mainpage.index].setText("소초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신림면":
			crolling.area += ",A0900160";
			Mainpage.Filtering[Mainpage.index].setText("신림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우산동":
			crolling.area += ",A0900170";
			Mainpage.Filtering[Mainpage.index].setText("우산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원동":
			crolling.area += ",A0900180";
			Mainpage.Filtering[Mainpage.index].setText("원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인동":
			crolling.area += ",A0900190";
			Mainpage.Filtering[Mainpage.index].setText("인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일산동":
			crolling.area += ",A0900200";
			Mainpage.Filtering[Mainpage.index].setText("일산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주앙동":
			crolling.area += ",A0900210";
			Mainpage.Filtering[Mainpage.index].setText("주앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지정면":
			crolling.area += ",A0900220";
			Mainpage.Filtering[Mainpage.index].setText("지정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장동":
			crolling.area += ",A0900250";
			Mainpage.Filtering[Mainpage.index].setText("태장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장1동":
			crolling.area += ",A0900230";
			Mainpage.Filtering[Mainpage.index].setText("태장1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태장2동":
			crolling.area += ",A0900240";
			Mainpage.Filtering[Mainpage.index].setText("태장2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "판부면":
			crolling.area += ",A0900260";
			Mainpage.Filtering[Mainpage.index].setText("판부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평원동":
			crolling.area += ",A0900270";
			Mainpage.Filtering[Mainpage.index].setText("평원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학성동":
			crolling.area += ",A0900280";
			Mainpage.Filtering[Mainpage.index].setText("학성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행구동":
			crolling.area += ",A0900290";
			Mainpage.Filtering[Mainpage.index].setText("행구동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호저면":
			crolling.area += ",A0900300";
			Mainpage.Filtering[Mainpage.index].setText("호저면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흥업면":
			crolling.area += ",A0900310";
			Mainpage.Filtering[Mainpage.index].setText("흥업면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "기리면":
			crolling.area += ",A1000010";
			Mainpage.Filtering[Mainpage.index].setText("기리면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제군남면":
			crolling.area += ",A1000020";
			Mainpage.Filtering[Mainpage.index].setText("인제군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제군북면":
			crolling.area += ",A1000030";
			Mainpage.Filtering[Mainpage.index].setText("인제군북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상남면":
			crolling.area += ",A1000040";
			Mainpage.Filtering[Mainpage.index].setText("상남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서화면":
			crolling.area += ",A1000050";
			Mainpage.Filtering[Mainpage.index].setText("서화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제읍":
			crolling.area += ",A1000060";
			Mainpage.Filtering[Mainpage.index].setText("인제읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고한읍":
			crolling.area += ",A1100010";
			Mainpage.Filtering[Mainpage.index].setText("고한읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정선군남면":
			crolling.area += ",A1100020";
			Mainpage.Filtering[Mainpage.index].setText("정선군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북평면":
			crolling.area += ",A1100050";
			Mainpage.Filtering[Mainpage.index].setText("북평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사북읍":
			crolling.area += ",A1100060";
			Mainpage.Filtering[Mainpage.index].setText("사북읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동읍":
			crolling.area += ",A1100070";
			Mainpage.Filtering[Mainpage.index].setText("신동읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여량면":
			crolling.area += ",A1100040";
			Mainpage.Filtering[Mainpage.index].setText("여량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임계면":
			crolling.area += ",A1100080";
			Mainpage.Filtering[Mainpage.index].setText("임계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정선읍":
			crolling.area += ",A1100090";
			Mainpage.Filtering[Mainpage.index].setText("정선읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화암면":
			crolling.area += ",A1100030";
			Mainpage.Filtering[Mainpage.index].setText("화암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갈말읍":
			crolling.area += ",A1200010";
			Mainpage.Filtering[Mainpage.index].setText("갈말읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근남면":
			crolling.area += ",A1200020";
			Mainpage.Filtering[Mainpage.index].setText("근남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근북면":
			crolling.area += ",A1200030";
			Mainpage.Filtering[Mainpage.index].setText("근북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "김화읍":
			crolling.area += ",A1200040";
			Mainpage.Filtering[Mainpage.index].setText("김화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동송읍":
			crolling.area += ",A1200050";
			Mainpage.Filtering[Mainpage.index].setText("동송읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철원군서면":
			crolling.area += ",A1200060";
			Mainpage.Filtering[Mainpage.index].setText("철원군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철원읍":
			crolling.area += ",A1200070";
			Mainpage.Filtering[Mainpage.index].setText("철원읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시교동":
			crolling.area += ",A1300010";
			Mainpage.Filtering[Mainpage.index].setText("춘천시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "근화동":
			crolling.area += ",A1300020";
			Mainpage.Filtering[Mainpage.index].setText("근화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙원동":
			crolling.area += ",A1300030";
			Mainpage.Filtering[Mainpage.index].setText("낙원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시남면":
			crolling.area += ",A1300040";
			Mainpage.Filtering[Mainpage.index].setText("춘천시남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산면":
			crolling.area += ",A1300050";
			Mainpage.Filtering[Mainpage.index].setText("남산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동내면":
			crolling.area += ",A1300060";
			Mainpage.Filtering[Mainpage.index].setText("동내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시동면":
			crolling.area += ",A1300070";
			Mainpage.Filtering[Mainpage.index].setText("춘천시동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산면":
			crolling.area += ",A1300080";
			Mainpage.Filtering[Mainpage.index].setText("동산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉의동":
			crolling.area += ",A1300090";
			Mainpage.Filtering[Mainpage.index].setText("봉의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북산면":
			crolling.area += ",A1300100";
			Mainpage.Filtering[Mainpage.index].setText("북산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사농동":
			crolling.area += ",A1300110";
			Mainpage.Filtering[Mainpage.index].setText("사농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사북면":
			crolling.area += ",A1300120";
			Mainpage.Filtering[Mainpage.index].setText("사북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼천동":
			crolling.area += ",A1300130";
			Mainpage.Filtering[Mainpage.index].setText("삼천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시서면":
			crolling.area += ",A1300140";
			Mainpage.Filtering[Mainpage.index].setText("춘천시서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석사동":
			crolling.area += ",A1300150";
			Mainpage.Filtering[Mainpage.index].setText("석사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로1가":
			crolling.area += ",A1300160";
			Mainpage.Filtering[Mainpage.index].setText("소양로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로2가":
			crolling.area += ",A1300170";
			Mainpage.Filtering[Mainpage.index].setText("소양로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로3가":
			crolling.area += ",A1300180";
			Mainpage.Filtering[Mainpage.index].setText("소양로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소양로4가":
			crolling.area += ",A1300190";
			Mainpage.Filtering[Mainpage.index].setText("소양로4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송암동":
			crolling.area += ",A1300200";
			Mainpage.Filtering[Mainpage.index].setText("송암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동":
			crolling.area += ",A1300210";
			Mainpage.Filtering[Mainpage.index].setText("신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신동면":
			crolling.area += ",A1300220";
			Mainpage.Filtering[Mainpage.index].setText("신동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신북읍":
			crolling.area += ",A1300230";
			Mainpage.Filtering[Mainpage.index].setText("신북읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약사동":
			crolling.area += ",A1300240";
			Mainpage.Filtering[Mainpage.index].setText("약사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시옥천동":
			crolling.area += ",A1300250";
			Mainpage.Filtering[Mainpage.index].setText("춘천시옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온의동":
			crolling.area += ",A1300260";
			Mainpage.Filtering[Mainpage.index].setText("온의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "요선동":
			crolling.area += ",A1300270";
			Mainpage.Filtering[Mainpage.index].setText("요선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우두동":
			crolling.area += ",A1300280";
			Mainpage.Filtering[Mainpage.index].setText("우두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운교동":
			crolling.area += ",A1300290";
			Mainpage.Filtering[Mainpage.index].setText("운교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘천시조양동":
			crolling.area += ",A1300300";
			Mainpage.Filtering[Mainpage.index].setText("춘천시조양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",A1300310";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중도동":
			crolling.area += ",A1300320";
			Mainpage.Filtering[Mainpage.index].setText("중도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로1가":
			crolling.area += ",A1300330";
			Mainpage.Filtering[Mainpage.index].setText("중앙로1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로2가":
			crolling.area += ",A1300340";
			Mainpage.Filtering[Mainpage.index].setText("중앙로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙로3가":
			crolling.area += ",A1300350";
			Mainpage.Filtering[Mainpage.index].setText("중앙로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠전동":
			crolling.area += ",A1300360";
			Mainpage.Filtering[Mainpage.index].setText("칠전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "퇴계동":
			crolling.area += ",A1300370";
			Mainpage.Filtering[Mainpage.index].setText("퇴계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자동":
			crolling.area += ",A1300410";
			Mainpage.Filtering[Mainpage.index].setText("효자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자1동":
			crolling.area += ",A1300380";
			Mainpage.Filtering[Mainpage.index].setText("효자1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자2동":
			crolling.area += ",A1300390";
			Mainpage.Filtering[Mainpage.index].setText("효자2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "효자3동":
			crolling.area += ",A1300400";
			Mainpage.Filtering[Mainpage.index].setText("효자3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평동":
			crolling.area += ",A1300450";
			Mainpage.Filtering[Mainpage.index].setText("후평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평1동":
			crolling.area += ",A1300420";
			Mainpage.Filtering[Mainpage.index].setText("후평1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평2동":
			crolling.area += ",A1300430";
			Mainpage.Filtering[Mainpage.index].setText("후평2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "후평3동":
			crolling.area += ",A1300440";
			Mainpage.Filtering[Mainpage.index].setText("후평3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구문소동":
			crolling.area += ",A1400010";
			Mainpage.Filtering[Mainpage.index].setText("구문소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천동":
			crolling.area += ",A1400020";
			Mainpage.Filtering[Mainpage.index].setText("금천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동점동":
			crolling.area += ",A1400030";
			Mainpage.Filtering[Mainpage.index].setText("동점동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문곡동":
			crolling.area += ",A1400040";
			Mainpage.Filtering[Mainpage.index].setText("문곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백산동":
			crolling.area += ",A1400050";
			Mainpage.Filtering[Mainpage.index].setText("백산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼수동":
			crolling.area += ",A1400060";
			Mainpage.Filtering[Mainpage.index].setText("삼수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상사미동":
			crolling.area += ",A1400070";
			Mainpage.Filtering[Mainpage.index].setText("상사미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상장동":
			crolling.area += ",A1400080";
			Mainpage.Filtering[Mainpage.index].setText("상장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소도동":
			crolling.area += ",A1400090";
			Mainpage.Filtering[Mainpage.index].setText("소도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태백시원동":
			crolling.area += ",A1400100";
			Mainpage.Filtering[Mainpage.index].setText("태백시원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성동":
			crolling.area += ",A1400110";
			Mainpage.Filtering[Mainpage.index].setText("장성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적각동":
			crolling.area += ",A1400120";
			Mainpage.Filtering[Mainpage.index].setText("적각동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조탄동":
			crolling.area += ",A1400130";
			Mainpage.Filtering[Mainpage.index].setText("조탄동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창죽동":
			crolling.area += ",A1400140";
			Mainpage.Filtering[Mainpage.index].setText("창죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "철암동":
			crolling.area += ",A1400150";
			Mainpage.Filtering[Mainpage.index].setText("철암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "통동":
			crolling.area += ",A1400160";
			Mainpage.Filtering[Mainpage.index].setText("통동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하사미동":
			crolling.area += ",A1400170";
			Mainpage.Filtering[Mainpage.index].setText("하사미동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "혈동":
			crolling.area += ",A1400180";
			Mainpage.Filtering[Mainpage.index].setText("혈동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화전동":
			crolling.area += ",A1400190";
			Mainpage.Filtering[Mainpage.index].setText("화전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황연동":
			crolling.area += ",A1400200";
			Mainpage.Filtering[Mainpage.index].setText("황연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황지동":
			crolling.area += ",A1400210";
			Mainpage.Filtering[Mainpage.index].setText("황지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대관령면":
			crolling.area += ",A1500020";
			Mainpage.Filtering[Mainpage.index].setText("대관령면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대화면":
			crolling.area += ",A1500010";
			Mainpage.Filtering[Mainpage.index].setText("대화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미탄면":
			crolling.area += ",A1500030";
			Mainpage.Filtering[Mainpage.index].setText("미탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방림면":
			crolling.area += ",A1500040";
			Mainpage.Filtering[Mainpage.index].setText("방림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉평면":
			crolling.area += ",A1500050";
			Mainpage.Filtering[Mainpage.index].setText("봉평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용평면":
			crolling.area += ",A1500060";
			Mainpage.Filtering[Mainpage.index].setText("용평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진부면":
			crolling.area += ",A1500070";
			Mainpage.Filtering[Mainpage.index].setText("진부면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평창읍":
			crolling.area += ",A1500080";
			Mainpage.Filtering[Mainpage.index].setText("평창읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천군남면":
			crolling.area += ",A1600010";
			Mainpage.Filtering[Mainpage.index].setText("홍천군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내면":
			crolling.area += ",A1600020";
			Mainpage.Filtering[Mainpage.index].setText("내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내촌면":
			crolling.area += ",A1600030";
			Mainpage.Filtering[Mainpage.index].setText("내촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천군동면":
			crolling.area += ",A1600040";
			Mainpage.Filtering[Mainpage.index].setText("홍천군동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두촌면":
			crolling.area += ",A1600050";
			Mainpage.Filtering[Mainpage.index].setText("두촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북방면":
			crolling.area += ",A1600060";
			Mainpage.Filtering[Mainpage.index].setText("북방면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천군서면":
			crolling.area += ",A1600070";
			Mainpage.Filtering[Mainpage.index].setText("홍천군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서석면":
			crolling.area += ",A1600080";
			Mainpage.Filtering[Mainpage.index].setText("서석면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍천읍":
			crolling.area += ",A1600090";
			Mainpage.Filtering[Mainpage.index].setText("홍천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화촌면":
			crolling.area += ",A1600100";
			Mainpage.Filtering[Mainpage.index].setText("화촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간동면":
			crolling.area += ",A1700010";
			Mainpage.Filtering[Mainpage.index].setText("간동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사내면":
			crolling.area += ",A1700020";
			Mainpage.Filtering[Mainpage.index].setText("사내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상서면":
			crolling.area += ",A1700030";
			Mainpage.Filtering[Mainpage.index].setText("상서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하남면":
			crolling.area += ",A1700040";
			Mainpage.Filtering[Mainpage.index].setText("하남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화천읍":
			crolling.area += ",A1700050";
			Mainpage.Filtering[Mainpage.index].setText("화천읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "갑천면":
			crolling.area += ",A1800010";
			Mainpage.Filtering[Mainpage.index].setText("갑천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강림면":
			crolling.area += ",A1800020";
			Mainpage.Filtering[Mainpage.index].setText("강림면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공근면":
			crolling.area += ",A1800030";
			Mainpage.Filtering[Mainpage.index].setText("공근면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔내면":
			crolling.area += ",A1800040";
			Mainpage.Filtering[Mainpage.index].setText("둔내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서원면":
			crolling.area += ",A1800050";
			Mainpage.Filtering[Mainpage.index].setText("서원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안흥면":
			crolling.area += ",A1800060";
			Mainpage.Filtering[Mainpage.index].setText("안흥면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우천면":
			crolling.area += ",A1800070";
			Mainpage.Filtering[Mainpage.index].setText("우천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청일면":
			crolling.area += ",A1800080";
			Mainpage.Filtering[Mainpage.index].setText("청일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "횡성읍":
			crolling.area += ",A1800090";
			Mainpage.Filtering[Mainpage.index].setText("횡성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
