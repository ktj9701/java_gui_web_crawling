package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Daejeon_AND_Sejong {
	public boolean flag;

	public void Daejeon_AND_SejongCity(ActionEvent e) {
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
		case "������":
			crolling.area += ",G0100010";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B0%A5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",G0100020";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B4%EB%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0100030";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B4%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",G0100040";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B8%F1%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0100050";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B9%AE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",G0100060";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B9%CC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0100090";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B9%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",G0100070";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B9%FD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",G0100080";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%B9%FD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ���":
			crolling.area += ",G0100100";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BA%CE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�μ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�񷡵�":
			crolling.area += ",G0100110";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BA%F1%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�񷡵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0100120";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BB%EF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭵�":
			crolling.area += ",G0100130";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BB%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󼭵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0100140";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BC%AE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0100150";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ뵿":
			crolling.area += ",G0100160";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0100170";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BD%C5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź����":
			crolling.area += ",G0100180";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BD%C5%C5%BA%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",G0100190";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BF%AC%C3%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0100200";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BF%C0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�͵�":
			crolling.area += ",G0100210";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BF%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",G0100220";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%BF%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0100230";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0100240";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%C0%CC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿":
			crolling.area += ",G0100250";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			crolling.area += ",G0100260";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0100270";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳȣ��":
			crolling.area += ",G0100280";
			wewe.area = "042%7C%7C%B4%EB%B4%F6%B1%B8%7C%7C%C8%B2%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",G0200030";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B0%A1%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",G0200010";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B0%A1%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",G0200020";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B0%A1%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0200040";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B0%A1%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0200050";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B1%B8%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0200060";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B3%B6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ž��":
			crolling.area += ",G0200070";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			crolling.area += ",G0200100";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺰��":
			crolling.area += ",G0200110";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%BA%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뺰��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			crolling.area += ",G0200120";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",G0200130";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%B8%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",G0200140";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BA%F1%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�缺��":
			crolling.area += ",G0200150";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BB%E7%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�缺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﱫ��":
			crolling.area += ",G0200160";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BB%EF%B1%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﱫ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��":
			crolling.area += ",G0200190";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BB%EF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������������":
			crolling.area += ",G0200200";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BB%EF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ҵ�":
			crolling.area += ",G0200210";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BB%F3%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0200240";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",G0200250";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BC%BC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0200260";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BC%D2%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",G0200270";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BC%D2%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż�":
			crolling.area += ",G0200280";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ż�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žȵ�":
			crolling.area += ",G0200290";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�žȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0200300";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0200310";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",G0200320";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0200330";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			crolling.area += ",G0200340";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",G0200350";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0200360";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0200370";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻絿":
			crolling.area += ",G0200380";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C0%CC%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̻絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε�":
			crolling.area += ",G0200390";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ絿":
			crolling.area += ",G0200400";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C0%DA%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ھ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			crolling.area += ",G0200410";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C0%E5%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0200420";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֻ굿":
			crolling.area += ",G0200430";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C1%D6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0200440";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C1%D6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",G0200450";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0200460";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ��":
			crolling.area += ",G0200470";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",G0200480";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C3%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǿϵ�":
			crolling.area += ",G0200510";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C6%C7%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ǿϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǿ�1��":
			crolling.area += ",G0200490";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C6%C7%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ǿ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǿ�2��":
			crolling.area += ",G0200500";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C6%C7%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ǿ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼҵ�":
			crolling.area += ",G0200520";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C7%CF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϼҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",G0200530";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C8%AB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��":
			crolling.area += ",G0200540";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��":
			crolling.area += ",G0200550";
			wewe.area = "042%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",G0300010";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%BC%F6%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",G0300020";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300050";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%A5%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",G0300030";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%A5%B8%B61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",G0300040";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%A5%B8%B62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300080";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%FC%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",G0300060";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%FC%C0%FA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",G0300070";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B0%FC%C0%FA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",G0300090";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B1%AB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300100";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B1%AB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0300110";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300140";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%B5%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",G0300120";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%B5%B8%B61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",G0300130";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%B5%B8%B62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			crolling.area += ",G0300150";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%B5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л굿":
			crolling.area += ",G0300180";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%D0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л�1��":
			crolling.area += ",G0300160";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%D0%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л�2��":
			crolling.area += ",G0300170";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%D0%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л�3��":
			crolling.area += ",G0300250";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B5%D0%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			crolling.area += ",G0300190";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B8%B8%B3%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų뵿":
			crolling.area += ",G0300200";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%B8%C5%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0300210";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300220";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BA%B9%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",G0300230";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300240";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BB%EA%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������������":
			crolling.area += ",G0300260";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�빮��":
			crolling.area += ",G0300270";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%EB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�빮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0300280";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%EB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",G0300290";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%EC%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300300";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",G0300310";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%F9%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",G0300320";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%F9%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",G0300330";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%F9%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0300340";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%BF%F9%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",G0300350";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0300360";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%C1%A4%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź�浿":
			crolling.area += ",G0300370";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%C5%BA%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ź�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����������̵�":
			crolling.area += ",G0300380";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����������̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漮��":
			crolling.area += ",G0300390";
			wewe.area = "042%7C%7C%BC%AD%B1%B8%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400010";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B0%A1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0400020";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B0%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",G0400030";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0400040";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B0%FC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0400050";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%B3%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",G0400060";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%B8%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400070";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%B8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0400080";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�õ�":
			crolling.area += ",G0400090";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ�":
			crolling.area += ",G0400100";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%DD%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",G0400110";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B1%DD%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400120";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B3%EB%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����������뵿":
			crolling.area += ",G0400130";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����������뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400140";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B4%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0400150";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B4%F6%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400160";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B4%F6%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",G0400170";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B5%B5%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�а":
			crolling.area += ",G0400180";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B5%D0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�а");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400190";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B9%AE%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",G0400200";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B9%DD%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�浿":
			crolling.area += ",G0400210";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400220";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%B9%E6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			crolling.area += ",G0400230";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BA%B9%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0400240";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BA%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",G0400250";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",G0400260";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BB%F3%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0400270";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0400280";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BC%BC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۰���":
			crolling.area += ",G0400290";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BC%DB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۰���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400300";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400310";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BC%F6%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",G0400320";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			crolling.area += ",G0400330";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",G0400340";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BD%C5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ굿":
			crolling.area += ",G0400350";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BE%C8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400360";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BE%EE%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܻﵿ":
			crolling.area += ",G0400370";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BF%DC%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܻﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������������赿":
			crolling.area += ",G0400380";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������������赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",G0400390";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400400";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BF%F8%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ﵿ":
			crolling.area += ",G0400410";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BF%F8%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0400420";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%BF%F8%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڿ":
			crolling.area += ",G0400430";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C0%DA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",G0400440";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C0%E5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����������嵿":
			crolling.area += ",G0400450";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����������嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",G0400460";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C0%FC%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�":
			crolling.area += ",G0400470";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0400480";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C1%F6%C1%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸�":
			crolling.area += ",G0400490";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C3%DF%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž����":
			crolling.area += ",G0400500";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C5%BE%B8%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ⵿":
			crolling.area += ",G0400510";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C7%CF%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0400520";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C7%D0%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϵ�":
			crolling.area += ",G0400530";
			wewe.area = "042%7C%7C%C0%AF%BC%BA%B1%B8%7C%7C%C8%AD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",G0500010";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B1%B8%BF%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݵ�":
			crolling.area += ",G0500020";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",G0500030";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",G0500040";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��޵�":
			crolling.area += ",G0500050";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B8%F1%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",G0500060";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0500070";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",G0500080";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",G0500110";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ1��":
			crolling.area += ",G0500090";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ2��":
			crolling.area += ",G0500100";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ絿":
			crolling.area += ",G0500120";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0500130";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼺��":
			crolling.area += ",G0500140";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0500150";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BC%AE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",G0500160";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BC%B1%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȿ���":
			crolling.area += ",G0500170";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BE%C8%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",G0500180";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BE%EE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0500190";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",G0500200";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BF%C1%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			crolling.area += ",G0500210";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",G0500240";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			crolling.area += ",G0500220";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			crolling.area += ",G0500230";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",G0500250";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C0%BA%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",G0500260";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C1%A4%BB%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",G0500270";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ�굿":
			crolling.area += ",G0500280";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C4%A7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",G0500310";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",G0500290";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",G0500300";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��":
			crolling.area += ",G0500320";
			wewe.area = "042%7C%7C%C1%DF%B1%B8%7C%7C%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100110";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B0%A1%B6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",10100120";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B0%ED%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���":
			crolling.area += ",10100010";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B1%DD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100130";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B3%AA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100140";
			wewe.area = "C044%7C%7C%C0%FC%C3%BC%7C%7C%B4%D9%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",10100150";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B4%EB%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���㵿":
			crolling.area += ",10100160";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B5%B5%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			crolling.area += ",10100170";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%B9%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100180";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BA%B8%B6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ���":
			crolling.area += ",10100090";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BA%CE%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҵ�":
			crolling.area += ",10100190";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BB%F5%B7%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҵ㵿":
			crolling.area += ",10100200";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BC%D2%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ҵ㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100050";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BC%D2%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ƹ���":
			crolling.area += ",10100210";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BE%C6%B8%A7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ƹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100220";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BE%EE%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",10100020";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BF%AC%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100030";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BF%AC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100040";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%BF%AC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屺��":
			crolling.area += ",10100100";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%C0%E5%B1%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�屺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",10100060";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%C0%FC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			crolling.area += ",10100070";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%C0%FC%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ����":
			crolling.area += ",10100080";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%C1%B6%C4%A1%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ġ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",10100230";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%C1%BE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѽֵ�":
			crolling.area += ",10100240";
			wewe.area = "044%7C%7C%C0%FC%C3%BC%7C%7C%C7%D1%BC%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ѽֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
