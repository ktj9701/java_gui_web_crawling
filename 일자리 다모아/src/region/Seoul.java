package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Seoul {
	public boolean flag;

	public void SeoulCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			Albamoncrolling.area = "";
		AlbaHeavencrolling.area ="";
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
		case "������":
			Albamoncrolling.area += ",I0100050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0100010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0100020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I0100040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B0%B3%C6%F74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0100080";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B3%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0100060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B3%ED%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0100070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B3%ED%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			Albamoncrolling.area += ",I0100130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ1��":
			Albamoncrolling.area += ",I0100090";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ2��":
			Albamoncrolling.area += ",I0100100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ4��":
			Albamoncrolling.area += ",I0100120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B4%EB%C4%A14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I0100160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B5%B5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0100140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B5%B5%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0100150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%B5%B5%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��":
			Albamoncrolling.area += ",I0100190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BB%EF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ1��":
			Albamoncrolling.area += ",I0100170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BB%EF%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ2��":
			Albamoncrolling.area += "I0100180";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BB%EF%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I0100200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BC%BC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0100210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BC%F6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż絿":
			Albamoncrolling.area += ",I0100220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ż絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�б�����":
			Albamoncrolling.area += ",I0100250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BE%D0%B1%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�б�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",I0100280";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BF%AA%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0100260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BF%AA%BB%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0100270";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%BF%AA%BB%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0100290";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			Albamoncrolling.area += ",I0100320";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ�1��":
			Albamoncrolling.area += ",I0100300";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ�2��":
			Albamoncrolling.area += ",I0100310";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ�����":
			Albamoncrolling.area += ",I0100330";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%CF%BF%F8%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڰ":
			Albamoncrolling.area += ",I0100340";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C0%DA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�㵿":
			Albamoncrolling.area += ",I0100370";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B3%B2%B1%B8%7C%7C%C3%BB%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I0200010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%AD%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",I0200040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%ED%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I0200020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%ED%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I0200030";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B0%ED%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�浿":
			Albamoncrolling.area += ",I0200070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I0200100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B5%D0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0200080";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B5%D0%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0200090";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B5%D0%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I0200130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B8%ED%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0200110";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B8%ED%C0%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0200120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%B8%ED%C0%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I0200140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BB%F3%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0200180";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0200150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0200160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0200170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BC%BA%B3%BB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "�ϻ絿":
			Albamoncrolling.area += ",I0200230";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�1��":
			Albamoncrolling.area += ",I0200190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�2��":
			Albamoncrolling.area += ",I0200200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�3��":
			Albamoncrolling.area += ",I0200210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%BE%CF%BB%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õȣ��":
			Albamoncrolling.area += ",I0200280";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õȣ1��":
			Albamoncrolling.area += ",I0200240";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õȣ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õȣ2��":
			Albamoncrolling.area += ",I0200250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õȣ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õȣ3��":
			Albamoncrolling.area += ",I0200260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%B5%BF%B1%B8%7C%7C%C3%B5%C8%A33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õȣ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̾Ƶ�":
			Albamoncrolling.area += ",I0300100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%CC%BE%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I0300140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",I0300110";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",I0300120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",I0300130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%B9%F83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰢ�굿":
			Albamoncrolling.area += ",I0300060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BB%EF%B0%A2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰢ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",I0300010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BB%EF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",I0300040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%DB%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I0300050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%DB%C3%B5%B5%BF	";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0300210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0300150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0300160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0300170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BC%F6%C0%AF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I0300220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%BF%EC%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ���":
			Albamoncrolling.area += ",I0300190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BA%CF%B1%B8%7C%7C%C0%CE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�μ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",I0400040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0400010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0400020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0400030";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%A1%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I0400050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%B3%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			Albamoncrolling.area += ",I0400060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%F8%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ص�":
			Albamoncrolling.area += ",I0400070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%FA%C7%D8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ص�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߻굿":
			Albamoncrolling.area += ",I0400100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B3%BB%B9%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I0400140";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0400110";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0400120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0400130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%EE%C3%CC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I0400150";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B8%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I0400190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ1��":
			Albamoncrolling.area += ",I0400160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ2��":
			Albamoncrolling.area += ",I0400170";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ3��":
			Albamoncrolling.area += ",I0400180";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%E6%C8%AD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",I0400200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%B0%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I0400210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",I0400220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%C0%BC%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܹ߻굿":
			Albamoncrolling.area += ",I0400230";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%DC%B9%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܹ߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����굿":
			Albamoncrolling.area += ",I0400280";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BF%EC%C0%E5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�":
			Albamoncrolling.area += ",I0400320";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			Albamoncrolling.area += ",I0400240";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			Albamoncrolling.area += ",I0400250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��3��":
			Albamoncrolling.area += ",I0400260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��4��":
			Albamoncrolling.area += ",I0400270";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��6��":
			Albamoncrolling.area += ",I0400290";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��8��":
			Albamoncrolling.area += ",I0400310";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���":
			Albamoncrolling.area += ",I0400330";
			AlbaHeavencrolling.area += "02%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%B0%EE%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����뵿":
			Albamoncrolling.area += ",I0500100";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%AB%BC%BA%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I0500210";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",I0500250";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%AD%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0500010";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B3%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",I0500270";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B4%EB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼���":
			Albamoncrolling.area += ",I0500160";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%B9%CC%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�":
			Albamoncrolling.area += ",I0500040";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BA%B8%B6%F3%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I0500130";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BA%C0%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǳ��Ｚ��":
			Albamoncrolling.area += ",I0500240";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BB%EF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���Ǳ� �Ｚ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0500200";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BC%AD%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0500290";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BC%AD%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0500050";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BC%BA%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ���":
			Albamoncrolling.area += ",I0500230";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BD%C5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǳ��Ż絿":
			Albamoncrolling.area += ",I0500220";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���Ǳ��Ż絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",I0500190";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%BD%C5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I0500120";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C0%BA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",I0500030";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C0%CE%C7%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0500260";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C1%B6%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",I0500020";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�浿":
			Albamoncrolling.area += ",I0500070";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",I0500060";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C3%BB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",I0500090";
			AlbaHeavencrolling.area += "02%7C%7C%B0%FC%BE%C7%B1%B8%7C%7C%C7%E0%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",I0600010";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%A4%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I0600050";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0600020";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0600030";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0600040";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%B8%C0%C73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			Albamoncrolling.area += ",I0600060";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B1%BA%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɵ�":
			Albamoncrolling.area += ",I0600100";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ絿":
			Albamoncrolling.area += ",I0600150";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ھ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ�1��":
			Albamoncrolling.area += ",I0600120";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ھ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ�2��":
			Albamoncrolling.area += ",I0600130";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ھ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ�3��":
			Albamoncrolling.area += ",I0600140";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ھ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ�4��":
			Albamoncrolling.area += ",I0600070";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C0%DA%BE%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ھ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰":
			Albamoncrolling.area += ",I0600200";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�1��":
			Albamoncrolling.area += ",I0600160";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�2��":
			Albamoncrolling.area += ",I0600170";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�3��":
			Albamoncrolling.area += ",I0600180";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�4��":
			Albamoncrolling.area += ",I0600190";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C1%DF%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�絿":
			Albamoncrolling.area += ",I0600210";
			AlbaHeavencrolling.area += "02%7C%7C%B1%A4%C1%F8%B1%B8%7C%7C%C8%AD%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",I0700030";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%A1%B8%AE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0700070";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0700040";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0700050";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0700060";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%B3%BA%C03%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			Albamoncrolling.area += ",I0700110";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%ED%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô1��":
			Albamoncrolling.area += ",I0700090";
			AlbaHeavencrolling.area="02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%ED%C3%B41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô1����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô2��":
			Albamoncrolling.area += ",I0700100";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B0%ED%C3%B42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I0700180";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0700120";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0700130";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0700140";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I0700150";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",I0700160";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%B8%B7%CE5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�õ�":
			Albamoncrolling.area += ",I0700200";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�����":
			Albamoncrolling.area += ",I0700210";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BD%C5%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0700240";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0700220";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C0%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0700230";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C0%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¼���":
			Albamoncrolling.area += ",I0700250";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%BF%C2%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�յ�":
			Albamoncrolling.area += ",I0700260";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%C3%B5%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�":
			Albamoncrolling.area += ",I0700270";
			AlbaHeavencrolling.area += "02%7C%7C%B1%B8%B7%CE%B1%B8%7C%7C%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",I0800010";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B0%A1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",I0800060";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0800020";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0800030";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += "I0800040";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I0800050";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%B5%B6%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",I0800130";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0800080";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0800090";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0800100";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I0800110";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",I0800120";
			AlbaHeavencrolling.area += "02%7C%7C%B1%DD%C3%B5%B1%B8%7C%7C%BD%C3%C8%EF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0900040";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%B0%F8%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1.3��":
			Albamoncrolling.area += ",I0900010";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%B0%F8%B8%AA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1.3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0900020";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%B0%F8%B8%AA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			Albamoncrolling.area += ",I0900150";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I0900060";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I0900070";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3.4��":
			Albamoncrolling.area += ",I0900080";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E83.4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3.4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			Albamoncrolling.area += ",I0900100";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E85%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6.7��":
			Albamoncrolling.area += ",I0900110";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E86.7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6.7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���8��":
			Albamoncrolling.area += ",I0900130";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E88%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���9��":
			Albamoncrolling.area += ",I0900140";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E89%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���9��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���10��":
			Albamoncrolling.area += ",I0900050";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BB%F3%B0%E810%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���10��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",I0900200";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0900160";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0900170";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��\"");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I0900180";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%BF%F9%B0%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰赿":
			Albamoncrolling.area += ",I0900250";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�1��":
			Albamoncrolling.area += ",I0900210";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�2.3��":
			Albamoncrolling.area += ",I0900220";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E82.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�2.3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰�4��":
			Albamoncrolling.area += ",I0900240";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߰躻��":
			Albamoncrolling.area += ",I0900260";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C1%DF%B0%E8%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߰躻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ赿":
			Albamoncrolling.area += ",I0900290";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C7%CF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ�1��":
			Albamoncrolling.area += ",I0900270";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C7%CF%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ�2��":
			Albamoncrolling.area += ",I0900280";
			AlbaHeavencrolling.area += "02%7C%7C%B3%EB%BF%F8%B1%B8%7C%7C%C7%CF%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1000030";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B5%B5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1000010";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B5%B5%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1000020";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B5%B5%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",I1000080";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1000040";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1000050";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I1000060";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%B9%E6%C7%D03%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ���":
			Albamoncrolling.area += ",I1000130";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ�1��":
			Albamoncrolling.area += ",I1000090";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ�2��":
			Albamoncrolling.area += ",I1000100";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ�3��":
			Albamoncrolling.area += ",I1000110";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ�4��":
			Albamoncrolling.area += ",I1000120";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%BD%D6%B9%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��":
			Albamoncrolling.area += ",I1000190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â1��":
			Albamoncrolling.area += ",I1000140";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â2��":
			Albamoncrolling.area += ",I1000150";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â3��":
			Albamoncrolling.area += ",I1000160";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â4��":
			Albamoncrolling.area += ",I1000170";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â5��":
			Albamoncrolling.area += ",I1000180";
			AlbaHeavencrolling.area += "02%7C%7C%B5%B5%BA%C0%B1%B8%7C%7C%C3%A25%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ʸ���":
			Albamoncrolling.area += ",I1100060";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%B4%E4%BD%CA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ʸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ʸ�1��":
			Albamoncrolling.area += ",I1100010";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%B4%E4%BD%CA%B8%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ʸ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ʸ�2��":
			Albamoncrolling.area += ",I1100020";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%B4%E4%BD%CA%B8%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ʸ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",I1100070";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%BD%C5%BC%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			Albamoncrolling.area += ",I1100100";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̹���":
			Albamoncrolling.area += ",I1100140";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%CC%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̹���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̹�1��":
			Albamoncrolling.area += ",I1100110";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%CC%B9%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̹�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̹�2��":
			Albamoncrolling.area += ",I1100120";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%CC%B9%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̹�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",I1100190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I1100150";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%E5%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I1100160";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%E5%BE%C82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I1100240";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%FC%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1100200";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%FC%B3%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1100210";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C0%FC%B3%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",I1100270";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C1%A6%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û������":
			Albamoncrolling.area += ",I1100300";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C3%BB%B7%AE%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�⵿":
			Albamoncrolling.area += ",I1100310";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%B8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ְ浿":
			Albamoncrolling.area += ",I1100340";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%D6%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ְ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ְ�1��":
			Albamoncrolling.area += ",I1100320";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%D6%B0%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ְ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ְ�2��":
			Albamoncrolling.area += ",I1100330";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%B4%EB%B9%AE%B1%B8%7C%7C%C8%D6%B0%E62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ְ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뷮����":
			Albamoncrolling.area += ",I1200030";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B3%EB%B7%AE%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뷮����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뷮��1��":
			Albamoncrolling.area += ",I1200010";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B3%EB%B7%AE%C1%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뷮��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뷮��2��":
			Albamoncrolling.area += ",I1200020";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B3%EB%B7%AE%C1%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뷮��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			Albamoncrolling.area += ",I1200040";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			Albamoncrolling.area += ",I1200050";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%B5%BF%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I1200060";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",I1200120";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I1200070";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I1200080";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",I1200090";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",I1200100";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			Albamoncrolling.area += ",I1200110";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%E7%B4%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󵵵�":
			Albamoncrolling.area += ",I1200180";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",I1200130";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",I1200140";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",I1200150";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			Albamoncrolling.area += ",I1200160";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BB%F3%B5%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ�浿":
			Albamoncrolling.area += ",I1200210";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BD%C5%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ��1��":
			Albamoncrolling.area += ",I1200190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BD%C5%B4%EB%B9%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ��2��":
			Albamoncrolling.area += ",I1200190";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%BD%C5%B4%EB%B9%E62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漮��":
			Albamoncrolling.area += ",I1200250";
			AlbaHeavencrolling.area += "02%7C%7C%B5%BF%C0%DB%B1%B8%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300030";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B0%F8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300040";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B1%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",I1300050";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B3%EB%B0%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I1300060";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B4%E7%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",I1300070";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I1300100";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B5%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300110";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B5%BF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300120";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%B6%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300150";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%C1%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1300130";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%C1%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += "I1300140";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%B8%C1%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",I1300160";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BB%F3%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",I1300170";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BB%F3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300180";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%AD%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",I1300210";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%BA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1300190";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%BA%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1300200";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BC%BA%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�����":
			Albamoncrolling.area += ",I1300220";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BD%C5%B0%F8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",I1300230";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BD%C5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300240";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300280";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BE%C6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300290";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BF%AC%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300300";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BF%B0%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			Albamoncrolling.area += ",I1300310";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			Albamoncrolling.area += ",I1300320";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			Albamoncrolling.area += ",I1300325";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300340";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C5%E4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",I1300350";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C7%CF%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300360";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C7%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1300370";
			AlbaHeavencrolling.area += "02%7C%7C%B8%B6%C6%F7%B1%B8%7C%7C%C7%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����µ�":
			Albamoncrolling.area += ",I1400030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%B2%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I1400010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%B2%B0%A1%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I1400020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%B2%B0%A1%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I1400040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B3%C3%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",I1400045";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B4%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1400060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B4%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̱ٵ�":
			Albamoncrolling.area += ",I1400070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%B9%CC%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̱ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1400080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%C0%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ��µ�":
			Albamoncrolling.area += ",I1400110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ��µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ���1��":
			Albamoncrolling.area += ",I1400090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%B0%A1%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ���2��":
			Albamoncrolling.area += ",I1400100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%B0%A1%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼ�����":
			Albamoncrolling.area += ",I1400150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BA%CF%BE%C6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I1400160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I1400200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BF%AC%C8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I1400210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I1400220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�μ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "âõ��":
			Albamoncrolling.area += ",I1400230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%A2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�μ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			Albamoncrolling.area += ",I1400240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%B5%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I1400250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",I1400260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1400140";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�յ�":
			Albamoncrolling.area += ",I1400270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C7%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1400280";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C7%F6%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",I1400320";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C0%BA0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ��1��":
			Albamoncrolling.area += ",I1400290";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C0%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "ȫ��2��":
			Albamoncrolling.area += ",I1400300";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C0%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",I1400370";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ��1��":
			Albamoncrolling.area += ",I1400330";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ��2��":
			Albamoncrolling.area += ",I1400340";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ��3��":
			Albamoncrolling.area += ",I1400350";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%B4%EB%B9%AE%B1%B8%7C%7C%C8%AB%C1%A63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I1500010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1500060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1500020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1500030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I1500040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += "I1500050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",I1500070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%DD%C6%F7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",I1500120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I1500080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I1500090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",I1500100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",I1500110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��躻��":
			Albamoncrolling.area += ",I1500130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%B9%E6%B9%E8%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��躻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			Albamoncrolling.area += ",I1500180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1500140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1500150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I1500160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I1500170";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BC%AD%C3%CA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʱ��ſ���":
			Albamoncrolling.area += ",I1500190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BD%C5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʱ� �ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",I1500220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BE%E7%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1500200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BE%E7%C0%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1500210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BE%E7%C0%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I1500230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BF%B0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��鵿":
			Albamoncrolling.area += ",I1500240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BF%EC%B8%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1500250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%BF%F8%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",I1500260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%AD%C3%CA%B1%B8%7C%7C%C0%E1%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��1��":
			Albamoncrolling.area += ",I1600010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��2��":
			Albamoncrolling.area += ",I1600020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��3��":
			Albamoncrolling.area += ",I1600030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��4��":
			Albamoncrolling.area += ",I1600040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1600050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B5%B5%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",I1600060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%B8%B6%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ٵ�":
			Albamoncrolling.area += ",I1600070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BB%E7%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��սʸ���":
			Albamoncrolling.area += ",I1600080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BB%F3%BF%D5%BD%CA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��սʸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I1600130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I1600140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��1��":
			Albamoncrolling.area += "I1600090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F61%B0%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��2��":
			Albamoncrolling.area += ",I1600100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F61%B0%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��1��":
			Albamoncrolling.area += ",I1600110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F62%B0%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��3��":
			Albamoncrolling.area += ",I1600120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%BA%BC%F62%B0%A13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1600150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1600180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BF%C1%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��䵿":
			Albamoncrolling.area += ",I1600190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%BF%EB%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1600200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C0%C0%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽսʸ���":
			Albamoncrolling.area += ",I1600230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%CF%BF%D5%BD%CA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽսʸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",I1600260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%E0%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I1600240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%E0%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I1600250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C7%E0%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ�͵�":
			Albamoncrolling.area += ",I1600270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%B5%BF%B1%B8%7C%7C%C8%AB%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ�͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1700040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B1%E6%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1700010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B1%E6%C0%BD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1700020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B1%E6%C0%BD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I1700070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%B7%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1700050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%B7%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1700060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%B7%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I1700080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I1700090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",I1700100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",I1700110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",I1700120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���1��":
			Albamoncrolling.area += ",I1700130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���2��":
			Albamoncrolling.area += ",I1700140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���3��":
			Albamoncrolling.area += ",I1700150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���4��":
			Albamoncrolling.area += ",I1700160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���5��":
			Albamoncrolling.area += ",I1700170";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���6��":
			Albamoncrolling.area += ",I1700180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF+%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���7��":
			Albamoncrolling.area += ",I1700190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%B5%BF%BC%D2%B9%AE%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I1700200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I1700210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",I1700220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",I1700230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",I1700240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������6��":
			Albamoncrolling.area += ",I1700250";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������7��":
			Albamoncrolling.area += ",I1700260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BA%B8%B9%AE%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��1��":
			Albamoncrolling.area += ",I1700270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��2��":
			Albamoncrolling.area += ",I1700280";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "�Ｚ��3��":
			Albamoncrolling.area += ",I1700290";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��4��":
			Albamoncrolling.area += ",I1700300";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��5��":
			Albamoncrolling.area += ",I1700310";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%EF%BC%B1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I1700320";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BB%F3%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1700350";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BC%AE%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I1700380";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�1��":
			Albamoncrolling.area += ",I1700390";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦϵ�1��":
			Albamoncrolling.area += ",I1700400";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦϵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦϵ�2��":
			Albamoncrolling.area += ",I1700410";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦϵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦϵ�3��":
			Albamoncrolling.area += ",I1700420";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦϵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦϵ�4��":
			Albamoncrolling.area += ",I1700430";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦϵ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦϵ�5��":
			Albamoncrolling.area += ",I1700440";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BE%C8%BE%CF%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦϵ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1700445";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BF%F9%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1700446";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%BF%F9%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1700480";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A70%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1700450";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1700460";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I1700470";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C0%E5%C0%A73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1700530";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1700490";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1700500";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I1700510";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I1700520";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%A4%B8%AA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I1700560";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C1%BE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ��":
			Albamoncrolling.area += ",I1700610";
			AlbaHeavencrolling.area += "02%7C%7C%BC%BA%BA%CF%B1%B8%7C%7C%C7%CF%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
