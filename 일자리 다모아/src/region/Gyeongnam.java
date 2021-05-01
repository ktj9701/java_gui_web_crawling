package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Gyeongnam {
	public boolean flag;

	public void GyeongnamCity(ActionEvent e) {
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
		// ������
		case "������":
			crolling.area += ",C0100010";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B0%C5%C1%A6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100015";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B0%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",C0100020";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B3%B2%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100030";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B4%C9%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100040";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B4%F6%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",C0100050";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B5%BF%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ�":
			crolling.area += ",C0100060";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B5%CE%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�д���":
			crolling.area += ",C0100070";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B5%D0%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�д���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100080";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100085";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%B9%AE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0100090";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BB%E7%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",C0100092";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BB%EF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󵿵�":
			crolling.area += ",C0100093";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BB%F3%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󵿵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100095";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BC%F6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƾ絿":
			crolling.area += ",C0100110";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BE%C6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƾ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",C0100120";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BE%C6%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100125";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BE%E7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			crolling.area += ",C0100130";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%AC%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0100160";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%C1%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",C0100140";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%C1%C6%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",C0100150";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%BF%C1%C6%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ��":
			crolling.area += ",C0100170";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%CF%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0100180";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%E5%B8%F1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������":
			crolling.area += ",C0100190";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%E5%BD%C2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0100195";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C0%E5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",C0100200";
			wewe.area += "055%7C%7C%B0%C5%C1%A6%BD%C3%7C%7C%C7%CF%C3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��â��
		case "���ϸ�":
			crolling.area += ",C0200010";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%A1%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0200020";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%A1%C1%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",C0200040";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%C5%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0200040";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B0%ED%C1%A6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C0200050";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B3%B2%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",C0200060";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B3%B2%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0200070";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%B8%B6%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ��":
			crolling.area += ",C0200080";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%BA%CF%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",C0200090";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%BD%C5%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C0200100";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%BF%F5%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C0200110";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%C0%A7%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֻ��":
			crolling.area += ",C0200120";
			wewe.area += "055%7C%7C%B0%C5%C3%A2%B1%BA%7C%7C%C1%D6%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ֻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ����
		case "��õ��":
			crolling.area += ",C0300010";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŷ���":
			crolling.area += ",C0300020";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%C5%B7%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŷ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0300030";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B0%ED%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0300040";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B1%B8%B8%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밡��":
			crolling.area += ",C0300050";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B4%EB%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�밡��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			crolling.area += ",C0300060";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B5%BF%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",C0300070";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%B8%B6%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0300080";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󸮸�":
			crolling.area += ",C0300090";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BB%F3%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󸮸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0300100";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BF%B5%BF%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0300110";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%BF%B5%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",C0300120";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",C0300130";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C7%CF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸȭ��":
			crolling.area += ",C0300140";
			wewe.area += "055%7C%7C%B0%ED%BC%BA%B1%BA%7C%7C%C8%B8%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȸȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���ؽ�
		case "����":
			crolling.area += ",C0400010";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400410";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B0%FC%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",C0400020";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400320";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0400030";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			crolling.area += ",C0400470";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿��":
			crolling.area += ",C0400040";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B4%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			crolling.area += ",C0400050";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",C0400390";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B4%EB%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0400060";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B5%BF%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C0400070";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B8%ED%B9%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",C0400330";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%B9%AB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			crolling.area += ",C0400080";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%C0%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			crolling.area += ",C0400340";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���":
			crolling.area += ",C0400090";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%CE%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ο���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻε�":
			crolling.area += ",C0400480";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿϵ�":
			crolling.area += ",C0400100";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BA%D2%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			crolling.area += ",C0400110";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�﹮��":
			crolling.area += ",C0400380";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�﹮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",C0400120";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",C0400510";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400130";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%EF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󵿸�":
			crolling.area += ",C0400140";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%F3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󵿸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400150";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BB%FD%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0400160";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BC%AD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400420";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BC%F6%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���":
			crolling.area += ",C0400350";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BD%C5%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȵ�":
			crolling.area += ",C0400170";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",C0400180";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BE%EE%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܵ�":
			crolling.area += ",C0400190";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",C0400360";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%AF%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",C0400430";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%B2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���޵�":
			crolling.area += ",C0400440";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%C0%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�":
			crolling.area += ",C0400200";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",C0400310";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",C0400370";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",C0400400";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400450";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%E5%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",C0400220";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C0%FC%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",C0400230";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%D6%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400240";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%F6%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			crolling.area += ",C0400250";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%F8%B7%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0400260";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C1%F8%BF%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ�꼭�ε�":
			crolling.area += ",C0400490";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("ĥ�꼭�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",C0400270";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C7%B3%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѹ���":
			crolling.area += ",C0400280";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C7%D1%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ѹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��":
			crolling.area += ",C0400290";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C8%AD%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȱõ��":
			crolling.area += ",C0400500";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("Ȱõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",C0400460";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵿ":
			crolling.area += ",C0400300";
			wewe.area += "055%7C%7C%B1%E8%C7%D8%BD%C3%7C%7C%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���ر�
		case "������":
			crolling.area += ",C0500010";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B0%ED%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0500020";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0500030";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B3%B2%C7%D8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0500040";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%B9%CC%C1%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵿ��":
			crolling.area += ",C0500050";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BB%EF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ﵿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ָ�":
			crolling.area += ",C0500060";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BB%F3%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ָ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0500070";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C0500080";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%BC%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			crolling.area += ",C0500090";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%C0%CC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",C0500100";
			wewe.area += "055%7C%7C%B3%B2%C7%D8%B1%BA%7C%7C%C3%A2%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �о��
		case "���":
			crolling.area += ",C0800010";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B0%A1%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0800020";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0800030";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B3%B2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",C0800040";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B3%BB%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",C0800050";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B3%BB%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C0800060";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B4%DC%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			crolling.area += ",C0800070";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%B9%AB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�κϸ�":
			crolling.area += ",C0800080";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BA%CE%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�κϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�곻��":
			crolling.area += ",C0800090";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�곻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܸ�":
			crolling.area += ",C0800100";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������":
			crolling.area += ",C0800110";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EF%B6%FB%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�о�û﹮��":
			crolling.area += ",C0800120";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%EF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�о�û﹮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󳲸�":
			crolling.area += ",C0800130";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%F3%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�󳲸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�о�û󵿸�":
			crolling.area += ",C0800140";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BB%F3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�о�û󵿸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0800150";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%BF%EB%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",C0800160";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C3%BB%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ���":
			crolling.area += ",C0800170";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C3%CA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			crolling.area += ",C0800180";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C7%CF%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȱ����":
			crolling.area += ",C0800190";
			wewe.area += "055%7C%7C%B9%D0%BE%E7%BD%C3%7C%7C%C8%B0%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȱ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��õ��
		case "�����":
			crolling.area += ",C0900010";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B0%EF%B8%ED%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0900020";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B0%EF%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900030";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B1%C3%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",C0900040";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B3%EB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900050";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B4%C1%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",C0900060";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B4%EB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900070";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			crolling.area += ",C0900080";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B5%BF%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0900090";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900100";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B5%BF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900110";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B8%B6%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C0900120";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B9%E9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900130";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%B9%FA%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900140";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BA%C0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�糲��":
			crolling.area += ",C0900150";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BB%E7%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�糲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C0900160";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BB%E7%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C0900170";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BB%E7%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			crolling.area += ",C0900180";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%AD%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C0900190";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900200";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%AD%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900210";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%B1%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900220";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BC%DB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			crolling.area += ",C0900230";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BD%C5%BA%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",C0900240";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BD%C5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǿȵ�":
			crolling.area += ",C0900250";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BD%C7%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ǿȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ浿":
			crolling.area += ",C0900260";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			crolling.area += ",C0900270";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900280";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%BF%EB%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̱ݵ�":
			crolling.area += ",C0900290";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C0%CC%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̱ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȧ��":
			crolling.area += ",C0900300";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C0%CC%C8%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȧ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C0900310";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C1%A4%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�·浿":
			crolling.area += ",C0900320";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C1%C2%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�·浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			crolling.area += ",C0900330";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ൿ��":
			crolling.area += ",C0900340";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C3%E0%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ൿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",C0900350";
			wewe.area += "055%7C%7C%BB%E7%C3%B5%BD%C3%7C%7C%C7%E2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��û��
		case "�ݼ���":
			crolling.area += ",C1000010";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%B1%DD%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܼ���":
			crolling.area += ",C1000020";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%B4%DC%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",C1000030";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%EA%C3%BB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1000040";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%EF%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���񷮸�":
			crolling.area += ",C1000050";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%FD%BA%F1%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���񷮸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			crolling.area += ",C1000060";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BB%FD%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1000070";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BD%C3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ��":
			crolling.area += ",C1000080";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BD%C5%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žȸ�":
			crolling.area += ",C1000090";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BD%C5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�žȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",C1000100";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%BF%C0%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			crolling.area += ",C1000110";
			wewe.area += "055%7C%7C%BB%EA%C3%BB%B1%BA%7C%7C%C2%F7%C8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ����
		case "���ñ���":
			crolling.area += ",C1100010";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",C1100020";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B3%B2%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٹ浿":
			crolling.area += ",C1100030";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B4%D9%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٹ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",C1100035";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B4%F6%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1100040";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű":
			crolling.area += ",C1100066";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B8%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C1100050";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B8%ED%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C1100055";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1100060";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%B9%B0%B1%DD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���úϺε�":
			crolling.area += ",C1100070";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BA%CF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���úϺε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1100080";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BA%CF%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�긷��":
			crolling.area += ",C1100090";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BB%EA%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�긷��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",C1100095";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BB%EF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",C1100100";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BB%F3%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",C1100105";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BC%D2%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			crolling.area += ",C1100110";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",C1100120";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BE%EE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",C1100125";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1100130";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1100140";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%BF%F8%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",C1100150";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C0%AF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֳ���":
			crolling.area += ",C1100154";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C1%D6%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1100156";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C1%D6%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߺε�":
			crolling.area += ",C1100160";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C1%DF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߺε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",C1100165";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C6%F2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻϸ�":
			crolling.area += ",C1100170";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C7%CF%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�赿":
			crolling.area += ",C1100180";
			wewe.area += "055%7C%7C%BE%E7%BB%EA%BD%C3%7C%7C%C8%A3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �Ƿɱ�
		case "���ʸ�":
			crolling.area += ",C1200010";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B0%A1%B7%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�÷���":
			crolling.area += ",C1200020";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B1%C3%B7%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�÷���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1200030";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B3%AB%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			crolling.area += ",C1200040";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%B4%EB%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1200050";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%BA%C0%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			crolling.area += ",C1200060";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%BA%CE%B8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1200070";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%BF%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1200080";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C0%AF%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ƿ���":
			crolling.area += ",C1200090";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C0%C7%B7%C9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ƿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1200100";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C1%A4%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1200110";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C1%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ���":
			crolling.area += ",C1200120";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C4%A5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",C1200130";
			wewe.area += "055%7C%7C%C0%C7%B7%C9%B1%BA%7C%7C%C8%AD%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���ֽ�
		case "���µ�":
			crolling.area += ",C1300010";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B0%A1%C1%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300020";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B0%AD%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�赿":
			crolling.area += ",C1300030";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͱ":
			crolling.area += ",C1300040";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B1%CD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͱ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ��":
			crolling.area += ",C1300050";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B1%DD%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ��":
			crolling.area += ",C1300060";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B1%DD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300070";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B3%B2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300080";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B3%BB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1300090";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B4%EB%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",C1300100";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1300110";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B4%EB%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300120";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B5%BF%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",C1300140";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B8%C1%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1300160";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B8%ED%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300170";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B9%AE%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "��õ��":
			crolling.area += ",C1300180";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%B9%CC%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300190";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BA%BB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",C1300200";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BA%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300210";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BA%C0%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1300220";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%E7%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",C1300230";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",C1300240";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",C1300250";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1300260";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1300290";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BB%F3%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1300300";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BC%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300310";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BC%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žȵ�":
			crolling.area += ",C1300320";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BD%C5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�žȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300340";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%BF%C1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",C1300360";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%AF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̹ݼ���":
			crolling.area += ",C1300370";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CC%B9%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̹ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300380";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ絿":
			crolling.area += ",C1300390";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲݼ���":
			crolling.area += ",C1300400";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%CF%B9%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",C1300410";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%E5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",C1300420";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C0%E5%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",C1300430";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%A4%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־ൿ":
			crolling.area += ",C1300440";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%D6%BE%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ȵ�":
			crolling.area += ",C1300450";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%DF%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",C1300590";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300460";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%F6%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300470";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%F8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300480";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C1%FD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1300490";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C3%CA%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫����":
			crolling.area += ",C1300600";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C3%E6%B9%AB%B0%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ�ϵ�":
			crolling.area += ",C1300500";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C4%A5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǹ���":
			crolling.area += ",C1300510";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C6%C7%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ǹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",C1300520";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C6%F2%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",C1300530";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ뵿":
			crolling.area += ",C1300560";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ�1��":
			crolling.area += ",C1300540";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ�2��":
			crolling.area += ",C1300550";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",C1300570";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C7%CF%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣź��":
			crolling.area += ",C1300580";
			wewe.area += "055%7C%7C%C1%F8%C1%D6%BD%C3%7C%7C%C8%A3%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// â�籺
		case "�輺��":
			crolling.area += ",C1500010";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B0%E8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�輺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",C1500020";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B0%ED%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",C1500030";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B1%E6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1500040";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B3%B2%C1%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",C1500050";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B4%EB%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ո�":
			crolling.area += ",C1500060";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B4%EB%C7%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ո�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",C1500070";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%B5%B5%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ��":
			crolling.area += ",C1500080";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%BA%CE%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1500090";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%BC%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1500100";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%BF%B5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",C1500110";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C0%AF%BE%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̹��":
			crolling.area += ",C1500120";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C0%CC%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�帶��":
			crolling.area += ",C1500130";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C0%E5%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�帶��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",C1500140";
			wewe.area += "055%7C%7C%C3%A2%B3%E7%B1%BA%7C%7C%C3%A2%B3%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
