package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Deagu {
	public boolean flag;

	public void DeaguCity(ActionEvent e) {
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
		//�뱸
				//����
				case "���":
					crolling.area += ",F0100100";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���1��":
					crolling.area += ",F0100030";
					Mainpage.Filtering[Mainpage.index].setText("���1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���2��":
					crolling.area += ",F0100040";
					Mainpage.Filtering[Mainpage.index].setText("���2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���3��":
					crolling.area += ",F0100050";
					Mainpage.Filtering[Mainpage.index].setText("���3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���4��":
					crolling.area += ",F0100060";
					Mainpage.Filtering[Mainpage.index].setText("���4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���5��":
					crolling.area += ",F0100070";
					Mainpage.Filtering[Mainpage.index].setText("���5��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���6��":
					crolling.area += "F0100080";
					Mainpage.Filtering[Mainpage.index].setText("���6��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���9��":
					crolling.area += ",F0100090";
					Mainpage.Filtering[Mainpage.index].setText("���9��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���10��":
					crolling.area += ",F0100010";
					Mainpage.Filtering[Mainpage.index].setText("���10��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���11��":
					crolling.area += ",F0100020";
					Mainpage.Filtering[Mainpage.index].setText("���11��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0100140";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0100110";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0100120";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����3��":
					crolling.area += ",F0100130";
					Mainpage.Filtering[Mainpage.index].setText("����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0100150";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//�޼���
				case "���굿":
					crolling.area += ",F0200010";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ﵿ":
					crolling.area += ",F0200020";
					Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��":
					crolling.area += ",F0200030";
					Mainpage.Filtering[Mainpage.index].setText("��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0200040";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0200050";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�η���":
					crolling.area += ",F0200090";
					Mainpage.Filtering[Mainpage.index].setText("�η���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�η�1��":
					crolling.area += ",F0200060";
					Mainpage.Filtering[Mainpage.index].setText("�η�1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�η�2��":
					crolling.area += ",F0200070";
					Mainpage.Filtering[Mainpage.index].setText("�η�2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�η�3��":
					crolling.area += ",F0200080";
					Mainpage.Filtering[Mainpage.index].setText("�η�3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0200100";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0200110";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�":
					crolling.area += ",F0200150";
					Mainpage.Filtering[Mainpage.index].setText("���ε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0200120";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0200130";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����3��":
					crolling.area += ",F0200140";
					Mainpage.Filtering[Mainpage.index].setText("����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���絿":
					crolling.area += ",F0200180";
					Mainpage.Filtering[Mainpage.index].setText("���絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0200160";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0200170";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0200210";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0200190";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0200200";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ŵ絿":
					crolling.area += ",F0200220";
					Mainpage.Filtering[Mainpage.index].setText("�Ŵ絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��굿":
					crolling.area += ",F0200250";
					Mainpage.Filtering[Mainpage.index].setText("��굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���1��":
					crolling.area += ",F0200230";
					Mainpage.Filtering[Mainpage.index].setText("���1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���2��":
					crolling.area += ",F0200240";
					Mainpage.Filtering[Mainpage.index].setText("���2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0200280";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0200260";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0200270";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0200290";
					Mainpage.Filtering[Mainpage.index].setText("�췯�ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0200300";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�̰":
					crolling.area += ",F0200330";
					Mainpage.Filtering[Mainpage.index].setText("�̰");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�̰�1��":
					crolling.area += ",F0200310";
					Mainpage.Filtering[Mainpage.index].setText("�̰�1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�̰�2��":
					crolling.area += ",F0200320";
					Mainpage.Filtering[Mainpage.index].setText("�̰�2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��⵿":
					crolling.area += ",F0200340";
					Mainpage.Filtering[Mainpage.index].setText("��⵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�嵿":
					crolling.area += ",F0200350";
					Mainpage.Filtering[Mainpage.index].setText("�嵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0200360";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0200370";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",F0200380";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȣ����":
					crolling.area += ",F0200390";
					Mainpage.Filtering[Mainpage.index].setText("ȣ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȣ�굿":
					crolling.area += ",F0200400";
					Mainpage.Filtering[Mainpage.index].setText("ȣ�굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//�޼���
				case "��â��":
					crolling.area += ",F0300010";
					Mainpage.Filtering[Mainpage.index].setText("��â��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0300020";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0300030";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ٻ���":
					crolling.area += ",F0300040";
					Mainpage.Filtering[Mainpage.index].setText("�ٻ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0300050";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0300060";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ϻ��":
					crolling.area += ",F0300070";
					Mainpage.Filtering[Mainpage.index].setText("�Ϻ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ǳ��":
					crolling.area += ",F0300080";
					Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ����":
					crolling.area += ",F0300090";
					Mainpage.Filtering[Mainpage.index].setText("ȭ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//����
				case "���굿":
					crolling.area += ",F0400010";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�˻絿":
					crolling.area += ",F0400020";
					Mainpage.Filtering[Mainpage.index].setText("�˻絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0400030";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ݰ���":
					crolling.area += ",F0400040";
					Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",F0400050";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0400060";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ɼ���":
					crolling.area += ",F0400070";
					Mainpage.Filtering[Mainpage.index].setText("�ɼ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�븲��":
					crolling.area += ",F0400080";
					Mainpage.Filtering[Mainpage.index].setText("�븲��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",F0400090";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += "F0400100";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���е�":
					crolling.area += ",F0400110";
					Mainpage.Filtering[Mainpage.index].setText("���е�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0400120";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",F0400130";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�л굿":
					crolling.area += ",F0400140";
					Mainpage.Filtering[Mainpage.index].setText("�л굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ſ���":
					crolling.area += ",F0400150";
					Mainpage.Filtering[Mainpage.index].setText("�ſ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�̰":
					crolling.area += ",F0400160";
					Mainpage.Filtering[Mainpage.index].setText("�̰");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�̴뵿":
					crolling.area += ",F0400170";
					Mainpage.Filtering[Mainpage.index].setText("�̴뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̵�":
					crolling.area += ",F0400180";
					Mainpage.Filtering[Mainpage.index].setText("���̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȵ�":
					crolling.area += ",F0400190";
					Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0400200";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ε�":
					crolling.area += ",F0400210";
					Mainpage.Filtering[Mainpage.index].setText("�ε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ҷε�":
					crolling.area += ",F0400220";
					Mainpage.Filtering[Mainpage.index].setText("�ҷε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�纹��":
					crolling.area += ",F0400230";
					Mainpage.Filtering[Mainpage.index].setText("�纹��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ŵ�":
					crolling.area += ",F0400240";
					Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",F0400250";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0400260";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0400270";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ű⵿":
					crolling.area += ",F0400280";
					Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ź���":
					crolling.area += ",F0400290";
					Mainpage.Filtering[Mainpage.index].setText("�Ź���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ż���":
					crolling.area += ",F0400300";
					Mainpage.Filtering[Mainpage.index].setText("�ż���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�žϵ�":
					crolling.area += ",F0400360";
					Mainpage.Filtering[Mainpage.index].setText("�žϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ž�1��":
					crolling.area += ",F0400310";
					Mainpage.Filtering[Mainpage.index].setText("�ž�1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ž�2��":
					crolling.area += ",F0400320";
					Mainpage.Filtering[Mainpage.index].setText("�ž�2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ž�3��":
					crolling.area += ",F0400330";
					Mainpage.Filtering[Mainpage.index].setText("�ž�3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ž�4��":
					crolling.area += ",F0400340";
					Mainpage.Filtering[Mainpage.index].setText("�ž�4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ž�5��":
					crolling.area += ",F0400350";
					Mainpage.Filtering[Mainpage.index].setText("�ž�5��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ſ뵿":
					crolling.area += ",F0400370";
					Mainpage.Filtering[Mainpage.index].setText("�ſ뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0400410";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ1,2��":
					crolling.area += ",F0400380";
					Mainpage.Filtering[Mainpage.index].setText("��õ1,2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ3��":
					crolling.area += ",F0400390";
					Mainpage.Filtering[Mainpage.index].setText("��õ3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ4��":
					crolling.area += ",F0400400";
					Mainpage.Filtering[Mainpage.index].setText("��õ4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0400420";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��赿":
					crolling.area += ",F0400430";
					Mainpage.Filtering[Mainpage.index].setText("��赿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0400440";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0400450";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0400460";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Լ���":
					crolling.area += ",F0400470";
					Mainpage.Filtering[Mainpage.index].setText("�Լ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ߴ뵿":
					crolling.area += ",F0400480";
					Mainpage.Filtering[Mainpage.index].setText("�ߴ뵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0400490";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0400500";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�":
					crolling.area += ",F0400510";
					Mainpage.Filtering[Mainpage.index].setText("���ε�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�򱤵�":
					crolling.area += ",F0400520";
					Mainpage.Filtering[Mainpage.index].setText("�򱤵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȿ��":
					crolling.area += ",F0400550";
					Mainpage.Filtering[Mainpage.index].setText("ȿ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȿ��1��":
					crolling.area += ",F0400530";
					Mainpage.Filtering[Mainpage.index].setText("ȿ��1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȿ��2��":
					crolling.area += ",F0400540";
					Mainpage.Filtering[Mainpage.index].setText("ȿ��2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//�ϱ�
				case "�˴ܵ�":
					crolling.area += ",F0500010";
					Mainpage.Filtering[Mainpage.index].setText("�˴ܵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0500020";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0500030";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����3��":
					crolling.area += ",F0500040";
					Mainpage.Filtering[Mainpage.index].setText("����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500050";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0500060";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���쵿":
					crolling.area += ",F0500070";
					Mainpage.Filtering[Mainpage.index].setText("���쵿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",F0500080";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��":
					crolling.area += ",F0500090";
					Mainpage.Filtering[Mainpage.index].setText("��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����1��":
					crolling.area += ",F0500100";
					Mainpage.Filtering[Mainpage.index].setText("�����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����2��":
					crolling.area += ",F0500110";
					Mainpage.Filtering[Mainpage.index].setText("�����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����3��":
					crolling.area += ",F0500120";
					Mainpage.Filtering[Mainpage.index].setText("�����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500150";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0500130";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0500140";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500160";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500170";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0500180";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϱ���ȣ��":
					crolling.area += ",F0500190";
					Mainpage.Filtering[Mainpage.index].setText("�ϱ���ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��õ��":
					crolling.area += ",F0500200";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500230";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0500210";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0500220";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0500240";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ݵ�":
					crolling.area += ",F0500290";
					Mainpage.Filtering[Mainpage.index].setText("��ݵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���1��":
					crolling.area += ",F0500250";
					Mainpage.Filtering[Mainpage.index].setText("���1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���2��":
					crolling.area += ",F0500260";
					Mainpage.Filtering[Mainpage.index].setText("���2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���3��":
					crolling.area += ",F0500270";
					Mainpage.Filtering[Mainpage.index].setText("���3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���4��":
					crolling.area += ",F0500280";
					Mainpage.Filtering[Mainpage.index].setText("���4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500300";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���浿":
					crolling.area += ",F0500310";
					Mainpage.Filtering[Mainpage.index].setText("���浿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500320";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ߵ�":
					crolling.area += ",F0500330";
					Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ĥ����1��":
					crolling.area += ",F0500340";
					Mainpage.Filtering[Mainpage.index].setText("ĥ����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ĥ����2��":
					crolling.area += ",F0500350";
					Mainpage.Filtering[Mainpage.index].setText("ĥ����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ħ�굿":
					crolling.area += ",F0500390";
					Mainpage.Filtering[Mainpage.index].setText("ħ�굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ħ��1��":
					crolling.area += ",F0500360";
					Mainpage.Filtering[Mainpage.index].setText("ħ��1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ħ��2��":
					crolling.area += ",F0500370";
					Mainpage.Filtering[Mainpage.index].setText("ħ��2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ħ��3��":
					crolling.area += ",F0500380";
					Mainpage.Filtering[Mainpage.index].setText("ħ��3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500420";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0500400";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0500410";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ȴ޵�":
					crolling.area += ",F0500430";
					Mainpage.Filtering[Mainpage.index].setText("�ȴ޵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0500440";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;



				//����
				case "���絿":
					crolling.area += ",F0600040";
					Mainpage.Filtering[Mainpage.index].setText("���絿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0600010";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2,3��":
					crolling.area += ",F0600020";
					Mainpage.Filtering[Mainpage.index].setText("����2,3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����4��":
					crolling.area += ",F0600030";
					Mainpage.Filtering[Mainpage.index].setText("����4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��굿":
					crolling.area += ",F0600110";
					Mainpage.Filtering[Mainpage.index].setText("��굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���1��":
					crolling.area += ",F0600050";
					Mainpage.Filtering[Mainpage.index].setText("���1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���2/3��":
					crolling.area += ",F0600060";
					Mainpage.Filtering[Mainpage.index].setText("���2/3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���4��":
					crolling.area += ",F0600070";
					Mainpage.Filtering[Mainpage.index].setText("���4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���5��":
					crolling.area += ",F0600080";
					Mainpage.Filtering[Mainpage.index].setText("���5��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���6��":
					crolling.area += ",F0600090";
					Mainpage.Filtering[Mainpage.index].setText("���6��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���7��":
					crolling.area += ",F0600100";
					Mainpage.Filtering[Mainpage.index].setText("���7��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�󸮵�":
					crolling.area += ",F0600120";
					Mainpage.Filtering[Mainpage.index].setText("�󸮵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���뵿1��":
					crolling.area += ",F0600130";
					Mainpage.Filtering[Mainpage.index].setText("���뵿1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���뵿2��":
					crolling.area += ",F0600140";
					Mainpage.Filtering[Mainpage.index].setText("���뵿2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���뵿3��":
					crolling.area += ",F0600150";
					Mainpage.Filtering[Mainpage.index].setText("���뵿3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0600160";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�߸���":
					crolling.area += ",F0600170";
					Mainpage.Filtering[Mainpage.index].setText("�߸���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�򸮵�":
					crolling.area += ",F0600240";
					Mainpage.Filtering[Mainpage.index].setText("�򸮵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��1��":
					crolling.area += ",F0600180";
					Mainpage.Filtering[Mainpage.index].setText("��1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��2��":
					crolling.area += ",F0600190";
					Mainpage.Filtering[Mainpage.index].setText("��2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��3��":
					crolling.area += ",F0600200";
					Mainpage.Filtering[Mainpage.index].setText("��3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��4��":
					crolling.area += ",F0600210";
					Mainpage.Filtering[Mainpage.index].setText("��4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��5��":
					crolling.area += ",F0600220";
					Mainpage.Filtering[Mainpage.index].setText("��5��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��6��":
					crolling.area += ",F0600230";
					Mainpage.Filtering[Mainpage.index].setText("��6��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//������
				case "��õ��":
					crolling.area += ",F0700010";
					Mainpage.Filtering[Mainpage.index].setText("��õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",F0700020";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�뺯��":
					crolling.area += ",F0700030";
					Mainpage.Filtering[Mainpage.index].setText("�뺯��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ﵿ":
					crolling.area += ",F0700040";
					Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�λ굿":
					crolling.area += ",F0700050";
					Mainpage.Filtering[Mainpage.index].setText("�λ굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̵�":
					crolling.area += ",F0700090";
					Mainpage.Filtering[Mainpage.index].setText("���̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0700060";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0700070";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����3��":
					crolling.area += ",F0700080";
					Mainpage.Filtering[Mainpage.index].setText("����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",F0700100";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0700130";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0700110";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0700120";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���":
					crolling.area += ",F0700180";
					Mainpage.Filtering[Mainpage.index].setText("���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0700140";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0700150";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����3��":
					crolling.area += ",F0700160";
					Mainpage.Filtering[Mainpage.index].setText("����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����4��":
					crolling.area += ",F0700170";
					Mainpage.Filtering[Mainpage.index].setText("����4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0700190";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0700200";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��":
					crolling.area += ",F0700210";
					Mainpage.Filtering[Mainpage.index].setText("��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0700220";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������1��":
					crolling.area += ",F0700230";
					Mainpage.Filtering[Mainpage.index].setText("������1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������2��":
					crolling.area += ",F0700240";
					Mainpage.Filtering[Mainpage.index].setText("������2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������3��":
					crolling.area += ",F0700250";
					Mainpage.Filtering[Mainpage.index].setText("������3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������4��":
					crolling.area += ",F0700260";
					Mainpage.Filtering[Mainpage.index].setText("������4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0700270";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�Ÿŵ�":
					crolling.area += ",F0700280";
					Mainpage.Filtering[Mainpage.index].setText("�Ÿŵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȣ��":
					crolling.area += ",F0700290";
					Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0700300";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��������õ��":
					crolling.area += ",F0700310";
					Mainpage.Filtering[Mainpage.index].setText("��������õ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ߵ�":
					crolling.area += ",F0700320";
					Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",F0700350";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0700330";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0700340";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ĵ�":
					crolling.area += ",F0700360";
					Mainpage.Filtering[Mainpage.index].setText("�ĵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ�ݵ�":
					crolling.area += ",F0700390";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ��1��":
					crolling.area += ",F0700370";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ��1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "Ȳ��2��":
					crolling.area += ",F0700380";
					Mainpage.Filtering[Mainpage.index].setText("Ȳ��2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;


				//�߱�
				case "��굿1��":
					crolling.area += ",F0800010";
					Mainpage.Filtering[Mainpage.index].setText("��굿1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��굿2��":
					crolling.area += ",F0800020";
					Mainpage.Filtering[Mainpage.index].setText("��굿2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0800030";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0800040";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",F0800090";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0800050";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0800060";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����3��":
					crolling.area += ",F0800070";
					Mainpage.Filtering[Mainpage.index].setText("����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����4��":
					crolling.area += ",F0800080";
					Mainpage.Filtering[Mainpage.index].setText("����4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0800100";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0800110";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�޼���":
					crolling.area += ",F0800120";
					Mainpage.Filtering[Mainpage.index].setText("�޼���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0800150";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���1��":
					crolling.area += ",F0800130";
					Mainpage.Filtering[Mainpage.index].setText("���1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���2��":
					crolling.area += ",F0800140";
					Mainpage.Filtering[Mainpage.index].setText("���2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ŵ�":
					crolling.area += ",F0800160";
					Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȵ�":
					crolling.area += ",F0800170";
					Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",F0800180";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�߱�������":
					crolling.area += ",F0800190";
					Mainpage.Filtering[Mainpage.index].setText("�߱�������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0800200";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",F0800210";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������1��":
					crolling.area += ",F0800220";
					Mainpage.Filtering[Mainpage.index].setText("������1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������2��":
					crolling.area += ",F0800230";
					Mainpage.Filtering[Mainpage.index].setText("������2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������3��":
					crolling.area += ",F0800240";
					Mainpage.Filtering[Mainpage.index].setText("������3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�1��":
					crolling.area += ",F0800250";
					Mainpage.Filtering[Mainpage.index].setText("���ε�1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�2��":
					crolling.area += ",F0800260";
					Mainpage.Filtering[Mainpage.index].setText("���ε�2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�3��":
					crolling.area += ",F0800270";
					Mainpage.Filtering[Mainpage.index].setText("���ε�3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ε�4��":
					crolling.area += ",F0800280";
					Mainpage.Filtering[Mainpage.index].setText("���ε�4��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0800290";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��ȭ��":
					crolling.area += ",F0800300";
					Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���굿":
					crolling.area += ",F0800310";
					Mainpage.Filtering[Mainpage.index].setText("���굿");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϳ���":
					crolling.area += ",F0800320";
					Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϼ���1��":
					crolling.area += ",F0800330";
					Mainpage.Filtering[Mainpage.index].setText("�ϼ���1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϼ���2��":
					crolling.area += ",F0800340";
					Mainpage.Filtering[Mainpage.index].setText("�ϼ���2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ϵ�":
					crolling.area += ",F0800350";
					Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����1��":
					crolling.area += ",F0800360";
					Mainpage.Filtering[Mainpage.index].setText("�����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����2��":
					crolling.area += ",F0800370";
					Mainpage.Filtering[Mainpage.index].setText("�����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����3��":
					crolling.area += ",F0800380";
					Mainpage.Filtering[Mainpage.index].setText("�����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0800390";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�󼭵�":
					crolling.area += ",F0800400";
					Mainpage.Filtering[Mainpage.index].setText("�󼭵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0800410";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������1��":
					crolling.area += ",F0800420";
					Mainpage.Filtering[Mainpage.index].setText("������1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������2��":
					crolling.area += ",F0800430";
					Mainpage.Filtering[Mainpage.index].setText("������2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������1��":
					crolling.area += ",F0800440";
					Mainpage.Filtering[Mainpage.index].setText("������1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������2��":
					crolling.area += ",F0800450";
					Mainpage.Filtering[Mainpage.index].setText("������2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���ߵ�":
					crolling.area += ",F0800460";
					Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0800470";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "��â��":
					crolling.area += ",F0800480";
					Mainpage.Filtering[Mainpage.index].setText("��â��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����Ϸ�":
					crolling.area += ",F0800490";
					Mainpage.Filtering[Mainpage.index].setText("����Ϸ�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0800500";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0800510";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�α���":
					crolling.area += ",F0800520";
					Mainpage.Filtering[Mainpage.index].setText("�α���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����":
					crolling.area += ",F0800530";
					Mainpage.Filtering[Mainpage.index].setText("�����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����":
					crolling.area += ",F0800540";
					Mainpage.Filtering[Mainpage.index].setText("����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����1��":
					crolling.area += ",F0800550";
					Mainpage.Filtering[Mainpage.index].setText("����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "����2��":
					crolling.area += ",F0800560";
					Mainpage.Filtering[Mainpage.index].setText("����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����1��":
					crolling.area += ",F0800570";
					Mainpage.Filtering[Mainpage.index].setText("�����1��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����2��":
					crolling.area += ",F0800580";
					Mainpage.Filtering[Mainpage.index].setText("�����2��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�����3��":
					crolling.area += ",F0800590";
					Mainpage.Filtering[Mainpage.index].setText("�����3��");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "������":
					crolling.area += ",F0800600";
					Mainpage.Filtering[Mainpage.index].setText("������");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "�ϼ���":
					crolling.area += ",F0800610";
					Mainpage.Filtering[Mainpage.index].setText("�ϼ���");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "���̵�":
					crolling.area += ",F0800620";
					Mainpage.Filtering[Mainpage.index].setText("���̵�");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
				case "ȭ����":
					crolling.area += ",F0800630";
					Mainpage.Filtering[Mainpage.index].setText("ȭ����");
					Mainpage.Filtering[Mainpage.index].setVisible(true);
					Mainpage.delete[Mainpage.index++].setVisible(true);
					break;
		}
	}
}
