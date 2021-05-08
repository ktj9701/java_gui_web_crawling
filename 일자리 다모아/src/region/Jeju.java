package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Jeju {
	public boolean flag;

	public void JejuCity(ActionEvent e) {
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
			Albamoncrolling.area += ",N0300010";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B0%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0300012";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B3%B2%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0300015";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0300020";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0300030";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%B5%BC%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȫ��":
			Albamoncrolling.area += ",N0300040";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%BF%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȫ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȯ��":
			Albamoncrolling.area += ",N0300050";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B9%FD%C8%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȯ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0300060";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BA%B8%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󿹵�":
			Albamoncrolling.area += ",N0300070";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󿹵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			Albamoncrolling.area += ",N0300080";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���޵�":
			Albamoncrolling.area += ",N0300090";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			Albamoncrolling.area += ",N0300100";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%B1%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",N0300110";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȫ��":
			Albamoncrolling.area += ",N0300120";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȫ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0300125";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%BA%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			Albamoncrolling.area += ",N0300130";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			Albamoncrolling.area += ",N0300140";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BD%C5%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ���":
			Albamoncrolling.area += ",N0300146";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BE%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0300150";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",N0300160";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0300170";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",N0300180";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%A4%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߹���":
			Albamoncrolling.area += ",N0300190";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߹���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",N0300200";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			Albamoncrolling.area += ",N0300210";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C3%B5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0300220";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C5%E4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǥ����":
			Albamoncrolling.area += ",N0300225";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%A5%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			Albamoncrolling.area += ",N0300230";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			Albamoncrolling.area += ",N0300240";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			Albamoncrolling.area += ",N0300250";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�ٵ�":
			Albamoncrolling.area += ",N0300260";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%A3%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			Albamoncrolling.area += ",N0300270";
			AlbaHeavencrolling.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ե�":
			Albamoncrolling.area += ",N0400010";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B0%C7%C0%D4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���Ե�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0400015";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B1%B8%C1%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0400020";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%BB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0400030";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%EB%C7%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0400040";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",N0400070";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",N0400050";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",N0400060";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",N0400080";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",N0400090";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0400110";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",N0400120";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BA%C0%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵵ1��":
			Albamoncrolling.area += ",N0400130";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵵ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�︶2��":
			Albamoncrolling.area += ",N0400140";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�︶2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",N0400190";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",N0400160";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",N0400170";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",N0400180";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƶ�":
			Albamoncrolling.area += ",N0400220";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƶ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƶ�1��":
			Albamoncrolling.area += ",N0400200";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƶ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƶ�2��":
			Albamoncrolling.area += ",N0400210";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƶ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ���":
			Albamoncrolling.area += ",N0400225";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%D6%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0400230";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0400240";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",N0400250";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",N0400290";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",N0400260";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",N0400270";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",N0400280";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ���":
			Albamoncrolling.area += ",N0400320";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ�1��":
			Albamoncrolling.area += ",N0400300";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ�2��":
			Albamoncrolling.area += ",N0400310";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			Albamoncrolling.area += ",N0400330";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",N0400340";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",N0400350";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",N0400360";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�쵵��":
			Albamoncrolling.area += ",N0400375";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EC%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�쵵��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽÿ���":
			Albamoncrolling.area += ",N0400380";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�1��":
			Albamoncrolling.area += ",N0400390";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�2��":
			Albamoncrolling.area += ",N0400400";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",N0400440";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ1��":
			Albamoncrolling.area += ",N0400420";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ2��":
			Albamoncrolling.area += ",N0400430";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�1��":
			Albamoncrolling.area += ",N0400450";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�2��":
			Albamoncrolling.area += ",N0400460";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",N0400475";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C1%B6%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڸ�":
			Albamoncrolling.area += ",N0400473";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C3%DF%C0%DA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ڸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ��":
			Albamoncrolling.area += ",N0400476";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѹ���":
			Albamoncrolling.area += ",N0400477";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B8%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ѹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�":
			Albamoncrolling.area += ",N0400480";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϵ�":
			Albamoncrolling.area += ",N0400510";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			Albamoncrolling.area += ",N0400490";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			Albamoncrolling.area += ",N0400500";
			AlbaHeavencrolling.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸõ��":
			Albamoncrolling.area += ",N0400520";
			AlbaHeavencrolling.area += "C064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%B8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}