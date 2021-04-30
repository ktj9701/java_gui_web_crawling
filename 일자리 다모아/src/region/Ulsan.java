package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
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
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B0%B3%BF%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				crolling.area += ",J0100020";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B0%ED%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȭ��":
				crolling.area += ",J0100030";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B3%B2%C8%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�޵�":
				crolling.area += ",J0100040";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B4%DE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�޵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�οյ�":
				crolling.area += ",J0100050";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B5%CE%BF";
				Mainpage.Filtering[Mainpage.index].setText("�οյ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�žϵ�":
				crolling.area += ",J0100060";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B8%C5%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�žϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ŵ�":
				crolling.area += ",J0100090";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%B9%AB%B0%C5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ΰ":
				crolling.area += ",J0100100";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ΰ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��굿":
				crolling.area += ",J0100110";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BB%EF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�󰳵�":
				crolling.area += ",J0100120";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BB%F3%B0%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�󰳵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0100130";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BC%B1%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0100140";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BC%BA%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0100200";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				crolling.area += ",J0100150";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				crolling.area += ",J0100160";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����3��":
				crolling.area += ",J0100170";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����3��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����4��":
				crolling.area += ",J0100180";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����4��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����5��":
				crolling.area += ",J0100190";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A45%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����5��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0100240";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BE%DF%C0%BD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				crolling.area += ",J0100250";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%A9%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0100260";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%C1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�뿬��":
				crolling.area += ",J0100270";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%BF%AC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�뿬��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ᵿ":
				crolling.area += ",J0100280";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C0%E1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ᵿ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�������":
				crolling.area += ",J0100290";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%C0%E5%BB%FD%C6%F7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "Ȳ����":
				crolling.area += ",J0100300";
				wewe.area = "052%7C%7C%B3%B2%B1%B8%7C%7C%C8%B2%BC%BA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��۵�":
				crolling.area += ",J0200010";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%BC%DB%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��۵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ε�":
				crolling.area += ",J0200020";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%BA%CE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ε�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��":
				crolling.area += ",J0200030";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%B9%E6%BE%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ε�":
				crolling.area += ",J0200040";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%BA%CE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ε�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ϻ굿":
				crolling.area += ",J0200050";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%CF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0200090";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				crolling.area += ",J0200060";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				crolling.area += ",J0200070";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0200100";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%C1%D6%C0%FC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȭ����":
				crolling.area += ",J0200110";
				wewe.area = "052%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȭ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���뵿":
				crolling.area += ",J0300010";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B0%A1%B4%EB%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���뵿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300020";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C0%AF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				crolling.area += ",J0300030";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%DE%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				crolling.area += ",J0300040";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%E7%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȵ�":
				crolling.area += ",J0300050";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�Ű":
				crolling.area += ",J0300060";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�Ű");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���̵�":
				crolling.area += ",J0300070";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B8%ED%C3%CC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���̵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���浿":
				crolling.area += ",J0300080";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%B9%AB%B7%E6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���浿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0300090";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%C7%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȵ�":
				crolling.area += ",J0300100";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BB%F3%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300110";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�÷ʵ�":
				crolling.area += ",J0300120";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C3%B7%CA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�÷ʵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�Ÿ�":
				crolling.area += ",J0300130";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%B8%ED%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�Ÿ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				crolling.area += ",J0300140";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300150";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%C7%F6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300160";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BE%E7%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���":
				crolling.area += ",J0300170";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BE%EE%B9%B0%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				crolling.area += ",J0300180";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0300190";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%BF%B0%C6%F7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ڵ�":
				crolling.area += ",J0300200";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�߻굿":
				crolling.area += ",J0300210";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�߻굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���嵿":
				crolling.area += ",J0300220";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%F8%C0%E5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���嵿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "â��":
				crolling.area += ",J0300230";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C3%A2%C6%F2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("â��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "õ�":
				crolling.area += ",J0300240";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C3%B5%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("õ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȣ�赿":
				crolling.area += ",J0300250";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%A3%B0%E8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȣ�赿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȭ����":
				crolling.area += ",J0300260";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%BA%C0%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȭ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȿ����":
				crolling.area += ",J0300270";
				wewe.area = "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%BF%B9%AE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȿ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ε���":
				crolling.area += ",J0400010";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B5%CE%B5%BF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�ε���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�μ���":
				crolling.area += ",J0400020";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B5%CE%BC%AD%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�μ���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0400030";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B9%FC%BC%AD%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ﳲ��":
				crolling.area += ",J0400040";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%EF%B3%B2%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�ﳲ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ﵿ��":
				crolling.area += ",J0400050";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%EF%B5%BF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�ﵿ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ϸ�":
				crolling.area += ",J0400060";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%F3%BA%CF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0400070";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BC%AD%BB%FD%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�����":
				crolling.area += ",J0400080";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BE%F0%BE%E7%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("�����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�»���":
				crolling.area += ",J0400090";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%C2%BB%EA%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("�»���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�¾���":
				crolling.area += ",J0400100";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%C2%BE%E7%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("�¾���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���̸�":
				crolling.area += ",J0400110";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%F5%C3%CC%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("���̸�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "û����":
				crolling.area += ",J0400120";
				wewe.area = "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%C3%BB%B7%AE%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("û����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0500010";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B1%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ܵ�":
				crolling.area += ",J0500020";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BF%DC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ٿ":
				crolling.area += ",J0500030";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%BF%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ٿ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0500040";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ���":
				crolling.area += ",J0500070";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ�1��":
				crolling.area += ",J0500050";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B81%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ�1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ�2��":
				crolling.area += ",J0500060";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B82%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ�2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���굿":
				crolling.area += ",J0500100";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				crolling.area += ",J0500080";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				crolling.area += ",J0500090";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500110";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				crolling.area += ",J0500120";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500130";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%BA%B3%B2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ȵ�":
				crolling.area += ",J0500140";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%BA%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				crolling.area += ",J0500150";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BE%E0%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500160";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BF%C1%B1%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				crolling.area += ",J0500170";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%BF%EC%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���":
				crolling.area += ",J0500180";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;	
			case "������":
				crolling.area += ",J0500190";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C7%F6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȭ��":
				crolling.area += ",J0500200";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C8%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�л굿":
				crolling.area += ",J0500210";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%C7%D0%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�л굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�м���":
				crolling.area += ",J0500220";
				wewe.area = "052%7C%7C%C1%DF%B1%B8%7C%7C%C7%D0%BC%BA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�м���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			}

	}
}
