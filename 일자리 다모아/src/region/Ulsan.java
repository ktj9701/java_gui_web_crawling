package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import GUI.Mainpage;

public class Ulsan {
		public boolean flag;

		public void UlsanCity(ActionEvent e) {
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
			case "���":
				crolling.area += ",J0100010";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				crolling.area += ",J0100020";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȭ��":
				crolling.area += ",J0100030";
				Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�޵�":
				crolling.area += ",J0100040";
				Mainpage.Filtering[Mainpage.index].setText("�޵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�οյ�":
				crolling.area += ",J0100050";
				Mainpage.Filtering[Mainpage.index].setText("�οյ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�žϵ�":
				crolling.area += ",J0100060";
				Mainpage.Filtering[Mainpage.index].setText("�žϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ŵ�":
				crolling.area += ",J0100090";
				Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ΰ":
				crolling.area += ",J0100100";
				Mainpage.Filtering[Mainpage.index].setText("�ΰ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��굿":
				crolling.area += ",J0100110";
				Mainpage.Filtering[Mainpage.index].setText("��굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�󰳵�":
				crolling.area += ",J0100120";
				Mainpage.Filtering[Mainpage.index].setText("�󰳵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0100130";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0100140";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0100200";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				crolling.area += ",J0100150";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				crolling.area += ",J0100160";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����3��":
				crolling.area += ",J0100170";
				Mainpage.Filtering[Mainpage.index].setText("����3��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����4��":
				crolling.area += ",J0100180";
				Mainpage.Filtering[Mainpage.index].setText("����4��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����5��":
				crolling.area += ",J0100190";
				Mainpage.Filtering[Mainpage.index].setText("����5��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0100240";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				crolling.area += ",J0100250";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0100260";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�뿬��":
				crolling.area += ",J0100270";
				Mainpage.Filtering[Mainpage.index].setText("�뿬��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ᵿ":
				crolling.area += ",J0100280";
				Mainpage.Filtering[Mainpage.index].setText("���ᵿ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�������":
				crolling.area += ",J0100290";
				Mainpage.Filtering[Mainpage.index].setText("�������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "Ȳ����":
				crolling.area += ",J0100300";
				Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��۵�":
				crolling.area += ",J0200010";
				Mainpage.Filtering[Mainpage.index].setText("��۵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ε�":
				crolling.area += ",J0200020";
				Mainpage.Filtering[Mainpage.index].setText("���ε�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��":
				crolling.area += ",J0200030";
				Mainpage.Filtering[Mainpage.index].setText("��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ε�":
				crolling.area += ",J0200040";
				Mainpage.Filtering[Mainpage.index].setText("���ε�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ϻ굿":
				crolling.area += ",J0200050";
				Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0200090";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				crolling.area += ",J0200060";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				crolling.area += ",J0200070";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0200100";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȭ����":
				crolling.area += ",J0200110";
				Mainpage.Filtering[Mainpage.index].setText("ȭ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���뵿":
				crolling.area += ",J0300010";
				Mainpage.Filtering[Mainpage.index].setText("���뵿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300020";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				crolling.area += ",J0300030";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				crolling.area += ",J0300040";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȵ�":
				crolling.area += ",J0300050";
				Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�Ű":
				crolling.area += ",J0300060";
				Mainpage.Filtering[Mainpage.index].setText("�Ű");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���̵�":
				crolling.area += ",J0300070";
				Mainpage.Filtering[Mainpage.index].setText("���̵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���浿":
				crolling.area += ",J0300080";
				Mainpage.Filtering[Mainpage.index].setText("���浿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0300090";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȵ�":
				crolling.area += ",J0300100";
				Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300110";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�÷ʵ�":
				crolling.area += ",J0300120";
				Mainpage.Filtering[Mainpage.index].setText("�÷ʵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�Ÿ�":
				crolling.area += ",J0300130";
				Mainpage.Filtering[Mainpage.index].setText("�Ÿ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				crolling.area += ",J0300140";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300150";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300160";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���":
				crolling.area += ",J0300170";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0300180";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300190";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ڵ�":
				crolling.area += ",J0300200";
				Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�߻굿":
				crolling.area += ",J0300210";
				Mainpage.Filtering[Mainpage.index].setText("�߻굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���嵿":
				crolling.area += ",J0300220";
				Mainpage.Filtering[Mainpage.index].setText("���嵿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "â��":
				crolling.area += ",J0300230";
				Mainpage.Filtering[Mainpage.index].setText("â��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "õ�":
				crolling.area += ",J0300240";
				Mainpage.Filtering[Mainpage.index].setText("õ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȣ�赿":
				crolling.area += ",J0300250";
				Mainpage.Filtering[Mainpage.index].setText("ȣ�赿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȭ����":
				crolling.area += ",J0300260";
				Mainpage.Filtering[Mainpage.index].setText("ȭ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȿ����":
				crolling.area += ",J0300270";
				Mainpage.Filtering[Mainpage.index].setText("ȿ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ε���":
				crolling.area += ",J0400010";
				Mainpage.Filtering[Mainpage.index].setText("�ε���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�μ���":
				crolling.area += ",J0400020";
				Mainpage.Filtering[Mainpage.index].setText("�μ���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0400030";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ﳲ��":
				crolling.area += ",J0400040";
				Mainpage.Filtering[Mainpage.index].setText("�ﳲ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ﵿ��":
				crolling.area += ",J0400050";
				Mainpage.Filtering[Mainpage.index].setText("�ﵿ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ϸ�":
				crolling.area += ",J0400060";
				Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0400070";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�����":
				crolling.area += ",J0400080";
				Mainpage.Filtering[Mainpage.index].setText("�����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�»���":
				crolling.area += ",J0400090";
				Mainpage.Filtering[Mainpage.index].setText("�»���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�¾���":
				crolling.area += ",J0400100";
				Mainpage.Filtering[Mainpage.index].setText("�¾���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���̸�":
				crolling.area += ",J0400110";
				Mainpage.Filtering[Mainpage.index].setText("���̸�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "û����":
				crolling.area += ",J0400120";
				Mainpage.Filtering[Mainpage.index].setText("û����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0500010";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ܵ�":
				crolling.area += ",J0500020";
				Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ٿ":
				crolling.area += ",J0500030";
				Mainpage.Filtering[Mainpage.index].setText("�ٿ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0500040";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ���":
				crolling.area += ",J0500070";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ�1��":
				crolling.area += ",J0500050";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ�1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ�2��":
				crolling.area += ",J0500060";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ�2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���굿":
				crolling.area += ",J0500100";
				Mainpage.Filtering[Mainpage.index].setText("���굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				crolling.area += ",J0500080";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				crolling.area += ",J0500090";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500110";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0500120";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500130";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ȵ�":
				crolling.area += ",J0500140";
				Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				crolling.area += ",J0500150";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500160";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500170";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���":
				crolling.area += ",J0500180";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;	
			case "������":
				crolling.area += ",J0500190";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȭ��":
				crolling.area += ",J0500200";
				Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�л굿":
				crolling.area += ",J0500210";
				Mainpage.Filtering[Mainpage.index].setText("�л굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�м���":
				crolling.area += ",J0500220";
				Mainpage.Filtering[Mainpage.index].setText("�м���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			}
		
	}
}
