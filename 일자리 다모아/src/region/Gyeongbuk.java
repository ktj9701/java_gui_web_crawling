package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Gyeongbuk {
	public boolean flag;

	public void GyeongbukCity(ActionEvent e) {
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
		// ���
		// ����
		case "������":
			Albamoncrolling.area += ",D0100010";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B0%A9%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",D0100020";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B0%E8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",D0100030";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%B2%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0100040";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0100050";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%B2%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0100060";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			Albamoncrolling.area += ",D0100070";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0100080";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B4%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0100090";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B4%EB%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0100100";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%B9%E9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			Albamoncrolling.area += ",D0100110";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0100120";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﳲ��":
			Albamoncrolling.area += ",D0100130";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%EF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﳲ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",D0100140";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%EF%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			Albamoncrolling.area += ",D0100150";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%EF%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			Albamoncrolling.area += ",D0100160";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BB%F3%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0100170";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BC%AD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű���":
			Albamoncrolling.area += ",D0100180";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BD%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0100190";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�з���":
			Albamoncrolling.area += ",D0100200";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BE%D0%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�з���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0100210";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%A9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0100220";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%C1%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",D0100230";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",D0100240";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%CD%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			Albamoncrolling.area += ",D0100250";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%BF%EB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0100260";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C0%AF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӵ絿":
			Albamoncrolling.area += ",D0100270";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C0%D3%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ӵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			Albamoncrolling.area += ",D0100280";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C0%DA%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",D0100290";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%A1%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0100300";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%A4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0100310";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%B6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߹浿":
			Albamoncrolling.area += ",D0100320";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%DF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߹浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߻굿":
			Albamoncrolling.area += ",D0100330";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0100340";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C1%F8%B7%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",D0100350";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C6%F2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼ���":
			Albamoncrolling.area += ",D0100360";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%BB%EA%BD%C3%7C%7C%C7%CF%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���ֽ�
		case "������":
			Albamoncrolling.area += ",D0200010";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B0%A8%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200020";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B0%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0200030";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B0%C7%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200040";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%A4%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200050";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200060";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			Albamoncrolling.area += ",D0200070";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B1%B8%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",D0200080";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200090";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%BB%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿��":
			Albamoncrolling.area += ",D0200100";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%EB%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼭��":
			Albamoncrolling.area += ",D0200110";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B3%EB%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200120";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200130";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%B5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",D0200140";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%BF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",D0200150";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%BF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0200160";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200170";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�赿":
			Albamoncrolling.area += ",D0200180";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ݵ�":
			Albamoncrolling.area += ",D0200190";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%B9%E8%B9%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200200";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BA%B8%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���":
			Albamoncrolling.area += ",D0200210";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BA%CF%B1%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻε�":
			Albamoncrolling.area += ",D0200220";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BA%CF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽû�����":
			Albamoncrolling.area += ",D0200230";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽû�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�곻��":
			Albamoncrolling.area += ",D0200240";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�곻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200250";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",D0200260";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AD%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",D0200270";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AD%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",D0200280";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%AE%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",D0200290";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%BA%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200300";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%BA%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�հ":
			Albamoncrolling.area += ",D0200310";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BC%D5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�հ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�õ�":
			Albamoncrolling.area += ",D0200320";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BD%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�÷���":
			Albamoncrolling.area += ",D0200330";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BD%C3%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�÷���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200340";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȱ���":
			Albamoncrolling.area += ",D0200350";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%C8%B0%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ȱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ":
			Albamoncrolling.area += ",D0200360";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%CF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�糲��":
			Albamoncrolling.area += ",D0200370";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%E7%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�糲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			Albamoncrolling.area += ",D0200380";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BE%E7%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ���":
			Albamoncrolling.area += ",D0200390";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BF%DC%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			Albamoncrolling.area += ",D0200400";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0200410";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�οյ�":
			Albamoncrolling.area += ",D0200420";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C0%CE%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�οյ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",D0200430";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0200440";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C1%F8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			Albamoncrolling.area += ",D0200450";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C3%B5%B1%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�ϸ�":
			Albamoncrolling.area += ",D0200460";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C3%B5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("õ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			Albamoncrolling.area += ",D0200470";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C3%E6%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž��":
			Albamoncrolling.area += ",D0200480";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",D0200490";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			Albamoncrolling.area += ",D0200500";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0200510";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C7%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",D0200520";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",D0200530";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",D0200540";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�뵿":
			Albamoncrolling.area += ",D0200550";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%B2%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ����":
			Albamoncrolling.area += ",D0200560";
			AlbaHeavencrolling.area += "054%7C%7C%B0%E6%C1%D6%BD%C3%7C%7C%C8%BF%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��ɱ�
		case "������":
			Albamoncrolling.area += ",D0300010";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%B0%B3%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ��":
			Albamoncrolling.area += ",D0300030";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%B4%D9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밡����":
			Albamoncrolling.area += ",D0300020";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�밡����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0300040";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%B4%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0300050";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ָ���":
			Albamoncrolling.area += ",D0300060";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BD%D6%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ָ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0300070";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BF%EC%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0300080";
			AlbaHeavencrolling.area += "054%7C%7C%B0%ED%B7%C9%B1%BA%7C%7C%BF%EE%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���̽�
		case "���ǵ�":
			Albamoncrolling.area += ",D0400010";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%C5%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0400020";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%ED%BE%C6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			Albamoncrolling.area += ",D0400050";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%F8%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",D0400030";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%F8%B4%DC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",D0400040";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B0%F8%B4%DC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0400060";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%A4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0400070";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%B8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400080";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400090";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B1%DD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			Albamoncrolling.area += ",D0400100";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B3%B2%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400110";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B5%B5%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400140";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B5%B5%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400150";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%B9%AB%C0%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0400160";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			Albamoncrolling.area += ",D0400170";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",D0400180";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",D0400190";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BB%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�굿��":
			Albamoncrolling.area += ",D0400200";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BB%EA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�굿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0400210";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BB%F3%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",D0400220";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%B1%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400230";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%B1%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400240";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400250";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BC%F6%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ù̵�":
			Albamoncrolling.area += ",D0400260";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C3%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ù̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			Albamoncrolling.area += ",D0400270";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̽ý���":
			Albamoncrolling.area += ",D0400300";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̽ý���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",D0400280";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",D0400290";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BD%C5%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",D0400310";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BE%E7%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���µ�":
			Albamoncrolling.area += ",D0400320";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%C0%C5%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",D0400330";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%C1%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400340";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%C1%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0400370";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",D0400350";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%F8%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",D0400360";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%BF%F8%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",D0400380";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӽ���":
			Albamoncrolling.area += ",D0400390";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%D3%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ӽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0400400";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%D3%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0400410";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C0%E5%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",D0400420";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0400430";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C1%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0400440";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%D8%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0400470";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%FC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",D0400450";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%FC%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",D0400460";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C7%FC%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ��":
			Albamoncrolling.area += ",D0400480";
			AlbaHeavencrolling.area += "054%7C%7C%B1%B8%B9%CC%BD%C3%7C%7C%C8%B2%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ������
		case "��θ�":
			Albamoncrolling.area += ",D0500010";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%B0%ED%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0500020";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%B1%BA%C0%A7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ��":
			Albamoncrolling.area += ",D0500030";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BA%CE%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼺��":
			Albamoncrolling.area += ",D0500040";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BB%EA%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Һ���":
			Albamoncrolling.area += ",D0500050";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BC%D2%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Һ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�캸��":
			Albamoncrolling.area += ",D0500060";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%BF%EC%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�캸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0500070";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%C0%C7%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ɸ�":
			Albamoncrolling.area += ",D0500080";
			AlbaHeavencrolling.area += "054%7C%7C%B1%BA%C0%A7%B1%BA%7C%7C%C8%BF%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��õ��
		case "������":
			Albamoncrolling.area += ",D0600010";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%A8%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0600020";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%A8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",D0600030";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%A8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ɸ�":
			Albamoncrolling.area += ",D0600040";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B0%B3%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ñ���":
			Albamoncrolling.area += ",D0600050";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0600060";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B1%B8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0600080";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ó��굿":
			Albamoncrolling.area += ",D0600090";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ó��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ҹ�":
			Albamoncrolling.area += ",D0600100";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B3%F3%BC%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ҹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ټ���":
			Albamoncrolling.area += ",D0600110";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%D9%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ټ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱤��":
			Albamoncrolling.area += ",D0600120";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%EB%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뱤��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0600130";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			Albamoncrolling.area += ",D0600140";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%EB%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0600150";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B4%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",D0600160";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B8%F0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",D0600170";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B9%AE%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0600180";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%B9%E9%BF%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0600190";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�úΰ":
			Albamoncrolling.area += ",D0600200";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�úΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			Albamoncrolling.area += ",D0600210";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BA%CE%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0600220";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BB%EF%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0600230";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0600240";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BD%C5%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0600250";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BE%C6%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0600260";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BE%E7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0600270";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BE%EE%B8%F0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			Albamoncrolling.area += ",D0600280";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0600370";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C0%B2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0600300";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C0%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0600310";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%B6%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0600320";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%F5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			Albamoncrolling.area += ",D0600330";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%F6%B7%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���µ�":
			Albamoncrolling.area += ",D0600340";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C1%F6%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",D0600350";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�ݵ�":
			Albamoncrolling.area += ",D0600360";
			AlbaHeavencrolling.area += "054%7C%7C%B1%E8%C3%B5%BD%C3%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �����
		case "������":
			Albamoncrolling.area += ",D0700010";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B0%A1%C0%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0700020";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			Albamoncrolling.area += ",D0700030";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B3%F3%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			Albamoncrolling.area += ",D0700040";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B5%BF%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700050";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B8%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700060";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B8%F0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700070";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%B9%AE%B0%E6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700080";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BA%D2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			Albamoncrolling.area += ",D0700090";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BB%EA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0700100";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BB%EA%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			Albamoncrolling.area += ",D0700110";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700120";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BF%B5%BC%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			Albamoncrolling.area += ",D0700130";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BF%B5%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700140";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%BF%EC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",D0700150";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C0%AF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0700160";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C0%B1%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������̵�":
			Albamoncrolling.area += ",D0700170";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C1%A1%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��":
			Albamoncrolling.area += ",D0700180";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ���":
			Albamoncrolling.area += ",D0700190";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C8%A3%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0700200";
			AlbaHeavencrolling.area += "054%7C%7C%B9%AE%B0%E6%BD%C3%7C%7C%C8%EF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��ȭ��
		case "��ȣ��":
			Albamoncrolling.area += ",D0800010";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%B8%ED%C8%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߸�":
			Albamoncrolling.area += ",D0800020";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%B9%B0%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0800030";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%B9%FD%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0800040";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BA%C0%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",D0800050";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BA%C0%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0800060";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BB%F3%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0800070";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BC%AE%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0800080";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%BC%D2%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0800090";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%C0%E7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0800100";
			AlbaHeavencrolling.area += "054%7C%7C%BA%C0%C8%AD%B1%BA%7C%7C%C3%E1%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���ֽ�
		case "���嵿":
			Albamoncrolling.area += ",D0900010";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%A1%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0900020";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ���":
			Albamoncrolling.area += ",D0900030";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%C5%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",D0900040";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%E8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���˸�":
			Albamoncrolling.area += ",D0900050";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%F8%B0%CB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���˸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900060";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B0%F8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900070";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%AB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0900080";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%AB%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",D0900090";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900100";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",D0900110";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%B2%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900120";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%B2%C0%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900130";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%BB%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ø���":
			Albamoncrolling.area += ",D0900140";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B3%C3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ø���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900150";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",D0900160";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B8%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�𵿸�":
			Albamoncrolling.area += ",D0900170";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B8%F0%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�𵿸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�𼭸�":
			Albamoncrolling.area += ",D0900180";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B8%F0%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�𼭸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",D0900190";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%B9%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900200";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BA%B4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",D0900210";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BA%B9%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���":
			Albamoncrolling.area += ",D0900220";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BA%CE%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ο���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",D0900230";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BB%E7%B9%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",D0900240";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900250";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900260";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%AD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽü�����":
			Albamoncrolling.area += ",D0900270";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%BA%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",D0900280";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BC%BA%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			Albamoncrolling.area += ",D0900290";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",D0900300";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BE%E7%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900310";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%AC%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			Albamoncrolling.area += ",D0900320";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%C0%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܳ���":
			Albamoncrolling.area += ",D0900330";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%DC%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܴ䵿":
			Albamoncrolling.area += ",D0900340";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%DC%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܴ䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܼ���":
			Albamoncrolling.area += ",D0900350";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%BF%DC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			Albamoncrolling.area += ",D0900360";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%BA%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̾ȸ�":
			Albamoncrolling.area += ",D0900370";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%CC%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̾ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�κ���":
			Albamoncrolling.area += ",D0900380";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%CE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�κ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",D0900390";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C0%CE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",D0900400";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߴ���":
			Albamoncrolling.area += ",D0900410";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%DF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			Albamoncrolling.area += ",D0900420";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%DF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",D0900430";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C1%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",D0900440";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C3%BB%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʻ굿":
			Albamoncrolling.area += ",D0900450";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C3%CA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",D0900460";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C7%D4%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",D0900470";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C7%E5%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",D0900480";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",D0900490";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",D0900500";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϸ�":
			Albamoncrolling.area += ",D0900510";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�굿":
			Albamoncrolling.area += ",D0900520";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",D0900530";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%AD%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰢ��":
			Albamoncrolling.area += ",D0900540";
			AlbaHeavencrolling.area += "054%7C%7C%BB%F3%C1%D6%BD%C3%7C%7C%C8%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰢ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
