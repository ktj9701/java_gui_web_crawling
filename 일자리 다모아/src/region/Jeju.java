package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Jeju {
	public boolean flag;

	public void JejuCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			crolling.area = "";
		wewe.area ="";
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
			crolling.area += ",N0300010";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B0%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0300012";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B3%B2%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0300015";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0300020";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0300030";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%B5%BC%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȫ��":
			crolling.area += ",N0300040";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B5%BF%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȫ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȯ��":
			crolling.area += ",N0300050";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%B9%FD%C8%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȯ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0300060";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BA%B8%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󿹵�":
			crolling.area += ",N0300070";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󿹵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			crolling.area += ",N0300080";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F3%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���޵�":
			crolling.area += ",N0300090";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BB%F6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			crolling.area += ",N0300100";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%B1%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",N0300110";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȫ��":
			crolling.area += ",N0300120";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%AD%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȫ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0300125";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%BA%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			crolling.area += ",N0300130";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			crolling.area += ",N0300140";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BD%C5%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ���":
			crolling.area += ",N0300146";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BE%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0300150";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",N0300160";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0300170";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",N0300180";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%A4%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߹���":
			crolling.area += ",N0300190";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߹���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",N0300200";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			crolling.area += ",N0300210";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C3%B5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0300220";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C5%E4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǥ����":
			crolling.area += ",N0300225";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%A5%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			crolling.area += ",N0300230";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			crolling.area += ",N0300240";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			crolling.area += ",N0300250";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C7%CF%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�ٵ�":
			crolling.area += ",N0300260";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%A3%B1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",N0300270";
			wewe.area += "064%7C%7C%BC%AD%B1%CD%C6%F7%BD%C3%7C%7C%C8%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ե�":
			crolling.area += ",N0400010";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B0%C7%C0%D4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���Ե�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0400015";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B1%B8%C1%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0400020";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%BB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0400030";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B3%EB%C7%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0400040";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",N0400070";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",N0400050";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",N0400060";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B5%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",N0400080";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",N0400090";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%B7%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0400110";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%B5%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",N0400120";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BA%C0%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵵ1��":
			crolling.area += ",N0400130";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵵ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�︶2��":
			crolling.area += ",N0400140";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�︶2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",N0400190";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",N0400160";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",N0400170";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",N0400180";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BB%EF%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƶ�":
			crolling.area += ",N0400220";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƶ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƶ�1��":
			crolling.area += ",N0400200";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƶ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƶ�2��":
			crolling.area += ",N0400210";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%C6%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƶ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ���":
			crolling.area += ",N0400225";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BE%D6%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0400230";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0400240";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%B5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",N0400250";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",N0400290";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",N0400260";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",N0400270";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",N0400280";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%C0%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ���":
			crolling.area += ",N0400320";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ�1��":
			crolling.area += ",N0400300";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ�2��":
			crolling.area += ",N0400310";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%DC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			crolling.area += ",N0400330";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",N0400340";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",N0400350";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",N0400360";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EB%B4%E33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�쵵��":
			crolling.area += ",N0400375";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%EC%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�쵵��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽÿ���":
			crolling.area += ",N0400380";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�1��":
			crolling.area += ",N0400390";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�2��":
			crolling.area += ",N0400400";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",N0400440";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ1��":
			crolling.area += ",N0400420";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ2��":
			crolling.area += ",N0400430";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CC%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�1��":
			crolling.area += ",N0400450";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�2��":
			crolling.area += ",N0400460";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C0%CF%B5%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",N0400475";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C1%B6%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڸ�":
			crolling.area += ",N0400473";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C3%DF%C0%DA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ڸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ��":
			crolling.area += ",N0400476";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѹ���":
			crolling.area += ",N0400477";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D1%B8%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ѹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�":
			crolling.area += ",N0400480";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϵ�":
			crolling.area += ",N0400510";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			crolling.area += ",N0400490";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			crolling.area += ",N0400500";
			wewe.area += "064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸõ��":
			crolling.area += ",N0400520";
			wewe.area += "C064%7C%7C%C1%A6%C1%D6%BD%C3%7C%7C%C8%B8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}