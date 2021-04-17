package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Gyeongbuk {
	public boolean flag;

	public void GyeongbukCity(ActionEvent e) {
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
		//���
				//����
				case "������":
					crolling.area += ",D0100010";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��絿":
					crolling.area += ",D0100020";
					Mainpage.Filtering[Mainpage.index].setText("��絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���浿":
					crolling.area += ",D0100030";
					Mainpage.Filtering[Mainpage.index].setText("���浿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0100040";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0100050";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0100060";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�뵿":
					crolling.area += ",D0100070";
					Mainpage.Filtering[Mainpage.index].setText("�뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0100080";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0100090";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0100100";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�絿":
					crolling.area += ",D0100110";
					Mainpage.Filtering[Mainpage.index].setText("�絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0100120";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ﳲ��":
					crolling.area += ",D0100130";
					Mainpage.Filtering[Mainpage.index].setText("�ﳲ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ϵ�":
					crolling.area += ",D0100140";
					Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ǳ��":
					crolling.area += ",D0100150";
					Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��浿":
					crolling.area += ",D0100160";
					Mainpage.Filtering[Mainpage.index].setText("��浿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0100170";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ű���":
					crolling.area += ",D0100180";
					Mainpage.Filtering[Mainpage.index].setText("�ű���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0100190";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�з���":
					crolling.area += ",D0100200";
					Mainpage.Filtering[Mainpage.index].setText("�з���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0100210";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0100220";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",D0100230";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̸�":
					crolling.area += ",D0100240";
					Mainpage.Filtering[Mainpage.index].setText("���̸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�뼺��":
					crolling.area += ",D0100250";
					Mainpage.Filtering[Mainpage.index].setText("�뼺��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0100260";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ӵ絿":
					crolling.area += ",D0100270";
					Mainpage.Filtering[Mainpage.index].setText("�Ӵ絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���θ�":
					crolling.area += ",D0100280";
					Mainpage.Filtering[Mainpage.index].setText("���θ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̵�":
					crolling.area += ",D0100290";
					Mainpage.Filtering[Mainpage.index].setText("���̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0100300";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0100310";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�߹浿":
					crolling.area += ",D0100320";
					Mainpage.Filtering[Mainpage.index].setText("�߹浿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�߻굿":
					crolling.area += ",D0100330";
					Mainpage.Filtering[Mainpage.index].setText("�߻굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0100340";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��굿":
					crolling.area += ",D0100350";
					Mainpage.Filtering[Mainpage.index].setText("��굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ͼ���":
					crolling.area += ",D0100360";
					Mainpage.Filtering[Mainpage.index].setText("�Ͼ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//���ֽ�
				case "������":
					crolling.area += ",D0200010";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200020";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0200030";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200040";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200050";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200060";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��Ȳ��":
					crolling.area += ",D0200070";
					Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",D0200080";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200090";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�뵿��":
					crolling.area += ",D0200100";
					Mainpage.Filtering[Mainpage.index].setText("�뵿��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�뼭��":
					crolling.area += ",D0200110";
					Mainpage.Filtering[Mainpage.index].setText("�뼭��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200120";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200130";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���浿":
					crolling.area += ",D0200140";
					Mainpage.Filtering[Mainpage.index].setText("���浿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�":
					crolling.area += ",D0200150";
					Mainpage.Filtering[Mainpage.index].setText("���ε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0200160";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200170";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�赿":
					crolling.area += ",D0200180";
					Mainpage.Filtering[Mainpage.index].setText("�赿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ݵ�":
					crolling.area += ",D0200190";
					Mainpage.Filtering[Mainpage.index].setText("��ݵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200200";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϱ���":
					crolling.area += ",D0200210";
					Mainpage.Filtering[Mainpage.index].setText("�ϱ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ϻε�":
					crolling.area += ",D0200220";
					Mainpage.Filtering[Mainpage.index].setText("�Ϻε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ֽû�����":
					crolling.area += ",D0200230";
					Mainpage.Filtering[Mainpage.index].setText("���ֽû�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�곻��":
					crolling.area += ",D0200240";
					Mainpage.Filtering[Mainpage.index].setText("�곻��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200250";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�":
					crolling.area += ",D0200260";
					Mainpage.Filtering[Mainpage.index].setText("���ε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ǵ�":
					crolling.area += ",D0200270";
					Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���嵿":
					crolling.area += ",D0200280";
					Mainpage.Filtering[Mainpage.index].setText("���嵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ǵ�":
					crolling.area += ",D0200290";
					Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200300";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�հ":
					crolling.area += ",D0200310";
					Mainpage.Filtering[Mainpage.index].setText("�հ");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�õ�":
					crolling.area += ",D0200320";
					Mainpage.Filtering[Mainpage.index].setText("�õ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�÷���":
					crolling.area += ",D0200330";
					Mainpage.Filtering[Mainpage.index].setText("�÷���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200340";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ȱ���":
					crolling.area += ",D0200350";
					Mainpage.Filtering[Mainpage.index].setText("�Ȱ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϰ":
					crolling.area += ",D0200360";
					Mainpage.Filtering[Mainpage.index].setText("�ϰ");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�糲��":
					crolling.area += ",D0200370";
					Mainpage.Filtering[Mainpage.index].setText("�糲��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ϸ�":
					crolling.area += ",D0200380";
					Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ܵ���":
					crolling.area += ",D0200390";
					Mainpage.Filtering[Mainpage.index].setText("�ܵ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�밭��":
					crolling.area += ",D0200400";
					Mainpage.Filtering[Mainpage.index].setText("�밭��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0200410";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�οյ�":
					crolling.area += ",D0200420";
					Mainpage.Filtering[Mainpage.index].setText("�οյ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���絿":
					crolling.area += ",D0200430";
					Mainpage.Filtering[Mainpage.index].setText("���絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0200440";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "õ����":
					crolling.area += ",D0200450";
					Mainpage.Filtering[Mainpage.index].setText("õ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "õ�ϸ�":
					crolling.area += ",D0200460";
					Mainpage.Filtering[Mainpage.index].setText("õ�ϸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȿ��":
					crolling.area += ",D0200470";
					Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ž��":
					crolling.area += ",D0200480";
					Mainpage.Filtering[Mainpage.index].setText("ž��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��":
					crolling.area += ",D0200490";
					Mainpage.Filtering[Mainpage.index].setText("��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϵ�":
					crolling.area += ",D0200500";
					Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0200510";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ����":
					crolling.area += ",D0200520";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ����":
					crolling.area += ",D0200530";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ����":
					crolling.area += ",D0200540";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ�뵿":
					crolling.area += ",D0200550";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ�뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȿ����":
					crolling.area += ",D0200560";
					Mainpage.Filtering[Mainpage.index].setText("ȿ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//��ɱ�
				case "������":
					crolling.area += ",D0300010";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ٻ��":
					crolling.area += ",D0300030";
					Mainpage.Filtering[Mainpage.index].setText("�ٻ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�밡����":
					crolling.area += ",D0300020";
					Mainpage.Filtering[Mainpage.index].setText("�밡����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0300040";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0300050";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ָ���":
					crolling.area += ",D0300060";
					Mainpage.Filtering[Mainpage.index].setText("�ָ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0300070";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0300080";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//���̽�
				case "���ǵ�":
					crolling.area += ",D0400010";
					Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0400020";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ܵ�":
					crolling.area += ",D0400050";
					Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",D0400030";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",D0400040";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0400060";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0400070";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400080";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400090";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���뵿":
					crolling.area += ",D0400100";
					Mainpage.Filtering[Mainpage.index].setText("���뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400110";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400140";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400150";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0400160";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ΰ":
					crolling.area += ",D0400170";
					Mainpage.Filtering[Mainpage.index].setText("�ΰ");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��굿":
					crolling.area += ",D0400180";
					Mainpage.Filtering[Mainpage.index].setText("��굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��":
					crolling.area += ",D0400190";
					Mainpage.Filtering[Mainpage.index].setText("��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�굿��":
					crolling.area += ",D0400200";
					Mainpage.Filtering[Mainpage.index].setText("�굿��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0400210";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���⵿":
					crolling.area += ",D0400220";
					Mainpage.Filtering[Mainpage.index].setText("���⵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400230";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400240";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400250";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ù̵�":
					crolling.area += ",D0400260";
					Mainpage.Filtering[Mainpage.index].setText("�ù̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ŵ�":
					crolling.area += ",D0400270";
					Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̽ý���":
					crolling.area += ",D0400300";
					Mainpage.Filtering[Mainpage.index].setText("���̽ý���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",D0400280";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",D0400290";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",D0400310";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���µ�":
					crolling.area += ",D0400320";
					Mainpage.Filtering[Mainpage.index].setText("���µ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���赿":
					crolling.area += ",D0400330";
					Mainpage.Filtering[Mainpage.index].setText("���赿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400340";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0400370";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",D0400350";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",D0400360";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ǵ�":
					crolling.area += ",D0400380";
					Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ӽ���":
					crolling.area += ",D0400390";
					Mainpage.Filtering[Mainpage.index].setText("�Ӽ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0400400";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0400410";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",D0400420";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0400430";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0400440";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0400470";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",D0400450";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",D0400460";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ��":
					crolling.area += ",D0400480";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//������
				case "��θ�":
					crolling.area += ",D0500010";
					Mainpage.Filtering[Mainpage.index].setText("��θ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0500020";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ΰ��":
					crolling.area += ",D0500030";
					Mainpage.Filtering[Mainpage.index].setText("�ΰ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�꼺��":
					crolling.area += ",D0500040";
					Mainpage.Filtering[Mainpage.index].setText("�꼺��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Һ���":
					crolling.area += ",D0500050";
					Mainpage.Filtering[Mainpage.index].setText("�Һ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�캸��":
					crolling.area += ",D0500060";
					Mainpage.Filtering[Mainpage.index].setText("�캸��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0500070";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȿ�ɸ�":
					crolling.area += ",D0500080";
					Mainpage.Filtering[Mainpage.index].setText("ȿ�ɸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//��õ��
				case "������":
					crolling.area += ",D0600010";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0600020";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",D0600030";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ɸ�":
					crolling.area += ",D0600040";
					Mainpage.Filtering[Mainpage.index].setText("���ɸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ�ñ���":
					crolling.area += ",D0600050";
					Mainpage.Filtering[Mainpage.index].setText("��õ�ñ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0600060";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0600080";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ�ó��굿":
					crolling.area += ",D0600090";
					Mainpage.Filtering[Mainpage.index].setText("��õ�ó��굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��Ҹ�":
					crolling.area += ",D0600100";
					Mainpage.Filtering[Mainpage.index].setText("��Ҹ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ټ���":
					crolling.area += ",D0600110";
					Mainpage.Filtering[Mainpage.index].setText("�ټ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�뱤��":
					crolling.area += ",D0600120";
					Mainpage.Filtering[Mainpage.index].setText("�뱤��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0600130";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���׸�":
					crolling.area += ",D0600140";
					Mainpage.Filtering[Mainpage.index].setText("���׸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0600150";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ϵ�":
					crolling.area += ",D0600160";
					Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���絿":
					crolling.area += ",D0600170";
					Mainpage.Filtering[Mainpage.index].setText("���絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0600180";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0600190";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ�úΰ":
					crolling.area += ",D0600200";
					Mainpage.Filtering[Mainpage.index].setText("��õ�úΰ");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���׸�":
					crolling.area += ",D0600210";
					Mainpage.Filtering[Mainpage.index].setText("���׸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0600220";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0600230";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0600240";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0600250";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0600260";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0600270";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ε�":
					crolling.area += ",D0600280";
					Mainpage.Filtering[Mainpage.index].setText("��ε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0600370";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0600300";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0600310";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0600320";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ʸ�":
					crolling.area += ",D0600330";
					Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���µ�":
					crolling.area += ",D0600340";
					Mainpage.Filtering[Mainpage.index].setText("���µ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȭ��":
					crolling.area += ",D0600350";
					Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ�ݵ�":
					crolling.area += ",D0600360";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//�����
				case "������":
					crolling.area += ",D0700010";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0700020";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ϸ�":
					crolling.area += ",D0700030";
					Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���θ�":
					crolling.area += ",D0700040";
					Mainpage.Filtering[Mainpage.index].setText("���θ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700050";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700060";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700070";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700080";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ϸ�":
					crolling.area += ",D0700090";
					Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0700100";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ű⵿":
					crolling.area += ",D0700110";
					Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700120";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ŵ�":
					crolling.area += ",D0700130";
					Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700140";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��������":
					crolling.area += ",D0700150";
					Mainpage.Filtering[Mainpage.index].setText("��������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0700160";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��������̵�":
					crolling.area += ",D0700170";
					Mainpage.Filtering[Mainpage.index].setText("��������̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "â��":
					crolling.area += ",D0700180";
					Mainpage.Filtering[Mainpage.index].setText("â��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȣ���":
					crolling.area += ",D0700190";
					Mainpage.Filtering[Mainpage.index].setText("ȣ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0700200";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//��ȭ��
				case "��ȣ��":
					crolling.area += ",D0800010";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���߸�":
					crolling.area += ",D0800020";
					Mainpage.Filtering[Mainpage.index].setText("���߸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0800030";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0800040";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȭ��":
					crolling.area += ",D0800050";
					Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0800060";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0800070";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0800080";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0800090";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0800100";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//���ֽ�
				case "���嵿":
					crolling.area += ",D0900010";
					Mainpage.Filtering[Mainpage.index].setText("���嵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0900020";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ŵ���":
					crolling.area += ",D0900030";
					Mainpage.Filtering[Mainpage.index].setText("�ŵ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��굿":
					crolling.area += ",D0900040";
					Mainpage.Filtering[Mainpage.index].setText("��굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���˸�":
					crolling.area += ",D0900050";
					Mainpage.Filtering[Mainpage.index].setText("���˸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900060";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900070";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0900080";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���絿":
					crolling.area += ",D0900090";
					Mainpage.Filtering[Mainpage.index].setText("���絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900100";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���嵿":
					crolling.area += ",D0900110";
					Mainpage.Filtering[Mainpage.index].setText("���嵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900120";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900130";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ø���":
					crolling.area += ",D0900140";
					Mainpage.Filtering[Mainpage.index].setText("�ø���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900150";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",D0900160";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�𵿸�":
					crolling.area += ",D0900170";
					Mainpage.Filtering[Mainpage.index].setText("�𵿸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�𼭸�":
					crolling.area += ",D0900180";
					Mainpage.Filtering[Mainpage.index].setText("�𼭸�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���絿":
					crolling.area += ",D0900190";
					Mainpage.Filtering[Mainpage.index].setText("���絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900200";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���浿":
					crolling.area += ",D0900210";
					Mainpage.Filtering[Mainpage.index].setText("���浿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ο���":
					crolling.area += ",D0900220";
					Mainpage.Filtering[Mainpage.index].setText("�ο���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",D0900230";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",D0900240";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900250";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900260";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ֽü�����":
					crolling.area += ",D0900270";
					Mainpage.Filtering[Mainpage.index].setText("���ֽü�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",D0900280";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ź���":
					crolling.area += ",D0900290";
					Mainpage.Filtering[Mainpage.index].setText("�ź���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̵�":
					crolling.area += ",D0900300";
					Mainpage.Filtering[Mainpage.index].setText("���̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900310";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���뵿":
					crolling.area += ",D0900320";
					Mainpage.Filtering[Mainpage.index].setText("���뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ܳ���":
					crolling.area += ",D0900330";
					Mainpage.Filtering[Mainpage.index].setText("�ܳ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ܴ䵿":
					crolling.area += ",D0900340";
					Mainpage.Filtering[Mainpage.index].setText("�ܴ䵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ܼ���":
					crolling.area += ",D0900350";
					Mainpage.Filtering[Mainpage.index].setText("�ܼ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ô��":
					crolling.area += ",D0900360";
					Mainpage.Filtering[Mainpage.index].setText("��ô��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�̾ȸ�":
					crolling.area += ",D0900370";
					Mainpage.Filtering[Mainpage.index].setText("�̾ȸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�κ���":
					crolling.area += ",D0900380";
					Mainpage.Filtering[Mainpage.index].setText("�κ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",D0900390";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",D0900400";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ߴ���":
					crolling.area += ",D0900410";
					Mainpage.Filtering[Mainpage.index].setText("�ߴ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ߵ���":
					crolling.area += ",D0900420";
					Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",D0900430";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "û����":
					crolling.area += ",D0900440";
					Mainpage.Filtering[Mainpage.index].setText("û����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ʻ굿":
					crolling.area += ",D0900450";
					Mainpage.Filtering[Mainpage.index].setText("�ʻ굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��â��":
					crolling.area += ",D0900460";
					Mainpage.Filtering[Mainpage.index].setText("��â��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ŵ�":
					crolling.area += ",D0900470";
					Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ����":
					crolling.area += ",D0900480";
					Mainpage.Filtering[Mainpage.index].setText("ȭ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ����":
					crolling.area += ",D0900490";
					Mainpage.Filtering[Mainpage.index].setText("ȭ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ����":
					crolling.area += ",D0900500";
					Mainpage.Filtering[Mainpage.index].setText("ȭ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ�ϸ�":
					crolling.area += ",D0900510";
					Mainpage.Filtering[Mainpage.index].setText("ȭ�ϸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ�굿":
					crolling.area += ",D0900520";
					Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ����":
					crolling.area += ",D0900530";
					Mainpage.Filtering[Mainpage.index].setText("ȭ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ﰢ��":
					crolling.area += ",D0900540";
					Mainpage.Filtering[Mainpage.index].setText("�ﰢ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;

		}
	}
}
