package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Ulsan {
		public boolean flag;

		public void UlsanCity(ActionEvent e) {
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
			case "���":
				Albamoncrolling.area += ",J0100010";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B0%B3%BF%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				Albamoncrolling.area += ",J0100020";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B0%ED%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȭ��":
				Albamoncrolling.area += ",J0100030";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B3%B2%C8%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�޵�":
				Albamoncrolling.area += ",J0100040";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B4%DE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�޵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�οյ�":
				Albamoncrolling.area += ",J0100050";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B5%CE%BF";
				Mainpage.Filtering[Mainpage.index].setText("�οյ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�žϵ�":
				Albamoncrolling.area += ",J0100060";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B8%C5%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�žϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ŵ�":
				Albamoncrolling.area += ",J0100090";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%B9%AB%B0%C5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ΰ":
				Albamoncrolling.area += ",J0100100";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ΰ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��굿":
				Albamoncrolling.area += ",J0100110";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BB%EF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�󰳵�":
				Albamoncrolling.area += ",J0100120";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BB%F3%B0%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�󰳵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				Albamoncrolling.area += ",J0100130";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BC%B1%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				Albamoncrolling.area += ",J0100140";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BC%BA%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0100200";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				Albamoncrolling.area += ",J0100150";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				Albamoncrolling.area += ",J0100160";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����3��":
				Albamoncrolling.area += ",J0100170";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����3��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����4��":
				Albamoncrolling.area += ",J0100180";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����4��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����5��":
				Albamoncrolling.area += ",J0100190";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C1%A45%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����5��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0100240";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BE%DF%C0%BD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				Albamoncrolling.area += ",J0100250";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%A9%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				Albamoncrolling.area += ",J0100260";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%C1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�뿬��":
				Albamoncrolling.area += ",J0100270";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%BF%AC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�뿬��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ᵿ":
				Albamoncrolling.area += ",J0100280";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C0%E1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ᵿ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�������":
				Albamoncrolling.area += ",J0100290";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%C0%E5%BB%FD%C6%F7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "Ȳ����":
				Albamoncrolling.area += ",J0100300";
				AlbaHeavencrolling.area += "052%7C%7C%B3%B2%B1%B8%7C%7C%C8%B2%BC%BA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��۵�":
				Albamoncrolling.area += ",J0200010";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%BC%DB%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��۵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ε�":
				Albamoncrolling.area += ",J0200020";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%BA%CE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ε�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��":
				Albamoncrolling.area += ",J0200030";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%B9%E6%BE%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ε�":
				Albamoncrolling.area += ",J0200040";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%BA%CE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ε�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ϻ굿":
				Albamoncrolling.area += ",J0200050";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%CF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				Albamoncrolling.area += ",J0200090";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				Albamoncrolling.area += ",J0200060";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				Albamoncrolling.area += ",J0200070";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C0%FC%C7%CF2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0200100";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C1%D6%C0%FC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȭ����":
				Albamoncrolling.area += ",J0200110";
				AlbaHeavencrolling.area += "052%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȭ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���뵿":
				Albamoncrolling.area += ",J0300010";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B0%A1%B4%EB%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���뵿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0300020";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C0%AF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				Albamoncrolling.area += ",J0300030";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%DE%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				Albamoncrolling.area += ",J0300040";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%E7%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȵ�":
				Albamoncrolling.area += ",J0300050";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�Ű":
				Albamoncrolling.area += ",J0300060";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�Ű");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���̵�":
				Albamoncrolling.area += ",J0300070";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B8%ED%C3%CC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���̵�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���浿":
				Albamoncrolling.area += ",J0300080";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%B9%AB%B7%E6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���浿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				Albamoncrolling.area += ",J0300090";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%C7%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȵ�":
				Albamoncrolling.area += ",J0300100";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BB%F3%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0300110";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�÷ʵ�":
				Albamoncrolling.area += ",J0300120";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C3%B7%CA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�÷ʵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�Ÿ�":
				Albamoncrolling.area += ",J0300130";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%B8%ED%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�Ÿ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��õ��":
				Albamoncrolling.area += ",J0300140";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��õ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0300150";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%C7%F6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0300160";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BE%E7%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���":
				Albamoncrolling.area += ",J0300170";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BE%EE%B9%B0%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ϵ�":
				Albamoncrolling.area += ",J0300180";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%BE%CF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0300190";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%BF%B0%C6%F7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ڵ�":
				Albamoncrolling.area += ",J0300200";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%A4%C0%DA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�߻굿":
				Albamoncrolling.area += ",J0300210";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�߻굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���嵿":
				Albamoncrolling.area += ",J0300220";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C1%F8%C0%E5%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���嵿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "â��":
				Albamoncrolling.area += ",J0300230";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C3%A2%C6%F2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("â��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "õ�":
				Albamoncrolling.area += ",J0300240";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C3%B5%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("õ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȣ�赿":
				Albamoncrolling.area += ",J0300250";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%A3%B0%E8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȣ�赿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȭ����":
				Albamoncrolling.area += ",J0300260";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%BA%C0%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȭ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "ȿ����":
				Albamoncrolling.area += ",J0300270";
				AlbaHeavencrolling.area += "052%7C%7C%BA%CF%B1%B8%7C%7C%C8%BF%B9%AE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("ȿ����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ε���":
				Albamoncrolling.area += ",J0400010";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B5%CE%B5%BF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�ε���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�μ���":
				Albamoncrolling.area += ",J0400020";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B5%CE%BC%AD%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�μ���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0400030";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%B9%FC%BC%AD%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ﳲ��":
				Albamoncrolling.area += ",J0400040";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%EF%B3%B2%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�ﳲ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ﵿ��":
				Albamoncrolling.area += ",J0400050";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%EF%B5%BF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("�ﵿ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ϸ�":
				Albamoncrolling.area += ",J0400060";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BB%F3%BA%CF%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0400070";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BC%AD%BB%FD%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�����":
				Albamoncrolling.area += ",J0400080";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BE%F0%BE%E7%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("�����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�»���":
				Albamoncrolling.area += ",J0400090";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%C2%BB%EA%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("�»���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�¾���":
				Albamoncrolling.area += ",J0400100";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%C2%BE%E7%C0%BE";
				Mainpage.Filtering[Mainpage.index].setText("�¾���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���̸�":
				Albamoncrolling.area += ",J0400110";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%BF%F5%C3%CC%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("���̸�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "û����":
				Albamoncrolling.area += ",J0400120";
				AlbaHeavencrolling.area += "052%7C%7C%BF%EF%C1%D6%B1%BA%7C%7C%C3%BB%B7%AE%B8%E9";
				Mainpage.Filtering[Mainpage.index].setText("û����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				Albamoncrolling.area += ",J0500010";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B1%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ܵ�":
				Albamoncrolling.area += ",J0500020";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BF%DC%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ٿ":
				Albamoncrolling.area += ",J0500030";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%BF%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ٿ");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				Albamoncrolling.area += ",J0500040";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ���":
				Albamoncrolling.area += ",J0500070";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ�1��":
				Albamoncrolling.area += ",J0500050";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B81%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ�1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�ݱ�2��":
				Albamoncrolling.area += ",J0500060";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%B9%DD%B1%B82%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�ݱ�2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���굿":
				Albamoncrolling.area += ",J0500100";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����1��":
				Albamoncrolling.area += ",J0500080";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA1%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����1��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����2��":
				Albamoncrolling.area += ",J0500090";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%B9%BB%EA2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����2��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0500110";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "����":
				Albamoncrolling.area += ",J0500120";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("����");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0500130";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%BA%B3%B2%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���ȵ�":
				Albamoncrolling.area += ",J0500140";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BC%BA%BE%C8%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��絿":
				Albamoncrolling.area += ",J0500150";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BE%E0%BB%E7%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��絿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0500160";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BF%C1%B1%B3%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "������":
				Albamoncrolling.area += ",J0500170";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%BF%EC%C1%A4%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "���":
				Albamoncrolling.area += ",J0500180";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%B0%EE%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;	
			case "������":
				Albamoncrolling.area += ",J0500190";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C7%F6%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("������");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "��ȭ��":
				Albamoncrolling.area += ",J0500200";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C8%AD%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�л굿":
				Albamoncrolling.area += ",J0500210";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C7%D0%BB%EA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�л굿");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			case "�м���":
				Albamoncrolling.area += ",J0500220";
				AlbaHeavencrolling.area += "052%7C%7C%C1%DF%B1%B8%7C%7C%C7%D0%BC%BA%B5%BF";
				Mainpage.Filtering[Mainpage.index].setText("�м���");
				Mainpage.Filtering[Mainpage.index].setVisible(true);
				Mainpage.delete[Mainpage.index++].setVisible(true);
				break;
			}

	}
}
