package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Chungbuk {
	public boolean flag;

	public void ChungbukCity(ActionEvent e) {
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
		case "������":
			crolling.area += ",P0100010";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B0%A8%B9%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0100020";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B1%AB%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0100030";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B9%AE%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0100040";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BA%D2%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�縮��":
			crolling.area += ",P0100050";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BB%E7%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�縮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҽ���":
			crolling.area += ",P0100060";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BC%D2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ҽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",P0100070";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BF%AC%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�忬��":
			crolling.area += ",P0100080";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C0%E5%BF%AC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�忬��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ȸ�":
			crolling.area += ",P0100090";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C3%BB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûõ��":
			crolling.area += ",P0100100";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C3%BB%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ûõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",P0100110";
			wewe.area = "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C4%A5%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0200010";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B0%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܼ���":
			crolling.area += ",P0200020";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%DC%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܾ���":
			crolling.area += ",P0200030";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%DC%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ܾ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			crolling.area += ",P0200040";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%EB%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0200050";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B8%C5%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ��":
			crolling.area += ",P0200060";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%BE%EE%BB%F3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0200070";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%BF%B5%C3%E1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0200080";
			wewe.area = "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",P0300010";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%B3%BB%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",P0300030";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%B8%B6%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0300040";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BA%B8%C0%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܸ�":
			crolling.area += ",P0300050";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��¸�":
			crolling.area += ",P0300060";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BB%EF%BD%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӹ����":
			crolling.area += ",P0300020";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BC%D3%B8%AE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӹ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ѹ�":
			crolling.area += ",P0300070";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BC%F6%C7%D1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ѹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			crolling.area += ",P0300085";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C0%E5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź�θ�":
			crolling.area += ",P0300090";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C5%BA%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ź�θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",P0300100";
			wewe.area = "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C8%B8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�ϸ�":
			crolling.area += ",P0300110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű��":
			crolling.area += ",P0400010";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%B8%C5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ű��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",P0400020";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BB%F3%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P0400030";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BD%C9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簭��":
			crolling.area += ",P0400040";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BE%E7%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�簭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0400050";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BE%E7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0400060";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%B5%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0400070";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",P0400080";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%EB%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ�ɸ�":
			crolling.area += ",P0400090";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C3%DF%C7%B3%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ�ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л��":
			crolling.area += ",P0400100";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C7%D0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�л��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			crolling.area += ",P0400110";
			wewe.area = "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C8%B2%B0%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",P0500010";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B1%BA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0500020";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",P0500030";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B5%BF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȳ���":
			crolling.area += ",P0500040";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BE%C8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȳ���":
			crolling.area += ",P0500050";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BE%C8%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P0500060";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BF%C1%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			crolling.area += ",P0500070";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C0%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			crolling.area += ",P0500080";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",P0500090";
			wewe.area = "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C3%BB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0600020";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B0%A8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",P0600030";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B1%DD%BF%D5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ҹ�":
			crolling.area += ",P0600040";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B4%EB%BC%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ҹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�͵���":
			crolling.area += ",P0600050";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B8%CD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�͵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��":
			crolling.area += ",P0600060";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BB%EF%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			crolling.area += ",P0600070";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BB%FD%B1%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",P0600080";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BC%D2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0600090";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BF%F8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0600100";
			wewe.area = "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%C0%BD%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0700010";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%AD%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P0700020";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%ED%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",P0700030";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0700040";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",P0700050";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P0700060";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B3%B2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뷮��":
			crolling.area += ",P0700070";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B4%EB%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뷮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0700080";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B4%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0700090";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B5%BF%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",P0700100";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B5%CE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",P0700110";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0700120";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%ED%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",P0700130";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0700140";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B9%E9%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0700150";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BA%C0%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",P0700160";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",P0700170";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%AD%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���и�":
			crolling.area += ",P0700180";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%DB%C7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���и�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0700190";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",P0700200";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź鵿":
			crolling.area += ",P0700210";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ź鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",P0700220";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P0700230";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�վϵ�":
			crolling.area += ",P0700240";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BF%D5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�վϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǹ���":
			crolling.area += ",P0700260";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%C7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ǹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",P0700270";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%DA%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0700280";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%E5%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�1��":
			crolling.area += ",P0700290";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�2��":
			crolling.area += ",P0700300";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			crolling.area += ",P0700310";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",P0700320";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%BB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûǳ��":
			crolling.area += ",P0700330";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%BB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ûǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼҵ�":
			crolling.area += ",P0700340";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C7%CF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѽ���":
			crolling.area += ",P0700350";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C7%D1%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ѽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�굿":
			crolling.area += ",P0700360";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漮��":
			crolling.area += ",P0700370";
			wewe.area = "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			crolling.area += ",P1300010";
			wewe.area = "043%7C%7C%C1%F5%C6%F2%B1%BA%7C%7C%B5%B5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1300020";
			wewe.area = "043%7C%7C%C1%F5%C6%F2%B1%BA%7C%7C%C1%F5%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",P0800010";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B1%A4%C7%FD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�������":
			crolling.area += ",P0800020";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B4%F6%BB%EA%B8%E9%";
			Mainpage.Filtering[Mainpage.index].setText("��õ�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0800030";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B9%AE%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0800040";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B9%E9%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			crolling.area += ",P0800050";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C0%CC%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P0800060";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C1%F8%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P0800070";
			wewe.area = "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C3%CA%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1000440";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B0%A1%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P1000010";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B1%DD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",P1000020";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",P1000030";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",P1000450";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",P1000040";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1000460";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			crolling.area += ",P1000080";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",P1000090";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B8%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			crolling.area += ",P1000470";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%AE%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",P1000100";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			crolling.area += ",P1000480";
			wewe.area = "43%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漭��":
			crolling.area += ",P1000110";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%E6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���1��":
			crolling.area += ",P1000120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���2��":
			crolling.area += ",P1000130";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���3��":
			crolling.area += ",P1000140";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼺��":
			crolling.area += ",P1000160";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1000170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P1000180";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1000190";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			crolling.area += ",P1000490";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1000200";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1000210";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P1000220";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%B5%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���.���.�꼺��":
			crolling.area += ",P1000500";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("���.���.�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��㵿":
			crolling.area += ",P1000270";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",P1000300";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",P1000280";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",P1000290";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1000310";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P1000330";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1000340";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%F9%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",P1000510";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P1000410";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C1%F6%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž.�뼺��":
			crolling.area += ",P1000520";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("ž.�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž��":
			crolling.area += ",P1000420";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",P1000430";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			crolling.area += ",P1400010";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B0%B3%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",P1400020";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B3%B2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",P1400030";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B8%F0%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1400040";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B9%CC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1400050";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BA%D0%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1400060";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P1400070";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",P1400080";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",P1400090";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�곲��":
			crolling.area += ",P1400100";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%EA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ.����.�׸���":
			crolling.area += ",P1400110";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ.����.�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",P1400120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%BA%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P1400130";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P1400140";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",P1400150";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强��":
			crolling.area += ",P1400160";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�强��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",P1400170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C0%E5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			crolling.area += ",P1400180";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1400190";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C7%F6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0900150";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P0900160";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",P0900170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0900070";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",P0900110";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BA%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P0900180";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BB%E7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����嵿":
			crolling.area += ",P0900190";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("�����嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0900200";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%C0%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",P0900120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%C0%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܳ���":
			crolling.area += ",P0900210";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0900220";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P0900230";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",P0900240";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%EC%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����.��õ��":
			crolling.area += ",P0900250";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("����.��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P0900260";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C0%B2%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P0900270";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P0900280";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P0900290";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ּ���":
			crolling.area += ",P0900300";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ּ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",P0900310";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%D6%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",P1100010";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%A1%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100540";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100040";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P1100020";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",P1100030";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100550";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%C0%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",P1100060";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B3%B2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P1100070";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100080";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B5%BF%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P1100100";
			wewe.area = "43%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B9%AE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100140";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P1100120";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",P1100130";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1100170";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P1100150";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%C0%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2.������":
			crolling.area += ",P1100160";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("����2.������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P1100190";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%F1%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",P1100250";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BB%F3%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",P1100260";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",P1100270";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҵ�":
			crolling.area += ",P1100280";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AE%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100300";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%DB%C0%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100310";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",P1100350";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%F6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ뵿":
			crolling.area += ",P1100360";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			crolling.area += ",P1100370";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",P1100380";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100390";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",P1100400";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P1100560";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܺϵ�":
			crolling.area += ",P1100410";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%DC%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܺϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ.�ź���":
			crolling.area += ",P1100570";
			wewe.area = "";
			Mainpage.Filtering[Mainpage.index].setText("��õ.�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P1100420";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%EE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1100430";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100460";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C1%A4%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100480";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C1%F6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",P1100490";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1100500";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C7%E2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",P1100510";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C7%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�赿":
			crolling.area += ",P1100520";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C8%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޾ϵ�":
			crolling.area += ",P1100530";
			wewe.area = "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C8%DE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",P1200020";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B0%A1%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200050";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",P1200030";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",P1200040";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ���":
			crolling.area += ",P1200060";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%DD%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݴɵ�":
			crolling.area += ",P1200070";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%DD%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݴɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200080";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B3%EB%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܿ���":
			crolling.area += ",P1200090";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%DC%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",P1200100";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%DE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ҿ���":
			crolling.area += ",P1200320";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%EB%BC%D2%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ҿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200110";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B5%BF%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P1200120";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B8%F1%B9%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",P1200130";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B8%F1%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽù�ȭ��":
			crolling.area += ",P1200140";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽù�ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",P1200150";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BA%C0%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			crolling.area += ",P1200160";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BB%EA%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��̸�":
			crolling.area += ",P1200170";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BB%EC%B9%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200180";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200190";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200200";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¸�":
			crolling.area += ",P1200210";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%D2%C5%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ⱥ���":
			crolling.area += ",P1200220";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%F6%BE%C8%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ⱥ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵϸ�":
			crolling.area += ",P1200230";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BD%C5%B4%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȸ���":
			crolling.area += ",P1200240";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%C8%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӽ���":
			crolling.area += ",P1200250";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%D3%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200260";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200270";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%AC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",P1200280";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			crolling.area += ",P1200290";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",P1200300";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",P1200310";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",P1200330";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%BE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ִ���":
			crolling.area += ",P1200340";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%D6%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ִ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾�ž��":
			crolling.area += ",P1200010";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%C5%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�߾�ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",P1200350";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%F6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",P1200360";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",P1200370";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C3%E6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",P1200380";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C3%E6%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ�ݵ�":
			crolling.area += ",P1200390";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C4%A5%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��":
			crolling.area += ",P1200400";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�ϵ�":
			crolling.area += ",P1200410";
			wewe.area = "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C8%A3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}