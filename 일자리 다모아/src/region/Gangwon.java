package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Gangwon {
	public boolean flag;

	public void GangwonCity(ActionEvent e) {
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
		case "������":
			Albamoncrolling.area += ",A0100010";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100020";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߼ҵ�":
			Albamoncrolling.area += ",A0100030";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%DF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߼ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0100060";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",A0100040";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",A0100050";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100070";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B8%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",A0100080";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%DD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",A0100090";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100100";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%B2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",A0100110";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%B2%C7%D7%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",A0100120";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",A0100130";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",A0100140";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B4%E3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100150";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B4%EB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ굿":
			Albamoncrolling.area += ",A0100160";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B5%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",A0100170";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B8%ED%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڿ���":
			Albamoncrolling.area += ",A0100180";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B9%DA%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",A0100190";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BA%B4%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A0100200";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BB%E7%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100210";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100220";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0100230";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100240";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",A0100250";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BD%C5%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100260";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BE%C8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0100270";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%AC%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0100280";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%C1%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A0100290";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ջ��":
			Albamoncrolling.area += ",A0100300";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%D5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ջ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			Albamoncrolling.area += ",A0100310";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",A0100320";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100330";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",A0100340";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%F9%C8%A3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",A0100350";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%AF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A0100360";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӵ絿":
			Albamoncrolling.area += ",A0100370";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%D3%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ӵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծϵ�":
			Albamoncrolling.area += ",A0100380";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%D4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ծϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100390";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%E5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0100400";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ�����":
			Albamoncrolling.area += ",A0100410";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%D6%B9%AE%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",A0100420";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%D7%C7%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100430";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%F6%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",A0100440";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C3%BB%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʴ絿":
			Albamoncrolling.area += ",A0100450";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C3%CA%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʴ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0100480";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",A0100460";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",A0100470";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�е�":
			Albamoncrolling.area += ",A0100490";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",A0100500";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C8%AB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�굿":
			Albamoncrolling.area += ",A0100510";
			AlbaHeavencrolling.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C8%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0200010";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%A3%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0200020";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%C5%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׿ո�":
			Albamoncrolling.area += ",A0200030";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C1%D7%BF%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�׿ո�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��":
			Albamoncrolling.area += ",A0200040";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C5%E4%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�伺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0200050";
			AlbaHeavencrolling.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%F6%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0300010";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%AB%B6%F5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",A0300020";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%B8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",A0300030";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%B8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϳ":
			Albamoncrolling.area += ",A0300040";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%CD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ϳ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			Albamoncrolling.area += ",A0300050";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B3%AA%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0300060";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܺ���":
			Albamoncrolling.area += ",A0300070";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%DC%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܺ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޹浿":
			Albamoncrolling.area += ",A0300080";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%DE%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޹浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱸��":
			Albamoncrolling.area += ",A0300090";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%EB%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뱸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0300100";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%EB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",A0300110";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ��":
			Albamoncrolling.area += ",A0300120";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B5%BF%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			Albamoncrolling.area += ",A0300130";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B8%B8%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0300140";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B8%C1%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ����":
			Albamoncrolling.area += ",A0300150";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B9%AC%C8%A3%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ѵ�":
			Albamoncrolling.area += ",A0300160";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B9%DF%C7%D1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ѵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			Albamoncrolling.area += ",A0300170";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0300190";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%CF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A0300200";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",A0300210";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BB%EF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ؽü�����":
			Albamoncrolling.area += ",A0300220";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ؽü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",A0300230";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BC%E2%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",A0300240";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ":
			Albamoncrolling.area += ",A0300250";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��޵�":
			Albamoncrolling.area += ",A0300260";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BE%EE%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0300270";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�⵿̱":
			Albamoncrolling.area += ",A0300280";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�⵿̱");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			Albamoncrolling.area += ",A0300290";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̷ε�":
			Albamoncrolling.area += ",A0300300";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̷ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0300310";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C1%F6%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",A0300320";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C1%F6%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�":
			Albamoncrolling.area += ",A0300330";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%B5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʱ���":
			Albamoncrolling.area += ",A0300340";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%CA%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ϵ�":
			Albamoncrolling.area += ",A0300350";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%DF%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򸪵�":
			Albamoncrolling.area += ",A0300360";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C6%F2%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򸪵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",A0300370";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C8%A3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ����":
			Albamoncrolling.area += ",A0300380";
			AlbaHeavencrolling.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C8%BF%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0400010";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A0400020";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%A5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400030";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%C7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô�ñ���":
			Albamoncrolling.area += ",A0400040";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô�ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٴ���":
			Albamoncrolling.area += ",A0400050";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%D9%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ굿":
			Albamoncrolling.area += ",A0400060";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",A0400070";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0400080";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B3%EB%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400090";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B4%E7%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",A0400100";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%B5%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400110";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%B5%B0%E8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0400120";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%EE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���޵�":
			Albamoncrolling.area += ",A0400130";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B8%B6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0400140";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B8%B6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̷θ�":
			Albamoncrolling.area += ",A0400150";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B9%CC%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̷θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400160";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô�ü�����":
			Albamoncrolling.area += ",A0400170";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô�ü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô�ü�����":
			Albamoncrolling.area += ",A0400180";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô�ü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",A0400190";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű��":
			Albamoncrolling.area += ",A0400200";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BD%C5%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ű��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",A0400210";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%C0%BA%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",A0400220";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%C0%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400230";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%EC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",A0400240";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400250";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%F8%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0400260";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%BE%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",A0400270";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%BE%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڿ���":
			Albamoncrolling.area += ",A0400280";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%DA%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			Albamoncrolling.area += ",A0400290";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%FB%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0400300";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",A0400310";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0400320";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%B6%BA%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",A0400330";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0400340";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C6%F2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0400350";
			AlbaHeavencrolling.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C7%CF%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʽñ���":
			Albamoncrolling.area += ",A0500010";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʽñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",A0500020";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",A0500030";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B3%EB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0500040";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0500050";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B5%B5%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0500060";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B5%BF%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",A0500070";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%BC%B3%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0500080";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%BF%B5%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",A0500090";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",A0500100";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",A0500110";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�е�":
			Albamoncrolling.area += ",A0500120";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûȣ��":
			Albamoncrolling.area += ",A0500130";
			AlbaHeavencrolling.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C3%BB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0600010";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0600020";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0600030";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B9%E6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�籸��":
			Albamoncrolling.area += ",A0600040";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%BE%E7%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�籸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȸ�":
			Albamoncrolling.area += ",A0600050";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%C7%D8%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0700010";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%B0%AD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0700020";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�վ��":
			Albamoncrolling.area += ",A0700030";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BC%D5%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�վ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0700040";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BE%E7%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0700050";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%C7%F6%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",A0700060";
			AlbaHeavencrolling.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%C7%F6%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��񰫸�":
			Albamoncrolling.area += ",A0800090";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%B1%E8%BB%F1%B0%AB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��񰫸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			Albamoncrolling.area += ",A0800010";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			Albamoncrolling.area += ",A0800050";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			Albamoncrolling.area += ",A0800020";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0800030";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BB%F3%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0800060";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BF%B5%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A0800070";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			Albamoncrolling.area += ",A0800080";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C1%DF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ѹݵ���":
			Albamoncrolling.area += ",A0800040";
			AlbaHeavencrolling.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C7%D1%B9%DD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ѹݵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0900010";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%A1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",A0900020";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0900030";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%FC%BC%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ���":
			Albamoncrolling.area += ",A0900040";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B1%CD%B7%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܰ赿":
			Albamoncrolling.area += ",A0900050";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B4%DC%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܱ���":
			Albamoncrolling.area += ",A0900060";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B4%DC%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0900090";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",A0900070";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",A0900080";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",A0900100";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%AB%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0900110";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%AE%B8%B7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			Albamoncrolling.area += ",A0900120";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",A0900130";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ηи�":
			Albamoncrolling.area += ",A0900140";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BA%CE%B7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ηи�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			Albamoncrolling.area += ",A0900150";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BC%D2%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ���":
			Albamoncrolling.area += ",A0900160";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BD%C5%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",A0900170";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A0900180";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε�":
			Albamoncrolling.area += ",A0900190";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ굿":
			Albamoncrolling.area += ",A0900200";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C0%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽ��߾ӵ�":
			Albamoncrolling.area += ",A0900210";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A0900220";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C1%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",A0900250";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",A0900230";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",A0900240";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǻθ�":
			Albamoncrolling.area += ",A0900260";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C6%C7%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ǻθ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0900270";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C6%F2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�м���":
			Albamoncrolling.area += ",A0900280";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C7%D0%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�м���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�౸��":
			Albamoncrolling.area += ",A0900290";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C7%E0%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�౸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",A0900300";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C8%A3%C0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A0900310";
			AlbaHeavencrolling.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C8%EF%BE%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�⸰��":
			Albamoncrolling.area += ",A1000010";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%B1%E2%B8%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�⸮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			Albamoncrolling.area += ",A1000020";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������ϸ�":
			Albamoncrolling.area += ",A1000030";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�������ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󳲸�":
			Albamoncrolling.area += ",A1000040";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BB%F3%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󳲸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",A1000050";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BC%AD%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1000060";
			AlbaHeavencrolling.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%C0%CE%C1%A6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1100010";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%B0%ED%C7%D1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			Albamoncrolling.area += ",A1100020";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1100050";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BA%CF%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1100060";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BB%E7%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ���":
			Albamoncrolling.area += ",A1100070";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BD%C5%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1100040";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BF%A9%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӱ��":
			Albamoncrolling.area += ",A1100080";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C0%D3%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1100090";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C1%A4%BC%B1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϸ�":
			Albamoncrolling.area += ",A1100030";
			AlbaHeavencrolling.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C8%AD%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1200010";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B0%A5%B8%BB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٳ���":
			Albamoncrolling.area += ",A1200020";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%D9%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٺϸ�":
			Albamoncrolling.area += ",A1200030";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%D9%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٺϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",A1200040";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%E8%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1200050";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B5%BF%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö��������":
			Albamoncrolling.area += ",A1200060";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ö��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö����":
			Albamoncrolling.area += ",A1200070";
			AlbaHeavencrolling.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%C3%B6%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ö����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ñ���":
			Albamoncrolling.area += ",A1300010";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",A1300020";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B1%D9%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1300030";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ó���":
			Albamoncrolling.area += ",A1300040";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ó���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1300050";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1300060";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�õ���":
			Albamoncrolling.area += ",A1300070";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�õ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1300080";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",A1300090";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BA%C0%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ��":
			Albamoncrolling.area += ",A1300100";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BA%CF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",A1300110";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%E7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			Albamoncrolling.area += ",A1300120";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%E7%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A1300130";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%EF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ü���":
			Albamoncrolling.area += ",A1300140";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ü���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",A1300150";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%AE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��1��":
			Albamoncrolling.area += ",A1300160";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��2��":
			Albamoncrolling.area += ",A1300170";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��3��":
			Albamoncrolling.area += ",A1300180";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��4��":
			Albamoncrolling.area += ",A1300190";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۾ϵ�":
			Albamoncrolling.area += ",A1300200";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%DB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			Albamoncrolling.area += ",A1300210";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ���":
			Albamoncrolling.area += ",A1300220";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			Albamoncrolling.area += ",A1300230";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",A1300240";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BE%E0%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ÿ�õ��":
			Albamoncrolling.area += ",A1300250";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ÿ�õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",A1300260";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%C2%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伱��":
			Albamoncrolling.area += ",A1300270";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%E4%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伱��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			Albamoncrolling.area += ",A1300280";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%EC%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",A1300290";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%EE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�����絿":
			Albamoncrolling.area += ",A1300300";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�����絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			Albamoncrolling.area += ",A1300310";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			Albamoncrolling.area += ",A1300320";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�1��":
			Albamoncrolling.area += ",A1300330";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�2��":
			Albamoncrolling.area += ",A1300340";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�3��":
			Albamoncrolling.area += ",A1300350";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			Albamoncrolling.area += ",A1300360";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C4%A5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			Albamoncrolling.area += ",A1300370";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C5%F0%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�":
			Albamoncrolling.area += ",A1300410";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��1��":
			Albamoncrolling.area += ",A1300380";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��2��":
			Albamoncrolling.area += ",A1300390";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��3��":
			Albamoncrolling.area += ",A1300400";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A1300450";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",A1300420";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",A1300430";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",A1300440";
			AlbaHeavencrolling.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ҵ�":
			Albamoncrolling.area += ",A1400010";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B1%B8%B9%AE%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A1400020";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B1%DD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1400030";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B5%BF%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",A1400040";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B9%AE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",A1400050";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B9%E9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1400060";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%EF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",A1400070";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%F3%BB%E7%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",A1400080";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%F3%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҵ���":
			Albamoncrolling.area += ",A1400090";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BC%D2%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¹�ÿ���":
			Albamoncrolling.area += ",A1400100";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¹�ÿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强��":
			Albamoncrolling.area += ",A1400110";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�强��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1400120";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C0%FB%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",A1400130";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C1%B6%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�׵�":
			Albamoncrolling.area += ",A1400140";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C3%A2%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö�ϵ�":
			Albamoncrolling.area += ",A1400150";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C3%B6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			Albamoncrolling.area += ",A1400160";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�̵�":
			Albamoncrolling.area += ",A1400170";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C7%CF%BB%E7%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A1400180";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C7%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",A1400190";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",A1400200";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%B2%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",A1400210";
			AlbaHeavencrolling.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%B2%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ɸ�":
			Albamoncrolling.area += ",A1500020";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B4%EB%B0%FC%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",A1500010";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B4%EB%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",A1500030";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B9%CC%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�渲��":
			Albamoncrolling.area += ",A1500040";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B9%E6%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�渲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1500050";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%BA%C0%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1500060";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%BF%EB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			Albamoncrolling.area += ",A1500070";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%C1%F8%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",A1500080";
			AlbaHeavencrolling.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%C6%F2%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ������":
			Albamoncrolling.area += ",A1600010";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",A1600020";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",A1600030";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%BB%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ������":
			Albamoncrolling.area += ",A1600040";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",A1600050";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B5%CE%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ��":
			Albamoncrolling.area += ",A1600060";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BA%CF%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ������":
			Albamoncrolling.area += ",A1600070";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1600080";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BC%AD%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ��":
			Albamoncrolling.area += ",A1600090";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%C8%AB%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�̸�":
			Albamoncrolling.area += ",A1600100";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%C8%AD%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1700010";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%B0%A3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�系��":
			Albamoncrolling.area += ",A1700020";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%BB%E7%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�系��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭸�":
			Albamoncrolling.area += ",A1700030";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%BB%F3%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󼭸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			Albamoncrolling.area += ",A1700040";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%C7%CF%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭõ��":
			Albamoncrolling.area += ",A1700050";
			AlbaHeavencrolling.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%C8%AD%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȭõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A1800010";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%A9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1800020";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%AD%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ٸ�":
			Albamoncrolling.area += ",A1800030";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%F8%B1%D9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ٸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�г���":
			Albamoncrolling.area += ",A1800040";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B5%D0%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�г���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",A1800050";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BC%AD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",A1800060";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BE%C8%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",A1800070";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BF%EC%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			Albamoncrolling.area += ",A1800080";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%C3%BB%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ⱦ����":
			Albamoncrolling.area += ",A1800090";
			AlbaHeavencrolling.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%C8%BE%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("Ⱦ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
