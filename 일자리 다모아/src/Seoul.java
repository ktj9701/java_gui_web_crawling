import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class Seoul {
	boolean flag;

	public void SeoulCity(ActionEvent e) {
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
		case "개포동":
			crolling.area += ",I0100050";
			Mainpage.Filtering[Mainpage.index].setText("개포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포1동":
			crolling.area += ",I0100010";
			Mainpage.Filtering[Mainpage.index].setText("개포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포2동":
			crolling.area += ",I0100020";
			Mainpage.Filtering[Mainpage.index].setText("개포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개포4동":
			crolling.area += ",I0100040";
			Mainpage.Filtering[Mainpage.index].setText("개포4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현동":
			crolling.area += ",I0100080";
			Mainpage.Filtering[Mainpage.index].setText("논현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현1동":
			crolling.area += ",I0100060";
			Mainpage.Filtering[Mainpage.index].setText("논현1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "논현2동":
			crolling.area += ",I0100070";
			Mainpage.Filtering[Mainpage.index].setText("논현2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치동":
			crolling.area += ",I0100130";
			Mainpage.Filtering[Mainpage.index].setText("대치동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치1동":
			crolling.area += ",I0100090";
			Mainpage.Filtering[Mainpage.index].setText("대치1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치2동":
			crolling.area += ",I0100100";
			Mainpage.Filtering[Mainpage.index].setText("대치2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대치4동":
			crolling.area += ",I0100120";
			Mainpage.Filtering[Mainpage.index].setText("대치4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡동":
			crolling.area += ",I0100160";
			Mainpage.Filtering[Mainpage.index].setText("도공동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡1동":
			crolling.area += ",I0100140";
			Mainpage.Filtering[Mainpage.index].setText("도곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도곡2동":
			crolling.area += ",I0100150";
			Mainpage.Filtering[Mainpage.index].setText("도곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동":
			crolling.area += ",I0100190";
			Mainpage.Filtering[Mainpage.index].setText("삼성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성1동":
			crolling.area += ",I0100170";
			Mainpage.Filtering[Mainpage.index].setText("삼성1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성2동":
			crolling.area += "I0100180";
			Mainpage.Filtering[Mainpage.index].setText("삼성2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "세곡동":
			crolling.area += ",I0100200";
			Mainpage.Filtering[Mainpage.index].setText("세곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수서동":
			crolling.area += ",I0100210";
			Mainpage.Filtering[Mainpage.index].setText("수서동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신사동":
			crolling.area += ",I0100220";
			Mainpage.Filtering[Mainpage.index].setText("신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "압구정동":
			crolling.area += ",I0100250";
			Mainpage.Filtering[Mainpage.index].setText("압구정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼동":
			crolling.area += ",I0100280";
			Mainpage.Filtering[Mainpage.index].setText("역삼동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼1동":
			crolling.area += ",I0100260";
			Mainpage.Filtering[Mainpage.index].setText("역삼1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "역삼2동":
			crolling.area += ",I0100270";
			Mainpage.Filtering[Mainpage.index].setText("역삼2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "율현동":
			crolling.area += ",I0100290";
			Mainpage.Filtering[Mainpage.index].setText("율현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원동":
			crolling.area += ",I0100320";
			Mainpage.Filtering[Mainpage.index].setText("일원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원1동":
			crolling.area += ",I0100300";
			Mainpage.Filtering[Mainpage.index].setText("일원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원2동":
			crolling.area += ",I0100310";
			Mainpage.Filtering[Mainpage.index].setText("일원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "일원본동":
			crolling.area += ",I0100330";
			Mainpage.Filtering[Mainpage.index].setText("일원본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자곡동":
			crolling.area += ",I0100340";
			Mainpage.Filtering[Mainpage.index].setText("자곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청담동":
			crolling.area += ",I0100370";
			Mainpage.Filtering[Mainpage.index].setText("청담동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "강일동":
			crolling.area += ",I0200010";
			Mainpage.Filtering[Mainpage.index].setText("강일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕동":
			crolling.area += ",I0200040";
			Mainpage.Filtering[Mainpage.index].setText("고덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕1동":
			crolling.area += ",I0200020";
			Mainpage.Filtering[Mainpage.index].setText("고덕1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고덕2동":
			crolling.area += ",I0200030";
			Mainpage.Filtering[Mainpage.index].setText("고덕2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길동":
			crolling.area += ",I0200070";
			Mainpage.Filtering[Mainpage.index].setText("길동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔촌동":
			crolling.area += ",I0200100";
			Mainpage.Filtering[Mainpage.index].setText("둔촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔촌1동":
			crolling.area += ",I0200080";
			Mainpage.Filtering[Mainpage.index].setText("둔촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "둔촌2동":
			crolling.area += ",I0200090";
			Mainpage.Filtering[Mainpage.index].setText("둔촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명일동":
			crolling.area += ",I0200130";
			Mainpage.Filtering[Mainpage.index].setText("명일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명일1동":
			crolling.area += ",I0200110";
			Mainpage.Filtering[Mainpage.index].setText("명일1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "명일2동":
			crolling.area += ",I0200120";
			Mainpage.Filtering[Mainpage.index].setText("명일2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상일동":
			crolling.area += ",I0200140";
			Mainpage.Filtering[Mainpage.index].setText("상일동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내동":
			crolling.area += ",I0200180";
			Mainpage.Filtering[Mainpage.index].setText("성내동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내1동":
			crolling.area += ",I0200150";
			Mainpage.Filtering[Mainpage.index].setText("성내1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내2동":
			crolling.area += ",I0200160";
			Mainpage.Filtering[Mainpage.index].setText("성내2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성내3동":
			crolling.area += ",I0200170";
			Mainpage.Filtering[Mainpage.index].setText("성내3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "암사동":
			crolling.area += ",I0200230";
			Mainpage.Filtering[Mainpage.index].setText("암사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암사1동":
			crolling.area += ",I0200190";
			Mainpage.Filtering[Mainpage.index].setText("암사1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암사2동":
			crolling.area += ",I0200200";
			Mainpage.Filtering[Mainpage.index].setText("암사2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "암사3동":
			crolling.area += ",I0200210";
			Mainpage.Filtering[Mainpage.index].setText("암사3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호동":
			crolling.area += ",I0200280";
			Mainpage.Filtering[Mainpage.index].setText("천호동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호1동":
			crolling.area += ",I0200240";
			Mainpage.Filtering[Mainpage.index].setText("천호1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호2동":
			crolling.area += ",I0200250";
			Mainpage.Filtering[Mainpage.index].setText("천호2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천호3동":
			crolling.area += ",I0200260";
			Mainpage.Filtering[Mainpage.index].setText("천호3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미아동":
			crolling.area += ",I0300100";
			Mainpage.Filtering[Mainpage.index].setText("암사3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번동":
			crolling.area += "I0300140";
			Mainpage.Filtering[Mainpage.index].setText("번동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번1동":
			crolling.area += ",I0300110";
			Mainpage.Filtering[Mainpage.index].setText("번1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번2동":
			crolling.area += ",I0300120";
			Mainpage.Filtering[Mainpage.index].setText("번2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "번3동":
			crolling.area += ",I0300130";
			Mainpage.Filtering[Mainpage.index].setText("번3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼각산동":
			crolling.area += ",I0300060";
			Mainpage.Filtering[Mainpage.index].setText("삼각산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼양동":
			crolling.area += ",I0300010";
			Mainpage.Filtering[Mainpage.index].setText("삼양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송중동":
			crolling.area += ",I0300040";
			Mainpage.Filtering[Mainpage.index].setText("송중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송천동":
			crolling.area += ",I0300050";
			Mainpage.Filtering[Mainpage.index].setText("송천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유동":
			crolling.area += ",I0300210";
			Mainpage.Filtering[Mainpage.index].setText("수유동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유1동":
			crolling.area += ",I0300150";
			Mainpage.Filtering[Mainpage.index].setText("수유1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유2동":
			crolling.area += ",I0300160";
			Mainpage.Filtering[Mainpage.index].setText("수유2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "수유3동":
			crolling.area += ",I0300170";
			Mainpage.Filtering[Mainpage.index].setText("수유3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우이동":
			crolling.area += ",I0300220";
			Mainpage.Filtering[Mainpage.index].setText("우이동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인수동":
			crolling.area += ",I0300190";
			Mainpage.Filtering[Mainpage.index].setText("인수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양동":
			crolling.area += ",I0400040";
			Mainpage.Filtering[Mainpage.index].setText("가양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양1동":
			crolling.area += ",I0400010";
			Mainpage.Filtering[Mainpage.index].setText("가양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양2동":
			crolling.area += ",I0400020";
			Mainpage.Filtering[Mainpage.index].setText("가양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가양3동":
			crolling.area += ",I0400030";
			Mainpage.Filtering[Mainpage.index].setText("가양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개화동":
			crolling.area += ",I0400050";
			Mainpage.Filtering[Mainpage.index].setText("개화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공항동":
			crolling.area += ",I0400060";
			Mainpage.Filtering[Mainpage.index].setText("공항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "과해동":
			crolling.area += ",I0400070";
			Mainpage.Filtering[Mainpage.index].setText("과해동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내발산동":
			crolling.area += ",I0400100";
			Mainpage.Filtering[Mainpage.index].setText("내발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌동":
			crolling.area += ",I0400140";
			Mainpage.Filtering[Mainpage.index].setText("등촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌1동":
			crolling.area += ",I0400110";
			Mainpage.Filtering[Mainpage.index].setText("등촌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌2동":
			crolling.area += ",I0400120";
			Mainpage.Filtering[Mainpage.index].setText("등촌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "등촌3동":
			crolling.area += ",I0400130";
			Mainpage.Filtering[Mainpage.index].setText("등촌3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마곡동":
			crolling.area += ",I0400150";
			Mainpage.Filtering[Mainpage.index].setText("마곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화동":
			crolling.area += ",I0400190";
			Mainpage.Filtering[Mainpage.index].setText("방화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화1동":
			crolling.area += ",I0400160";
			Mainpage.Filtering[Mainpage.index].setText("방화1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화2동":
			crolling.area += ",I0400170";
			Mainpage.Filtering[Mainpage.index].setText("방화2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방화3동":
			crolling.area += ",I0400180";
			Mainpage.Filtering[Mainpage.index].setText("방화3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염창동":
			crolling.area += ",I0400200";
			Mainpage.Filtering[Mainpage.index].setText("염창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오곡동":
			crolling.area += ",I0400210";
			Mainpage.Filtering[Mainpage.index].setText("오곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오쇠동":
			crolling.area += ",I0400220";
			Mainpage.Filtering[Mainpage.index].setText("오쇠동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "외발산동":
			crolling.area += ",I0400230";
			Mainpage.Filtering[Mainpage.index].setText("외발산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우장산동":
			crolling.area += ",I0400280";
			Mainpage.Filtering[Mainpage.index].setText("우장산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡동":
			crolling.area += ",I0400320";
			Mainpage.Filtering[Mainpage.index].setText("화곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡1동":
			crolling.area += ",I0400240";
			Mainpage.Filtering[Mainpage.index].setText("화곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡2동":
			crolling.area += ",I0400250";
			Mainpage.Filtering[Mainpage.index].setText("화곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡3동":
			crolling.area += ",I0400260";
			Mainpage.Filtering[Mainpage.index].setText("화곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡4동":
			crolling.area += ",I0400270";
			Mainpage.Filtering[Mainpage.index].setText("화곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡6동":
			crolling.area += ",I0400290";
			Mainpage.Filtering[Mainpage.index].setText("화곡6동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡8동":
			crolling.area += ",I0400310";
			Mainpage.Filtering[Mainpage.index].setText("화곡8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화곡본동":
			crolling.area += ",I0400330";
			Mainpage.Filtering[Mainpage.index].setText("화곡본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "낙성대동":
			crolling.area += ",I0500100";
			Mainpage.Filtering[Mainpage.index].setText("낙성대동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난곡동":
			crolling.area += ",I0500210";
			Mainpage.Filtering[Mainpage.index].setText("난곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "난향동":
			crolling.area += ",I0500250";
			Mainpage.Filtering[Mainpage.index].setText("난향동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남현동":
			crolling.area += ",I0500010";
			Mainpage.Filtering[Mainpage.index].setText("남현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대학동":
			crolling.area += ",I0500270";
			Mainpage.Filtering[Mainpage.index].setText("대학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미성동":
			crolling.area += ",I0500160";
			Mainpage.Filtering[Mainpage.index].setText("미성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보라매동":
			crolling.area += ",I0500040";
			Mainpage.Filtering[Mainpage.index].setText("보라매동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉천동":
			crolling.area += ",I0500130";
			Mainpage.Filtering[Mainpage.index].setText("봉천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관악구삼성동":
			crolling.area += ",I0500240";
			Mainpage.Filtering[Mainpage.index].setText("관악구 삼성동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서림동":
			crolling.area += ",I0500200";
			Mainpage.Filtering[Mainpage.index].setText("서림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서원동":
			crolling.area += ",I0500290";
			Mainpage.Filtering[Mainpage.index].setText("서원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성현동":
			crolling.area += ",I0500050";
			Mainpage.Filtering[Mainpage.index].setText("성현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신림동":
			crolling.area += ",I0500230";
			Mainpage.Filtering[Mainpage.index].setText("신림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "관악구신사동":
			crolling.area += ",I0500220";
			Mainpage.Filtering[Mainpage.index].setText("관악구신사동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신원동":
			crolling.area += ",I0500190";
			Mainpage.Filtering[Mainpage.index].setText("신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "은천동":
			crolling.area += ",I0500120";
			Mainpage.Filtering[Mainpage.index].setText("은천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "인헌동":
			crolling.area += ",I0500030";
			Mainpage.Filtering[Mainpage.index].setText("인헌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "조원동":
			crolling.area += ",I0500260";
			Mainpage.Filtering[Mainpage.index].setText("조원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중앙동":
			crolling.area += ",I0500020";
			Mainpage.Filtering[Mainpage.index].setText("증앙동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청룡동":
			crolling.area += ",I0500070";
			Mainpage.Filtering[Mainpage.index].setText("청룡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청림동":
			crolling.area += ",I0500060";
			Mainpage.Filtering[Mainpage.index].setText("청림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행운동":
			crolling.area += ",I0500090";
			Mainpage.Filtering[Mainpage.index].setText("행운동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "광장동":
			crolling.area += ",I0600010";
			Mainpage.Filtering[Mainpage.index].setText("광장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의동":
			crolling.area += ",I0600050";
			Mainpage.Filtering[Mainpage.index].setText("구의동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의1동":
			crolling.area += ",I0600020";
			Mainpage.Filtering[Mainpage.index].setText("구의1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의2동":
			crolling.area += ",I0600030";
			Mainpage.Filtering[Mainpage.index].setText("구의2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구의3동":
			crolling.area += ",I0600040";
			Mainpage.Filtering[Mainpage.index].setText("구의3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "군자동":
			crolling.area += ",I0600060";
			Mainpage.Filtering[Mainpage.index].setText("군자동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "능동":
			crolling.area += ",I0600100";
			Mainpage.Filtering[Mainpage.index].setText("능동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양동":
			crolling.area += ",I0600150";
			Mainpage.Filtering[Mainpage.index].setText("자양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양1동":
			crolling.area += ",I0600120";
			Mainpage.Filtering[Mainpage.index].setText("자양1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양2동":
			crolling.area += ",I0600130";
			Mainpage.Filtering[Mainpage.index].setText("자양2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양3동":
			crolling.area += ",I0600140";
			Mainpage.Filtering[Mainpage.index].setText("자양3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "자양4동":
			crolling.area += ",I0600070";
			Mainpage.Filtering[Mainpage.index].setText("자양4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡동":
			crolling.area += ",I0600200";
			Mainpage.Filtering[Mainpage.index].setText("중곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡1동":
			crolling.area += ",I0600160";
			Mainpage.Filtering[Mainpage.index].setText("중곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡2동":
			crolling.area += ",I0600170";
			Mainpage.Filtering[Mainpage.index].setText("중곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡3동":
			crolling.area += ",I0600180";
			Mainpage.Filtering[Mainpage.index].setText("중곡3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중곡4동":
			crolling.area += ",I0600190";
			Mainpage.Filtering[Mainpage.index].setText("중곡4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "화양동":
			crolling.area += ",I0600210";
			Mainpage.Filtering[Mainpage.index].setText("화양동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가리봉동":
			crolling.area += ",I0700030";
			Mainpage.Filtering[Mainpage.index].setText("가리봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉동":
			crolling.area += ",I0700070";
			Mainpage.Filtering[Mainpage.index].setText("개봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉1동":
			crolling.area += ",I0700040";
			Mainpage.Filtering[Mainpage.index].setText("개봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉2동":
			crolling.area += ",I0700050";
			Mainpage.Filtering[Mainpage.index].setText("개봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "개봉3동":
			crolling.area += ",I0700060";
			Mainpage.Filtering[Mainpage.index].setText("개봉3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고척동":
			crolling.area += ",I0700110";
			Mainpage.Filtering[Mainpage.index].setText("고척동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고척1동":
			crolling.area += ",I0700090";
			Mainpage.Filtering[Mainpage.index].setText("고척1동동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "고척2동":
			crolling.area += ",I0700100";
			Mainpage.Filtering[Mainpage.index].setText("고척2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로동":
			crolling.area += ",I0700180";
			Mainpage.Filtering[Mainpage.index].setText("구로동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로1동":
			crolling.area += ",I0700120";
			Mainpage.Filtering[Mainpage.index].setText("구로1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로2동":
			crolling.area += ",I0700130";
			Mainpage.Filtering[Mainpage.index].setText("구로2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로3동":
			crolling.area += ",I0700140";
			Mainpage.Filtering[Mainpage.index].setText("구로3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로4동":
			crolling.area += ",I0700150";
			Mainpage.Filtering[Mainpage.index].setText("구로4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구로5동":
			crolling.area += ",I0700160";
			Mainpage.Filtering[Mainpage.index].setText("구로5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "궁동":
			crolling.area += ",I0700200";
			Mainpage.Filtering[Mainpage.index].setText("궁동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신도림동":
			crolling.area += ",I0700210";
			Mainpage.Filtering[Mainpage.index].setText("신도림동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류동":
			crolling.area += ",I0700240";
			Mainpage.Filtering[Mainpage.index].setText("오류동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류1동":
			crolling.area += ",I0700220";
			Mainpage.Filtering[Mainpage.index].setText("오류1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "오류2동":
			crolling.area += ",I0700230";
			Mainpage.Filtering[Mainpage.index].setText("오류2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "온수동":
			crolling.area += ",I0700250";
			Mainpage.Filtering[Mainpage.index].setText("온수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천왕동":
			crolling.area += ",I0700260";
			Mainpage.Filtering[Mainpage.index].setText("천왕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "항동":
			crolling.area += ",I0700270";
			Mainpage.Filtering[Mainpage.index].setText("항동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "가산동":
			crolling.area += ",I0800010";
			Mainpage.Filtering[Mainpage.index].setText("가산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산동":
			crolling.area += ",I0800060";
			Mainpage.Filtering[Mainpage.index].setText("독산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산1동":
			crolling.area += ",I0800020";
			Mainpage.Filtering[Mainpage.index].setText("독산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산2동":
			crolling.area += ",I0800030";
			Mainpage.Filtering[Mainpage.index].setText("독산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산3동":
			crolling.area += "I0800040";
			Mainpage.Filtering[Mainpage.index].setText("독산3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "독산4동":
			crolling.area += ",I0800050";
			Mainpage.Filtering[Mainpage.index].setText("독산4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥동":
			crolling.area += ",I0800130";
			Mainpage.Filtering[Mainpage.index].setText("시흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥1동":
			crolling.area += ",I0800080";
			Mainpage.Filtering[Mainpage.index].setText("시흥1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥2동":
			crolling.area += ",I0800090";
			Mainpage.Filtering[Mainpage.index].setText("시흥2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥3동":
			crolling.area += ",I0800100";
			Mainpage.Filtering[Mainpage.index].setText("시흥3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥4동":
			crolling.area += ",I0800110";
			Mainpage.Filtering[Mainpage.index].setText("시흥4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "시흥5동":
			crolling.area += ",I0800120";
			Mainpage.Filtering[Mainpage.index].setText("시흥5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공릉동":
			crolling.area += ",I0900040";
			Mainpage.Filtering[Mainpage.index].setText("공릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공릉1.3동":
			crolling.area += ",I0900010";
			Mainpage.Filtering[Mainpage.index].setText("공릉1.3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공릉2동":
			crolling.area += ",I0900020";
			Mainpage.Filtering[Mainpage.index].setText("공릉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계동":
			crolling.area += ",I0900150";
			Mainpage.Filtering[Mainpage.index].setText("상계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계1동":
			crolling.area += ",I0900060";
			Mainpage.Filtering[Mainpage.index].setText("상계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계2동":
			crolling.area += ",I0900070";
			Mainpage.Filtering[Mainpage.index].setText("상계2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계3.4동":
			crolling.area += ",I0900080";
			Mainpage.Filtering[Mainpage.index].setText("상계3.4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계5동":
			crolling.area += ",I0900100";
			Mainpage.Filtering[Mainpage.index].setText("상계5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계6.7동":
			crolling.area += ",I0900110";
			Mainpage.Filtering[Mainpage.index].setText("상계6.7동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계8동":
			crolling.area += ",I0900130";
			Mainpage.Filtering[Mainpage.index].setText("상계8동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계9동":
			crolling.area += ",I0900140";
			Mainpage.Filtering[Mainpage.index].setText("상계9동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상계10동":
			crolling.area += ",I0900050";
			Mainpage.Filtering[Mainpage.index].setText("상계10동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계동":
			crolling.area += ",I0900200";
			Mainpage.Filtering[Mainpage.index].setText("월계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계1동":
			crolling.area += ",I0900160";
			Mainpage.Filtering[Mainpage.index].setText("월계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계2동":
			crolling.area += ",I0900170";
			Mainpage.Filtering[Mainpage.index].setText("월계2동\"");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월계3동":
			crolling.area += ",I0900180";
			Mainpage.Filtering[Mainpage.index].setText("월계3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계동":
			crolling.area += ",I0900250";
			Mainpage.Filtering[Mainpage.index].setText("중계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계1동":
			crolling.area += ",I0900210";
			Mainpage.Filtering[Mainpage.index].setText("중계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계2.3동":
			crolling.area += ",I0900220";
			Mainpage.Filtering[Mainpage.index].setText("중계2.3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계4동":
			crolling.area += ",I0900240";
			Mainpage.Filtering[Mainpage.index].setText("중계4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중계본동":
			crolling.area += ",I0900260";
			Mainpage.Filtering[Mainpage.index].setText("중계본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하계동":
			crolling.area += ",I0900290";
			Mainpage.Filtering[Mainpage.index].setText("하계동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하계1동":
			crolling.area += ",I0900270";
			Mainpage.Filtering[Mainpage.index].setText("하계1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하계2동":
			crolling.area += ",I0900280";
			Mainpage.Filtering[Mainpage.index].setText("하계2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도봉동":
			crolling.area += ",I1000030";
			Mainpage.Filtering[Mainpage.index].setText("도봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도봉1동":
			crolling.area += ",I1000010";
			Mainpage.Filtering[Mainpage.index].setText("도봉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도봉2동":
			crolling.area += ",I1000020";
			Mainpage.Filtering[Mainpage.index].setText("도봉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학동":
			crolling.area += ",I1000080";
			Mainpage.Filtering[Mainpage.index].setText("방학동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학1동":
			crolling.area += ",I1000040";
			Mainpage.Filtering[Mainpage.index].setText("방학1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학2동":
			crolling.area += ",I1000050";
			Mainpage.Filtering[Mainpage.index].setText("방학2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방학3동":
			crolling.area += ",I1000060";
			Mainpage.Filtering[Mainpage.index].setText("방학3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문동":
			crolling.area += ",I1000130";
			Mainpage.Filtering[Mainpage.index].setText("쌍문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문1동":
			crolling.area += ",I1000090";
			Mainpage.Filtering[Mainpage.index].setText("쌍문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문2동":
			crolling.area += ",I1000100";
			Mainpage.Filtering[Mainpage.index].setText("쌍문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문3동":
			crolling.area += ",I1000110";
			Mainpage.Filtering[Mainpage.index].setText("쌍문3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "쌍문4동":
			crolling.area += ",I1000120";
			Mainpage.Filtering[Mainpage.index].setText("쌍문4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창동":
			crolling.area += ",I1000190";
			Mainpage.Filtering[Mainpage.index].setText("창동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창1동":
			crolling.area += ",I1000140";
			Mainpage.Filtering[Mainpage.index].setText("창1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창2동":
			crolling.area += ",I1000150";
			Mainpage.Filtering[Mainpage.index].setText("창2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창3동":
			crolling.area += ",I1000160";
			Mainpage.Filtering[Mainpage.index].setText("창3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창4동":
			crolling.area += ",I1000170";
			Mainpage.Filtering[Mainpage.index].setText("창4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창5동":
			crolling.area += ",I1000180";
			Mainpage.Filtering[Mainpage.index].setText("창5동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답십리동":
			crolling.area += ",I1100060";
			Mainpage.Filtering[Mainpage.index].setText("답십리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답십리1동":
			crolling.area += ",I1100010";
			Mainpage.Filtering[Mainpage.index].setText("답십리1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "답십리2동":
			crolling.area += ",I1100020";
			Mainpage.Filtering[Mainpage.index].setText("답십리2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신설동":
			crolling.area += ",I1100070";
			Mainpage.Filtering[Mainpage.index].setText("신설동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용두동":
			crolling.area += ",I1100100";
			Mainpage.Filtering[Mainpage.index].setText("용두동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이문동":
			crolling.area += ",I1100140";
			Mainpage.Filtering[Mainpage.index].setText("이문동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이문1동":
			crolling.area += ",I1100110";
			Mainpage.Filtering[Mainpage.index].setText("이문1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "이문2동":
			crolling.area += ",I1100120";
			Mainpage.Filtering[Mainpage.index].setText("이문2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안동":
			crolling.area += ",I1100190";
			Mainpage.Filtering[Mainpage.index].setText("장안동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안1동":
			crolling.area += ",I1100150";
			Mainpage.Filtering[Mainpage.index].setText("장안1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장안2동":
			crolling.area += ",I1100160";
			Mainpage.Filtering[Mainpage.index].setText("장안2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전농동":
			crolling.area += ",I1100240";
			Mainpage.Filtering[Mainpage.index].setText("전농동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전농1동":
			crolling.area += ",I1100200";
			Mainpage.Filtering[Mainpage.index].setText("전농1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "전농2동":
			crolling.area += ",I1100210";
			Mainpage.Filtering[Mainpage.index].setText("전농2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "제기동":
			crolling.area += ",I1100270";
			Mainpage.Filtering[Mainpage.index].setText("제기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "청량리동":
			crolling.area += ",I1100300";
			Mainpage.Filtering[Mainpage.index].setText("청량리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "회기동":
			crolling.area += ",I1100310";
			Mainpage.Filtering[Mainpage.index].setText("회기동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휘경동":
			crolling.area += ",I1100340";
			Mainpage.Filtering[Mainpage.index].setText("휘경동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휘경1동":
			crolling.area += ",I1100320";
			Mainpage.Filtering[Mainpage.index].setText("휘경1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "휘경2동":
			crolling.area += ",I1100330";
			Mainpage.Filtering[Mainpage.index].setText("휘경2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노량진동":
			crolling.area += ",I1200030";
			Mainpage.Filtering[Mainpage.index].setText("노량진동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노량진1동":
			crolling.area += ",I1200010";
			Mainpage.Filtering[Mainpage.index].setText("노량진1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노량진2동":
			crolling.area += ",I1200020";
			Mainpage.Filtering[Mainpage.index].setText("노량진2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대방동":
			crolling.area += ",I1200040";
			Mainpage.Filtering[Mainpage.index].setText("대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동작동":
			crolling.area += ",I1200050";
			Mainpage.Filtering[Mainpage.index].setText("동작동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "본동":
			crolling.area += ",I1200060";
			Mainpage.Filtering[Mainpage.index].setText("본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당동":
			crolling.area += ",I1200120";
			Mainpage.Filtering[Mainpage.index].setText("사당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당1동":
			crolling.area += ",I1200070";
			Mainpage.Filtering[Mainpage.index].setText("사당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당2동":
			crolling.area += ",I1200080";
			Mainpage.Filtering[Mainpage.index].setText("사당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당3동":
			crolling.area += ",I1200090";
			Mainpage.Filtering[Mainpage.index].setText("사당3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당4동":
			crolling.area += ",I1200100";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사당5동":
			crolling.area += ",I1200110";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도동":
			crolling.area += ",I1200180";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도1동":
			crolling.area += ",I1200130";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도2동":
			crolling.area += ",I1200140";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도3동":
			crolling.area += ",I1200150";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상도4동":
			crolling.area += ",I1200160";
			Mainpage.Filtering[Mainpage.index].setText("사당4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대방동":
			crolling.area += ",I1200210";
			Mainpage.Filtering[Mainpage.index].setText("신대방동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대방1동":
			crolling.area += ",I1200190";
			Mainpage.Filtering[Mainpage.index].setText("신대방1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신대방2동":
			crolling.area += ",I1200190";
			Mainpage.Filtering[Mainpage.index].setText("신대방2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "흑석동":
			crolling.area += ",I1200250";
			Mainpage.Filtering[Mainpage.index].setText("흑석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "공덕동":
			crolling.area += ",I1300030";
			Mainpage.Filtering[Mainpage.index].setText("공덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "구수동":
			crolling.area += ",I1300040";
			Mainpage.Filtering[Mainpage.index].setText("구수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "노고산동":
			crolling.area += ",I1300050";
			Mainpage.Filtering[Mainpage.index].setText("노고산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "당인동":
			crolling.area += ",I1300060";
			Mainpage.Filtering[Mainpage.index].setText("당인동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대흥동":
			crolling.area += ",I1300070";
			Mainpage.Filtering[Mainpage.index].setText("대흥동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도화동":
			crolling.area += ",I1300100";
			Mainpage.Filtering[Mainpage.index].setText("도화동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동교동":
			crolling.area += ",I1300110";
			Mainpage.Filtering[Mainpage.index].setText("동교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마포동":
			crolling.area += ",I1300120";
			Mainpage.Filtering[Mainpage.index].setText("마포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망원동":
			crolling.area += ",I1300150";
			Mainpage.Filtering[Mainpage.index].setText("망원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망원1동":
			crolling.area += ",I1300130";
			Mainpage.Filtering[Mainpage.index].setText("망원1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "망원2동":
			crolling.area += "I1300140";
			Mainpage.Filtering[Mainpage.index].setText("망원2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상수동":
			crolling.area += ",I1300160";
			Mainpage.Filtering[Mainpage.index].setText("상수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상암동":
			crolling.area += ",I1300170";
			Mainpage.Filtering[Mainpage.index].setText("상암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서교동":
			crolling.area += ",I1300180";
			Mainpage.Filtering[Mainpage.index].setText("서교동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산동":
			crolling.area += ",I1300210";
			Mainpage.Filtering[Mainpage.index].setText("성산동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산1동":
			crolling.area += ",I1300190";
			Mainpage.Filtering[Mainpage.index].setText("성산1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성산2동":
			crolling.area += ",I1300200";
			Mainpage.Filtering[Mainpage.index].setText("성산2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신공덕동":
			crolling.area += ",I1300220";
			Mainpage.Filtering[Mainpage.index].setText("신공덕동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신수동":
			crolling.area += ",I1300230";
			Mainpage.Filtering[Mainpage.index].setText("신수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신정동":
			crolling.area += ",I1300240";
			Mainpage.Filtering[Mainpage.index].setText("신정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "아현동":
			crolling.area += ",I1300280";
			Mainpage.Filtering[Mainpage.index].setText("아현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연남동":
			crolling.area += ",I1300290";
			Mainpage.Filtering[Mainpage.index].setText("연남동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염리동":
			crolling.area += ",I1300300";
			Mainpage.Filtering[Mainpage.index].setText("염리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용강동":
			crolling.area += ",I1300310";
			Mainpage.Filtering[Mainpage.index].setText("용강동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "중동":
			crolling.area += ",I1300320";
			Mainpage.Filtering[Mainpage.index].setText("중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창전동":
			crolling.area += ",I1300325";
			Mainpage.Filtering[Mainpage.index].setText("창전동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "토정동":
			crolling.area += ",I1300340";
			Mainpage.Filtering[Mainpage.index].setText("토정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하중동":
			crolling.area += ",I1300350";
			Mainpage.Filtering[Mainpage.index].setText("하중동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합정동":
			crolling.area += ",I1300360";
			Mainpage.Filtering[Mainpage.index].setText("합정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현석동":
			crolling.area += ",I1300370";
			Mainpage.Filtering[Mainpage.index].setText("현석동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남가좌동":
			crolling.area += ",I1400030";
			Mainpage.Filtering[Mainpage.index].setText("남가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남가좌1동":
			crolling.area += ",I1400010";
			Mainpage.Filtering[Mainpage.index].setText("남가좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "남가좌2동":
			crolling.area += ",I1400020";
			Mainpage.Filtering[Mainpage.index].setText("남가좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "냉천동":
			crolling.area += ",I1400040";
			Mainpage.Filtering[Mainpage.index].setText("냉천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대신동":
			crolling.area += ",I1400045";
			Mainpage.Filtering[Mainpage.index].setText("대신동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "대현동":
			crolling.area += ",I1400060";
			Mainpage.Filtering[Mainpage.index].setText("대현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "미근동":
			crolling.area += ",I1400070";
			Mainpage.Filtering[Mainpage.index].setText("미근동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "봉원동":
			crolling.area += ",I1400080";
			Mainpage.Filtering[Mainpage.index].setText("봉원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북가좌동":
			crolling.area += ",I1400110";
			Mainpage.Filtering[Mainpage.index].setText("북가좌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북가좌1동":
			crolling.area += ",I1400090";
			Mainpage.Filtering[Mainpage.index].setText("북가좌1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북가좌2동":
			crolling.area += ",I1400100";
			Mainpage.Filtering[Mainpage.index].setText("북가좌2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "북아현동":
			crolling.area += ",I1400150";
			Mainpage.Filtering[Mainpage.index].setText("북아현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "신촌동":
			crolling.area += ",I1400160";
			Mainpage.Filtering[Mainpage.index].setText("신촌동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "연희동":
			crolling.area += ",I1400200";
			Mainpage.Filtering[Mainpage.index].setText("연희동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "영천동":
			crolling.area += ",I1400210";
			Mainpage.Filtering[Mainpage.index].setText("영천동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥천동":
			crolling.area += ",I1400220";
			Mainpage.Filtering[Mainpage.index].setText("인수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "창천동":
			crolling.area += ",I1400230";
			Mainpage.Filtering[Mainpage.index].setText("인수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "천연동":
			crolling.area += ",I1400240";
			Mainpage.Filtering[Mainpage.index].setText("천연동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로2가":
			crolling.area += ",I1400250";
			Mainpage.Filtering[Mainpage.index].setText("충정로2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충정로3가":
			crolling.area += ",I1400260";
			Mainpage.Filtering[Mainpage.index].setText("충정로3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "충현동":
			crolling.area += ",I1400140";
			Mainpage.Filtering[Mainpage.index].setText("충현동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "합동":
			crolling.area += ",I1400270";
			Mainpage.Filtering[Mainpage.index].setText("합동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "현저동":
			crolling.area += ",I1400280";
			Mainpage.Filtering[Mainpage.index].setText("현저동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍은동":
			crolling.area += ",I1400320";
			Mainpage.Filtering[Mainpage.index].setText("홍은동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍은1동":
			crolling.area += ",I1400290";
			Mainpage.Filtering[Mainpage.index].setText("홍은1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "홍은2동":
			crolling.area += ",I1400300";
			Mainpage.Filtering[Mainpage.index].setText("홍은2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제동":
			crolling.area += ",I1400370";
			Mainpage.Filtering[Mainpage.index].setText("홍제동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제1동":
			crolling.area += ",I1400330";
			Mainpage.Filtering[Mainpage.index].setText("홍제1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제2동":
			crolling.area += ",I1400340";
			Mainpage.Filtering[Mainpage.index].setText("홍제2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍제3동":
			crolling.area += ",I1400350";
			Mainpage.Filtering[Mainpage.index].setText("홍제3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "내곡동":
			crolling.area += ",I1500010";
			Mainpage.Filtering[Mainpage.index].setText("내곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포동":
			crolling.area += ",I1500060";
			Mainpage.Filtering[Mainpage.index].setText("반포동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포1동":
			crolling.area += ",I1500020";
			Mainpage.Filtering[Mainpage.index].setText("반포1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포2동":
			crolling.area += ",I1500030";
			Mainpage.Filtering[Mainpage.index].setText("반포2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포3동":
			crolling.area += ",I1500040";
			Mainpage.Filtering[Mainpage.index].setText("반포3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포4동":
			crolling.area += "I1500050";
			Mainpage.Filtering[Mainpage.index].setText("반포4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "반포본동":
			crolling.area += ",I1500070";
			Mainpage.Filtering[Mainpage.index].setText("반포본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "빙배동":
			crolling.area += ",I1500120";
			Mainpage.Filtering[Mainpage.index].setText("빙배동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배1동":
			crolling.area += ",I1500080";
			Mainpage.Filtering[Mainpage.index].setText("방배1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배2동":
			crolling.area += ",I1500090";
			Mainpage.Filtering[Mainpage.index].setText("방배2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배3동":
			crolling.area += ",I1500100";
			Mainpage.Filtering[Mainpage.index].setText("방배3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배4동":
			crolling.area += ",I1500110";
			Mainpage.Filtering[Mainpage.index].setText("방배4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "방배본동":
			crolling.area += ",I1500130";
			Mainpage.Filtering[Mainpage.index].setText("방배본동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초동":
			crolling.area += ",I1500180";
			Mainpage.Filtering[Mainpage.index].setText("서초동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초1동":
			crolling.area += ",I1500140";
			Mainpage.Filtering[Mainpage.index].setText("서초1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초2동":
			crolling.area += ",I1500150";
			Mainpage.Filtering[Mainpage.index].setText("서초2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초3동":
			crolling.area += ",I1500160";
			Mainpage.Filtering[Mainpage.index].setText("서초3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초4동":
			crolling.area += ",I1500170";
			Mainpage.Filtering[Mainpage.index].setText("서초4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "서초구신원동":
			crolling.area += ",I1500190";
			Mainpage.Filtering[Mainpage.index].setText("서초구 신원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양재동":
			crolling.area += ",I1500220";
			Mainpage.Filtering[Mainpage.index].setText("양재동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양재1동":
			crolling.area += ",I1500200";
			Mainpage.Filtering[Mainpage.index].setText("양재1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "양재2동":
			crolling.area += ",I1500210";
			Mainpage.Filtering[Mainpage.index].setText("양재2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "염곡동":
			crolling.area += ",I1500230";
			Mainpage.Filtering[Mainpage.index].setText("염곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "우면동":
			crolling.area += ",I1500240";
			Mainpage.Filtering[Mainpage.index].setText("우면동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "원지동":
			crolling.area += ",I1500250";
			Mainpage.Filtering[Mainpage.index].setText("원지동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "잠원동":
			crolling.area += ",I1500260";
			Mainpage.Filtering[Mainpage.index].setText("잠원동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동1가":
			crolling.area += ",I1600010";
			Mainpage.Filtering[Mainpage.index].setText("금호동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동2가":
			crolling.area += ",I1600020";
			Mainpage.Filtering[Mainpage.index].setText("금호동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동3가":
			crolling.area += ",I1600030";
			Mainpage.Filtering[Mainpage.index].setText("금호동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "금호동4가":
			crolling.area += ",I1600040";
			Mainpage.Filtering[Mainpage.index].setText("금호동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "도선동":
			crolling.area += ",I1600050";
			Mainpage.Filtering[Mainpage.index].setText("도선동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "마장동":
			crolling.area += ",I1600060";
			Mainpage.Filtering[Mainpage.index].setText("마장동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "사근동":
			crolling.area += ",I1600070";
			Mainpage.Filtering[Mainpage.index].setText("사근동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상왕십리동":
			crolling.area += ",I1600080";
			Mainpage.Filtering[Mainpage.index].setText("상왕십리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수동1가":
			crolling.area += ",I1600130";
			Mainpage.Filtering[Mainpage.index].setText("성수동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수동2가":
			crolling.area += ",I1600140";
			Mainpage.Filtering[Mainpage.index].setText("성수동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수1가1동":
			crolling.area += "I1600090";
			Mainpage.Filtering[Mainpage.index].setText("성수1가1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수1가2동":
			crolling.area += ",I1600100";
			Mainpage.Filtering[Mainpage.index].setText("성수1가2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수2가1동":
			crolling.area += ",I1600110";
			Mainpage.Filtering[Mainpage.index].setText("성수2가1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성수2가3동":
			crolling.area += ",I1600120";
			Mainpage.Filtering[Mainpage.index].setText("성수2가3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "송정동":
			crolling.area += ",I1600150";
			Mainpage.Filtering[Mainpage.index].setText("송정동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "옥수동":
			crolling.area += ",I1600180";
			Mainpage.Filtering[Mainpage.index].setText("옥수동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "용답동":
			crolling.area += ",I1600190";
			Mainpage.Filtering[Mainpage.index].setText("용답동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "응봉동":
			crolling.area += ",I1600200";
			Mainpage.Filtering[Mainpage.index].setText("응봉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하왕십리동":
			crolling.area += ",I1600230";
			Mainpage.Filtering[Mainpage.index].setText("하왕십리동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행당동":
			crolling.area += ",I1600260";
			Mainpage.Filtering[Mainpage.index].setText("행당동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행당1동":
			crolling.area += ",I1600240";
			Mainpage.Filtering[Mainpage.index].setText("행당1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "행당2동":
			crolling.area += ",I1600250";
			Mainpage.Filtering[Mainpage.index].setText("행당2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "홍익동":
			crolling.area += ",I1600270";
			Mainpage.Filtering[Mainpage.index].setText("홍익동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길음동":
			crolling.area += ",I1700040";
			Mainpage.Filtering[Mainpage.index].setText("길음동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길음1동":
			crolling.area += ",I1700010";
			Mainpage.Filtering[Mainpage.index].setText("길음1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "길음2동":
			crolling.area += ",I1700020";
			Mainpage.Filtering[Mainpage.index].setText("길음2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈암동":
			crolling.area += ",I1700070";
			Mainpage.Filtering[Mainpage.index].setText("돈암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈암1동":
			crolling.area += ",I1700050";
			Mainpage.Filtering[Mainpage.index].setText("돈암1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "돈암2동":
			crolling.area += ",I1700060";
			Mainpage.Filtering[Mainpage.index].setText("돈암2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동1가":
			crolling.area += ",I1700080";
			Mainpage.Filtering[Mainpage.index].setText("동선동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동2가":
			crolling.area += ",I1700090";
			Mainpage.Filtering[Mainpage.index].setText("동선동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동3가":
			crolling.area += ",I1700100";
			Mainpage.Filtering[Mainpage.index].setText("동선동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동4가":
			crolling.area += ",I1700110";
			Mainpage.Filtering[Mainpage.index].setText("동선동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동선동5가":
			crolling.area += ",I1700120";
			Mainpage.Filtering[Mainpage.index].setText("동선동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동1가":
			crolling.area += ",I1700130";
			Mainpage.Filtering[Mainpage.index].setText("동소문동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동2가":
			crolling.area += ",I1700140";
			Mainpage.Filtering[Mainpage.index].setText("동소문동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동3가":
			crolling.area += ",I1700150";
			Mainpage.Filtering[Mainpage.index].setText("동소문동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동4가":
			crolling.area += ",I1700160";
			Mainpage.Filtering[Mainpage.index].setText("동소문동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동5가":
			crolling.area += ",I1700170";
			Mainpage.Filtering[Mainpage.index].setText("동소문동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동6가":
			crolling.area += ",I1700180";
			Mainpage.Filtering[Mainpage.index].setText("동소문동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "동소문동7가":
			crolling.area += ",I1700190";
			Mainpage.Filtering[Mainpage.index].setText("동소문동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동1가":
			crolling.area += ",I1700200";
			Mainpage.Filtering[Mainpage.index].setText("보문동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동2가":
			crolling.area += ",I1700210";
			Mainpage.Filtering[Mainpage.index].setText("보문동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동3가":
			crolling.area += ",I1700220";
			Mainpage.Filtering[Mainpage.index].setText("보문동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동4가":
			crolling.area += ",I1700230";
			Mainpage.Filtering[Mainpage.index].setText("보문동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동5가":
			crolling.area += ",I1700240";
			Mainpage.Filtering[Mainpage.index].setText("보문동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동6가":
			crolling.area += ",I1700250";
			Mainpage.Filtering[Mainpage.index].setText("보문동6가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "보문동7가":
			crolling.area += ",I1700260";
			Mainpage.Filtering[Mainpage.index].setText("보문동7가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동1가":
			crolling.area += ",I1700270";
			Mainpage.Filtering[Mainpage.index].setText("삼성동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동2가":
			crolling.area += ",I1700280";
			Mainpage.Filtering[Mainpage.index].setText("삼성동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "삼성동3가":
			crolling.area += ",I1700290";
			Mainpage.Filtering[Mainpage.index].setText("삼성동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동4가":
			crolling.area += ",I1700300";
			Mainpage.Filtering[Mainpage.index].setText("삼성동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "삼성동5가":
			crolling.area += ",I1700310";
			Mainpage.Filtering[Mainpage.index].setText("삼성동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "상월곡동":
			crolling.area += ",I1700320";
			Mainpage.Filtering[Mainpage.index].setText("상월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "석관동":
			crolling.area += ",I1700350";
			Mainpage.Filtering[Mainpage.index].setText("석관동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동":
			crolling.area += ",I1700380";
			Mainpage.Filtering[Mainpage.index].setText("성북동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "성북동1가":
			crolling.area += ",I1700390";
			Mainpage.Filtering[Mainpage.index].setText("성북동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동1가":
			crolling.area += ",I1700400";
			Mainpage.Filtering[Mainpage.index].setText("안암동1가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동2가":
			crolling.area += ",I1700410";
			Mainpage.Filtering[Mainpage.index].setText("안암동2가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동3가":
			crolling.area += ",I1700420";
			Mainpage.Filtering[Mainpage.index].setText("안암동3가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동4가":
			crolling.area += ",I1700430";
			Mainpage.Filtering[Mainpage.index].setText("안암동4가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "안암동5가":
			crolling.area += ",I1700440";
			Mainpage.Filtering[Mainpage.index].setText("안암동5가");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡1동":
			crolling.area += ",I1700445";
			Mainpage.Filtering[Mainpage.index].setText("월곡1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "월곡2동":
			crolling.area += ",I1700446";
			Mainpage.Filtering[Mainpage.index].setText("월곡2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위동":
			crolling.area += ",I1700480";
			Mainpage.Filtering[Mainpage.index].setText("장위동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위1동":
			crolling.area += ",I1700450";
			Mainpage.Filtering[Mainpage.index].setText("장위1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위2동":
			crolling.area += ",I1700460";
			Mainpage.Filtering[Mainpage.index].setText("장위2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "장위3동":
			crolling.area += ",I1700470";
			Mainpage.Filtering[Mainpage.index].setText("장위3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉동":
			crolling.area += ",I1700530";
			Mainpage.Filtering[Mainpage.index].setText("정릉동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉1동":
			crolling.area += ",I1700490";
			Mainpage.Filtering[Mainpage.index].setText("정릉1동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉2동":
			crolling.area += ",I1700500";
			Mainpage.Filtering[Mainpage.index].setText("정릉2동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉3동":
			crolling.area += ",I1700510";
			Mainpage.Filtering[Mainpage.index].setText("정릉3동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "정릉4동":
			crolling.area += ",I1700520";
			Mainpage.Filtering[Mainpage.index].setText("정릉4동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "종암동":
			crolling.area += ",I1700560";
			Mainpage.Filtering[Mainpage.index].setText("종암동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "하월곡동":
			crolling.area += ",I1700610";
			Mainpage.Filtering[Mainpage.index].setText("하월곡동");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
			

		}
	}
}
