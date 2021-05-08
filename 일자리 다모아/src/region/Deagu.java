package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.Mainpage;

public class Deagu {
	public boolean flag;

	public void DeaguCity(ActionEvent e) {
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
		// �뱸
		// ����
		case "���":
			Albamoncrolling.area += ",F0100100";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",F0100030";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",F0100040";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",F0100050";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",F0100060";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			Albamoncrolling.area += ",F0100070";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6��":
			Albamoncrolling.area += "F0100080";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���9��":
			Albamoncrolling.area += ",F0100090";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���9��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���10��":
			Albamoncrolling.area += ",F0100010";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED10%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���10��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���11��":
			Albamoncrolling.area += ",F0100020";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���11��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0100140";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0100110";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0100120";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",F0100130";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0100150";
			AlbaHeavencrolling.area += "053%7C%7C%B3%B2%B1%B8%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �޼���
		case "���굿":
			Albamoncrolling.area += ",F0200010";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",F0200020";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B0%A8%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",F0200030";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B4%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0200040";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0200050";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η���":
			Albamoncrolling.area += ",F0200090";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η�1��":
			Albamoncrolling.area += ",F0200060";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η�2��":
			Albamoncrolling.area += ",F0200070";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η�3��":
			Albamoncrolling.area += ",F0200080";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0200100";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0200110";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BA%BB%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",F0200150";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0200120";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0200130";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",F0200140";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",F0200180";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0200160";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0200170";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0200210";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0200190";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0200200";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ絿":
			Albamoncrolling.area += ",F0200220";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",F0200250";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",F0200230";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",F0200240";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0200280";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0200260";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0200270";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0200290";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�췯�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0200300";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰":
			Albamoncrolling.area += ",F0200330";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰�1��":
			Albamoncrolling.area += ",F0200310";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰�2��":
			Albamoncrolling.area += ",F0200320";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			Albamoncrolling.area += ",F0200340";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿":
			Albamoncrolling.area += ",F0200350";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0200360";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0200370";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C1%F8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",F0200380";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C6%C4%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",F0200390";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C8%A3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�굿":
			Albamoncrolling.area += ",F0200400";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C8%A3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �޼���
		case "��â��":
			Albamoncrolling.area += ",F0300010";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B0%A1%C3%A2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0300020";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B1%B8%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0300030";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B3%ED%B0%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ���":
			Albamoncrolling.area += ",F0300040";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B4%D9%BB%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0300050";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%BF%C1%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0300060";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C0%AF%B0%A1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻ��":
			Albamoncrolling.area += ",F0300070";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C7%CF%BA%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			Albamoncrolling.area += ",F0300080";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C7%F6%C7%B3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",F0300090";
			AlbaHeavencrolling.area += "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C8%AD%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ����
		case "���굿":
			Albamoncrolling.area += ",F0400010";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B0%A2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˻絿":
			Albamoncrolling.area += ",F0400020";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B0%CB%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˻絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0400030";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B1%AB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ���":
			Albamoncrolling.area += ",F0400040";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",F0400050";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0400060";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɼ���":
			Albamoncrolling.area += ",F0400070";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%C9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲��":
			Albamoncrolling.area += ",F0400080";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",F0400090";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += "F0400100";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",F0400110";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%B5%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0400120";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",F0400130";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л굿":
			Albamoncrolling.area += ",F0400140";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%D0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",F0400150";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B8%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰":
			Albamoncrolling.area += ",F0400160";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%CC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̴뵿":
			Albamoncrolling.area += ",F0400170";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%CC%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̴뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",F0400180";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%E6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",F0400190";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%E9%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0400200";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%C0%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε�":
			Albamoncrolling.area += ",F0400210";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҷε�":
			Albamoncrolling.area += ",F0400220";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%D2%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҷε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�纹��":
			Albamoncrolling.area += ",F0400230";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BB%E7%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�纹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",F0400240";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BB%F3%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",F0400250";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0400260";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0400270";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%F7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			Albamoncrolling.area += ",F0400280";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���":
			Albamoncrolling.area += ",F0400290";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",F0400300";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žϵ�":
			Albamoncrolling.area += ",F0400360";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�žϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�1��":
			Albamoncrolling.area += ",F0400310";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�2��":
			Albamoncrolling.area += ",F0400320";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�3��":
			Albamoncrolling.area += ",F0400330";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�4��":
			Albamoncrolling.area += ",F0400340";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�5��":
			Albamoncrolling.area += ",F0400350";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ뵿":
			Albamoncrolling.area += ",F0400370";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0400410";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1,2��":
			Albamoncrolling.area += ",F0400380";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B51.2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1,2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ3��":
			Albamoncrolling.area += ",F0400390";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ4��":
			Albamoncrolling.area += ",F0400400";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0400420";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			Albamoncrolling.area += ",F0400430";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0400440";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0400450";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%B2%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0400460";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%B2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Լ���":
			Albamoncrolling.area += ",F0400470";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%D4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Լ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߴ뵿":
			Albamoncrolling.area += ",F0400480";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%DF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0400490";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0400500";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",F0400510";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F8%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򱤵�":
			Albamoncrolling.area += ",F0400520";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C6%F2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򱤵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��":
			Albamoncrolling.area += ",F0400550";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��1��":
			Albamoncrolling.area += ",F0400530";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��2��":
			Albamoncrolling.area += ",F0400540";
			AlbaHeavencrolling.area += "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �ϱ�
		case "�˴ܵ�":
			Albamoncrolling.area += ",F0500010";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%CB%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˴ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0500020";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0500030";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",F0500040";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500050";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%FC%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0500060";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			Albamoncrolling.area += ",F0500070";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%B9%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",F0500080";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",F0500090";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			Albamoncrolling.area += ",F0500100";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			Albamoncrolling.area += ",F0500110";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			Albamoncrolling.area += ",F0500120";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500150";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0500130";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0500140";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500160";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500170";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0500180";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���ȣ��":
			Albamoncrolling.area += ",F0500190";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",F0500200";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500230";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0500210";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0500220";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0500240";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%E7%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ݵ�":
			Albamoncrolling.area += ",F0500290";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",F0500250";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",F0500260";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",F0500270";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",F0500280";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500300";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BC%AD%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",F0500310";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500320";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",F0500330";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C1%B6%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����1��":
			Albamoncrolling.area += ",F0500340";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A5%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����2��":
			Albamoncrolling.area += ",F0500350";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A5%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ�굿":
			Albamoncrolling.area += ",F0500390";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ��1��":
			Albamoncrolling.area += ",F0500360";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ��2��":
			Albamoncrolling.area += ",F0500370";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ��3��":
			Albamoncrolling.area += ",F0500380";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500420";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0500400";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0500410";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ޵�":
			Albamoncrolling.area += ",F0500430";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C6%C8%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0500440";
			AlbaHeavencrolling.area += "053%7C%7C%BA%CF%B1%B8%7C%7C%C7%D0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ����
		case "���絿":
			Albamoncrolling.area += ",F0600040";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0600010";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2,3��":
			Albamoncrolling.area += ",F0600020";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E72.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2,3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",F0600030";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",F0600110";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",F0600050";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2/3��":
			Albamoncrolling.area += ",F0600060";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA2.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2/3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",F0600070";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			Albamoncrolling.area += ",F0600080";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6��":
			Albamoncrolling.area += ",F0600090";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���7��":
			Albamoncrolling.area += ",F0600100";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󸮵�":
			Albamoncrolling.area += ",F0600120";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BB%F3%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󸮵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿1��":
			Albamoncrolling.area += ",F0600130";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���뵿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿2��":
			Albamoncrolling.area += ",F0600140";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���뵿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿3��":
			Albamoncrolling.area += ",F0600150";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���뵿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0600160";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C0%CC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			Albamoncrolling.area += ",F0600170";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򸮵�":
			Albamoncrolling.area += ",F0600240";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򸮵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",F0600180";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",F0600190";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",F0600200";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			Albamoncrolling.area += ",F0600210";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��5��":
			Albamoncrolling.area += ",F0600220";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��6��":
			Albamoncrolling.area += ",F0600230";
			AlbaHeavencrolling.area += "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ������
		case "��õ��":
			Albamoncrolling.area += ",F0700010";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B0%A1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",F0700020";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B0%ED%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺯��":
			Albamoncrolling.area += ",F0700030";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B3%EB%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뺯��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",F0700040";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ굿":
			Albamoncrolling.area += ",F0700050";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B5%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",F0700090";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0700060";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0700070";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",F0700080";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",F0700100";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%C5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0700130";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0700110";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0700120";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",F0700180";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0700140";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0700150";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",F0700160";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",F0700170";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0700190";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%E7%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0700200";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",F0700210";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0700220";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",F0700230";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",F0700240";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",F0700250";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",F0700260";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0700270";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BD%C3%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿŵ�":
			Albamoncrolling.area += ",F0700280";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BD%C5%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",F0700290";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BF%AC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0700300";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BF%ED%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������õ��":
			Albamoncrolling.area += ",F0700310";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			Albamoncrolling.area += ",F0700320";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",F0700350";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0700330";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0700340";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ĵ�":
			Albamoncrolling.area += ",F0700360";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�ݵ�":
			Albamoncrolling.area += ",F0700390";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ��1��":
			Albamoncrolling.area += ",F0700370";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ��2��":
			Albamoncrolling.area += ",F0700380";
			AlbaHeavencrolling.area += "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �߱�
		case "��굿1��":
			Albamoncrolling.area += ",F0800010";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿2��":
			Albamoncrolling.area += ",F0800020";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0800030";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0800040";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",F0800090";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0800050";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0800060";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",F0800070";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",F0800080";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0800100";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BC%BA%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0800110";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޼���":
			Albamoncrolling.area += ",F0800120";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%DE%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0800150";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",F0800130";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",F0800140";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",F0800160";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",F0800170";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",F0800180";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߱�������":
			Albamoncrolling.area += ",F0800190";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߱�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0800200";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",F0800210";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",F0800220";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",F0800230";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",F0800240";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�1��":
			Albamoncrolling.area += ",F0800250";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�2��":
			Albamoncrolling.area += ",F0800260";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�3��":
			Albamoncrolling.area += ",F0800270";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�4��":
			Albamoncrolling.area += ",F0800280";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0800290";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",F0800300";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",F0800310";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			Albamoncrolling.area += ",F0800320";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���1��":
			Albamoncrolling.area += ",F0800330";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���2��":
			Albamoncrolling.area += ",F0800340";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",F0800350";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%E7%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			Albamoncrolling.area += ",F0800360";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			Albamoncrolling.area += ",F0800370";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			Albamoncrolling.area += ",F0800380";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0800390";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%F3%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭵�":
			Albamoncrolling.area += ",F0800400";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󼭵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0800410";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",F0800420";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",F0800430";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",F0800440";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",F0800450";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",F0800460";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0800470";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",F0800480";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����Ϸ�":
			Albamoncrolling.area += ",F0800490";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BD%C3%C0%E5%BA%CF%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("����Ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0800500";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BF%CF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0800510";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%BF%EB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�α���":
			Albamoncrolling.area += ",F0800520";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�α���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",F0800530";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",F0800540";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",F0800550";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",F0800560";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			Albamoncrolling.area += ",F0800570";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			Albamoncrolling.area += ",F0800580";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			Albamoncrolling.area += ",F0800590";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",F0800600";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C6%F7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���":
			Albamoncrolling.area += ",F0800610";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C7%CF%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",F0800620";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C7%E2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",F0800630";
			AlbaHeavencrolling.area += "053%7C%7C%C1%DF%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
