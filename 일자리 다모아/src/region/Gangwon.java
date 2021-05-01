package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Gangwon {
	public boolean flag;

	public void GangwonCity(ActionEvent e) {
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
		case "������":
			crolling.area += ",A0100010";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%AD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100020";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߼ҵ�":
			crolling.area += ",A0100030";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B0%DF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߼ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0100060";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",A0100040";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",A0100050";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100070";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%B8%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",A0100080";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B1%DD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",A0100090";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100100";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%B2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",A0100110";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%B2%C7%D7%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",A0100120";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",A0100130";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B3%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",A0100140";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B4%E3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100150";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B4%EB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ굿":
			crolling.area += ",A0100160";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B5%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",A0100170";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B8%ED%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڿ���":
			crolling.area += ",A0100180";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%B9%DA%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",A0100190";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BA%B4%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A0100200";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BB%E7%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100210";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100220";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0100230";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100240";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",A0100250";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BD%C5%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100260";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BE%C8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0100270";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%AC%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0100280";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%C1%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A0100290";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ջ��":
			crolling.area += ",A0100300";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%D5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ջ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			crolling.area += ",A0100310";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",A0100320";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100330";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%EE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",A0100340";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%BF%F9%C8%A3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",A0100350";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%AF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A0100360";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӵ絿":
			crolling.area += ",A0100370";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%D3%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ӵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծϵ�":
			crolling.area += ",A0100380";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%D4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ծϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100390";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%E5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0100400";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ�����":
			crolling.area += ",A0100410";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%D6%B9%AE%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",A0100420";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%D7%C7%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100430";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C1%F6%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",A0100440";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C3%BB%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʴ絿":
			crolling.area += ",A0100450";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C3%CA%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʴ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0100480";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",A0100460";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",A0100470";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C6%F7%B3%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�е�":
			crolling.area += ",A0100490";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",A0100500";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C8%AB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�굿":
			crolling.area += ",A0100510";
			wewe.area += "033%7C%7C%B0%AD%B8%AA%BD%C3%7C%7C%C8%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0200010";
			wewe.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%A3%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0200020";
			wewe.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%C5%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׿ո�":
			crolling.area += ",A0200030";
			wewe.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C1%D7%BF%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�׿ո�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伺��":
			crolling.area += ",A0200040";
			wewe.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C5%E4%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�伺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0200050";
			wewe.area += "033%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%F6%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0300010";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%AB%B6%F5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",A0300020";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%B8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",A0300030";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%B8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϳ":
			crolling.area += ",A0300040";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B1%CD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ϳ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			crolling.area += ",A0300050";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B3%AA%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0300060";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܺ���":
			crolling.area += ",A0300070";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%DC%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܺ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޹浿":
			crolling.area += ",A0300080";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%DE%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޹浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱸��":
			crolling.area += ",A0300090";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%EB%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뱸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0300100";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B4%EB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",A0300110";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ��":
			crolling.area += ",A0300120";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B5%BF%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			crolling.area += ",A0300130";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B8%B8%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0300140";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B8%C1%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ����":
			crolling.area += ",A0300150";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B9%AC%C8%A3%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ѵ�":
			crolling.area += ",A0300160";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%B9%DF%C7%D1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ѵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			crolling.area += ",A0300170";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0300190";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%CF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A0300200";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BA%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",A0300210";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BB%EF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ؽü�����":
			crolling.area += ",A0300220";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ؽü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",A0300230";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BC%E2%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",A0300240";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ":
			crolling.area += ",A0300250";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BD%C9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��޵�":
			crolling.area += ",A0300260";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BE%EE%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0300270";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�⵿̱":
			crolling.area += ",A0300280";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�⵿̱");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			crolling.area += ",A0300290";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̷ε�":
			crolling.area += ",A0300300";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C0%CC%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̷ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0300310";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C1%F6%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",A0300320";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C1%F6%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�":
			crolling.area += ",A0300330";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%B5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʱ���":
			crolling.area += ",A0300340";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%CA%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ϵ�":
			crolling.area += ",A0300350";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C3%DF%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򸪵�":
			crolling.area += ",A0300360";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C6%F2%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򸪵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",A0300370";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C8%A3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ����":
			crolling.area += ",A0300380";
			wewe.area += "033%7C%7C%B5%BF%C7%D8%BD%C3%7C%7C%C8%BF%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0400010";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A0400020";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%A5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400030";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B0%C7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô�ñ���":
			crolling.area += ",A0400040";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô�ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٴ���":
			crolling.area += ",A0400050";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%D9%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ굿":
			crolling.area += ",A0400060";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B1%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",A0400070";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0400080";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B3%EB%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400090";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B4%E7%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",A0400100";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%B5%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400110";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%B5%B0%E8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0400120";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B5%EE%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���޵�":
			crolling.area += ",A0400130";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B8%B6%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0400140";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B8%B6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̷θ�":
			crolling.area += ",A0400150";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%B9%CC%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̷θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400160";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô�ü�����":
			crolling.area += ",A0400170";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô�ü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô�ü�����":
			crolling.area += ",A0400180";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô�ü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",A0400190";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű��":
			crolling.area += ",A0400200";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BD%C5%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ű��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",A0400210";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%C0%BA%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",A0400220";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%C0%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400230";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%EC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",A0400240";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400250";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%BF%F8%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0400260";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%BE%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",A0400270";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%BE%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڿ���":
			crolling.area += ",A0400280";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%DA%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			crolling.area += ",A0400290";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C0%FB%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0400300";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",A0400310";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0400320";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%B6%BA%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",A0400330";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0400340";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C6%F2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0400350";
			wewe.area += "033%7C%7C%BB%EF%C3%B4%BD%C3%7C%7C%C7%CF%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʽñ���":
			crolling.area += ",A0500010";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʽñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",A0500020";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",A0500030";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B3%EB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0500040";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0500050";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B5%B5%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0500060";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%B5%BF%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",A0500070";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%BC%B3%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0500080";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%BF%B5%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",A0500090";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",A0500100";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",A0500110";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�е�":
			crolling.area += ",A0500120";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûȣ��":
			crolling.area += ",A0500130";
			wewe.area += "033%7C%7C%BC%D3%C3%CA%BD%C3%7C%7C%C3%BB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0600010";
			wewe.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0600020";
			wewe.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0600030";
			wewe.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%B9%E6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�籸��":
			crolling.area += ",A0600040";
			wewe.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%BE%E7%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�籸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȸ�":
			crolling.area += ",A0600050";
			wewe.area += "033%7C%7C%BE%E7%B1%B8%B1%BA%7C%7C%C7%D8%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0700010";
			wewe.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%B0%AD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0700020";
			wewe.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�վ��":
			crolling.area += ",A0700030";
			wewe.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BC%D5%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�վ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0700040";
			wewe.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%BE%E7%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0700050";
			wewe.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%C7%F6%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",A0700060";
			wewe.area += "033%7C%7C%BE%E7%BE%E7%B1%BA%7C%7C%C7%F6%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��񰫸�":
			crolling.area += ",A0800090";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%B1%E8%BB%F1%B0%AB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��񰫸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			crolling.area += ",A0800010";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			crolling.area += ",A0800050";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			crolling.area += ",A0800020";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0800030";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BB%F3%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0800060";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%BF%B5%BF%F9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A0800070";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			crolling.area += ",A0800080";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C1%DF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ѹݵ���":
			crolling.area += ",A0800040";
			wewe.area += "033%7C%7C%BF%B5%BF%F9%B1%BA%7C%7C%C7%D1%B9%DD%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ѹݵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0900010";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%A1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",A0900020";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0900030";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B0%FC%BC%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ���":
			crolling.area += ",A0900040";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B1%CD%B7%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܰ赿":
			crolling.area += ",A0900050";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B4%DC%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܱ���":
			crolling.area += ",A0900060";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B4%DC%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0900090";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",A0900070";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",A0900080";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B8%ED%B7%FB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",A0900100";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%AB%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0900110";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%AE%B8%B7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			crolling.area += ",A0900120";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%B9%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",A0900130";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ηи�":
			crolling.area += ",A0900140";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BA%CE%B7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ηи�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			crolling.area += ",A0900150";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BC%D2%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ���":
			crolling.area += ",A0900160";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BD%C5%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",A0900170";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A0900180";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε�":
			crolling.area += ",A0900190";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ굿":
			crolling.area += ",A0900200";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C0%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽ��߾ӵ�":
			crolling.area += ",A0900210";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A0900220";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C1%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",A0900250";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",A0900230";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",A0900240";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C5%C2%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǻθ�":
			crolling.area += ",A0900260";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C6%C7%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ǻθ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0900270";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C6%F2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�м���":
			crolling.area += ",A0900280";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C7%D0%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�м���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�౸��":
			crolling.area += ",A0900290";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C7%E0%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�౸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",A0900300";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C8%A3%C0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A0900310";
			wewe.area += "033%7C%7C%BF%F8%C1%D6%BD%C3%7C%7C%C8%EF%BE%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�⸰��":
			crolling.area += ",A1000010";
			wewe.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%B1%E2%B8%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�⸮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			crolling.area += ",A1000020";
			wewe.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������ϸ�":
			crolling.area += ",A1000030";
			wewe.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�������ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󳲸�":
			crolling.area += ",A1000040";
			wewe.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BB%F3%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󳲸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",A1000050";
			wewe.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%BC%AD%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1000060";
			wewe.area += "033%7C%7C%C0%CE%C1%A6%B1%BA%7C%7C%C0%CE%C1%A6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1100010";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%B0%ED%C7%D1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			crolling.area += ",A1100020";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1100050";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BA%CF%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1100060";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BB%E7%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ���":
			crolling.area += ",A1100070";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BD%C5%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1100040";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%BF%A9%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӱ��":
			crolling.area += ",A1100080";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C0%D3%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1100090";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C1%A4%BC%B1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϸ�":
			crolling.area += ",A1100030";
			wewe.area += "033%7C%7C%C1%A4%BC%B1%B1%BA%7C%7C%C8%AD%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1200010";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B0%A5%B8%BB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٳ���":
			crolling.area += ",A1200020";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%D9%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٺϸ�":
			crolling.area += ",A1200030";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%D9%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٺϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",A1200040";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B1%E8%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1200050";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%B5%BF%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö��������":
			crolling.area += ",A1200060";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ö��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö����":
			crolling.area += ",A1200070";
			wewe.area += "033%7C%7C%C3%B6%BF%F8%B1%BA%7C%7C%C3%B6%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ö����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ñ���":
			crolling.area += ",A1300010";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",A1300020";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B1%D9%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1300030";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ó���":
			crolling.area += ",A1300040";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ó���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1300050";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B3%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1300060";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�õ���":
			crolling.area += ",A1300070";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�õ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1300080";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%B5%BF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",A1300090";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BA%C0%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ��":
			crolling.area += ",A1300100";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BA%CF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",A1300110";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%E7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",A1300120";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%E7%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A1300130";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BB%EF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ü���":
			crolling.area += ",A1300140";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ü���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",A1300150";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%AE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��1��":
			crolling.area += ",A1300160";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��2��":
			crolling.area += ",A1300170";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��3��":
			crolling.area += ",A1300180";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��4��":
			crolling.area += ",A1300190";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%D2%BE%E7%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۾ϵ�":
			crolling.area += ",A1300200";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BC%DB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",A1300210";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ���":
			crolling.area += ",A1300220";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			crolling.area += ",A1300230";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BD%C5%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",A1300240";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BE%E0%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ÿ�õ��":
			crolling.area += ",A1300250";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ÿ�õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",A1300260";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%C2%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�伱��":
			crolling.area += ",A1300270";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%E4%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�伱��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			crolling.area += ",A1300280";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%EC%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",A1300290";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%BF%EE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�����絿":
			crolling.area += ",A1300300";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%B6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�����絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			crolling.area += ",A1300310";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			crolling.area += ",A1300320";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�1��":
			crolling.area += ",A1300330";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�2��":
			crolling.area += ",A1300340";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�3��":
			crolling.area += ",A1300350";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",A1300360";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C4%A5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			crolling.area += ",A1300370";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C5%F0%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�":
			crolling.area += ",A1300410";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��1��":
			crolling.area += ",A1300380";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��2��":
			crolling.area += ",A1300390";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��3��":
			crolling.area += ",A1300400";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%BF%C0%DA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A1300450";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",A1300420";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",A1300430";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",A1300440";
			wewe.area += "033%7C%7C%C3%E1%C3%B5%BD%C3%7C%7C%C8%C4%C6%F23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ҵ�":
			crolling.area += ",A1400010";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B1%B8%B9%AE%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A1400020";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B1%DD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1400030";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B5%BF%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",A1400040";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B9%AE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",A1400050";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%B9%E9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1400060";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%EF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",A1400070";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%F3%BB%E7%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",A1400080";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BB%F3%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҵ���":
			crolling.area += ",A1400090";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BC%D2%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¹�ÿ���":
			crolling.area += ",A1400100";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¹�ÿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强��":
			crolling.area += ",A1400110";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�强��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1400120";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C0%FB%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",A1400130";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C1%B6%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�׵�":
			crolling.area += ",A1400140";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C3%A2%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö�ϵ�":
			crolling.area += ",A1400150";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C3%B6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ö�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			crolling.area += ",A1400160";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�̵�":
			crolling.area += ",A1400170";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C7%CF%BB%E7%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A1400180";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C7%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",A1400190";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			crolling.area += ",A1400200";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%B2%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			crolling.area += ",A1400210";
			wewe.area += "033%7C%7C%C5%C2%B9%E9%BD%C3%7C%7C%C8%B2%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ɸ�":
			crolling.area += ",A1500020";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B4%EB%B0%FC%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",A1500010";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B4%EB%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",A1500030";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B9%CC%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�渲��":
			crolling.area += ",A1500040";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%B9%E6%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�渲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1500050";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%BA%C0%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1500060";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%BF%EB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",A1500070";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%C1%F8%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",A1500080";
			wewe.area += "033%7C%7C%C6%F2%C3%A2%B1%BA%7C%7C%C6%F2%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ������":
			crolling.area += ",A1600010";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",A1600020";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",A1600030";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B3%BB%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ������":
			crolling.area += ",A1600040";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",A1600050";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%B5%CE%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ��":
			crolling.area += ",A1600060";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BA%CF%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ������":
			crolling.area += ",A1600070";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1600080";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%BC%AD%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫõ��":
			crolling.area += ",A1600090";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%C8%AB%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȫõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�̸�":
			crolling.area += ",A1600100";
			wewe.area += "033%7C%7C%C8%AB%C3%B5%B1%BA%7C%7C%C8%AD%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1700010";
			wewe.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%B0%A3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�系��":
			crolling.area += ",A1700020";
			wewe.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%BB%E7%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�系��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭸�":
			crolling.area += ",A1700030";
			wewe.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%BB%F3%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󼭸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			crolling.area += ",A1700040";
			wewe.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%C7%CF%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭõ��":
			crolling.area += ",A1700050";
			wewe.area += "033%7C%7C%C8%AD%C3%B5%B1%BA%7C%7C%C8%AD%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȭõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A1800010";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%A9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1800020";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%AD%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ٸ�":
			crolling.area += ",A1800030";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B0%F8%B1%D9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ٸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�г���":
			crolling.area += ",A1800040";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%B5%D0%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�г���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",A1800050";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BC%AD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",A1800060";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BE%C8%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",A1800070";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%BF%EC%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			crolling.area += ",A1800080";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%C3%BB%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ⱦ����":
			crolling.area += ",A1800090";
			wewe.area += "033%7C%7C%C8%BE%BC%BA%B1%BA%7C%7C%C8%BE%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("Ⱦ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
