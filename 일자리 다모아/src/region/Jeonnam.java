package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
public class Jeonnam {
	public boolean flag;

	public void JeonnamCity(ActionEvent e) {
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
		case "강진읍":
			crolling.area += ",L0100010";
			Mainpage.Filtering[Mainpage.index].setText("강진읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군동면":
			crolling.area += ",L0100020";
			Mainpage.Filtering[Mainpage.index].setText("군동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대구면":
			crolling.area += ",L0100030";
			Mainpage.Filtering[Mainpage.index].setText("대구면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도암면":
			crolling.area += ",L0100040";
			Mainpage.Filtering[Mainpage.index].setText("도암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마량면":
			crolling.area += ",L0100050";
			Mainpage.Filtering[Mainpage.index].setText("마량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "병영면":
			crolling.area += ",L0100060";
			Mainpage.Filtering[Mainpage.index].setText("병영면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성전면":
			crolling.area += ",L0100070";
			Mainpage.Filtering[Mainpage.index].setText("성전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신전면":
			crolling.area += ",L0100080";
			Mainpage.Filtering[Mainpage.index].setText("신전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옴천면":
			crolling.area += ",L0100090";
			Mainpage.Filtering[Mainpage.index].setText("옴천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "작천면":
			crolling.area += ",L0100100";
			Mainpage.Filtering[Mainpage.index].setText("작천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "칠량면":
			crolling.area += ",L0100110";
			Mainpage.Filtering[Mainpage.index].setText("칠량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고흥읍":
			crolling.area += ",L0200010";
			Mainpage.Filtering[Mainpage.index].setText("고흥읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과역면":
			crolling.area += ",L0200020";
			Mainpage.Filtering[Mainpage.index].setText("과역면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금산면":
			crolling.area += ",L0200030";
			Mainpage.Filtering[Mainpage.index].setText("금산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남양면":
			crolling.area += ",L0200040";
			Mainpage.Filtering[Mainpage.index].setText("남양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대서면":
			crolling.area += ",L0200050";
			Mainpage.Filtering[Mainpage.index].setText("대서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도덕면":
			crolling.area += ",L0200060";
			Mainpage.Filtering[Mainpage.index].setText("도덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도양읍":
			crolling.area += ",L0200070";
			Mainpage.Filtering[Mainpage.index].setText("도양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화면":
			crolling.area += ",L0200080";
			Mainpage.Filtering[Mainpage.index].setText("도화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동강면":
			crolling.area += ",L0200090";
			Mainpage.Filtering[Mainpage.index].setText("동강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동일면":
			crolling.area += ",L0200100";
			Mainpage.Filtering[Mainpage.index].setText("동일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "두원면":
			crolling.area += ",L0200110";
			Mainpage.Filtering[Mainpage.index].setText("두원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉래면":
			crolling.area += ",L0200120";
			Mainpage.Filtering[Mainpage.index].setText("봉래면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영남면":
			crolling.area += ",L0200130";
			Mainpage.Filtering[Mainpage.index].setText("영남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "점암면":
			crolling.area += ",L0200140";
			Mainpage.Filtering[Mainpage.index].setText("점암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "포두면":
			crolling.area += ",L0200150";
			Mainpage.Filtering[Mainpage.index].setText("포두면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍양면":
			crolling.area += ",L0200160";
			Mainpage.Filtering[Mainpage.index].setText("풍양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "겸면":
			crolling.area += ",L0300010";
			Mainpage.Filtering[Mainpage.index].setText("겸면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고달면":
			crolling.area += ",L0300020";
			Mainpage.Filtering[Mainpage.index].setText("고달면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "곡성읍":
			crolling.area += ",L0300030";
			Mainpage.Filtering[Mainpage.index].setText("곡성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목사동면":
			crolling.area += ",L0300040";
			Mainpage.Filtering[Mainpage.index].setText("목사동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼기면":
			crolling.area += ",L0300050";
			Mainpage.Filtering[Mainpage.index].setText("삼기면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석곡면":
			crolling.area += ",L0300060";
			Mainpage.Filtering[Mainpage.index].setText("석곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오곡면":
			crolling.area += ",L0300070";
			Mainpage.Filtering[Mainpage.index].setText("오곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오산면":
			crolling.area += ",L0300080";
			Mainpage.Filtering[Mainpage.index].setText("오산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥과면":
			crolling.area += ",L0300090";
			Mainpage.Filtering[Mainpage.index].setText("옥과면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "입면":
			crolling.area += ",L0300100";
			Mainpage.Filtering[Mainpage.index].setText("입면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽곡면":
			crolling.area += ",L0300110";
			Mainpage.Filtering[Mainpage.index].setText("죽곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광양읍":
			crolling.area += ",L0400010";
			Mainpage.Filtering[Mainpage.index].setText("광양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광영동":
			crolling.area += ",L0400020";
			Mainpage.Filtering[Mainpage.index].setText("광영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동":
			crolling.area += ",L0400030";
			Mainpage.Filtering[Mainpage.index].setText("금호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다압면":
			crolling.area += ",L0400040";
			Mainpage.Filtering[Mainpage.index].setText("다압면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도이동":
			crolling.area += ",L0400050";
			Mainpage.Filtering[Mainpage.index].setText("도이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마동":
			crolling.area += ",L0400060";
			Mainpage.Filtering[Mainpage.index].setText("마동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉강면":
			crolling.area += ",L0400070";
			Mainpage.Filtering[Mainpage.index].setText("봉강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성황동":
			crolling.area += ",L0400080";
			Mainpage.Filtering[Mainpage.index].setText("성황동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥곡면":
			crolling.area += ",L0400090";
			Mainpage.Filtering[Mainpage.index].setText("옥곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥룡면":
			crolling.area += ",L0400100";
			Mainpage.Filtering[Mainpage.index].setText("옥룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중군동":
			crolling.area += ",L0400110";
			Mainpage.Filtering[Mainpage.index].setText("중군동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",L0400120";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진상면":
			crolling.area += ",L0400130";
			Mainpage.Filtering[Mainpage.index].setText("진상면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진월면":
			crolling.area += ",L0400140";
			Mainpage.Filtering[Mainpage.index].setText("진월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "태인동":
			crolling.area += ",L0400150";
			Mainpage.Filtering[Mainpage.index].setText("태인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황금동":
			crolling.area += ",L0400160";
			Mainpage.Filtering[Mainpage.index].setText("황금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황길동":
			crolling.area += ",L0400170";
			Mainpage.Filtering[Mainpage.index].setText("황길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "간전면":
			crolling.area += ",L0500010";
			Mainpage.Filtering[Mainpage.index].setText("간전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광의면":
			crolling.area += ",L0500020";
			Mainpage.Filtering[Mainpage.index].setText("광의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구례읍":
			crolling.area += ",L0500030";
			Mainpage.Filtering[Mainpage.index].setText("구례읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마산면":
			crolling.area += ",L0500040";
			Mainpage.Filtering[Mainpage.index].setText("마산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문척면":
			crolling.area += ",L0500050";
			Mainpage.Filtering[Mainpage.index].setText("문척면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산동면":
			crolling.area += ",L0500060";
			Mainpage.Filtering[Mainpage.index].setText("산동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용방면":
			crolling.area += ",L0500070";
			Mainpage.Filtering[Mainpage.index].setText("용방면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토지면":
			crolling.area += ",L0500080";
			Mainpage.Filtering[Mainpage.index].setText("토지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경현동":
			crolling.area += ",L0600010";
			Mainpage.Filtering[Mainpage.index].setText("경현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공산면":
			crolling.area += ",L0600020";
			Mainpage.Filtering[Mainpage.index].setText("공산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과원동":
			crolling.area += ",L0600030";
			Mainpage.Filtering[Mainpage.index].setText("과원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관정동":
			crolling.area += ",L0600040";
			Mainpage.Filtering[Mainpage.index].setText("관정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교동":
			crolling.area += ",L0600050";
			Mainpage.Filtering[Mainpage.index].setText("교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금계동":
			crolling.area += ",L0600060";
			Mainpage.Filtering[Mainpage.index].setText("금계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금남동":
			crolling.area += ",L0600070";
			Mainpage.Filtering[Mainpage.index].setText("금남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양동":
			crolling.area += ",L0600080";
			Mainpage.Filtering[Mainpage.index].setText("가양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성동":
			crolling.area += ",L0600090";
			Mainpage.Filtering[Mainpage.index].setText("금성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금천면":
			crolling.area += ",L0600100";
			Mainpage.Filtering[Mainpage.index].setText("금천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남내동":
			crolling.area += ",L0600110";
			Mainpage.Filtering[Mainpage.index].setText("남내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남외동":
			crolling.area += ",L0600120";
			Mainpage.Filtering[Mainpage.index].setText("남외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남평읍":
			crolling.area += ",L0600130";
			Mainpage.Filtering[Mainpage.index].setText("남평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노안면":
			crolling.area += ",L0600140";
			Mainpage.Filtering[Mainpage.index].setText("노안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다도면":
			crolling.area += ",L0600150";
			Mainpage.Filtering[Mainpage.index].setText("다도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "다시면":
			crolling.area += ",L0600160";
			Mainpage.Filtering[Mainpage.index].setText("다시면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대기동":
			crolling.area += ",L0600170";
			Mainpage.Filtering[Mainpage.index].setText("대기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대호동":
			crolling.area += ",L0600180";
			Mainpage.Filtering[Mainpage.index].setText("대호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고흥군동강면":
			crolling.area += ",L0600190";
			Mainpage.Filtering[Mainpage.index].setText("고흥군동강면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동수동":
			crolling.area += ",L0600200";
			Mainpage.Filtering[Mainpage.index].setText("동수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문평면":
			crolling.area += ",L0600210";
			Mainpage.Filtering[Mainpage.index].setText("문평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반남면":
			crolling.area += ",L0600220";
			Mainpage.Filtering[Mainpage.index].setText("반남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보산동":
			crolling.area += ",L0600230";
			Mainpage.Filtering[Mainpage.index].setText("보산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉황면":
			crolling.area += ",L0600240";
			Mainpage.Filtering[Mainpage.index].setText("봉황면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부덕동":
			crolling.area += ",L0600250";
			Mainpage.Filtering[Mainpage.index].setText("부덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "빛가람동":
			crolling.area += ",L0600260";
			Mainpage.Filtering[Mainpage.index].setText("빛가람동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정동":
			crolling.area += ",L0600270";
			Mainpage.Filtering[Mainpage.index].setText("산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산포면":
			crolling.area += ",L0600280";
			Mainpage.Filtering[Mainpage.index].setText("산포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼도동":
			crolling.area += ",L0600290";
			Mainpage.Filtering[Mainpage.index].setText("삼도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼영동":
			crolling.area += ",L0600300";
			Mainpage.Filtering[Mainpage.index].setText("삼영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서내동":
			crolling.area += ",L0600310";
			Mainpage.Filtering[Mainpage.index].setText("서내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석현동":
			crolling.area += ",L0600320";
			Mainpage.Filtering[Mainpage.index].setText("석현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			crolling.area += ",L0600330";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세지면":
			crolling.area += ",L0600340";
			Mainpage.Filtering[Mainpage.index].setText("세지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송월동":
			crolling.area += ",L0600350";
			Mainpage.Filtering[Mainpage.index].setText("송월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송촌동":
			crolling.area += ",L0600360";
			Mainpage.Filtering[Mainpage.index].setText("송촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안창동":
			crolling.area += ",L0600370";
			Mainpage.Filtering[Mainpage.index].setText("안창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영강동":
			crolling.area += ",L0600380";
			Mainpage.Filtering[Mainpage.index].setText("영강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영산동":
			crolling.area += ",L06009010";
			Mainpage.Filtering[Mainpage.index].setText("영산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오량동":
			crolling.area += ",L0600400";
			Mainpage.Filtering[Mainpage.index].setText("난향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕곡면":
			crolling.area += ",L0600410";
			Mainpage.Filtering[Mainpage.index].setText("왕곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산동":
			crolling.area += ",L0600420";
			Mainpage.Filtering[Mainpage.index].setText("용산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운곡동":
			crolling.area += ",L0600430";
			Mainpage.Filtering[Mainpage.index].setText("운곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이창동":
			crolling.area += ",L0600440";
			Mainpage.Filtering[Mainpage.index].setText("이창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽림동":
			crolling.area += ",L0600450";
			Mainpage.Filtering[Mainpage.index].setText("죽림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",L0600460";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진포동":
			crolling.area += ",L0600470";
			Mainpage.Filtering[Mainpage.index].setText("진포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청동":
			crolling.area += ",L0600480";
			Mainpage.Filtering[Mainpage.index].setText("청동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토계동":
			crolling.area += ",L0600490";
			Mainpage.Filtering[Mainpage.index].setText("토계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평산동":
			crolling.area += ",L0600500";
			Mainpage.Filtering[Mainpage.index].setText("평산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고서면":
			crolling.area += ",L0700010";
			Mainpage.Filtering[Mainpage.index].setText("고서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금성면":
			crolling.area += ",L0700020";
			Mainpage.Filtering[Mainpage.index].setText("금성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남면":
			crolling.area += ",L0700030";
			Mainpage.Filtering[Mainpage.index].setText("남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "담양읍":
			crolling.area += ",L0700040";
			Mainpage.Filtering[Mainpage.index].setText("담양읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕면":
			crolling.area += ",L0700050";
			Mainpage.Filtering[Mainpage.index].setText("대덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대전면":
			crolling.area += ",L0700060";
			Mainpage.Filtering[Mainpage.index].setText("대전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무정면":
			crolling.area += ",L0700070";
			Mainpage.Filtering[Mainpage.index].setText("무정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산면":
			crolling.area += ",L0700080";
			Mainpage.Filtering[Mainpage.index].setText("봉산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수북면":
			crolling.area += ",L0700090";
			Mainpage.Filtering[Mainpage.index].setText("수북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용면":
			crolling.area += ",L0700100";
			Mainpage.Filtering[Mainpage.index].setText("용면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월산면":
			crolling.area += ",L0700110";
			Mainpage.Filtering[Mainpage.index].setText("월산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창평면":
			crolling.area += ",L0700120";
			Mainpage.Filtering[Mainpage.index].setText("창평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경동1가":
			crolling.area += ",L0800020";
			Mainpage.Filtering[Mainpage.index].setText("경동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경동2가":
			crolling.area += ",L0800030";
			Mainpage.Filtering[Mainpage.index].setText("경동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광동1가":
			crolling.area += ",L0800060";
			Mainpage.Filtering[Mainpage.index].setText("광동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광동2가":
			crolling.area += ",L0800070";
			Mainpage.Filtering[Mainpage.index].setText("광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광동3가":
			crolling.area += ",L0800080";
			Mainpage.Filtering[Mainpage.index].setText("광동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동1가":
			crolling.area += ",L0800100";
			Mainpage.Filtering[Mainpage.index].setText("금동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금동2가":
			crolling.area += ",L0800110";
			Mainpage.Filtering[Mainpage.index].setText("금동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금화동":
			crolling.area += ",L0800120";
			Mainpage.Filtering[Mainpage.index].setText("금화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남교동":
			crolling.area += ",L0800130";
			Mainpage.Filtering[Mainpage.index].setText("남교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "달동":
			crolling.area += ",L0800140";
			Mainpage.Filtering[Mainpage.index].setText("달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대성동":
			crolling.area += ",L0800150";
			Mainpage.Filtering[Mainpage.index].setText("대성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대안동":
			crolling.area += ",L0800160";
			Mainpage.Filtering[Mainpage.index].setText("대안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대양동":
			crolling.area += ",L0800170";
			Mainpage.Filtering[Mainpage.index].setText("대양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동1가":
			crolling.area += ",L0800180";
			Mainpage.Filtering[Mainpage.index].setText("대의동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동2가":
			crolling.area += ",L0800190";
			Mainpage.Filtering[Mainpage.index].setText("대의동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대의동3가":
			crolling.area += ",L0800200";
			Mainpage.Filtering[Mainpage.index].setText("대의동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동명동":
			crolling.area += ",L0800210";
			Mainpage.Filtering[Mainpage.index].setText("동명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만호동":
			crolling.area += ",L0800220";
			Mainpage.Filtering[Mainpage.index].setText("만호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명륜동":
			crolling.area += ",L0800230";
			Mainpage.Filtering[Mainpage.index].setText("명륜동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무안동":
			crolling.area += ",L0800240";
			Mainpage.Filtering[Mainpage.index].setText("무안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동1가":
			crolling.area += ",L0800250";
			Mainpage.Filtering[Mainpage.index].setText("보광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동2가":
			crolling.area += ",L0800260";
			Mainpage.Filtering[Mainpage.index].setText("보광동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보광동3가":
			crolling.area += ",L0800270";
			Mainpage.Filtering[Mainpage.index].setText("보광동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복만동":
			crolling.area += ",L0800280";
			Mainpage.Filtering[Mainpage.index].setText("복만동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부주동":
			crolling.area += ",L0800290";
			Mainpage.Filtering[Mainpage.index].setText("부주동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부흥동":
			crolling.area += ",L0800300";
			Mainpage.Filtering[Mainpage.index].setText("부흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북교동":
			crolling.area += ",L0800310";
			Mainpage.Filtering[Mainpage.index].setText("북교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북항동":
			crolling.area += ",L0800320";
			Mainpage.Filtering[Mainpage.index].setText("북향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정1동":
			crolling.area += ",L0800330";
			Mainpage.Filtering[Mainpage.index].setText("산정1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정2동":
			crolling.area += ",L0800340";
			Mainpage.Filtering[Mainpage.index].setText("산정2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목포시산정동":
			crolling.area += ",L0800350";
			Mainpage.Filtering[Mainpage.index].setText("목포시산정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산정3동":
			crolling.area += ",L0800360";
			Mainpage.Filtering[Mainpage.index].setText("산정3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼학동":
			crolling.area += ",L0800370";
			Mainpage.Filtering[Mainpage.index].setText("삼학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상동":
			crolling.area += ",L0800380";
			Mainpage.Filtering[Mainpage.index].setText("상동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상락동1가":
			crolling.area += ",L0800390";
			Mainpage.Filtering[Mainpage.index].setText("상락동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상락동2가":
			crolling.area += ",L0800400";
			Mainpage.Filtering[Mainpage.index].setText("상락동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서산동":
			crolling.area += ",L0800410";
			Mainpage.Filtering[Mainpage.index].setText("서산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "목포시석현동":
			crolling.area += ",L0800420";
			Mainpage.Filtering[Mainpage.index].setText("목포시석현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수강동1가":
			crolling.area += ",L0800430";
			Mainpage.Filtering[Mainpage.index].setText("수강동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수강동2가":
			crolling.area += ",L0800440";
			Mainpage.Filtering[Mainpage.index].setText("수강동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신흥동":
			crolling.area += ",L0800450";
			Mainpage.Filtering[Mainpage.index].setText("신흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양동":
			crolling.area += ",L0800460";
			Mainpage.Filtering[Mainpage.index].setText("양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연산동":
			crolling.area += ",L0800470";
			Mainpage.Filtering[Mainpage.index].setText("연산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영해동1가":
			crolling.area += ",L0800480";
			Mainpage.Filtering[Mainpage.index].setText("영해동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥암동":
			crolling.area += ",L0800490";
			Mainpage.Filtering[Mainpage.index].setText("옥암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온금동":
			crolling.area += ",L0800500";
			Mainpage.Filtering[Mainpage.index].setText("온금동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당1동":
			crolling.area += ",L0800510";
			Mainpage.Filtering[Mainpage.index].setText("용당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당2동":
			crolling.area += ",L0800520";
			Mainpage.Filtering[Mainpage.index].setText("용당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용당동":
			crolling.area += ",L0800530";
			Mainpage.Filtering[Mainpage.index].setText("용당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용해동":
			crolling.area += ",L0800540";
			Mainpage.Filtering[Mainpage.index].setText("용해동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원산동":
			crolling.area += ",L0800550";
			Mainpage.Filtering[Mainpage.index].setText("원산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유달동":
			crolling.area += ",L0800560";
			Mainpage.Filtering[Mainpage.index].setText("유달동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유동":
			crolling.area += ",L0800570";
			Mainpage.Filtering[Mainpage.index].setText("유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율도동":
			crolling.area += ",L0800580";
			Mainpage.Filtering[Mainpage.index].setText("율도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽교동":
			crolling.area += ",L0800590";
			Mainpage.Filtering[Mainpage.index].setText("죽교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "죽동":
			crolling.area += ",L0800600";
			Mainpage.Filtering[Mainpage.index].setText("죽동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동1가":
			crolling.area += ",L0800610";
			Mainpage.Filtering[Mainpage.index].setText("중동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동2가":
			crolling.area += ",L0800620";
			Mainpage.Filtering[Mainpage.index].setText("중동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동1가":
			crolling.area += ",L0800630";
			Mainpage.Filtering[Mainpage.index].setText("중앙동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동2가":
			crolling.area += ",L0800640";
			Mainpage.Filtering[Mainpage.index].setText("중앙동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동3가":
			crolling.area += ",L0800650";
			Mainpage.Filtering[Mainpage.index].setText("중앙동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창평동":
			crolling.area += ",L0800660";
			Mainpage.Filtering[Mainpage.index].setText("창평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축복동1가":
			crolling.area += ",L0800670";
			Mainpage.Filtering[Mainpage.index].setText("축복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축복동2가":
			crolling.area += ",L0800680";
			Mainpage.Filtering[Mainpage.index].setText("축복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "축복동3가":
			crolling.area += ",L0800690";
			Mainpage.Filtering[Mainpage.index].setText("축복동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "측후동":
			crolling.area += ",L0800700";
			Mainpage.Filtering[Mainpage.index].setText("측후동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하당동":
			crolling.area += ",L0800710";
			Mainpage.Filtering[Mainpage.index].setText("하당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동":
			crolling.area += ",L0800720";
			Mainpage.Filtering[Mainpage.index].setText("항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동1가":
			crolling.area += ",L0800730";
			Mainpage.Filtering[Mainpage.index].setText("해안동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동2가":
			crolling.area += ",L0800740";
			Mainpage.Filtering[Mainpage.index].setText("해안동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동3가":
			crolling.area += ",L0800750";
			Mainpage.Filtering[Mainpage.index].setText("해안동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해안동4가":
			crolling.area += ",L0800760";
			Mainpage.Filtering[Mainpage.index].setText("해안동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행복동1가":
			crolling.area += ",L0800770";
			Mainpage.Filtering[Mainpage.index].setText("행복동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행복동2가":
			crolling.area += ",L0800780";
			Mainpage.Filtering[Mainpage.index].setText("행복동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호남동":
			crolling.area += ",L0800790";
			Mainpage.Filtering[Mainpage.index].setText("호남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망운면":
			crolling.area += ",L0900010";
			Mainpage.Filtering[Mainpage.index].setText("망운면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "몽탄면":
			crolling.area += ",L0900020";
			Mainpage.Filtering[Mainpage.index].setText("몽탄면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "무안읍":
			crolling.area += ",L0900030";
			Mainpage.Filtering[Mainpage.index].setText("무안읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼향읍":
			crolling.area += ",L0900040";
			Mainpage.Filtering[Mainpage.index].setText("삼향읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "운남면":
			crolling.area += ",L090050";
			Mainpage.Filtering[Mainpage.index].setText("운남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일로읍":
			crolling.area += ",L0900060";
			Mainpage.Filtering[Mainpage.index].setText("일로읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청계면":
			crolling.area += ",L0900070";
			Mainpage.Filtering[Mainpage.index].setText("청계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해제면":
			crolling.area += ",L0900080";
			Mainpage.Filtering[Mainpage.index].setText("해제면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현경면":
			crolling.area += ",L0900090";
			Mainpage.Filtering[Mainpage.index].setText("현경면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "겸백면":
			crolling.area += ",L1000010";
			Mainpage.Filtering[Mainpage.index].setText("겸백면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노동면":
			crolling.area += ",L1000020";
			Mainpage.Filtering[Mainpage.index].setText("노동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "득량면":
			crolling.area += ",L1000030";
			Mainpage.Filtering[Mainpage.index].setText("득량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문덕면":
			crolling.area += ",L1000040";
			Mainpage.Filtering[Mainpage.index].setText("문덕면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미력면":
			crolling.area += ",L1000050";
			Mainpage.Filtering[Mainpage.index].setText("미력면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "벌교읍":
			crolling.area += ",L1000060";
			Mainpage.Filtering[Mainpage.index].setText("벌교읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보성읍":
			crolling.area += ",L1000070";
			Mainpage.Filtering[Mainpage.index].setText("보성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "복내면":
			crolling.area += ",L1000080";
			Mainpage.Filtering[Mainpage.index].setText("복내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅치면":
			crolling.area += ",L1000090";
			Mainpage.Filtering[Mainpage.index].setText("웅치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율어면":
			crolling.area += ",L1000100";
			Mainpage.Filtering[Mainpage.index].setText("율어면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조성면":
			crolling.area += ",L1000110";
			Mainpage.Filtering[Mainpage.index].setText("조성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회천면":
			crolling.area += ",L1000120";
			Mainpage.Filtering[Mainpage.index].setText("회천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가곡동":
			crolling.area += ",L1100010";
			Mainpage.Filtering[Mainpage.index].setText("가곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "교량동":
			crolling.area += ",L1100020";
			Mainpage.Filtering[Mainpage.index].setText("교량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금곡동":
			crolling.area += ",L1100030";
			Mainpage.Filtering[Mainpage.index].setText("금곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙안면":
			crolling.area += ",L1100040";
			Mainpage.Filtering[Mainpage.index].setText("낙안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시남내동":
			crolling.area += ",L1100050";
			Mainpage.Filtering[Mainpage.index].setText("순천시남내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남정동":
			crolling.area += ",L1100060";
			Mainpage.Filtering[Mainpage.index].setText("남정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대대동":
			crolling.area += ",L1100070";
			Mainpage.Filtering[Mainpage.index].setText("대대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대룡동":
			crolling.area += ",L1100080";
			Mainpage.Filtering[Mainpage.index].setText("대룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕암동":
			crolling.area += ",L1100090";
			Mainpage.Filtering[Mainpage.index].setText("덕암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕월동":
			crolling.area += ",L1100100";
			Mainpage.Filtering[Mainpage.index].setText("덕월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동외동":
			crolling.area += ",L1100110";
			Mainpage.Filtering[Mainpage.index].setText("동외동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "매곡동":
			crolling.area += ",L1100120";
			Mainpage.Filtering[Mainpage.index].setText("매곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "별량면":
			crolling.area += ",L1100130";
			Mainpage.Filtering[Mainpage.index].setText("별량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼거동":
			crolling.area += ",L1100140";
			Mainpage.Filtering[Mainpage.index].setText("삼거동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상사면":
			crolling.area += ",L1100150";
			Mainpage.Filtering[Mainpage.index].setText("상사면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생목동":
			crolling.area += ",L1100160";
			Mainpage.Filtering[Mainpage.index].setText("생목동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서면":
			crolling.area += ",L1100170";
			Mainpage.Filtering[Mainpage.index].setText("서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시석현동":
			crolling.area += ",L1100180";
			Mainpage.Filtering[Mainpage.index].setText("순천시석현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송광면":
			crolling.area += ",L1100190";
			Mainpage.Filtering[Mainpage.index].setText("송광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "승주읍":
			crolling.area += ",L1100200";
			Mainpage.Filtering[Mainpage.index].setText("승주읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안풍동":
			crolling.area += ",L1100210";
			Mainpage.Filtering[Mainpage.index].setText("안풍동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "야흥동":
			crolling.area += ",L1100220";
			Mainpage.Filtering[Mainpage.index].setText("야흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연향동":
			crolling.area += ",L1100230";
			Mainpage.Filtering[Mainpage.index].setText("연향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영동":
			crolling.area += ",L1100240";
			Mainpage.Filtering[Mainpage.index].setText("영동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오천동":
			crolling.area += ",L1100250";
			Mainpage.Filtering[Mainpage.index].setText("오천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			crolling.area += ",L1100260";
			Mainpage.Filtering[Mainpage.index].setText("옥천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "와룡동":
			crolling.area += ",L1100270";
			Mainpage.Filtering[Mainpage.index].setText("와룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "왕지동":
			crolling.area += ",L1100280";
			Mainpage.Filtering[Mainpage.index].setText("왕지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외서면":
			crolling.area += ",L1100290";
			Mainpage.Filtering[Mainpage.index].setText("외서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시용당동":
			crolling.area += ",L1100300";
			Mainpage.Filtering[Mainpage.index].setText("순천시용당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월등면":
			crolling.area += ",L1100310";
			Mainpage.Filtering[Mainpage.index].setText("월등면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인월동":
			crolling.area += ",L1100320";
			Mainpage.Filtering[Mainpage.index].setText("인월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인제동":
			crolling.area += ",L1100330";
			Mainpage.Filtering[Mainpage.index].setText("인제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장천동":
			crolling.area += ",L1100340";
			Mainpage.Filtering[Mainpage.index].setText("장천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "저전동":
			crolling.area += ",L1100350";
			Mainpage.Filtering[Mainpage.index].setText("저전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조곡동":
			crolling.area += ",L1100360";
			Mainpage.Filtering[Mainpage.index].setText("조곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조례동":
			crolling.area += ",L1100370";
			Mainpage.Filtering[Mainpage.index].setText("조례동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주암면":
			crolling.area += ",L1100380";
			Mainpage.Filtering[Mainpage.index].setText("주암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "순천시중앙동":
			crolling.area += ",L1100390";
			Mainpage.Filtering[Mainpage.index].setText("순천시중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "풍덕동":
			crolling.area += ",L1100400";
			Mainpage.Filtering[Mainpage.index].setText("풍덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해룡면":
			crolling.area += ",L1100410";
			Mainpage.Filtering[Mainpage.index].setText("해룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행동":
			crolling.area += ",L1100420";
			Mainpage.Filtering[Mainpage.index].setText("행동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍내동":
			crolling.area += ",L1100430";
			Mainpage.Filtering[Mainpage.index].setText("홍내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황전면":
			crolling.area += ",L1100440";
			Mainpage.Filtering[Mainpage.index].setText("황전면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도초면":
			crolling.area += ",L1200010";
			Mainpage.Filtering[Mainpage.index].setText("도초면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "비금면":
			crolling.area += ",L1200020";
			Mainpage.Filtering[Mainpage.index].setText("비금면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신의면":
			crolling.area += ",L1200030";
			Mainpage.Filtering[Mainpage.index].setText("신의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안좌면":
			crolling.area += ",L1200040";
			Mainpage.Filtering[Mainpage.index].setText("안좌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암태면":
			crolling.area += ",L1200050";
			Mainpage.Filtering[Mainpage.index].setText("암태면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "압해면":
			crolling.area += ",L1200060";
			Mainpage.Filtering[Mainpage.index].setText("압해면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임자면":
			crolling.area += ",L1200070";
			Mainpage.Filtering[Mainpage.index].setText("임자면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자은면":
			crolling.area += ",L1200080";
			Mainpage.Filtering[Mainpage.index].setText("자은면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장산면":
			crolling.area += ",L1200090";
			Mainpage.Filtering[Mainpage.index].setText("장산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "증도면":
			crolling.area += ",L1200100";
			Mainpage.Filtering[Mainpage.index].setText("증도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지도읍":
			crolling.area += ",L1200110";
			Mainpage.Filtering[Mainpage.index].setText("지도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "팔금면":
			crolling.area += ",L1200120";
			Mainpage.Filtering[Mainpage.index].setText("팔금면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하의면":
			crolling.area += ",L1200130";
			Mainpage.Filtering[Mainpage.index].setText("하의면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑산면":
			crolling.area += ",L1200140";
			Mainpage.Filtering[Mainpage.index].setText("흑산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "경호동":
			crolling.area += ",L1300010";
			Mainpage.Filtering[Mainpage.index].setText("경호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고소동":
			crolling.area += ",L1300010";
			Mainpage.Filtering[Mainpage.index].setText("고소동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공화동":
			crolling.area += ",L1300020";
			Mainpage.Filtering[Mainpage.index].setText("공화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관문동":
			crolling.area += ",L1300030";
			Mainpage.Filtering[Mainpage.index].setText("관문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광무동":
			crolling.area += ",L1300040";
			Mainpage.Filtering[Mainpage.index].setText("광무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시교동":
			crolling.area += ",L1300050";
			Mainpage.Filtering[Mainpage.index].setText("여수시교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "국동":
			crolling.area += ",L1300060";
			Mainpage.Filtering[Mainpage.index].setText("국동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			crolling.area += ",L1300070";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙포동":
			crolling.area += ",L1300080";
			Mainpage.Filtering[Mainpage.index].setText("낙포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시남면":
			crolling.area += ",L1300090";
			Mainpage.Filtering[Mainpage.index].setText("여수시남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남산동":
			crolling.area += ",L1300100";
			Mainpage.Filtering[Mainpage.index].setText("남산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕충동":
			crolling.area += ",L1300110";
			Mainpage.Filtering[Mainpage.index].setText("덕충동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돌산읍":
			crolling.area += ",L1300120";
			Mainpage.Filtering[Mainpage.index].setText("돌산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동산동":
			crolling.area += ",L1300130";
			Mainpage.Filtering[Mainpage.index].setText("동산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔덕동":
			crolling.area += ",L1300140";
			Mainpage.Filtering[Mainpage.index].setText("둔덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "만흥동":
			crolling.area += ",L1300150";
			Mainpage.Filtering[Mainpage.index].setText("만흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘도동":
			crolling.area += ",L1300160";
			Mainpage.Filtering[Mainpage.index].setText("묘도동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문수동":
			crolling.area += ",L1300170";
			Mainpage.Filtering[Mainpage.index].setText("문수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미평동":
			crolling.area += ",L1300180";
			Mainpage.Filtering[Mainpage.index].setText("미평동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉강동":
			crolling.area += ",L1300190";
			Mainpage.Filtering[Mainpage.index].setText("봉강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉계동":
			crolling.area += ",L1300200";
			Mainpage.Filtering[Mainpage.index].setText("봉계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉산동":
			crolling.area += ",L1300210";
			Mainpage.Filtering[Mainpage.index].setText("봉산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼산면":
			crolling.area += ",L1300220";
			Mainpage.Filtering[Mainpage.index].setText("삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상암동":
			crolling.area += ",L1300230";
			Mainpage.Filtering[Mainpage.index].setText("상암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서교동":
			crolling.area += ",L1300240";
			Mainpage.Filtering[Mainpage.index].setText("서교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "선원동":
			crolling.area += ",L1300250";
			Mainpage.Filtering[Mainpage.index].setText("선원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소라면":
			crolling.area += ",L1300260";
			Mainpage.Filtering[Mainpage.index].setText("소라면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소호동":
			crolling.area += ",L1300270";
			Mainpage.Filtering[Mainpage.index].setText("소호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수정동":
			crolling.area += ",L1300280";
			Mainpage.Filtering[Mainpage.index].setText("수정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시전동":
			crolling.area += ",L1300290";
			Mainpage.Filtering[Mainpage.index].setText("시전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신기동":
			crolling.area += ",L1300300";
			Mainpage.Filtering[Mainpage.index].setText("신기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신덕동":
			crolling.area += ",L1300310";
			Mainpage.Filtering[Mainpage.index].setText("신덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신월동":
			crolling.area += ",L1300320";
			Mainpage.Filtering[Mainpage.index].setText("신월동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안산동":
			crolling.area += ",L1300330";
			Mainpage.Filtering[Mainpage.index].setText("안산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여서동":
			crolling.area += ",L1300340";
			Mainpage.Filtering[Mainpage.index].setText("여서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여천동":
			crolling.area += ",L1300350";
			Mainpage.Filtering[Mainpage.index].setText("여천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연등동":
			crolling.area += ",L1300360";
			Mainpage.Filtering[Mainpage.index].setText("연등동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오림동":
			crolling.area += ",L1300370";
			Mainpage.Filtering[Mainpage.index].setText("오림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시오천동":
			crolling.area += ",L1300380";
			Mainpage.Filtering[Mainpage.index].setText("여수시오천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "웅천동":
			crolling.area += ",L1300390";
			Mainpage.Filtering[Mainpage.index].setText("웅천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월내동":
			crolling.area += ",L1300400";
			Mainpage.Filtering[Mainpage.index].setText("월내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월하동":
			crolling.area += ",L1300410";
			Mainpage.Filtering[Mainpage.index].setText("월하동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율촌면":
			crolling.area += ",L1300420";
			Mainpage.Filtering[Mainpage.index].setText("율촌면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "적량동":
			crolling.area += ",L1300430";
			Mainpage.Filtering[Mainpage.index].setText("적량동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종화동":
			crolling.area += ",L1300440";
			Mainpage.Filtering[Mainpage.index].setText("종화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "주삼동":
			crolling.area += ",L1300450";
			Mainpage.Filtering[Mainpage.index].setText("주삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "여수시중앙동":
			crolling.area += ",L1300460";
			Mainpage.Filtering[Mainpage.index].setText("중앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중흥동":
			crolling.area += ",L1300470";
			Mainpage.Filtering[Mainpage.index].setText("중흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충무동":
			crolling.area += ",L1300480";
			Mainpage.Filtering[Mainpage.index].setText("충무동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "평려동":
			crolling.area += ",L1300490";
			Mainpage.Filtering[Mainpage.index].setText("평려동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학동":
			crolling.area += ",L1300500";
			Mainpage.Filtering[Mainpage.index].setText("학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학용동":
			crolling.area += ",L1300510";
			Mainpage.Filtering[Mainpage.index].setText("학용동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해산동":
			crolling.area += ",L1300520";
			Mainpage.Filtering[Mainpage.index].setText("해산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "호명동":
			crolling.area += ",L1300530";
			Mainpage.Filtering[Mainpage.index].setText("호명동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화양면":
			crolling.area += ",L1300540";
			Mainpage.Filtering[Mainpage.index].setText("화양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화장동":
			crolling.area += ",L1300550";
			Mainpage.Filtering[Mainpage.index].setText("화장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화정면":
			crolling.area += ",L1300560";
			Mainpage.Filtering[Mainpage.index].setText("화정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화치동":
			crolling.area += ",L1300570";
			Mainpage.Filtering[Mainpage.index].setText("화치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군남면":
			crolling.area += ",L1400010";
			Mainpage.Filtering[Mainpage.index].setText("군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군서면":
			crolling.area += ",L1400020";
			Mainpage.Filtering[Mainpage.index].setText("군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙월면":
			crolling.area += ",L1400030";
			Mainpage.Filtering[Mainpage.index].setText("낙월면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대마면":
			crolling.area += ",L1400040";
			Mainpage.Filtering[Mainpage.index].setText("대마면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "묘량면":
			crolling.area += ",L1400050";
			Mainpage.Filtering[Mainpage.index].setText("묘량면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "백수읍":
			crolling.area += ",L1400060";
			Mainpage.Filtering[Mainpage.index].setText("백수읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "법성면":
			crolling.area += ",L1400070";
			Mainpage.Filtering[Mainpage.index].setText("법성면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "불갑면":
			crolling.area += ",L1400080";
			Mainpage.Filtering[Mainpage.index].setText("불갑면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염산면":
			crolling.area += ",L1400090";
			Mainpage.Filtering[Mainpage.index].setText("염산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영광읍":
			crolling.area += ",L1400100";
			Mainpage.Filtering[Mainpage.index].setText("영광읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍농읍":
			crolling.area += ",L1400110";
			Mainpage.Filtering[Mainpage.index].setText("홍농읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영암군군서면":
			crolling.area += ",L1500010";
			Mainpage.Filtering[Mainpage.index].setText("영암군군서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금정면":
			crolling.area += ",L1500020";
			Mainpage.Filtering[Mainpage.index].setText("금정면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "덕진면":
			crolling.area += ",L1500030";
			Mainpage.Filtering[Mainpage.index].setText("덕진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도포면":
			crolling.area += ",L1500040";
			Mainpage.Filtering[Mainpage.index].setText("도포면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미암면":
			crolling.area += ",L1500050";
			Mainpage.Filtering[Mainpage.index].setText("미암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼호읍":
			crolling.area += ",L1500060";
			Mainpage.Filtering[Mainpage.index].setText("삼호읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서호면":
			crolling.area += ",L1500070";
			Mainpage.Filtering[Mainpage.index].setText("서호면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시종면":
			crolling.area += ",L1500080";
			Mainpage.Filtering[Mainpage.index].setText("시종면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신북면":
			crolling.area += ",L1500090";
			Mainpage.Filtering[Mainpage.index].setText("신북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영암읍":
			crolling.area += ",L1500100";
			Mainpage.Filtering[Mainpage.index].setText("영암읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학산면":
			crolling.area += ",L1500110";
			Mainpage.Filtering[Mainpage.index].setText("학산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고금면":
			crolling.area += ",L1600010";
			Mainpage.Filtering[Mainpage.index].setText("고금면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군외면":
			crolling.area += ",L1600020";
			Mainpage.Filtering[Mainpage.index].setText("군외면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금당면":
			crolling.area += ",L1600030";
			Mainpage.Filtering[Mainpage.index].setText("금당면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금일읍":
			crolling.area += ",L1600040";
			Mainpage.Filtering[Mainpage.index].setText("금일읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노화읍":
			crolling.area += ",L1600050";
			Mainpage.Filtering[Mainpage.index].setText("노화읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보길면":
			crolling.area += ",L1600060";
			Mainpage.Filtering[Mainpage.index].setText("보길면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "생일면":
			crolling.area += ",L1600070";
			Mainpage.Filtering[Mainpage.index].setText("생일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "소안면":
			crolling.area += ",L1600080";
			Mainpage.Filtering[Mainpage.index].setText("소안면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신지면":
			crolling.area += ",L1600090";
			Mainpage.Filtering[Mainpage.index].setText("신지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "약산면":
			crolling.area += ",L1600100";
			Mainpage.Filtering[Mainpage.index].setText("약산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "완도읍":
			crolling.area += ",L1600110";
			Mainpage.Filtering[Mainpage.index].setText("완도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청산면":
			crolling.area += ",L1600120";
			Mainpage.Filtering[Mainpage.index].setText("청산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성군남면":
			crolling.area += ",L1700010";
			Mainpage.Filtering[Mainpage.index].setText("장선군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동화면":
			crolling.area += ",L1700020";
			Mainpage.Filtering[Mainpage.index].setText("동화면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북이면":
			crolling.area += ",L1700030";
			Mainpage.Filtering[Mainpage.index].setText("북이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북일면":
			crolling.area += ",L1700040";
			Mainpage.Filtering[Mainpage.index].setText("북일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북하면":
			crolling.area += ",L1700050";
			Mainpage.Filtering[Mainpage.index].setText("북하면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼계면":
			crolling.area += ",L1700060";
			Mainpage.Filtering[Mainpage.index].setText("삼계면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼서면":
			crolling.area += ",L1700070";
			Mainpage.Filtering[Mainpage.index].setText("삼서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서삼면":
			crolling.area += ",L1700080";
			Mainpage.Filtering[Mainpage.index].setText("서삼면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장성읍":
			crolling.area += ",L1700090";
			Mainpage.Filtering[Mainpage.index].setText("장성읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진원면":
			crolling.area += ",L1700100";
			Mainpage.Filtering[Mainpage.index].setText("진원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황룡면":
			crolling.area += ",L1700110";
			Mainpage.Filtering[Mainpage.index].setText("황룡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관산읍":
			crolling.area += ",L1800010";
			Mainpage.Filtering[Mainpage.index].setText("관산읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대덕읍":
			crolling.area += ",L1800020";
			Mainpage.Filtering[Mainpage.index].setText("대덕읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "부산면":
			crolling.area += ",L1800030";
			Mainpage.Filtering[Mainpage.index].setText("부산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안양면":
			crolling.area += ",L1800040";
			Mainpage.Filtering[Mainpage.index].setText("안양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용산면":
			crolling.area += ",L1800050";
			Mainpage.Filtering[Mainpage.index].setText("용산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "유치면":
			crolling.area += ",L1800060";
			Mainpage.Filtering[Mainpage.index].setText("유치면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장동면":
			crolling.area += ",L1800070";
			Mainpage.Filtering[Mainpage.index].setText("장동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장평면":
			crolling.area += ",L1800080";
			Mainpage.Filtering[Mainpage.index].setText("장평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장흥읍":
			crolling.area += ",L1800090";
			Mainpage.Filtering[Mainpage.index].setText("장흥읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회진면":
			crolling.area += ",L1800100";
			Mainpage.Filtering[Mainpage.index].setText("회진면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고군면":
			crolling.area += ",L1900010";
			Mainpage.Filtering[Mainpage.index].setText("고군면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군내면":
			crolling.area += ",L1900020";
			Mainpage.Filtering[Mainpage.index].setText("군내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "의신면":
			crolling.area += ",L1900030";
			Mainpage.Filtering[Mainpage.index].setText("의신면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "임회면":
			crolling.area += ",L1900040";
			Mainpage.Filtering[Mainpage.index].setText("임회면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조도면":
			crolling.area += ",L1900050";
			Mainpage.Filtering[Mainpage.index].setText("조도면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "지산면":
			crolling.area += ",L1900060";
			Mainpage.Filtering[Mainpage.index].setText("지산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "진도읍":
			crolling.area += ",L1900070";
			Mainpage.Filtering[Mainpage.index].setText("진도읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "나산면":
			crolling.area += ",L2000010";
			Mainpage.Filtering[Mainpage.index].setText("나산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대동면":
			crolling.area += ",L2000020";
			Mainpage.Filtering[Mainpage.index].setText("대동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "손불면":
			crolling.area += ",L2000030";
			Mainpage.Filtering[Mainpage.index].setText("손불면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신광면":
			crolling.area += ",L2000040";
			Mainpage.Filtering[Mainpage.index].setText("신광면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "엄다면":
			crolling.area += ",L2000050";
			Mainpage.Filtering[Mainpage.index].setText("엄다면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월야면":
			crolling.area += ",L2000060";
			Mainpage.Filtering[Mainpage.index].setText("월야면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "학교면":
			crolling.area += ",L2000070";
			Mainpage.Filtering[Mainpage.index].setText("학교면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "함평읍":
			crolling.area += ",L2000080";
			Mainpage.Filtering[Mainpage.index].setText("함평읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해보면":
			crolling.area += ",L2000090";
			Mainpage.Filtering[Mainpage.index].setText("해보면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "계곡면":
			crolling.area += ",L2100010";
			Mainpage.Filtering[Mainpage.index].setText("계곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남군마산면":
			crolling.area += ",L2100020";
			Mainpage.Filtering[Mainpage.index].setText("해남군마산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "문내면":
			crolling.area += ",L2100030";
			Mainpage.Filtering[Mainpage.index].setText("문내면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남군북일면":
			crolling.area += ",L2100040";
			Mainpage.Filtering[Mainpage.index].setText("해남군북일면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북평면":
			crolling.area += ",L2100050";
			Mainpage.Filtering[Mainpage.index].setText("북평면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "산이면":
			crolling.area += ",L2100060";
			Mainpage.Filtering[Mainpage.index].setText("산이면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남군삼산면":
			crolling.area += ",L2100070";
			Mainpage.Filtering[Mainpage.index].setText("해남군삼산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송지면":
			crolling.area += ",L2100080";
			Mainpage.Filtering[Mainpage.index].setText("송지면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천면":
			crolling.area += ",L2100090";
			Mainpage.Filtering[Mainpage.index].setText("옥천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "해남읍":
			crolling.area += ",L2100100";
			Mainpage.Filtering[Mainpage.index].setText("해남읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화산면":
			crolling.area += ",L2100110";
			Mainpage.Filtering[Mainpage.index].setText("화산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화원면":
			crolling.area += ",L2100120";
			Mainpage.Filtering[Mainpage.index].setText("화원면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "황산면":
			crolling.area += ",L2100130";
			Mainpage.Filtering[Mainpage.index].setText("황산면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화순군남면":
			crolling.area += ",L2200010";
			Mainpage.Filtering[Mainpage.index].setText("화순군남면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능주면":
			crolling.area += ",L2200020";
			Mainpage.Filtering[Mainpage.index].setText("능주면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡면":
			crolling.area += ",L2200030";
			Mainpage.Filtering[Mainpage.index].setText("도곡면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화순군도암면":
			crolling.area += ",L2200040";
			Mainpage.Filtering[Mainpage.index].setText("화순군도암면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동면":
			crolling.area += ",L2200050";
			Mainpage.Filtering[Mainpage.index].setText("동면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동복면":
			crolling.area += ",L2200060";
			Mainpage.Filtering[Mainpage.index].setText("동복면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북면":
			crolling.area += ",L2200070";
			Mainpage.Filtering[Mainpage.index].setText("북면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이서면":
			crolling.area += ",L2200080";
			Mainpage.Filtering[Mainpage.index].setText("이서면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이양면":
			crolling.area += ",L2200090";
			Mainpage.Filtering[Mainpage.index].setText("이양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청풍면":
			crolling.area += ",L2200100";
			Mainpage.Filtering[Mainpage.index].setText("청풍면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "춘양면":
			crolling.area += ",L2200110";
			Mainpage.Filtering[Mainpage.index].setText("춘양면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "한천면":
			crolling.area += ",L2200120";
			Mainpage.Filtering[Mainpage.index].setText("한천면");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화순읍":
			crolling.area += ",L2200130";
			Mainpage.Filtering[Mainpage.index].setText("화순읍");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
