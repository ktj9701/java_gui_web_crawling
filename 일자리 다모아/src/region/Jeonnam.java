package region;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
public class Jeonnam {
	public boolean flag;

	public void JeonnamCity(ActionEvent e) {
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
			Albamoncrolling.area += ",L0100010";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B0%AD%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0100020";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B1%BA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뱸��":
			Albamoncrolling.area += ",L0100030";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B4%EB%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뱸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L0100040";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B5%B5%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0100050";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%B8%B6%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0100060";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BA%B4%BF%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0100070";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BC%BA%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0100080";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BD%C5%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L0100090";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%BF%C8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L0100100";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%C0%DB%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			Albamoncrolling.area += ",L0100110";
			AlbaHeavencrolling.area += "061%7C%7C%B0%AD%C1%F8%B1%BA%7C%7C%C4%A5%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200010";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B0%ED%C8%EF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200020";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B0%FA%BF%AA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ��":
			Albamoncrolling.area += ",L0200030";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B1%DD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0200040";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B3%B2%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼭��":
			Albamoncrolling.area += ",L0200050";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B4%EB%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뼭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200060";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%B5%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200070";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%B5%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",L0200080";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%B5%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200090";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%BF%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L0200100";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%BF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���":
			Albamoncrolling.area += ",L0200110";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%B5%CE%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ο���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200120";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%BA%C0%B7%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0200130";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%BF%B5%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L0200140";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%C1%A1%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			Albamoncrolling.area += ",L0200150";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%C6%F7%B5%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ���":
			Albamoncrolling.area += ",L0200160";
			AlbaHeavencrolling.area += "061%7C%7C%B0%ED%C8%EF%B1%BA%7C%7C%C7%B3%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L0300010";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B0%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��޸�":
			Albamoncrolling.area += ",L0300020";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B0%ED%B4%DE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��޸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L0300030";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B0%EE%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿��":
			Albamoncrolling.area += ",L0300040";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%B8%F1%BB%E7%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��絿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0300050";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BB%EF%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0300060";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BC%AE%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0300070";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BF%C0%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0300080";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BF%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0300090";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%BF%C1%B0%FA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ը�":
			Albamoncrolling.area += ",L0300100";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%C0%D4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ը�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�װ��":
			Albamoncrolling.area += ",L0300110";
			AlbaHeavencrolling.area += "061%7C%7C%B0%EE%BC%BA%B1%BA%7C%7C%C1%D7%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�װ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0400010";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B1%A4%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0400020";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B1%A4%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L0400030";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�پи�":
			Albamoncrolling.area += ",L0400040";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B4%D9%BE%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�پи�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",L0400050";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B5%B5%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0400060";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%B8%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0400070";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BA%C0%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			Albamoncrolling.area += ",L0400080";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BC%BA%C8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0400090";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BF%C1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0400100";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%BF%C1%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߱���":
			Albamoncrolling.area += ",L0400110";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%DF%B1%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߱���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			Albamoncrolling.area += ",L0400120";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0400130";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%F8%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0400140";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C1%F8%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",L0400150";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C5%C2%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�ݵ�":
			Albamoncrolling.area += ",L0400160";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�浿":
			Albamoncrolling.area += ",L0400170";
			AlbaHeavencrolling.area += "061%7C%7C%B1%A4%BE%E7%BD%C3%7C%7C%C8%B2%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0500010";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B0%A3%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			Albamoncrolling.area += ",L0500020";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B1%A4%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0500030";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B1%B8%B7%CA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0500040";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B8%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			Albamoncrolling.area += ",L0500050";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%B9%AE%C3%B4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�굿��":
			Albamoncrolling.area += ",L0500060";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%BB%EA%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�굿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0500070";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%BF%EB%B9%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0500080";
			AlbaHeavencrolling.area += "061%7C%7C%B1%B8%B7%CA%B1%BA%7C%7C%C5%E4%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600010";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%E6%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0600020";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%F8%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600030";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%FA%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600040";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B0%FC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0600050";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ赿":
			Albamoncrolling.area += ",L0600060";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%DD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���":
			Albamoncrolling.area += ",L0600070";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",L0600080";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			Albamoncrolling.area += ",L0600090";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%DD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L0600100";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B1%DD%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600110";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%B2%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			Albamoncrolling.area += ",L0600120";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%B2%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600130";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%B2%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			Albamoncrolling.area += ",L0600140";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B3%EB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٵ���":
			Albamoncrolling.area += ",L0600150";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%D9%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٽø�":
			Albamoncrolling.area += ",L0600160";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%D9%BD%C3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٽø�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			Albamoncrolling.area += ",L0600170";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%EB%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L0600180";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B4%EB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﱺ������":
			Albamoncrolling.area += ",L0600190";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B5%BF%B0%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ﱺ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600200";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B5%BF%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0600210";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B9%AE%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���":
			Albamoncrolling.area += ",L0600220";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%B9%DD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L0600230";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			Albamoncrolling.area += ",L0600240";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%C0%C8%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�δ���":
			Albamoncrolling.area += ",L0600250";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%CE%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�δ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",L0600260";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BA%FB%B0%A1%B6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600270";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600280";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EA%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵵ��":
			Albamoncrolling.area += ",L0600290";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EF%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵵ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�￵��":
			Albamoncrolling.area += ",L0600300";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BB%EF%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�￵��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600310";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%AD%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600320";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",L0600330";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%BA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600340";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%BC%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۿ���":
			Albamoncrolling.area += ",L0600350";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%DB%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",L0600360";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",L0600370";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BE%C8%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600380";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L06009010";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%B5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600400";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%C0%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�հ��":
			Albamoncrolling.area += ",L0600410";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%D5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�հ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",L0600420";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",L0600430";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%BF%EE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",L0600440";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C0%CC%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׸���":
			Albamoncrolling.area += ",L0600450";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C1%D7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",L0600460";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0600470";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C1%F8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û��":
			Albamoncrolling.area += ",L0600480";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			Albamoncrolling.area += ",L0600490";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C5%E4%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",L0600500";
			AlbaHeavencrolling.area += "061%7C%7C%B3%AA%C1%D6%BD%C3%7C%7C%C6%F2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0700010";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B0%ED%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			Albamoncrolling.area += ",L0700020";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0700030";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0700040";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B4%E3%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0700050";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0700060";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B4%EB%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0700070";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%B9%AB%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0700080";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BA%C0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L0700090";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BC%F6%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L0700100";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BF%EB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0700110";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%BF%F9%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â���":
			Albamoncrolling.area += ",L0700120";
			AlbaHeavencrolling.area += "061%7C%7C%B4%E3%BE%E7%B1%BA%7C%7C%C3%A2%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("â���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�浿1��":
			Albamoncrolling.area += ",L0800020";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B0%E6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�浿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�浿2��":
			Albamoncrolling.area += ",L0800030";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B0%E6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�浿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",L0800060";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%A4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",L0800070";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%A4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",L0800080";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%A4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݵ�1��":
			Albamoncrolling.area += ",L0800100";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%DD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݵ�2��":
			Albamoncrolling.area += ",L0800110";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%DD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",L0800120";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B1%DD%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0800130";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B3%B2%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޵�":
			Albamoncrolling.area += ",L0800140";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼺��":
			Albamoncrolling.area += ",L0800150";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",L0800160";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",L0800170";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�1��":
			Albamoncrolling.area += ",L0800180";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%C0%C7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�2��":
			Albamoncrolling.area += ",L0800190";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%C0%C7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�3��":
			Albamoncrolling.area += ",L0800200";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B4%EB%C0%C7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0800210";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B5%BF%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L0800220";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B8%B8%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0800230";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			Albamoncrolling.area += ",L0800240";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%B9%AB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",L0800250";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B8%B1%A4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",L0800260";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B8%B1%A4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",L0800270";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B8%B1%A4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0800280";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%B9%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",L0800290";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",L0800300";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���":
			Albamoncrolling.area += ",L0800310";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%CF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			Albamoncrolling.area += ",L0800320";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BA%CF%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",L0800330";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",L0800340";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����û�����":
			Albamoncrolling.area += ",L0800350";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����û�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",L0800360";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",L0800370";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%EF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",L0800380";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			Albamoncrolling.area += ",L0800390";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%F3%B6%F4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			Albamoncrolling.area += ",L0800400";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BB%F3%B6%F4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L0800410";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ü�����":
			Albamoncrolling.area += ",L0800420";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",L0800430";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%F6%B0%AD%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",L0800440";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BC%F6%B0%AD%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",L0800450";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			Albamoncrolling.area += ",L0800460";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L0800470";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%AC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ص�1��":
			Albamoncrolling.area += ",L0800480";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%B5%C7%D8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ص�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",L0800490";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%C1%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�±ݵ�":
			Albamoncrolling.area += ",L0800500";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%C2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�±ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",L0800510";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",L0800520";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",L0800530";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ص�":
			Albamoncrolling.area += ",L0800540";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%EB%C7%D8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ص�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L0800550";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%BF%F8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���޵�":
			Albamoncrolling.area += ",L0800560";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C0%AF%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L0800570";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0800580";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C0%B2%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ױ���":
			Albamoncrolling.area += ",L0800590";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%D7%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ױ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�":
			Albamoncrolling.area += ",L0800600";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�1��":
			Albamoncrolling.area += ",L0800610";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�2��":
			Albamoncrolling.area += ",L0800620";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�1��":
			Albamoncrolling.area += ",L0800630";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�2��":
			Albamoncrolling.area += ",L0800640";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�3��":
			Albamoncrolling.area += ",L0800650";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��":
			Albamoncrolling.area += ",L0800660";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%A2%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ູ��1��":
			Albamoncrolling.area += ",L0800670";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%E0%BA%B9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ູ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ູ��2��":
			Albamoncrolling.area += ",L0800680";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%E0%BA%B9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ູ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ູ��3��":
			Albamoncrolling.area += ",L0800690";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%E0%BA%B9%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ູ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�":
			Albamoncrolling.area += ",L0800700";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C3%F8%C8%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ絿":
			Albamoncrolling.area += ",L0800710";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%CF%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�":
			Albamoncrolling.area += ",L0800720";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D7%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�1��":
			Albamoncrolling.area += ",L0800730";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�2��":
			Albamoncrolling.area += ",L0800740";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�3��":
			Albamoncrolling.area += ",L0800750";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾȵ�4��":
			Albamoncrolling.area += ",L0800760";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%D8%BE%C8%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ؾȵ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ູ��1��":
			Albamoncrolling.area += ",L0800770";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%E0%BA%B9%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ູ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ູ��2��":
			Albamoncrolling.area += ",L0800780";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C7%E0%BA%B9%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ູ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",L0800790";
			AlbaHeavencrolling.area += "061%7C%7C%B8%F1%C6%F7%BD%C3%7C%7C%C8%A3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0900010";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%B8%C1%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",L0900020";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%B8%F9%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0900030";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%B9%AB%BE%C8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0900040";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%BB%EF%C7%E2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L090050";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%BF%EE%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϸ���":
			Albamoncrolling.area += ",L0900060";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C0%CF%B7%CE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ϸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			Albamoncrolling.area += ",L0900070";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C3%BB%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L0900080";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C7%D8%C1%A6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L0900090";
			AlbaHeavencrolling.area += "061%7C%7C%B9%AB%BE%C8%B1%BA%7C%7C%C7%F6%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1000010";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B0%E2%B9%E9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿��":
			Albamoncrolling.area += ",L1000020";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B3%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�淮��":
			Albamoncrolling.area += ",L1000030";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B5%E6%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�淮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1000040";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B9%AE%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̷¸�":
			Albamoncrolling.area += ",L1000050";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B9%CC%B7%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̷¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1000060";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%B9%FA%B1%B3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1000070";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%BA%B8%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1000080";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%BA%B9%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			Albamoncrolling.area += ",L1000090";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%BF%F5%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1000100";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%C0%B2%BE%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1000110";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%C1%B6%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸõ��":
			Albamoncrolling.area += ",L1000120";
			AlbaHeavencrolling.area += "061%7C%7C%BA%B8%BC%BA%B1%BA%7C%7C%C8%B8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȸõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L1100010";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B0%A1%B0%EE%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100020";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B1%B3%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			Albamoncrolling.area += ",L1100030";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			Albamoncrolling.area += ",L1100040";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B3%AB%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ó�����":
			Albamoncrolling.area += ",L1100050";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B3%B2%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ó�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100060";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B3%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			Albamoncrolling.area += ",L1100070";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%EB%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			Albamoncrolling.area += ",L1100080";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%EB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",L1100090";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100100";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B4%F6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			Albamoncrolling.area += ",L1100110";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B5%BF%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű":
			Albamoncrolling.area += ",L1100120";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%B8%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100130";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BA%B0%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",L1100140";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BB%EF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1100150";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BB%F3%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1100160";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BB%FD%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1100170";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ü�����":
			Albamoncrolling.area += ",L1100180";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BC%AE%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۱���":
			Albamoncrolling.area += ",L1100190";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BC%DB%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�۱���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100200";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BD%C2%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			Albamoncrolling.area += ",L1100210";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BE%C8%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",L1100220";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BE%DF%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",L1100230";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%AC%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1100240";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L1100250";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%C0%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L1100260";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ浿":
			Albamoncrolling.area += ",L1100270";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100280";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%D5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܼ���":
			Albamoncrolling.area += ",L1100290";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%DC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ÿ�絿":
			Albamoncrolling.area += ",L1100300";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%EB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ÿ�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1100310";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%BF%F9%B5%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ο���":
			Albamoncrolling.area += ",L1100320";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%CE%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ο���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100330";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%CE%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L1100340";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%E5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1100350";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C0%FA%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L1100360";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			Albamoncrolling.area += ",L1100370";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%B6%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־ϸ�":
			Albamoncrolling.area += ",L1100380";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%D6%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�־ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ���߾ӵ�":
			Albamoncrolling.area += ",L1100390";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ���߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			Albamoncrolling.area += ",L1100400";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C7%B3%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ط��":
			Albamoncrolling.area += ",L1100410";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C7%D8%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ط��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ൿ":
			Albamoncrolling.area += ",L1100420";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C7%E0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",L1100430";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C8%AB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ����":
			Albamoncrolling.area += ",L1100440";
			AlbaHeavencrolling.area += "061%7C%7C%BC%F8%C3%B5%BD%C3%7C%7C%C8%B2%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʸ�":
			Albamoncrolling.area += ",L1200010";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%B5%B5%C3%CA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ʸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ݸ�":
			Albamoncrolling.area += ",L1200020";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BA%F1%B1%DD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ݸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			Albamoncrolling.area += ",L1200030";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BD%C5%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¸�":
			Albamoncrolling.area += ",L1200040";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BE%C8%C1%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¸�":
			Albamoncrolling.area += ",L1200050";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BE%CF%C5%C2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���¸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			Albamoncrolling.area += ",L1200060";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%BE%D0%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڸ�":
			Albamoncrolling.area += ",L1200070";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C0%D3%C0%DA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ڸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1200080";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C0%DA%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1200090";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C0%E5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1200100";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C1%F5%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1200110";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C1%F6%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȱݸ�":
			Albamoncrolling.area += ",L1200120";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C6%C8%B1%DD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȱݸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			Albamoncrolling.area += ",L1200130";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C7%CF%C0%C7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1200140";
			AlbaHeavencrolling.area += "061%7C%7C%BD%C5%BE%C8%B1%BA%7C%7C%C8%E6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L1300010";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%E6%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ҵ�":
			Albamoncrolling.area += ",L1300010";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%ED%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",L1300020";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%F8%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300030";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B0%FC%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300040";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%A4%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ñ���":
			Albamoncrolling.area += ",L1300050";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ñ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1300060";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			Albamoncrolling.area += ",L1300070";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B1%BA%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300080";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B3%AB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ó���":
			Albamoncrolling.area += ",L1300090";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����ó���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L1300100";
			AlbaHeavencrolling.area += "C061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",L1300110";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B4%F6%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300120";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B5%B9%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L1300130";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�д���":
			Albamoncrolling.area += ",L1300140";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B5%D0%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�д���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",L1300150";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B8%B8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300160";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B9%A6%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300170";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B9%AE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1300180";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%B9%CC%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300190";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BA%C0%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",L1300200";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BA%C0%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",L1300210";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1300220";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",L1300230";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BB%F3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300240";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%AD%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300250";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%B1%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҷ��":
			Albamoncrolling.area += ",L1300260";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%D2%B6%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ҷ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L1300270";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%D2%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300280";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BC%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300290";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C3%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			Albamoncrolling.area += ",L1300300";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ���":
			Albamoncrolling.area += ",L1300310";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",L1300320";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ굿":
			Albamoncrolling.area += ",L1300330";
			AlbaHeavencrolling.area += "61%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BE%C8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300340";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%A9%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L1300350";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%A9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",L1300360";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%AC%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300370";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%C0%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ÿ�õ��":
			Albamoncrolling.area += ",L1300380";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%C0%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ÿ�õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L1300390";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%F5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300400";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%F9%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",L1300410";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%BF%F9%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",L1300420";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C0%B2%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1300430";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C0%FB%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",L1300440";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%BE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֻﵿ":
			Albamoncrolling.area += ",L1300450";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%D6%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֻﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������߾ӵ�":
			Albamoncrolling.area += ",L1300460";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",L1300470";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C1%DF%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��":
			Albamoncrolling.area += ",L1300480";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C3%E6%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�湫��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1300490";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C6%F2%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�е�":
			Albamoncrolling.area += ",L1300500";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�п뵿":
			Albamoncrolling.area += ",L1300510";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C7%D0%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�п뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ػ굿":
			Albamoncrolling.area += ",L1300520";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C7%D8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ػ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��":
			Albamoncrolling.area += ",L1300530";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%A3%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���":
			Albamoncrolling.area += ",L1300540";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�嵿":
			Albamoncrolling.area += ",L1300550";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",L1300560";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭġ��":
			Albamoncrolling.area += ",L1300570";
			AlbaHeavencrolling.area += "061%7C%7C%BF%A9%BC%F6%BD%C3%7C%7C%C8%AD%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1400010";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B1%BA%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1400020";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1400030";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B3%AB%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븶��":
			Albamoncrolling.area += ",L1400040";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B4%EB%B8%B6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�븶��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1400050";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B9%A6%B7%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1400060";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B9%E9%BC%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1400070";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%B9%FD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ұ���":
			Albamoncrolling.area += ",L1400080";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%BA%D2%B0%A9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ұ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1400090";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%BF%B0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1400100";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%BF%B5%B1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",L1400110";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%B1%A4%B1%BA%7C%7C%C8%AB%B3%F3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϱ�������":
			Albamoncrolling.area += ",L1500010";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B1%BA%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϱ�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1500020";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B1%DD%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1500030";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B4%F6%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1500040";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B5%B5%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̾ϸ�":
			Albamoncrolling.area += ",L1500050";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%B9%CC%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̾ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L1500060";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BB%EF%C8%A3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",L1500070";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BC%AD%C8%A3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1500080";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BD%C3%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�źϸ�":
			Albamoncrolling.area += ",L1500090";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BD%C5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�źϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1500100";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%BF%B5%BE%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л��":
			Albamoncrolling.area += ",L1500110";
			AlbaHeavencrolling.area += "061%7C%7C%BF%B5%BE%CF%B1%BA%7C%7C%C7%D0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�л��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ݸ�":
			Albamoncrolling.area += ",L1600010";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B0%ED%B1%DD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ݸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܸ�":
			Albamoncrolling.area += ",L1600020";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B1%BA%BF%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݴ��":
			Albamoncrolling.area += ",L1600030";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B1%DD%B4%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݴ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1600040";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B1%DD%C0%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",L1600050";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%B3%EB%C8%AD%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1600060";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BA%B8%B1%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L1600070";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BB%FD%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ҿȸ�":
			Albamoncrolling.area += ",L1600080";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BC%D2%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ҿȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1600090";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BD%C5%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1600100";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BE%E0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ���":
			Albamoncrolling.area += ",L1600110";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%BF%CF%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			Albamoncrolling.area += ",L1600120";
			AlbaHeavencrolling.area += "061%7C%7C%BF%CF%B5%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强������":
			Albamoncrolling.area += ",L1700010";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�弱������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",L1700020";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%B5%BF%C8%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",L1700030";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BA%CF%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L1700040";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BA%CF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",L1700050";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BA%CF%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1700060";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BB%EF%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｍ��":
			Albamoncrolling.area += ",L1700070";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BB%EF%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ｍ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1700080";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%BC%AD%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强��":
			Albamoncrolling.area += ",L1700090";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%C0%E5%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�强��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1700100";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%C1%F8%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ���":
			Albamoncrolling.area += ",L1700110";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%BC%BA%B1%BA%7C%7C%C8%B2%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1800010";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%B0%FC%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1800020";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%B4%EB%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ��":
			Albamoncrolling.area += ",L1800030";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%BA%CE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�λ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ��":
			Albamoncrolling.area += ",L1800040";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%BE%C8%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1800050";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%BF%EB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			Albamoncrolling.area += ",L1800060";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%AF%C4%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿��":
			Albamoncrolling.area += ",L1800070";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%E5%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�嵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1800080";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%E5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1800090";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C0%E5%C8%EF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			Albamoncrolling.area += ",L1800100";
			AlbaHeavencrolling.area += "061%7C%7C%C0%E5%C8%EF%B1%BA%7C%7C%C8%B8%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L1900010";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%B0%ED%B1%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1900020";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǽŸ�":
			Albamoncrolling.area += ",L1900030";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C0%C7%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ǽŸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ��":
			Albamoncrolling.area += ",L1900040";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C0%D3%C8%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1900050";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C1%B6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L1900060";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C1%F6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L1900070";
			AlbaHeavencrolling.area += "061%7C%7C%C1%F8%B5%B5%B1%BA%7C%7C%C1%F8%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L2000010";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%B3%AA%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿��":
			Albamoncrolling.area += ",L2000020";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%B4%EB%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�뵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�պҸ�":
			Albamoncrolling.area += ",L2000030";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BC%D5%BA%D2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�պҸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű���":
			Albamoncrolling.area += ",L2000040";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BD%C5%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ٸ�":
			Albamoncrolling.area += ",L2000050";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BE%F6%B4%D9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ٸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߸�":
			Albamoncrolling.area += ",L2000060";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%BF%F9%BE%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�б���":
			Albamoncrolling.area += ",L2000070";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%C7%D0%B1%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�б���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L2000080";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%C7%D4%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�غ���":
			Albamoncrolling.area += ",L2000090";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D4%C6%F2%B1%BA%7C%7C%C7%D8%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�غ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L2100010";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%B0%E8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�س��������":
			Albamoncrolling.area += ",L2100020";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%B8%B6%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�س��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L2100030";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%B9%AE%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�س������ϸ�":
			Albamoncrolling.area += ",L2100040";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BA%CF%C0%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�س������ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L2100050";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BA%CF%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",L2100060";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BB%EA%C0%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�س�������":
			Albamoncrolling.area += ",L2100070";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BB%EF%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�س�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L2100080";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BC%DB%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L2100090";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%BF%C1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�س���":
			Albamoncrolling.area += ",L2100100";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C7%D8%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�س���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���":
			Albamoncrolling.area += ",L2100110";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C7%F6%BB%EA%B8%E9%";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",L2100120";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C8%AD%BF%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ���":
			Albamoncrolling.area += ",L2100130";
			AlbaHeavencrolling.area += "061%7C%7C%C7%D8%B3%B2%B1%BA%7C%7C%C8%B2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��������":
			Albamoncrolling.area += ",L2200010";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ָ�":
			Albamoncrolling.area += ",L2200020";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B4%C9%C1%D6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ָ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",L2200030";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%B5%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�������ϸ�":
			Albamoncrolling.area += ",L2200040";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%B5%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�������ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L2200050";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",L2200060";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%B5%BF%BA%B9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			Albamoncrolling.area += ",L2200070";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼���":
			Albamoncrolling.area += ",L2200080";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C0%CC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̾��":
			Albamoncrolling.area += ",L2200090";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C0%CC%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̾��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûǳ��":
			Albamoncrolling.area += ",L2200100";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C3%BB%C7%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ûǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",L2200110";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C3%E1%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",L2200120";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C7%D1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",L2200130";
			AlbaHeavencrolling.area += "061%7C%7C%C8%AD%BC%F8%B1%BA%7C%7C%C8%AD%BC%F8%C0%BE&";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
