package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;

public class Incheon {
	public boolean flag;

	public void IncheonCity(ActionEvent e) {
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
		case "��ȭ��":
			crolling.area += "K0100010";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B0%AD%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0100020";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B1%B3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K0100030";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B1%E6%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += "K0100040";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%B3%BB%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0100050";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BA%D2%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K0100060";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0100070";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BC%AD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0100080";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BC%B1%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			crolling.area += ",K0100090";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BC%DB%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絵��":
			crolling.area += ",K0100100";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BE%E7%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�絵��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K0100110";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%BE%E7%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0100120";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%C7%CF%C1%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",K0100130";
			wewe.area += "032%7C%7C%B0%AD%C8%AD%B1%BA%7C%7C%C8%AD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0200010";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",K0200060";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",K0200020";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",K0200030";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",K0200040";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",K0200050";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B0%E8%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0200070";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B1%D6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������":
			crolling.area += ",K0200080";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B3%EB%BF%C0%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٳ���":
			crolling.area += ",K0200090";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B4%D9%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",K0200100";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B5%BF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͻǵ�":
			crolling.area += ",K0200110";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B5%CF%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͻǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",K0200120";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B8%F1%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",K0200130";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B9%DA%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",K0200140";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%B9%E6%C3%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",K0200150";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BA%B4%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ߵ�":
			crolling.area += ",K0200160";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BB%F3%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += "K0200170";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",K0200180";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BC%B1%C1%D6%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0200190";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0200200";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%BF%EB%C1%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",K0200210";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%CC%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",K0200220";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%D3%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0200260";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0200230";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0200240";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0200250";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������":
			crolling.area += ",K0200330";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%DB%C0%FC%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			crolling.area += ",K0200270";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",K0200280";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼߵ�":
			crolling.area += ",K0200290";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C7%CF%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ����":
			crolling.area += ",K0200320";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C8%BF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��1��":
			crolling.area += ",K0200300";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C8%BF%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��2��":
			crolling.area += ",K0200310";
			wewe.area += "032%7C%7C%B0%E8%BE%E7%B1%B8%7C%7C%C8%BF%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0400050";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0400010";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0400020";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0400030";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0400040";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%A3%BC%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			crolling.area += ",K0400060";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B0%ED%C0%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0400110";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0400070";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0400080";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0400090";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0400100";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B1%B8%BF%F94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",K0400120";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B3%B2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0400130";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B3%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0400140";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0400210";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0400150";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0400160";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0400170";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0400180";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			crolling.area += ",K0400190";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			crolling.area += ",K0400200";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%B8%B8%BC%F66%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",K0400220";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%BC%AD%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",K0400230";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%BC%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",K0400240";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%BF%EE%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",K0400250";
			wewe.area += "032%7C%7C%B3%B2%B5%BF%B1%B8%7C%7C%C0%E5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			crolling.area += ",K0500010";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0500020";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%B8%B8%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۸���":
			crolling.area += "K0500090";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۸�1��":
			crolling.area += ",K0500030";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۸�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۸�2��":
			crolling.area += ",K0500040";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۸�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۸�3.5��":
			crolling.area += ",K0500050";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B23.5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۸�3.5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۸�4��":
			crolling.area += ",K0500060";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۸�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۸�6��":
			crolling.area += ",K0500080";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%B8%B26%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۸�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0500130";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1.2��":
			crolling.area += ",K0500100";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C7%F61.2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1.2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0500120";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C7%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",K0500140";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C3%A2%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",K0500170";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			crolling.area += ",K0500150";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			crolling.area += ",K0500160";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��":
			crolling.area += ",K0500180";
			wewe.area += "032%7C%7C%B5%BF%B1%B8%7C%7C%C8%AD%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0300010";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B0%FC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",K0300050";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ1��":
			crolling.area += ",K0300020";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ2��":
			crolling.area += ",K0300030";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ3��":
			crolling.area += ",K0300040";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B5%B5%C8%AD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",K0300060";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%B9%AE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",K0300110";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0300070";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C71.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0300080";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0300090";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0300100";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BC%FE%C0%C74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0300170";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0300120";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F61.4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0300130";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0300140";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0300150";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			crolling.area += ",K0300160";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%BF%EB%C7%F65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־ȵ�":
			crolling.area += ",K0300260";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�1��":
			crolling.area += ",K0300180";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�2��":
			crolling.area += ",K0300190";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�3��":
			crolling.area += ",K0300200";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�4��":
			crolling.area += ",K0300210";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C84%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�5��":
			crolling.area += ",K0300220";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C85%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�6��":
			crolling.area += ",K0300230";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C86%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�7��":
			crolling.area += ",K0300240";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C87%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־�8��":
			crolling.area += ",K0300250";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C1%D6%BE%C88%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־�8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			crolling.area += ",K0300290";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C7%D0%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0300270";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C7%D0%C0%CD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0300280";
			wewe.area += "032%7C%7C%B9%CC%C3%DF%C8%A6%B1%B8%7C%7C%C7%D0%C0%CD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",K0600030";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0600010";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B0%A5%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0600020";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B0%A5%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",K0600040";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ���":
			crolling.area += ",K0600080";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�1��":
			crolling.area += ",K0600050";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�2��":
			crolling.area += ",K0600060";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ�3��":
			crolling.area += ",K0600070";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%B0%B33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K0600150";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0600090";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0600100";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0600110";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0600120";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			crolling.area += ",K0600130";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F25%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			crolling.area += ",K0600140";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BA%CE%C6%F26%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",K0600200";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",K0600160";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",K0600170";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",K0600180";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",K0600190";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EA%B0%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",K0600210";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",K0600205";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EF%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",K0600206";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BB%EF%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0600240";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BD%CA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0600220";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BD%CA%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0600230";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%BD%CA%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͻŵ�":
			crolling.area += ",K0600250";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C0%CF%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͻŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûõ��":
			crolling.area += ",K0600280";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C3%BB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûõ1��":
			crolling.area += ",K0600260";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C3%BB%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûõ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûõ2��":
			crolling.area += ",K0600270";
			wewe.area += "032%7C%7C%BA%CE%C6%F2%B1%B8%7C%7C%C3%BB%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûõ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0700040";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0700010";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0700020";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0700030";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���µ�":
			crolling.area += ",K0700090";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0700050";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0700060";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0700070";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",K0700080";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%A1%C1%C24%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˾ϵ�":
			crolling.area += ",K0700100";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%CB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漭��":
			crolling.area += ",K0700110";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%E6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",K0700120";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B0%F8%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�����ݰ":
			crolling.area += ",K0700130";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�����ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",K0700140";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B4%E7%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",K0700150";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B4%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0700160";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮��":
			crolling.area += ",K0700170";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%B9%E9%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�鼮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҷε�":
			crolling.area += ",K0700180";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BA%D2%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҷε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0700220";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0700190";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0700200";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0700210";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BC%AE%B3%B23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",K0700230";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BD%C3%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0700240";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BD%C5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ":
			crolling.area += ",K0700250";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K0700260";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%AC%C8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ����������":
			crolling.area += ",K0700270";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%C0%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ձ浿":
			crolling.area += ",K0700280";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%D5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ձ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",K0700290";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",K0700300";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��":
			crolling.area += ",K0700310";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��1��":
			crolling.area += ",K0700320";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��2��":
			crolling.area += ",K0700330";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��3��":
			crolling.area += ",K0700340";
			wewe.area += "032%7C%7C%BC%AD%B1%B8%7C%7C%C3%BB%B6%F33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ᵿ":
			crolling.area += ",K0800040";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ᵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0800010";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0800020";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0800030";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%B5%BF%C3%E13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",K0800050";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BC%B1%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵���":
			crolling.area += ",K0800060";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BC%DB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�1��":
			crolling.area += ",K0800061";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�۵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�2��":
			crolling.area += ",K0800062";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�۵�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�3��":
			crolling.area += ",K0800063";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�۵�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�4��":
			crolling.area += ",K0800064";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�۵�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�5��":
			crolling.area += ",K0800065";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�۵�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0800100";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0800070";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0800080";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K0800090";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%AC%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ�":
			crolling.area += ",K0800110";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%C1%B7%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K0800105";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%C1%B7%C31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K0800106";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%BF%C1%B7%C32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�е�":
			crolling.area += ",K0800120";
			wewe.area += "032%7C%7C%BF%AC%BC%F6%B1%B8%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",K0900010";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%B4%EB%C3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K0900020";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%B4%F6%C0%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ɸ�":
			crolling.area += ",K0900030";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%B9%E9%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ���":
			crolling.area += ",K0900040";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%BA%CF%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",K0900050";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%BF%AC%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",K0900060";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%BF%B5%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڿ���":
			crolling.area += ",K0900070";
			wewe.area += "032%7C%7C%BF%CB%C1%F8%B1%BA%7C%7C%C0%DA%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ڿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�浿":
			crolling.area += ",K1000010";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",K1000020";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%FC%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",K1000030";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%FC%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",K1000040";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B0%FC%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",K1000050";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K1000060";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�䵿":
			crolling.area += ",K1000070";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K1000080";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B4%F6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K1000090";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",K1000100";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���1��":
			crolling.area += ",K1000110";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���2��":
			crolling.area += ",K1000120";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���3��":
			crolling.area += ",K1000130";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			crolling.area += ",K1000140";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K1000150";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%B1%B8%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",K1000160";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%B1%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۿ���1��":
			crolling.area += ",K1000170";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ۿ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۿ���2��":
			crolling.area += ",K1000180";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ۿ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۿ���3��":
			crolling.area += ",K1000190";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ۿ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�1��":
			crolling.area += ",K1000200";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���е�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�2��":
			crolling.area += ",K1000210";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���е�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�3��":
			crolling.area += ",K1000220";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���е�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż���":
			crolling.area += ",K1000230";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%BB%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K1000240";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ1��":
			crolling.area += ",K1000250";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ2��":
			crolling.area += ",K1000260";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ3��":
			crolling.area += ",K1000270";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			crolling.area += ",K1000280";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",K1000290";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",K1000300";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EE%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",K1000310";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%BF%EE%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K1000320";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area +=",K1000330";
			wewe.area="032%7C%7C%C1%DF%B1%B8%7C%7C%C0%B2%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���յ�":
			crolling.area += ",K1000340";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",K1000350";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",K1000360";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߻굿":
			crolling.area += ",K1000370";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�1��":
			crolling.area += ",K1000380";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�2��":
			crolling.area += ",K1000390";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�3��":
			crolling.area += ",K1000400";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�4��":
			crolling.area += ",K1000410";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�1��":
			crolling.area += ",K1000420";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�2��":
			crolling.area += ",K1000430";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�3��":
			crolling.area += ",K1000440";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�4��":
			crolling.area += ",K1000450";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�5��":
			crolling.area += ",K1000460";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�6��":
			crolling.area += ",K1000470";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�7��":
			crolling.area += ",K1000480";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D7%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�׵�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�1��":
			crolling.area += ",K1000490";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�2��":
			crolling.area += ",K1000500";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�3��":
			crolling.area += ",K1000510";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�4��":
			crolling.area += ",K1000520";
			wewe.area += "032%7C%7C%C1%DF%B1%B8%7C%7C%C7%D8%BE%C8%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
