package region;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Gyeonggi {
	public boolean flag;

	public void GyeonggiCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			Albamoncrolling.area = "";
			AlbaHeavencrolling.area="";
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
		case "??????":
			Albamoncrolling.area += ",B0100010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%B0%A1%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϸ?":
			Albamoncrolling.area += ",B0100020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("?ϸ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B0100030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???Ǹ?":
			Albamoncrolling.area += ",B0100040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%BC%B3%BE%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("???Ǹ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0100060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%C1%B6%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û????":
			Albamoncrolling.area += ",B0100050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%A1%C6%F2%B1%BA%7C%7C%C3%BB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ŵ?":
			Albamoncrolling.area += ",B0200010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B0%AD%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ŵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B0200020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B0%ED%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???굿":
			Albamoncrolling.area += ",B0200030";
			AlbaHeavencrolling.area += "C031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B0%FC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B0200040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B3%BB%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ":
			Albamoncrolling.area += ",B0200400";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%EB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200410";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ڵ?":
			Albamoncrolling.area += ",B0200060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%EB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ڵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???嵿":
			Albamoncrolling.area += ",B0200070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B4%F6%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B5%B5%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???굿":
			Albamoncrolling.area += ",B0200100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200110";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BA%AE%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ѵ?":
			Albamoncrolling.area += ",B0200120";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BA%CF%C7%D1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ѵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???۵?":
			Albamoncrolling.area += ",B0200130";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BB%EF%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???۵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200140";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%B1%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B0200170";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%BA%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0200150";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%BA%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0200160";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BC%BA%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ſ???":
			Albamoncrolling.area += ",B0200180";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BD%C5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ſ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0200140";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ݵ?":
			Albamoncrolling.area += ",B0200170";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ݵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ε?":
			Albamoncrolling.area += ",B0200150";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ε?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B0200160";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ŵ?":
			Albamoncrolling.area += ",B0200180";
			Mainpage.Filtering[Mainpage.index].setText("???ŵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ﵿ":
			Albamoncrolling.area += ",B0200230";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%BF%F8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ֱ???":
			Albamoncrolling.area += ",B0200240";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C1%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ֱ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ൿ":
			Albamoncrolling.area += ",B0200250";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C1%F6%C3%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â????":
			Albamoncrolling.area += ",B0200430";
			Mainpage.Filtering[Mainpage.index].setText("â????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B0200260";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C5%E4%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ŵ?":
			Albamoncrolling.area += ",B0200300";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ŵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0200270";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0200280";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B0200290";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%BD%C53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ֳ???":
			Albamoncrolling.area += ",B0200310";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%C1%D6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ֳ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ֵ?":
			Albamoncrolling.area += ",B0200440";
			Mainpage.Filtering[Mainpage.index].setText("???ֵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ֿܵ?":
			Albamoncrolling.area += ",B0200320";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E0%C1%D6%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ֿܵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?⵿??":
			Albamoncrolling.area += ",B0200330";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%E2%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?⵿??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ??":
			Albamoncrolling.area += ",B0200340";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C7%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ????":
			Albamoncrolling.area += ",B0200350";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ????":
			Albamoncrolling.area += ",B0200380";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ??1??":
			Albamoncrolling.area += ",B0200360";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ??1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ??2??":
			Albamoncrolling.area += ",B0200370";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%AD%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ??2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ?ڵ?":
			Albamoncrolling.area += ",B0200390";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%B4%F6%BE%E7%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ?ڵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ﵵ??":
			Albamoncrolling.area += ",B0200450";
			Mainpage.Filtering[Mainpage.index].setText("?ﵵ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0300180";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ε?":
			Albamoncrolling.area += ",B0300030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B8%B6%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ε?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0300010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B8%B6%B5%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0300020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B8%B6%B5%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0300040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%AE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?鼮??":
			Albamoncrolling.area += ",B0300050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%E9%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?鼮??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?鼮1??":
			Albamoncrolling.area += ",B0300044";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%E9%BC%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?鼮1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?鼮2??":
			Albamoncrolling.area += ",B0300045";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%B9%E9%BC%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?鼮2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?縮????":
			Albamoncrolling.area += ",B0300060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BB%E7%B8%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?縮????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??Ȳ??":
			Albamoncrolling.area += ",B0300070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BB%EA%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??Ȳ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0300080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BC%B3%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0300090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BC%BA%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ļ絿":
			Albamoncrolling.area += ",B0300100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%BD%C4%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ļ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???׵?":
			Albamoncrolling.area += ",B0300130";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C0%E5%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???׵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0300110";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C0%E5%C7%D71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0300120";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C0%E5%C7%D72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???߻굿":
			Albamoncrolling.area += ",B0300140";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C1%A4%B9%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?߻굿":
			Albamoncrolling.area += ",B0300150";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0300160";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C1%F6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ??":
			Albamoncrolling.area += ",B0300170";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%B5%BF%B1%B8%7C%7C%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ?굿":
			Albamoncrolling.area += ",B0300190";
			Mainpage.Filtering[Mainpage.index].setText("ǳ?굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???µ?":
			Albamoncrolling.area += ",B0310010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???µ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???굿":
			Albamoncrolling.area += ",B0310020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ȭ??":
			Albamoncrolling.area += ",B0310030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B4%EB%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ȭ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B0310040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B4%F6%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0310050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%B9%FD%B0%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ۻ굿":
			Albamoncrolling.area += ",B0310140";
			Mainpage.Filtering[Mainpage.index].setText("?ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0310150";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϻ굿":
			Albamoncrolling.area += ",B0310090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϻ?1??":
			Albamoncrolling.area += ",B0310060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϻ?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϻ?2??":
			Albamoncrolling.area += ",B0310070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϻ?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϻ?3??":
			Albamoncrolling.area += ",B0310080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C0%CF%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϻ?3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ֿ???":
			Albamoncrolling.area += ",B0310120";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C1%D6%BF%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ֿ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ֿ?1??":
			Albamoncrolling.area += ",B0310100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C1%D6%BF%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ֿ?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ֿ?2??":
			Albamoncrolling.area += ",B0310110";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C1%D6%BF%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ֿ?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź????":
			Albamoncrolling.area += ",B0310130";
			AlbaHeavencrolling.area += "031%7C%7C%B0%ED%BE%E7%BD%C3+%C0%CF%BB%EA%BC%AD%B1%B8%7C%7C%C5%BA%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ź????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0400010";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ??":
			Albamoncrolling.area += ",B0400020";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B0%FA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0400030";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B0%FC%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???赿":
			Albamoncrolling.area += ",B0400040";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B8%B7%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0400050";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%B9%AE%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B0400060";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%BA%B0%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?θ???":
			Albamoncrolling.area += ",B0400070";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?θ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0400080";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%BF%F8%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?־ϵ?":
			Albamoncrolling.area += ",B0400090";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%C1%D6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?־ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?߾ӵ?":
			Albamoncrolling.area += ",B0400100";
			AlbaHeavencrolling.area += "031%7C%7C%B0%FA%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?߾ӵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???е?":
			Albamoncrolling.area += ",B0500010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B0%A1%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???е?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0500090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0500020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0500030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B0500040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????4??":
			Albamoncrolling.area += ",B0500050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????5??":
			Albamoncrolling.area += ",B0500060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????5??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????6??":
			Albamoncrolling.area += ",B0500070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????6??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????7??":
			Albamoncrolling.area += ",B0500080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B1%A4%B8%ED7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????7??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???»絿":
			Albamoncrolling.area += ",B0500100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%B3%EB%BF%C2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???»絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ϵ?":
			Albamoncrolling.area += ",B0500130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BC%D2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0500110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BC%D2%C7%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += "B0500120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BC%D2%C7%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???浿":
			Albamoncrolling.area += ",B0500140";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%BF%C1%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0500150";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C0%CF%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö?굿":
			Albamoncrolling.area += ",B0500200";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö?굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö??1??":
			Albamoncrolling.area += ",B0500160";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö??1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö??2??":
			Albamoncrolling.area += ",B0500170";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö??2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö??3??":
			Albamoncrolling.area += ",B0500180";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö??3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö??4??":
			Albamoncrolling.area += ",B0500190";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C3%B6%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö??4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ͼȵ?":
			Albamoncrolling.area += ",B0500250";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ͼȵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ͼ?1??":
			Albamoncrolling.area += ",B0500210";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ͼ?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ͼ?2??":
			Albamoncrolling.area += ",B0500220";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ͼ?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ͼ?3??":
			Albamoncrolling.area += ",B0500230";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ͼ?3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ͼ?4??":
			Albamoncrolling.area += ",B0500240";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%B8%ED%BD%C3%7C%7C%C7%CF%BE%C84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ͼ?4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ȵ?":
			Albamoncrolling.area += ",B0600010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B0%E6%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ȵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B0600080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B0%EF%C1%F6%BE%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0600020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B3%B2%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ѻ꼺??":
			Albamoncrolling.area += ",B0600140";
			Mainpage.Filtering[Mainpage.index].setText("???ѻ꼺??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ô??":
			Albamoncrolling.area += ",B0600030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B5%B5%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??ô??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B0600040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0600050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%B8%F1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ﵿ":
			Albamoncrolling.area += ",B0600060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0600070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ַɵ?":
			Albamoncrolling.area += ",B0600090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BD%D6%B7%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ַɵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B0600100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BF%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0600110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%BF%C0%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0600120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ߴ뵿":
			Albamoncrolling.area += ",B0600130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C1%DF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ߴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B0600150";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ʿ???":
			Albamoncrolling.area += ",B0600160";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C3%CA%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("?ʿ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź????":
			Albamoncrolling.area += ",B0600170";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C5%BA%B9%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ź????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0600180";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C5%C2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̸?":
			Albamoncrolling.area += ",B0600190";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C5%F0%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("???̸?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ????":
			Albamoncrolling.area += ",B0600200";
			AlbaHeavencrolling.area += "031%7C%7C%B1%A4%C1%D6%BD%C3%7C%7C%C8%B8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ŵ?":
			Albamoncrolling.area += ",B0700010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B0%A5%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ŵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0700040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B1%B3%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0700020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B1%B3%B9%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0700030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B1%B3%B9%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0700050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%B5%BF%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???뵿":
			Albamoncrolling.area += ",B0700060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BB%E7%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???õ?":
			Albamoncrolling.area += ",B0700100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???õ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0700070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0700080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B0700090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BC%F6%C5%C33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ??":
			Albamoncrolling.area += ",B0700120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%BE%C6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??â??":
			Albamoncrolling.area += ",B0700130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%C0%CE%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??â??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0700140";
			AlbaHeavencrolling.area += "031%7C%7C%B1%B8%B8%AE%BD%C3%7C%7C%C5%E4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0800010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%A4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B0800020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%BA%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B0800030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%BA%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ó???":
			Albamoncrolling.area += ",B0800040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%C3%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ó???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0800050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B1%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?絿":
			Albamoncrolling.area += ",B0800060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0800070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B4%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???߹̵?":
			Albamoncrolling.area += ",B0800080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B4%EB%BE%DF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???߹̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B0800090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B5%B5%B8%B6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?д뵿":
			Albamoncrolling.area += ",B0800100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%B5%D0%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?д뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ΰ":
			Albamoncrolling.area += ",B0800110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?꺻??":
			Albamoncrolling.area += ",B0800140";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BB%EA%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?꺻??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?꺻1??":
			Albamoncrolling.area += ",B0800120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BB%EA%BA%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?꺻1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?꺻2??":
			Albamoncrolling.area += ",B0800130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BB%EA%BA%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?꺻2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ӵ޵?":
			Albamoncrolling.area += ",B0800150";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BC%D3%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ӵ޵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0800160";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BC%F6%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ÿ??ݵ?":
			Albamoncrolling.area += ",B0800170";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ÿ??ݵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???õ?":
			Albamoncrolling.area += ",B0800180";
			AlbaHeavencrolling.area += "031%7C%7C%B1%BA%C6%F7%BD%C3%7C%7C%C0%E7%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???õ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900010";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B0%A8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900020";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B0%C9%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900030";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B0%ED%C3%CC%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900035";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B1%B8%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B0900140";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900040";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B4%EB%B0%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???굿":
			Albamoncrolling.area += ",B0900045";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%B8%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ϻ???":
			Albamoncrolling.area += ",B0900050";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BA%CF%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ϻ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???쵿":
			Albamoncrolling.area += ",B0900060";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BB%E7%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900070";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BE%E7%C3%CC%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B0900080";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BF%EE%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B0900090";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%BF%F9%B0%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???⵿":
			Albamoncrolling.area += ",B0900100";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???⺻??":
			Albamoncrolling.area += ",B0900150";
			Mainpage.Filtering[Mainpage.index].setText("???⺻??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += "B0900110";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C5%EB%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ????":
			Albamoncrolling.area += ",B0900120";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C7%B3%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϼ???":
			Albamoncrolling.area += ",B0900130";
			AlbaHeavencrolling.area += "031%7C%7C%B1%E8%C6%F7%BD%C3%7C%7C%C7%CF%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("?ϼ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B1000010";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B0%A1%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ݰ":
			Albamoncrolling.area += ",B1000020";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ٻ굿":
			Albamoncrolling.area += ",B1000220";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B4%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ٻ?1??":
			Albamoncrolling.area += ",B1000230";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B4%D9%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ٻ?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ٻ?2??":
			Albamoncrolling.area += ",B1000240";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B4%D9%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ٻ?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000030";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%B5%B5%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000210";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BA%B0%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000040";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BA%B0%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???е?":
			Albamoncrolling.area += ",B1000050";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BB%EF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???е?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000060";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BC%F6%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000070";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BC%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000080";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BE%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000090";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BF%C0%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ͺ???":
			Albamoncrolling.area += ",B1000100";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%BF%CD%BA%CE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("?ͺ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???е?":
			Albamoncrolling.area += ",B1000110";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C0%CC%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???е?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???е?":
			Albamoncrolling.area += ",B1000120";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C0%CF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???е?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ȸ?":
			Albamoncrolling.area += ",B1000130";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%B6%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("???ȸ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ݵ?":
			Albamoncrolling.area += ",B1000140";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%F6%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ݵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += "B1000150";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%F8%B0%C7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1000160";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C1%F8%C1%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B1000170";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C5%F0%B0%E8%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?򳻵?":
			Albamoncrolling.area += ",B1000180";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C6%F2%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?򳻵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ????":
			Albamoncrolling.area += ",B1000190";
			AlbaHeavencrolling.area += "031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C8%A3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ????":
			Albamoncrolling.area += ",B1000200";
			AlbaHeavencrolling.area += "2C031%7C%7C%B3%B2%BE%E7%C1%D6%BD%C3%7C%7C%C8%AD%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȭ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɻ굿":
			Albamoncrolling.area += ",B1100010";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%B0%C9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ϵ?":
			Albamoncrolling.area += ",B1100020";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%B1%A4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????õ??":
			Albamoncrolling.area += ",B1100030";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%B5%BF%B5%CE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???굿":
			Albamoncrolling.area += ",B1100040";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BA%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1100160";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ϵ?":
			Albamoncrolling.area += ",B1100050";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%F3%BA%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???е?":
			Albamoncrolling.area += ",B1100060";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%F3%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???е?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1100070";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%FD%BF%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1100080";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%FD%BF%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1100090";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BB%FD%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ҿ䵿":
			Albamoncrolling.area += ",B1100170";
			Mainpage.Filtering[Mainpage.index].setText("?ҿ䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?۳???":
			Albamoncrolling.area += ",B1100100";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?۳???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ﵿ":
			Albamoncrolling.area += ",B1100110";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%BE%C8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????õ?߾ӵ?":
			Albamoncrolling.area += ",B1100120";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????õ?߾ӵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ൿ":
			Albamoncrolling.area += ",B1100130";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C1%F6%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž????":
			Albamoncrolling.area += ",B1100140";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C5%BE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ϻ??ϵ?":
			Albamoncrolling.area += ",B1100150";
			AlbaHeavencrolling.area += "031%7C%7C%B5%BF%B5%CE%C3%B5%BD%C3%7C%7C%C7%CF%BA%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ϻ??ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1250010";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%E8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1250020";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%ED%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1250030";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%ED%B0%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B1250040";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B0%ED%B0%AD%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ȵ?":
			Albamoncrolling.area += ",B1250050";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B1%AB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ȵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B1250060";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ?ô??嵿":
			Albamoncrolling.area += ",B1250070";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ?ô??嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B1250080";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B5%B5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ڵ?":
			Albamoncrolling.area += ",B1250090";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%B9%FC%B9%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ڵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1250100";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%EF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B1250110";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??1??":
			Albamoncrolling.area += ",B1250120";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??2??":
			Albamoncrolling.area += ",B1250130";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??3??":
			Albamoncrolling.area += ",B1250140";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BB%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B1250150";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?һ絿":
			Albamoncrolling.area += ",B1250160";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?һ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?һ纻??":
			Albamoncrolling.area += ",B1250170";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%D2%BB%E7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?һ纻??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?һ纻3??":
			Albamoncrolling.area += ",B1250180";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%D2%BB%E7%BA%BB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?һ纻3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ?ü۳???":
			Albamoncrolling.area += ",B1250190";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ?ü۳???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?۳?1??":
			Albamoncrolling.area += ",B1250200";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?۳?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?۳?2??":
			Albamoncrolling.area += ",B1250210";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BC%DB%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?۳?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ﵿ":
			Albamoncrolling.area += ",B1250220";
			Mainpage.Filtering[Mainpage.index].setText("???ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ":
			Albamoncrolling.area += ",B1250230";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ?1??":
			Albamoncrolling.area += ",B1250240";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ?2??":
			Albamoncrolling.area += ",B1250250";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ?3??":
			Albamoncrolling.area += ",B1250260";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ?3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ??":
			Albamoncrolling.area += ",B1250270";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ɰ1??":
			Albamoncrolling.area += ",B1250280";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BD%C9%B0%EE%BA%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ɰ1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???뵿":
			Albamoncrolling.area += ",B1250290";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BE%E0%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1250300";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%A9%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???췯??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B1250310";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1250320";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1250330";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B1250340";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%AA%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1250350";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%C0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ?ÿ??浿":
			Albamoncrolling.area += ",B1250360";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%C1%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ?ÿ??浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B1250370";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1250380";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%B9%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1250390";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%B9%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1250400";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%C1%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1250410";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%C1%BE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1250420";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%BF%F8%C1%BE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?۵?":
			Albamoncrolling.area += ",B1250430";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?۵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ߵ?":
			Albamoncrolling.area += ",B1250440";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ߵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??1??":
			Albamoncrolling.area += ",B1250450";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??2??":
			Albamoncrolling.area += ",B1250460";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??3??":
			Albamoncrolling.area += ",B1250470";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??4??":
			Albamoncrolling.area += ",B1250480";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C1%DF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ǵ?":
			Albamoncrolling.area += ",B1250490";
			AlbaHeavencrolling.area += "031%7C%7C%BA%CE%C3%B5%BD%C3%7C%7C%C3%E1%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ǵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B1500010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B1%B8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1500190";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ñó???":
			Albamoncrolling.area += ",B1500020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B1%C3%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ñó???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ñݰ":
			Albamoncrolling.area += ",B1500030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ñݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ô??嵿":
			Albamoncrolling.area += ",B1500040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ô??嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1500050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B5%BF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1500060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%B9%E9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?д絿":
			Albamoncrolling.area += ",B1500070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BA%D0%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?д絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1500080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BB%EF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1500090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%AD%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1500200";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1500210";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B1500100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%AE%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1500110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1500112";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1500114";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B1500116";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BC%F6%B3%BB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ž??":
			Albamoncrolling.area += ",B1500120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BE%DF%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ž??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ž1??":
			Albamoncrolling.area += ",B1500220";
			Mainpage.Filtering[Mainpage.index].setText("??ž1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ž2??":
			Albamoncrolling.area += ",B1500230";
			Mainpage.Filtering[Mainpage.index].setText("??ž2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ž3??":
			Albamoncrolling.area += ",B1500240";
			Mainpage.Filtering[Mainpage.index].setText("??ž3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ߵ?":
			Albamoncrolling.area += ",B1500130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%BF%EE%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ߵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B1500140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?̸ŵ?":
			Albamoncrolling.area += ",B1500150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C0%CC%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?̸ŵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?̸?1??":
			Albamoncrolling.area += ",B1500250";
			Mainpage.Filtering[Mainpage.index].setText("?̸?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?̸?2??":
			Albamoncrolling.area += ",B1500260";
			Mainpage.Filtering[Mainpage.index].setText("?̸?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ڵ?":
			Albamoncrolling.area += ",B1500160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ڵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1500270";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1500280";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B1500290";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ǳ???":
			Albamoncrolling.area += ",B1500170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C6%C7%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ǳ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϻ??":
			Albamoncrolling.area += ",B1500180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BA%D0%B4%E7%B1%B8%7C%7C%C7%CF%BB%EA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϻ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B1600010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B0%ED%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???䵿":
			Albamoncrolling.area += ",B1600020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B1%DD%C5%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ܴ뵿":
			Albamoncrolling.area += ",B1600030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B4%DC%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ܴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1600040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%B5%D0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1600050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BA%B9%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???۵?":
			Albamoncrolling.area += ",B1600060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BB%E7%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???۵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?꼺??":
			Albamoncrolling.area += ",B1600070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?꼺??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1600080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BB%F3%C0%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?꼺??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1600110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BC%F6%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1600090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BC%F6%C1%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1600100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BC%F6%C1%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ﵿ":
			Albamoncrolling.area += ",B1600120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C3%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B1600130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ý??ﵿ":
			Albamoncrolling.area += ",B1600170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ý??ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1600140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1600150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B1600160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C5%C8%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ýɰ":
			Albamoncrolling.area += ",B1600180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1600190";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BE%E7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ߵ?":
			Albamoncrolling.area += ",B1600200";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%BF%C0%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ߵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ʵ?":
			Albamoncrolling.area += ",B1600270";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ʵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â?":
			Albamoncrolling.area += ",B1600210";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C3%A2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1600260";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1600220";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1600230";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B1600240";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????4??":
			Albamoncrolling.area += ",B1600250";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%BC%F6%C1%A4%B1%B8%7C%7C%C5%C2%C6%F24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ð?????":
			Albamoncrolling.area += ",B1700010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ð?????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ݱ???":
			Albamoncrolling.area += ",B1700040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B1%DD%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ݱ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ݱ?1??":
			Albamoncrolling.area += ",B1700020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B1%DD%B1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ݱ?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ݱ?2??":
			Albamoncrolling.area += ",B1700030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B1%DD%B1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ݱ?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B1700050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%B5%B5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B1700090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????1??":
			Albamoncrolling.area += ",B1700060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????2??":
			Albamoncrolling.area += ",B1700070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????3??":
			Albamoncrolling.area += ",B1700080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BB%F3%B4%EB%BF%F83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1700100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1700110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%BF%A9%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ൿ":
			Albamoncrolling.area += ",B1700140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C0%BA%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1700120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C0%BA%C7%E01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1700130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C0%BA%C7%E02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???????߾ӵ?":
			Albamoncrolling.area += ",B1700150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???????߾ӵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϴ?????":
			Albamoncrolling.area += ",B1700160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%BA%B3%B2%BD%C3+%C1%DF%BF%F8%B1%B8%7C%7C%C7%CF%B4%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϴ?????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1800010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B0%ED%BB%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B1800020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B0%EE%B9%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B1800030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B1%B8%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ǽ???":
			Albamoncrolling.area += ",B1800040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B1%C7%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ǽ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ñݰ":
			Albamoncrolling.area += ",B1800050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ñݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1800060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B4%E7%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??Ȳ????":
			Albamoncrolling.area += ",B1800070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%B4%EB%C8%B2%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??Ȳ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???е?":
			Albamoncrolling.area += ",B1800080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%AD%B5%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???е?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1800120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1800090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1800100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B1800110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BC%BC%B7%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????õ??":
			Albamoncrolling.area += ",B1800130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%BF%C0%B8%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ժϵ?":
			Albamoncrolling.area += ",B1800140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C0%D4%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ժϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????????":
			Albamoncrolling.area += ",B1800150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž??":
			Albamoncrolling.area += ",B1800160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B1800170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?򸮵?":
			Albamoncrolling.area += ",B1800180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C6%F2%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?򸮵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ?Žǵ?":
			Albamoncrolling.area += ",B1800190";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%B1%C7%BC%B1%B1%B8%7C%7C%C8%A3%B8%C5%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ?Žǵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2010120";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2010010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C1%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ź??":
			Albamoncrolling.area += ",B2010060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ź??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ź1??":
			Albamoncrolling.area += ",B2010020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ź1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ź2??":
			Albamoncrolling.area += ",B2010030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ź2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ź3??":
			Albamoncrolling.area += ",B2010040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ź3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ź4??":
			Albamoncrolling.area += ",B2010050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%B8%C5%C5%BA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ź4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ŵ?":
			Albamoncrolling.area += ",B2010070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ŵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???뵿":
			Albamoncrolling.area += ",B2010080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%B5%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B2010075";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%B5%C5%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B2010076";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%B5%C5%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ??":
			Albamoncrolling.area += ",B2010090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%BF%F8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ǵ?":
			Albamoncrolling.area += ",B2010100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%C0%CC%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ǵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???嵿":
			Albamoncrolling.area += ",B2010130";
			Mainpage.Filtering[Mainpage.index].setText("???嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϵ?":
			Albamoncrolling.area += ",B2010110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%BF%B5%C5%EB%B1%B8%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?󱤱???":
			Albamoncrolling.area += ",B1900010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BB%F3%B1%A4%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?󱤱???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???׵?":
			Albamoncrolling.area += ",B1900020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BC%DB%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???׵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1900030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BF%AC%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ȭ??":
			Albamoncrolling.area += ",B1900040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%BF%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ȭ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1900050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C0%B2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?̸???":
			Albamoncrolling.area += ",B1900060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C0%CC%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?̸???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???????ڵ?":
			Albamoncrolling.area += ",B1900100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???????ڵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????1??":
			Albamoncrolling.area += ",B1900070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????2??":
			Albamoncrolling.area += ",B1900080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????3??":
			Albamoncrolling.area += ",B1900090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%A4%C0%DA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B1900110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%B6%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B1900111";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%B6%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B1900112";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C1%B6%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õõ??":
			Albamoncrolling.area += ",B1900120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C3%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õõ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???嵿":
			Albamoncrolling.area += ",B1900130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C6%C4%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϱ?????":
			Albamoncrolling.area += ",B1900140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C0%E5%BE%C8%B1%B8%7C%7C%C7%CF%B1%A4%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϱ?????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ð??":
			Albamoncrolling.area += ",B2000010";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B0%ED%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ð??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B2000020";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ??":
			Albamoncrolling.area += ",B2000030";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B1%B8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2000040";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B3%B2%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??â??":
			Albamoncrolling.area += ",B2000050";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B3%B2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??â??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ű???":
			Albamoncrolling.area += ",B2000060";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ű???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ż???1??":
			Albamoncrolling.area += ",B2000070";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%BB%EA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("?Ż???1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ż???2??":
			Albamoncrolling.area += ",B2000080";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%BB%EA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("?Ż???2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ż???3??":
			Albamoncrolling.area += ",B2000090";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%BB%EA%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("?Ż???3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???⵿":
			Albamoncrolling.area += ",B2000100";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%B8%C5%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϼ???":
			Albamoncrolling.area += ",B2000110";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BA%CF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϼ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ǳ??":
			Albamoncrolling.area += ",B2000120";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BD%C5%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ǳ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B2000130";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?츸??":
			Albamoncrolling.area += ",B2000160";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%EC%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?츸??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?츸1??":
			Albamoncrolling.area += ",B2000140";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%EC%B8%B81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?츸1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?츸2??":
			Albamoncrolling.area += ",B2000150";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%BF%EC%B8%B82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?츸2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ΰ赿":
			Albamoncrolling.area += ",B2000170";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C0%CE%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ΰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ȵ?":
			Albamoncrolling.area += ",B2000180";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ȵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???????ߵ?":
			Albamoncrolling.area += ",B2000190";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???????ߵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B2000200";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ȴ޷?1??":
			Albamoncrolling.area += ",B2000210";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C6%C8%B4%DE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("?ȴ޷?1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ȴ޷?2??":
			Albamoncrolling.area += ",B2000220";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C6%C8%B4%DE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("?ȴ޷?2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ȴ޷?3??":
			Albamoncrolling.area += ",B2000230";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C6%C8%B4%DE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("?ȴ޷?3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ????":
			Albamoncrolling.area += ",B2000260";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C8%AD%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ??1??":
			Albamoncrolling.area += ",B2000240";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C8%AD%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ??1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ??2??":
			Albamoncrolling.area += ",B2000250";
			AlbaHeavencrolling.area += "031%7C%7C%BC%F6%BF%F8%BD%C3+%C6%C8%B4%DE%B1%B8%7C%7C%C8%AD%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ??2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ÿ???":
			Albamoncrolling.area += ",B2100010";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B0%C5%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ÿ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ð?????":
			Albamoncrolling.area += ",B2100020";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B0%E8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ð?????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100030";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B0%FA%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100040";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B1%A4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ڵ?":
			Albamoncrolling.area += ",B2100050";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B1%BA%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ڵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B2100060";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B1%DD%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B2100070";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B3%ED%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????ôɰ":
			Albamoncrolling.area += ",B2100080";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B4%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????ôɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ߵ?":
			Albamoncrolling.area += ",B2100090";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B4%EB%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ߵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??â??":
			Albamoncrolling.area += ",B2100100";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B5%B5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??â??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??ȭ??":
			Albamoncrolling.area += ",B2100110";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B8%C5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??ȭ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?񰨵?":
			Albamoncrolling.area += ",B2100120";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B8%F1%B0%A8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?񰨵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????????":
			Albamoncrolling.area += ",B2100130";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%AB%C1%F6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???յ?":
			Albamoncrolling.area += ",B2100140";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%B0%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???յ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?̻굿":
			Albamoncrolling.area += ",B2100150";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%CC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?̻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???굿":
			Albamoncrolling.area += ",B2100160";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100165";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%B9%E8%B0%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100170";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BB%EA%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??õ??":
			Albamoncrolling.area += ",B2100180";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??õ??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100350";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100190";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BE%C8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100360";

			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100200";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%BF%F9%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?????????ൿ":
			Albamoncrolling.area += ",B2100210";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C0%BA%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?????????ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B2100220";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C0%E5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100230";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C0%E5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???յ?":
			Albamoncrolling.area += ",B2100280";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???յ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B2100240";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B2100250";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B2100260";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????4??":
			Albamoncrolling.area += ",B2100270";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????4??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???պ???":
			Albamoncrolling.area += ",B2100285";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%A4%BF%D5%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???պ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100290";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%B6%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2100300";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C1%D7%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????":
			Albamoncrolling.area += ",B2100310";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϻ???":
			Albamoncrolling.area += ",B2100320";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C7%CF%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϻ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ߵ?":
			Albamoncrolling.area += ",B2100330";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C7%CF%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ߵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????ȭ????":
			Albamoncrolling.area += ",B2100340";
			AlbaHeavencrolling.area += "031%7C%7C%BD%C3%C8%EF%BD%C3%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????ȭ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ܵ?":
			Albamoncrolling.area += ",B2200030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B0%ED%C0%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ܵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???γ???":
			Albamoncrolling.area += ",B2200040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B4%EB%BA%CE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???γ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ε?":
			Albamoncrolling.area += ",B2200230";
			Mainpage.Filtering[Mainpage.index].setText("???ε?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ε???":
			Albamoncrolling.area += ",B2200050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B4%EB%BA%CE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ε???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???κϵ?":
			Albamoncrolling.area += ",B2200060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B4%EB%BA%CE%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???κϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?񳻵?":
			Albamoncrolling.area += ",B2200070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%B8%F1%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?񳻵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B2200240";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2200080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%B0%A8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ε?":
			Albamoncrolling.area += ",B2200120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ε?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B2200090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B2200100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B2200110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%B1%BA%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȼ??ü??":
			Albamoncrolling.area += ",B2200130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BC%BA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ȼ??ü??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ű浿":
			Albamoncrolling.area += ",B2200140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BD%C5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ű浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?͵?":
			Albamoncrolling.area += ",B2200150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BF%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?͵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???":
			Albamoncrolling.area += ",B2200180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BF%F8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???õ?":
			Albamoncrolling.area += ",B2200190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%BF%F8%BD%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???õ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȼ????߾ӵ?":
			Albamoncrolling.area += ",B2200250";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ȼ????߾ӵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2200200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C3%CA%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ????":
			Albamoncrolling.area += ",B2200210";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C7%B3%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ????":
			Albamoncrolling.area += ",B2200260";
			Mainpage.Filtering[Mainpage.index].setText("ȣ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȼ???ȭ????":
			Albamoncrolling.area += ",B2200220";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%B4%DC%BF%F8%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ȼ???ȭ????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ǰǵ?":
			Albamoncrolling.area += ",B2210010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%B0%C7%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ǰǵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ݿ???":
			Albamoncrolling.area += ",B2210210";
			Mainpage.Filtering[Mainpage.index].setText("?ݿ???");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2210050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????1??":
			Albamoncrolling.area += ",B2210020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????1??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????2??":
			Albamoncrolling.area += ",B2210030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????2??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "????3??":
			Albamoncrolling.area += ",B2210040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%BB%BF%C03%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("????3??");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȼ??úΰ":
			Albamoncrolling.area += ",B2210060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ȼ??úΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?絿":
			Albamoncrolling.area += ",B2210090";
			Mainpage.Filtering[Mainpage.index].setText("?絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???絿":
			Albamoncrolling.area += ",B2210100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BB%E7%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???̵?":
			Albamoncrolling.area += ",B2210080";
			Mainpage.Filtering[Mainpage.index].setText("???̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2210110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BC%BA%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ϵ?":
			Albamoncrolling.area += ",B2210120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BC%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȼ굿":
			Albamoncrolling.area += ",B2210220";
			Mainpage.Filtering[Mainpage.index].setText("?Ȼ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2210130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BE%E7%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ǵ?":
			Albamoncrolling.area += ",B2210140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%BF%F9%C7%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ǵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?̵?":
			Albamoncrolling.area += ",B2210150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ϵ?":
			Albamoncrolling.area += ",B2210160";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "??????":
			Albamoncrolling.area += ",B2210170";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%E5%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("??????");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "???ϵ?":
			Albamoncrolling.area += ",B2210180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C0%E5%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("???ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȱ??̵?":
			Albamoncrolling.area += ",B2210190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C6%C8%B0%EE%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ȱ??̵?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?Ȱ??ϵ?":
			Albamoncrolling.area += ",B2210200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BB%EA%BD%C3+%BB%F3%B7%CF%B1%B8%7C%7C%C6%C8%B0%EE%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("?Ȱ??ϵ?");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "?ؾ絿":
			Albamoncrolling.area += ",B2210230";
			Mainpage.Filtering[Mainpage.index].setText("?ؾ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
