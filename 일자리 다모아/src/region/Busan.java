package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Busan {
	public boolean flag;

	public void BusanCity(ActionEvent e) {
		if (Mainpage.index == 0) {
			Albamoncrolling.area = "";
			AlbaHeavencrolling.area = "";
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
			Albamoncrolling.area += ",H0100010";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B1%B8%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100020";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B0%AD%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",H0100030";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B3%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100040";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%AD%C2%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0100050";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%EB%C0%FA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0100060";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%EB%C0%FA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			Albamoncrolling.area += ",H0100080";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B4%EB%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100090";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B5%BF%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100100";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B8%ED%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100110";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%CC%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",H0100120";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%B9%FC%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100130";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BA%C0%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",H0100140";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BB%FD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",H0100150";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0100160";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ĸ���":
			Albamoncrolling.area += ",H0100170";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BD%C4%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ĸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",H0100180";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%BD%C5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵���":
			Albamoncrolling.area += ",H0100190";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C1%D7%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			Albamoncrolling.area += ",H0100200";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",H0100210";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C1%F6%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			Albamoncrolling.area += ",H0100220";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C3%B5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",H0100230";
			AlbaHeavencrolling.area += "051%7C%7C%B0%AD%BC%AD%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += "H0200030";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%B8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0200010";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%B8%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0200020";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%B8%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ絿":
			Albamoncrolling.area += ",H0200040";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%DD%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			Albamoncrolling.area += ",H0200050";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B1%DD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",H0200060";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0200070";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B3%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�α���":
			Albamoncrolling.area += ",H0200080";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%B5%CE%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�α���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			Albamoncrolling.area += ",H0200130";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�1��":
			Albamoncrolling.area += ",H0200090";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�2��":
			Albamoncrolling.area += ",H0200100";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�3��":
			Albamoncrolling.area += ",H0200110";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�4��":
			Albamoncrolling.area += ",H0200120";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BA%CE%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",H0200180";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",H0200140";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",H0200150";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",H0200160";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			Albamoncrolling.area += ",H0200170";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%AD4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",H0200190";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0200200";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%BF%C0%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0200240";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0200210";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0200220";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0200230";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C0%E5%C0%FC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�浿":
			Albamoncrolling.area += ",H0200250";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			Albamoncrolling.area += ",H0200260";
			AlbaHeavencrolling.area += "051%7C%7C%B1%DD%C1%A4%B1%B8%7C%7C%C8%B8%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0300010";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%B1%E2%C0%E5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���":
			Albamoncrolling.area += ",H0300020";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C0%CF%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",H0300030";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C0%E5%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0300040";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C1%A4%B0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö����":
			Albamoncrolling.area += ",H0300050";
			AlbaHeavencrolling.area += "051%7C%7C%B1%E2%C0%E5%B1%BA%7C%7C%C3%B6%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ö����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0400030";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B0%A8%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0400010";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B0%A8%B8%B81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0400020";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B0%A8%B8%B82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬��":
			Albamoncrolling.area += ",H0400100";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬1��":
			Albamoncrolling.area += ",H0400040";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬2��":
			Albamoncrolling.area += ",H0400050";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬3��":
			Albamoncrolling.area += ",H0400060";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬4��":
			Albamoncrolling.area += ",H0400070";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬5��":
			Albamoncrolling.area += ",H0400080";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬6��":
			Albamoncrolling.area += ",H0400090";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%BF%AC6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0400150";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0400110";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0400120";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0400130";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H0400140";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%B9%AE%C7%F64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��㵿":
			Albamoncrolling.area += ",H0400160";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",H0400210";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ1��":
			Albamoncrolling.area += ",H0400170";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ2��":
			Albamoncrolling.area += ",H0400180";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ3��":
			Albamoncrolling.area += ",H0400190";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ4��":
			Albamoncrolling.area += ",H0400200";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EB%C8%A34%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",H0400240";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EC%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",H0400220";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EC%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",H0400230";
			AlbaHeavencrolling.area += "051%7C%7C%B3%B2%B1%B8%7C%7C%BF%EC%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",H0500060";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0500010";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0500020";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H0500030";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",H0500040";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%B9%FC%C0%CF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0500120";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0500070";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0500080";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H0500100";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",H0500110";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%C1%A45%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H0500150";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C1%C2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",H0500130";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C1%C2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ4��":
			Albamoncrolling.area += ",H0500140";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C1%C2%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʷ���":
			Albamoncrolling.area += ",H0500210";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʷ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʷ�1��":
			Albamoncrolling.area += ",H0500160";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʷ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʷ�2��":
			Albamoncrolling.area += ",H0500170";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʷ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʷ�3��":
			Albamoncrolling.area += ",H0500180";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʷ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʷ�6��":
			Albamoncrolling.area += ",H0500200";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B1%B8%7C%7C%C3%CA%B7%AE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʷ�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",H0600010";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B3%AB%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",H0600040";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%B7%FB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",H0600070";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0600050";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0600060";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%B8%ED%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H0600080";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BA%B9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0600120";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0600090";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0600100";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0600110";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BB%E7%C1%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			Albamoncrolling.area += ",H0600130";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BC%F6%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȶ���":
			Albamoncrolling.area += ",H0600160";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BE%C8%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȶ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȶ�1��":
			Albamoncrolling.area += ",H0600140";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BE%C8%B6%F41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȶ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȶ�2��":
			Albamoncrolling.area += ",H0600150";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BE%C8%B6%F42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȶ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H0600200";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",H0600170";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			Albamoncrolling.area += ",H0600180";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ3��":
			Albamoncrolling.area += ",H0600190";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%BF%C2%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ�굿":
			Albamoncrolling.area += ",H0600210";
			AlbaHeavencrolling.area += "051%7C%7C%B5%BF%B7%A1%B1%B8%7C%7C%C4%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",H0700040";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%A1%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0700010";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%A1%BE%DF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0700020";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%A1%BE%DF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			Albamoncrolling.area += ",H0700080";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0700050";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0700060";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0700070";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B0%B3%B1%DD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簨��":
			Albamoncrolling.area += ",H0700130";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�簨��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簨1��":
			Albamoncrolling.area += ",H0700090";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�簨1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簨2��":
			Albamoncrolling.area += ",H0700100";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�簨2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簨4��":
			Albamoncrolling.area += ",H0700120";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B4%E7%B0%A84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�簨4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0700140";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H0700180";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",H0700150";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			Albamoncrolling.area += ",H0700160";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ4��":
			Albamoncrolling.area += ",H0700170";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%B9%FC%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξϵ�":
			Albamoncrolling.area += ",H0700210";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξ�1��":
			Albamoncrolling.area += ",H0700190";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξ�3��":
			Albamoncrolling.area += ",H0700200";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0700240";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0700220";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0700230";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BA%CE%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0700270";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BE%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0700250";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BE%E7%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0700260";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BE%E7%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0700280";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0700320";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0700290";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0700300";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0700310";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C0%FC%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0700330";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CE%BB%EA%C1%F8%B1%B8%7C%7C%C3%CA%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0800040";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0800010";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0800020";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0800030";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			Albamoncrolling.area += ",H0800050";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H0800090";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",H0800060";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			Albamoncrolling.area += "H0800070";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ3��":
			Albamoncrolling.area += ",H0800080";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0800130";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0800100";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0800110";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H0800120";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%B8%B8%B4%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��":
			Albamoncrolling.area += ",H0800170";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			Albamoncrolling.area += ",H0800140";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			Albamoncrolling.area += ",H0800150";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��3��":
			Albamoncrolling.area += ",H0800160";
			AlbaHeavencrolling.area += "051%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0900030";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B0%A8%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0900040";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B1%A5%B9%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H0900070";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B4%F6%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H0900050";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B4%F6%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H0900060";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B4%F6%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",H0900110";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B8%F0%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",H0900080";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B8%F0%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",H0900100";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%B8%F0%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",H0900120";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%BB%EF%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ�":
			Albamoncrolling.area += ",H0900130";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%BE%F6%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ַʵ�":
			Albamoncrolling.area += ",H0900170";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ַʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ַ�1��":
			Albamoncrolling.area += ",H0900140";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ַ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ַ�2��":
			Albamoncrolling.area += ",H0900150";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ַ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ַ�3��":
			Albamoncrolling.area += ",H0900160";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C1%D6%B7%CA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ַ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",H0900180";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%BB%F3%B1%B8%7C%7C%C7%D0%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H1000030";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B0%A8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",H1000010";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B0%A8%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			Albamoncrolling.area += ",H1000020";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B0%A8%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1000080";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1000040";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1000050";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H1000060";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H1000070";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%AB%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",H1000090";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B1%B8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٴ뵿":
			Albamoncrolling.area += ",H1000120";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%D9%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٴ�1��":
			Albamoncrolling.area += ",H1000100";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%D9%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٴ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٴ�2��":
			Albamoncrolling.area += ",H1000110";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%D9%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٴ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�縮��":
			Albamoncrolling.area += ",H1000130";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%B4%E7%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�縮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",H1000160";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1000140";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%BD%C5%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1000150";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%BD%C5%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�帲��":
			Albamoncrolling.area += ",H1000190";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C0%E5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�帲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�帲1��":
			Albamoncrolling.area += ",H1000170";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C0%E5%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�帲1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�帲2��":
			Albamoncrolling.area += ",H1000180";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C0%E5%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�帲2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴܵ�":
			Albamoncrolling.area += ",H1000220";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C7%CF%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ�1��":
			Albamoncrolling.area += ",H1000200";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C7%CF%B4%DC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ�2��":
			Albamoncrolling.area += ",H1000210";
			AlbaHeavencrolling.area += "051%7C%7C%BB%E7%C7%CF%B1%B8%7C%7C%C7%CF%B4%DC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ιε�":
			Albamoncrolling.area += ",H1100040";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B3%B2%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ιε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ι�1��":
			Albamoncrolling.area += ",H1100010";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B3%B2%BA%CE%B9%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ι�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ι�2��":
			Albamoncrolling.area += ",H1100020";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B3%B2%BA%CE%B9%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ι�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�1��":
			Albamoncrolling.area += ",H1100060";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%B4%EB%BD%C5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�2��":
			Albamoncrolling.area += ",H1100070";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%B4%EB%BD%C5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�3��":
			Albamoncrolling.area += ",H1100080";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%B4%EB%BD%C5%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ιε�":
			Albamoncrolling.area += ",H1100090";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ιε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ιε�1��":
			Albamoncrolling.area += ",H1100100";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ιε�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ιε�2��":
			Albamoncrolling.area += ",H1100110";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ιε�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ιε�3��":
			Albamoncrolling.area += ",H1100120";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ιε�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο뵿1��":
			Albamoncrolling.area += ",H1100140";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ο뵿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο뵿2��":
			Albamoncrolling.area += ",H1100150";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BA%CE%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ο뵿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�1��":
			Albamoncrolling.area += ",H1100170";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%B4%EB%BD%C5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�2��":
			Albamoncrolling.area += ",H1100180";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%B4%EB%BD%C5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ŵ�3��":
			Albamoncrolling.area += ",H1100190";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%B4%EB%BD%C5%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����ŵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƹ̵�":
			Albamoncrolling.area += ",H1100200";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%C6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƹ̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƹ̵�1��":
			Albamoncrolling.area += ",H1100210";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%C6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƹ̵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƹ̵�2��":
			Albamoncrolling.area += ",H1100220";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%C6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƹ̵�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			Albamoncrolling.area += ",H1100230";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%BE%CF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",H1100240";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%CA%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��":
			Albamoncrolling.area += ",H1100250";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��1��":
			Albamoncrolling.area += ",H1100260";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��2��":
			Albamoncrolling.area += ",H1100270";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��3��":
			Albamoncrolling.area += ",H1100280";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��1��":
			Albamoncrolling.area += ",H1100300";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伺��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��2��":
			Albamoncrolling.area += ",H1100310";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伺��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��3��":
			Albamoncrolling.area += ",H1100320";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伺��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��4��":
			Albamoncrolling.area += ",H1100330";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伺��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��5��":
			Albamoncrolling.area += ",H1100340";
			AlbaHeavencrolling.area += "051%7C%7C%BC%AD%B1%B8%7C%7C%C5%E4%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伺��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			Albamoncrolling.area += ",H1200050";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1200010";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1200020";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H1200030";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H1200040";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B1%A4%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",H1200080";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B3%B2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",H1200060";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B3%B2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			Albamoncrolling.area += ",H1200070";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B3%B2%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",H1200110";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B8%C1%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1200090";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B8%C1%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1200100";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B8%C1%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ζ���":
			Albamoncrolling.area += ",H1200120";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%B9%CE%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ζ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1200130";
			AlbaHeavencrolling.area += "051%7C%7C%BC%F6%BF%B5%B1%B8%7C%7C%BC%F6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1300050";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1300010";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1300020";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H1300030";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H1300040";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%B0%C5%C1%A64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",H1300150";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1300060";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1300070";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H1300080";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H1300090";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",H1300100";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			Albamoncrolling.area += ",H1300110";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����8��":
			Albamoncrolling.area += ",H1300130";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����9��":
			Albamoncrolling.area += ",H1300140";
			AlbaHeavencrolling.area += "051%7C%7C%BF%AC%C1%A6%B1%B8%7C%7C%BF%AC%BB%EA9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����9��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			Albamoncrolling.area += ",H1400010";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�1��":
			Albamoncrolling.area += ",H1400020";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿2��":
			Albamoncrolling.area += ",H1400030";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿3��":
			Albamoncrolling.area += ",H1400040";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B3%B2%C7%D73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱳��1��":
			Albamoncrolling.area += ",H1400060";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%B1%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뱳��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱳��2��":
			Albamoncrolling.area += ",H1400070";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%B1%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뱳��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1400090";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1400100";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B4%EB%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",H1400140";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1400110";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1400120";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H1400130";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%B5%BF%BB%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",H1400160";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",H1400170";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",H1400180";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",H1400190";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",H1400200";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BA%C0%B7%A15%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",H1400210";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���1��":
			Albamoncrolling.area += ",H1400220";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���2��":
			Albamoncrolling.area += ",H1400230";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���3��":
			Albamoncrolling.area += ",H1400240";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BD%C5%BC%B13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",H1400260";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",H1400270";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",H1400280";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",H1400290";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%BF%B5%BC%B14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�е�":
			Albamoncrolling.area += ",H1400320";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��1��":
			Albamoncrolling.area += ",H1400300";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%C3%BB%C7%D01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��2��":
			Albamoncrolling.area += ",H1400310";
			AlbaHeavencrolling.area += "051%7C%7C%BF%B5%B5%B5%B1%B8%7C%7C%C3%BB%C7%D02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1500010";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",H1500020";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",H1500030";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",H1500040";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%BA%B93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1500050";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",H1500060";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",H1500070";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",H1500080";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",H1500090";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",H1500100";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������6��":
			Albamoncrolling.area += ",H1500110";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C6%F76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��1��":
			Albamoncrolling.area += ",H15000130";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%A2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��â��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��2��":
			Albamoncrolling.area += ",H1500140";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%A2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��â��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			Albamoncrolling.area += ",H1500150";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��1��":
			Albamoncrolling.area += ",H1500160";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��û��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��2��":
			Albamoncrolling.area += ",H1500170";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��û��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��3��":
			Albamoncrolling.area += ",H1500180";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��û��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��4��":
			Albamoncrolling.area += ",H1500190";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%C3%BB%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��û��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1500200";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",H1500210";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",H1500220";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",H1500230";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",H1500240";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",H1500250";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B1%A4%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",H1500260";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",H1500270";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",H1500280";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",H1500290";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%B8%BC%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",H1500300";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1500310";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1500320";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",H1500330";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",H1500340";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��1��":
			Albamoncrolling.area += ",H1500360";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��â��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��2��":
			Albamoncrolling.area += ",H1500370";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��â��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��3��":
			Albamoncrolling.area += ",H1500380";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��â��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��4��":
			Albamoncrolling.area += ",H1500390";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��â��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",H1500420";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BF%B5%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",H1500400";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BF%B5%C1%D61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",H1500410";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%BF%B5%C1%D62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",H1500430";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�1��":
			Albamoncrolling.area += ",H1500440";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�2��":
			Albamoncrolling.area += ",H1500450";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�3��":
			Albamoncrolling.area += ",H1500460";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�4��":
			Albamoncrolling.area += ",H1500470";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�5��":
			Albamoncrolling.area += ",H1500480";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�6��":
			Albamoncrolling.area += ",H1500490";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�7��":
			Albamoncrolling.area += ",H1500500";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����1��":
			Albamoncrolling.area += ",H1500520";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C3%A2%BC%B1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����2��":
			Albamoncrolling.area += ",H1500530";
			AlbaHeavencrolling.area += "051%7C%7C%C1%DF%B1%B8%7C%7C%C3%A2%BC%B1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ۵�":
			Albamoncrolling.area += ",H1600040";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ�1��":
			Albamoncrolling.area += ",H1600010";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ�2��":
			Albamoncrolling.area += ",H1600020";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ�3��":
			Albamoncrolling.area += ",H1600030";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BC%DB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			Albamoncrolling.area += ",H1600090";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ�1��":
			Albamoncrolling.area += ",H1600050";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ�2��":
			Albamoncrolling.area += ",H1600060";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ�3��":
			Albamoncrolling.area += ",H1600070";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ�4��":
			Albamoncrolling.area += ",H1600080";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%B9%DD%BF%A94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			Albamoncrolling.area += ",H1600100";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BC%AE%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؿ�뱸������":
			Albamoncrolling.area += ",H1600110";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ؿ�뱸������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�쵿":
			Albamoncrolling.area += ",H1600140";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",H1600120";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",H1600130";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",H1600260";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%BF%EC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��۵�":
			Albamoncrolling.area += ",H1600170";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C0%E7%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",H1600150";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C0%E7%BC%DB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",H1600160";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C0%E7%BC%DB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�µ�":
			Albamoncrolling.area += ",H1600220";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",H1600180";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",H1600190";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",H1600200";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			Albamoncrolling.area += ",H1600210";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%C24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			Albamoncrolling.area += ",H1600250";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%DF1%B5";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",H1600230";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%DF1%B5";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",H1600240";
			AlbaHeavencrolling.area += "051%7C%7C%C7%D8%BF%EE%B4%EB%B1%B8%7C%7C%C1%DF2%B5";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
