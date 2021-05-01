package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Chungnam {
	public boolean flag;

	public void ChungnamCity(ActionEvent e) {
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
		case "�ݾӵ�":
			crolling.area += ",O1600010";
			wewe.area += "041%7C%7C%B0%E8%B7%E6%BD%C3%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݾӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			crolling.area += ",O1600030";
			wewe.area += "041%7C%7C%B0%E8%B7%E6%BD%C3%7C%7C%B5%CE%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ��ȸ�":
			crolling.area += ",O1600020";
			wewe.area += "041%7C%7C%B0%E8%B7%E6%BD%C3%7C%7C%BD%C5%B5%B5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1600040";
			wewe.area += "041%7C%7C%B0%E8%B7%E6%BD%C3%7C%7C%BE%F6%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˻�":
			crolling.area += ",O0100010";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B0%CB%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˻�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0100020";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B0%E8%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0100030";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",O0100040";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B1%DD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",O0100050";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B1%DD%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���䵿":
			crolling.area += ",O0100060";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B1%DD%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0100070";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B9%AB%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",O0100080";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B9%DD%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0100090";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%B9%DD%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0100100";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BA%C0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			crolling.area += ",O0100110";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BA%C0%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0100120";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BB%E7%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼺��":
			crolling.area += ",O0100130";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��յ�":
			crolling.area += ",O0100140";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BB%F3%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",O0100150";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BC%D2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű���":
			crolling.area += ",O0100160";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BD%C5%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			crolling.area += ",O0100170";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",O0100180";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BD%C5%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֽŵ�":
			crolling.area += ",O0100190";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BD%D6%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֽŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",O0100200";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BF%C0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",O0100210";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BF%C1%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�켺��":
			crolling.area += ",O0100220";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BF%EC%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�켺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0100230";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BF%F5%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",O0100240";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BF%F9%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",O0100250";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%BF%F9%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0100260";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C0%AF%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǵ��":
			crolling.area += ",O0100270";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C0%AF%B1%B8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ǵ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",O0100280";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C0%CC%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			crolling.area += ",O0100300";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C1%A4%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵ֹ�":
			crolling.area += ",O0100310";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C1%D6%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵ֹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",O0100320";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",O0100330";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C1%DF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "źõ��":
			crolling.area += ",O0100340";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C5%BA%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("źõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�º���":
			crolling.area += ",O0100350";
			wewe.area += "041%7C%7C%B0%F8%C1%D6%BD%C3%7C%7C%C5%C2%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�º���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",O0200010";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%B1%BA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ���":
			crolling.area += ",O0200020";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%B1%DD%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",O0200030";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",O0200040";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%B3%B2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",O0200050";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%B3%B2%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0200060";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%BA%B9%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			crolling.area += ",O0200070";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%BA%CE%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0200080";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%C1%A6%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0200090";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%C1%F8%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߺθ�":
			crolling.area += ",O0200100";
			wewe.area += "041%7C%7C%B1%DD%BB%EA%B1%BA%7C%7C%C3%DF%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ߺθ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߰��":
			crolling.area += ",O0300010";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B0%A1%BE%DF%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߰��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300020";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B0%AD%B0%E6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",O0300030";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B0%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���˵�":
			crolling.area += ",O0300040";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B0%FC%C3%CB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���˵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300050";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B1%A4%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0300060";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			crolling.area += ",O0300070";
			wewe.area += "C041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B3%EB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱳��":
			crolling.area += ",O0300080";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B4%EB%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뱳��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300090";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B4%F6%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",O0300100";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B5%EE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",O0300110";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0300120";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%B9%FA%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300130";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BA%CE%C0%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",O0300140";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BA%CE%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0300150";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BB%F3%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300160";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BC%BA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",O0300170";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BE%E7%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300180";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BF%AC%B9%AB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0300190";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%BF%AC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0300200";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%C0%BA%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",O0300210";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ä���":
			crolling.area += ",O0300220";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%C3%A4%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ä���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",O0300230";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%C3%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",O0300240";
			wewe.area += "041%7C%7C%B3%ED%BB%EA%BD%C3%7C%7C%C8%AD%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0400010";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B0%ED%B4%EB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",O0400130";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B1%B8%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",O0400021";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B4%E7%C1%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",O0400022";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B4%E7%C1%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",O0400023";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B4%E7%C1%F83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0400140";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B4%EB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ����":
			crolling.area += ",O0400030";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B4%EB%C8%A3%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0400040";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%B8%E9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҵ�":
			crolling.area += ",O0400150";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BB%E7%B1%E2%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0400050";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BC%AE%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ��":
			crolling.area += ",O0400060";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BC%DB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۾���":
			crolling.area += ",O0400070";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BC%DB%BE%C7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�۾���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",O0400160";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BC%F6%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0400080";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BC%F8%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ð":
			crolling.area += ",O0400170";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BD%C3%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ð");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0400090";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BD%C5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬��":
			crolling.area += ",O0400180";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BF%EB%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�찭��":
			crolling.area += ",O0400100";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BF%EC%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�찭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			crolling.area += ",O0400190";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BF%EC%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",O0400200";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%BF%F8%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0400210";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",O0400110";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%C1%A4%B9%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ä�":
			crolling.area += ",O0400220";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%C3%A4%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ä�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�մ���":
			crolling.area += ",O0400120";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%C7%D5%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�մ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0400230";
			wewe.area += "041%7C%7C%B4%E7%C1%F8%BD%C3%7C%7C%C7%E0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",O0500010";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B1%C3%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",O0500020";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B3%B2%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0500030";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B3%B2%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",O0500040";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B3%BB%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0500070";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			crolling.area += ",O0500050";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B4%EB%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			crolling.area += ",O0500060";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B4%EB%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			crolling.area += ",O0500080";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B5%BF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0500090";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B8%ED%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻��":
			crolling.area += ",O0500100";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%B9%CC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ָ�":
			crolling.area += ",O0500110";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%BC%BA%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ָ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȥ��":
			crolling.area += ",O0500120";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%BD%C5%C8%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȥ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0500130";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%BF%C0%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",O0500140";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%BF%E4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0500150";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%BF%F5%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֱ���":
			crolling.area += ",O0500160";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C1%D6%B1%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ֱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֻ��":
			crolling.area += ",O0500170";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C1%D6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ֻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0500180";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C1%D6%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0500190";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C1%D7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�ϸ�":
			crolling.area += ",O0500200";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C3%B5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("õ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			crolling.area += ",O0500210";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C3%BB%B6%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�Ҹ�":
			crolling.area += ",O0500220";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C3%BB%BC%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�Ҹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�굿":
			crolling.area += ",O0500230";
			wewe.area += "041%7C%7C%BA%B8%B7%C9%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0600010";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%B1%B8%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծϸ�":
			crolling.area += ",O0600020";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%B1%D4%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ծϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0600030";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0600040";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%B3%BB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���":
			crolling.area += ",O0600050";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%BA%CE%BF%A9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ο���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0600060";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%BC%AE%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0600070";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%BC%BC%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",O0600080";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%BE%E7%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0600090";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܻ��":
			crolling.area += ",O0600100";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%BF%DC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0600110";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%C0%BA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0600120";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%C0%D3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",O0600130";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%C0%E5%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",O0600140";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%C3%CA%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",O0600150";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%C3%E6%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ���":
			crolling.area += ",O0600160";
			wewe.area += "041%7C%7C%BA%CE%BF%A9%B1%BA%7C%7C%C8%AB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",O0700010";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",O0700020";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%B0%ED%BA%CF%B8%E9%";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0700030";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%B4%EB%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����õ��":
			crolling.area += ",O0700040";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%B4%F6%C1%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700050";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%B5%BF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ���":
			crolling.area += ",O0700060";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BA%CE%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�μ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700070";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BC%AE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700080";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BC%AE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700090";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BC%BA%BF%AC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700100";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BC%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",O0700110";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BE%E7%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0700120";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BF%B9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700130";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BF%C0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¼���":
			crolling.area += ",O0700140";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BF%C2%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0700150";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%BF%EE%BB%EA%B8%E";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",O0700160";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C0%BD%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����������":
			crolling.area += ",O0700170";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0700180";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C0%CE%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȫ��":
			crolling.area += ",O0700190";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C0%E1%C8%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȫ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿":
			crolling.area += ",O0700200";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׼���":
			crolling.area += ",O0700210";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C1%D7%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0700220";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C1%F6%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱥ���":
			crolling.area += ",O0700230";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C6%C8%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱥ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ع̸�":
			crolling.area += ",O0700240";
			wewe.area += "041%7C%7C%BC%AD%BB%EA%BD%C3%7C%7C%C7%D8%B9%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ع̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0800010";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%B1%E2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0800020";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%B8%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0800030";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%B8%B6%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0800040";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%B9%AE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",O0800050";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%BA%F1%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0800060";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0800070";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%BC%AD%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			crolling.area += ",O0800080";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%BD%C3%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0800090";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%C0%E5%C7%D7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0800100";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%C1%BE%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǳ���":
			crolling.area += ",O0800110";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%C6%C7%B1%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ǳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ѻ��":
			crolling.area += ",O0800120";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%C7%D1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ѻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���":
			crolling.area += ",O0800130";
			wewe.area += "041%7C%7C%BC%AD%C3%B5%B1%BA%7C%7C%C8%AD%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǰ":
			crolling.area += ",O0900010";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B1%C7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ǰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",O0900020";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B1%E2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O0900030";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0900040";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B5%B5%B0%ED%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0900050";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B5%D0%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",O0900060";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B5%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0900070";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B8%F0%C1%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",O0900080";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B9%E6%C3%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��̵�":
			crolling.area += ",O0900090";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B9%E8%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0900100";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B9%E8%B9%E6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",O0900110";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%B9%FD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O0900120";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BC%B1%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۾Ǹ�":
			crolling.area += ",O0900130";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BC%DB%BE%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�۾Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",O0900140";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",O0900150";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BD%C5%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",O0900160";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BD%C5%C3%A2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǿ���":
			crolling.area += ",O0900170";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BD%C7%BF%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ǿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			crolling.area += ",O0900180";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BF%B0%C4%A1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",O0900190";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BF%B5%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¾�1��":
			crolling.area += ",O0900200";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BF%C2%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¾�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¾�2��":
			crolling.area += ",O0900210";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BF%C2%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�¾�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O0900220";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BF%C2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",O0900230";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%BF%EB%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0900240";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C0%BD%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƻ��������":
			crolling.area += ",O0900250";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƻ��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ָ�":
			crolling.area += ",O0900260";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C0%CE%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ָ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0900270";
			wewe.area += "C041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C0%E5%C1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",O0900280";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C1%A1%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ºε�":
			crolling.area += ",O0900290";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C1%C2%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ºε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʻ絿":
			crolling.area += ",O0900300";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C3%CA%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʻ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O0900310";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C5%C1%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ�⵿":
			crolling.area += ",O0900320";
			wewe.area += "041%7C%7C%BE%C6%BB%EA%BD%C3%7C%7C%C7%B3%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ�⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1100010";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%B0%ED%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ø�":
			crolling.area += ",O1100020";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%B1%A4%BD%C3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ø�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1100030";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%B4%EB%BC%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1100040";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%B4%EB%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1100050";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%B4%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1100060";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O1100070";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%BB%F0%B1%B3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žϸ�":
			crolling.area += ",O1100080";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%BD%C5%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�žϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž��":
			crolling.area += ",O1100090";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%BD%C5%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1100100";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%BF%B9%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1100110";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%BF%C0%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1100120";
			wewe.area += "041%7C%7C%BF%B9%BB%EA%B1%BA%7C%7C%C0%C0%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200010";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B1%A4%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�Ƚñ��浿":
			crolling.area += ",O1200020";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B1%B8%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�Ƚñ��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200030";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B1%B8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٰ���":
			crolling.area += ",O1200040";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B4%D9%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",O1200050";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O1200060";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O1200080";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B8%F1%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",O1200090";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O1200110";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BA%B4%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O1200120";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BA%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			crolling.area += ",O1200140";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200160";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",O1200170";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BB%EF%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200190";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BC%BA%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			crolling.area += ",O1200250";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BC%BA%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ÿ�":
			crolling.area += ",O1200260";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BC%F6%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź浿":
			crolling.area += ",O1200280";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BD%C5%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ź浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�źε�":
			crolling.area += ",O1200290";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BD%C5%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�źε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ���":
			crolling.area += ",O1200340";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BE%C8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200360";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BF%B5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",O1200370";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BF%C0%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",O1200390";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BF%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200420";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BF%F8%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",O1200400";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BF%F8%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",O1200410";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%BF%F8%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1200430";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%C0%AF%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�絿":
			crolling.area += ",O1200470";
			wewe.area += "C041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%C3%BB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",O1200480";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%C3%BB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",O1200490";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%B5%BF%B3%B2%B1%B8%7C%7C%C7%B3%BC%BC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1210010";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%B5%CE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮��":
			crolling.area += ",O1210020";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%B9%E9%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�鼮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�δ뵿":
			crolling.area += ",O1210030";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BA%CE%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�δ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ�1��":
			crolling.area += ",O1210210";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�μ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ�2��":
			crolling.area += ",O1210220";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�μ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҵ絿":
			crolling.area += ",O1210040";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BA%D2%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ҵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1210050";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BC%BA%B0%C5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1210060";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BC%BA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1210090";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BC%BA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",O1210070";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BC%BA%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",O1210080";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BC%BA%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȯ��":
			crolling.area += ",O1210100";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BC%BA%C8%AF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȯ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ絿":
			crolling.area += ",O1210110";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ뵿":
			crolling.area += ",O1210150";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BD%D6%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�1��":
			crolling.area += ",O1210120";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BD%D6%BF%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�2��":
			crolling.area += ",O1210130";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BD%D6%BF%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�3��":
			crolling.area += ",O1210140";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BD%D6%BF%EB3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1210160";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BE%F7%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",O1210170";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%BF%CD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1210180";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%C0%D4%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",O1210190";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%C1%F7%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",O1210200";
			wewe.area += "041%7C%7C%C3%B5%BE%C8%BD%C3+%BC%AD%BA%CF%B1%B8%7C%7C%C2%F7%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1300010";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%B3%B2%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			crolling.area += ",O1300020";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%B4%EB%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",O1300030";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%B8%F1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1300040";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%BA%F1%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O1300050";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%BF%EE%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1300060";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%C0%E5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1300070";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%C1%A4%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",O1300080";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%C3%BB%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",O1300090";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%C3%BB%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",O1300100";
			wewe.area += "041%7C%7C%C3%BB%BE%E7%B1%BA%7C%7C%C8%AD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O1400010";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%B0%ED%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1400020";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%B1%D9%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¾ȱ�����":
			crolling.area += ",O1400030";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�¾ȱ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҿ���":
			crolling.area += ",O1400040";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%BC%D2%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ҿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȸ���":
			crolling.area += ",O1400050";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%BE%C8%B8%E9%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ȸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",O1400060";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%BF%F8%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			crolling.area += ",O1400070";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%C0%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�¾���":
			crolling.area += ",O1400080";
			wewe.area += "041%7C%7C%C5%C2%BE%C8%B1%BA%7C%7C%C5%C2%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�¾���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",O1500010";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%B0%A5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ἲ��":
			crolling.area += ",O1500020";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%B0%E1%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ἲ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",O1500030";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%B1%A4%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			crolling.area += ",O1500040";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%B1%B8%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݸ���":
			crolling.area += ",O1500050";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%B1%DD%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",O1500060";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%BC%AD%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",O1500070";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%C0%BA%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",O1500080";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%C0%E5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",O1500090";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%C8%AB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",O1500100";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%C8%AB%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",O1500110";
			wewe.area += "041%7C%7C%C8%AB%BC%BA%B1%BA%7C%7C%C8%AB%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
