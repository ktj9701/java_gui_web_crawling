package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;
public class Jeonbuk {
	public boolean flag;

	public void JeonbukCity(ActionEvent e) {
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
		case "�����":
			crolling.area += ",M0100010";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B0%ED%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",M0100020";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B0%ED%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0100030";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B0%F8%C0%BD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0100040";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0100050";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%B9%AB%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξȸ�":
			crolling.area += ",M0100060";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BA%CE%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ξȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",M0100070";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BB%F3%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0100080";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BC%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۸�":
			crolling.area += ",M0100090";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BC%BA%BC%DB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���۸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ���":
			crolling.area += ",M0100100";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BD%C5%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɿ���":
			crolling.area += ",M0100110";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BD%C9%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ɿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƻ��":
			crolling.area += ",M0100120";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%BE%C6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ƻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ظ���":
			crolling.area += ",M0100130";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%C7%D8%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ظ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0100140";
			wewe.area = "063%7C%7C%B0%ED%C3%A2%B1%BA%7C%7C%C8%EF%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200010";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",M0200020";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200030";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200040";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%B3%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",M0200050";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%E6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",M0200060";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B0%E6%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",M0200070";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ���":
			crolling.area += ",M0200080";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%DD%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݵ�":
			crolling.area += ",M0200090";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݾϵ�":
			crolling.area += ",M0200100";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݾϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",M0200140";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",M0200110";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",M0200120";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",M0200130";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%BF%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200150";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%AA%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			crolling.area += ",M0200160";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%BB%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",M0200170";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B3%BB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",M0200180";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B4%EB%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��߸�":
			crolling.area += ",M0200190";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B4%EB%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﳲ��":
			crolling.area += ",M0200200";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B5%BF%C8%EF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﳲ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200210";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B5%D0%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",M0200220";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B8%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",M0200230";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̷浿":
			crolling.area += ",M0200240";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%CC%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̷浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			crolling.area += ",M0200250";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%CC%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",M0200260";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%B9%CC%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",M0200270";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BA%F1%C0%C0%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200280";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BB%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",M0200290";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BB%EA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",M0200300";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BB%EF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200310";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%AD%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﳲ��":
			crolling.area += ",M0200320";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%AD%C8%EF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﳲ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",M0200330";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%B1%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0200340";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҷ浿":
			crolling.area += ",M0200350";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%D2%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",M0200360";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%DB%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",M0200370";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%DB%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",M0200380";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű���":
			crolling.area += ",M0200390";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",M0200400";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",M0200410";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",M0200420";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",M0200430";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0200440";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",M0200450";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%B5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",M0200460";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C0%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ���":
			crolling.area += ",M0200470";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C0%BD%C4%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200480";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200490";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0200500";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0200510";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%C1%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0200520";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%BF%F9%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			crolling.area += ",M0200530";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C0%D3%C7%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��̵�":
			crolling.area += ",M0200540";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C0%E5%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",M0200550";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C0%E5%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",M0200560";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%B6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׼���":
			crolling.area += ",M0200570";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%D7%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",M0200580";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�1��":
			crolling.area += ",M0200590";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�2��":
			crolling.area += ",M0200600";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�3��":
			crolling.area += ",M0200610";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",M0200620";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C1%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",M0200630";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C3%A2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",M0200640";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ظ���":
			crolling.area += ",M0200650";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C7%D8%B8%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ظ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",M0200660";
			wewe.area = "063%7C%7C%B1%BA%BB%EA%BD%C3%7C%7C%C8%B8%C7%F6%B8";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300010";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B0%A5%B0%F8%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˻굿":
			crolling.area += ",M0300020";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B0%CB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300030";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B0%F8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȱ��":
			crolling.area += ",M0300040";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%A4%C8%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ȱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0300050";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ���":
			crolling.area += ",M0300060";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%DD%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ��":
			crolling.area += ",M0300070";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B1%DD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300080";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B3%AD%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",M0300090";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B5%B5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300100";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B8%B8%B0%E6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0300110";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B8%ED%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鱸��":
			crolling.area += ",M0300120";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B9%E9%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�鱸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0300130";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B9%E9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",M0300140";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%B9%E9%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",M0300150";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BA%B9%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300160";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BA%C0%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η���":
			crolling.area += ",M0300170";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BA%CE%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�η���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󵿵�":
			crolling.area += ",M0300180";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BB%F3%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󵿵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",M0300190";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%AD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300200";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300210";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%BA%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0300220";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BC%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű":
			crolling.area += ",M0300230";
			wewe.area = "C063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ���":
			crolling.area += ",M0300240";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",M0300250";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ý�ǳ��":
			crolling.area += ",M0300260";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BD%C5%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ý�ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300270";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BE%E7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300280";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%AC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300290";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%C0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",M0300300";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",M0300310";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%E4%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			crolling.area += ",M0300320";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300330";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%EB%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300340";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%F9%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300350";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Լ���":
			crolling.area += ",M0300360";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C0%D4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Լ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",M0300370";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C0%E5%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300380";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C1%A6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׻��":
			crolling.area += ",M0300390";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C1%D7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�׻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0300400";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C1%F8%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			crolling.area += ",M0300410";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C3%BB%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			crolling.area += ",M0300420";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�굿":
			crolling.area += ",M0300430";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C8%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ���":
			crolling.area += ",M0300440";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C8%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",M0300450";
			wewe.area = "063%7C%7C%B1%E8%C1%A6%BD%C3%7C%7C%C8%EF%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			crolling.area += ",M0400030";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B0%A5%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",M0400040";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B0%ED%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			crolling.area += ",M0400050";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B1%A4%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ñݵ�":
			crolling.area += ",M0400060";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ñݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400070";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B1%DD%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			crolling.area += ",M0400080";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B3%BB%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",M0400090";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B3%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			crolling.area += ",M0400100";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B4%EB%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ô���":
			crolling.area += ",M0400110";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B4%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����ô���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400120";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B4%F6%B0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			crolling.area += ",M0400130";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B5%B5%C5%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",M0400140";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%B5%BF%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400150";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BA%B8%C0%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ÿ�":
			crolling.area += ",M0400160";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%E7%B8%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",M0400170";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�곻��":
			crolling.area += ",M0400180";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�곻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�굿��":
			crolling.area += ",M0400190";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BB%EA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�굿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵���":
			crolling.area += ",M0400200";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BC%DB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�۵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400210";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BC%F6%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400220";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%C4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ý�����":
			crolling.area += ",M0400230";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������ ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",M0400240";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֱ���":
			crolling.area += ",IM0400250";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BD%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƿ���":
			crolling.area += ",M0400260";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BE%C6%BF%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ƿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400270";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BE%EE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400280";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400290";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0400300";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%EE%BA%C0%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400310";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%BF%F9%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̹��":
			crolling.area += ",M0400320";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C0%CC%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���":
			crolling.area += ",M0400330";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C0%CE%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ο���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",M0400340";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%B6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֻ���":
			crolling.area += ",M0400350";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%D6%BB%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ֻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",M0400360";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",M0400370";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C1%D7%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�ŵ�":
			crolling.area += ",M0400380";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C3%B5%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0400390";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C7%CF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ⱳ��":
			crolling.area += ",M0400010";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C7%E2%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ⱳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",M0400020";
			wewe.area = "063%7C%7C%B3%B2%BF%F8%BD%C3%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0500010";
			wewe.area = "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%B9%AB%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",M0500020";
			wewe.area = "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%B9%AB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�γ���":
			crolling.area += ",M0500030";
			wewe.area = "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%BA%CE%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�γ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",M0500040";
			wewe.area = "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%BC%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ���":
			crolling.area += ",M0500050";
			wewe.area = "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%BE%C8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0500060";
			wewe.area = "063%7C%7C%B9%AB%C1%D6%B1%BA%7C%7C%C0%FB%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",M0600010";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%B0%E8%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0600020";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%B5%BF%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξȱ�����":
			crolling.area += ",M0600030";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%B9%E9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ξȱ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0600040";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BA%AF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			crolling.area += ",M0600050";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BA%B8%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξ���":
			crolling.area += ",M0600060";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BA%CE%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ξ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭸�":
			crolling.area += ",M0600070";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%BB%F3%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󼭸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0600080";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C0%A7%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֻ��":
			crolling.area += ",M0600090";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C1%D6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ֻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0600100";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C1%D9%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0600110";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C1%F8%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���":
			crolling.area += ",M0600120";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C7%CF%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			crolling.area += ",M0600130";
			wewe.area = "063%7C%7C%BA%CE%BE%C8%B1%BA%7C%7C%C7%E0%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0700010";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%B1%B8%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ���":
			crolling.area += ",M0700020";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%B1%DD%B0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0700030";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%B5%BF%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0700040";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%BA%B9%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",M0700050";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%BC%F8%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			crolling.area += ",M0700060";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%BD%D6%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0700070";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C0%AF%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ��":
			crolling.area += ",M0700080";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C0%CE%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0700090";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ���":
			crolling.area += ",M0700100";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C6%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ���":
			crolling.area += ",M0700110";
			wewe.area = "063%7C%7C%BC%F8%C3%A2%B1%BA%7C%7C%C7%B3%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",M0800010";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B0%E6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0800020";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B0%ED%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",M0800030";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B1%B8%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0800040";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%B5%BF%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0800050";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BA%C0%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0800060";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BA%F1%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0800070";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BB%EF%B7%CA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0800080";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BB%F3%B0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿ��":
			crolling.area += ",M0800090";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BC%D2%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0800100";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BF%EB%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ָ�":
			crolling.area += ",M0800110";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%BF%EE%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ָ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼���":
			crolling.area += ",M0800120";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%C0%CC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���":
			crolling.area += ",M0800130";
			wewe.area = "063%7C%7C%BF%CF%C1%D6%B1%BA%7C%7C%C8%AD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",M0900010";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ���":
			crolling.area += ",M0900020";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B1%DD%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݸ���":
			crolling.area += ",M0900030";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B1%DD%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",M0900040";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B3%B2%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0900050";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B3%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			crolling.area += ",M0900060";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B4%F6%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",M0900070";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0900080";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900090";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%B8%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900100";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%C1%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",M0900120";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%F0%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",M0900130";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%F0%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",M0900140";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%B8%F1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ۵�":
			crolling.area += ",M0900150";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BA%CE%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�μ۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M0900160";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BB%EF%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",M0900170";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%AE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���յ�":
			crolling.area += ",M0900180";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%AE%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",M0900190";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%AE%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0900200";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%BA%B4%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",M0900210";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BC%DB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",M0900220";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ뵿":
			crolling.area += ",M0900230";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BD%C5%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͻ�ý��ﵿ":
			crolling.area += ",M0900240";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͻ�ý��ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",M0900250";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BE%EE%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0900260";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%A9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",M0900270";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%B5%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M0900280";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ձø�":
			crolling.area += ",M0900290";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%D5%B1%C3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ձø�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿��":
			crolling.area += ",M0900300";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			crolling.area += ",M0900310";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%EB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900320";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%EB%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900330";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%F5%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͻ�ÿ�����":
			crolling.area += ",M0900340";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͻ�ÿ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			crolling.area += ",M0900350";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%BA%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",M0900360";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%CE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��1��":
			crolling.area += ",M0900370";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%CE%C8%AD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��2��":
			crolling.area += ",M0900380";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%CE%C8%AD%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ӻ�":
			crolling.area += ",M0900390";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C0%D3%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ӻ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900400";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%A4%C1%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900410";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%D6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",M0900420";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�1��":
			crolling.area += ",M0900430";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�2��":
			crolling.area += ",M0900440";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�3��":
			crolling.area += ",M0900450";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�ε�1��":
			crolling.area += ",M0900470";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C3%A2%C0%CE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â�ε�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�ε�2��":
			crolling.area += ",M0900480";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C3%A2%C0%CE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("â�ε�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900490";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C3%E1%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱥ���":
			crolling.area += ",M0900500";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C6%C8%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱥ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͻ����ȭ��":
			crolling.area += ",M0900510";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͻ����ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Զ��":
			crolling.area += ",M0900520";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C7%D4%B6%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Զ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Կ���":
			crolling.area += ",M0900530";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C7%D4%BF%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Կ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M0900540";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C7%F6%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ���":
			crolling.area += ",M0900550";
			wewe.area = "063%7C%7C%C0%CD%BB%EA%BD%C3%7C%7C%C8%B2%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1000010";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%B0%AD%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",M1000020";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%B0%FC%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			crolling.area += ",M1000030";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%B4%F6%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1000040";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BB%EF%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1000050";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BC%BA%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ���":
			crolling.area += ",M1000060";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BD%C5%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1000070";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BD%C5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1000080";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BF%C0%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",M1000090";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%BF%EE%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ӽ���":
			crolling.area += ",M1000100";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%C0%D3%BD%C7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ӽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1000110";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%C1%F6%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",M1000120";
			wewe.area = "063%7C%7C%C0%D3%BD%C7%B1%BA%7C%7C%C3%BB%BF%F5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�賲��":
			crolling.area += ",M1100010";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%B0%E8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�賲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",M1100020";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%B0%E8%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",M1100030";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%B9%F8%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼭��":
			crolling.area += ",M1100040";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%BB%EA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�꼭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1100050";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%C0%E5%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1100060";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%C0%E5%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õõ��":
			crolling.area += ",M1100070";
			wewe.area = "063%7C%7C%C0%E5%BC%F6%B1%BA%7C%7C%C3%B5%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("õõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",M1200010";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B0%AD%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1200020";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B0%ED%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ�":
			crolling.area += ",M1200030";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݾ�1��":
			crolling.area += ",M1200040";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݾ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݾ�2��":
			crolling.area += ",M1200050";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݾ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽñݾϵ�":
			crolling.area += ",M1200060";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽñݾϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1200070";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B3%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",M1200080";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B4%F6%C1%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",M1200090";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B4%F6%C1%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1200100";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B5%B5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1200110";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B5%B5%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽõ��굿":
			crolling.area += ",M1200120";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽõ��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1200130";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B8%B8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",M1200140";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1200150";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1200160";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BC%BA%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��1��":
			crolling.area += ",M1200170";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BC%DB%C3%B5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��õ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��2��":
			crolling.area += ",M1200180";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BC%DB%C3%B5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��õ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",M1200190";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%A9%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽÿ�����":
			crolling.area += ",M1200200";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽÿ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ƶ�1��":
			crolling.area += "M1200220";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EC%BE%C6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��Ƶ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ƶ�2��":
			crolling.area += ",M1200230";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EC%BE%C6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��Ƶ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ƶ�3��":
			crolling.area += ",M1200235";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%EC%BE%C6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��Ƶ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1200240";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�1��":
			crolling.area += ",M1200250";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%CE%C8%C4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�2��":
			crolling.area += ",M1200260";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%CE%C8%C4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿":
			crolling.area += ",M1200270";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�1��":
			crolling.area += ",M1200280";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%FC%B9%CC%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���̵�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�2��":
			crolling.area += ",M1200290";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C0%FC%B9%CC%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���̵�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽ��ߵ�":
			crolling.area += ",M1200310";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽ��ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",M1200300";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C1%F8%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱥ���1��":
			crolling.area += ",M1200310";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱥ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱥ���2��":
			crolling.area += ",M1200320";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱥ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱥ���3��":
			crolling.area += ",M1200330";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱥ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱥ���4��":
			crolling.area += ",M1200340";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C6%C8%BA%B9%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱥ���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����1��":
			crolling.area += ",M1200350";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%A3%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����2��":
			crolling.area += ",M1200360";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%A3%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����3��":
			crolling.area += ",M1200370";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%A3%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",M1200380";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%B4%F6%C1%F8%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			crolling.area += ",M1300010";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%E6%BF%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			crolling.area += ",M1300020";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%E6%BF%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			crolling.area += ",M1300030";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%E6%BF%F8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",M1300040";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B0%ED%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽñ���":
			crolling.area += ",M1300050";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����۵�":
			crolling.area += ",M1300060";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B3%B2%B3%EB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٰ���1��":
			crolling.area += ",M1300070";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ٰ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٰ���2��":
			crolling.area += ",M1300080";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ٰ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٰ���3��":
			crolling.area += ",M1300090";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ٰ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٰ���4��":
			crolling.area += ",M1300100";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ٰ���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			crolling.area += ",M1300110";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����е�":
			crolling.area += ",M1300120";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B5%BF%BC%AD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϻ굿":
			crolling.area += ",M1300130";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%B5%BF%BF%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��1��":
			crolling.area += ",M1300140";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%EF%C3%B5%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��õ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��2��":
			crolling.area += ",M1300150";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%EF%C3%B5%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��õ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��3��":
			crolling.area += ",M1300160";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%EF%C3%B5%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��õ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󸲵�":
			crolling.area += ",M1300170";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%F3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󸲵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",M1300180";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BB%F6%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����۵�":
			crolling.area += ",M1300190";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%B3%EB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����е�":
			crolling.area += ",M1300200";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BC%AD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			crolling.area += ",M1300210";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϻ굿1��":
			crolling.area += ",M1300220";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BF%CF%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ϻ굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϻ굿2��":
			crolling.area += ",M1300230";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AD%BF%CF%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ϻ굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1300240";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BC%AE%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺹��":
			crolling.area += ",M1300250";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BF%EB%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뺹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",M1300260";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1300270";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",M1300280";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C0%FC%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߳�۵�":
			crolling.area += ",M1300290";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%B3%EB%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߳�۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽ��߾ӵ�1��":
			crolling.area += ",M1300310";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ֽ��߾ӵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽ��߾ӵ�2��":
			crolling.area += ",M1300320";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ֽ��߾ӵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽ��߾ӵ�3��":
			crolling.area += ",M1300330";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ֽ��߾ӵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�4��":
			crolling.area += ",M130340";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",M1300350";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ�굿1��":
			crolling.area += ",M1300360";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%C8%AD%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ�굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ�굿2��":
			crolling.area += ",M1300370";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C1%DF%C8%AD%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ�굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1300380";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C5%C2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��1��":
			crolling.area += ",M1300390";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��2��":
			crolling.area += ",M1300400";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��3��":
			crolling.area += ",M1300410";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C6%F2%C8%AD%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����1��":
			crolling.area += ",M1300420";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C7%B3%B3%B2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����2��":
			crolling.area += ",M1300430";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C7%B3%B3%B2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����3��":
			crolling.area += ",M1300440";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C7%B3%B3%B2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�1��":
			crolling.area += ",M1300450";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�2��":
			crolling.area += ",M1300460";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�3��":
			crolling.area += ",M1300470";
			wewe.area = "063%7C%7C%C0%FC%C1%D6%BD%C3+%BF%CF%BB%EA%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1400010";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%A8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��θ�":
			crolling.area += ",M1400020";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%ED%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1400030";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400040";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B0%FA%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",M1400050";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B1%B3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",M1400060";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B1%B8%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݺص�":
			crolling.area += ",M1400070";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B1%DD%BA%D8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݺص�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",M1400080";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B3%BB%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ҵ�":
			crolling.area += ",M1400090";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B3%F3%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",M1400100";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B4%F6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400110";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%B8%C1%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400120";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BA%CE%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			crolling.area += ",M1400130";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����û곻��":
			crolling.area += ",M1400140";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����û곻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܸ�":
			crolling.area += ",M1400150";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",M1400160";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%EF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",M1400170";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1400180";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BB%F3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҽ���":
			crolling.area += ",M1400190";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BC%D2%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ҽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			crolling.area += ",M1400200";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400210";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BC%F6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ñ⵿":
			crolling.area += ",M1400250";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C3%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ñ⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ýſ���":
			crolling.area += ",M1400260";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ýſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400270";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",M1400280";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%C5%C5%C2%C0%CE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־ϵ�":
			crolling.area += ",M1400290";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BD%D6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400300";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1400310";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%B5%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�":
			crolling.area += ",M1400320";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%B5%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˵���":
			crolling.area += ",M1400330";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%CB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�˵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			crolling.area += ",M1400340";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",M1400350";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1400360";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C0%CC%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծϸ�":
			crolling.area += ",M1400370";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C0%D4%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ծϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",M1400380";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C0%E5%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1400390";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C1%A4%BF%EC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",M1400400";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C1%F8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʻ굿":
			crolling.area += ",M1400240";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C3%CA%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",M1400410";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C4%A5%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",M1400420";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C5%C2%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			crolling.area += ",M1400430";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C7%CF%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻϵ�":
			crolling.area += ",M1400440";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C7%CF%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",M1400450";
			wewe.area = "063%7C%7C%C1%A4%C0%BE%BD%C3%7C%7C%C8%E6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",M1500010";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%B5%BF%C7%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ɸ�":
			crolling.area += ",M1500020";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%B8%B6%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1500030";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%B9%E9%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�α͸�":
			crolling.area += ",M1500040";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BA%CE%B1%CD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�α͸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1500050";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BB%F3%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȱ�������":
			crolling.area += ",M1500060";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BC%BA%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȱ�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",M1500070";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BE%C8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",M1500080";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%BF%EB%B4%E3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += "M1500090";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%C1%A4%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȱ���õ��":
			crolling.area += ",M1500100";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%C1%D6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȱ���õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",M1500110";
			wewe.area = "063%7C%7C%C1%F8%BE%C8%B1%BA%7C%7C%C1%F8%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
