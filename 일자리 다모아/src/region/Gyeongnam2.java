package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Gyeongnam2 {
	public boolean flag;

	public void Gyeongnam2City(ActionEvent e) {
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

		// â���� ����������
		case "������":
			crolling.area += ",C1600010";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B0%A1%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",C1600020";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B1%B3%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600030";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B1%B3%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1600040";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B1%B8%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600080";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B3%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�볻��":
			crolling.area += ",C1600100";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�볻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��1��":
			crolling.area += ",C1600120";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��2��":
			crolling.area += ",C1600130";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܵ�":
			crolling.area += ",C1600140";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",C1600150";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%EB%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600160";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B4%F6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600170";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%BF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���1��":
			crolling.area += ",C1600190";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%CE%BF%F9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ο���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���2��":
			crolling.area += ",C1600200";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%CE%BF%F9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ο���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���3��":
			crolling.area += ",C1600210";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B5%CE%BF%F9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ο���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",C1600230";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",C1600240";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			crolling.area += ",C1600260";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",C1600290";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BB%EA%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󳲵�":
			crolling.area += ",C1600320";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BB%F3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󳲵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600330";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BC%AD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",C1600370";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BC%BA%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600380";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",C1600390";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",C1600400";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",C1600420";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",C1600430";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",C1600440";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",C1600480";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%B9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600490";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%C0%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			crolling.area += ",C1600500";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%CF%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",C1600510";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",C1600530";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",C1600540";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			crolling.area += ",C1600550";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			crolling.area += ",C1600560";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			crolling.area += ",C1600570";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600600";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600610";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%BF%F9%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",C1600620";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%AF%B7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڻ굿":
			crolling.area += ",C1600630";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%DA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屺��1��":
			crolling.area += ",C1600650";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�屺��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屺��2��":
			crolling.area += ",C1600660";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�屺��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屺��3��":
			crolling.area += ",C1600670";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�屺��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屺��4��":
			crolling.area += ",C1600680";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�屺��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屺��5��":
			crolling.area += ",C1600690";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C0%E5%B1%BA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�屺��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߼���":
			crolling.area += ",C1600700";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�1��":
			crolling.area += ",C1600720";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�2��":
			crolling.area += ",C1600730";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�3��":
			crolling.area += ",C1600740";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600750";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%F8%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",C1600760";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%F8%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1600770";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C1%F8%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��":
			crolling.area += ",C1600780";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����1��":
			crolling.area += ",C1600800";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����2��":
			crolling.area += ",C1600810";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����3��":
			crolling.area += ",C1600820";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�赿":
			crolling.area += ",C1600830";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߻굿":
			crolling.area += ",C1600840";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C3%DF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",C1600850";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؿ":
			crolling.area += ",C1600890";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C7%D8%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ؿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1600900";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",C1600910";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C8%AB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",C1600920";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C7%D5%C6%F7%B1%B8%7C%7C%C8%AD%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// â���� ����ȸ����
		case "���ϵ�":
			crolling.area += ",C1620070";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",C1620050";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B1%B8%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += "C1620060";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B1%B8%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1620090";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B3%BB%BC%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			crolling.area += ",C1620220";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%B5%CE%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",C1620250";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BA%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1620360";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BC%AE%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",C1620340";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BC%AE%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",C1620350";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BC%AE%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1620470";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BE%E7%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",C1620450";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BE%E7%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",C1620460";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%BE%E7%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ռ���":
			crolling.area += ",C1620880";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C7%D5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ռ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ռ�1��":
			crolling.area += ",C1620860";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C7%D5%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ռ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ռ�2��":
			crolling.area += ",C1620870";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C7%D5%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ռ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",C1620930";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",C1620960";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ��1��":
			crolling.area += ",C1620940";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ��2��":
			crolling.area += ",C1620950";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%B8%B6%BB%EA%C8%B8%BF%F8%B1%B8%7C%7C%C8%B8%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// â���� ���걸
		case "������":
			crolling.area += ",C1640010";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B0%A1%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",C1640020";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B0%A1%C0%BD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͱ":
			crolling.area += ",C1640030";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B1%CD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͱ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͻ굿":
			crolling.area += ",C1640040";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B1%CD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1640050";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B1%CD%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",C1640060";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",C1640070";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1640080";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%B2%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1640090";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",C1640110";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݸ���":
			crolling.area += ",C1640220";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B9%DD%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ۵�":
			crolling.area += ",C1640230";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B9%DD%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1640240";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%B9%DD%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҹ�굿":
			crolling.area += ",C1640290";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BA%D2%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ҹ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�":
			crolling.area += ",C1640310";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%E7%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",C1640320";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%E7%C6%C4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ڵ�":
			crolling.area += ",C1640350";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%EF%C1%A4%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â���û󳲵�":
			crolling.area += ",C1640360";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%F3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â���û󳲵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󺹵�":
			crolling.area += ",C1640370";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BB%F3%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󺹵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",C1640400";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BC%BA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",C1640410";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BC%BA%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",C1640450";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȹε�":
			crolling.area += ",C1640460";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BE%C8%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȹε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C1640470";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BE%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼϵ�":
			crolling.area += ",C1640490";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%CF%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ�":
			crolling.area += ",C1640500";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1640540";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%F5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1640550";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%BF%F9%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1640560";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C0%FB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",C1640580";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�":
			crolling.area += ",C1640610";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C3%A2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			crolling.area += ",C1640620";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C3%B5%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1640630";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%BC%BA%BB%EA%B1%B8%7C%7C%C5%E4%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// â���� ��â��
		case "������":
			crolling.area += ",C1660100";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B3%BB%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1660120";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1660130";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B4%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1660140";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B4%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",C1660150";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%B5%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1660160";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1660170";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%BF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�δ뵿":
			crolling.area += ",C1660180";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B5%CE%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�δ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C1660190";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B8%ED%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1660200";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B8%ED%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ赿":
			crolling.area += ",C1660210";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%B9%DD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",C1660250";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1660260";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%C0%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			crolling.area += ",C1660270";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			crolling.area += ",C1660280";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�縲��":
			crolling.area += ",C1660300";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BB%E7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�縲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",C1660330";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BB%E7%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵿ��":
			crolling.area += ",C1660340";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BB%EF%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",C1660380";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%AD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1660390";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%AD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ұ赿":
			crolling.area += ",C1660420";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%D2%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ұ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҵ䵿":
			crolling.area += ",C1660430";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BC%D2%B4%E4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ҵ䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â���ſ���":
			crolling.area += ",C1660440";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â���ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			crolling.area += ",C1660510";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1660520";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BF%EB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",C1660530";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%BF%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",C1660570";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			crolling.area += ",C1660590";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C1%F6%B1%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",C1660600";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C2%F7%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",C1660640";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C5%F0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȿ뵿":
			crolling.area += ",C1660650";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C0%C7%C3%A2%B1%B8%7C%7C%C6%C8%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȿ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// â���� ���ر�
		case "���ߵ�":
			crolling.area += ",C1680010";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B0%A1%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",C1680020";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B0%E6%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",C1680030";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B1%A4%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",C1680040";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B1%D9%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680050";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B3%B2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText(",������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1680060";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B3%B2%BA%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ر����絿":
			crolling.area += ",C1680070";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B3%B2%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ر����絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿵��":
			crolling.area += ",C1680080";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿵��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",C1680090";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",C1680100";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1680110";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",C1680120";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",C1680130";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B4%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680140";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%B5%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1680150";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1680160";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%BF%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε�":
			crolling.area += ",C1680170";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1680180";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B8%B6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C1680190";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",C1680200";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%B9%AB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",C1680210";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻε�":
			crolling.area += ",C1680220";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BA%CF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1680230";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BA%F1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",C1680240";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%AD%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1680250";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680260";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�һ絿":
			crolling.area += ",C1680270";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�һ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1680280";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%D3%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",C1680290";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%DB%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",C1680300";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680310";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%F6%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",C1680320";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",C1680330";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ر����ﵿ":
			crolling.area += ",C1680340";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ر����ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȱ":
			crolling.area += ",C1680350";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BE%C8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ȱ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȱ�":
			crolling.area += ",C1680360";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BE%C8%B0%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ȱ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ް":
			crolling.area += ",C1680370";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BE%DE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ް");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���µ�":
			crolling.area += ",C1680380";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%A9%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680390";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%AC%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1680400";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%EB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680410";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%BF%F8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�":
			crolling.area += ",C1680420";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͼ���":
			crolling.area += ",C1680430";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CD%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ絿":
			crolling.area += ",C1680440";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",C1680450";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680460";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%DA%C0%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1680470";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C0%E5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1680480";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%A6%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ�굿":
			crolling.area += ",C1680490";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%A6%C8%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�װ":
			crolling.area += ",C1680500";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%D7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�װ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ر��߾ӵ�":
			crolling.area += ",C1680510";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ر��߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1680520";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C1%DF%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",C1680530";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%A2%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ȵ�":
			crolling.area += ",C1680540";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%BB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��":
			crolling.area += ",C1680550";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",C1680560";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C3%E6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¹鵿":
			crolling.area += ",C1680570";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C5%C2%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¹鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1680580";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",C1680590";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C5%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",C1680600";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳȣ��":
			crolling.area += ",C1680610";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C7%B3%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",C1680620";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C7%E0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ر�����":
			crolling.area += ",C1680630";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ر�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭõ��":
			crolling.area += ",C1680640";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C8%AD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",C1680650";
			wewe.area = "055%7C%7C%C3%A2%BF%F8%BD%C3+%C1%F8%C7%D8%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �뿵��
		case "������":
			crolling.area += ",C1700010";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B1%A4%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			crolling.area += ",C1700020";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1700050";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1700060";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%B5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿵�õ�õ��":
			crolling.area += ",C1700070";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿵�õ�õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",C1700080";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1700090";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B8%ED%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1700100";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B9%AB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿵�ù�ȭ��":
			crolling.area += ",C1700110";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿵�ù�ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼�1��":
			crolling.area += ",C1700120";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("�̼�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼�2��":
			crolling.area += ",C1700130";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("�̼�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼���":
			crolling.area += ",C1700140";
			wewe.area = "55%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%B9%CC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1700150";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BA%C0%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͻŵ�":
			crolling.area += ",C1700160";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BA%CF%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͻŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�緮��":
			crolling.area += ",C1700170";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BB%E7%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�緮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1700180";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BB%EA%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",C1700190";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1700200";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BF%E5%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�볲��":
			crolling.area += ",C1700210";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%BF%EB%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�볲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1700220";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C0%CE%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1700230";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C1%A4%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿵���߾ӵ�":
			crolling.area += ",C1700240";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿵���߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿵������":
			crolling.area += ",C1700250";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿵������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򸲵�":
			crolling.area += ",C1700280";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C6%F2%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򸲵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ѻ��":
			crolling.area += ",C1700290";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C7%D1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ѻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׳���":
			crolling.area += ",C1700300";
			wewe.area = "055%7C%7C%C5%EB%BF%B5%BD%C3%7C%7C%C7%D7%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׳���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �ϵ���
		case "������":
			crolling.area += ",C1800010";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%B0%ED%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���":
			crolling.area += ",C1800020";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%B1%DD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",C1800030";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1800040";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BA%CF%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǿ��":
			crolling.area += ",C1800050";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BE%C7%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ǿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�纸��":
			crolling.area += ",C1800060";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BE%E7%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�纸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1800070";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%BF%C1%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1800080";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C0%FB%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1800090";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C1%F8%B1%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			crolling.area += ",C1800100";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C3%BB%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ���":
			crolling.area += ",C1800110";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C7%CF%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",C1800120";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C8%AD%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ⱦõ��":
			crolling.area += ",C1800130";
			wewe.area = "055%7C%7C%C7%CF%B5%BF%B1%BA%7C%7C%C8%BE%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ⱦõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �Ծȱ�
		case "������":
			crolling.area += ",C1900010";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B0%A1%BE%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",C1900020";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B1%BA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծȱ�����":
			crolling.area += ",C1900030";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ծȱ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1900040";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%B9%FD%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",C1900050";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%BB%EA%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			crolling.area += ",C1900060";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%BF%A9%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ�ϸ�":
			crolling.area += ",C1900070";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C4%A5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",C1900080";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C4%A5%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",C1900090";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C4%A5%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծȸ�":
			crolling.area += ",C1900100";
			wewe.area = "055%7C%7C%C7%D4%BE%C8%B1%BA%7C%7C%C7%D4%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ծȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �Ծ籺
		case "��õ��":
			crolling.area += ",C2000010";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%B8%B6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C2000020";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%B9%E9%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2000030";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BA%B4%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2000040";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BC%AD%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",C2000050";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BC%AD%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C2000060";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BC%F6%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			crolling.area += ",C2000070";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%BE%C8%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C2000080";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C0%AF%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2000090";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C1%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծ���":
			crolling.area += ",C2000100";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C7%D4%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ծ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C2000110";
			wewe.area = "055%7C%7C%C7%D4%BE%E7%B1%BA%7C%7C%C8%DE%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��õ��
		case "���߸�":
			crolling.area += ",C2100010";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B0%A1%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ��":
			crolling.area += ",C2100020";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B0%A1%C8%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺴��":
			crolling.area += ",C2100030";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B4%EB%BA%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뺴��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C2100040";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B4%EB%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2100050";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B4%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2100060";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%B9%A6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2100070";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰡ��":
			crolling.area += ",C2100080";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BB%EF%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ﰡ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֹ��":
			crolling.area += ",C2100090";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BD%D6%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ֹ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��å��":
			crolling.area += ",C2100100";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BD%D6%C3%A5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��å��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߷θ�":
			crolling.area += ",C2100110";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BE%DF%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�߷θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ָ�":
			crolling.area += ",C2100120";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%BF%EB%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ָ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C2100130";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C0%B2%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߸�":
			crolling.area += ",C2100140";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C0%FB%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",C2100150";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C3%BB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʰ��":
			crolling.area += ",C2100160";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C3%CA%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ʰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C2100170";
			wewe.area = "055%7C%7C%C7%D5%C3%B5%B1%BA%7C%7C%C7%D5%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}