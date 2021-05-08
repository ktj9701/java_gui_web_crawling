package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Chungbuk {
	public boolean flag;

	public void ChungbukCity(ActionEvent e) {
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
			Albamoncrolling.area += ",P0100010";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B0%A8%B9%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0100020";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B1%AB%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0100030";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%B9%AE%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0100040";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BA%D2%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�縮��":
			Albamoncrolling.area += ",P0100050";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BB%E7%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�縮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҽ���":
			Albamoncrolling.area += ",P0100060";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BC%D2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ҽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			Albamoncrolling.area += ",P0100070";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%BF%AC%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�忬��":
			Albamoncrolling.area += ",P0100080";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C0%E5%BF%AC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�忬��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ȸ�":
			Albamoncrolling.area += ",P0100090";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C3%BB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûõ��":
			Albamoncrolling.area += ",P0100100";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C3%BB%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ûõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			Albamoncrolling.area += ",P0100110";
			AlbaHeavencrolling.area += "043%7C%7C%B1%AB%BB%EA%B1%BA%7C%7C%C4%A5%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0200010";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B0%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܼ���":
			Albamoncrolling.area += ",P0200020";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%DC%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܾ���":
			Albamoncrolling.area += ",P0200030";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%DC%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ܾ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			Albamoncrolling.area += ",P0200040";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B4%EB%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0200050";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%B8%C5%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ��":
			Albamoncrolling.area += ",P0200060";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%BE%EE%BB%F3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0200070";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%BF%B5%C3%E1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0200080";
			AlbaHeavencrolling.area += "043%7C%7C%B4%DC%BE%E7%B1%BA%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",P0300010";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%B3%BB%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			Albamoncrolling.area += ",P0300030";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%B8%B6%B7%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0300040";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BA%B8%C0%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܸ�":
			Albamoncrolling.area += ",P0300050";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BB%EA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��¸�":
			Albamoncrolling.area += ",P0300060";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BB%EF%BD%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӹ����":
			Albamoncrolling.area += ",P0300020";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BC%D3%B8%AE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӹ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ѹ�":
			Albamoncrolling.area += ",P0300070";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%BC%F6%C7%D1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ѹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			Albamoncrolling.area += ",P0300085";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C0%E5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź�θ�":
			Albamoncrolling.area += ",P0300090";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C5%BA%BA%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ź�θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			Albamoncrolling.area += ",P0300100";
			AlbaHeavencrolling.area += "043%7C%7C%BA%B8%C0%BA%B1%BA%7C%7C%C8%B8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�ϸ�":
			Albamoncrolling.area += ",P0300110";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű��":
			Albamoncrolling.area += ",P0400010";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%B8%C5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ű��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",P0400020";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BB%F3%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P0400030";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BD%C9%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簭��":
			Albamoncrolling.area += ",P0400040";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BE%E7%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�簭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0400050";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BE%E7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0400060";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%B5%B5%BF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0400070";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",P0400080";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%BF%EB%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ�ɸ�":
			Albamoncrolling.area += ",P0400090";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C3%DF%C7%B3%B7%C9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ�ɸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л��":
			Albamoncrolling.area += ",P0400100";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C7%D0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�л��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",P0400110";
			AlbaHeavencrolling.area += "043%7C%7C%BF%B5%B5%BF%B1%BA%7C%7C%C8%B2%B0%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",P0500010";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B1%BA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0500020";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",P0500030";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%B5%BF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȳ���":
			Albamoncrolling.area += ",P0500040";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BE%C8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȳ���":
			Albamoncrolling.area += ",P0500050";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BE%C8%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P0500060";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%BF%C1%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			Albamoncrolling.area += ",P0500070";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C0%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			Albamoncrolling.area += ",P0500080";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",P0500090";
			AlbaHeavencrolling.area += "043%7C%7C%BF%C1%C3%B5%B1%BA%7C%7C%C3%BB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0600020";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B0%A8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			Albamoncrolling.area += ",P0600030";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B1%DD%BF%D5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ҹ�":
			Albamoncrolling.area += ",P0600040";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B4%EB%BC%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ҹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�͵���":
			Albamoncrolling.area += ",P0600050";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%B8%CD%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�͵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｚ��":
			Albamoncrolling.area += ",P0600060";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BB%EF%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ｚ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			Albamoncrolling.area += ",P0600070";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BB%FD%B1%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",P0600080";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BC%D2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0600090";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%BF%F8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0600100";
			AlbaHeavencrolling.area += "043%7C%7C%C0%BD%BC%BA%B1%BA%7C%7C%C0%BD%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0700010";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%AD%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P0700020";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%ED%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",P0700030";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B0%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0700040";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			Albamoncrolling.area += ",P0700050";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P0700060";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B3%B2%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뷮��":
			Albamoncrolling.area += ",P0700070";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B4%EB%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뷮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0700080";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B4%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0700090";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B5%BF%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",P0700100";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B5%CE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",P0700110";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0700120";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%ED%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",P0700130";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0700140";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%B9%E9%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0700150";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BA%C0%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",P0700160";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",P0700170";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%AD%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���и�":
			Albamoncrolling.area += ",P0700180";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%DB%C7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���и�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0700190";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BC%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			Albamoncrolling.area += ",P0700200";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź鵿":
			Albamoncrolling.area += ",P0700210";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ź鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",P0700220";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P0700230";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�վϵ�":
			Albamoncrolling.area += ",P0700240";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%BF%D5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�վϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǹ���":
			Albamoncrolling.area += ",P0700260";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%C7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ǹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			Albamoncrolling.area += ",P0700270";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%DA%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0700280";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C0%E5%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�1��":
			Albamoncrolling.area += ",P0700290";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӷ�2��":
			Albamoncrolling.area += ",P0700300";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӷ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			Albamoncrolling.area += ",P0700310";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",P0700320";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%BB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûǳ��":
			Albamoncrolling.area += ",P0700330";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C3%BB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ûǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼҵ�":
			Albamoncrolling.area += ",P0700340";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C7%CF%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѽ���":
			Albamoncrolling.area += ",P0700350";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C7%D1%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ѽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�굿":
			Albamoncrolling.area += ",P0700360";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漮��":
			Albamoncrolling.area += ",P0700370";
			AlbaHeavencrolling.area += "043%7C%7C%C1%A6%C3%B5%BD%C3%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			Albamoncrolling.area += ",P1300010";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F5%C6%F2%B1%BA%7C%7C%B5%B5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1300020";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F5%C6%F2%B1%BA%7C%7C%C1%F5%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",P0800010";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B1%A4%C7%FD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�������":
			Albamoncrolling.area += ",P0800020";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B4%F6%BB%EA%B8%E9%";
			Mainpage.Filtering[Mainpage.index].setText("��õ�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0800030";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B9%AE%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0800040";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%B9%E9%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			Albamoncrolling.area += ",P0800050";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C0%CC%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P0800060";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C1%F8%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P0800070";
			AlbaHeavencrolling.area += "043%7C%7C%C1%F8%C3%B5%B1%BA%7C%7C%C3%CA%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1000440";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B0%A1%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P1000010";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B1%DD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",P1000020";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",P1000030";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",P1000450";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",P1000040";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B2%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1000460";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B3%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			Albamoncrolling.area += ",P1000080";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",P1000090";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B8%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			Albamoncrolling.area += ",P1000470";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%AE%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",P1000100";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̿���":
			Albamoncrolling.area += ",P1000480";
			AlbaHeavencrolling.area += "43%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%CC%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漭��":
			Albamoncrolling.area += ",P1000110";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%B9%E6%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���1��":
			Albamoncrolling.area += ",P1000120";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���2��":
			Albamoncrolling.area += ",P1000130";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���3��":
			Albamoncrolling.area += ",P1000140";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BA%CF%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼺��":
			Albamoncrolling.area += ",P1000160";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BB%EA%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1000170";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AD%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P1000180";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AD%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1000190";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%AE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			Albamoncrolling.area += ",P1000490";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1000200";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1000210";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P1000220";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%B5%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���.���.�꼺��":
			Albamoncrolling.area += ",P1000500";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���.���.�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��㵿":
			Albamoncrolling.area += ",P1000270";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",P1000300";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",P1000280";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",P1000290";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1000310";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P1000330";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%EE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1000340";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%BF%F9%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",P1000510";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P1000410";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C1%F6%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž.�뼺��":
			Albamoncrolling.area += ",P1000520";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("ž.�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž��":
			Albamoncrolling.area += ",P1000420";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",P1000430";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BB%F3%B4%E7%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			Albamoncrolling.area += ",P1400010";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B0%B3%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",P1400020";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B3%B2%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",P1400030";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B8%F0%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1400040";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%B9%CC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1400050";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BA%D0%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1400060";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P1400070";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",P1400080";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C1%F72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",P1400090";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�곲��":
			Albamoncrolling.area += ",P1400100";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BB%EA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ.����.�׸���":
			Albamoncrolling.area += ",P1400110";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ.����.�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",P1400120";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%BA%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P1400130";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P1400140";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",P1400150";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%BC%F6%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强��":
			Albamoncrolling.area += ",P1400160";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�强��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",P1400170";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C0%E5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			Albamoncrolling.area += ",P1400180";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1400190";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%BC%AD%BF%F8%B1%B8%7C%7C%C7%F6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0900150";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P0900160";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",P0900170";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0900070";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%B3%BB%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",P0900110";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BA%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P0900180";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BB%E7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����嵿":
			Albamoncrolling.area += ",P0900190";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�����嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0900200";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%C0%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",P0900120";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%C0%C3%A2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܳ���":
			Albamoncrolling.area += ",P0900210";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0900220";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P0900230";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%DC%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",P0900240";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%BF%EC%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����.��õ��":
			Albamoncrolling.area += ",P0900250";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����.��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P0900260";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C0%B2%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P0900270";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P0900280";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P0900290";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ּ���":
			Albamoncrolling.area += ",P0900300";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ּ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",P0900310";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C3%BB%BF%F8%B1%B8%7C%7C%C1%D6%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",P1100010";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%A1%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100540";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100040";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P1100020";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",P1100030";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B0%AD%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100550";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%C0%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",P1100060";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B3%B2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P1100070";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100080";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B5%BF%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P1100100";
			AlbaHeavencrolling.area += "43%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%B9%AE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100140";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P1100120";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",P1100130";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%B9%B4%EB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1100170";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%C0%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P1100150";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%C0%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2.������":
			Albamoncrolling.area += ",P1100160";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����2.������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P1100190";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BA%F1%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",P1100250";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BB%F3%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",P1100260";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",P1100270";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҵ�":
			Albamoncrolling.area += ",P1100280";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%AE%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100300";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%DB%C0%FD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100310";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",P1100350";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BC%F6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ뵿":
			Albamoncrolling.area += ",P1100360";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			Albamoncrolling.area += ",P1100370";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",P1100380";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100390";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",P1100400";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P1100560";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܺϵ�":
			Albamoncrolling.area += ",P1100410";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%DC%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܺϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ.�ź���":
			Albamoncrolling.area += ",P1100570";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��õ.�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P1100420";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%EE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1100430";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%BF%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100460";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C1%A4%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100480";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C1%F6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",P1100490";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1100500";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C7%E2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",P1100510";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C7%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�赿":
			Albamoncrolling.area += ",P1100520";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C8%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޾ϵ�":
			Albamoncrolling.area += ",P1100530";
			AlbaHeavencrolling.area += "043%7C%7C%C3%BB%C1%D6%BD%C3+%C8%EF%B4%F6%B1%B8%7C%7C%C8%DE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޾ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",P1200020";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B0%A1%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200050";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",P1200030";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",P1200040";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%B3%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ���":
			Albamoncrolling.area += ",P1200060";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%DD%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݴɵ�":
			Albamoncrolling.area += ",P1200070";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B1%DD%B8%AA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݴɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200080";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B3%EB%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܿ���":
			Albamoncrolling.area += ",P1200090";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%DC%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",P1200100";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%DE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ҿ���":
			Albamoncrolling.area += ",P1200320";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B4%EB%BC%D2%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ҿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200110";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B5%BF%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P1200120";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B8%F1%B9%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			Albamoncrolling.area += ",P1200130";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B8%F1%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽù�ȭ��":
			Albamoncrolling.area += ",P1200140";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽù�ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",P1200150";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BA%C0%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			Albamoncrolling.area += ",P1200160";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BB%EA%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��̸�":
			Albamoncrolling.area += ",P1200170";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BB%EC%B9%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200180";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200190";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200200";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%BA%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¸�":
			Albamoncrolling.area += ",P1200210";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%D2%C5%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ⱥ���":
			Albamoncrolling.area += ",P1200220";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BC%F6%BE%C8%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ⱥ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵϸ�":
			Albamoncrolling.area += ",P1200230";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BD%C5%B4%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȸ���":
			Albamoncrolling.area += ",P1200240";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%C8%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӽ���":
			Albamoncrolling.area += ",P1200250";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%D3%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200260";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BE%F6%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200270";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%AC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",P1200280";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			Albamoncrolling.area += ",P1200290";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",P1200300";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",P1200310";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%BF%EB%C5%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",P1200330";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%BE%B9%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ִ���":
			Albamoncrolling.area += ",P1200340";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%D6%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ִ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾�ž��":
			Albamoncrolling.area += ",P1200010";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%C5%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�߾�ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",P1200350";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%F6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",P1200360";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",P1200370";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C3%E6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",P1200380";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C3%E6%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ�ݵ�":
			Albamoncrolling.area += ",P1200390";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C4%A5%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��":
			Albamoncrolling.area += ",P1200400";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�ϵ�":
			Albamoncrolling.area += ",P1200410";
			AlbaHeavencrolling.area += "043%7C%7C%C3%E6%C1%D6%BD%C3%7C%7C%C8%A3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}