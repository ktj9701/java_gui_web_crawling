package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Deagu {
	public boolean flag;

	public void DeaguCity(ActionEvent e) {
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
		// �뱸
		// ����
		case "���":
			crolling.area += ",F0100100";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",F0100030";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",F0100040";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",F0100050";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",F0100060";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			crolling.area += ",F0100070";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6��":
			crolling.area += "F0100080";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���9��":
			crolling.area += ",F0100090";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���9��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���10��":
			crolling.area += ",F0100010";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED10%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���10��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���11��":
			crolling.area += ",F0100020";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%B8%ED11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���11��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0100140";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0100110";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0100120";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",F0100130";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%B4%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0100150";
			wewe.area = "053%7C%7C%B3%B2%B1%B8%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �޼���
		case "���굿":
			crolling.area += ",F0200010";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",F0200020";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B0%A8%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",F0200030";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B4%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0200040";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0200050";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η���":
			crolling.area += ",F0200090";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η�1��":
			crolling.area += ",F0200060";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η�2��":
			crolling.area += ",F0200070";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�η�3��":
			crolling.area += ",F0200080";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%B5%CE%B7%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�η�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0200100";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0200110";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BA%BB%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",F0200150";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0200120";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0200130";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",F0200140";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BB%F3%C0%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",F0200180";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0200160";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0200170";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%BA%B4%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0200210";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0200190";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0200200";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BC%DB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ絿":
			crolling.area += ",F0200220";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",F0200250";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",F0200230";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",F0200240";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%EB%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0200280";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0200260";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0200270";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0200290";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%BF%F9%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�췯�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0200300";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰":
			crolling.area += ",F0200330";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰�1��":
			crolling.area += ",F0200310";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰�2��":
			crolling.area += ",F0200320";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%CC%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			crolling.area += ",F0200340";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%E5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿":
			crolling.area += ",F0200350";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0200360";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0200370";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C1%F8%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",F0200380";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C6%C4%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",F0200390";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C8%A3%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�굿":
			crolling.area += ",F0200400";
			wewe.area = "053%7C%7C%B4%DE%BC%AD%B1%B8%7C%7C%C8%A3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �޼���
		case "��â��":
			crolling.area += ",F0300010";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B0%A1%C3%A2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0300020";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B1%B8%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0300030";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B3%ED%B0%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ���":
			crolling.area += ",F0300040";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%B4%D9%BB%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0300050";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%BF%C1%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0300060";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C0%AF%B0%A1%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻ��":
			crolling.area += ",F0300070";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C7%CF%BA%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",F0300080";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C7%F6%C7%B3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",F0300090";
			wewe.area = "053%7C%7C%B4%DE%BC%BA%B1%BA%7C%7C%C8%AD%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ����
		case "���굿":
			crolling.area += ",F0400010";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B0%A2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˻絿":
			crolling.area += ",F0400020";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B0%CB%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˻絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0400030";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B1%AB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ���":
			crolling.area += ",F0400040";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",F0400050";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0400060";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɼ���":
			crolling.area += ",F0400070";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%C9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲��":
			crolling.area += ",F0400080";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",F0400090";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B4%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += "F0400100";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",F0400110";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%B5%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0400120";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",F0400130";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л굿":
			crolling.area += ",F0400140";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B5%D0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",F0400150";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B8%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̰":
			crolling.area += ",F0400160";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%CC%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̰");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̴뵿":
			crolling.area += ",F0400170";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%CC%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̴뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",F0400180";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%E6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",F0400190";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%B9%E9%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0400200";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%C0%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε�":
			crolling.area += ",F0400210";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҷε�":
			crolling.area += ",F0400220";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BA%D2%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҷε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�纹��":
			crolling.area += ",F0400230";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BB%E7%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�纹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",F0400240";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BB%F3%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",F0400250";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0400260";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0400270";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BC%F7%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			crolling.area += ",F0400280";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���":
			crolling.area += ",F0400290";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",F0400300";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žϵ�":
			crolling.area += ",F0400360";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�žϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�1��":
			crolling.area += ",F0400310";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�2��":
			crolling.area += ",F0400320";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�3��":
			crolling.area += ",F0400330";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�4��":
			crolling.area += ",F0400340";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ž�5��":
			crolling.area += ",F0400350";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BE%CF5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ž�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ뵿":
			crolling.area += ",F0400370";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0400410";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1,2��":
			crolling.area += ",F0400380";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B51.2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1,2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ3��":
			crolling.area += ",F0400390";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ4��":
			crolling.area += ",F0400400";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C3%B54%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0400420";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BD%C5%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			crolling.area += ",F0400430";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0400440";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0400450";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%B2%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0400460";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%B2%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Լ���":
			crolling.area += ",F0400470";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C0%D4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Լ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߴ뵿":
			crolling.area += ",F0400480";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%DF%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0400490";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0400500";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%C0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",F0400510";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C1%F8%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򱤵�":
			crolling.area += ",F0400520";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C6%F2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򱤵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��":
			crolling.area += ",F0400550";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��1��":
			crolling.area += ",F0400530";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ��2��":
			crolling.area += ",F0400540";
			wewe.area = "053%7C%7C%B5%BF%B1%B8%7C%7C%C8%BF%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �ϱ�
		case "�˴ܵ�":
			crolling.area += ",F0500010";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%CB%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˴ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0500020";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0500030";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",F0500040";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%ED%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500050";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B0%FC%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0500060";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			crolling.area += ",F0500070";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%B9%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",F0500080";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",F0500090";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			crolling.area += ",F0500100";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			crolling.area += ",F0500110";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			crolling.area += ",F0500120";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B3%EB%BF%F8%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500150";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0500130";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0500140";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500160";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500170";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0500180";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���ȣ��":
			crolling.area += ",F0500190";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",F0500200";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500230";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0500210";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0500220";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BA%B9%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0500240";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%E7%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ݵ�":
			crolling.area += ",F0500290";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",F0500250";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",F0500260";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",F0500270";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",F0500280";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BB%EA%B0%DD4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500300";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BC%AD%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",F0500310";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%B0%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500320";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C0%BE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",F0500330";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C1%B6%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����1��":
			crolling.area += ",F0500340";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A5%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����2��":
			crolling.area += ",F0500350";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A5%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ�굿":
			crolling.area += ",F0500390";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ��1��":
			crolling.area += ",F0500360";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ��2��":
			crolling.area += ",F0500370";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ħ��3��":
			crolling.area += ",F0500380";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C4%A7%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ħ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500420";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0500400";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0500410";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ޵�":
			crolling.area += ",F0500430";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C6%C8%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0500440";
			wewe.area = "053%7C%7C%BA%CF%B1%B8%7C%7C%C7%D0%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ����
		case "���絿":
			crolling.area += ",F0600040";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0600010";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2,3��":
			crolling.area += ",F0600020";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E72.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2,3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",F0600030";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B4%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",F0600110";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",F0600050";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2/3��":
			crolling.area += ",F0600060";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA2.3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2/3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",F0600070";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			crolling.area += ",F0600080";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6��":
			crolling.area += ",F0600090";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���7��":
			crolling.area += ",F0600100";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BA%F1%BB%EA7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󸮵�":
			crolling.area += ",F0600120";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BB%F3%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󸮵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿1��":
			crolling.area += ",F0600130";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���뵿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿2��":
			crolling.area += ",F0600140";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���뵿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿3��":
			crolling.area += ",F0600150";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%BF%F8%B4%EB%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���뵿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0600160";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C0%CC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			crolling.area += ",F0600170";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򸮵�":
			crolling.area += ",F0600240";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�򸮵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",F0600180";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",F0600190";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			crolling.area += ",F0600200";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			crolling.area += ",F0600210";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��5��":
			crolling.area += ",F0600220";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��6��":
			crolling.area += ",F0600230";
			wewe.area = "053%7C%7C%BC%AD%B1%B8%7C%7C%C6%F2%B8%AE6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ������
		case "��õ��":
			crolling.area += ",F0700010";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B0%A1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",F0700020";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B0%ED%B8%F0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺯��":
			crolling.area += ",F0700030";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B3%EB%BA%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뺯��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",F0700040";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ굿":
			crolling.area += ",F0700050";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B5%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",F0700090";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0700060";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0700070";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",F0700080";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%B8%C3%CC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",F0700100";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B8%C5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0700130";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0700110";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0700120";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%B9%B02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",F0700180";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0700140";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0700150";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",F0700160";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",F0700170";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%B9%FC%BE%EE4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0700190";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%E7%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0700200";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",F0700210";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0700220";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",F0700230";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",F0700240";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			crolling.area += ",F0700250";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			crolling.area += ",F0700260";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BC%F6%BC%BA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0700270";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BD%C3%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿŵ�":
			crolling.area += ",F0700280";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BD%C5%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",F0700290";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BF%AC%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0700300";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%BF%ED%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������õ��":
			crolling.area += ",F0700310";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",F0700320";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",F0700350";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0700330";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0700340";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C1%F6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ĵ�":
			crolling.area += ",F0700360";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�ݵ�":
			crolling.area += ",F0700390";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ��1��":
			crolling.area += ",F0700370";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ��2��":
			crolling.area += ",F0700380";
			wewe.area = "053%7C%7C%BC%F6%BC%BA%B1%B8%7C%7C%C8%B2%B1%DD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �߱�
		case "��굿1��":
			crolling.area += ",F0800010";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿2��":
			crolling.area += ",F0800020";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%E8%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0800030";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0800040";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",F0800090";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0800050";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0800060";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",F0800070";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",F0800080";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0800100";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BC%BA%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0800110";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޼���":
			crolling.area += ",F0800120";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%DE%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0800150";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",F0800130";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",F0800140";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",F0800160";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",F0800170";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%EB%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",F0800180";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B4%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߱�������":
			crolling.area += ",F0800190";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߱�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0800200";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",F0800210";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",F0800220";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",F0800230";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			crolling.area += ",F0800240";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%BC%BA%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�1��":
			crolling.area += ",F0800250";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�2��":
			crolling.area += ",F0800260";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�3��":
			crolling.area += ",F0800270";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�4��":
			crolling.area += ",F0800280";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CE%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ε�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0800290";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B5%BF%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",F0800300";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%B9%AE%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",F0800310";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			crolling.area += ",F0800320";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���1��":
			crolling.area += ",F0800330";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���2��":
			crolling.area += ",F0800340";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",F0800350";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%E7%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			crolling.area += ",F0800360";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			crolling.area += ",F0800370";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			crolling.area += ",F0800380";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B4%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0800390";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%F3%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭵�":
			crolling.area += ",F0800400";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BB%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󼭵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0800410";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",F0800420";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",F0800430";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",F0800440";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%BA%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",F0800450";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%BA%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",F0800460";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0800470";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",F0800480";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����Ϸ�":
			crolling.area += ",F0800490";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BD%C3%C0%E5%BA%CF%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("����Ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0800500";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BF%CF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0800510";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%BF%EB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�α���":
			crolling.area += ",F0800520";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�α���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",F0800530";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",F0800540";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",F0800550";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",F0800560";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			crolling.area += ",F0800570";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			crolling.area += ",F0800580";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			crolling.area += ",F0800590";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",F0800600";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C6%F7%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���":
			crolling.area += ",F0800610";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C7%CF%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",F0800620";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C7%E2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",F0800630";
			wewe.area = "053%7C%7C%C1%DF%B1%B8%7C%7C%C8%AD%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
